package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This type is used by the <b>categories</b> container in the response of the <b>search</b>  method,
 * and contains the name and ID of the item category.
 */
@Setter
@Schema(description = "This type is used by the <b>categories</b> container in the response of the <b>search</b>  " +
        "method, and contains the name and ID of the item category.")
public class Category {
    @SerializedName("categoryId")
    private String categoryId = null;

    @SerializedName("categoryName")
    private String categoryName = null;

    public Category categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * The unique identifier of the category.
     *
     * @return categoryId
     **/
    @Schema(description = "The unique identifier of the category.")
    public String getCategoryId() {
        return categoryId;
    }

    public Category categoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * The name of the category.
     *
     * @return categoryName
     **/
    @Schema(description = "The name of the category.")
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category category = (Category) o;
        return Objects.equals(this.categoryId, category.categoryId) &&
                Objects.equals(this.categoryName, category.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Category {\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
