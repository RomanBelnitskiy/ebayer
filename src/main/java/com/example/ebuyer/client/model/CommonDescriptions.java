package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the item ids that all use a common description.  Often
 * the item variations within an item group all have the same description. Instead of repeating
 * this description in the item details of each item, a description that is shared by at least
 * one other item is returned in this container. If the description is unique, it is returned
 * in the <b> items.description</b> field.
 */
@Setter
@Schema(description = "The type that defines the fields for the item ids that all use a common description.  " +
        "Often the item variations within an item group all have the same description. Instead of repeating " +
        "this description in the item details of each item, a description that is shared by at least one " +
        "other item is returned in this container. If the description is unique, it is returned in the <b> " +
        "items.description</b> field.")
public class CommonDescriptions {
    @SerializedName("description")
    private String description = null;

    @SerializedName("itemIds")
    private List<String> itemIds = null;

    public CommonDescriptions description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The item description that is used by more than one of the item variations.
     *
     * @return description
     **/
    @Schema(description = "The item description that is used by more than one of the item variations.")
    public String getDescription() {
        return description;
    }

    public CommonDescriptions itemIds(List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }

    public CommonDescriptions addItemIdsItem(String itemIdsItem) {
        if (this.itemIds == null) {
            this.itemIds = new ArrayList<>();
        }
        this.itemIds.add(itemIdsItem);
        return this;
    }

    /**
     * A list of item ids that have this description.
     *
     * @return itemIds
     **/
    @Schema(description = "A list of item ids that have this description.")
    public List<String> getItemIds() {
        return itemIds;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonDescriptions commonDescriptions = (CommonDescriptions) o;
        return Objects.equals(this.description, commonDescriptions.description) &&
                Objects.equals(this.itemIds, commonDescriptions.itemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, itemIds);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonDescriptions {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
