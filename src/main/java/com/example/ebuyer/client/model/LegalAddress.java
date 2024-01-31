package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * Type that defines the fields for the seller's address.
 */
@Setter
@Schema(description = "Type that defines the fields for the seller's address.")
public class LegalAddress {
    @SerializedName("addressLine1")
    private String addressLine1 = null;

    @SerializedName("addressLine2")
    private String addressLine2 = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("country")
    private String country = null;

    @SerializedName("countryName")
    private String countryName = null;

    @SerializedName("county")
    private String county = null;

    @SerializedName("postalCode")
    private String postalCode = null;

    @SerializedName("stateOrProvince")
    private String stateOrProvince = null;

    public LegalAddress addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * The first line of the street address.
     *
     * @return addressLine1
     **/
    @Schema(description = "The first line of the street address.")
    public String getAddressLine1() {
        return addressLine1;
    }

    public LegalAddress addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * The second line of the street address. This field is not always used, but can be used
     * for 'Suite Number' or 'Apt Number'.
     *
     * @return addressLine2
     **/
    @Schema(description = "The second line of the street address. This field is not always used, " +
            "but can be used for 'Suite Number' or 'Apt Number'.")
    public String getAddressLine2() {
        return addressLine2;
    }

    public LegalAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city of the address.
     *
     * @return city
     **/
    @Schema(description = "The city of the address.")
    public String getCity() {
        return city;
    }

    public LegalAddress country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The two-letter <a href="https://www.iso.org/iso-3166-country-codes.html " target="_blank">ISO 3166</a>
     * standard of the country of the address. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>eBay API documentation</a>
     *
     * @return country
     **/
    @Schema(description = "The two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" target=\"_blank\">" +
            "ISO 3166</a> standard of the country of the address. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>" +
            "eBay API documentation</a>")
    public String getCountry() {
        return country;
    }

    public LegalAddress countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * The name of the country of the address.
     *
     * @return countryName
     **/
    @Schema(description = "The name of the country of the address.")
    public String getCountryName() {
        return countryName;
    }

    public LegalAddress county(String county) {
        this.county = county;
        return this;
    }

    /**
     * The name of the county of the address.
     *
     * @return county
     **/
    @Schema(description = "The name of the county of the address.")
    public String getCounty() {
        return county;
    }

    public LegalAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The postal code of the address.
     *
     * @return postalCode
     **/
    @Schema(description = "The postal code of the address.")
    public String getPostalCode() {
        return postalCode;
    }

    public LegalAddress stateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
        return this;
    }

    /**
     * The state or province of the address.
     *
     * @return stateOrProvince
     **/
    @Schema(description = "The state or province of the address.")
    public String getStateOrProvince() {
        return stateOrProvince;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalAddress legalAddress = (LegalAddress) o;
        return Objects.equals(this.addressLine1, legalAddress.addressLine1) &&
                Objects.equals(this.addressLine2, legalAddress.addressLine2) &&
                Objects.equals(this.city, legalAddress.city) &&
                Objects.equals(this.country, legalAddress.country) &&
                Objects.equals(this.countryName, legalAddress.countryName) &&
                Objects.equals(this.county, legalAddress.county) &&
                Objects.equals(this.postalCode, legalAddress.postalCode) &&
                Objects.equals(this.stateOrProvince, legalAddress.stateOrProvince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, city, country, countryName, county, postalCode, stateOrProvince);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalAddress {\n");
        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
        sb.append("    county: ").append(toIndentedString(county)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
