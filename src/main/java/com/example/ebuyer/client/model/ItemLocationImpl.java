package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the location of an item, such as information typically used
 * for an address, including postal code, county, state/province, street address, city, and country
 * (2-digit ISO code).
 */
@Setter
@Schema(description = "The type that defines the fields for the location of an item, such as information " +
        "typically used for an address, including postal code, county, state/province, street address, city, " +
        "and country (2-digit ISO code).")
public class ItemLocationImpl {
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

    public ItemLocationImpl addressLine1(String addressLine1) {
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

    public ItemLocationImpl addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * The second line of the street address. This field may contain such values as an apartment or suite number.
     *
     * @return addressLine2
     **/
    @Schema(description = "The second line of the street address. This field may contain such values " +
            "as an apartment or suite number.")
    public String getAddressLine2() {
        return addressLine2;
    }

    public ItemLocationImpl city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city in which the item is located. <br><br><b>Restriction:</b> This field is populated in the
     * <b> search</b> method response <i> only</i> when <b> fieldgroups</b> = <code>EXTENDED</code>.
     *
     * @return city
     **/
    @Schema(description = "The city in which the item is located. <br><br><b>Restriction:</b> This field " +
            "is populated in the <b> search</b> method response <i> only</i> when <b> fieldgroups</b> = " +
            "<code>EXTENDED</code>.")
    public String getCity() {
        return city;
    }

    public ItemLocationImpl country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The two-letter <a href="https://www.iso.org/iso-3166-country-codes.html ">ISO 3166</a>
     * standard code that indicates the country in which the item is located.
     * For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>eBay API documentation</a>
     *
     * @return country
     **/
    @Schema(description = "The two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \">" +
            "ISO 3166</a> standard code that indicates the country in which the item is located.  " +
            "For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>" +
            "eBay API documentation</a>")
    public String getCountry() {
        return country;
    }

    public ItemLocationImpl county(String county) {
        this.county = county;
        return this;
    }

    /**
     * The county in which the item is located.
     *
     * @return county
     **/
    @Schema(description = "The county in which the item is located.")
    public String getCounty() {
        return county;
    }

    public ItemLocationImpl postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The postal code (or zip code in US) where the item is located. Sellers set a postal code
     * (or zip code in US) for items when they are listed. The postal code is used for calculating
     * proximity searches. It is anonymized when returned in <b>itemLocation.postalCode</b> via the API.
     *
     * @return postalCode
     **/
    @Schema(description = "The postal code (or zip code in US) where the item is located. Sellers set " +
            "a postal code (or zip code in US) for items when they are listed. The postal code is used " +
            "for calculating proximity searches. It is anonymized when returned in <b>itemLocation.postalCode</b> " +
            "via the API.")
    public String getPostalCode() {
        return postalCode;
    }

    public ItemLocationImpl stateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
        return this;
    }

    /**
     * The state or province in which the item is located.
     *
     * @return stateOrProvince
     **/
    @Schema(description = "The state or province in which the item is located.")
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
        ItemLocationImpl itemLocationImpl = (ItemLocationImpl) o;
        return Objects.equals(this.addressLine1, itemLocationImpl.addressLine1) &&
                Objects.equals(this.addressLine2, itemLocationImpl.addressLine2) &&
                Objects.equals(this.city, itemLocationImpl.city) &&
                Objects.equals(this.country, itemLocationImpl.country) &&
                Objects.equals(this.county, itemLocationImpl.county) &&
                Objects.equals(this.postalCode, itemLocationImpl.postalCode) &&
                Objects.equals(this.stateOrProvince, itemLocationImpl.stateOrProvince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, city, country, county, postalCode, stateOrProvince);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemLocationImpl {\n");
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
