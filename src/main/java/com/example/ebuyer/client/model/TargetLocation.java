package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the distance between the item location and the buyer's location.
 */
@Setter
@Schema(description = "The type that defines the fields for the distance between the item location and " +
        "the buyer's location. ")
public class TargetLocation {
    @SerializedName("unitOfMeasure")
    private String unitOfMeasure = null;

    @SerializedName("value")
    private String value = null;

    public TargetLocation unitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    /**
     * This value shows the unit of measurement used to measure the distance between the location
     * of the item and the buyer's location. This value is typically <code> mi</code> or <code> km</code>.
     *
     * @return unitOfMeasure
     **/
    @Schema(description = "This value shows the unit of measurement used to measure the distance between " +
            "the location of the item and the buyer's location. This value is typically <code> mi</code> " +
            "or <code> km</code>.")
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public TargetLocation value(String value) {
        this.value = value;
        return this;
    }

    /**
     * This value indicates the distance (measured in the measurement unit in the
     * <b> unitOfMeasure</b>  field) between the item location and the buyer's location.
     *
     * @return value
     **/
    @Schema(description = "This value indicates the distance (measured in the measurement unit in " +
            "the <b> unitOfMeasure</b>  field) between the item location and the buyer's location.")
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TargetLocation targetLocation = (TargetLocation) o;
        return Objects.equals(this.unitOfMeasure, targetLocation.unitOfMeasure) &&
                Objects.equals(this.value, targetLocation.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitOfMeasure, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetLocation {\n");
        sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
