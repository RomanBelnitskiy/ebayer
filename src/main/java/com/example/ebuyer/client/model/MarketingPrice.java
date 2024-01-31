package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields that describe a seller discount.
 */
@Setter
@Schema(description = "The type that defines the fields that describe a seller discount.")
public class MarketingPrice {
    @SerializedName("discountAmount")
    private ConvertedAmount discountAmount = null;

    @SerializedName("discountPercentage")
    private String discountPercentage = null;

    @SerializedName("originalPrice")
    private ConvertedAmount originalPrice = null;

    @SerializedName("priceTreatment")
    private String priceTreatment = null;

    public MarketingPrice discountAmount(ConvertedAmount discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Get discountAmount
     *
     * @return discountAmount
     **/
    @Schema(description = "")
    public ConvertedAmount getDiscountAmount() {
        return discountAmount;
    }

    public MarketingPrice discountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
        return this;
    }

    /**
     * This field expresses the percentage of the seller discount based on the value in
     * the <b>  originalPrice</b> container.
     *
     * @return discountPercentage
     **/
    @Schema(description = "This field expresses the percentage of the seller discount based on " +
            "the value in the <b>  originalPrice</b> container.")
    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public MarketingPrice originalPrice(ConvertedAmount originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    /**
     * Get originalPrice
     *
     * @return originalPrice
     **/
    @Schema(description = "")
    public ConvertedAmount getOriginalPrice() {
        return originalPrice;
    }

    public MarketingPrice priceTreatment(String priceTreatment) {
        this.priceTreatment = priceTreatment;
        return this;
    }

    /**
     * Indicates the pricing treatment (discount) that was applied to the price of the item.
     * <br><br><span class="tablenote"><b>Note: </b> The pricing treatment affects the way
     * and where the discounted price can be displayed.</span> For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PriceTreatmentEnum'>
     * eBay API documentation</a>
     *
     * @return priceTreatment
     **/
    @Schema(description = "Indicates the pricing treatment (discount) that was applied to the price " +
            "of the item. <br><br><span class=\"tablenote\"><b>Note: </b> The pricing treatment affects " +
            "the way and where the discounted price can be displayed.</span> For implementation help, " +
            "refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PriceTreatmentEnum'>" +
            "eBay API documentation</a>")
    public String getPriceTreatment() {
        return priceTreatment;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketingPrice marketingPrice = (MarketingPrice) o;
        return Objects.equals(this.discountAmount, marketingPrice.discountAmount) &&
                Objects.equals(this.discountPercentage, marketingPrice.discountPercentage) &&
                Objects.equals(this.originalPrice, marketingPrice.originalPrice) &&
                Objects.equals(this.priceTreatment, marketingPrice.priceTreatment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountAmount, discountPercentage, originalPrice, priceTreatment);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketingPrice {\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
        sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
        sb.append("    priceTreatment: ").append(toIndentedString(priceTreatment)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
