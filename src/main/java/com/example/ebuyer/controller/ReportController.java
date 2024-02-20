package com.example.ebuyer.controller;

import com.example.ebuyer.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService service;

    @GetMapping("/excel")
    public ResponseEntity<?> getExcelReport() {
        byte[] excelReport = service.createExcelReport();
        HttpHeaders headers = createHeaders(excelReport.length);

        return new ResponseEntity<>(excelReport, headers, HttpStatus.OK);
    }

    private HttpHeaders createHeaders(long contentLength) {
        HttpHeaders headers = new HttpHeaders();
        // for .xlsx file
        headers.setContentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
        headers.setContentDisposition(ContentDisposition.attachment().filename("Report.xlsx").build());
        headers.setContentLength(contentLength);

        return headers;
    }
}
