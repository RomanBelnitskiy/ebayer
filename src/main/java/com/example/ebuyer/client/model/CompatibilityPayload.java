package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * An array of attribute name/value pairs used to define a specific product. For example: If you
 * wanted to specify a specific car, one of the name/value pairs would be <br><code>"name" : "Year",
 * <br>"value" : "2019"</code>  <p> For a list of the attributes required for cars and trucks and
 * motorcycles see <a href="/api-docs/buy/static/api-browse.html#Check">Check compatibility</a> in
 * the Buy Integration Guide.</p>
 */
@Setter
@Schema(description = "An array of attribute name/value pairs used to define a specific product. " +
        "For example: If you wanted to specify a specific car, one of the name/value pairs would be " +
        "<br><code>\"name\" : \"Year\", <br>\"value\" : \"2019\"</code>  <p> For a list of the attributes " +
        "required for cars and trucks and motorcycles see <a href=\"/api-docs/buy/static/api-browse.html#Check\">Check compatibility</a>" +
        " in the Buy Integration Guide.</p>")
public class CompatibilityPayload {
    @SerializedName("compatibilityProperties")
    private List<AttributeNameValue> compatibilityProperties = null;

    public CompatibilityPayload compatibilityProperties(List<AttributeNameValue> compatibilityProperties) {
        this.compatibilityProperties = compatibilityProperties;
        return this;
    }

    public CompatibilityPayload addCompatibilityPropertiesItem(AttributeNameValue compatibilityPropertiesItem) {
        if (this.compatibilityProperties == null) {
            this.compatibilityProperties = new ArrayList<>();
        }
        this.compatibilityProperties.add(compatibilityPropertiesItem);
        return this;
    }

    /**
     * An array of attribute name/value pairs used to define a specific product. For example:
     * If you wanted to specify a specific car, one of the name/value pairs would be <br><code>"name" : "Year",
     * <br>"value" : "2019"</code>  <p> For a list of the attributes required for cars and trucks and
     * motorcycles see <a href="/api-docs/buy/static/api-browse.html#Check">Check compatibility</a> in
     * the Buy Integration Guide.</p>
     *
     * @return compatibilityProperties
     **/
    @Schema(description = "An array of attribute name/value pairs used to define a specific product. " +
            "For example: If you wanted to specify a specific car, one of the name/value pairs would be " +
            "<br><code>\"name\" : \"Year\", <br>\"value\" : \"2019\"</code>  <p> For a list of the attributes " +
            "required for cars and trucks and motorcycles see " +
            "<a href=\"/api-docs/buy/static/api-browse.html#Check\">Check compatibility</a> " +
            "in the Buy Integration Guide.</p>")
    public List<AttributeNameValue> getCompatibilityProperties() {
        return compatibilityProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompatibilityPayload compatibilityPayload = (CompatibilityPayload) o;
        return Objects.equals(this.compatibilityProperties, compatibilityPayload.compatibilityProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compatibilityProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompatibilityPayload {\n");
        sb.append("    compatibilityProperties: ").append(toIndentedString(compatibilityProperties)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
