package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The container that defines the fields for the conditions refinements. This container is returned when
 * <b> fieldgroups</b> is set to <code>ASPECT_REFINEMENTS</code> or <code>FULL</code> in the request.
 */
@Setter
@Schema(description = "The container that defines the fields for the conditions refinements. This container is " +
        "returned when <b> fieldgroups</b> is set to <code>ASPECT_REFINEMENTS</code> or <code>FULL</code> " +
        "in the request.")
public class AspectValueDistribution {
    @SerializedName("localizedAspectValue")
    private String localizedAspectValue = null;

    @SerializedName("matchCount")
    private Integer matchCount = null;

    @SerializedName("refinementHref")
    private String refinementHref = null;

    public AspectValueDistribution localizedAspectValue(String localizedAspectValue) {
        this.localizedAspectValue = localizedAspectValue;
        return this;
    }

    /**
     * The value of an aspect. For example, Red is a value for the aspect Color.
     *
     * @return localizedAspectValue
     **/
    @Schema(description = "The value of an aspect. For example, Red is a value for the aspect Color.")
    public String getLocalizedAspectValue() {
        return localizedAspectValue;
    }

    public AspectValueDistribution matchCount(Integer matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    /**
     * The number of items with this aspect.
     *
     * @return matchCount
     **/
    @Schema(description = "The number of items with this aspect.")
    public Integer getMatchCount() {
        return matchCount;
    }

    public AspectValueDistribution refinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
        return this;
    }

    /**
     * A HATEOAS reference for this aspect.
     *
     * @return refinementHref
     **/
    @Schema(description = "A HATEOAS reference for this aspect.")
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
        AspectValueDistribution aspectValueDistribution = (AspectValueDistribution) o;
        return Objects.equals(this.localizedAspectValue, aspectValueDistribution.localizedAspectValue) &&
                Objects.equals(this.matchCount, aspectValueDistribution.matchCount) &&
                Objects.equals(this.refinementHref, aspectValueDistribution.refinementHref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localizedAspectValue, matchCount, refinementHref);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AspectValueDistribution {\n");
        sb.append("    localizedAspectValue: ").append(toIndentedString(localizedAspectValue)).append("\n");
        sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
        sb.append("    refinementHref: ").append(toIndentedString(refinementHref)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
