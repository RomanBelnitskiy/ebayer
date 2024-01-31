package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the image information.
 */
@Setter
@Schema(description = "The type that defines the fields for the image information.")
public class SearchByImageRequest {
    @SerializedName("image")
    private String image = null;

    public SearchByImageRequest image(String image) {
        this.image = image;
        return this;
    }

    /**
     * The Base64 string of the image.
     *
     * @return image
     **/
    @Schema(description = "The Base64 string of the image.")
    public String getImage() {
        return image;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchByImageRequest searchByImageRequest = (SearchByImageRequest) o;
        return Objects.equals(this.image, searchByImageRequest.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchByImageRequest {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
