package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the name/value pairs for the aspects of the product.
 * For example: BRAND/Apple
 */
@Setter
@Schema(description = "The type that defines the fields for the name/value pairs for the aspects of the product. " +
        "For example: BRAND/Apple")
public class Aspect {
    @SerializedName("localizedName")
    private String localizedName = null;

    @SerializedName("localizedValues")
    private List<String> localizedValues = null;

    public Aspect localizedName(String localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    /**
     * The text representing the name of the aspect for the name/value pair, such as Brand.
     *
     * @return localizedName
     **/
    @Schema(description = "The text representing the name of the aspect for the name/value pair, such as Brand.")
    public String getLocalizedName() {
        return localizedName;
    }

    public Aspect localizedValues(List<String> localizedValues) {
        this.localizedValues = localizedValues;
        return this;
    }

    public Aspect addLocalizedValuesItem(String localizedValuesItem) {
        if (this.localizedValues == null) {
            this.localizedValues = new ArrayList<>();
        }
        this.localizedValues.add(localizedValuesItem);
        return this;
    }

    /**
     * The text representing the value of the aspect for the name/value pair, such as Apple.
     *
     * @return localizedValues
     **/
    @Schema(description = "The text representing the value of the aspect for the name/value pair, such as Apple.")
    public List<String> getLocalizedValues() {
        return localizedValues;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Aspect aspect = (Aspect) o;
        return Objects.equals(this.localizedName, aspect.localizedName) &&
                Objects.equals(this.localizedValues, aspect.localizedValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localizedName, localizedValues);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Aspect {\n");
        sb.append("    localizedName: ").append(toIndentedString(localizedName)).append("\n");
        sb.append("    localizedValues: ").append(toIndentedString(localizedValues)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
