package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * A type that defines the pictogram for the type of hazard that a hazardous material represents.
 */
@Setter
@Schema(description = "A type that defines the pictogram for the type of hazard that a hazardous material represents.")
public class HazardPictogram {
    @SerializedName("pictogramDescription")
    private String pictogramDescription = null;

    @SerializedName("pictogramId")
    private String pictogramId = null;

    @SerializedName("pictogramUrl")
    private String pictogramUrl = null;

    public HazardPictogram pictogramDescription(String pictogramDescription) {
        this.pictogramDescription = pictogramDescription;
        return this;
    }

    /**
     * The description of the hazard pictogram, such as Flammable.
     *
     * @return pictogramDescription
     **/
    @Schema(description = "The description of the hazard pictogram, such as Flammable.")
    public String getPictogramDescription() {
        return pictogramDescription;
    }

    public HazardPictogram pictogramId(String pictogramId) {
        this.pictogramId = pictogramId;
        return this;
    }

    /**
     * The ID of the hazard pictogram.
     *
     * @return pictogramId
     **/
    @Schema(description = "The ID of the hazard pictogram.")
    public String getPictogramId() {
        return pictogramId;
    }

    public HazardPictogram pictogramUrl(String pictogramUrl) {
        this.pictogramUrl = pictogramUrl;
        return this;
    }

    /**
     * The URL of the hazard pictogram.
     *
     * @return pictogramUrl
     **/
    @Schema(description = "The URL of the hazard pictogram.")
    public String getPictogramUrl() {
        return pictogramUrl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HazardPictogram hazardPictogram = (HazardPictogram) o;
        return Objects.equals(this.pictogramDescription, hazardPictogram.pictogramDescription) &&
                Objects.equals(this.pictogramId, hazardPictogram.pictogramId) &&
                Objects.equals(this.pictogramUrl, hazardPictogram.pictogramUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pictogramDescription, pictogramId, pictogramUrl);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HazardPictogram {\n");
        sb.append("    pictogramDescription: ").append(toIndentedString(pictogramDescription)).append("\n");
        sb.append("    pictogramId: ").append(toIndentedString(pictogramId)).append("\n");
        sb.append("    pictogramUrl: ").append(toIndentedString(pictogramUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
