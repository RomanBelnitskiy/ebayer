package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the item details.
 */
@Setter
@Schema(description = "The type that defines the fields for the item details.")
public class ItemGroup {
    @SerializedName("commonDescriptions")
    private List<CommonDescriptions> commonDescriptions = null;

    @SerializedName("items")
    private List<Item> items = null;

    @SerializedName("warnings")
    private List<Error> warnings = null;

    public ItemGroup commonDescriptions(List<CommonDescriptions> commonDescriptions) {
        this.commonDescriptions = commonDescriptions;
        return this;
    }

    public ItemGroup addCommonDescriptionsItem(CommonDescriptions commonDescriptionsItem) {
        if (this.commonDescriptions == null) {
            this.commonDescriptions = new ArrayList<>();
        }
        this.commonDescriptions.add(commonDescriptionsItem);
        return this;
    }

    /**
     * An array of containers for a description and the item IDs of all the items that have
     * this exact description. Often the item variations within an item group all have the same
     * description. Instead of repeating this description in the item details of each item,
     * a description that is shared by at least one other item is returned in this container.
     * If the description is unique, it is returned in the <b> items.description</b> field.
     *
     * @return commonDescriptions
     **/
    @Schema(description = "An array of containers for a description and the item IDs of all the items " +
            "that have this exact description. Often the item variations within an item group all have " +
            "the same description. Instead of repeating this description in the item details of each item, " +
            "a description that is shared by at least one other item is returned in this container. " +
            "If the description is unique, it is returned in the <b> items.description</b> field.")
    public List<CommonDescriptions> getCommonDescriptions() {
        return commonDescriptions;
    }

    public ItemGroup items(List<Item> items) {
        this.items = items;
        return this;
    }

    public ItemGroup addItemsItem(Item itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * An array of containers for all the item variation details, excluding the description.
     *
     * @return items
     **/
    @Schema(description = "An array of containers for all the item variation details, excluding the description.")
    public List<Item> getItems() {
        return items;
    }

    public ItemGroup warnings(List<Error> warnings) {
        this.warnings = warnings;
        return this;
    }

    public ItemGroup addWarningsItem(Error warningsItem) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.add(warningsItem);
        return this;
    }

    /**
     * An array of warning messages. These types of errors do not prevent the method from
     * executing but should be checked.
     *
     * @return warnings
     **/
    @Schema(description = "An array of warning messages. These types of errors do not prevent " +
            "the method from executing but should be checked.")
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
        ItemGroup itemGroup = (ItemGroup) o;
        return Objects.equals(this.commonDescriptions, itemGroup.commonDescriptions) &&
                Objects.equals(this.items, itemGroup.items) &&
                Objects.equals(this.warnings, itemGroup.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonDescriptions, items, warnings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemGroup {\n");
        sb.append("    commonDescriptions: ").append(toIndentedString(commonDescriptions)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
