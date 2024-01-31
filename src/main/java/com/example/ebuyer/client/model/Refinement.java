package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This type defines the fields for the various refinements of an item. You can use
 * the information in this container to create histograms, which help shoppers choose
 * exactly what they want.
 */
@Setter
@Schema(description = "This type defines the fields for the various refinements of an item. " +
        "You can use the information in this container to create histograms, which help shoppers " +
        "choose exactly what they want.")
public class Refinement {
    @SerializedName("aspectDistributions")
    private List<AspectDistribution> aspectDistributions = null;

    @SerializedName("buyingOptionDistributions")
    private List<BuyingOptionDistribution> buyingOptionDistributions = null;

    @SerializedName("categoryDistributions")
    private List<CategoryDistribution> categoryDistributions = null;

    @SerializedName("conditionDistributions")
    private List<ConditionDistribution> conditionDistributions = null;

    @SerializedName("dominantCategoryId")
    private String dominantCategoryId = null;

    public Refinement aspectDistributions(List<AspectDistribution> aspectDistributions) {
        this.aspectDistributions = aspectDistributions;
        return this;
    }

    public Refinement addAspectDistributionsItem(AspectDistribution aspectDistributionsItem) {
        if (this.aspectDistributions == null) {
            this.aspectDistributions = new ArrayList<>();
        }
        this.aspectDistributions.add(aspectDistributionsItem);
        return this;
    }

    /**
     * An array of containers for the all the aspect refinements.
     *
     * @return aspectDistributions
     **/
    @Schema(description = "An array of containers for the all the aspect refinements.")
    public List<AspectDistribution> getAspectDistributions() {
        return aspectDistributions;
    }

    public Refinement buyingOptionDistributions(List<BuyingOptionDistribution> buyingOptionDistributions) {
        this.buyingOptionDistributions = buyingOptionDistributions;
        return this;
    }

    public Refinement addBuyingOptionDistributionsItem(BuyingOptionDistribution buyingOptionDistributionsItem) {
        if (this.buyingOptionDistributions == null) {
            this.buyingOptionDistributions = new ArrayList<>();
        }
        this.buyingOptionDistributions.add(buyingOptionDistributionsItem);
        return this;
    }

    /**
     * An array of containers for the all the buying option refinements.
     *
     * @return buyingOptionDistributions
     **/
    @Schema(description = "An array of containers for the all the buying option refinements.")
    public List<BuyingOptionDistribution> getBuyingOptionDistributions() {
        return buyingOptionDistributions;
    }

    public Refinement categoryDistributions(List<CategoryDistribution> categoryDistributions) {
        this.categoryDistributions = categoryDistributions;
        return this;
    }

    public Refinement addCategoryDistributionsItem(CategoryDistribution categoryDistributionsItem) {
        if (this.categoryDistributions == null) {
            this.categoryDistributions = new ArrayList<>();
        }
        this.categoryDistributions.add(categoryDistributionsItem);
        return this;
    }

    /**
     * An array of containers for the all the category refinements.
     *
     * @return categoryDistributions
     **/
    @Schema(description = "An array of containers for the all the category refinements.")
    public List<CategoryDistribution> getCategoryDistributions() {
        return categoryDistributions;
    }

    public Refinement conditionDistributions(List<ConditionDistribution> conditionDistributions) {
        this.conditionDistributions = conditionDistributions;
        return this;
    }

    public Refinement addConditionDistributionsItem(ConditionDistribution conditionDistributionsItem) {
        if (this.conditionDistributions == null) {
            this.conditionDistributions = new ArrayList<>();
        }
        this.conditionDistributions.add(conditionDistributionsItem);
        return this;
    }

    /**
     * An array of containers for the all the condition refinements.
     *
     * @return conditionDistributions
     **/
    @Schema(description = "An array of containers for the all the condition refinements.")
    public List<ConditionDistribution> getConditionDistributions() {
        return conditionDistributions;
    }

    public Refinement dominantCategoryId(String dominantCategoryId) {
        this.dominantCategoryId = dominantCategoryId;
        return this;
    }

    /**
     * The identifier of the category that most of the items are part of.
     *
     * @return dominantCategoryId
     **/
    @Schema(description = "The identifier of the category that most of the items are part of. ")
    public String getDominantCategoryId() {
        return dominantCategoryId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Refinement refinement = (Refinement) o;
        return Objects.equals(this.aspectDistributions, refinement.aspectDistributions) &&
                Objects.equals(this.buyingOptionDistributions, refinement.buyingOptionDistributions) &&
                Objects.equals(this.categoryDistributions, refinement.categoryDistributions) &&
                Objects.equals(this.conditionDistributions, refinement.conditionDistributions) &&
                Objects.equals(this.dominantCategoryId, refinement.dominantCategoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aspectDistributions, buyingOptionDistributions, categoryDistributions, conditionDistributions, dominantCategoryId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Refinement {\n");
        sb.append("    aspectDistributions: ").append(toIndentedString(aspectDistributions)).append("\n");
        sb.append("    buyingOptionDistributions: ").append(toIndentedString(buyingOptionDistributions)).append("\n");
        sb.append("    categoryDistributions: ").append(toIndentedString(categoryDistributions)).append("\n");
        sb.append("    conditionDistributions: ").append(toIndentedString(conditionDistributions)).append("\n");
        sb.append("    dominantCategoryId: ").append(toIndentedString(dominantCategoryId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
