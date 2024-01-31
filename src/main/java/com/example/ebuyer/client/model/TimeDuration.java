package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for a period of time in the time-measurement units supplied.
 */
@Setter
@Schema(description = "The type that defines the fields for a period of time in " +
        "the time-measurement units supplied.")
public class TimeDuration {
    @SerializedName("unit")
    private String unit = null;

    @SerializedName("value")
    private Integer value = null;

    public TimeDuration unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * An enumeration value that indicates the units (such as hours) of the time span.
     * The enumeration value in this field defines the period of time being used to measure
     * the duration.
     * <br><br><b> Valid Values: </b> YEAR, MONTH, DAY, HOUR, CALENDAR_DAY, BUSINESS_DAY,
     * MINUTE, SECOND, or MILLISECOND
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     * For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:TimeDurationUnitEnum'>eBay API documentation</a>
     *
     * @return unit
     **/
    @Schema(description = "An enumeration value that indicates the units (such as hours) of the time span. " +
            "The enumeration value in this field defines the period of time being used to measure " +
            "the duration. <br><br><b> Valid Values: </b> YEAR, MONTH, DAY, HOUR, CALENDAR_DAY, " +
            "BUSINESS_DAY, MINUTE, SECOND, or MILLISECOND <br><br>Code so that your app gracefully " +
            "handles any future changes to this list. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:TimeDurationUnitEnum'>" +
            "eBay API documentation</a>")
    public String getUnit() {
        return unit;
    }

    public TimeDuration value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Retrieves the duration of the time span (no units).The value in this field indicates
     * the number of years, months, days, hours, or minutes in the defined period.
     *
     * @return value
     **/
    @Schema(description = "Retrieves the duration of the time span (no units).The value in this " +
            "field indicates the number of years, months, days, hours, or minutes in the defined period.  ")
    public Integer getValue() {
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
        TimeDuration timeDuration = (TimeDuration) o;
        return Objects.equals(this.unit, timeDuration.unit) &&
                Objects.equals(this.value, timeDuration.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeDuration {\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
