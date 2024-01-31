package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This container returns the product attribute name/value pairs that are compatible with the keyword.
 * These attributes are submitted in the  <b>compatibility_filter</b> request field.
 */
@Setter
@Schema(description = "This container returns the product attribute name/value pairs that are compatible " +
        "with the keyword. These attributes are submitted in the  <b>compatibility_filter</b> request field.")
public class CompatibilityProperty {
    @SerializedName("localizedName")
    private String localizedName = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("value")
    private String value = null;

    public CompatibilityProperty localizedName(String localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    /**
     * The name of the product attribute that as been translated to the language of the site.
     *
     * @return localizedName
     **/
    @Schema(description = "The name of the product attribute that as been translated to the language of the site.")
    public String getLocalizedName() {
        return localizedName;
    }

    public CompatibilityProperty name(String name) {
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

    public CompatibilityProperty value(String value) {
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
        CompatibilityProperty compatibilityProperty = (CompatibilityProperty) o;
        return Objects.equals(this.localizedName, compatibilityProperty.localizedName) &&
                Objects.equals(this.name, compatibilityProperty.name) &&
                Objects.equals(this.value, compatibilityProperty.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localizedName, name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompatibilityProperty {\n");
        sb.append("    localizedName: ").append(toIndentedString(localizedName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
