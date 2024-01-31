package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the shipping information.
 */
@Setter
@Schema(description = "The type that defines the fields for the shipping information.")
public class ShippingOptionSummary {
    @SerializedName("guaranteedDelivery")
    private Boolean guaranteedDelivery = null;

    @SerializedName("maxEstimatedDeliveryDate")
    private String maxEstimatedDeliveryDate = null;

    @SerializedName("minEstimatedDeliveryDate")
    private String minEstimatedDeliveryDate = null;

    @SerializedName("shippingCost")
    private ConvertedAmount shippingCost = null;

    @SerializedName("shippingCostType")
    private String shippingCostType = null;

    public ShippingOptionSummary guaranteedDelivery(Boolean guaranteedDelivery) {
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

    public ShippingOptionSummary maxEstimatedDeliveryDate(String maxEstimatedDeliveryDate) {
        this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
        return this;
    }

    /**
     * The end date of the delivery window (latest projected delivery date). This value is returned
     * in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into the local time of the buyer.
     * <br> <br> <span class="tablenote"> <b> Note: </b> For the best accuracy, always include
     * the <code> contextualLocation</code> values in the <a href="/api-docs/buy/static/api-browse.html#Headers">
     * <code>X-EBAY-C-ENDUSERCTX</code></a> request header.</span>
     *
     * @return maxEstimatedDeliveryDate
     **/
    @Schema(description = "The end date of the delivery window (latest projected delivery date). " +
            "This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert " +
            "into the local time of the buyer. <br> <br> <span class=\"tablenote\"> <b> Note: </b> " +
            "For the best accuracy, always include the <code> contextualLocation</code> values in " +
            "the <a href=\"/api-docs/buy/static/api-browse.html#Headers\"> <code>X-EBAY-C-ENDUSERCTX</code></a> " +
            "request header.</span>")
    public String getMaxEstimatedDeliveryDate() {
        return maxEstimatedDeliveryDate;
    }

    public ShippingOptionSummary minEstimatedDeliveryDate(String minEstimatedDeliveryDate) {
        this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
        return this;
    }

    /**
     * The start date of the delivery window (earliest projected delivery date).
     * This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert
     * into the local time of the buyer.
     * <br> <br><span class="tablenote"> <b> Note: </b> For the best accuracy, always include
     * the <code> contextualLocation</code> values in the
     * <a href="/api-docs/buy/static/api-browse.html#Headers"> <code>X-EBAY-C-ENDUSERCTX</code></a>
     * request header.</span>
     *
     * @return minEstimatedDeliveryDate
     **/
    @Schema(description = "The start date of the delivery window (earliest projected delivery date).  " +
            "This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert " +
            "into the local time of the buyer. <br> <br><span class=\"tablenote\"> <b> Note: </b> " +
            "For the best accuracy, always include the <code> contextualLocation</code> values in the " +
            "<a href=\"/api-docs/buy/static/api-browse.html#Headers\"> <code>X-EBAY-C-ENDUSERCTX</code></a> " +
            "request header.</span>")
    public String getMinEstimatedDeliveryDate() {
        return minEstimatedDeliveryDate;
    }

    public ShippingOptionSummary shippingCost(ConvertedAmount shippingCost) {
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

    public ShippingOptionSummary shippingCostType(String shippingCostType) {
        this.shippingCostType = shippingCostType;
        return this;
    }

    /**
     * Indicates the type of shipping used to ship the item. Possible values are
     * <code> FIXED</code> (flat-rate shipping) and <code> CALCULATED</code>
     * (shipping cost calculated based on item and buyer location).
     *
     * @return shippingCostType
     **/
    @Schema(description = "Indicates the type of shipping used to ship the item. " +
            "Possible values are <code> FIXED</code> (flat-rate shipping) and <code> CALCULATED</code> " +
            "(shipping cost calculated based on item and buyer location).")
    public String getShippingCostType() {
        return shippingCostType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShippingOptionSummary shippingOptionSummary = (ShippingOptionSummary) o;
        return Objects.equals(this.guaranteedDelivery, shippingOptionSummary.guaranteedDelivery) &&
                Objects.equals(this.maxEstimatedDeliveryDate, shippingOptionSummary.maxEstimatedDeliveryDate) &&
                Objects.equals(this.minEstimatedDeliveryDate, shippingOptionSummary.minEstimatedDeliveryDate) &&
                Objects.equals(this.shippingCost, shippingOptionSummary.shippingCost) &&
                Objects.equals(this.shippingCostType, shippingOptionSummary.shippingCostType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guaranteedDelivery, maxEstimatedDeliveryDate, minEstimatedDeliveryDate, shippingCost, shippingCostType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShippingOptionSummary {\n");
        sb.append("    guaranteedDelivery: ").append(toIndentedString(guaranteedDelivery)).append("\n");
        sb.append("    maxEstimatedDeliveryDate: ").append(toIndentedString(maxEstimatedDeliveryDate)).append("\n");
        sb.append("    minEstimatedDeliveryDate: ").append(toIndentedString(minEstimatedDeliveryDate)).append("\n");
        sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
        sb.append("    shippingCostType: ").append(toIndentedString(shippingCostType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
