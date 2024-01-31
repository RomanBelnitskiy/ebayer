package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the tax fields.
 */
@Setter
@Schema(description = "The type that defines the tax fields.")
public class Taxes {
    @SerializedName("ebayCollectAndRemitTax")
    private Boolean ebayCollectAndRemitTax = null;

    @SerializedName("includedInPrice")
    private Boolean includedInPrice = null;

    @SerializedName("shippingAndHandlingTaxed")
    private Boolean shippingAndHandlingTaxed = null;

    @SerializedName("taxJurisdiction")
    private TaxJurisdiction taxJurisdiction = null;

    @SerializedName("taxPercentage")
    private String taxPercentage = null;

    @SerializedName("taxType")
    private String taxType = null;

    public Taxes ebayCollectAndRemitTax(Boolean ebayCollectAndRemitTax) {
        this.ebayCollectAndRemitTax = ebayCollectAndRemitTax;
        return this;
    }

    /**
     * This field is only returned if <code>true</code>, and indicates that eBay will collect
     * tax (sales tax, Goods and Services tax, or VAT) for at least one line item in the order,
     * and remit the tax to the taxing authority of the buyer's residence.
     *
     * @return ebayCollectAndRemitTax
     **/
    @Schema(description = "This field is only returned if <code>true</code>, and indicates that eBay " +
            "will collect tax (sales tax, Goods and Services tax, or VAT) for at least one line item in " +
            "the order, and remit the tax to the taxing authority of the buyer's residence. ")
    public Boolean isEbayCollectAndRemitTax() {
        return ebayCollectAndRemitTax;
    }

    public Taxes includedInPrice(Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    /**
     * This indicates if tax was applied for the cost of the item.
     *
     * @return includedInPrice
     **/
    @Schema(description = "This indicates if tax was applied for the cost of the item.")
    public Boolean isIncludedInPrice() {
        return includedInPrice;
    }

    public Taxes shippingAndHandlingTaxed(Boolean shippingAndHandlingTaxed) {
        this.shippingAndHandlingTaxed = shippingAndHandlingTaxed;
        return this;
    }

    /**
     * This indicates if tax is applied for the shipping cost.
     *
     * @return shippingAndHandlingTaxed
     **/
    @Schema(description = "This indicates if tax is applied for the shipping cost.")
    public Boolean isShippingAndHandlingTaxed() {
        return shippingAndHandlingTaxed;
    }

    public Taxes taxJurisdiction(TaxJurisdiction taxJurisdiction) {
        this.taxJurisdiction = taxJurisdiction;
        return this;
    }

    /**
     * Get taxJurisdiction
     *
     * @return taxJurisdiction
     **/
    @Schema(description = "")
    public TaxJurisdiction getTaxJurisdiction() {
        return taxJurisdiction;
    }

    public Taxes taxPercentage(String taxPercentage) {
        this.taxPercentage = taxPercentage;
        return this;
    }

    /**
     * The percentage of tax.
     *
     * @return taxPercentage
     **/
    @Schema(description = "The percentage of tax.")
    public String getTaxPercentage() {
        return taxPercentage;
    }

    public Taxes taxType(String taxType) {
        this.taxType = taxType;
        return this;
    }

    /**
     * This field indicates the type of tax that may be collected for the item. For
     * implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:TaxType'>eBay API documentation</a>
     *
     * @return taxType
     **/
    @Schema(description = "This field indicates the type of tax that may be collected for the item. " +
            "For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:TaxType'>eBay API documentation</a>")
    public String getTaxType() {
        return taxType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Taxes taxes = (Taxes) o;
        return Objects.equals(this.ebayCollectAndRemitTax, taxes.ebayCollectAndRemitTax) &&
                Objects.equals(this.includedInPrice, taxes.includedInPrice) &&
                Objects.equals(this.shippingAndHandlingTaxed, taxes.shippingAndHandlingTaxed) &&
                Objects.equals(this.taxJurisdiction, taxes.taxJurisdiction) &&
                Objects.equals(this.taxPercentage, taxes.taxPercentage) &&
                Objects.equals(this.taxType, taxes.taxType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ebayCollectAndRemitTax, includedInPrice, shippingAndHandlingTaxed, taxJurisdiction, taxPercentage, taxType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Taxes {\n");
        sb.append("    ebayCollectAndRemitTax: ").append(toIndentedString(ebayCollectAndRemitTax)).append("\n");
        sb.append("    includedInPrice: ").append(toIndentedString(includedInPrice)).append("\n");
        sb.append("    shippingAndHandlingTaxed: ").append(toIndentedString(shippingAndHandlingTaxed)).append("\n");
        sb.append("    taxJurisdiction: ").append(toIndentedString(taxJurisdiction)).append("\n");
        sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
        sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
