package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the country and postal code of where an item is to be shipped.
 */
@Setter
@Schema(description = "The type that defines the fields for the country and postal code of where " +
        "an item is to be shipped.")
public class ShipToLocation {
    @SerializedName("country")
    private String country = null;

    @SerializedName("postalCode")
    private String postalCode = null;

    public ShipToLocation country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The two-letter <a href="https://www.iso.org/iso-3166-country-codes.html " target="_blank">ISO 3166</a>
     * standard of the country for where the item is to be shipped. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>eBay API documentation</a>
     *
     * @return country
     **/
    @Schema(description = "The two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" target=\"_blank\">" +
            "ISO 3166</a> standard of the country for where the item is to be shipped. For implementation " +
            "help, refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CountryCodeEnum'>" +
            "eBay API documentation</a>")
    public String getCountry() {
        return country;
    }

    public ShipToLocation postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The zip code (postal code) for where the item is to be shipped.
     *
     * @return postalCode
     **/
    @Schema(description = "The zip code (postal code) for where the item is to be shipped.")
    public String getPostalCode() {
        return postalCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipToLocation shipToLocation = (ShipToLocation) o;
        return Objects.equals(this.country, shipToLocation.country) &&
                Objects.equals(this.postalCode, shipToLocation.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, postalCode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipToLocation {\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
