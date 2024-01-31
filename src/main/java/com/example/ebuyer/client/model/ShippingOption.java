package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the details of a shipping provider.
 */
@Setter
@Schema(description = "The type that defines the fields for the details of a shipping provider.")
public class ShippingOption {
    @SerializedName("additionalShippingCostPerUnit")
    private ConvertedAmount additionalShippingCostPerUnit = null;

    @SerializedName("cutOffDateUsedForEstimate")
    private String cutOffDateUsedForEstimate = null;

    @SerializedName("fulfilledThrough")
    private String fulfilledThrough = null;

    @SerializedName("guaranteedDelivery")
    private Boolean guaranteedDelivery = null;

    @SerializedName("importCharges")
    private ConvertedAmount importCharges = null;

    @SerializedName("maxEstimatedDeliveryDate")
    private String maxEstimatedDeliveryDate = null;

    @SerializedName("minEstimatedDeliveryDate")
    private String minEstimatedDeliveryDate = null;

    @SerializedName("quantityUsedForEstimate")
    private Integer quantityUsedForEstimate = null;

    @SerializedName("shippingCarrierCode")
    private String shippingCarrierCode = null;

    @SerializedName("shippingCost")
    private ConvertedAmount shippingCost = null;

    @SerializedName("shippingCostType")
    private String shippingCostType = null;

    @SerializedName("shippingServiceCode")
    private String shippingServiceCode = null;

    @SerializedName("shipToLocationUsedForEstimate")
    private ShipToLocation shipToLocationUsedForEstimate = null;

    @SerializedName("trademarkSymbol")
    private String trademarkSymbol = null;

    @SerializedName("type")
    private String type = null;

    public ShippingOption additionalShippingCostPerUnit(ConvertedAmount additionalShippingCostPerUnit) {
        this.additionalShippingCostPerUnit = additionalShippingCostPerUnit;
        return this;
    }

    /**
     * Get additionalShippingCostPerUnit
     *
     * @return additionalShippingCostPerUnit
     **/
    @Schema(description = "")
    public ConvertedAmount getAdditionalShippingCostPerUnit() {
        return additionalShippingCostPerUnit;
    }

    public ShippingOption cutOffDateUsedForEstimate(String cutOffDateUsedForEstimate) {
        this.cutOffDateUsedForEstimate = cutOffDateUsedForEstimate;
        return this;
    }

    /**
     * The deadline date that the item must be purchased by in order to be received by the buyer
     * within the delivery window (<b> maxEstimatedDeliveryDate</b> and  <b> minEstimatedDeliveryDate</b>
     * fields). This field is returned only for items that are eligible for 'Same Day Handling'.
     * For these items, the value of this field is what is displayed in the <b> Delivery</b> line on
     * the View Item page.  <br><br>This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ),
     * which you can convert into the local time of the buyer.
     *
     * @return cutOffDateUsedForEstimate
     **/
    @Schema(description = "The deadline date that the item must be purchased by in order to be received " +
            "by the buyer within the delivery window (<b> maxEstimatedDeliveryDate</b> and  " +
            "<b> minEstimatedDeliveryDate</b> fields). This field is returned only for items that are " +
            "eligible for 'Same Day Handling'. For these items, the value of this field is what is " +
            "displayed in the <b> Delivery</b> line on the View Item page.  <br><br>This value is " +
            "returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into the local " +
            "time of the buyer.")
    public String getCutOffDateUsedForEstimate() {
        return cutOffDateUsedForEstimate;
    }

    public ShippingOption fulfilledThrough(String fulfilledThrough) {
        this.fulfilledThrough = fulfilledThrough;
        return this;
    }

    /**
     * If the item is being shipped by the eBay
     * <a href="https://pages.ebay.com/seller-center/shipping/global-shipping-program.html ">
     * Global Shipping program</a>, this field returns <code>GLOBAL_SHIPPING</code>.
     * <br><br>If the item is being shipped using the eBay International Shipping program,
     * this field returns <code>INTERNATIONAL_SHIPPING</code>. <br><br>Otherwise, this field
     * is null. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:FulfilledThroughEnum'>
     * eBay API documentation</a>
     *
     * @return fulfilledThrough
     **/
    @Schema(description = "If the item is being shipped by the eBay " +
            "<a href=\"https://pages.ebay.com/seller-center/shipping/global-shipping-program.html \">" +
            "Global Shipping program</a>, this field returns <code>GLOBAL_SHIPPING</code>." +
            "<br><br>If the item is being shipped using the eBay International Shipping program, " +
            "this field returns <code>INTERNATIONAL_SHIPPING</code>. <br><br>Otherwise, this field " +
            "is null. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:FulfilledThroughEnum'>" +
            "eBay API documentation</a>")
    public String getFulfilledThrough() {
        return fulfilledThrough;
    }

    public ShippingOption guaranteedDelivery(Boolean guaranteedDelivery) {
        this.guaranteedDelivery = guaranteedDelivery;
        return this;
    }

