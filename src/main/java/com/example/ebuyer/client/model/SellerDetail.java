package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for basic and detailed information about the seller of
 * the item returned by the <b> item</b> resource.
 */
@Setter
@Schema(description = "The type that defines the fields for basic and detailed information about " +
        "the seller of the item returned by the <b> item</b> resource.")
public class SellerDetail {
    @SerializedName("feedbackPercentage")
    private String feedbackPercentage = null;

    @SerializedName("feedbackScore")
    private Integer feedbackScore = null;

    @SerializedName("sellerAccountType")
    private String sellerAccountType = null;

    @SerializedName("sellerLegalInfo")
    private SellerLegalInfo sellerLegalInfo = null;

    @SerializedName("userId")
    private String userId = null;

    @SerializedName("username")
    private String username = null;

    public SellerDetail feedbackPercentage(String feedbackPercentage) {
        this.feedbackPercentage = feedbackPercentage;
        return this;
    }

    /**
     * The percentage of the total positive feedback.
     *
     * @return feedbackPercentage
     **/
    @Schema(description = "The percentage of the total positive feedback.")
    public String getFeedbackPercentage() {
        return feedbackPercentage;
    }

    public SellerDetail feedbackScore(Integer feedbackScore) {
        this.feedbackScore = feedbackScore;
        return this;
    }

    /**
     * The feedback score of the seller. This value is based on the ratings from eBay members that bought
     * items from this seller.
     *
     * @return feedbackScore
     **/
    @Schema(description = "The feedback score of the seller. This value is based on the ratings from " +
            "eBay members that bought items from this seller.")
    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    public SellerDetail sellerAccountType(String sellerAccountType) {
        this.sellerAccountType = sellerAccountType;
        return this;
    }

    /**
     * This indicates if the seller is a business or an individual. This is determined when the seller
     * registers with eBay. If they register for a business account, this value will be BUSINESS.
     * If they register for a private account, this value will be INDIVIDUAL. This designation is
     * required by the tax laws in the following countries:  <br><br> This field is returned only on
     * the following sites. <br><br>EBAY_AT, EBAY_BE, EBAY_CH, EBAY_DE, EBAY_ES, EBAY_FR, EBAY_GB,
     * EBAY_IE, EBAY_IT, EBAY_PL <br><br><b> Valid Values:</b> BUSINESS or INDIVIDUAL
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return sellerAccountType
     **/
    @Schema(description = "This indicates if the seller is a business or an individual. This is determined " +
            "when the seller registers with eBay. If they register for a business account, this value will " +
            "be BUSINESS. If they register for a private account, this value will be INDIVIDUAL. " +
            "This designation is required by the tax laws in the following countries:  " +
            "<br><br> This field is returned only on the following sites. " +
            "<br><br>EBAY_AT, EBAY_BE, EBAY_CH, EBAY_DE, EBAY_ES, EBAY_FR, EBAY_GB, EBAY_IE, EBAY_IT, EBAY_PL " +
            "<br><br><b> Valid Values:</b> BUSINESS or INDIVIDUAL <br><br>Code so that your app " +
            "gracefully handles any future changes to this list. ")
    public String getSellerAccountType() {
        return sellerAccountType;
    }

    public SellerDetail sellerLegalInfo(SellerLegalInfo sellerLegalInfo) {
        this.sellerLegalInfo = sellerLegalInfo;
        return this;
    }

    /**
     * Get sellerLegalInfo
     *
     * @return sellerLegalInfo
     **/
    @Schema(description = "")
    public SellerLegalInfo getSellerLegalInfo() {
        return sellerLegalInfo;
    }

    public SellerDetail userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * The unique identifier of an eBay user across all eBay sites. This value does not change,
     * even when a user changes their username.
     *
     * @return userId
     **/
    @Schema(description = "The unique identifier of an eBay user across all eBay sites. " +
            "This value does not change, even when a user changes their username.")
    public String getUserId() {
        return userId;
    }

    public SellerDetail username(String username) {
        this.username = username;
        return this;
    }

    /**
     * The user name created by the seller for use on eBay.
     *
     * @return username
     **/
    @Schema(description = "The user name created by the seller for use on eBay.")
    public String getUsername() {
        return username;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellerDetail sellerDetail = (SellerDetail) o;
        return Objects.equals(this.feedbackPercentage, sellerDetail.feedbackPercentage) &&
                Objects.equals(this.feedbackScore, sellerDetail.feedbackScore) &&
                Objects.equals(this.sellerAccountType, sellerDetail.sellerAccountType) &&
                Objects.equals(this.sellerLegalInfo, sellerDetail.sellerLegalInfo) &&
                Objects.equals(this.userId, sellerDetail.userId) &&
                Objects.equals(this.username, sellerDetail.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackPercentage, feedbackScore, sellerAccountType, sellerLegalInfo, userId, username);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerDetail {\n");
        sb.append("    feedbackPercentage: ").append(toIndentedString(feedbackPercentage)).append("\n");
        sb.append("    feedbackScore: ").append(toIndentedString(feedbackScore)).append("\n");
        sb.append("    sellerAccountType: ").append(toIndentedString(sellerAccountType)).append("\n");
        sb.append("    sellerLegalInfo: ").append(toIndentedString(sellerLegalInfo)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
