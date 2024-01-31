package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The details of an item that can be purchased.
 */
@Setter
@Schema(description = "The details of an item that can be purchased.")
public class Item {
    @SerializedName("additionalImages")
    private List<Image> additionalImages = null;

    @SerializedName("addonServices")
    private List<AddonService> addonServices = null;

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

    @SerializedName("categoryIdPath")
    private String categoryIdPath = null;

    @SerializedName("categoryPath")
    private String categoryPath = null;

    @SerializedName("color")
    private String color = null;

    @SerializedName("condition")
    private String condition = null;

    @SerializedName("conditionDescription")
    private String conditionDescription = null;

    @SerializedName("conditionDescriptors")
    private List<ConditionDescriptor> conditionDescriptors = null;

    @SerializedName("conditionId")
    private String conditionId = null;

    @SerializedName("currentBidPrice")
    private ConvertedAmount currentBidPrice = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("ecoParticipationFee")
    private ConvertedAmount ecoParticipationFee = null;

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

    @SerializedName("hazardousMaterialsLabels")
    private HazardousMaterialsLabels hazardousMaterialsLabels = null;

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

    @SerializedName("listingMarketplaceId")
    private String listingMarketplaceId = null;

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

    @SerializedName("repairScore")
    private String repairScore = null;

    @SerializedName("reservePriceMet")
    private Boolean reservePriceMet = null;

    @SerializedName("returnTerms")
    private ItemReturnTerms returnTerms = null;

    @SerializedName("seller")
    private SellerDetail seller = null;

    @SerializedName("sellerCustomPolicies")
    private List<SellerCustomPolicy> sellerCustomPolicies = null;

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

    @SerializedName("warnings")
    private List<Error> warnings = null;

    @SerializedName("watchCount")
    private Integer watchCount = null;

    public Item additionalImages(List<Image> additionalImages) {
        this.additionalImages = additionalImages;
        return this;
    }

