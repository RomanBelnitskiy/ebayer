package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The container that defines the fields for the category refinements. This container is returned when
 * <b> fieldgroups</b> is set to <code>CATEGORY_REFINEMENTS</code> or <code>FULL</code> in the request.
 */
@Setter
@Schema(description = "The container that defines the fields for the category refinements. This container " +
        "is returned when <b> fieldgroups</b> is set to <code>CATEGORY_REFINEMENTS</code> or <code>FULL</code> " +
        "in the request.")
public class CategoryDistribution {
    @SerializedName("categoryId")
    private String categoryId = null;

    @SerializedName("categoryName")
    private String categoryName = null;

    @SerializedName("matchCount")
    private Integer matchCount = null;

    @SerializedName("refinementHref")
    private String refinementHref = null;

    public CategoryDistribution categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * The identifier of the category.
     *
     * @return categoryId
     **/
    @Schema(description = "The identifier of the category.")
    public String getCategoryId() {
        return categoryId;
    }

    public CategoryDistribution categoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * The name of the category, such as Baby & Toddler Clothing.
     *
     * @return categoryName
     **/
    @Schema(description = "The name of the category, such as Baby & Toddler Clothing.")
    public String getCategoryName() {
        return categoryName;
    }

    public CategoryDistribution matchCount(Integer matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    /**
     * The number of items in this category.
     *
     * @return matchCount
     **/
    @Schema(description = "The number of items in this category.")
    public Integer getMatchCount() {
        return matchCount;
    }

    public CategoryDistribution refinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
        return this;
    }

    /**
     * The HATEOAS reference of this category.
     *
     * @return refinementHref
     **/
    @Schema(description = "The HATEOAS reference of this category.")
    public String getRefinementHref() {
        return refinementHref;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CategoryDistribution categoryDistribution = (CategoryDistribution) o;
        return Objects.equals(this.categoryId, categoryDistribution.categoryId) &&
                Objects.equals(this.categoryName, categoryDistribution.categoryName) &&
                Objects.equals(this.matchCount, categoryDistribution.matchCount) &&
                Objects.equals(this.refinementHref, categoryDistribution.refinementHref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName, matchCount, refinementHref);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryDistribution {\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
        sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
        sb.append("    refinementHref: ").append(toIndentedString(refinementHref)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
