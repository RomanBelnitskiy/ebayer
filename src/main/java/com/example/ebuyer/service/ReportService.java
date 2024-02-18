package com.example.ebuyer.service;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.data.SearchItemResult;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;


@Service
public class ReportService {
    @Autowired
    private BrowseService browseService;

    public void createExcelReport() throws ApiException {
//        List<SearchItemResult> resultList = browseService.findSuitable();
        List<SearchItemResult> resultList = createTestResults();

        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
            // Creating a blank Excel sheet
            XSSFSheet sheet = workbook.createSheet(toUTF8("Оголошення"));

            Font fontHeader = createFont(workbook, 14, true);
            CellStyle headerStyle = createCellStyle(workbook, fontHeader, false);

            Font font = createFont(workbook, 12, false);
            CellStyle commonStyle = createCellStyle(workbook, font, true);

            Font valueFont = createFont(workbook, 12, true);
            CellStyle valueStyle = createCellStyle(workbook, valueFont, true);

            Font linkFont = createLinkFont(workbook, 12);
            CellStyle linkCellStyle = createCellStyle(workbook, linkFont, false);

            for (int itemNum = 0; itemNum < resultList.size(); itemNum++) {
                int startRowNumber = itemNum * 6;
                SearchItemResult item = resultList.get(itemNum);

                // ================== First row ==================
                XSSFRow firstRow = sheet.createRow(startRowNumber);
                // announcement number
                XSSFCell cellItemNumber = firstRow.createCell(0);
                cellItemNumber.setCellStyle(headerStyle);
                cellItemNumber.setCellValue((itemNum + 1) + ".");
                // title
                XSSFCell cellTitle = firstRow.createCell(1);
                cellTitle.setCellStyle(headerStyle);
                cellTitle.setCellValue(item.getTitle());

                // ================== Second row ==================
                XSSFRow secondRow = sheet.createRow(startRowNumber + 1);
                // link
                XSSFCell webUrlCell = secondRow.createCell(1);
                webUrlCell.setCellStyle(linkCellStyle);
                XSSFHyperlink link = workbook.getCreationHelper().createHyperlink(HyperlinkType.URL);
                link.setAddress(item.getItemWebUrl());
                webUrlCell.setCellValue(toUTF8("Посилання на eBay"));
                webUrlCell.setHyperlink(link);

                // ================== Third row ==================
                XSSFRow thirdRow = sheet.createRow(startRowNumber + 2);
                thirdRow.setRowStyle(commonStyle);
                // price title
                XSSFCell priceTileCell= thirdRow.createCell(1);
                priceTileCell.setCellValue(toUTF8("Ціна"));
                // price
                XSSFCell priceCell= thirdRow.createCell(2);
                priceCell.setCellStyle(valueStyle);
                priceCell.setCellValue(item.getPrice());
                // qty title
                XSSFCell qtyTileCell= thirdRow.createCell(3);
                qtyTileCell.setCellValue(toUTF8("К-ть"));
                // qty
                XSSFCell qtyCell = thirdRow.createCell(4);
                qtyCell.setCellStyle(valueStyle);
                qtyCell.setCellValue(item.getQty());
                // price per unit title
                XSSFCell unitPriceTileCell = thirdRow.createCell(5);
                unitPriceTileCell.setCellValue(toUTF8("Ціна за шт.:"));
                // price per unit
                XSSFCell unitPriceCell = thirdRow.createCell(6);
                unitPriceCell.setCellStyle(valueStyle);
                unitPriceCell.setCellValue(item.getUnitPrice());

                // ================== Fourth row ==================
                XSSFRow fourthRow = sheet.createRow(startRowNumber + 3);
                fourthRow.setRowStyle(commonStyle);
                // seller title
                XSSFCell sellerTitleCell = fourthRow.createCell(1);
                sellerTitleCell.setCellValue(toUTF8("Продавець:"));
                // seller
                XSSFCell sellerCell = fourthRow.createCell(2);
                sellerCell.setCellValue(item.getSeller());
                // seller rate title
                XSSFCell sellerRateTitleCell = fourthRow.createCell(3);
                sellerRateTitleCell.setCellValue(toUTF8("Рейтинг:"));
                // seller rate
                XSSFCell sellerRateCell = fourthRow.createCell(4);
                sellerRateCell.setCellValue(item.getSellerFeedback());

                // ================== Fifth row ==================
                XSSFRow fifthRow = sheet.createRow(startRowNumber + 4);
                fifthRow.setRowStyle(commonStyle);
                // shipment cost title
                XSSFCell shipmentTitleCell = fifthRow.createCell(1);
                shipmentTitleCell.setCellValue(toUTF8("Доставка:"));
                // shipment cost
                XSSFCell shipmentCell = fifthRow.createCell(2);
                shipmentCell.setCellValue(item.getShippingCost());
            }

            sheet.autoSizeColumn(0);
            sheet.setColumnWidth(1, 256*12);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);
            sheet.autoSizeColumn(5);
            sheet.autoSizeColumn(6);

