package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * An array of name/value pairs that provide details regarding the error.
 */
@Setter
@Schema(description = "An array of name/value pairs that provide details regarding the error.")
public class ErrorParameter {
    @SerializedName("name")
    private String name = null;

    @SerializedName("value")
    private String value = null;

    public ErrorParameter name(String name) {
        this.name = name;
        return this;
    }

    /**
     * This is the name of input field that caused an issue with the call request.
     *
     * @return name
     **/
    @Schema(description = "This is the name of input field that caused an issue with the call request.")
    public String getName() {
        return name;
    }

    public ErrorParameter value(String value) {
        this.value = value;
        return this;
    }

    /**
     * This is the actual value that was passed in for the element specified in the <b> name</b>  field.
     *
     * @return value
     **/
    @Schema(description = "This is the actual value that was passed in for the element specified in " +
            "the <b> name</b>  field.")
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
        ErrorParameter errorParameter = (ErrorParameter) o;
        return Objects.equals(this.name, errorParameter.name) &&
                Objects.equals(this.value, errorParameter.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorParameter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