    /**
     * Although this field is still returned, it can be ignored since eBay Guaranteed Delivery
     * is no longer a supported feature on any marketplace. This field may get removed from
     * the schema in the future.
     *
     * @return guaranteedDelivery
     **/
    @Schema(description = "Although this field is still returned, it can be ignored since eBay " +
            "Guaranteed Delivery is no longer a supported feature on any marketplace. This field " +
            "may get removed from the schema in the future.")
    public Boolean isGuaranteedDelivery() {
        return guaranteedDelivery;
    }

    public ShippingOption importCharges(ConvertedAmount importCharges) {
        this.importCharges = importCharges;
        return this;
    }

    /**
     * Get importCharges
     *
     * @return importCharges
     **/
    @Schema(description = "")
    public ConvertedAmount getImportCharges() {
        return importCharges;
    }

    public ShippingOption maxEstimatedDeliveryDate(String maxEstimatedDeliveryDate) {
        this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
        return this;
    }

    /**
     * The end date of the delivery window (latest projected delivery date).  This value is
     * returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into the local
     * time of the buyer. <br> <br> <span class="tablenote"> <b> Note: </b> For the best accuracy,
     * always include the location of where the item is be shipped in the <code> contextualLocation</code>
     * values of the <a href="/api-docs/buy/static/api-browse.html#Headers"> <code>X-EBAY-C-ENDUSERCTX</code></a>
     * request header.</span>
     *
     * @return maxEstimatedDeliveryDate
     **/
    @Schema(description = "The end date of the delivery window (latest projected delivery date).  " +
            "This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into " +
            "the local time of the buyer. <br> <br> <span class=\"tablenote\"> <b> Note: </b> For the best " +
            "accuracy, always include the location of where the item is be shipped in the <code> " +
            "contextualLocation</code> values of the <a href=\"/api-docs/buy/static/api-browse.html#Headers\"> " +
            "<code>X-EBAY-C-ENDUSERCTX</code></a> request header.</span> ")
    public String getMaxEstimatedDeliveryDate() {
        return maxEstimatedDeliveryDate;
    }

    public ShippingOption minEstimatedDeliveryDate(String minEstimatedDeliveryDate) {
        this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
        return this;
    }

    /**
     * The start date of the delivery window (earliest projected delivery date). This value
     * is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into the local
     * time of the buyer. <br> <br><span class="tablenote"> <b> Note: </b> For the best accuracy,
     * always include the location of where the item is be shipped in the <code> contextualLocation</code>
     * values of the <a href="/api-docs/buy/static/api-browse.html#Headers"> <code>X-EBAY-C-ENDUSERCTX</code></a>
     * request header.</span>
     *
     * @return minEstimatedDeliveryDate
     **/
    @Schema(description = "The start date of the delivery window (earliest projected delivery date). " +
            "This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into " +
            "the local time of the buyer. <br> <br><span class=\"tablenote\"> <b> Note: </b> For the best " +
            "accuracy, always include the location of where the item is be shipped in the <code> " +
            "contextualLocation</code> values of the <a href=\"/api-docs/buy/static/api-browse.html#Headers\"> " +
            "<code>X-EBAY-C-ENDUSERCTX</code></a> request header.</span>")
    public String getMinEstimatedDeliveryDate() {
        return minEstimatedDeliveryDate;
    }

    public ShippingOption quantityUsedForEstimate(Integer quantityUsedForEstimate) {
        this.quantityUsedForEstimate = quantityUsedForEstimate;
        return this;
    }

    /**
     * The number of items used when calculating the estimation information.
     *
     * @return quantityUsedForEstimate
     **/
    @Schema(description = "The number of items used when calculating the estimation information.")
    public Integer getQuantityUsedForEstimate() {
        return quantityUsedForEstimate;
    }

    public ShippingOption shippingCarrierCode(String shippingCarrierCode) {
        this.shippingCarrierCode = shippingCarrierCode;
        return this;
    }

    /**
     * The name of the shipping provider, such as FedEx, or USPS.
     *
     * @return shippingCarrierCode
     **/
    @Schema(description = "The name of the shipping provider, such as FedEx, or USPS.")
    public String getShippingCarrierCode() {
        return shippingCarrierCode;
    }

    public ShippingOption shippingCost(ConvertedAmount shippingCost) {
        this.shippingCost = shippingCost;
        return this;
    }

    /**
     * Get shippingCost
     *
     * @return shippingCost
     **/
    @Schema(description = "")
    public ConvertedAmount getShippingCost() {
        return shippingCost;
    }

    public ShippingOption shippingCostType(String shippingCostType) {
        this.shippingCostType = shippingCostType;
        return this;
    }

    /**
     * Indicates the class of the shipping cost. <br><br><b> Valid Values: </b> FIXED or CALCULATED
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return shippingCostType
     **/
    @Schema(description = "Indicates the class of the shipping cost. <br><br><b> Valid Values: </b> " +
            "FIXED or CALCULATED <br><br>Code so that your app gracefully handles any future changes to this list. ")
    public String getShippingCostType() {
        return shippingCostType;
    }

    public ShippingOption shippingServiceCode(String shippingServiceCode) {
        this.shippingServiceCode = shippingServiceCode;
        return this;
    }

