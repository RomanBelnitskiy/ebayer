package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * AvailableCoupon
 */
@Setter
public class AvailableCoupon {
    @SerializedName("constraint")
    private CouponConstraint constraint = null;

    @SerializedName("discountAmount")
    private Amount discountAmount = null;

    @SerializedName("discountType")
    private String discountType = null;

    @SerializedName("message")
    private String message = null;

    @SerializedName("redemptionCode")
    private String redemptionCode = null;

    @SerializedName("termsWebUrl")
    private String termsWebUrl = null;

    public AvailableCoupon constraint(CouponConstraint constraint) {
        this.constraint = constraint;
        return this;
    }

    /**
     * Get constraint
     *
     * @return constraint
     **/
    @Schema(description = "")
    public CouponConstraint getConstraint() {
        return constraint;
    }

    public AvailableCoupon discountAmount(Amount discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Get discountAmount
     *
     * @return discountAmount
     **/
    @Schema(description = "")
    public Amount getDiscountAmount() {
        return discountAmount;
    }

    public AvailableCoupon discountType(String discountType) {
        this.discountType = discountType;
        return this;
    }

    /**
     * The type of discount that the coupon applies. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:CouponDiscountType'>eBay API documentation</a>
     *
     * @return discountType
     **/
    @Schema(description = "The type of discount that the coupon applies. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:CouponDiscountType'>eBay API documentation</a>")
    public String getDiscountType() {
        return discountType;
    }

    public AvailableCoupon message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A description of the coupon.<br><br><span class="tablenote"><b> Note: </b> The value returned in
     * the <b>termsWebUrl</b> field should appear for all experiences when displaying coupons. The value
     * in the <b>availableCoupons.message</b> field must also be included, if returned in the API response.</span>
     *
     * @return message
     **/
    @Schema(description = "A description of the coupon.<br><br><span class=\"tablenote\"><b> Note: </b> " +
            "The value returned in the <b>termsWebUrl</b> field should appear for all experiences when " +
            "displaying coupons. The value in the <b>availableCoupons.message</b> field must also be included, " +
            "if returned in the API response.</span>")
    public String getMessage() {
        return message;
    }

    public AvailableCoupon redemptionCode(String redemptionCode) {
        this.redemptionCode = redemptionCode;
        return this;
    }

    /**
     * The coupon code.
     *
     * @return redemptionCode
     **/
    @Schema(description = "The coupon code.")
    public String getRedemptionCode() {
        return redemptionCode;
    }

    public AvailableCoupon termsWebUrl(String termsWebUrl) {
        this.termsWebUrl = termsWebUrl;
        return this;
    }

    /**
     * The URL to the coupon terms of use.<br><br><span class="tablenote"><b> Note: </b> The value
     * returned in the <b>termsWebUrl</b> field should appear for all experiences when displaying coupons.
     * The value in the <b>availableCoupons.message</b> field must also be included, if returned in
     * the API response.</span>
     *
     * @return termsWebUrl
     **/
    @Schema(description = "The URL to the coupon terms of use.<br><br><span class=\"tablenote\"><b> Note: " +
            "</b> The value returned in the <b>termsWebUrl</b> field should appear for all experiences when " +
            "displaying coupons. The value in the <b>availableCoupons.message</b> field must also be included, " +
            "if returned in the API response.</span>")
    public String getTermsWebUrl() {
        return termsWebUrl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableCoupon availableCoupon = (AvailableCoupon) o;
        return Objects.equals(this.constraint, availableCoupon.constraint) &&
                Objects.equals(this.discountAmount, availableCoupon.discountAmount) &&
                Objects.equals(this.discountType, availableCoupon.discountType) &&
                Objects.equals(this.message, availableCoupon.message) &&
                Objects.equals(this.redemptionCode, availableCoupon.redemptionCode) &&
                Objects.equals(this.termsWebUrl, availableCoupon.termsWebUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constraint, discountAmount, discountType, message, redemptionCode, termsWebUrl);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableCoupon {\n");
        sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    redemptionCode: ").append(toIndentedString(redemptionCode)).append("\n");
        sb.append("    termsWebUrl: ").append(toIndentedString(termsWebUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
