package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * Container for a list of items.
 */
@Setter
@Schema(description = "Container for a list of items.")
public class Items {
    @SerializedName("items")
    private List<CoreItem> items = null;

    @SerializedName("total")
    private Integer total = null;

    @SerializedName("warnings")
    private List<Error> warnings = null;

    public Items items(List<CoreItem> items) {
        this.items = items;
        return this;
    }

    public Items addItemsItem(CoreItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * An arraylist of all the items.
     *
     * @return items
     **/
    @Schema(description = "An arraylist of all the items.")
    public List<CoreItem> getItems() {
        return items;
    }

    public Items total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * The total number of items retrieved.
     *
     * @return total
     **/
    @Schema(description = "The total number of items retrieved.")
    public Integer getTotal() {
        return total;
    }

    public Items warnings(List<Error> warnings) {
        this.warnings = warnings;
        return this;
    }

    public Items addWarningsItem(Error warningsItem) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.add(warningsItem);
        return this;
    }

    /**
     * An array of warning messages. These types of errors do not prevent the method from executing
     * but should be checked.
     *
     * @return warnings
     **/
    @Schema(description = "An array of warning messages. These types of errors do not prevent the method " +
            "from executing but should be checked.")
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
        Items items = (Items) o;
        return Objects.equals(this.items, items.items) &&
                Objects.equals(this.total, items.total) &&
                Objects.equals(this.warnings, items.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, total, warnings);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Items {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
