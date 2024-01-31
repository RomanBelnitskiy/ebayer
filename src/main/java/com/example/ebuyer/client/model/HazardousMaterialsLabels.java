package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * A type that defines the hazardous materials labels for an item.
 */
@Setter
@Schema(description = "A type that defines the hazardous materials labels for an item.")
public class HazardousMaterialsLabels {
    @SerializedName("additionalInformation")
    private String additionalInformation = null;

    @SerializedName("pictograms")
    private List<HazardPictogram> pictograms = null;

    @SerializedName("signalWord")
    private String signalWord = null;

    @SerializedName("signalWordId")
    private String signalWordId = null;

    @SerializedName("statements")
    private List<HazardStatement> statements = null;

    public HazardousMaterialsLabels additionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * Additional information about the hazardous materials labels.
     *
     * @return additionalInformation
     **/
    @Schema(description = "Additional information about the hazardous materials labels.")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public HazardousMaterialsLabels pictograms(List<HazardPictogram> pictograms) {
        this.pictograms = pictograms;
        return this;
    }

    public HazardousMaterialsLabels addPictogramsItem(HazardPictogram pictogramsItem) {
        if (this.pictograms == null) {
            this.pictograms = new ArrayList<>();
        }
        this.pictograms.add(pictogramsItem);
        return this;
    }

    /**
     * An array of hazard pictograms that apply to the item.
     *
     * @return pictograms
     **/
    @Schema(description = "An array of hazard pictograms that apply to the item.")
    public List<HazardPictogram> getPictograms() {
        return pictograms;
    }

    public HazardousMaterialsLabels signalWord(String signalWord) {
        this.signalWord = signalWord;
        return this;
    }

    /**
     * The signal word for the hazardous materials label (such as Danger or Warning).
     *
     * @return signalWord
     **/
    @Schema(description = "The signal word for the hazardous materials label (such as Danger or Warning).")
    public String getSignalWord() {
        return signalWord;
    }

    public HazardousMaterialsLabels signalWordId(String signalWordId) {
        this.signalWordId = signalWordId;
        return this;
    }

    /**
     * The ID of the signal word for the hazardous materials label.
     *
     * @return signalWordId
     **/
    @Schema(description = "The ID of the signal word for the hazardous materials label.")
    public String getSignalWordId() {
        return signalWordId;
    }

    public HazardousMaterialsLabels statements(List<HazardStatement> statements) {
        this.statements = statements;
        return this;
    }

    public HazardousMaterialsLabels addStatementsItem(HazardStatement statementsItem) {
        if (this.statements == null) {
            this.statements = new ArrayList<>();
        }
        this.statements.add(statementsItem);
        return this;
    }

    /**
     * An array of hazard statements for the item.
     *
     * @return statements
     **/
    @Schema(description = "An array of hazard statements for the item.")
    public List<HazardStatement> getStatements() {
        return statements;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HazardousMaterialsLabels hazardousMaterialsLabels = (HazardousMaterialsLabels) o;
        return Objects.equals(this.additionalInformation, hazardousMaterialsLabels.additionalInformation) &&
                Objects.equals(this.pictograms, hazardousMaterialsLabels.pictograms) &&
                Objects.equals(this.signalWord, hazardousMaterialsLabels.signalWord) &&
                Objects.equals(this.signalWordId, hazardousMaterialsLabels.signalWordId) &&
                Objects.equals(this.statements, hazardousMaterialsLabels.statements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInformation, pictograms, signalWord, signalWordId, statements);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HazardousMaterialsLabels {\n");
        sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
        sb.append("    pictograms: ").append(toIndentedString(pictograms)).append("\n");
        sb.append("    signalWord: ").append(toIndentedString(signalWord)).append("\n");
        sb.append("    signalWordId: ").append(toIndentedString(signalWordId)).append("\n");
        sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
