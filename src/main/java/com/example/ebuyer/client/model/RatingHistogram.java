package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for product ratings. Only products that are in the eBay product
 * catalog can be reviewed and rated.
 */
@Setter
@Schema(description = "The type that defines the fields for product ratings. Only products that " +
        "are in the eBay product catalog can be reviewed and rated.")
public class RatingHistogram {
    @SerializedName("count")
    private Integer count = null;

    @SerializedName("rating")
    private String rating = null;

    public RatingHistogram count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * The total number of user ratings that the product has received.
     *
     * @return count
     **/
    @Schema(description = "The total number of user ratings that the product has received.")
    public Integer getCount() {
        return count;
    }

    public RatingHistogram rating(String rating) {
        this.rating = rating;
        return this;
    }

    /**
     * This is the average rating for the product. As part of a product review, users rate the product.
     * Products are rated from one star (terrible) to five stars (excellent), with each star having
     * a corresponding point value - one star gets 1 point, two stars get 2 points, and so on.
     * If a product had one four-star rating and one five-star rating, its average rating would be
     * <code> 4.5</code>, and this is the value that would appear in this field.
     *
     * @return rating
     **/
    @Schema(description = "This is the average rating for the product. As part of a product review, " +
            "users rate the product. Products are rated from one star (terrible) to five stars (excellent), " +
            "with each star having a corresponding point value - one star gets 1 point, two stars get 2 points, " +
            "and so on. If a product had one four-star rating and one five-star rating, its average rating " +
            "would be <code> 4.5</code>, and this is the value that would appear in this field.")
    public String getRating() {
        return rating;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RatingHistogram ratingHistogram = (RatingHistogram) o;
        return Objects.equals(this.count, ratingHistogram.count) &&
                Objects.equals(this.rating, ratingHistogram.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, rating);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RatingHistogram {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
