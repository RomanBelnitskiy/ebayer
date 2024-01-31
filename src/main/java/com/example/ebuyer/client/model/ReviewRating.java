package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the rating of a product review.
 */
@Setter
@Schema(description = "The type that defines the fields for the rating of a product review.")
public class ReviewRating {
    @SerializedName("averageRating")
    private String averageRating = null;

    @SerializedName("ratingHistograms")
    private List<RatingHistogram> ratingHistograms = null;

    @SerializedName("reviewCount")
    private Integer reviewCount = null;

    public ReviewRating averageRating(String averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    /**
     * The average rating given to a product based on customer reviews.
     *
     * @return averageRating
     **/
    @Schema(description = "The average rating given to a product based on customer reviews.")
    public String getAverageRating() {
        return averageRating;
    }

    public ReviewRating ratingHistograms(List<RatingHistogram> ratingHistograms) {
        this.ratingHistograms = ratingHistograms;
        return this;
    }

    public ReviewRating addRatingHistogramsItem(RatingHistogram ratingHistogramsItem) {
        if (this.ratingHistograms == null) {
            this.ratingHistograms = new ArrayList<>();
        }
        this.ratingHistograms.add(ratingHistogramsItem);
        return this;
    }

    /**
     * An array of containers for the product rating histograms that shows the review counts and the product rating.
     *
     * @return ratingHistograms
     **/
    @Schema(description = "An array of containers for the product rating histograms that shows the review " +
            "counts and the product rating.")
    public List<RatingHistogram> getRatingHistograms() {
        return ratingHistograms;
    }

    public ReviewRating reviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
        return this;
    }

    /**
     * The total number of reviews for the item.
     *
     * @return reviewCount
     **/
    @Schema(description = "The total number of reviews for the item.")
    public Integer getReviewCount() {
        return reviewCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReviewRating reviewRating = (ReviewRating) o;
        return Objects.equals(this.averageRating, reviewRating.averageRating) &&
                Objects.equals(this.ratingHistograms, reviewRating.ratingHistograms) &&
                Objects.equals(this.reviewCount, reviewRating.reviewCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageRating, ratingHistograms, reviewCount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewRating {\n");
        sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
        sb.append("    ratingHistograms: ").append(toIndentedString(ratingHistograms)).append("\n");
        sb.append("    reviewCount: ").append(toIndentedString(reviewCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