            try (FileOutputStream fos = new FileOutputStream("Results.xlsx")) {
                workbook.write(fos);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Font createFont(XSSFWorkbook workbook, int size, boolean bold) {
        Font font = workbook.createFont();
        font.setFontHeightInPoints((short) size);
        font.setFontName("Arial");
        font.setBold(bold);

        return font;
    }

    private Font createLinkFont(XSSFWorkbook workbook, int size) {
        Font font = createFont(workbook, size, false);
        font.setColor(IndexedColors.BLUE.getIndex());
        font.setUnderline(Font.U_SINGLE);

        return font;
    }

    private CellStyle createCellStyle(XSSFWorkbook workbook, Font font, boolean wrapText) {
        CellStyle style = workbook.createCellStyle();
        style.setWrapText(wrapText);
        style.setFont(font);

        return style;
    }

    private String toUTF8(String str) {
        return new String(str.getBytes(), StandardCharsets.UTF_8);
    }

    private static List<SearchItemResult> createTestResults() {
        return List.of(
                SearchItemResult.builder()
                        .title("Samsung 16GB (2 x 8GB) 204-pin SODIMM, DDR3 PC3L-12800, 1600MHz ram Memory Mod")
                        .price(35.5).qty(2).unitPrice(17.75)
                        .seller("test-seller").sellerFeedback(98.0)
                        .shippingCost(1.0)
                        .itemWebUrl("https://www.ebay.com/itm/326015360623?itmmeta=01HPY8KXM26G3YFFP1QZ8MHZZ8&hash=item4be8079e6f:g:0RIAAOSwVPBl0Tv~")
                        .itemId("ITEM-ID")
                        .rank(25)
                        .build(),
                SearchItemResult.builder()
                        .title("SAMSUNG 16GB(4x4GB) 1Rx8 PC4-2133P M471A5143DB0-CPB SO-DIMM LAPTOP MEMORY")
                        .price(20.0)
                        .qty(4)
                        .unitPrice(5.0)
                        .shippingCost(0.0)
                        .sellerFeedback(98.0)
                        .seller("test-seller")
                        .itemWebUrl("https://www.ebay.com/itm/326015360623?itmmeta=01HPY8KXM26G3YFFP1QZ8MHZZ8&hash=item4be8079e6f:g:0RIAAOSwVPBl0Tv~")
                        .itemId("ITEM-ID")
                        .rank(35)
                        .build(),
                SearchItemResult.builder()
                        .title("SAMSUNG 32 GB (4X8GB) 1RX8 2400T SODIMM LAPTOP MEMORY M471A1K43BB1-CRC")
                        .price(32.0)
                        .qty(4)
                        .unitPrice(8.0)
                        .shippingCost(0.0)
                        .sellerFeedback(98.0)
                        .seller("test-seller")
                        .itemWebUrl("https://www.ebay.com/itm/326015360623?itmmeta=01HPY8KXM26G3YFFP1QZ8MHZZ8&hash=item4be8079e6f:g:0RIAAOSwVPBl0Tv~")
                        .itemId("ITEM-ID")
                        .rank(30)
                        .build(),
                SearchItemResult.builder()
                        .title("lot of 8 Samsung 1R8 8GB DDR4 sodimm laptop memory ram 3200 Speed")
                        .price(64.0)
                        .qty(8)
                        .unitPrice(8.0)
                        .shippingCost(0.0)
                        .sellerFeedback(98.0)
                        .seller("test-seller")
                        .itemWebUrl("https://www.ebay.com/itm/326015360623?itmmeta=01HPY8KXM26G3YFFP1QZ8MHZZ8&hash=item4be8079e6f:g:0RIAAOSwVPBl0Tv~")
                        .itemId("ITEM-ID")
                        .rank(30)
                        .build(),
                SearchItemResult.builder()
                        .title("LOT OF 10 SAMSUNG 8GB 1Rx8 PC4-2666 DDR4 SODIMM Laptop Memory  M471A1K43CB1-CTD")
                        .price(88.0)
                        .qty(10)
                        .unitPrice(8.8)
                        .shippingCost(0.0)
                        .sellerFeedback(98.0)
                        .seller("test-seller")
                        .itemWebUrl("https://www.ebay.com/itm/326015360623?itmmeta=01HPY8KXM26G3YFFP1QZ8MHZZ8&hash=item4be8079e6f:g:0RIAAOSwVPBl0Tv~")
                        .itemId("ITEM-ID")
                        .rank(30)
                        .build()
        );
    }
}
