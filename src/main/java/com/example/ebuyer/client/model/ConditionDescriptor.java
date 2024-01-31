package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This type displays additional information about the condition of an item in a structured format.
 */
@Setter
@Schema(description = "This type displays additional information about the condition of an item in " +
        "a structured format.")
public class ConditionDescriptor {
    @SerializedName("name")
    private String name = null;

    @SerializedName("values")
    private List<ConditionDescriptorValue> values = null;

    public ConditionDescriptor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of a condition descriptor. The value(s) for this condition descriptor is returned in
     * the associated <b>values</b> array.
     *
     * @return name
     **/
    @Schema(description = "The name of a condition descriptor. The value(s) for this condition descriptor " +
            "is returned in the associated <b>values</b> array.")
    public String getName() {
        return name;
    }

    public ConditionDescriptor values(List<ConditionDescriptorValue> values) {
        this.values = values;
        return this;
    }

    public ConditionDescriptor addValuesItem(ConditionDescriptorValue valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * This array displays the value(s) for a condition descriptor (denoted by the associated <b>name</b>
     * field), as well as any other additional information about the condition of the item.
     *
     * @return values
     **/
    @Schema(description = "This array displays the value(s) for a condition descriptor (denoted by " +
            "the associated <b>name</b> field), as well as any other additional information about " +
            "the condition of the item.")
    public List<ConditionDescriptorValue> getValues() {
        return values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConditionDescriptor conditionDescriptor = (ConditionDescriptor) o;
        return Objects.equals(this.name, conditionDescriptor.name) &&
                Objects.equals(this.values, conditionDescriptor.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionDescriptor {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
