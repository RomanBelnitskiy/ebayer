package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that define the fields for the aspect information. Aspects are the variations of
 * an item, such as color, size, etc.
 */
@Setter
@Schema(description = "The type that define the fields for the aspect information. Aspects are " +
        "the variations of an item, such as color, size, etc.")
public class AspectDistribution {
    @SerializedName("aspectValueDistributions")
    private List<AspectValueDistribution> aspectValueDistributions = null;

    @SerializedName("localizedAspectName")
    private String localizedAspectName = null;

    public AspectDistribution aspectValueDistributions(List<AspectValueDistribution> aspectValueDistributions) {
        this.aspectValueDistributions = aspectValueDistributions;
        return this;
    }

    public AspectDistribution addAspectValueDistributionsItem(AspectValueDistribution aspectValueDistributionsItem) {
        if (this.aspectValueDistributions == null) {
            this.aspectValueDistributions = new ArrayList<>();
        }
        this.aspectValueDistributions.add(aspectValueDistributionsItem);
        return this;
    }

    /**
     * An array of containers for the various values of the aspect and the match count and a HATEOAS reference
     * (<b> refinementHref</b>) for this aspect.
     *
     * @return aspectValueDistributions
     **/
    @Schema(description = "An array of containers for the various values of the aspect and the match count and " +
            "a HATEOAS reference (<b> refinementHref</b>) for this aspect.")
    public List<AspectValueDistribution> getAspectValueDistributions() {
        return aspectValueDistributions;
    }

    public AspectDistribution localizedAspectName(String localizedAspectName) {
        this.localizedAspectName = localizedAspectName;
        return this;
    }

    /**
     * The name of an aspect, such as Brand, Color, etc.
     *
     * @return localizedAspectName
     **/
    @Schema(description = "The name of an aspect, such as Brand, Color, etc.")
    public String getLocalizedAspectName() {
        return localizedAspectName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AspectDistribution aspectDistribution = (AspectDistribution) o;
        return Objects.equals(this.aspectValueDistributions, aspectDistribution.aspectValueDistributions) &&
                Objects.equals(this.localizedAspectName, aspectDistribution.localizedAspectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aspectValueDistributions, localizedAspectName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AspectDistribution {\n");
        sb.append("    aspectValueDistributions: ").append(toIndentedString(aspectValueDistributions)).append("\n");
        sb.append("    localizedAspectName: ").append(toIndentedString(localizedAspectName)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
