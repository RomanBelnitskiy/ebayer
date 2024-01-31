package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the tax jurisdiction details.
 */
@Setter
@Schema(description = "The type that defines the fields for the tax jurisdiction details.")
public class TaxJurisdiction {
    @SerializedName("region")
    private Region region = null;

    @SerializedName("taxJurisdictionId")
    private String taxJurisdictionId = null;

    public TaxJurisdiction region(Region region) {
        this.region = region;
        return this;
    }

    /**
     * Get region
     *
     * @return region
     **/
    @Schema(description = "")
    public Region getRegion() {
        return region;
    }

    public TaxJurisdiction taxJurisdictionId(String taxJurisdictionId) {
        this.taxJurisdictionId = taxJurisdictionId;
        return this;
    }

    /**
     * The identifier of the tax jurisdiction.
     *
     * @return taxJurisdictionId
     **/
    @Schema(description = "The identifier of the tax jurisdiction.")
    public String getTaxJurisdictionId() {
        return taxJurisdictionId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaxJurisdiction taxJurisdiction = (TaxJurisdiction) o;
        return Objects.equals(this.region, taxJurisdiction.region) &&
                Objects.equals(this.taxJurisdictionId, taxJurisdiction.taxJurisdictionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, taxJurisdictionId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaxJurisdiction {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    taxJurisdictionId: ").append(toIndentedString(taxJurisdictionId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
