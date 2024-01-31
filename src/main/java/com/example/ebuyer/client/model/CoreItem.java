package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * An array of containers with the details for all of the items returned.
 */
@Setter
@Schema(description = "An array of containers with the details for all of the items returned.")
public class CoreItem {
    @SerializedName("additionalImages")
    private List<Image> additionalImages = null;

    @SerializedName("adultOnly")
    private Boolean adultOnly = null;

    @SerializedName("ageGroup")
    private String ageGroup = null;

    @SerializedName("authenticityGuarantee")
    private AuthenticityGuaranteeProgram authenticityGuarantee = null;

    @SerializedName("authenticityVerification")
    private AuthenticityVerificationProgram authenticityVerification = null;

    @SerializedName("availableCoupons")
    private List<AvailableCoupon> availableCoupons = null;

    @SerializedName("bidCount")
    private Integer bidCount = null;

    @SerializedName("brand")
    private String brand = null;

    @SerializedName("buyingOptions")
    private List<String> buyingOptions = null;

    @SerializedName("categoryId")
    private String categoryId = null;

    @SerializedName("categoryPath")
    private String categoryPath = null;

    @SerializedName("color")
    private String color = null;

    @SerializedName("condition")
    private String condition = null;

    @SerializedName("conditionDescription")
    private String conditionDescription = null;

    @SerializedName("conditionId")
    private String conditionId = null;

    @SerializedName("currentBidPrice")
    private ConvertedAmount currentBidPrice = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("eligibleForInlineCheckout")
    private Boolean eligibleForInlineCheckout = null;

    @SerializedName("enabledForGuestCheckout")
    private Boolean enabledForGuestCheckout = null;

    @SerializedName("energyEfficiencyClass")
    private String energyEfficiencyClass = null;

    @SerializedName("epid")
    private String epid = null;

    @SerializedName("estimatedAvailabilities")
    private List<EstimatedAvailability> estimatedAvailabilities = null;

    @SerializedName("gender")
    private String gender = null;

    @SerializedName("gtin")
    private String gtin = null;

    @SerializedName("image")
    private Image image = null;

    @SerializedName("inferredEpid")
    private String inferredEpid = null;

    @SerializedName("itemAffiliateWebUrl")
    private String itemAffiliateWebUrl = null;

    @SerializedName("itemCreationDate")
    private String itemCreationDate = null;

    @SerializedName("itemEndDate")
    private String itemEndDate = null;

    @SerializedName("itemId")
    private String itemId = null;

    @SerializedName("itemLocation")
    private Address itemLocation = null;

    @SerializedName("itemWebUrl")
    private String itemWebUrl = null;

    @SerializedName("legacyItemId")
    private String legacyItemId = null;

    @SerializedName("localizedAspects")
    private List<TypedNameValue> localizedAspects = null;

    @SerializedName("lotSize")
    private Integer lotSize = null;

    @SerializedName("marketingPrice")
    private MarketingPrice marketingPrice = null;

    @SerializedName("material")
    private String material = null;

    @SerializedName("minimumPriceToBid")
    private ConvertedAmount minimumPriceToBid = null;

    @SerializedName("mpn")
    private String mpn = null;

    @SerializedName("pattern")
    private String pattern = null;

    @SerializedName("paymentMethods")
    private List<PaymentMethod> paymentMethods = null;

    @SerializedName("price")
    private ConvertedAmount price = null;

    @SerializedName("priceDisplayCondition")
    private String priceDisplayCondition = null;

    @SerializedName("primaryItemGroup")
    private ItemGroupSummary primaryItemGroup = null;

    @SerializedName("primaryProductReviewRating")
    private ReviewRating primaryProductReviewRating = null;

    @SerializedName("priorityListing")
    private Boolean priorityListing = null;

    @SerializedName("product")
    private Product product = null;

    @SerializedName("productFicheWebUrl")
    private String productFicheWebUrl = null;

    @SerializedName("qualifiedPrograms")
    private List<String> qualifiedPrograms = null;

    @SerializedName("quantityLimitPerBuyer")
    private Integer quantityLimitPerBuyer = null;

    @SerializedName("reservePriceMet")
    private Boolean reservePriceMet = null;

    @SerializedName("returnTerms")
    private ItemReturnTerms returnTerms = null;

    @SerializedName("seller")
    private SellerDetail seller = null;

    @SerializedName("sellerItemRevision")
    private String sellerItemRevision = null;

    @SerializedName("shippingOptions")
    private List<ShippingOption> shippingOptions = null;

    @SerializedName("shipToLocations")
    private ShipToLocations shipToLocations = null;

    @SerializedName("shortDescription")
    private String shortDescription = null;

    @SerializedName("size")
    private String size = null;

    @SerializedName("sizeSystem")
    private String sizeSystem = null;

    @SerializedName("sizeType")
    private String sizeType = null;

    @SerializedName("subtitle")
    private String subtitle = null;

    @SerializedName("taxes")
    private List<Taxes> taxes = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("topRatedBuyingExperience")
    private Boolean topRatedBuyingExperience = null;

    @SerializedName("tyreLabelImageUrl")
    private String tyreLabelImageUrl = null;

    @SerializedName("uniqueBidderCount")
    private Integer uniqueBidderCount = null;

    @SerializedName("unitPrice")
    private ConvertedAmount unitPrice = null;

    @SerializedName("unitPricingMeasure")
    private String unitPricingMeasure = null;

    public CoreItem additionalImages(List<Image> additionalImages) {
        this.additionalImages = additionalImages;
        return this;
    }

    public CoreItem addAdditionalImagesItem(Image additionalImagesItem) {
        if (this.additionalImages == null) {
            this.additionalImages = new ArrayList<>();
        }
        this.additionalImages.add(additionalImagesItem);
        return this;
    }

    /**
     * An array of containers with the URLs for the images that are in addition to the primary image.
     * The primary image is returned in the <b> image.imageUrl</b> field.
     *
     * @return additionalImages
     **/
    @Schema(description = "An array of containers with the URLs for the images that are in addition to " +
            "the primary image.  The primary image is returned in the <b> image.imageUrl</b> field.")
    public List<Image> getAdditionalImages() {
        return additionalImages;
    }

    public CoreItem adultOnly(Boolean adultOnly) {
        this.adultOnly = adultOnly;
        return this;
    }

    /**
     * This indicates if the item is for  adults only. For more information about adult-only items on eBay,
     * see <a href="https://pages.ebay.com/help/policies/adult-only.html " target="_blank">Adult items policy</a>
     * for sellers and <a href="https://www.ebay.com/help/terms-conditions/default/searching-adult-items?id=4661 " target="_blank">Adult-Only items on eBay</a>
     * for buyers.
     *
     * @return adultOnly
     **/
    @Schema(description = "This indicates if the item is for  adults only. For more information about adult-only " +
            "items on eBay, see " +
            "<a href=\"https://pages.ebay.com/help/policies/adult-only.html \" target=\"_blank\">Adult items policy</a> " +
            "for sellers and " +
            "<a href=\"https://www.ebay.com/help/terms-conditions/default/searching-adult-items?id=4661 \" target=\"_blank\">Adult-Only items on eBay</a> " +
            "for buyers.")
    public Boolean isAdultOnly() {
        return adultOnly;
    }

    public CoreItem ageGroup(String ageGroup) {
        this.ageGroup = ageGroup;
        return this;
    }

    /**
     * (Primary Item Aspect) The age group for which the product is recommended. For example, newborn,
     * infant, toddler, kids, adult, etc. All the item aspects, including this aspect, are returned in
     * the <b> localizedAspects</b> container.
     *
     * @return ageGroup
     **/
    @Schema(description = "(Primary Item Aspect) The age group for which the product is recommended. " +
            "For example, newborn, infant, toddler, kids, adult, etc. All the item aspects, including " +
            "this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getAgeGroup() {
        return ageGroup;
    }

