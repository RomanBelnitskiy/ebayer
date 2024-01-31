package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * Type the defines the details of an image, such as size and image URL. Currently,  only <b> imageUrl</b>
 * is  populated. The <b> height</b> and <b> width</b> were added for future use.
 */
@Setter
@Schema(description = "Type the defines the details of an image, such as size and image URL. Currently, " +
        "only <b> imageUrl</b> is  populated. The <b> height</b> and <b> width</b> were added for future use.")
public class Image {
    @SerializedName("height")
    private Integer height = null;

    @SerializedName("imageUrl")
    private String imageUrl = null;

    @SerializedName("width")
    private Integer width = null;

    public Image height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return height
     **/
    @Schema(description = "Reserved for future use. ")
    public Integer getHeight() {
        return height;
    }

    public Image imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * The URL of the image.
     *
     * @return imageUrl
     **/
    @Schema(description = "The URL of the image.")
    public String getImageUrl() {
        return imageUrl;
    }

    public Image width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return width
     **/
    @Schema(description = "Reserved for future use. ")
    public Integer getWidth() {
        return width;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image image = (Image) o;
        return Objects.equals(this.height, image.height) &&
                Objects.equals(this.imageUrl, image.imageUrl) &&
                Objects.equals(this.width, image.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, imageUrl, width);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
