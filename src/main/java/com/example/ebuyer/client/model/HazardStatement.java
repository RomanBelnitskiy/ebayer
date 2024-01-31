package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * A type that defines the hazard statement for a hazardous material.
 */
@Setter
@Schema(description = "A type that defines the hazard statement for a hazardous material.")
public class HazardStatement {
    @SerializedName("statementDescription")
    private String statementDescription = null;

    @SerializedName("statementId")
    private String statementId = null;

    public HazardStatement statementDescription(String statementDescription) {
        this.statementDescription = statementDescription;
        return this;
    }

    /**
     * A description of the nature of the hazard, such as whether the material is toxic if swallowed.
     *
     * @return statementDescription
     **/
    @Schema(description = "A description of the nature of the hazard, such as whether the material " +
            "is toxic if swallowed.")
    public String getStatementDescription() {
        return statementDescription;
    }

    public HazardStatement statementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * The ID of the hazard statement.
     *
     * @return statementId
     **/
    @Schema(description = "The ID of the hazard statement.")
    public String getStatementId() {
        return statementId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HazardStatement hazardStatement = (HazardStatement) o;
        return Objects.equals(this.statementDescription, hazardStatement.statementDescription) &&
                Objects.equals(this.statementId, hazardStatement.statementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statementDescription, statementId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HazardStatement {\n");
        sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
