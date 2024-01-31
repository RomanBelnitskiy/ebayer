package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the seller's return policy.
 */
@Setter
@Schema(description = "The type that defines the fields for the seller's return policy.")
public class ItemReturnTerms {
    @SerializedName("extendedHolidayReturnsOffered")
    private Boolean extendedHolidayReturnsOffered = null;

    @SerializedName("refundMethod")
    private String refundMethod = null;

    @SerializedName("restockingFeePercentage")
    private String restockingFeePercentage = null;

    @SerializedName("returnInstructions")
    private String returnInstructions = null;

    @SerializedName("returnMethod")
    private String returnMethod = null;

    @SerializedName("returnPeriod")
    private TimeDuration returnPeriod = null;

    @SerializedName("returnsAccepted")
    private Boolean returnsAccepted = null;

    @SerializedName("returnShippingCostPayer")
    private String returnShippingCostPayer = null;

    public ItemReturnTerms extendedHolidayReturnsOffered(Boolean extendedHolidayReturnsOffered) {
        this.extendedHolidayReturnsOffered = extendedHolidayReturnsOffered;
        return this;
    }

    /**
     * This indicates if the seller has enabled the Extended Holiday Returns feature on the item.
     * Extended Holiday Returns are only applicable during the US holiday season, and gives buyers
     * extra time to return an item. This 'extra time' will typically extend beyond what is set
     * through the <b> returnPeriod</b> value.
     *
     * @return extendedHolidayReturnsOffered
     **/
    @Schema(description = "This indicates if the seller has enabled the Extended Holiday Returns " +
            "feature on the item. Extended Holiday Returns are only applicable during the US holiday " +
            "season, and gives buyers extra time to return an item. This 'extra time' will typically " +
            "extend beyond what is set through the <b> returnPeriod</b> value.")
    public Boolean isExtendedHolidayReturnsOffered() {
        return extendedHolidayReturnsOffered;
    }

    public ItemReturnTerms refundMethod(String refundMethod) {
        this.refundMethod = refundMethod;
        return this;
    }

    /**
     * An enumeration value that indicates how a buyer is refunded when an item is returned.
     * <br><br><b> Valid Values: </b> MONEY_BACK or MERCHANDISE_CREDIT
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     * For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:RefundMethodEnum'>eBay API documentation</a>
     *
     * @return refundMethod
     **/
    @Schema(description = "An enumeration value that indicates how a buyer is refunded when an item is returned. " +
            "<br><br><b> Valid Values: </b> MONEY_BACK or MERCHANDISE_CREDIT  " +
            "<br><br>Code so that your app gracefully handles any future changes to this list. " +
            "For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:RefundMethodEnum'>" +
            "eBay API documentation</a>")
    public String getRefundMethod() {
        return refundMethod;
    }

    public ItemReturnTerms restockingFeePercentage(String restockingFeePercentage) {
        this.restockingFeePercentage = restockingFeePercentage;
        return this;
    }

    /**
     * This string field indicates the restocking fee percentage that the seller has set on
     * the item. Sellers have the option of setting no restocking fee for an item, or they
     * can set the percentage to 10, 15, or 20 percent. So, if the cost of the item was $100,
     * and the restocking percentage was 20 percent, the buyer would be charged $20 to return
     * that item, so instead of receiving a $100 refund, they would receive $80 due to the restocking fee.
     *
     * @return restockingFeePercentage
     **/
    @Schema(description = "This string field indicates the restocking fee percentage that the seller " +
            "has set on the item. Sellers have the option of setting no restocking fee for an item, or " +
            "they can set the percentage to 10, 15, or 20 percent. So, if the cost of the item was $100, " +
            "and the restocking percentage was 20 percent, the buyer would be charged $20 to return that " +
            "item, so instead of receiving a $100 refund, they would receive $80 due to the restocking fee.")
    public String getRestockingFeePercentage() {
        return restockingFeePercentage;
    }

    public ItemReturnTerms returnInstructions(String returnInstructions) {
        this.returnInstructions = returnInstructions;
        return this;
    }

    /**
     * Text written by the seller describing what the buyer needs to do in order to return the item.
     *
     * @return returnInstructions
     **/
    @Schema(description = "Text written by the seller describing what the buyer needs to do " +
            "in order to return the item.")
    public String getReturnInstructions() {
        return returnInstructions;
    }

