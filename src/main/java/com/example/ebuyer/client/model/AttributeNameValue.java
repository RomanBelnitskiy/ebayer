package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type the defines attribute name/value pair fields that specify a product. The type of data
 * depends on the context. For example, if you were using this to specify a specific vehicle,
 * the attribute names would be Make, Model, Year, etc.
 */
@Setter
@Schema(description = "The type the defines attribute name/value pair fields that specify a product. " +
        "The type of data depends on the context. For example, if you were using this to specify a specific " +
        "vehicle, the attribute names would be Make, Model, Year, etc.")
public class AttributeNameValue {
    @SerializedName("name")
    private String name = null;

    @SerializedName("value")
    private String value = null;

    public AttributeNameValue name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the product attribute, such as Make, Model, Year, etc.
     *
     * @return name
     **/
    @Schema(description = "The name of the product attribute, such as Make, Model, Year, etc.")
    public String getName() {
        return name;
    }

    public AttributeNameValue value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value for the <b> name</b> attribute, such as BMW, R1200GS, 2011, etc.
     *
     * @return value
     **/
    @Schema(description = "The value for the <b> name</b> attribute, such as BMW, R1200GS, 2011, etc.")
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
        AttributeNameValue attributeNameValue = (AttributeNameValue) o;
        return Objects.equals(this.name, attributeNameValue.name) &&
                Objects.equals(this.value, attributeNameValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttributeNameValue {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
