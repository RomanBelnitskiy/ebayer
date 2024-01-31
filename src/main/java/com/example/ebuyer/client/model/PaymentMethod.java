package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * PaymentMethod
 */
@Setter
public class PaymentMethod {
    @SerializedName("paymentMethodType")
    private String paymentMethodType = null;

    @SerializedName("paymentMethodBrands")
    private List<PaymentMethodBrand> paymentMethodBrands = null;

    @SerializedName("paymentInstructions")
    private List<String> paymentInstructions = null;

    @SerializedName("sellerInstructions")
    private List<String> sellerInstructions = null;

    public PaymentMethod paymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
        return this;
    }

    /**
     * The payment method type, such as credit card or cash. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PaymentMethodTypeEnum'>
     * eBay API documentation</a>
     *
     * @return paymentMethodType
     **/
    @Schema(description = "The payment method type, such as credit card or cash. For implementation help, " +
            "refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PaymentMethodTypeEnum'>" +
            "eBay API documentation</a>")
    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public PaymentMethod paymentMethodBrands(List<PaymentMethodBrand> paymentMethodBrands) {
        this.paymentMethodBrands = paymentMethodBrands;
        return this;
    }

    public PaymentMethod addPaymentMethodBrandsItem(PaymentMethodBrand paymentMethodBrandsItem) {
        if (this.paymentMethodBrands == null) {
            this.paymentMethodBrands = new ArrayList<>();
        }
        this.paymentMethodBrands.add(paymentMethodBrandsItem);
        return this;
    }

    /**
     * The payment method brands, including the payment method brand type and logo image.
     *
     * @return paymentMethodBrands
     **/
    @Schema(description = "The payment method brands, including the payment method brand type and logo image.")
    public List<PaymentMethodBrand> getPaymentMethodBrands() {
        return paymentMethodBrands;
    }

    public PaymentMethod paymentInstructions(List<String> paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
        return this;
    }

    public PaymentMethod addPaymentInstructionsItem(String paymentInstructionsItem) {
        if (this.paymentInstructions == null) {
            this.paymentInstructions = new ArrayList<>();
        }
        this.paymentInstructions.add(paymentInstructionsItem);
        return this;
    }

    /**
     * The payment instructions for the buyer, such as <i>cash in person</i> or <i>contact seller</i>.
     *
     * @return paymentInstructions
     **/
    @Schema(description = "The payment instructions for the buyer, such as <i>cash in person</i> " +
            "or <i>contact seller</i>.")
    public List<String> getPaymentInstructions() {
        return paymentInstructions;
    }

    public PaymentMethod sellerInstructions(List<String> sellerInstructions) {
        this.sellerInstructions = sellerInstructions;
        return this;
    }

    public PaymentMethod addSellerInstructionsItem(String sellerInstructionsItem) {
        if (this.sellerInstructions == null) {
            this.sellerInstructions = new ArrayList<>();
        }
        this.sellerInstructions.add(sellerInstructionsItem);
        return this;
    }

    /**
     * The seller instructions to the buyer, such as <i>accepts credit cards</i> or <i>see description</i>.
     *
     * @return sellerInstructions
     **/
    @Schema(description = "The seller instructions to the buyer, such as <i>accepts credit cards</i> " +
            "or <i>see description</i>.")
    public List<String> getSellerInstructions() {
        return sellerInstructions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) o;
        return Objects.equals(this.paymentMethodType, paymentMethod.paymentMethodType) &&
                Objects.equals(this.paymentMethodBrands, paymentMethod.paymentMethodBrands) &&
                Objects.equals(this.paymentInstructions, paymentMethod.paymentInstructions) &&
                Objects.equals(this.sellerInstructions, paymentMethod.sellerInstructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodType, paymentMethodBrands, paymentInstructions, sellerInstructions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentMethod {\n");
        sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
        sb.append("    paymentMethodBrands: ").append(toIndentedString(paymentMethodBrands)).append("\n");
        sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
        sb.append("    sellerInstructions: ").append(toIndentedString(sellerInstructions)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
