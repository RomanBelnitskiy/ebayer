package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This type displays the value(s) associated with the specified condition descriptor name, as well
 * as any additional information about a condition descriptor.
 */
@Setter
@Schema(description = "This type displays the value(s) associated with the specified condition descriptor " +
        "name, as well as any additional information about a condition descriptor. ")
public class ConditionDescriptorValue {
    @SerializedName("additionalInfo")
    private List<String> additionalInfo = null;

    @SerializedName("content")
    private String content = null;

    public ConditionDescriptorValue additionalInfo(List<String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public ConditionDescriptorValue addAdditionalInfoItem(String additionalInfoItem) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new ArrayList<>();
        }
        this.additionalInfo.add(additionalInfoItem);
        return this;
    }

    /**
     * Additional information about the condition of an item as it relates to a condition descriptor.
     * This array elaborates on the value specified in the <b>content</b> field and provides additional
     * details about the condition of an item.
     *
     * @return additionalInfo
     **/
    @Schema(description = "Additional information about the condition of an item as it relates to " +
            "a condition descriptor. This array elaborates on the value specified in the <b>content</b> " +
            "field and provides additional details about the condition of an item.")
    public List<String> getAdditionalInfo() {
        return additionalInfo;
    }

    public ConditionDescriptorValue content(String content) {
        this.content = content;
        return this;
    }

    /**
     * The value for the condition descriptor indicated in the associated <b>name</b> field.
     *
     * @return content
     **/
    @Schema(description = "The value for the condition descriptor indicated in the associated <b>name</b> field.")
    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConditionDescriptorValue conditionDescriptorValue = (ConditionDescriptorValue) o;
        return Objects.equals(this.additionalInfo, conditionDescriptorValue.additionalInfo) &&
                Objects.equals(this.content, conditionDescriptorValue.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionDescriptorValue {\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