    public CoreItem authenticityGuarantee(AuthenticityGuaranteeProgram authenticityGuarantee) {
        this.authenticityGuarantee = authenticityGuarantee;
        return this;
    }

    /**
     * Get authenticityGuarantee
     *
     * @return authenticityGuarantee
     **/
    @Schema(description = "")
    public AuthenticityGuaranteeProgram getAuthenticityGuarantee() {
        return authenticityGuarantee;
    }

    public CoreItem authenticityVerification(AuthenticityVerificationProgram authenticityVerification) {
        this.authenticityVerification = authenticityVerification;
        return this;
    }

    /**
     * Get authenticityVerification
     *
     * @return authenticityVerification
     **/
    @Schema(description = "")
    public AuthenticityVerificationProgram getAuthenticityVerification() {
        return authenticityVerification;
    }

    public CoreItem availableCoupons(List<AvailableCoupon> availableCoupons) {
        this.availableCoupons = availableCoupons;
        return this;
    }

    public CoreItem addAvailableCouponsItem(AvailableCoupon availableCouponsItem) {
        if (this.availableCoupons == null) {
            this.availableCoupons = new ArrayList<>();
        }
        this.availableCoupons.add(availableCouponsItem);
        return this;
    }

    /**
     * A list of available coupons for the item.
     *
     * @return availableCoupons
     **/
    @Schema(description = "A list of available coupons for the item.")
    public List<AvailableCoupon> getAvailableCoupons() {
        return availableCoupons;
    }

    public CoreItem bidCount(Integer bidCount) {
        this.bidCount = bidCount;
        return this;
    }

    /**
     * This integer value indicates the total number of bids that have been placed against
     * an auction item. This field is returned only for auction items.
     *
     * @return bidCount
     **/
    @Schema(description = "This integer value indicates the total number of bids that have been placed " +
            "against an auction item. This field is returned only for auction items.")
    public Integer getBidCount() {
        return bidCount;
    }

    public CoreItem brand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * (Primary Item Aspect) The name brand of the item, such as Nike, Apple, etc.  All the item aspects,
     * including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return brand
     **/
    @Schema(description = "(Primary Item Aspect) The name brand of the item, such as Nike, Apple, etc.  " +
            "All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getBrand() {
        return brand;
    }

    public CoreItem buyingOptions(List<String> buyingOptions) {
        this.buyingOptions = buyingOptions;
        return this;
    }

    public CoreItem addBuyingOptionsItem(String buyingOptionsItem) {
        if (this.buyingOptions == null) {
            this.buyingOptions = new ArrayList<>();
        }
        this.buyingOptions.add(buyingOptionsItem);
        return this;
    }

    /**
     * A comma separated list of all the purchase options available for the item. The values returned are:
     * <ul><li><code>FIXED_PRICE</code> - Indicates the buyer can purchase the item for a set price using
     * the Buy It Now button.</li><li><code>AUCTION</code> - Indicates the buyer can place a bid for
     * the item. After the first bid is placed, this becomes a live auction item and is the only buying
     * option for this item.</li><li><code>BEST_OFFER</code> - Indicates the buyer can send the seller
     * a price they're willing to pay for the item. The seller can accept, reject, or send a counter offer.
     * For more information on how this works, see
     * <a href="https://www.ebay.com/help/buying/buy-now/making-best-offer?id=4019 ">Making a Best Offer</a>.
     * </li><li><code>CLASSIFIED_AD</code> - Indicates that the final sales transaction is to be completed
     * outside of the eBay environment.</li></ul>Code so that your app gracefully handles any future changes
     * to this list.
     *
     * @return buyingOptions
     **/
    @Schema(description = "A comma separated list of all the purchase options available for the item. " +
            "The values returned are:<ul><li><code>FIXED_PRICE</code> - Indicates the buyer can purchase " +
            "the item for a set price using the Buy It Now button.</li><li><code>AUCTION</code> - Indicates " +
            "the buyer can place a bid for the item. After the first bid is placed, this becomes a live " +
            "auction item and is the only buying option for this item.</li><li><code>BEST_OFFER</code> - " +
            "Indicates the buyer can send the seller a price they're willing to pay for the item. The seller " +
            "can accept, reject, or send a counter offer. For more information on how this works, see " +
            "<a href=\"https://www.ebay.com/help/buying/buy-now/making-best-offer?id=4019 \">Making a Best Offer</a>." +
            "</li><li><code>CLASSIFIED_AD</code> - Indicates that the final sales transaction is to be completed " +
            "outside of the eBay environment.</li></ul>Code so that your app gracefully handles any future " +
            "changes to this list.")
    public List<String> getBuyingOptions() {
        return buyingOptions;
    }

    public CoreItem categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * The ID of the leaf category for this item. A leaf category is the lowest level in that category
     * and has no children.
     *
     * @return categoryId
     **/
    @Schema(description = "The ID of the leaf category for this item. A leaf category is the lowest level " +
            "in that category and has no children.")
    public String getCategoryId() {
        return categoryId;
    }

