package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The container that defines the fields for the conditions refinements. This container is returned
 * when <b> fieldgroups</b> is set to <code>CONDITION_REFINEMENTS</code> or <code>FULL</code> in the request.
 */
@Setter
@Schema(description = "The container that defines the fields for the conditions refinements. This container " +
        "is returned when <b> fieldgroups</b> is set to <code>CONDITION_REFINEMENTS</code> or <code>FULL</code> " +
        "in the request.")
public class ConditionDistribution {
    @SerializedName("condition")
    private String condition = null;

    @SerializedName("conditionId")
    private String conditionId = null;

    @SerializedName("matchCount")
    private Integer matchCount = null;

    @SerializedName("refinementHref")
    private String refinementHref = null;

    public ConditionDistribution condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * The text describing the condition of the item, such as New or Used. For a list of condition names,
     * see <a href="/devzone/finding/callref/enums/conditionIdList.html " target="_blank">Item Condition IDs and Names</a>.
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return condition
     **/
    @Schema(description = "The text describing the condition of the item, such as New or Used. For a list " +
            "of condition names, see " +
            "<a href=\"/devzone/finding/callref/enums/conditionIdList.html \" target=\"_blank\">Item Condition IDs and Names</a>.  " +
            "<br><br>Code so that your app gracefully handles any future changes to this list.")
    public String getCondition() {
        return condition;
    }

    public ConditionDistribution conditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    /**
     * The identifier of the condition. For example, 1000 is the identifier for NEW.
     *
     * @return conditionId
     **/
    @Schema(description = "The identifier of the condition. For example, 1000 is the identifier for NEW.")
    public String getConditionId() {
        return conditionId;
    }

    public ConditionDistribution matchCount(Integer matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    /**
     * The number of items having the condition.
     *
     * @return matchCount
     **/
    @Schema(description = "The number of items having the condition.")
    public Integer getMatchCount() {
        return matchCount;
    }

    public ConditionDistribution refinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
        return this;
    }

    /**
     * The HATEOAS reference of this condition.
     *
     * @return refinementHref
     **/
    @Schema(description = "The HATEOAS reference of this condition.")
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
        ConditionDistribution conditionDistribution = (ConditionDistribution) o;
        return Objects.equals(this.condition, conditionDistribution.condition) &&
                Objects.equals(this.conditionId, conditionDistribution.conditionId) &&
                Objects.equals(this.matchCount, conditionDistribution.matchCount) &&
                Objects.equals(this.refinementHref, conditionDistribution.refinementHref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, conditionId, matchCount, refinementHref);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionDistribution {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
        sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
        sb.append("    refinementHref: ").append(toIndentedString(refinementHref)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