    /**
     * The type of shipping service. For example, USPS First Class.
     *
     * @return shippingServiceCode
     **/
    @Schema(description = "The type of shipping service. For example, USPS First Class.")
    public String getShippingServiceCode() {
        return shippingServiceCode;
    }

    public ShippingOption shipToLocationUsedForEstimate(ShipToLocation shipToLocationUsedForEstimate) {
        this.shipToLocationUsedForEstimate = shipToLocationUsedForEstimate;
        return this;
    }

    /**
     * Get shipToLocationUsedForEstimate
     *
     * @return shipToLocationUsedForEstimate
     **/
    @Schema(description = "")
    public ShipToLocation getShipToLocationUsedForEstimate() {
        return shipToLocationUsedForEstimate;
    }

    public ShippingOption trademarkSymbol(String trademarkSymbol) {
        this.trademarkSymbol = trademarkSymbol;
        return this;
    }

    /**
     * Any trademark symbol, such as &#8482; or &reg;, that needs to be shown in superscript next
     * to the shipping service name.
     *
     * @return trademarkSymbol
     **/
    @Schema(description = "Any trademark symbol, such as &#8482; or &reg;, that needs to be shown " +
            "in superscript next to the shipping service name.")
    public String getTrademarkSymbol() {
        return trademarkSymbol;
    }

    public ShippingOption type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of a shipping option, such as EXPEDITED, ONE_DAY, STANDARD, ECONOMY, PICKUP, etc.
     *
     * @return type
     **/
    @Schema(description = "The type of a shipping option, such as EXPEDITED, ONE_DAY, STANDARD, " +
            "ECONOMY, PICKUP, etc.")
    public String getType() {
        return type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShippingOption shippingOption = (ShippingOption) o;
        return Objects.equals(this.additionalShippingCostPerUnit, shippingOption.additionalShippingCostPerUnit) &&
                Objects.equals(this.cutOffDateUsedForEstimate, shippingOption.cutOffDateUsedForEstimate) &&
                Objects.equals(this.fulfilledThrough, shippingOption.fulfilledThrough) &&
                Objects.equals(this.guaranteedDelivery, shippingOption.guaranteedDelivery) &&
                Objects.equals(this.importCharges, shippingOption.importCharges) &&
                Objects.equals(this.maxEstimatedDeliveryDate, shippingOption.maxEstimatedDeliveryDate) &&
                Objects.equals(this.minEstimatedDeliveryDate, shippingOption.minEstimatedDeliveryDate) &&
                Objects.equals(this.quantityUsedForEstimate, shippingOption.quantityUsedForEstimate) &&
                Objects.equals(this.shippingCarrierCode, shippingOption.shippingCarrierCode) &&
                Objects.equals(this.shippingCost, shippingOption.shippingCost) &&
                Objects.equals(this.shippingCostType, shippingOption.shippingCostType) &&
                Objects.equals(this.shippingServiceCode, shippingOption.shippingServiceCode) &&
                Objects.equals(this.shipToLocationUsedForEstimate, shippingOption.shipToLocationUsedForEstimate) &&
                Objects.equals(this.trademarkSymbol, shippingOption.trademarkSymbol) &&
                Objects.equals(this.type, shippingOption.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalShippingCostPerUnit, cutOffDateUsedForEstimate, fulfilledThrough, guaranteedDelivery, importCharges, maxEstimatedDeliveryDate, minEstimatedDeliveryDate, quantityUsedForEstimate, shippingCarrierCode, shippingCost, shippingCostType, shippingServiceCode, shipToLocationUsedForEstimate, trademarkSymbol, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShippingOption {\n");
        sb.append("    additionalShippingCostPerUnit: ").append(toIndentedString(additionalShippingCostPerUnit)).append("\n");
        sb.append("    cutOffDateUsedForEstimate: ").append(toIndentedString(cutOffDateUsedForEstimate)).append("\n");
        sb.append("    fulfilledThrough: ").append(toIndentedString(fulfilledThrough)).append("\n");
        sb.append("    guaranteedDelivery: ").append(toIndentedString(guaranteedDelivery)).append("\n");
        sb.append("    importCharges: ").append(toIndentedString(importCharges)).append("\n");
        sb.append("    maxEstimatedDeliveryDate: ").append(toIndentedString(maxEstimatedDeliveryDate)).append("\n");
        sb.append("    minEstimatedDeliveryDate: ").append(toIndentedString(minEstimatedDeliveryDate)).append("\n");
        sb.append("    quantityUsedForEstimate: ").append(toIndentedString(quantityUsedForEstimate)).append("\n");
        sb.append("    shippingCarrierCode: ").append(toIndentedString(shippingCarrierCode)).append("\n");
        sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
        sb.append("    shippingCostType: ").append(toIndentedString(shippingCostType)).append("\n");
        sb.append("    shippingServiceCode: ").append(toIndentedString(shippingServiceCode)).append("\n");
        sb.append("    shipToLocationUsedForEstimate: ").append(toIndentedString(shipToLocationUsedForEstimate)).append("\n");
        sb.append("    trademarkSymbol: ").append(toIndentedString(trademarkSymbol)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
