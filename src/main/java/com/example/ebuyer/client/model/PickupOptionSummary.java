package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the local pickup options that are available for the item.
 * It is used by the <b>  pickupOptions</b>  container.
 */
@Setter
@Schema(description = "The type that defines the fields for the local pickup options that are available " +
        "for the item. It is used by the <b>  pickupOptions</b>  container.")
public class PickupOptionSummary {
    @SerializedName("pickupLocationType")
    private String pickupLocationType = null;

    public PickupOptionSummary pickupLocationType(String pickupLocationType) {
        this.pickupLocationType = pickupLocationType;
        return this;
    }

    /**
     * This container returns the local pickup options available to the buyer. Possible values
     * are <code>ARRANGED_LOCATION</code> and <code>STORE</code>.
     *
     * @return pickupLocationType
     **/
    @Schema(description = "This container returns the local pickup options available to the buyer. " +
            "Possible values are <code>ARRANGED_LOCATION</code> and <code>STORE</code>.")
    public String getPickupLocationType() {
        return pickupLocationType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PickupOptionSummary pickupOptionSummary = (PickupOptionSummary) o;
        return Objects.equals(this.pickupLocationType, pickupOptionSummary.pickupLocationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pickupLocationType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PickupOptionSummary {\n");
        sb.append("    pickupLocationType: ").append(toIndentedString(pickupLocationType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