    public CoreItem categoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
        return this;
    }

    /**
     * Text that shows the category hierarchy of the item. For example:
     * Computers/Tablets &amp; Networking, Laptops &amp; Netbooks, PC Laptops &amp; Netbooks
     *
     * @return categoryPath
     **/
    @Schema(description = "Text that shows the category hierarchy of the item. For example: " +
            "Computers/Tablets &amp; Networking, Laptops &amp; Netbooks, PC Laptops &amp; Netbooks")
    public String getCategoryPath() {
        return categoryPath;
    }

    public CoreItem color(String color) {
        this.color = color;
        return this;
    }

    /**
     * (Primary Item Aspect) Text describing the color of the item.  All the item aspects, including
     * this aspect, are returned in the <b> localizedAspects</b> container."
     *
     * @return color
     **/
    @Schema(description = "(Primary Item Aspect) Text describing the color of the item.  All the item " +
            "aspects, including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getColor() {
        return color;
    }

    public CoreItem condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * A short text description for the condition of the item, such as New or Used. For a list of
     * condition names, see
     * <a href="https://developer.ebay.com/devzone/finding/callref/enums/conditionIdList.html " target="_blank">Item Condition IDs and Names</a>.
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return condition
     **/
    @Schema(description = "A short text description for the condition of the item, such as New or Used. " +
            "For a list of condition names, see " +
            "<a href=\"https://developer.ebay.com/devzone/finding/callref/enums/conditionIdList.html \" target=\"_blank\">Item Condition IDs and Names</a>.  " +
            "<br><br>Code so that your app gracefully handles any future changes to this list.")
    public String getCondition() {
        return condition;
    }

    public CoreItem conditionDescription(String conditionDescription) {
        this.conditionDescription = conditionDescription;
        return this;
    }

    /**
     * A full text description for the condition of the item. This field elaborates on the value specified
     * in the <b>condition</b> field and provides full details for the condition of the item.
     *
     * @return conditionDescription
     **/
    @Schema(description = "A full text description for the condition of the item. This field elaborates " +
            "on the value specified in the <b>condition</b> field and provides full details for the condition " +
            "of the item.")
    public String getConditionDescription() {
        return conditionDescription;
    }

    public CoreItem conditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    /**
     * The identifier of the condition of the item. For example, 1000 is the identifier for NEW.
     * For a list of condition names and IDs, see
     * <a href="https://developer.ebay.com/devzone/finding/callref/enums/conditionIdList.html " target="_blank">Item Condition IDs and Names</a>.
     * <br><br>Code so that your app gracefully handles any future changes to this list.</span>
     *
     * @return conditionId
     **/
    @Schema(description = "The identifier of the condition of the item. For example, 1000 is the identifier for NEW. " +
            "For a list of condition names and IDs, see " +
            "<a href=\"https://developer.ebay.com/devzone/finding/callref/enums/conditionIdList.html \" target=\"_blank\">Item Condition IDs and Names</a>. " +
            "<br><br>Code so that your app gracefully handles any future changes to this list.</span>")
    public String getConditionId() {
        return conditionId;
    }

    public CoreItem currentBidPrice(ConvertedAmount currentBidPrice) {
        this.currentBidPrice = currentBidPrice;
        return this;
    }

    /**
     * Get currentBidPrice
     *
     * @return currentBidPrice
     **/
    @Schema(description = "")
    public ConvertedAmount getCurrentBidPrice() {
        return currentBidPrice;
    }

    public CoreItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The full description of the item that was created by the seller. This can be plain text or rich
     * content and can be very large.
     *
     * @return description
     **/
    @Schema(description = "The full description of the item that was created by the seller. This can " +
            "be plain text or rich content and can be very large.")
    public String getDescription() {
        return description;
    }

    public CoreItem eligibleForInlineCheckout(Boolean eligibleForInlineCheckout) {
        this.eligibleForInlineCheckout = eligibleForInlineCheckout;
        return this;
    }

    /**
     * This field indicates if the item can be purchased using the Buy
     * <a href="/api-docs/buy/order/resources/methods">Order API</a>.
     * <ul> <li>If the value of this field is <code>true</code>, this indicates that the item can
     * be purchased using the <b> Order API</b>. </li>  <li>If the value of this field is <code>false</code>,
     * this indicates that the item cannot be purchased using the <b> Order API</b> and must be purchased
     * on the eBay site.</li> </ul>
     *
     * @return eligibleForInlineCheckout
     **/
    @Schema(description = "This field indicates if the item can be purchased using the Buy " +
            "<a href=\"/api-docs/buy/order/resources/methods\">Order API</a>. " +
            "<ul> <li>If the value of this field is <code>true</code>, this indicates that the item " +
            "can be purchased using the <b> Order API</b>. </li>  <li>If the value of this field is " +
            "<code>false</code>, this indicates that the item cannot be purchased using the <b> Order API</b> " +
            "and must be purchased on the eBay site.</li> </ul>")
    public Boolean isEligibleForInlineCheckout() {
        return eligibleForInlineCheckout;
    }

    public CoreItem enabledForGuestCheckout(Boolean enabledForGuestCheckout) {
        this.enabledForGuestCheckout = enabledForGuestCheckout;
        return this;
    }

    /**
     * This indicates if the item can be purchased using Guest Checkout in the
     * <a href="/api-docs/buy/order/resources/methods">Order API</a>. You can use this flag to
     * exclude items from your inventory that are not eligible for Guest Checkout, such as gift cards.
     *
     * @return enabledForGuestCheckout
     **/
    @Schema(description = "This indicates if the item can be purchased using Guest Checkout in the " +
            "<a href=\"/api-docs/buy/order/resources/methods\">Order API</a>. You can use this flag " +
            "to exclude items from your inventory that are not eligible for Guest Checkout, such as gift cards.")
    public Boolean isEnabledForGuestCheckout() {
        return enabledForGuestCheckout;
    }

    public CoreItem energyEfficiencyClass(String energyEfficiencyClass) {
        this.energyEfficiencyClass = energyEfficiencyClass;
        return this;
    }

    /**
     * This indicates the <a href="https://en.wikipedia.org/wiki/European_Union_energy_label ">
     * European energy efficiency</a> rating (EEK) of the item. This field is returned only if
     * the seller specified the energy efficiency rating. <br><br>The rating is a set of energy
     * efficiency classes from A to G, where 'A' is the most energy efficient and 'G' is the least
     * efficient. This rating helps buyers choose between various models. <br><br>When the manufacturer's
     * specifications for this item are available, the link to this information is returned in the
     * <b>productFicheWebUrl</b> field.
     *
     * @return energyEfficiencyClass
     **/
    @Schema(description = "This indicates the " +
            "<a href=\"https://en.wikipedia.org/wiki/European_Union_energy_label \">European energy efficiency</a> " +
            "rating (EEK) of the item. This field is returned only if the seller specified the energy " +
            "efficiency rating. <br><br>The rating is a set of energy efficiency classes from A to G, " +
            "where 'A' is the most energy efficient and 'G' is the least efficient. This rating helps " +
            "buyers choose between various models. <br><br>When the manufacturer's specifications for " +
            "this item are available, the link to this information is returned in the <b>productFicheWebUrl</b> field.")
    public String getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    public CoreItem epid(String epid) {
        this.epid = epid;
        return this;
    }

    /**
     * An EPID is the eBay product identifier of a product from the eBay product catalog.
     * This indicates the product in which the item belongs.
     *
     * @return epid
     **/
    @Schema(description = "An EPID is the eBay product identifier of a product from the eBay product catalog.  " +
            "This indicates the product in which the item belongs.")
    public String getEpid() {
        return epid;
    }

    public CoreItem estimatedAvailabilities(List<EstimatedAvailability> estimatedAvailabilities) {
        this.estimatedAvailabilities = estimatedAvailabilities;
        return this;
    }

    public CoreItem addEstimatedAvailabilitiesItem(EstimatedAvailability estimatedAvailabilitiesItem) {
        if (this.estimatedAvailabilities == null) {
            this.estimatedAvailabilities = new ArrayList<>();
        }
        this.estimatedAvailabilities.add(estimatedAvailabilitiesItem);
        return this;
    }

    /**
     * The estimated number of this item that are available for purchase. Because the quantity of
     * an item can change several times within a second, it is impossible to return the exact
     * quantity. So instead of returning quantity, the estimated availability of the item is returned.
     *
     * @return estimatedAvailabilities
     **/
    @Schema(description = "The estimated number of this item that are available for purchase. " +
            "Because the quantity of an item can change several times within a second, it is " +
            "impossible to return the exact quantity. So instead of returning quantity, the estimated " +
            "availability of the item is returned.")
    public List<EstimatedAvailability> getEstimatedAvailabilities() {
        return estimatedAvailabilities;
    }

    public CoreItem gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * (Primary Item Aspect) The gender for the item. This is used for items that could vary by gender,
     * such as clothing. For example: male, female, or unisex. All the item aspects, including this
     * aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return gender
     **/
    @Schema(description = "(Primary Item Aspect) The gender for the item. This is used for items that " +
            "could vary by gender, such as clothing. For example: male, female, or unisex. All the item " +
            "aspects, including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getGender() {
        return gender;
    }

    public CoreItem gtin(String gtin) {
        this.gtin = gtin;
        return this;
    }

    /**
     * The unique Global Trade Item number of the item as defined by
     * <a href="https://www.gtin.info " target="_blank">https://www.gtin.info</a>.
     * This can be a UPC (Universal Product Code), EAN (European Article Number), or
     * an ISBN (International Standard Book Number) value.
     *
     * @return gtin
     **/
    @Schema(description = "The unique Global Trade Item number of the item as defined by " +
            "<a href=\"https://www.gtin.info \" target=\"_blank\">https://www.gtin.info</a>. " +
            "This can be a UPC (Universal Product Code), EAN (European Article Number), or " +
            "an ISBN (International Standard Book Number) value.")
    public String getGtin() {
        return gtin;
    }

    public CoreItem image(Image image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     *
     * @return image
     **/
    @Schema(description = "")
    public Image getImage() {
        return image;
    }

    public CoreItem inferredEpid(String inferredEpid) {
        this.inferredEpid = inferredEpid;
        return this;
    }

    /**
     * The ePID (eBay Product ID of a product from the eBay product catalog) for the item, which
     * has been programmatically determined by eBay using the item's title, aspects, and other data.
     * <br><br>If the seller provided an ePID for the item, the seller's value is returned in the
     * <b> epid</b> field. <br><br><span class="tablenote"><b> Note: </b> This field is returned
     * only for authorized Partners.</span>
     *
     * @return inferredEpid
     **/
    @Schema(description = "The ePID (eBay Product ID of a product from the eBay product catalog) " +
            "for the item, which has been programmatically determined by eBay using the item's title, " +
            "aspects, and other data. <br><br>If the seller provided an ePID for the item, the seller's " +
            "value is returned in the <b> epid</b> field. <br><br><span class=\"tablenote\"><b> Note: </b> " +
            "This field is returned only for authorized Partners.</span>")
    public String getInferredEpid() {
        return inferredEpid;
    }

    public CoreItem itemAffiliateWebUrl(String itemAffiliateWebUrl) {
        this.itemAffiliateWebUrl = itemAffiliateWebUrl;
        return this;
    }

    /**
     * The URL to the View Item page of the item which includes the affiliate tracking ID.
     * <br><br><span class="tablenote"><b>Note:</b> In order to receive commissions on sales, eBay
     * Partner Network affiliates must use this URL to forward buyers to the listing on the eBay
     * marketplace.</span><br>The <b>itemAffiliateWebUrl</b> is only returned if:<ul><li>The marketplace
     * through which the item is being viewed is part of the eBay Partner Network. Currently Poland
     * (<code>EBAY_PL</code>) and Singapore (<code>EBAY_SG</code>) are <b>not</b> supported.
     * <br><br>For additional information, refer to
     * <a href="https://partnerhelp.ebay.com/helpcenter/s/article/countries-available-as-a-program-in-EPN?language=en_US " target="_blank">eBay Partner Network</a>.
     * </li><li>The seller enables affiliate tracking for the item by including the
     * <code><a href="/api-docs/buy/static/api-browse.html#Headers">X-EBAY-C-ENDUSERCTX</a></code>
     * request header in the method.</li></ul>
     *
     * @return itemAffiliateWebUrl
     **/
    @Schema(description = "The URL to the View Item page of the item which includes the affiliate " +
            "tracking ID.<br><br><span class=\"tablenote\"><b>Note:</b> In order to receive commissions " +
            "on sales, eBay Partner Network affiliates must use this URL to forward buyers to the listing " +
            "on the eBay marketplace.</span><br>The <b>itemAffiliateWebUrl</b> is only returned if:" +
            "<ul><li>The marketplace through which the item is being viewed is part of the eBay Partner " +
            "Network. Currently Poland (<code>EBAY_PL</code>) and Singapore (<code>EBAY_SG</code>) are " +
            "<b>not</b> supported.<br><br>For additional information, refer to " +
            "<a href=\"https://partnerhelp.ebay.com/helpcenter/s/article/countries-available-as-a-program-in-EPN?language=en_US \" target=\"_blank\">eBay Partner Network</a>." +
            "</li><li>The seller enables affiliate tracking for the item by including the " +
            "<code><a href=\"/api-docs/buy/static/api-browse.html#Headers\">X-EBAY-C-ENDUSERCTX</a></code> " +
            "request header in the method.</li></ul>")
    public String getItemAffiliateWebUrl() {
        return itemAffiliateWebUrl;
    }

    public CoreItem itemCreationDate(String itemCreationDate) {
        this.itemCreationDate = itemCreationDate;
        return this;
    }

    /**
     * A timestamp that indicates the date and time an item listing was created.<br><br>This value
     * is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which can be converted into the local
     * time of the buyer.
     *
     * @return itemCreationDate
     **/
    @Schema(description = "A timestamp that indicates the date and time an item listing was created." +
            "<br><br>This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which can be " +
            "converted into the local time of the buyer.")
    public String getItemCreationDate() {
        return itemCreationDate;
    }

    public CoreItem itemEndDate(String itemEndDate) {
        this.itemEndDate = itemEndDate;
        return this;
    }

    /**
     * This timestamp indicates the date and time up to which the item can be purchased.
     * This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert
     * into the local time of the buyer.<br><br><span class="tablenote"><b> Note: </b>This field
     * is only returned for auction listings.</span>
     *
     * @return itemEndDate
     **/
    @Schema(description = "This timestamp indicates the date and time up to which the item can be " +
            "purchased.  This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you " +
            "can convert into the local time of the buyer.<br><br><span class=\"tablenote\"><b> Note: </b>" +
            "This field is only returned for auction listings.</span>")
    public String getItemEndDate() {
        return itemEndDate;
    }

    public CoreItem itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * The unique RESTful identifier of the item.
     *
     * @return itemId
     **/
    @Schema(description = "The unique RESTful identifier of the item.")
    public String getItemId() {
        return itemId;
    }

    public CoreItem itemLocation(Address itemLocation) {
        this.itemLocation = itemLocation;
        return this;
    }

    /**
     * Get itemLocation
     *
     * @return itemLocation
     **/
    @Schema(description = "")
    public Address getItemLocation() {
        return itemLocation;
    }

    public CoreItem itemWebUrl(String itemWebUrl) {
        this.itemWebUrl = itemWebUrl;
        return this;
    }

    /**
     * The URL of the View Item page of the item. This enables you to include a "Report Item on eBay"
     * link that takes the buyer to the View Item page on eBay. From there they can report any issues
     * regarding this item to eBay.
     *
     * @return itemWebUrl
     **/
    @Schema(description = "The URL of the View Item page of the item. This enables you to include " +
            "a \"Report Item on eBay\" link that takes the buyer to the View Item page on eBay. From " +
            "there they can report any issues regarding this item to eBay.")
    public String getItemWebUrl() {
        return itemWebUrl;
    }

    public CoreItem legacyItemId(String legacyItemId) {
        this.legacyItemId = legacyItemId;
        return this;
    }

    /**
     * The unique identifier of the eBay listing that contains the item. This is the traditional/legacy
     * ID that is often seen in the URL of the listing View Item page.
     *
     * @return legacyItemId
     **/
    @Schema(description = "The unique identifier of the eBay listing that contains the item. This is " +
            "the traditional/legacy ID that is often seen in the URL of the listing View Item page.")
    public String getLegacyItemId() {
        return legacyItemId;
    }

    public CoreItem localizedAspects(List<TypedNameValue> localizedAspects) {
        this.localizedAspects = localizedAspects;
        return this;
    }

    public CoreItem addLocalizedAspectsItem(TypedNameValue localizedAspectsItem) {
        if (this.localizedAspects == null) {
            this.localizedAspects = new ArrayList<>();
        }
        this.localizedAspects.add(localizedAspectsItem);
        return this;
    }

    /**
     * An array of containers that show the complete list of the aspect name/value pairs that describe
     * the variation of the item.
     *
     * @return localizedAspects
     **/
    @Schema(description = "An array of containers that show the complete list of the aspect name/value " +
            "pairs that describe the variation of the item.")
    public List<TypedNameValue> getLocalizedAspects() {
        return localizedAspects;
    }

    public CoreItem lotSize(Integer lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    /**
     * The number of items in a lot. In other words, a lot size is the number of items that are being
     * sold together.  <br><br>A lot is a set of two or more items included in a single listing that
     * must be purchased together in a single order line item. All the items in the lot are the same
     * but there can be multiple items in a single lot,  such as the package of batteries shown in
     * the example below.   <br><br><table border="1"> <tr> <tr>  <th>Item</th>  <th>Lot Definition</th>
     * <th>Lot Size</th></tr>  <tr>  <td>A package of 24 AA batteries</td>  <td>A box of 10 packages</td>
     * <td>10  </td> </tr>  <tr>  <td>A P235/75-15 Goodyear tire </td>  <td>4 tires  </td>  <td>4  </td> </tr>
     * <tr> <td>Fashion Jewelry Rings  </td> <td>Package of 100 assorted rings  </td> <td>100 </td> </tr></table>
     * <br><br><span class="tablenote"><b>Note: </b>  Lots are not supported in all categories.  </span>
     *
     * @return lotSize
     **/
    @Schema(description = "The number of items in a lot. In other words, a lot size is the number of " +
            "items that are being sold together.  <br><br>A lot is a set of two or more items included " +
            "in a single listing that must be purchased together in a single order line item. All the items " +
            "in the lot are the same but there can be multiple items in a single lot,  such as the package " +
            "of batteries shown in the example below.   <br><br><table border=\"1\"> <tr> <tr>  <th>Item</th>  " +
            "<th>Lot Definition</th> <th>Lot Size</th></tr>  <tr>  <td>A package of 24 AA batteries</td> " +
            " <td>A box of 10 packages</td>  <td>10  </td> </tr>  <tr>  <td>A P235/75-15 Goodyear tire </td>  " +
            "<td>4 tires  </td>  <td>4  </td> </tr> <tr> <td>Fashion Jewelry Rings  </td> <td>Package of 100 " +
            "assorted rings  </td> <td>100 </td> </tr></table>  <br><br><span class=\"tablenote\"><b>Note: </b>  " +
            "Lots are not supported in all categories.  </span>")
    public Integer getLotSize() {
        return lotSize;
    }

    public CoreItem marketingPrice(MarketingPrice marketingPrice) {
        this.marketingPrice = marketingPrice;
        return this;
    }

    /**
     * Get marketingPrice
     *
     * @return marketingPrice
     **/
    @Schema(description = "")
    public MarketingPrice getMarketingPrice() {
        return marketingPrice;
    }

    public CoreItem material(String material) {
        this.material = material;
        return this;
    }

    /**
     * (Primary Item Aspect) Text describing what the item is made of. For example, silk.
     * All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return material
     **/
    @Schema(description = "(Primary Item Aspect) Text describing what the item is made of. For example, " +
            "silk. All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> " +
            "container.")
    public String getMaterial() {
        return material;
    }

    public CoreItem minimumPriceToBid(ConvertedAmount minimumPriceToBid) {
        this.minimumPriceToBid = minimumPriceToBid;
        return this;
    }

    /**
     * Get minimumPriceToBid
     *
     * @return minimumPriceToBid
     **/
    @Schema(description = "")
    public ConvertedAmount getMinimumPriceToBid() {
        return minimumPriceToBid;
    }

    public CoreItem mpn(String mpn) {
        this.mpn = mpn;
        return this;
    }

    /**
     * The manufacturer's part number, which is a unique number that identifies a specific product.
     * To identify the product, this is always used along with brand.
     *
     * @return mpn
     **/
    @Schema(description = "The manufacturer's part number, which is a unique number that identifies " +
            "a specific product. To identify the product, this is always used along with brand.")
    public String getMpn() {
        return mpn;
    }

    public CoreItem pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * (Primary Item Aspect) Text describing the pattern used on the item. For example, paisley.
     * All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return pattern
     **/
    @Schema(description = "(Primary Item Aspect) Text describing the pattern used on the item. For example, " +
            "paisley. All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> " +
            "container.")
    public String getPattern() {
        return pattern;
    }

    public CoreItem paymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
        return this;
    }

    public CoreItem addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
        if (this.paymentMethods == null) {
            this.paymentMethods = new ArrayList<>();
        }
        this.paymentMethods.add(paymentMethodsItem);
        return this;
    }

    /**
     * The payment methods for the item, including the payment method types, brands, and instructions for the buyer.
     *
     * @return paymentMethods
     **/
    @Schema(description = "The payment methods for the item, including the payment method types, brands, " +
            "and instructions for the buyer.")
    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public CoreItem price(ConvertedAmount price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(description = "")
    public ConvertedAmount getPrice() {
        return price;
    }

    public CoreItem priceDisplayCondition(String priceDisplayCondition) {
        this.priceDisplayCondition = priceDisplayCondition;
        return this;
    }

    /**
     * Indicates when in the buying flow the item's price can appear for minimum advertised price (MAP)
     * items, which is the lowest price a retailer can advertise/show for this item. For implementation
     * help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PriceDisplayConditionEnum'>eBay API documentation</a>
     *
     * @return priceDisplayCondition
     **/
    @Schema(description = "Indicates when in the buying flow the item's price can appear for minimum " +
            "advertised price (MAP) items, which is the lowest price a retailer can advertise/show for " +
            "this item. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PriceDisplayConditionEnum'>eBay API documentation</a>")
    public String getPriceDisplayCondition() {
        return priceDisplayCondition;
    }

    public CoreItem primaryItemGroup(ItemGroupSummary primaryItemGroup) {
        this.primaryItemGroup = primaryItemGroup;
        return this;
    }

    /**
     * Get primaryItemGroup
     *
     * @return primaryItemGroup
     **/
    @Schema(description = "")
    public ItemGroupSummary getPrimaryItemGroup() {
        return primaryItemGroup;
    }

    public CoreItem primaryProductReviewRating(ReviewRating primaryProductReviewRating) {
        this.primaryProductReviewRating = primaryProductReviewRating;
        return this;
    }

    /**
     * Get primaryProductReviewRating
     *
     * @return primaryProductReviewRating
     **/
    @Schema(description = "")
    public ReviewRating getPrimaryProductReviewRating() {
        return primaryProductReviewRating;
    }

    public CoreItem priorityListing(Boolean priorityListing) {
        this.priorityListing = priorityListing;
        return this;
    }

    /**
     * This field is returned as <code>true</code> if the listing is part of a Promoted Listing campaign.
     * Promoted Listings are available to Above Standard and Top Rated sellers with recent sales activity.
     * <br><br>For more information, see
     * <a href="https://pages.ebay.com/seller-center/listing-and-marketing/promoted-listings.html " target="_blank">Promoted Listings</a>.
     *
     * @return priorityListing
     **/
    @Schema(description = "This field is returned as <code>true</code> if the listing is part of a Promoted " +
            "Listing campaign. Promoted Listings are available to Above Standard and Top Rated sellers with " +
            "recent sales activity.<br><br>For more information, see " +
            "<a href=\"https://pages.ebay.com/seller-center/listing-and-marketing/promoted-listings.html \" target=\"_blank\">Promoted Listings</a>.")
    public Boolean isPriorityListing() {
        return priorityListing;
    }

    public CoreItem product(Product product) {
        this.product = product;
        return this;
    }

    /**
     * Get product
     *
     * @return product
     **/
    @Schema(description = "")
    public Product getProduct() {
        return product;
    }

    public CoreItem productFicheWebUrl(String productFicheWebUrl) {
        this.productFicheWebUrl = productFicheWebUrl;
        return this;
    }

    /**
     * The URL of a page containing the manufacturer's specification of this item, which helps buyers
     * make a purchasing decision. This information is available only for items that include the European
     * energy efficiency rating (EEK) but is not available for <em> all</em> items with an EEK rating and
     * is returned only if this information is available. The EEK rating of the item is returned in the
     * <b> energyEfficiencyClass</b> field.
     *
     * @return productFicheWebUrl
     **/
    @Schema(description = "The URL of a page containing the manufacturer's specification of this item, " +
            "which helps buyers make a purchasing decision. This information is available only for items " +
            "that include the European energy efficiency rating (EEK) but is not available for <em> all</em> " +
            "items with an EEK rating and is returned only if this information is available. The EEK rating of " +
            "the item is returned in the <b> energyEfficiencyClass</b> field.")
    public String getProductFicheWebUrl() {
        return productFicheWebUrl;
    }

    public CoreItem qualifiedPrograms(List<String> qualifiedPrograms) {
        this.qualifiedPrograms = qualifiedPrograms;
        return this;
    }

    public CoreItem addQualifiedProgramsItem(String qualifiedProgramsItem) {
        if (this.qualifiedPrograms == null) {
            this.qualifiedPrograms = new ArrayList<>();
        }
        this.qualifiedPrograms.add(qualifiedProgramsItem);
        return this;
    }

    /**
     * An array of the qualified programs available for the item, such as EBAY_PLUS, AUTHENTICITY_GUARANTEE,
     * and AUTHENTICITY_VERIFICATION.<br><br>eBay Plus is a premium account option for buyers, which provides
     * benefits such as fast free domestic shipping and free returns on selected items. Top-Rated eBay
     * sellers must opt in to eBay Plus to be able to offer the program on qualifying listings. Sellers
     * must commit to next-day delivery of those items.<br><br><span class="tablenote"><b>Note: </b> eBay
     * Plus is available only to buyers in Germany, Austria, and Australia marketplaces.</span><br><br>The eBay
     * <a href="https://pages.ebay.com/authenticity-guarantee/ " target="_blank">Authenticity Guarantee</a>
     * program enables third-party authenticators to perform authentication verification inspections on items
     * such as watches and sneakers.
     *
     * @return qualifiedPrograms
     **/
    @Schema(description = "An array of the qualified programs available for the item, such as EBAY_PLUS, " +
            "AUTHENTICITY_GUARANTEE, and AUTHENTICITY_VERIFICATION.<br><br>eBay Plus is a premium account " +
            "option for buyers, which provides benefits such as fast free domestic shipping and free " +
            "returns on selected items. Top-Rated eBay sellers must opt in to eBay Plus to be able to offer " +
            "the program on qualifying listings. Sellers must commit to next-day delivery of those items." +
            "<br><br><span class=\"tablenote\"><b>Note: </b> eBay Plus is available only to buyers in Germany, " +
            "Austria, and Australia marketplaces.</span><br><br>The eBay " +
            "<a href=\"https://pages.ebay.com/authenticity-guarantee/ \" target=\"_blank\">Authenticity Guarantee</a> " +
            "program enables third-party authenticators to perform authentication verification inspections on " +
            "items such as watches and sneakers.")
    public List<String> getQualifiedPrograms() {
        return qualifiedPrograms;
    }

    public CoreItem quantityLimitPerBuyer(Integer quantityLimitPerBuyer) {
        this.quantityLimitPerBuyer = quantityLimitPerBuyer;
        return this;
    }

    /**
     * The maximum number for a specific item that one buyer can purchase.
     *
     * @return quantityLimitPerBuyer
     **/
    @Schema(description = "The maximum number for a specific item that one buyer can purchase.")
    public Integer getQuantityLimitPerBuyer() {
        return quantityLimitPerBuyer;
    }

    public CoreItem reservePriceMet(Boolean reservePriceMet) {
        this.reservePriceMet = reservePriceMet;
        return this;
    }

    /**
     * This indicates if the reserve price of the item has been met. A reserve price is set by the seller
     * and is the minimum amount the seller is willing to sell the item for. <p>If the highest bid is not
     * equal to or higher than the reserve price when the auction ends, the listing ends and the item
     * is not sold.</p> <p><b> Note: </b>This is returned only for auctions that have a reserve price.</p>
     *
     * @return reservePriceMet
     **/
    @Schema(description = "This indicates if the reserve price of the item has been met. A reserve price " +
            "is set by the seller and is the minimum amount the seller is willing to sell the item for. " +
            "<p>If the highest bid is not equal to or higher than the reserve price when the auction ends, " +
            "the listing ends and the item is not sold.</p> <p><b> Note: </b>This is returned only for " +
            "auctions that have a reserve price.</p>")
    public Boolean isReservePriceMet() {
        return reservePriceMet;
    }

    public CoreItem returnTerms(ItemReturnTerms returnTerms) {
        this.returnTerms = returnTerms;
        return this;
    }

    /**
     * Get returnTerms
     *
     * @return returnTerms
     **/
    @Schema(description = "")
    public ItemReturnTerms getReturnTerms() {
        return returnTerms;
    }

    public CoreItem seller(SellerDetail seller) {
        this.seller = seller;
        return this;
    }

    /**
     * Get seller
     *
     * @return seller
     **/
    @Schema(description = "")
    public SellerDetail getSeller() {
        return seller;
    }

    public CoreItem sellerItemRevision(String sellerItemRevision) {
        this.sellerItemRevision = sellerItemRevision;
        return this;
    }

    /**
     * An identifier generated/incremented when a seller revises the item. There are two types of item
     * revisions: <ul><li>Seller changes, such as changing the title</li>  <li>eBay system changes,
     * such as changing the quantity when an item is purchased</li></ul> This ID is changed <em> only</em>
     * when the seller makes a change to the item. This means you cannot use this value to determine
     * if the quantity has changed.
     *
     * @return sellerItemRevision
     **/
    @Schema(description = "An identifier generated/incremented when a seller revises the item. There " +
            "are two types of item revisions: <ul><li>Seller changes, such as changing the title</li>  " +
            "<li>eBay system changes, such as changing the quantity when an item is purchased</li></ul> " +
            "This ID is changed <em> only</em> when the seller makes a change to the item. This means " +
            "you cannot use this value to determine if the quantity has changed.")
    public String getSellerItemRevision() {
        return sellerItemRevision;
    }

    public CoreItem shippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
        return this;
    }

    public CoreItem addShippingOptionsItem(ShippingOption shippingOptionsItem) {
        if (this.shippingOptions == null) {
            this.shippingOptions = new ArrayList<>();
        }
        this.shippingOptions.add(shippingOptionsItem);
        return this;
    }

    /**
     * An array of shipping options containers that have the details about cost, carrier, etc.
     * of one shipping option.
     *
     * @return shippingOptions
     **/
    @Schema(description = "An array of shipping options containers that have the details about cost, " +
            "carrier, etc. of one shipping option. ")
    public List<ShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    public CoreItem shipToLocations(ShipToLocations shipToLocations) {
        this.shipToLocations = shipToLocations;
        return this;
    }

    /**
     * Get shipToLocations
     *
     * @return shipToLocations
     **/
    @Schema(description = "")
    public ShipToLocations getShipToLocations() {
        return shipToLocations;
    }

    public CoreItem shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * This text string is derived from the item condition and the item aspects
     * (such as size, color, capacity, model, brand, etc.).
     *
     * @return shortDescription
     **/
    @Schema(description = "This text string is derived from the item condition and the item aspects " +
            "(such as size, color, capacity, model, brand, etc.).")
    public String getShortDescription() {
        return shortDescription;
    }

    public CoreItem size(String size) {
        this.size = size;
        return this;
    }

    /**
     * (Primary Item Aspect) The size of the item. For example, '7' for a size 7 shoe. All the item
     * aspects, including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return size
     **/
    @Schema(description = "(Primary Item Aspect) The size of the item. For example, '7' for a size 7 shoe. " +
            "All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getSize() {
        return size;
    }

    public CoreItem sizeSystem(String sizeSystem) {
        this.sizeSystem = sizeSystem;
        return this;
    }

    /**
     * (Primary Item Aspect) The sizing system of the country.  All the item aspects, including
     * this aspect, are returned in the <b> localizedAspects</b> container. <br><br><b> Valid Values:
     * </b> <br>AU (Australia),  <br>BR (Brazil), <br>CN (China),  <br>DE (Germany),  <br>EU (European Union),
     * <br> FR (France), <br> IT (Italy),  <br>JP (Japan), <br>MX (Mexico),  <br>US (USA),
     * <br> UK (United Kingdom) <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return sizeSystem
     **/
    @Schema(description = "(Primary Item Aspect) The sizing system of the country.  All the item aspects, " +
            "including this aspect, are returned in the <b> localizedAspects</b> container. " +
            "<br><br><b> Valid Values: </b> <br>AU (Australia),  <br>BR (Brazil), <br>CN (China),  " +
            "<br>DE (Germany),  <br>EU (European Union),  <br> FR (France), <br> IT (Italy),  " +
            "<br>JP (Japan), <br>MX (Mexico),  <br>US (USA), <br> UK (United Kingdom) <br><br>Code so " +
            "that your app gracefully handles any future changes to this list. ")
    public String getSizeSystem() {
        return sizeSystem;
    }

    public CoreItem sizeType(String sizeType) {
        this.sizeType = sizeType;
        return this;
    }

    /**
     * (Primary Item Aspect) Text describing a size group in which the item would be included,
     * such as regular, petite, plus, big-and-tall or maternity. All the item aspects, including
     * this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return sizeType
     **/
    @Schema(description = "(Primary Item Aspect) Text describing a size group in which the item would " +
            "be included, such as regular, petite, plus, big-and-tall or maternity. All the item aspects, " +
            "including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getSizeType() {
        return sizeType;
    }

    public CoreItem subtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    /**
     * A subtitle is optional and allows the seller to provide more information about the product,
     * possibly including keywords that may assist with search results.
     *
     * @return subtitle
     **/
    @Schema(description = "A subtitle is optional and allows the seller to provide more information " +
            "about the product, possibly including keywords that may assist with search results.")
    public String getSubtitle() {
        return subtitle;
    }

    public CoreItem taxes(List<Taxes> taxes) {
        this.taxes = taxes;
        return this;
    }

    public CoreItem addTaxesItem(Taxes taxesItem) {
        if (this.taxes == null) {
            this.taxes = new ArrayList<>();
        }
        this.taxes.add(taxesItem);
        return this;
    }

    /**
     * The container for the tax information for the item.
     *
     * @return taxes
     **/
    @Schema(description = "The container for the tax information for the item.")
    public List<Taxes> getTaxes() {
        return taxes;
    }

    public CoreItem title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The seller-created title of the item. <br><br><b> Maximum Length: </b> 80 characters
     *
     * @return title
     **/
    @Schema(description = "The seller-created title of the item. <br><br><b> Maximum Length: </b> 80 characters")
    public String getTitle() {
        return title;
    }

    public CoreItem topRatedBuyingExperience(Boolean topRatedBuyingExperience) {
        this.topRatedBuyingExperience = topRatedBuyingExperience;
        return this;
    }

    /**
     * This indicates if the item a top-rated plus item. There are three benefits of a top-rated
     * plus item: a  minimum 30-day money-back return policy, shipping the items in 1 business day
     * with tracking provided, and the added comfort of knowing this item is from experienced sellers
     * with the highest buyer ratings. See the
     * <a href="https://pages.ebay.com/topratedplus/index.html " target="_blank">Top Rated Plus Items </a>
     * and <a href="https://pages.ebay.com/help/sell/top-rated.html " target="_blank">Becoming a Top
     * Rated Seller and qualifying for Top Rated Plus</a> help topics for more information.
     *
     * @return topRatedBuyingExperience
     **/
    @Schema(description = "This indicates if the item a top-rated plus item. There are three benefits of " +
            "a top-rated plus item: a  minimum 30-day money-back return policy, shipping the items in " +
            "1 business day with tracking provided, and the added comfort of knowing this item is from " +
            "experienced sellers with the highest buyer ratings. See the " +
            "<a href=\"https://pages.ebay.com/topratedplus/index.html \" target=\"_blank\">Top Rated Plus Items </a> " +
            "and <a href=\"https://pages.ebay.com/help/sell/top-rated.html \" target=\"_blank\">Becoming " +
            "a Top Rated Seller and qualifying for Top Rated Plus</a> help topics for more information.")
    public Boolean isTopRatedBuyingExperience() {
        return topRatedBuyingExperience;
    }

    public CoreItem tyreLabelImageUrl(String tyreLabelImageUrl) {
        this.tyreLabelImageUrl = tyreLabelImageUrl;
        return this;
    }

    /**
     * The URL to the image that shows the information on the tyre label.
     *
     * @return tyreLabelImageUrl
     **/
    @Schema(description = "The URL to the image that shows the information on the tyre label.")
    public String getTyreLabelImageUrl() {
        return tyreLabelImageUrl;
    }

    public CoreItem uniqueBidderCount(Integer uniqueBidderCount) {
        this.uniqueBidderCount = uniqueBidderCount;
        return this;
    }

    /**
     * This integer value indicates the number of different eBay users who have placed one or more bids
     * on an auction item. This field is only applicable to auction items.
     *
     * @return uniqueBidderCount
     **/
    @Schema(description = "This integer value indicates the number of different eBay users who have placed " +
            "one or more bids on an auction item. This field is only applicable to auction items.")
    public Integer getUniqueBidderCount() {
        return uniqueBidderCount;
    }

    public CoreItem unitPrice(ConvertedAmount unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Get unitPrice
     *
     * @return unitPrice
     **/
    @Schema(description = "")
    public ConvertedAmount getUnitPrice() {
        return unitPrice;
    }

    public CoreItem unitPricingMeasure(String unitPricingMeasure) {
        this.unitPricingMeasure = unitPricingMeasure;
        return this;
    }

    /**
     * The designation, such as size, weight, volume, count, etc., that was used to specify
     * the quantity of the item.  This helps buyers compare prices. <br><br>For example,
     * the following tells the buyer that the item is 7.99 per 100 grams.
     * <br><br><code>"unitPricingMeasure": "100g",<br> "unitPrice": {<br>&nbsp;&nbsp;"value": "7.99",
     * <br>&nbsp;&nbsp;"currency": "GBP"</code>
     *
     * @return unitPricingMeasure
     **/
    @Schema(description = "The designation, such as size, weight, volume, count, etc., that was used " +
            "to specify the quantity of the item.  This helps buyers compare prices. <br><br>For example, " +
            "the following tells the buyer that the item is 7.99 per 100 grams. " +
            "<br><br><code>\"unitPricingMeasure\": \"100g\",<br> \"unitPrice\": {" +
            "<br>&nbsp;&nbsp;\"value\": \"7.99\",<br>&nbsp;&nbsp;\"currency\": \"GBP\"</code>")
    public String getUnitPricingMeasure() {
        return unitPricingMeasure;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoreItem coreItem = (CoreItem) o;
        return Objects.equals(this.additionalImages, coreItem.additionalImages) &&
                Objects.equals(this.adultOnly, coreItem.adultOnly) &&
                Objects.equals(this.ageGroup, coreItem.ageGroup) &&
                Objects.equals(this.authenticityGuarantee, coreItem.authenticityGuarantee) &&
                Objects.equals(this.authenticityVerification, coreItem.authenticityVerification) &&
                Objects.equals(this.availableCoupons, coreItem.availableCoupons) &&
                Objects.equals(this.bidCount, coreItem.bidCount) &&
                Objects.equals(this.brand, coreItem.brand) &&
                Objects.equals(this.buyingOptions, coreItem.buyingOptions) &&
                Objects.equals(this.categoryId, coreItem.categoryId) &&
                Objects.equals(this.categoryPath, coreItem.categoryPath) &&
                Objects.equals(this.color, coreItem.color) &&
                Objects.equals(this.condition, coreItem.condition) &&
                Objects.equals(this.conditionDescription, coreItem.conditionDescription) &&
                Objects.equals(this.conditionId, coreItem.conditionId) &&
                Objects.equals(this.currentBidPrice, coreItem.currentBidPrice) &&
                Objects.equals(this.description, coreItem.description) &&
                Objects.equals(this.eligibleForInlineCheckout, coreItem.eligibleForInlineCheckout) &&
                Objects.equals(this.enabledForGuestCheckout, coreItem.enabledForGuestCheckout) &&
                Objects.equals(this.energyEfficiencyClass, coreItem.energyEfficiencyClass) &&
                Objects.equals(this.epid, coreItem.epid) &&
                Objects.equals(this.estimatedAvailabilities, coreItem.estimatedAvailabilities) &&
                Objects.equals(this.gender, coreItem.gender) &&
                Objects.equals(this.gtin, coreItem.gtin) &&
                Objects.equals(this.image, coreItem.image) &&
                Objects.equals(this.inferredEpid, coreItem.inferredEpid) &&
                Objects.equals(this.itemAffiliateWebUrl, coreItem.itemAffiliateWebUrl) &&
                Objects.equals(this.itemCreationDate, coreItem.itemCreationDate) &&
                Objects.equals(this.itemEndDate, coreItem.itemEndDate) &&
                Objects.equals(this.itemId, coreItem.itemId) &&
                Objects.equals(this.itemLocation, coreItem.itemLocation) &&
                Objects.equals(this.itemWebUrl, coreItem.itemWebUrl) &&
                Objects.equals(this.legacyItemId, coreItem.legacyItemId) &&
                Objects.equals(this.localizedAspects, coreItem.localizedAspects) &&
                Objects.equals(this.lotSize, coreItem.lotSize) &&
                Objects.equals(this.marketingPrice, coreItem.marketingPrice) &&
                Objects.equals(this.material, coreItem.material) &&
                Objects.equals(this.minimumPriceToBid, coreItem.minimumPriceToBid) &&
                Objects.equals(this.mpn, coreItem.mpn) &&
                Objects.equals(this.pattern, coreItem.pattern) &&
                Objects.equals(this.paymentMethods, coreItem.paymentMethods) &&
                Objects.equals(this.price, coreItem.price) &&
                Objects.equals(this.priceDisplayCondition, coreItem.priceDisplayCondition) &&
                Objects.equals(this.primaryItemGroup, coreItem.primaryItemGroup) &&
                Objects.equals(this.primaryProductReviewRating, coreItem.primaryProductReviewRating) &&
                Objects.equals(this.priorityListing, coreItem.priorityListing) &&
                Objects.equals(this.product, coreItem.product) &&
                Objects.equals(this.productFicheWebUrl, coreItem.productFicheWebUrl) &&
                Objects.equals(this.qualifiedPrograms, coreItem.qualifiedPrograms) &&
                Objects.equals(this.quantityLimitPerBuyer, coreItem.quantityLimitPerBuyer) &&
                Objects.equals(this.reservePriceMet, coreItem.reservePriceMet) &&
                Objects.equals(this.returnTerms, coreItem.returnTerms) &&
                Objects.equals(this.seller, coreItem.seller) &&
                Objects.equals(this.sellerItemRevision, coreItem.sellerItemRevision) &&
                Objects.equals(this.shippingOptions, coreItem.shippingOptions) &&
                Objects.equals(this.shipToLocations, coreItem.shipToLocations) &&
                Objects.equals(this.shortDescription, coreItem.shortDescription) &&
                Objects.equals(this.size, coreItem.size) &&
                Objects.equals(this.sizeSystem, coreItem.sizeSystem) &&
                Objects.equals(this.sizeType, coreItem.sizeType) &&
                Objects.equals(this.subtitle, coreItem.subtitle) &&
                Objects.equals(this.taxes, coreItem.taxes) &&
                Objects.equals(this.title, coreItem.title) &&
                Objects.equals(this.topRatedBuyingExperience, coreItem.topRatedBuyingExperience) &&
                Objects.equals(this.tyreLabelImageUrl, coreItem.tyreLabelImageUrl) &&
                Objects.equals(this.uniqueBidderCount, coreItem.uniqueBidderCount) &&
                Objects.equals(this.unitPrice, coreItem.unitPrice) &&
                Objects.equals(this.unitPricingMeasure, coreItem.unitPricingMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalImages, adultOnly, ageGroup, authenticityGuarantee, authenticityVerification, availableCoupons, bidCount, brand, buyingOptions, categoryId, categoryPath, color, condition, conditionDescription, conditionId, currentBidPrice, description, eligibleForInlineCheckout, enabledForGuestCheckout, energyEfficiencyClass, epid, estimatedAvailabilities, gender, gtin, image, inferredEpid, itemAffiliateWebUrl, itemCreationDate, itemEndDate, itemId, itemLocation, itemWebUrl, legacyItemId, localizedAspects, lotSize, marketingPrice, material, minimumPriceToBid, mpn, pattern, paymentMethods, price, priceDisplayCondition, primaryItemGroup, primaryProductReviewRating, priorityListing, product, productFicheWebUrl, qualifiedPrograms, quantityLimitPerBuyer, reservePriceMet, returnTerms, seller, sellerItemRevision, shippingOptions, shipToLocations, shortDescription, size, sizeSystem, sizeType, subtitle, taxes, title, topRatedBuyingExperience, tyreLabelImageUrl, uniqueBidderCount, unitPrice, unitPricingMeasure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreItem {\n");
        sb.append("    additionalImages: ").append(toIndentedString(additionalImages)).append("\n");
        sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
        sb.append("    ageGroup: ").append(toIndentedString(ageGroup)).append("\n");
        sb.append("    authenticityGuarantee: ").append(toIndentedString(authenticityGuarantee)).append("\n");
        sb.append("    authenticityVerification: ").append(toIndentedString(authenticityVerification)).append("\n");
        sb.append("    availableCoupons: ").append(toIndentedString(availableCoupons)).append("\n");
        sb.append("    bidCount: ").append(toIndentedString(bidCount)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    buyingOptions: ").append(toIndentedString(buyingOptions)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    conditionDescription: ").append(toIndentedString(conditionDescription)).append("\n");
        sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
        sb.append("    currentBidPrice: ").append(toIndentedString(currentBidPrice)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eligibleForInlineCheckout: ").append(toIndentedString(eligibleForInlineCheckout)).append("\n");
        sb.append("    enabledForGuestCheckout: ").append(toIndentedString(enabledForGuestCheckout)).append("\n");
        sb.append("    energyEfficiencyClass: ").append(toIndentedString(energyEfficiencyClass)).append("\n");
        sb.append("    epid: ").append(toIndentedString(epid)).append("\n");
        sb.append("    estimatedAvailabilities: ").append(toIndentedString(estimatedAvailabilities)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    inferredEpid: ").append(toIndentedString(inferredEpid)).append("\n");
        sb.append("    itemAffiliateWebUrl: ").append(toIndentedString(itemAffiliateWebUrl)).append("\n");
        sb.append("    itemCreationDate: ").append(toIndentedString(itemCreationDate)).append("\n");
        sb.append("    itemEndDate: ").append(toIndentedString(itemEndDate)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemLocation: ").append(toIndentedString(itemLocation)).append("\n");
        sb.append("    itemWebUrl: ").append(toIndentedString(itemWebUrl)).append("\n");
        sb.append("    legacyItemId: ").append(toIndentedString(legacyItemId)).append("\n");
        sb.append("    localizedAspects: ").append(toIndentedString(localizedAspects)).append("\n");
        sb.append("    lotSize: ").append(toIndentedString(lotSize)).append("\n");
        sb.append("    marketingPrice: ").append(toIndentedString(marketingPrice)).append("\n");
        sb.append("    material: ").append(toIndentedString(material)).append("\n");
        sb.append("    minimumPriceToBid: ").append(toIndentedString(minimumPriceToBid)).append("\n");
        sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    priceDisplayCondition: ").append(toIndentedString(priceDisplayCondition)).append("\n");
        sb.append("    primaryItemGroup: ").append(toIndentedString(primaryItemGroup)).append("\n");
        sb.append("    primaryProductReviewRating: ").append(toIndentedString(primaryProductReviewRating)).append("\n");
        sb.append("    priorityListing: ").append(toIndentedString(priorityListing)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    productFicheWebUrl: ").append(toIndentedString(productFicheWebUrl)).append("\n");
        sb.append("    qualifiedPrograms: ").append(toIndentedString(qualifiedPrograms)).append("\n");
        sb.append("    quantityLimitPerBuyer: ").append(toIndentedString(quantityLimitPerBuyer)).append("\n");
        sb.append("    reservePriceMet: ").append(toIndentedString(reservePriceMet)).append("\n");
        sb.append("    returnTerms: ").append(toIndentedString(returnTerms)).append("\n");
        sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
        sb.append("    sellerItemRevision: ").append(toIndentedString(sellerItemRevision)).append("\n");
        sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
        sb.append("    shipToLocations: ").append(toIndentedString(shipToLocations)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeSystem: ").append(toIndentedString(sizeSystem)).append("\n");
        sb.append("    sizeType: ").append(toIndentedString(sizeType)).append("\n");
        sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
        sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    topRatedBuyingExperience: ").append(toIndentedString(topRatedBuyingExperience)).append("\n");
        sb.append("    tyreLabelImageUrl: ").append(toIndentedString(tyreLabelImageUrl)).append("\n");
        sb.append("    uniqueBidderCount: ").append(toIndentedString(uniqueBidderCount)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    unitPricingMeasure: ").append(toIndentedString(unitPricingMeasure)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
