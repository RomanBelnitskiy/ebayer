package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the name/value pairs for item aspects.
 */
@Setter
@Schema(description = "The type that defines the fields for the name/value pairs for item aspects.")
public class TypedNameValue {
    @SerializedName("name")
    private String name = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("value")
    private String value = null;

    public TypedNameValue name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The text representing the name of the aspect for the name/value pair, such as Color.
     *
     * @return name
     **/
    @Schema(description = "The text representing the name of the aspect for the name/value pair, such as Color.")
    public String getName() {
        return name;
    }

    public TypedNameValue type(String type) {
        this.type = type;
        return this;
    }

    /**
     * This indicates if the value being returned is a string or an array of values.
     * <br><br><b> Valid Values: </b> <ul><li><b> STRING</b> - Indicates the value returned is a string.</li>
     * <li><b> STRING_ARRAY</b> - Indicates the value returned is an array of strings.</li></ul>
     * Code so that your app gracefully handles any future changes to this list. For
     * implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:ValueTypeEnum'>eBay API documentation</a>
     *
     * @return type
     **/
    @Schema(description = "This indicates if the value being returned is a string or an array of values. " +
            "<br><br><b> Valid Values: </b> <ul><li><b> STRING</b> - Indicates the value returned is a string.</li>  " +
            "<li><b> STRING_ARRAY</b> - Indicates the value returned is an array of strings.</li></ul>  " +
            "Code so that your app gracefully handles any future changes to this list. For implementation " +
            "help, refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:ValueTypeEnum'>" +
            "eBay API documentation</a>")
    public String getType() {
        return type;
    }

    public TypedNameValue value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the aspect for the name/value pair, such as Red.
     *
     * @return value
     **/
    @Schema(description = "The value of the aspect for the name/value pair, such as Red.")
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
        TypedNameValue typedNameValue = (TypedNameValue) o;
        return Objects.equals(this.name, typedNameValue.name) &&
                Objects.equals(this.type, typedNameValue.type) &&
                Objects.equals(this.value, typedNameValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypedNameValue {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
