package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type the defines the fields for the VAT (value add tax) information.
 */
@Setter
@Schema(description = "The type the defines the fields for the VAT (value add tax) information.")
public class VatDetail {
    @SerializedName("issuingCountry")
    private String issuingCountry = null;

    @SerializedName("vatId")
    private String vatId = null;

    public VatDetail issuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
        return this;
    }

    /**
     * The two-letter <a href="https://www.iso.org/iso-3166-country-codes.html " target="_blank">ISO 3166</a>
     * standard of the country issuing the seller's VAT (value added tax) ID. VAT is a tax added by
     * some European countries. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>eBay API documentation</a>
     *
     * @return issuingCountry
     **/
    @Schema(description = "The two-letter " +
            "<a href=\"https://www.iso.org/iso-3166-country-codes.html \" target=\"_blank\">ISO 3166</a> " +
            "standard of the country issuing the seller's VAT (value added tax) ID. VAT is a tax added " +
            "by some European countries. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>" +
            "eBay API documentation</a>")
    public String getIssuingCountry() {
        return issuingCountry;
    }

    public VatDetail vatId(String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     * The seller's VAT (value added tax) ID. VAT is a tax added by some European countries.
     *
     * @return vatId
     **/
    @Schema(description = "The seller's VAT (value added tax) ID. VAT is a tax added by some European countries.")
    public String getVatId() {
        return vatId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VatDetail vatDetail = (VatDetail) o;
        return Objects.equals(this.issuingCountry, vatDetail.issuingCountry) &&
                Objects.equals(this.vatId, vatDetail.vatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuingCountry, vatId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VatDetail {\n");
        sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
        sb.append("    vatId: ").append(toIndentedString(vatId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
