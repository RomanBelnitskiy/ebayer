package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for an address.
 */
@Setter
@Schema(description = "The type that defines the fields for an address.")
public class Address {
    @SerializedName("addressLine1")
    private String addressLine1 = null;

    @SerializedName("addressLine2")
    private String addressLine2 = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("country")
    private String country = null;

    @SerializedName("county")
    private String county = null;

    @SerializedName("postalCode")
    private String postalCode = null;

    @SerializedName("stateOrProvince")
    private String stateOrProvince = null;

    public Address addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * The first line of the street address. <b> Note: </b> This is conditionally returned in the <b> itemLocation</b> field.
     *
     * @return addressLine1
     **/
    @Schema(description = "The first line of the street address. <b> Note: </b> This is conditionally returned in " +
            "the <b> itemLocation</b> field.")
    public String getAddressLine1() {
        return addressLine1;
    }

    public Address addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * The second line of the street address. This field is not always used, but can be used for
     * 'Suite Number' or 'Apt Number'.
     *
     * @return addressLine2
     **/
    @Schema(description = "The second line of the street address. This field is not always used, but can be " +
            "used for 'Suite Number' or 'Apt Number'.")
    public String getAddressLine2() {
        return addressLine2;
    }

    public Address city(String city) {
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

    public Address country(String country) {
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
    @Schema(description = "The two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" target=\"_blank\">ISO 3166</a> " +
            "standard of the country of the address. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>eBay API documentation</a>")
    public String getCountry() {
        return country;
    }

    public Address county(String county) {
        this.county = county;
        return this;
    }

    /**
     * The county of the address.
     *
     * @return county
     **/
    @Schema(description = "The county of the address.")
    public String getCounty() {
        return county;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The postal code (or zip code in US) code of the address. Sellers set a postal code
     * (or zip code in US) for items when they are listed. The postal code is used for calculating
     * proximity searches. It is anonymized when returned in <b>itemLocation.postalCode</b> via the API.
     *
     * @return postalCode
     **/
    @Schema(description = "The postal code (or zip code in US) code of the address. Sellers set a postal " +
            "code (or zip code in US) for items when they are listed. The postal code is used for calculating " +
            "proximity searches. It is anonymized when returned in <b>itemLocation.postalCode</b> via the API.")
    public String getPostalCode() {
        return postalCode;
    }

    public Address stateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
        return this;
    }

    /**
     * The state or province of the address.  <b> Note: </b> This is conditionally returned in the
     * <b> itemLocation</b> field.
     *
     * @return stateOrProvince
     **/
    @Schema(description = "The state or province of the address.  <b> Note: </b> This is conditionally " +
            "returned in the <b> itemLocation</b> field.")
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
        Address address = (Address) o;
        return Objects.equals(this.addressLine1, address.addressLine1) &&
                Objects.equals(this.addressLine2, address.addressLine2) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.country, address.country) &&
                Objects.equals(this.county, address.county) &&
                Objects.equals(this.postalCode, address.postalCode) &&
                Objects.equals(this.stateOrProvince, address.stateOrProvince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, city, country, county, postalCode, stateOrProvince);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    county: ").append(toIndentedString(county)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