    public Item addAdditionalImagesItem(Image additionalImagesItem) {
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

    public Item addonServices(List<AddonService> addonServices) {
        this.addonServices = addonServices;
        return this;
    }

    public Item addAddonServicesItem(AddonService addonServicesItem) {
        if (this.addonServices == null) {
            this.addonServices = new ArrayList<>();
        }
        this.addonServices.add(addonServicesItem);
        return this;
    }

    /**
     * A list of add-on services that may be selected for the item or that may apply automatically.
     *
     * @return addonServices
     **/
    @Schema(description = "A list of add-on services that may be selected for the item or that " +
            "may apply automatically.")
    public List<AddonService> getAddonServices() {
        return addonServices;
    }

    public Item adultOnly(Boolean adultOnly) {
        this.adultOnly = adultOnly;
        return this;
    }

    /**
     * This indicates if the item is for  adults only. For more information about adult-only items on eBay,
     * see <a href="https://pages.ebay.com/help/policies/adult-only.html " target="_blank">Adult items policy</a>
     * for sellers and <a href="https://www.ebay.com/help/terms-conditions/default/searching-adult-items?id=4661" target="_blank">
     * Adult-Only items on eBay</a> for buyers.
     *
     * @return adultOnly
     **/
    @Schema(description = "This indicates if the item is for  adults only. For more information about " +
            "adult-only items on eBay, see <a href=\"https://pages.ebay.com/help/policies/adult-only.html \" target=\"_blank\">" +
            "Adult items policy</a> for sellers and " +
            "<a href=\"https://www.ebay.com/help/terms-conditions/default/searching-adult-items?id=4661\" target=\"_blank\">" +
            "Adult-Only items on eBay</a> for buyers.")
    public Boolean isAdultOnly() {
        return adultOnly;
    }

    public Item ageGroup(String ageGroup) {
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

    public Item authenticityGuarantee(AuthenticityGuaranteeProgram authenticityGuarantee) {
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

    public Item authenticityVerification(AuthenticityVerificationProgram authenticityVerification) {
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

    public Item availableCoupons(List<AvailableCoupon> availableCoupons) {
        this.availableCoupons = availableCoupons;
        return this;
    }

    public Item addAvailableCouponsItem(AvailableCoupon availableCouponsItem) {
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

    public Item bidCount(Integer bidCount) {
        this.bidCount = bidCount;
        return this;
    }

    /**
     * This integer value indicates the total number of bids that have been placed against an auction item.
     * This field is returned only for auction items.
     *
     * @return bidCount
     **/
    @Schema(description = "This integer value indicates the total number of bids that have been placed " +
            "against an auction item. This field is returned only for auction items.")
    public Integer getBidCount() {
        return bidCount;
    }

    public Item brand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * (Primary Item Aspect) The name brand of the item, such as Nike, Apple, etc.  All the item
     * aspects, including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return brand
     **/
    @Schema(description = "(Primary Item Aspect) The name brand of the item, such as Nike, Apple, etc. " +
            "All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getBrand() {
        return brand;
    }

    public Item buyingOptions(List<String> buyingOptions) {
        this.buyingOptions = buyingOptions;
        return this;
    }

    public Item addBuyingOptionsItem(String buyingOptionsItem) {
        if (this.buyingOptions == null) {
            this.buyingOptions = new ArrayList<String>();
        }
        this.buyingOptions.add(buyingOptionsItem);
        return this;
    }

    /**
     * A comma separated list of all the purchase options available for the item. The values returned are:
     * <ul><li><code>FIXED_PRICE</code> - Indicates the buyer can purchase the item for a set price using
     * the Buy It Now button.</li><li><code>AUCTION</code> - Indicates the buyer can place a bid for the item.
     * After the first bid is placed, this becomes a live auction item and is the only buying option for
     * this item.</li><li><code>BEST_OFFER</code> - Indicates the buyer can send the seller a price they're
     * willing to pay for the item. The seller can accept, reject, or send a counter offer. For more
     * information on how this works, see
     * <a href="https://www.ebay.com/help/buying/buy-now/making-best-offer?id=4019 ">Making a Best Offer</a>.
     * </li><li><code>CLASSIFIED_AD</code> - Indicates that the final sales transaction is to be completed
     * outside of the eBay environment.</li></ul>Code so that your app gracefully handles any future changes
     * to this list.
     *
     * @return buyingOptions
     **/
    @Schema(description = "A comma separated list of all the purchase options available for the item. " +
            "The values returned are:" +
            "<ul><li><code>FIXED_PRICE</code> - Indicates the buyer can purchase the item for a set price " +
            "    using the Buy It Now button.</li>" +
            "<li><code>AUCTION</code> - Indicates the buyer can place a bid for the item. After the first " +
            "    bid is placed, this becomes a live auction item and is the only buying option for this item.</li>" +
            "<li><code>BEST_OFFER</code> - Indicates the buyer can send the seller a price they're willing " +
            "to pay for the item. The seller can accept, reject, or send a counter offer. For more information " +
            "on how this works, see <a href=\"https://www.ebay.com/help/buying/buy-now/making-best-offer?id=4019 \">" +
            "Making a Best Offer</a>.</li>" +
            "<li><code>CLASSIFIED_AD</code> - Indicates that the final sales transaction is to be completed " +
            "outside of the eBay environment.</li></ul>Code so that your app gracefully handles any future " +
            "changes to this list.")
    public List<String> getBuyingOptions() {
        return buyingOptions;
    }

    public Item categoryId(String categoryId) {
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

    public Item categoryIdPath(String categoryIdPath) {
        this.categoryIdPath = categoryIdPath;
        return this;
    }

    /**
     * The IDs of every category in the item path, separated by pipe characters, starting with the top
     * level parent category.<br><br>For example, if an item belongs to the top level category Home and
     * Garden (category ID 11700), followed by Home Improvement (159907), Heating, Cooling and Air (69197),
     * and Thermostats (115947), the field would return the value: <code>11700|159907|69197|115947</code>.
     *
     * @return categoryIdPath
     **/
    @Schema(description = "The IDs of every category in the item path, separated by pipe characters, " +
            "starting with the top level parent category.<br><br>For example, if an item belongs to the top " +
            "level category Home and Garden (category ID 11700), followed by Home Improvement (159907), " +
            "Heating, Cooling and Air (69197), and Thermostats (115947), the field would return the value: " +
            "<code>11700|159907|69197|115947</code>.")
    public String getCategoryIdPath() {
        return categoryIdPath;
    }

    public Item categoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
        return this;
    }

    /**
     * Text that shows the category hierarchy of the item. For example: Computers/Tablets &amp; Networking,
     * Laptops &amp; Netbooks, PC Laptops &amp; Netbooks
     *
     * @return categoryPath
     **/
    @Schema(description = "Text that shows the category hierarchy of the item. For example: Computers/Tablets &amp; " +
            "Networking, Laptops &amp; Netbooks, PC Laptops &amp; Netbooks")
    public String getCategoryPath() {
        return categoryPath;
    }

    public Item color(String color) {
        this.color = color;
        return this;
    }

    /**
     * (Primary Item Aspect) Text describing the color of the item.  All the item aspects, including
     * this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return color
     **/
    @Schema(description = "(Primary Item Aspect) Text describing the color of the item.  All the item " +
            "aspects, including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getColor() {
        return color;
    }

    public Item condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * A short text description for the condition of the item, such as New or Used. For a list of
     * condition names, see
     * <a href="https://developer.ebay.com/devzone/finding/callref/enums/conditionIdList.html " target="_blank">
     * Item Condition IDs and Names</a>.
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return condition
     **/
    @Schema(description = "A short text description for the condition of the item, such as New or Used. " +
            "For a list of condition names, see " +
            "<a href=\"https://developer.ebay.com/devzone/finding/callref/enums/conditionIdList.html \" target=\"_blank\">" +
            "Item Condition IDs and Names</a>.  <br><br>Code so that your app gracefully handles any " +
            "future changes to this list.")
    public String getCondition() {
        return condition;
    }

    public Item conditionDescription(String conditionDescription) {
        this.conditionDescription = conditionDescription;
        return this;
    }

    /**
     * A full text description for the condition of the item. This field elaborates on the value
     * specified in the <b>condition</b> field and provides full details for the condition of the item.
     *
     * @return conditionDescription
     **/
    @Schema(description = "A full text description for the condition of the item. This field elaborates " +
            "on the value specified in the <b>condition</b> field and provides full details for the condition " +
            "of the item.")
    public String getConditionDescription() {
        return conditionDescription;
    }

    public Item conditionDescriptors(List<ConditionDescriptor> conditionDescriptors) {
        this.conditionDescriptors = conditionDescriptors;
        return this;
    }

    public Item addConditionDescriptorsItem(ConditionDescriptor conditionDescriptorsItem) {
        if (this.conditionDescriptors == null) {
            this.conditionDescriptors = new ArrayList<>();
        }
        this.conditionDescriptors.add(conditionDescriptorsItem);
        return this;
    }

    /**
     * This array is used by the seller to provide additional information about the condition of
     * an item in a structured format. Condition descriptors are name-value attributes that indicate
     * details about a particular condition of an item.<br><br><span class="tablenote"><b>Note:</b>
     * Condition descriptors are currently only available for the following trading card categories:
     * <ul><li>Non-Sport Trading Card Singles</li>
     * <li>CCG Individual Cards</li>
     * <li>Sports Trading Card Singles</li></ul></span>
     *
     * @return conditionDescriptors
     **/
    @Schema(description = "This array is used by the seller to provide additional information about " +
            "the condition of an item in a structured format. Condition descriptors are name-value " +
            "attributes that indicate details about a particular condition of an item." +
            "<br><br><span class=\"tablenote\"><b>Note:</b> Condition descriptors are currently " +
            "only available for the following trading card categories:" +
            "<ul><li>Non-Sport Trading Card Singles</li>" +
            "<li>CCG Individual Cards</li>" +
            "<li>Sports Trading Card Singles</li></ul></span>")
    public List<ConditionDescriptor> getConditionDescriptors() {
        return conditionDescriptors;
    }

    public Item conditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    /**
     * The identifier of the condition of the item. For example, 1000 is the identifier for NEW.
     * For a list of condition names and IDs, see
     * <a href="https://developer.ebay.com/devzone/finding/callref/enums/conditionIdList.html " target="_blank">
     * Item Condition IDs and Names</a>.
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return conditionId
     **/
    @Schema(description = "The identifier of the condition of the item. For example, 1000 is the identifier " +
            "for NEW. For a list of condition names and IDs, see " +
            "<a href=\"https://developer.ebay.com/devzone/finding/callref/enums/conditionIdList.html \" target=\"_blank\">" +
            "Item Condition IDs and Names</a>. " +
            "<br><br>Code so that your app gracefully handles any future changes to this list.")
    public String getConditionId() {
        return conditionId;
    }

    public Item currentBidPrice(ConvertedAmount currentBidPrice) {
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

    public Item description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The full description of the item that was created by the seller. This can be plain text or
     * rich content and can be very large.
     *
     * @return description
     **/
    @Schema(description = "The full description of the item that was created by the seller. This can be " +
            "plain text or rich content and can be very large.")
    public String getDescription() {
        return description;
    }

    public Item ecoParticipationFee(ConvertedAmount ecoParticipationFee) {
        this.ecoParticipationFee = ecoParticipationFee;
        return this;
    }

    /**
     * Get ecoParticipationFee
     *
     * @return ecoParticipationFee
     **/
    @Schema(description = "")
    public ConvertedAmount getEcoParticipationFee() {
        return ecoParticipationFee;
    }

    public Item eligibleForInlineCheckout(Boolean eligibleForInlineCheckout) {
        this.eligibleForInlineCheckout = eligibleForInlineCheckout;
        return this;
    }

    /**
     * This field indicates if the item can be purchased using the Buy
     * <a href="/api-docs/buy/order/resources/methods">Order API</a>. <ul> <li>If the value of
     * this field is <code>true</code>, this indicates that the item can be purchased using
     * the <b> Order API</b>. </li>  <li>If the value of this field is <code>false</code>, this
     * indicates that the item cannot be purchased using the <b> Order API</b> and must be purchased
     * on the eBay site.</li> </ul>
     *
     * @return eligibleForInlineCheckout
     **/
    @Schema(description = "This field indicates if the item can be purchased using the Buy " +
            "<a href=\"/api-docs/buy/order/resources/methods\">Order API</a>. <ul> <li>If the value " +
            "of this field is <code>true</code>, this indicates that the item can be purchased using " +
            "the <b> Order API</b>. </li>  <li>If the value of this field is <code>false</code>, " +
            "this indicates that the item cannot be purchased using the <b> Order API</b> and must be " +
            "purchased on the eBay site.</li> </ul>")
    public Boolean isEligibleForInlineCheckout() {
        return eligibleForInlineCheckout;
    }

    public Item enabledForGuestCheckout(Boolean enabledForGuestCheckout) {
        this.enabledForGuestCheckout = enabledForGuestCheckout;
        return this;
    }

    /**
     * This indicates if the item can be purchased using Guest Checkout in the
     * <a href="/api-docs/buy/order/resources/methods">Order API</a>. You can use this flag
     * to exclude items from your inventory that are not eligible for Guest Checkout, such as gift cards.
     *
     * @return enabledForGuestCheckout
     **/
    @Schema(description = "This indicates if the item can be purchased using Guest Checkout in the " +
            "<a href=\"/api-docs/buy/order/resources/methods\">Order API</a>. You can use this flag " +
            "to exclude items from your inventory that are not eligible for Guest Checkout, such as gift cards.")
    public Boolean isEnabledForGuestCheckout() {
        return enabledForGuestCheckout;
    }

    public Item energyEfficiencyClass(String energyEfficiencyClass) {
        this.energyEfficiencyClass = energyEfficiencyClass;
        return this;
    }

    /**
     * This indicates the <a href="https://en.wikipedia.org/wiki/European_Union_energy_label ">
     * European energy efficiency</a> rating (EEK) of the item. This field is returned only if
     * the seller specified the energy efficiency rating. <br><br>The rating is a set of energy
     * efficiency classes from A to G, where 'A' is the most energy efficient and 'G' is the least
     * efficient. This rating helps buyers choose between various models. <br><br>When the manufacturer's
     * specifications for this item are available, the link to this information is returned in
     * the <b> productFicheWebUrl</b> field.
     *
     * @return energyEfficiencyClass
     **/
    @Schema(description = "This indicates the <a href=\"https://en.wikipedia.org/wiki/European_Union_energy_label \">" +
            "European energy efficiency</a> rating (EEK) of the item. This field is returned only if " +
            "the seller specified the energy efficiency rating. <br><br>The rating is a set of energy " +
            "efficiency classes from A to G, where 'A' is the most energy efficient and 'G' is the least " +
            "efficient. This rating helps buyers choose between various models. " +
            "<br><br>When the manufacturer's specifications for this item are available, the link to this " +
            "information is returned in the <b> productFicheWebUrl</b> field.")
    public String getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    public Item epid(String epid) {
        this.epid = epid;
        return this;
    }

    /**
     * An EPID is the eBay product identifier of a product from the eBay product catalog.
     * This indicates the product in which the item belongs.
     *
     * @return epid
     **/
    @Schema(description = "An EPID is the eBay product identifier of a product from the eBay product catalog. " +
            "This indicates the product in which the item belongs.")
    public String getEpid() {
        return epid;
    }

    public Item estimatedAvailabilities(List<EstimatedAvailability> estimatedAvailabilities) {
        this.estimatedAvailabilities = estimatedAvailabilities;
        return this;
    }

    public Item addEstimatedAvailabilitiesItem(EstimatedAvailability estimatedAvailabilitiesItem) {
        if (this.estimatedAvailabilities == null) {
            this.estimatedAvailabilities = new ArrayList<>();
        }
        this.estimatedAvailabilities.add(estimatedAvailabilitiesItem);
        return this;
    }

    /**
     * The estimated number of this item that are available for purchase. Because the quantity of
     * an item can change several times within a second, it is impossible to return the exact quantity.
     * So instead of returning quantity, the estimated availability of the item is returned.
     *
     * @return estimatedAvailabilities
     **/
    @Schema(description = "The estimated number of this item that are available for purchase. Because " +
            "the quantity of an item can change several times within a second, it is impossible to return " +
            "the exact quantity. So instead of returning quantity, the estimated availability of the item " +
            "is returned.")
    public List<EstimatedAvailability> getEstimatedAvailabilities() {
        return estimatedAvailabilities;
    }

    public Item gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * (Primary Item Aspect) The gender for the item. This is used for items that could vary
     * by gender, such as clothing. For example: male, female, or unisex. All the item aspects,
     * including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return gender
     **/
    @Schema(description = "(Primary Item Aspect) The gender for the item. This is used for items " +
            "that could vary by gender, such as clothing. For example: male, female, or unisex. All " +
            "the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getGender() {
        return gender;
    }

    public Item gtin(String gtin) {
        this.gtin = gtin;
        return this;
    }

    /**
     * The unique Global Trade Item number of the item as defined by
     * <a href="https://www.gtin.info " target="_blank">https://www.gtin.info</a>.
     * This can be a UPC (Universal Product Code),
     * EAN (European Article Number), or an
     * ISBN (International Standard Book Number) value.
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

    public Item hazardousMaterialsLabels(HazardousMaterialsLabels hazardousMaterialsLabels) {
        this.hazardousMaterialsLabels = hazardousMaterialsLabels;
        return this;
    }

    /**
     * Get hazardousMaterialsLabels
     *
     * @return hazardousMaterialsLabels
     **/
    @Schema(description = "")
    public HazardousMaterialsLabels getHazardousMaterialsLabels() {
        return hazardousMaterialsLabels;
    }

    public Item image(Image image) {
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

    public Item inferredEpid(String inferredEpid) {
        this.inferredEpid = inferredEpid;
        return this;
    }

    /**
     * The ePID (eBay Product ID of a product from the eBay product catalog) for the item, which has been
     * programmatically determined by eBay using the item's title, aspects, and other data.
     * <br><br>If the seller provided an ePID for the item, the seller's value is returned in
     * the <b> epid</b> field.
     * <br><br><span class="tablenote"><b> Note: </b> This field is returned only for authorized Partners.</span>
     *
     * @return inferredEpid
     **/
    @Schema(description = "The ePID (eBay Product ID of a product from the eBay product catalog) for " +
            "the item, which has been programmatically determined by eBay using the item's title, aspects, " +
            "and other data. <br><br>If the seller provided an ePID for the item, the seller's value " +
            "is returned in the <b> epid</b> field. <br><br><span class=\"tablenote\"><b> Note: </b> " +
            "This field is returned only for authorized Partners.</span>")
    public String getInferredEpid() {
        return inferredEpid;
    }

    public Item itemAffiliateWebUrl(String itemAffiliateWebUrl) {
        this.itemAffiliateWebUrl = itemAffiliateWebUrl;
        return this;
    }

    /**
     * The URL to the View Item page of the item which includes the affiliate tracking ID.
     * <br><br><span class="tablenote"><b>Note:</b> In order to receive commissions on sales,
     * eBay Partner Network affiliates must use this URL to forward buyers to the listing on
     * the eBay marketplace.</span><br>The <b>itemAffiliateWebUrl</b> is only returned if:<ul>
     * <li>The marketplace through which the item is being viewed is part of the eBay Partner
     * Network. Currently Poland (<code>EBAY_PL</code>) and Singapore (<code>EBAY_SG</code>)
     * are <b>not</b> supported.<br><br>For additional information, refer to
     * <a href="https://partnerhelp.ebay.com/helpcenter/s/article/countries-available-as-a-program-in-EPN?language=en_US " target="_blank">
     * eBay Partner Network</a>.</li><li>The seller enables affiliate tracking for the item
     * by including the <code><a href="/api-docs/buy/static/api-browse.html#Headers">X-EBAY-C-ENDUSERCTX</a></code>
     * request header in the method.</li></ul>
     *
     * @return itemAffiliateWebUrl
     **/
    @Schema(description = "The URL to the View Item page of the item which includes the affiliate " +
            "tracking ID.<br><br><span class=\"tablenote\"><b>Note:</b> In order to receive commissions " +
            "on sales, eBay Partner Network affiliates must use this URL to forward buyers to the listing " +
            "on the eBay marketplace.</span><br>The <b>itemAffiliateWebUrl</b> is only returned if:" +
            "<ul><li>The marketplace through which the item is being viewed is part of the eBay Partner " +
            "Network. Currently Poland (<code>EBAY_PL</code>) and Singapore (<code>EBAY_SG</code>) " +
            "are <b>not</b> supported.<br><br>For additional information, refer to " +
            "<a href=\"https://partnerhelp.ebay.com/helpcenter/s/article/countries-available-as-a-program-in-EPN?language=en_US \" target=\"_blank\">" +
            "eBay Partner Network</a>.</li><li>The seller enables affiliate tracking for the item by " +
            "including the <code><a href=\"/api-docs/buy/static/api-browse.html#Headers\">X-EBAY-C-ENDUSERCTX</a></code> " +
            "request header in the method.</li></ul>")
    public String getItemAffiliateWebUrl() {
        return itemAffiliateWebUrl;
    }

    public Item itemCreationDate(String itemCreationDate) {
        this.itemCreationDate = itemCreationDate;
        return this;
    }

    /**
     * A timestamp that indicates the date and time an item listing was created.
     * <br><br>This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which can
     * be converted into the local time of the buyer.
     *
     * @return itemCreationDate
     **/
    @Schema(description = "A timestamp that indicates the date and time an item listing was created." +
            "<br><br>This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which can be " +
            "converted into the local time of the buyer.")
    public String getItemCreationDate() {
        return itemCreationDate;
    }

    public Item itemEndDate(String itemEndDate) {
        this.itemEndDate = itemEndDate;
        return this;
    }

    /**
     * This timestamp indicates the date and time up to which the item can be purchased.
     * This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert
     * into the local time of the buyer.<br><br><span class="tablenote"><b> Note: </b>
     * This field is only returned for auction listings.</span>
     *
     * @return itemEndDate
     **/
    @Schema(description = "This timestamp indicates the date and time up to which the item can be purchased.  " +
            "This value is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into " +
            "the local time of the buyer.<br><br><span class=\"tablenote\"><b> Note: </b>This field is " +
            "only returned for auction listings.</span>")
    public String getItemEndDate() {
        return itemEndDate;
    }

    public Item itemId(String itemId) {
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

    public Item itemLocation(Address itemLocation) {
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

    public Item itemWebUrl(String itemWebUrl) {
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
    @Schema(description = "The URL of the View Item page of the item. This enables you to include a " +
            "\"Report Item on eBay\" link that takes the buyer to the View Item page on eBay. " +
            "From there they can report any issues regarding this item to eBay.")
    public String getItemWebUrl() {
        return itemWebUrl;
    }

    public Item legacyItemId(String legacyItemId) {
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

    public Item listingMarketplaceId(String listingMarketplaceId) {
        this.listingMarketplaceId = listingMarketplaceId;
        return this;
    }

    /**
     * The ID of the eBay marketplace where the item is listed. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
     *
     * @return listingMarketplaceId
     **/
    @Schema(description = "The ID of the eBay marketplace where the item is listed. For implementation " +
            "help, refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:MarketplaceIdEnum'>" +
            "eBay API documentation</a>")
    public String getListingMarketplaceId() {
        return listingMarketplaceId;
    }

    public Item localizedAspects(List<TypedNameValue> localizedAspects) {
        this.localizedAspects = localizedAspects;
        return this;
    }

    public Item addLocalizedAspectsItem(TypedNameValue localizedAspectsItem) {
        if (this.localizedAspects == null) {
            this.localizedAspects = new ArrayList<>();
        }
        this.localizedAspects.add(localizedAspectsItem);
        return this;
    }

    /**
     * An array of containers that show the complete list of the aspect name/value pairs that
     * describe the variation of the item.
     *
     * @return localizedAspects
     **/
    @Schema(description = "An array of containers that show the complete list of the aspect name/value " +
            "pairs that describe the variation of the item.")
    public List<TypedNameValue> getLocalizedAspects() {
        return localizedAspects;
    }

    public Item lotSize(Integer lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    /**
     * The number of items in a lot. In other words, a lot size is the number of items that are
     * being sold together.  <br><br>A lot is a set of two or more items included in a single
     * listing that must be purchased together in a single order line item. All the items in
     * the lot are the same but there can be multiple items in a single lot,  such as the package
     * of batteries shown in the example below.
     * <br><br><table border="1"> <tr> <tr>  <th>Item</th>  <th>Lot Definition</th> <th>Lot Size</th></tr>
     * <tr>  <td>A package of 24 AA batteries</td>  <td>A box of 10 packages</td>  <td>10  </td> </tr>
     * <tr>  <td>A P235/75-15 Goodyear tire </td>  <td>4 tires  </td>  <td>4  </td> </tr>
     * <tr> <td>Fashion Jewelry Rings  </td> <td>Package of 100 assorted rings  </td> <td>100 </td> </tr></table>
     * <br><br><span class="tablenote"><b>Note: </b>  Lots are not supported in all categories.  </span>
     *
     * @return lotSize
     **/
    @Schema(description = "The number of items in a lot. In other words, a lot size is the number of " +
            "items that are being sold together.  <br><br>A lot is a set of two or more items included " +
            "in a single listing that must be purchased together in a single order line item. All the " +
            "items in the lot are the same but there can be multiple items in a single lot,  such as " +
            "the package of batteries shown in the example below.   <br><br><table border=\"1\"> <tr> <tr>  " +
            "<th>Item</th>  <th>Lot Definition</th> <th>Lot Size</th></tr>  " +
            "<tr>  <td>A package of 24 AA batteries</td>  <td>A box of 10 packages</td>  <td>10  </td> </tr>  " +
            "<tr>  <td>A P235/75-15 Goodyear tire </td>  <td>4 tires  </td>  <td>4  </td> </tr> " +
            "<tr> <td>Fashion Jewelry Rings  </td> <td>Package of 100 assorted rings  </td> <td>100 </td> </tr></table>  " +
            "<br><br><span class=\"tablenote\"><b>Note: </b>  Lots are not supported in all categories.  </span>")
    public Integer getLotSize() {
        return lotSize;
    }

    public Item marketingPrice(MarketingPrice marketingPrice) {
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

    public Item material(String material) {
        this.material = material;
        return this;
    }

    /**
     * (Primary Item Aspect) Text describing what the item is made of. For example, silk. All
     * the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return material
     **/
    @Schema(description = "(Primary Item Aspect) Text describing what the item is made of. For example, " +
            "silk. All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> " +
            "container.")
    public String getMaterial() {
        return material;
    }

    public Item minimumPriceToBid(ConvertedAmount minimumPriceToBid) {
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

    public Item mpn(String mpn) {
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

    public Item pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * (Primary Item Aspect) Text describing the pattern used on the item. For example, paisley.
     * All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return pattern
     **/
    @Schema(description = "(Primary Item Aspect) Text describing the pattern used on the item. For " +
            "example, paisley. All the item aspects, including this aspect, are returned in the <b> " +
            "localizedAspects</b> container.")
    public String getPattern() {
        return pattern;
    }

    public Item paymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
        return this;
    }

    public Item addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
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

    public Item price(ConvertedAmount price) {
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

    public Item priceDisplayCondition(String priceDisplayCondition) {
        this.priceDisplayCondition = priceDisplayCondition;
        return this;
    }

    /**
     * Indicates when in the buying flow the item's price can appear for minimum advertised price
     * (MAP) items, which is the lowest price a retailer can advertise/show for this item.
     * For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PriceDisplayConditionEnum'>
     * eBay API documentation</a>
     *
     * @return priceDisplayCondition
     **/
    @Schema(description = "Indicates when in the buying flow the item's price can appear for minimum " +
            "advertised price (MAP) items, which is the lowest price a retailer can advertise/show for " +
            "this item. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PriceDisplayConditionEnum'>" +
            "eBay API documentation</a>")
    public String getPriceDisplayCondition() {
        return priceDisplayCondition;
    }

    public Item primaryItemGroup(ItemGroupSummary primaryItemGroup) {
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

    public Item primaryProductReviewRating(ReviewRating primaryProductReviewRating) {
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

    public Item priorityListing(Boolean priorityListing) {
        this.priorityListing = priorityListing;
        return this;
    }

    /**
     * This field is returned as <code>true</code> if the listing is part of a Promoted Listing
     * campaign. Promoted Listings are available to Above Standard and Top Rated sellers with
     * recent sales activity.<br><br>For more information, see
     * <a href="https://pages.ebay.com/seller-center/listing-and-marketing/promoted-listings.html " target="_blank">
     * Promoted Listings</a>.
     *
     * @return priorityListing
     **/
    @Schema(description = "This field is returned as <code>true</code> if the listing is part of " +
            "a Promoted Listing campaign. Promoted Listings are available to Above Standard and Top Rated " +
            "sellers with recent sales activity.<br><br>For more information, see " +
            "<a href=\"https://pages.ebay.com/seller-center/listing-and-marketing/promoted-listings.html \" target=\"_blank\">" +
            "Promoted Listings</a>.")
    public Boolean isPriorityListing() {
        return priorityListing;
    }

    public Item product(Product product) {
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

    public Item productFicheWebUrl(String productFicheWebUrl) {
        this.productFicheWebUrl = productFicheWebUrl;
        return this;
    }

    /**
     * The URL of a page containing the manufacturer's specification of this item, which helps
     * buyers make a purchasing decision. This information is available only for items that include
     * the European energy efficiency rating (EEK) but is not available for <em> all</em> items with
     * an EEK rating and is returned only if this information is available. The EEK rating of the
     * item is returned in the <b> energyEfficiencyClass</b> field.
     *
     * @return productFicheWebUrl
     **/
    @Schema(description = "The URL of a page containing the manufacturer's specification of this item, " +
            "which helps buyers make a purchasing decision. This information is available only for items " +
            "that include the European energy efficiency rating (EEK) but is not available for <em> all</em> " +
            "items with an EEK rating and is returned only if this information is available. The EEK rating " +
            "of the item is returned in the <b> energyEfficiencyClass</b> field.")
    public String getProductFicheWebUrl() {
        return productFicheWebUrl;
    }

    public Item qualifiedPrograms(List<String> qualifiedPrograms) {
        this.qualifiedPrograms = qualifiedPrograms;
        return this;
    }

    public Item addQualifiedProgramsItem(String qualifiedProgramsItem) {
        if (this.qualifiedPrograms == null) {
            this.qualifiedPrograms = new ArrayList<>();
        }
        this.qualifiedPrograms.add(qualifiedProgramsItem);
        return this;
    }

    /**
     * An array of the qualified programs available for the item, or for the item group when
     * returned for the <b>getItemsByItemGroup</b> method, such as EBAY_PLUS, AUTHENTICITY_GUARANTEE,
     * and AUTHENTICITY_VERIFICATION.<br><br><span class="tablenote"><b>Note: </b>
     * The <code>AUTHENTICITY_GUARANTEE</code> value being returned by the <b>getItemsByItemGroup</b>
     * method indicates that at least one item in the item group supports this program, but doesn't
     * guarantee that the program is available to all items in the item group. To verify if
     * the Authenticity Program is indeed available for the item that you are interested in, grab
     * the <b>items.itemId</b> value for that item and use the <b>getItem</b> method. This method
     * will return specific details on that particular item, including whether or not the Authenticity
     * Guarantee Program is available for the item. Look for the <b>qualifiedPrograms</b> array and
     * <b>authenticityGuarantee</b> container in the <b>getItem</b> response for this information.</span>
     * <br><br>eBay Plus is a premium account option for buyers, which provides benefits such as fast
     * free domestic shipping and free returns on selected items. Top-Rated eBay sellers must opt in
     * to eBay Plus to be able to offer the program on qualifying listings. Sellers must commit to
     * next-day delivery of those items.<br><br><span class="tablenote"><b>Note: </b> eBay Plus is
     * available only to buyers in Germany, Austria, and Australia marketplaces.</span><br><br>The eBay
     * <a href="https://pages.ebay.com/authenticity-guarantee/ " target="_blank">Authenticity Guarantee</a>
     * program enables third-party authenticators to perform authentication verification inspections
     * on items such as watches and sneakers.
     *
     * @return qualifiedPrograms
     **/
    @Schema(description = "An array of the qualified programs available for the item, or for " +
            "the item group when returned for the <b>getItemsByItemGroup</b> method, such as EBAY_PLUS, " +
            "AUTHENTICITY_GUARANTEE, and AUTHENTICITY_VERIFICATION.<br><br><span class=\"tablenote\">" +
            "<b>Note: </b>The <code>AUTHENTICITY_GUARANTEE</code> value being returned by the " +
            "<b>getItemsByItemGroup</b> method indicates that at least one item in the item group " +
            "supports this program, but doesn't guarantee that the program is available to all items " +
            "in the item group. To verify if the Authenticity Program is indeed available for the item " +
            "that you are interested in, grab the <b>items.itemId</b> value for that item and use " +
            "the <b>getItem</b> method. This method will return specific details on that particular " +
            "item, including whether or not the Authenticity Guarantee Program is available for the item. " +
            "Look for the <b>qualifiedPrograms</b> array and <b>authenticityGuarantee</b> container " +
            "in the <b>getItem</b> response for this information.</span><br><br>eBay Plus is a premium " +
            "account option for buyers, which provides benefits such as fast free domestic shipping " +
            "and free returns on selected items. Top-Rated eBay sellers must opt in to eBay Plus to " +
            "be able to offer the program on qualifying listings. Sellers must commit to next-day " +
            "delivery of those items.<br><br><span class=\"tablenote\"><b>Note: </b> eBay Plus is " +
            "available only to buyers in Germany, Austria, and Australia marketplaces.</span>" +
            "<br><br>The eBay <a href=\"https://pages.ebay.com/authenticity-guarantee/ \" target=\"_blank\">" +
            "Authenticity Guarantee</a> program enables third-party authenticators to perform " +
            "authentication verification inspections on items such as watches and sneakers.")
    public List<String> getQualifiedPrograms() {
        return qualifiedPrograms;
    }

    public Item quantityLimitPerBuyer(Integer quantityLimitPerBuyer) {
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

    public Item repairScore(String repairScore) {
        this.repairScore = repairScore;
        return this;
    }

    /**
     * A score that describes how easy it is to repair the product. Score values range from 0.1
     * (hardest to repair) to 10.0 (easiest), always including a single decimal place.
     * <br><br><span class="tablenote"><b>Note:</b> Support for this field is currently limited
     * to the France marketplace.</span>
     *
     * @return repairScore
     **/
    @Schema(description = "A score that describes how easy it is to repair the product. Score " +
            "values range from 0.1 (hardest to repair) to 10.0 (easiest), always including a single " +
            "decimal place.<br><br><span class=\"tablenote\"><b>Note:</b> Support for this field is " +
            "currently limited to the France marketplace.</span>")
    public String getRepairScore() {
        return repairScore;
    }

    public Item reservePriceMet(Boolean reservePriceMet) {
        this.reservePriceMet = reservePriceMet;
        return this;
    }

    /**
     * This indicates if the reserve price of the item has been met. A reserve price is set by
     * the seller and is the minimum amount the seller is willing to sell the item for. <p>If the
     * highest bid is not equal to or higher than the reserve price when the auction ends, the listing
     * ends and the item is not sold.</p> <p><b> Note: </b>This is returned only for auctions that
     * have a reserve price.</p>
     *
     * @return reservePriceMet
     **/
    @Schema(description = "This indicates if the reserve price of the item has been met. A reserve " +
            "price is set by the seller and is the minimum amount the seller is willing to sell the " +
            "item for. <p>If the highest bid is not equal to or higher than the reserve price when " +
            "the auction ends, the listing ends and the item is not sold.</p> <p><b> Note: </b>This " +
            "is returned only for auctions that have a reserve price.</p>")
    public Boolean isReservePriceMet() {
        return reservePriceMet;
    }

    public Item returnTerms(ItemReturnTerms returnTerms) {
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

    public Item seller(SellerDetail seller) {
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

    public Item sellerCustomPolicies(List<SellerCustomPolicy> sellerCustomPolicies) {
        this.sellerCustomPolicies = sellerCustomPolicies;
        return this;
    }

    public Item addSellerCustomPoliciesItem(SellerCustomPolicy sellerCustomPoliciesItem) {
        if (this.sellerCustomPolicies == null) {
            this.sellerCustomPolicies = new ArrayList<>();
        }
        this.sellerCustomPolicies.add(sellerCustomPoliciesItem);
        return this;
    }

    /**
     * A list of the custom policies that are applied to a listing.
     *
     * @return sellerCustomPolicies
     **/
    @Schema(description = "A list of the custom policies that are applied to a listing.")
    public List<SellerCustomPolicy> getSellerCustomPolicies() {
        return sellerCustomPolicies;
    }

    public Item sellerItemRevision(String sellerItemRevision) {
        this.sellerItemRevision = sellerItemRevision;
        return this;
    }

    /**
     * An identifier generated/incremented when a seller revises the item. There are two types
     * of item revisions: <ul><li>Seller changes, such as changing the title</li>
     * <li>eBay system changes, such as changing the quantity when an item is purchased</li></ul>
     * This ID is changed <em> only</em> when the seller makes a change to the item. This means
     * you cannot use this value to determine if the quantity has changed.
     *
     * @return sellerItemRevision
     **/
    @Schema(description = "An identifier generated/incremented when a seller revises the item. " +
            "There are two types of item revisions: <ul><li>Seller changes, such as changing the title</li>  " +
            "<li>eBay system changes, such as changing the quantity when an item is purchased</li></ul> " +
            "This ID is changed <em> only</em> when the seller makes a change to the item. This means " +
            "you cannot use this value to determine if the quantity has changed.")
    public String getSellerItemRevision() {
        return sellerItemRevision;
    }

    public Item shippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
        return this;
    }

    public Item addShippingOptionsItem(ShippingOption shippingOptionsItem) {
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

    public Item shipToLocations(ShipToLocations shipToLocations) {
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

    public Item shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * This text string is derived from the item condition and the item aspects (such as size,
     * color, capacity, model, brand, etc.).
     *
     * @return shortDescription
     **/
    @Schema(description = "This text string is derived from the item condition and the item aspects " +
            "(such as size, color, capacity, model, brand, etc.).")
    public String getShortDescription() {
        return shortDescription;
    }

    public Item size(String size) {
        this.size = size;
        return this;
    }

    /**
     * (Primary Item Aspect) The size of the item. For example, '7' for a size 7 shoe. All the item
     * aspects, including this aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return size
     **/
    @Schema(description = "(Primary Item Aspect) The size of the item. For example, '7' for a size " +
            "7 shoe. All the item aspects, including this aspect, are returned in the <b> localizedAspects</b> " +
            "container.")
    public String getSize() {
        return size;
    }

    public Item sizeSystem(String sizeSystem) {
        this.sizeSystem = sizeSystem;
        return this;
    }

    /**
     * (Primary Item Aspect) The sizing system of the country.  All the item aspects, including
     * this aspect, are returned in the <b> localizedAspects</b> container. <br><br><b> Valid Values: </b>
     * <br>AU (Australia),  <br>BR (Brazil), <br>CN (China),  <br>DE (Germany),  <br>EU (European Union),
     * <br> FR (France), <br> IT (Italy),  <br>JP (Japan), <br>MX (Mexico),  <br>US (USA),
     * <br> UK (United Kingdom) <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return sizeSystem
     **/
    @Schema(description = "(Primary Item Aspect) The sizing system of the country.  All the item aspects, " +
            "including this aspect, are returned in the <b> localizedAspects</b> container. " +
            "<br><br><b> Valid Values: </b> <br>AU (Australia),  <br>BR (Brazil), <br>CN (China),  " +
            "<br>DE (Germany),  <br>EU (European Union),  <br> FR (France), <br> IT (Italy),  " +
            "<br>JP (Japan), <br>MX (Mexico),  <br>US (USA), <br> UK (United Kingdom) <br><br>Code " +
            "so that your app gracefully handles any future changes to this list. ")
    public String getSizeSystem() {
        return sizeSystem;
    }

    public Item sizeType(String sizeType) {
        this.sizeType = sizeType;
        return this;
    }

    /**
     * (Primary Item Aspect) Text describing a size group in which the item would be included, such
     * as regular, petite, plus, big-and-tall or maternity. All the item aspects, including this
     * aspect, are returned in the <b> localizedAspects</b> container.
     *
     * @return sizeType
     **/
    @Schema(description = "(Primary Item Aspect) Text describing a size group in which the item " +
            "would be included, such as regular, petite, plus, big-and-tall or maternity. All " +
            "the item aspects, including this aspect, are returned in the <b> localizedAspects</b> container.")
    public String getSizeType() {
        return sizeType;
    }

    public Item subtitle(String subtitle) {
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

    public Item taxes(List<Taxes> taxes) {
        this.taxes = taxes;
        return this;
    }

    public Item addTaxesItem(Taxes taxesItem) {
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

    public Item title(String title) {
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

    public Item topRatedBuyingExperience(Boolean topRatedBuyingExperience) {
        this.topRatedBuyingExperience = topRatedBuyingExperience;
        return this;
    }

    /**
     * This indicates if the item a top-rated plus item. There are three benefits of a top-rated
     * plus item: a  minimum 30-day money-back return policy, shipping the items in 1 business
     * day with tracking provided, and the added comfort of knowing this item is from experienced
     * sellers with the highest buyer ratings. See the
     * <a href="https://pages.ebay.com/topratedplus/index.html " target="_blank">Top Rated Plus Items </a>
     * and <a href="https://pages.ebay.com/help/sell/top-rated.html " target="_blank">Becoming a Top Rated
     * Seller and qualifying for Top Rated Plus</a> help topics for more information.
     *
     * @return topRatedBuyingExperience
     **/
    @Schema(description = "This indicates if the item a top-rated plus item. There are three benefits of " +
            "a top-rated plus item: a  minimum 30-day money-back return policy, shipping the items in 1 " +
            "business day with tracking provided, and the added comfort of knowing this item is from " +
            "experienced sellers with the highest buyer ratings. See the " +
            "<a href=\"https://pages.ebay.com/topratedplus/index.html \" target=\"_blank\">Top Rated Plus Items </a> " +
            "and <a href=\"https://pages.ebay.com/help/sell/top-rated.html \" target=\"_blank\">" +
            "Becoming a Top Rated Seller and qualifying for Top Rated Plus</a> help topics for more information.")
    public Boolean isTopRatedBuyingExperience() {
        return topRatedBuyingExperience;
    }

    public Item tyreLabelImageUrl(String tyreLabelImageUrl) {
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

    public Item uniqueBidderCount(Integer uniqueBidderCount) {
        this.uniqueBidderCount = uniqueBidderCount;
        return this;
    }

    /**
     * This integer value indicates the number of different eBay users who have placed one or more
     * bids on an auction item. This field is only applicable to auction items.
     *
     * @return uniqueBidderCount
     **/
    @Schema(description = "This integer value indicates the number of different eBay users who have " +
            "placed one or more bids on an auction item. This field is only applicable to auction items.")
    public Integer getUniqueBidderCount() {
        return uniqueBidderCount;
    }

    public Item unitPrice(ConvertedAmount unitPrice) {
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

    public Item unitPricingMeasure(String unitPricingMeasure) {
        this.unitPricingMeasure = unitPricingMeasure;
        return this;
    }

    /**
     * The designation, such as size, weight, volume, count, etc., that was used to specify
     * the quantity of the item.  This helps buyers compare prices.
     * <br><br>For example, the following tells the buyer that the item is 7.99 per 100 grams.
     * <br><br><code>"unitPricingMeasure": "100g",<br> "unitPrice": {<br>&nbsp;&nbsp;"value": "7.99",
     * <br>&nbsp;&nbsp;"currency": "GBP"</code>
     *
     * @return unitPricingMeasure
     **/
    @Schema(description = "The designation, such as size, weight, volume, count, etc., that was used " +
            "to specify the quantity of the item.  This helps buyers compare prices. " +
            "<br><br>For example, the following tells the buyer that the item is 7.99 per 100 grams. " +
            "<br><br><code>\"unitPricingMeasure\": \"100g\",<br> \"unitPrice\": " +
            "{<br>&nbsp;&nbsp;\"value\": \"7.99\",<br>&nbsp;&nbsp;\"currency\": \"GBP\"</code>")
    public String getUnitPricingMeasure() {
        return unitPricingMeasure;
    }

    public Item warnings(List<Error> warnings) {
        this.warnings = warnings;
        return this;
    }

    public Item addWarningsItem(Error warningsItem) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.add(warningsItem);
        return this;
    }

    /**
     * An array of warning messages. These types of errors do not prevent the method from executing
     * but should be checked.
     *
     * @return warnings
     **/
    @Schema(description = "An array of warning messages. These types of errors do not prevent the method " +
            "from executing but should be checked.")
    public List<Error> getWarnings() {
        return warnings;
    }

    public Item watchCount(Integer watchCount) {
        this.watchCount = watchCount;
        return this;
    }

    /**
     * The number of users that have added the item to their watch list.
     * <br><br><span class="tablenote"> <strong>Note:</strong> This field is restricted to
     * applications that have been granted permission to access this feature. You must submit an
     * <a href="https://developer.ebay.com/my/support/tickets?tab=app-check ">App Check ticket</a>
     * to request this access. In the App Check form, add a note to the <b>Application Title/Summary</b>
     * and/or <b>Application Details</b> fields that you want access to Watch Count data in the Browse API.</span>
     *
     * @return watchCount
     **/
    @Schema(description = "The number of users that have added the item to their watch list." +
            "<br><br><span class=\"tablenote\"> <strong>Note:</strong> This field is restricted to " +
            "applications that have been granted permission to access this feature. You must submit an " +
            "<a href=\"https://developer.ebay.com/my/support/tickets?tab=app-check \">App Check ticket</a> " +
            "to request this access. In the App Check form, add a note to the <b>Application Title/Summary</b> " +
            "and/or <b>Application Details</b> fields that you want access to Watch Count data " +
            "in the Browse API.</span>")
    public Integer getWatchCount() {
        return watchCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(this.additionalImages, item.additionalImages) &&
                Objects.equals(this.addonServices, item.addonServices) &&
                Objects.equals(this.adultOnly, item.adultOnly) &&
                Objects.equals(this.ageGroup, item.ageGroup) &&
                Objects.equals(this.authenticityGuarantee, item.authenticityGuarantee) &&
                Objects.equals(this.authenticityVerification, item.authenticityVerification) &&
                Objects.equals(this.availableCoupons, item.availableCoupons) &&
                Objects.equals(this.bidCount, item.bidCount) &&
                Objects.equals(this.brand, item.brand) &&
                Objects.equals(this.buyingOptions, item.buyingOptions) &&
                Objects.equals(this.categoryId, item.categoryId) &&
                Objects.equals(this.categoryIdPath, item.categoryIdPath) &&
                Objects.equals(this.categoryPath, item.categoryPath) &&
                Objects.equals(this.color, item.color) &&
                Objects.equals(this.condition, item.condition) &&
                Objects.equals(this.conditionDescription, item.conditionDescription) &&
                Objects.equals(this.conditionDescriptors, item.conditionDescriptors) &&
                Objects.equals(this.conditionId, item.conditionId) &&
                Objects.equals(this.currentBidPrice, item.currentBidPrice) &&
                Objects.equals(this.description, item.description) &&
                Objects.equals(this.ecoParticipationFee, item.ecoParticipationFee) &&
                Objects.equals(this.eligibleForInlineCheckout, item.eligibleForInlineCheckout) &&
                Objects.equals(this.enabledForGuestCheckout, item.enabledForGuestCheckout) &&
                Objects.equals(this.energyEfficiencyClass, item.energyEfficiencyClass) &&
                Objects.equals(this.epid, item.epid) &&
                Objects.equals(this.estimatedAvailabilities, item.estimatedAvailabilities) &&
                Objects.equals(this.gender, item.gender) &&
                Objects.equals(this.gtin, item.gtin) &&
                Objects.equals(this.hazardousMaterialsLabels, item.hazardousMaterialsLabels) &&
                Objects.equals(this.image, item.image) &&
                Objects.equals(this.inferredEpid, item.inferredEpid) &&
                Objects.equals(this.itemAffiliateWebUrl, item.itemAffiliateWebUrl) &&
                Objects.equals(this.itemCreationDate, item.itemCreationDate) &&
                Objects.equals(this.itemEndDate, item.itemEndDate) &&
                Objects.equals(this.itemId, item.itemId) &&
                Objects.equals(this.itemLocation, item.itemLocation) &&
                Objects.equals(this.itemWebUrl, item.itemWebUrl) &&
                Objects.equals(this.legacyItemId, item.legacyItemId) &&
                Objects.equals(this.listingMarketplaceId, item.listingMarketplaceId) &&
                Objects.equals(this.localizedAspects, item.localizedAspects) &&
                Objects.equals(this.lotSize, item.lotSize) &&
                Objects.equals(this.marketingPrice, item.marketingPrice) &&
                Objects.equals(this.material, item.material) &&
                Objects.equals(this.minimumPriceToBid, item.minimumPriceToBid) &&
                Objects.equals(this.mpn, item.mpn) &&
                Objects.equals(this.pattern, item.pattern) &&
                Objects.equals(this.paymentMethods, item.paymentMethods) &&
                Objects.equals(this.price, item.price) &&
                Objects.equals(this.priceDisplayCondition, item.priceDisplayCondition) &&
                Objects.equals(this.primaryItemGroup, item.primaryItemGroup) &&
                Objects.equals(this.primaryProductReviewRating, item.primaryProductReviewRating) &&
                Objects.equals(this.priorityListing, item.priorityListing) &&
                Objects.equals(this.product, item.product) &&
                Objects.equals(this.productFicheWebUrl, item.productFicheWebUrl) &&
                Objects.equals(this.qualifiedPrograms, item.qualifiedPrograms) &&
                Objects.equals(this.quantityLimitPerBuyer, item.quantityLimitPerBuyer) &&
                Objects.equals(this.repairScore, item.repairScore) &&
                Objects.equals(this.reservePriceMet, item.reservePriceMet) &&
                Objects.equals(this.returnTerms, item.returnTerms) &&
                Objects.equals(this.seller, item.seller) &&
                Objects.equals(this.sellerCustomPolicies, item.sellerCustomPolicies) &&
                Objects.equals(this.sellerItemRevision, item.sellerItemRevision) &&
                Objects.equals(this.shippingOptions, item.shippingOptions) &&
                Objects.equals(this.shipToLocations, item.shipToLocations) &&
                Objects.equals(this.shortDescription, item.shortDescription) &&
                Objects.equals(this.size, item.size) &&
                Objects.equals(this.sizeSystem, item.sizeSystem) &&
                Objects.equals(this.sizeType, item.sizeType) &&
                Objects.equals(this.subtitle, item.subtitle) &&
                Objects.equals(this.taxes, item.taxes) &&
                Objects.equals(this.title, item.title) &&
                Objects.equals(this.topRatedBuyingExperience, item.topRatedBuyingExperience) &&
                Objects.equals(this.tyreLabelImageUrl, item.tyreLabelImageUrl) &&
                Objects.equals(this.uniqueBidderCount, item.uniqueBidderCount) &&
                Objects.equals(this.unitPrice, item.unitPrice) &&
                Objects.equals(this.unitPricingMeasure, item.unitPricingMeasure) &&
                Objects.equals(this.warnings, item.warnings) &&
                Objects.equals(this.watchCount, item.watchCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalImages, addonServices, adultOnly, ageGroup, authenticityGuarantee, authenticityVerification, availableCoupons, bidCount, brand, buyingOptions, categoryId, categoryIdPath, categoryPath, color, condition, conditionDescription, conditionDescriptors, conditionId, currentBidPrice, description, ecoParticipationFee, eligibleForInlineCheckout, enabledForGuestCheckout, energyEfficiencyClass, epid, estimatedAvailabilities, gender, gtin, hazardousMaterialsLabels, image, inferredEpid, itemAffiliateWebUrl, itemCreationDate, itemEndDate, itemId, itemLocation, itemWebUrl, legacyItemId, listingMarketplaceId, localizedAspects, lotSize, marketingPrice, material, minimumPriceToBid, mpn, pattern, paymentMethods, price, priceDisplayCondition, primaryItemGroup, primaryProductReviewRating, priorityListing, product, productFicheWebUrl, qualifiedPrograms, quantityLimitPerBuyer, repairScore, reservePriceMet, returnTerms, seller, sellerCustomPolicies, sellerItemRevision, shippingOptions, shipToLocations, shortDescription, size, sizeSystem, sizeType, subtitle, taxes, title, topRatedBuyingExperience, tyreLabelImageUrl, uniqueBidderCount, unitPrice, unitPricingMeasure, warnings, watchCount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Item {\n");
        sb.append("    additionalImages: ").append(toIndentedString(additionalImages)).append("\n");
        sb.append("    addonServices: ").append(toIndentedString(addonServices)).append("\n");
        sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
        sb.append("    ageGroup: ").append(toIndentedString(ageGroup)).append("\n");
        sb.append("    authenticityGuarantee: ").append(toIndentedString(authenticityGuarantee)).append("\n");
        sb.append("    authenticityVerification: ").append(toIndentedString(authenticityVerification)).append("\n");
        sb.append("    availableCoupons: ").append(toIndentedString(availableCoupons)).append("\n");
        sb.append("    bidCount: ").append(toIndentedString(bidCount)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    buyingOptions: ").append(toIndentedString(buyingOptions)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryIdPath: ").append(toIndentedString(categoryIdPath)).append("\n");
        sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    conditionDescription: ").append(toIndentedString(conditionDescription)).append("\n");
        sb.append("    conditionDescriptors: ").append(toIndentedString(conditionDescriptors)).append("\n");
        sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
        sb.append("    currentBidPrice: ").append(toIndentedString(currentBidPrice)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ecoParticipationFee: ").append(toIndentedString(ecoParticipationFee)).append("\n");
        sb.append("    eligibleForInlineCheckout: ").append(toIndentedString(eligibleForInlineCheckout)).append("\n");
        sb.append("    enabledForGuestCheckout: ").append(toIndentedString(enabledForGuestCheckout)).append("\n");
        sb.append("    energyEfficiencyClass: ").append(toIndentedString(energyEfficiencyClass)).append("\n");
        sb.append("    epid: ").append(toIndentedString(epid)).append("\n");
        sb.append("    estimatedAvailabilities: ").append(toIndentedString(estimatedAvailabilities)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
        sb.append("    hazardousMaterialsLabels: ").append(toIndentedString(hazardousMaterialsLabels)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    inferredEpid: ").append(toIndentedString(inferredEpid)).append("\n");
        sb.append("    itemAffiliateWebUrl: ").append(toIndentedString(itemAffiliateWebUrl)).append("\n");
        sb.append("    itemCreationDate: ").append(toIndentedString(itemCreationDate)).append("\n");
        sb.append("    itemEndDate: ").append(toIndentedString(itemEndDate)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemLocation: ").append(toIndentedString(itemLocation)).append("\n");
        sb.append("    itemWebUrl: ").append(toIndentedString(itemWebUrl)).append("\n");
        sb.append("    legacyItemId: ").append(toIndentedString(legacyItemId)).append("\n");
        sb.append("    listingMarketplaceId: ").append(toIndentedString(listingMarketplaceId)).append("\n");
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
        sb.append("    repairScore: ").append(toIndentedString(repairScore)).append("\n");
        sb.append("    reservePriceMet: ").append(toIndentedString(reservePriceMet)).append("\n");
        sb.append("    returnTerms: ").append(toIndentedString(returnTerms)).append("\n");
        sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
        sb.append("    sellerCustomPolicies: ").append(toIndentedString(sellerCustomPolicies)).append("\n");
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
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("    watchCount: ").append(toIndentedString(watchCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
