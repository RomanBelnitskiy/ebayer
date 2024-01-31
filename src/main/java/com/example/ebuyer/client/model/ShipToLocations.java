package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields that include and exclude geographic regions affecting
 * where the item can be shipped. The seller defines these regions when listing the item.
 */
@Setter
@Schema(description = "The type that defines the fields that include and exclude geographic " +
        "regions affecting where the item can be shipped. The seller defines these regions when listing the item.")
public class ShipToLocations {
    @SerializedName("regionExcluded")
    private List<ShipToRegion> regionExcluded = null;

    @SerializedName("regionIncluded")
    private List<ShipToRegion> regionIncluded = null;

    public ShipToLocations regionExcluded(List<ShipToRegion> regionExcluded) {
        this.regionExcluded = regionExcluded;
        return this;
    }

    public ShipToLocations addRegionExcludedItem(ShipToRegion regionExcludedItem) {
        if (this.regionExcluded == null) {
            this.regionExcluded = new ArrayList<>();
        }
        this.regionExcluded.add(regionExcludedItem);
        return this;
    }

    /**
     * An array of containers that express the large geographical regions, countries, state/provinces,
     * or special locations within a country where the seller is not willing to ship to.
     *
     * @return regionExcluded
     **/
    @Schema(description = "An array of containers that express the large geographical regions, countries, " +
            "state/provinces, or special locations within a country where the seller is not willing to ship to.")
    public List<ShipToRegion> getRegionExcluded() {
        return regionExcluded;
    }

    public ShipToLocations regionIncluded(List<ShipToRegion> regionIncluded) {
        this.regionIncluded = regionIncluded;
        return this;
    }

    public ShipToLocations addRegionIncludedItem(ShipToRegion regionIncludedItem) {
        if (this.regionIncluded == null) {
            this.regionIncluded = new ArrayList<>();
        }
        this.regionIncluded.add(regionIncludedItem);
        return this;
    }

    /**
     * An array of containers that express the large geographical regions, countries, or
     * state/provinces within a country where the seller is willing to ship to. Prospective
     * buyers must look at the shipping regions under this container, as well as the shipping
     * regions that are under the <b>regionExcluded</b> to see where the seller is willing to
     * ship items. Sellers can specify that they ship 'Worldwide', but then add several large
     * geographical regions (e.g. Asia, Oceania, Middle East) to the exclusion list, or sellers
     * can specify that they ship to Europe and Africa, but then add several individual countries
     * to the exclusion list.
     *
     * @return regionIncluded
     **/
    @Schema(description = "An array of containers that express the large geographical regions, " +
            "countries, or state/provinces within a country where the seller is willing to ship to. " +
            "Prospective buyers must look at the shipping regions under this container, as well as " +
            "the shipping regions that are under the <b>regionExcluded</b> to see where the seller " +
            "is willing to ship items. Sellers can specify that they ship 'Worldwide', but then add " +
            "several large geographical regions (e.g. Asia, Oceania, Middle East) to the exclusion list, " +
            "or sellers can specify that they ship to Europe and Africa, but then add several individual " +
            "countries to the exclusion list.")
    public List<ShipToRegion> getRegionIncluded() {
        return regionIncluded;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipToLocations shipToLocations = (ShipToLocations) o;
        return Objects.equals(this.regionExcluded, shipToLocations.regionExcluded) &&
                Objects.equals(this.regionIncluded, shipToLocations.regionIncluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionExcluded, regionIncluded);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipToLocations {\n");
        sb.append("    regionExcluded: ").append(toIndentedString(regionExcluded)).append("\n");
        sb.append("    regionIncluded: ").append(toIndentedString(regionIncluded)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
