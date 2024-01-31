package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The container that defines the fields for the buying options refinements. This container is
 * returned when <b> fieldgroups</b> is set to <code>BUYING_OPTION_REFINEMENTS</code> or <code>FULL</code>
 * in the request.
 */
@Setter
@Schema(description = "The container that defines the fields for the buying options refinements. " +
        "This container is returned when <b> fieldgroups</b> is set to <code>BUYING_OPTION_REFINEMENTS</code> " +
        "or <code>FULL</code> in the request.")
public class BuyingOptionDistribution {
    @SerializedName("buyingOption")
    private String buyingOption = null;

    @SerializedName("matchCount")
    private Integer matchCount = null;

    @SerializedName("refinementHref")
    private String refinementHref = null;

    public BuyingOptionDistribution buyingOption(String buyingOption) {
        this.buyingOption = buyingOption;
        return this;
    }

    /**
     * The container that returns the buying option type. This will be AUCTION, FIXED_PRICE, CLASSIFIED_AD,
     * or a combination of these options. For details, see
     * <a href="/api-docs/buy/browse/resources/item_summary/methods/search#response.itemSummaries.buyingOptions">buyingOptions</a>.
     *
     * @return buyingOption
     **/
    @Schema(description = "The container that returns the buying option type. This will be AUCTION, FIXED_PRICE, " +
            "CLASSIFIED_AD, or a combination of these options. For details, see " +
            "<a href=\"/api-docs/buy/browse/resources/item_summary/methods/search#response.itemSummaries.buyingOptions\">buyingOptions</a>.")
    public String getBuyingOption() {
        return buyingOption;
    }

    public BuyingOptionDistribution matchCount(Integer matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    /**
     * The number of items having this buying option.
     *
     * @return matchCount
     **/
    @Schema(description = "The number of items having this buying option.")
    public Integer getMatchCount() {
        return matchCount;
    }

    public BuyingOptionDistribution refinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
        return this;
    }

    /**
     * The HATEOAS reference for this buying option.
     *
     * @return refinementHref
     **/
    @Schema(description = "The HATEOAS reference for this buying option.")
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
        BuyingOptionDistribution buyingOptionDistribution = (BuyingOptionDistribution) o;
        return Objects.equals(this.buyingOption, buyingOptionDistribution.buyingOption) &&
                Objects.equals(this.matchCount, buyingOptionDistribution.matchCount) &&
                Objects.equals(this.refinementHref, buyingOptionDistribution.refinementHref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyingOption, matchCount, refinementHref);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuyingOptionDistribution {\n");
        sb.append("    buyingOption: ").append(toIndentedString(buyingOption)).append("\n");
        sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
        sb.append("    refinementHref: ").append(toIndentedString(refinementHref)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
