package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This type is used to provide region details for a tax jurisdiction.
 */
@Setter
@Schema(description = "This type is used to provide region details for a tax jurisdiction.")
public class Region {
    @SerializedName("regionName")
    private String regionName = null;

    @SerializedName("regionType")
    private String regionType = null;

    public Region regionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * A localized text string that indicates the name of the region. Taxes are generally charged
     * at the state/province level or at the country level in the case of VAT tax.
     *
     * @return regionName
     **/
    @Schema(description = "A localized text string that indicates the name of the region. Taxes are " +
            "generally charged at the state/province level or at the country level in the case of VAT tax. ")
    public String getRegionName() {
        return regionName;
    }

    public Region regionType(String regionType) {
        this.regionType = regionType;
        return this;
    }

    /**
     * An enumeration value that indicates the type of region for the tax jurisdiction.
     * <br><br><b> Valid Values: </b> <ul>
     * <li><b> STATE_OR_PROVINCE </b> - Indicates the region is a state or province within a country,
     * such as California or New York in the US, or Ontario or Alberta in Canada.</li>
     * <li><b> COUNTRY </b> - Indicates the region is a single country.</li></ul>
     * Code so that your app gracefully handles any future changes to this list.
     * For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:RegionTypeEnum'>eBay API documentation</a>
     *
     * @return regionType
     **/
    @Schema(description = "An enumeration value that indicates the type of region for the tax jurisdiction. " +
            "<br><br><b> Valid Values: </b> <ul><li><b> STATE_OR_PROVINCE </b> - Indicates the region is " +
            "a state or province within a country, such as California or New York in the US, or Ontario " +
            "or Alberta in Canada.</li><li><b> COUNTRY </b> - Indicates the region is a single country.</li></ul>  " +
            "Code so that your app gracefully handles any future changes to this list. For implementation help, " +
            "refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:RegionTypeEnum'>" +
            "eBay API documentation</a>")
    public String getRegionType() {
        return regionType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Region region = (Region) o;
        return Objects.equals(this.regionName, region.regionName) &&
                Objects.equals(this.regionType, region.regionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, regionType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Region {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