    public ItemReturnTerms returnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
        return this;
    }

    /**
     * An enumeration value that indicates the alternative methods for a full refund when
     * an item is returned. This field is returned if the seller offers the buyer an item
     * replacement or exchange instead of a monetary refund. <br><br><b> Valid Values: </b>
     * <ul><li><b> REPLACEMENT</b> -  Indicates that the buyer has the option of receiving
     * money back for the returned item, or they can choose to have the seller replace the
     * item with an identical item.</li>  <li><b> EXCHANGE</b> - Indicates that the buyer has
     * the option of receiving money back for the returned item, or they can exchange the item
     * for another similar item.</li></ul>  Code so that your app gracefully handles any future
     * changes to this list. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:ReturnMethodEnum'>eBay API documentation</a>
     *
     * @return returnMethod
     **/
    @Schema(description = "An enumeration value that indicates the alternative methods for a full " +
            "refund when an item is returned. This field is returned if the seller offers the buyer " +
            "an item replacement or exchange instead of a monetary refund. <br><br><b> Valid Values: </b>  " +
            "<ul><li><b> REPLACEMENT</b> -  Indicates that the buyer has the option of receiving money " +
            "back for the returned item, or they can choose to have the seller replace the item with " +
            "an identical item.</li>  <li><b> EXCHANGE</b> - Indicates that the buyer has the option " +
            "of receiving money back for the returned item, or they can exchange the item for another " +
            "similar item.</li></ul>  Code so that your app gracefully handles any future changes to this " +
            "list. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:ReturnMethodEnum'>" +
            "eBay API documentation</a>")
    public String getReturnMethod() {
        return returnMethod;
    }

    public ItemReturnTerms returnPeriod(TimeDuration returnPeriod) {
        this.returnPeriod = returnPeriod;
        return this;
    }

    /**
     * Get returnPeriod
     *
     * @return returnPeriod
     **/
    @Schema(description = "")
    public TimeDuration getReturnPeriod() {
        return returnPeriod;
    }

    public ItemReturnTerms returnsAccepted(Boolean returnsAccepted) {
        this.returnsAccepted = returnsAccepted;
        return this;
    }

    /**
     * Indicates whether the seller accepts returns for the item.
     *
     * @return returnsAccepted
     **/
    @Schema(description = "Indicates whether the seller accepts returns for the item.")
    public Boolean isReturnsAccepted() {
        return returnsAccepted;
    }

    public ItemReturnTerms returnShippingCostPayer(String returnShippingCostPayer) {
        this.returnShippingCostPayer = returnShippingCostPayer;
        return this;
    }

    /**
     * This enumeration value indicates whether the buyer or seller is responsible for return
     * shipping costs when an item is returned. <br><br><b> Valid Values: </b>
     * <ul><li><b> SELLER</b> - Indicates the seller will pay for the shipping costs to return the item.</li>
     * <li><b> BUYER</b> - Indicates the buyer will pay for the shipping costs to return the item.</li>  </ul>
     * Code so that your app gracefully handles any future changes to this list. For implementation help,
     * refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:ReturnShippingCostPayerEnum'>
     * eBay API documentation</a>
     *
     * @return returnShippingCostPayer
     **/
    @Schema(description = "This enumeration value indicates whether the buyer or seller is responsible for " +
            "return shipping costs when an item is returned. <br><br><b> Valid Values: </b> " +
            "<ul><li><b> SELLER</b> - Indicates the seller will pay for the shipping costs to return the item.</li>  " +
            "<li><b> BUYER</b> - Indicates the buyer will pay for the shipping costs to return the item.</li>  </ul>  " +
            "Code so that your app gracefully handles any future changes to this list. For implementation help, " +
            "refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:ReturnShippingCostPayerEnum'>" +
            "eBay API documentation</a>")
    public String getReturnShippingCostPayer() {
        return returnShippingCostPayer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemReturnTerms itemReturnTerms = (ItemReturnTerms) o;
        return Objects.equals(this.extendedHolidayReturnsOffered, itemReturnTerms.extendedHolidayReturnsOffered) &&
                Objects.equals(this.refundMethod, itemReturnTerms.refundMethod) &&
                Objects.equals(this.restockingFeePercentage, itemReturnTerms.restockingFeePercentage) &&
                Objects.equals(this.returnInstructions, itemReturnTerms.returnInstructions) &&
                Objects.equals(this.returnMethod, itemReturnTerms.returnMethod) &&
                Objects.equals(this.returnPeriod, itemReturnTerms.returnPeriod) &&
                Objects.equals(this.returnsAccepted, itemReturnTerms.returnsAccepted) &&
                Objects.equals(this.returnShippingCostPayer, itemReturnTerms.returnShippingCostPayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extendedHolidayReturnsOffered, refundMethod, restockingFeePercentage, returnInstructions, returnMethod, returnPeriod, returnsAccepted, returnShippingCostPayer);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemReturnTerms {\n");
        sb.append("    extendedHolidayReturnsOffered: ").append(toIndentedString(extendedHolidayReturnsOffered)).append("\n");
        sb.append("    refundMethod: ").append(toIndentedString(refundMethod)).append("\n");
        sb.append("    restockingFeePercentage: ").append(toIndentedString(restockingFeePercentage)).append("\n");
        sb.append("    returnInstructions: ").append(toIndentedString(returnInstructions)).append("\n");
        sb.append("    returnMethod: ").append(toIndentedString(returnMethod)).append("\n");
        sb.append("    returnPeriod: ").append(toIndentedString(returnPeriod)).append("\n");
        sb.append("    returnsAccepted: ").append(toIndentedString(returnsAccepted)).append("\n");
        sb.append("    returnShippingCostPayer: ").append(toIndentedString(returnShippingCostPayer)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
