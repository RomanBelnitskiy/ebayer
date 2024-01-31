package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the response fields for <b> checkCompatibility</b>.
 */
@Setter
@Schema(description = "The type that defines the response fields for <b> checkCompatibility</b>.")
public class CompatibilityResponse {
    @SerializedName("compatibilityStatus")
    private String compatibilityStatus = null;

    @SerializedName("warnings")
    private List<Error> warnings = null;

    public CompatibilityResponse compatibilityStatus(String compatibilityStatus) {
        this.compatibilityStatus = compatibilityStatus;
        return this;
    }

    /**
     * An enumeration value that tells you if the item is compatible with the product. <br><br>The values are:
     * <ul>   <li>   <b> COMPATIBLE</b> - Indicates the item is compatible with the product specified in the request.</li>   <li>
     * <b> NOT_COMPATIBLE</b> - Indicates the item is not compatible with the product specified in the request.
     * Be sure to check all the <b> value</b> fields to ensure they are correct as errors in the value can also
     * cause this response. </li>   <li> <b> UNDETERMINED</b> - Indicates one or more attributes for
     * the specified product are missing so compatibility cannot be determined.  The response returns
     * the attributes that are missing.</li>  </ul>  Code so that your app gracefully handles any future
     * changes to this list. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:CompatibilityStatus'>eBay API documentation</a>
     *
     * @return compatibilityStatus
     **/
    @Schema(description = "An enumeration value that tells you if the item is compatible with the product. " +
            "<br><br>The values are: <ul>   <li>   <b> COMPATIBLE</b> - Indicates the item is compatible with " +
            "the product specified in the request.</li>   <li>   <b> NOT_COMPATIBLE</b> - Indicates the item " +
            "is not compatible with the product specified in the request. Be sure to check all the <b> value</b> " +
            "fields to ensure they are correct as errors in the value can also cause this response.</li>   " +
            "<li> <b> UNDETERMINED</b> - Indicates one or more attributes for the specified product are missing " +
            "so compatibility cannot be determined.  The response returns the attributes that are missing.</li>  </ul> " +
            " Code so that your app gracefully handles any future changes to this list. For implementation help, " +
            "refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:CompatibilityStatus'>eBay API documentation</a>")
    public String getCompatibilityStatus() {
        return compatibilityStatus;
    }

    public CompatibilityResponse warnings(List<Error> warnings) {
        this.warnings = warnings;
        return this;
    }

    public CompatibilityResponse addWarningsItem(Error warningsItem) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.add(warningsItem);
        return this;
    }

    /**
     * An array of warning messages. These types of errors do not prevent the method from executing
     * but should be checked.
     *
     * @return warnings
     **/
    @Schema(description = "An array of warning messages. These types of errors do not prevent the method " +
            "from executing but should be checked.")
    public List<Error> getWarnings() {
        return warnings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompatibilityResponse compatibilityResponse = (CompatibilityResponse) o;
        return Objects.equals(this.compatibilityStatus, compatibilityResponse.compatibilityStatus) &&
                Objects.equals(this.warnings, compatibilityResponse.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compatibilityStatus, warnings);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompatibilityResponse {\n");
        sb.append("    compatibilityStatus: ").append(toIndentedString(compatibilityStatus)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
