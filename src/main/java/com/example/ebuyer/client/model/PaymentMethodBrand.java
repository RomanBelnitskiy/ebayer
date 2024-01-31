package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * PaymentMethodBrand
 */
@Setter
public class PaymentMethodBrand {
    @SerializedName("paymentMethodBrandType")
    private String paymentMethodBrandType = null;

    @SerializedName("logoImage")
    private Image logoImage = null;

    public PaymentMethodBrand paymentMethodBrandType(String paymentMethodBrandType) {
        this.paymentMethodBrandType = paymentMethodBrandType;
        return this;
    }

    /**
     * The payment method brand, such as Visa or PayPal. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PaymentMethodBrandEnum'>
     * eBay API documentation</a>
     *
     * @return paymentMethodBrandType
     **/
    @Schema(description = "The payment method brand, such as Visa or PayPal. For implementation help, " +
            "refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PaymentMethodBrandEnum'>" +
            "eBay API documentation</a>")
    public String getPaymentMethodBrandType() {
        return paymentMethodBrandType;
    }

    public PaymentMethodBrand logoImage(Image logoImage) {
        this.logoImage = logoImage;
        return this;
    }

    /**
     * Get logoImage
     *
     * @return logoImage
     **/
    @Schema(description = "")
    public Image getLogoImage() {
        return logoImage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentMethodBrand paymentMethodBrand = (PaymentMethodBrand) o;
        return Objects.equals(this.paymentMethodBrandType, paymentMethodBrand.paymentMethodBrandType) &&
                Objects.equals(this.logoImage, paymentMethodBrand.logoImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodBrandType, logoImage);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentMethodBrand {\n");
        sb.append("    paymentMethodBrandType: ").append(toIndentedString(paymentMethodBrandType)).append("\n");
        sb.append("    logoImage: ").append(toIndentedString(logoImage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
