package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the details of a specific item.
 */
@Setter
@Schema(description = "The type that defines the fields for the details of a specific item.")
public class ItemSummary {
    @SerializedName("additionalImages")
    private List<Image> additionalImages = null;

    @SerializedName("adultOnly")
    private Boolean adultOnly = null;

    @SerializedName("availableCoupons")
    private Boolean availableCoupons = null;

    @SerializedName("bidCount")
    private Integer bidCount = null;

    @SerializedName("buyingOptions")
    private List<String> buyingOptions = null;

    @SerializedName("categories")
    private List<Category> categories = null;

    @SerializedName("compatibilityMatch")
    private String compatibilityMatch = null;

    @SerializedName("compatibilityProperties")
    private List<CompatibilityProperty> compatibilityProperties = null;

    @SerializedName("condition")
    private String condition = null;

    @SerializedName("conditionId")
    private String conditionId = null;

    @SerializedName("currentBidPrice")
    private ConvertedAmount currentBidPrice = null;

    @SerializedName("distanceFromPickupLocation")
    private TargetLocation distanceFromPickupLocation = null;

    @SerializedName("energyEfficiencyClass")
    private String energyEfficiencyClass = null;

    @SerializedName("epid")
    private String epid = null;

    @SerializedName("image")
    private Image image = null;

    @SerializedName("itemAffiliateWebUrl")
    private String itemAffiliateWebUrl = null;

    @SerializedName("itemCreationDate")
    private String itemCreationDate = null;

    @SerializedName("itemEndDate")
    private String itemEndDate = null;

    @SerializedName("itemGroupHref")
    private String itemGroupHref = null;

    @SerializedName("itemGroupType")
    private String itemGroupType = null;

    @SerializedName("itemHref")
    private String itemHref = null;

    @SerializedName("itemId")
    private String itemId = null;

    @SerializedName("itemLocation")
    private ItemLocationImpl itemLocation = null;

    @SerializedName("itemWebUrl")
    private String itemWebUrl = null;

    @SerializedName("leafCategoryIds")
    private List<String> leafCategoryIds = null;

    @SerializedName("legacyItemId")
    private String legacyItemId = null;

    @SerializedName("listingMarketplaceId")
    private String listingMarketplaceId = null;

    @SerializedName("marketingPrice")
    private MarketingPrice marketingPrice = null;

    @SerializedName("pickupOptions")
    private List<PickupOptionSummary> pickupOptions = null;

    @SerializedName("price")
    private ConvertedAmount price = null;

    @SerializedName("priceDisplayCondition")
    private String priceDisplayCondition = null;

    @SerializedName("priorityListing")
    private Boolean priorityListing = null;

    @SerializedName("qualifiedPrograms")
    private List<String> qualifiedPrograms = null;

    @SerializedName("seller")
    private Seller seller = null;

    @SerializedName("shippingOptions")
    private List<ShippingOptionSummary> shippingOptions = null;

    @SerializedName("shortDescription")
    private String shortDescription = null;

    @SerializedName("thumbnailImages")
    private List<Image> thumbnailImages = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("topRatedBuyingExperience")
    private Boolean topRatedBuyingExperience = null;

    @SerializedName("tyreLabelImageUrl")
    private String tyreLabelImageUrl = null;

    @SerializedName("unitPrice")
    private ConvertedAmount unitPrice = null;

    @SerializedName("unitPricingMeasure")
    private String unitPricingMeasure = null;

    @SerializedName("watchCount")
    private Integer watchCount = null;

    public ItemSummary additionalImages(List<Image> additionalImages) {
        this.additionalImages = additionalImages;
        return this;
    }

    public ItemSummary addAdditionalImagesItem(Image additionalImagesItem) {
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

    public ItemSummary adultOnly(Boolean adultOnly) {
        this.adultOnly = adultOnly;
        return this;
    }

    /**
     * This indicates if the item is for adults only. For more information about adult-only items on eBay,
     * see <a href="https://pages.ebay.com/help/policies/adult-only.html " target="_blank">Adult items policy</a>
     * for sellers and
     * <a href="https://www.ebay.com/help/terms-conditions/default/searching-adult-items?id=4661 " target="_blank">
     * Adult-Only items on eBay</a> for buyers.
     *
     * @return adultOnly
     **/
    @Schema(description = "This indicates if the item is for adults only. For more information about " +
            "adult-only items on eBay, see " +
            "<a href=\"https://pages.ebay.com/help/policies/adult-only.html \" target=\"_blank\">" +
            "Adult items policy</a> for sellers and " +
            "<a href=\"https://www.ebay.com/help/terms-conditions/default/searching-adult-items?id=4661 \" target=\"_blank\">" +
            "Adult-Only items on eBay</a> for buyers.")
    public Boolean isAdultOnly() {
        return adultOnly;
    }

    public ItemSummary availableCoupons(Boolean availableCoupons) {
        this.availableCoupons = availableCoupons;
        return this;
    }

    /**
     * This boolean attribute indicates if coupons are available for the item.
     *
     * @return availableCoupons
     **/
    @Schema(description = "This boolean attribute indicates if coupons are available for the item.")
    public Boolean isAvailableCoupons() {
        return availableCoupons;
    }

    public ItemSummary bidCount(Integer bidCount) {
        this.bidCount = bidCount;
        return this;
    }

    /**
     * This integer value indicates the total number of bids that have been placed for an auction item.
     * This field is only returned for auction items.
     *
     * @return bidCount
     **/
    @Schema(description = "This integer value indicates the total number of bids that have been placed " +
            "for an auction item. This field is only returned for auction items.")
    public Integer getBidCount() {
        return bidCount;
    }

    public ItemSummary buyingOptions(List<String> buyingOptions) {
        this.buyingOptions = buyingOptions;
        return this;
    }

    public ItemSummary addBuyingOptionsItem(String buyingOptionsItem) {
        if (this.buyingOptions == null) {
            this.buyingOptions = new ArrayList<>();
        }
        this.buyingOptions.add(buyingOptionsItem);
        return this;
    }

    /**
     * A comma separated list of all the purchase options available for the item.
     * <br><br><b> Values Returned:</b><ul>
     * <li><b>FIXED_PRICE</b> - Indicates the buyer can purchase the item for a set price using
     * the Buy It Now button. </li>
     * <li><b> AUCTION</b> - Indicates the buyer can place a bid for the item. After the first
     * bid is placed, this becomes a live auction item and is the only buying option for this item.</li>
     * <li><b> BEST_OFFER</b> - Items where the buyer can send the seller a price they're willing
     * to pay for the item. The seller can accept, reject, or send a counter offer. For details
     * about Best Offer, see
     * <a href="https://www.ebay.com/help/selling/listings/selling-buy-now/adding-best-offer-listing?id=4144 " target="_blank">
     * Best Offer</a>.</li><li><b>CLASSIFIED_AD</b> - Indicates that the final sales transaction
     * is to be completed outside of the eBay environment.</li></ul> Code so that your app gracefully
     * handles any future changes to this list.
     *
     * @return buyingOptions
     **/
    @Schema(description = "A comma separated list of all the purchase options available for the item. " +
            "<br><br><b> Values Returned:</b><ul><li><b>FIXED_PRICE</b> - Indicates the buyer can purchase " +
            "the item for a set price using the Buy It Now button. </li>  <li><b> AUCTION</b> - Indicates " +
            "the buyer can place a bid for the item. After the first bid is placed, this becomes " +
            "a live auction item and is the only buying option for this item.</li>  <li><b> BEST_OFFER</b> - " +
            "Items where the buyer can send the seller a price they're willing to pay for the item. The seller " +
            "can accept, reject, or send a counter offer. For details about Best Offer, see " +
            "<a href=\"https://www.ebay.com/help/selling/listings/selling-buy-now/adding-best-offer-listing?id=4144 \" target=\"_blank\">" +
            "Best Offer</a>.</li><li><b>CLASSIFIED_AD</b> - Indicates that the final sales transaction is to " +
            "be completed outside of the eBay environment.</li></ul> Code so that your app gracefully handles " +
            "any future changes to this list.")
    public List<String> getBuyingOptions() {
        return buyingOptions;
    }

    public ItemSummary categories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public ItemSummary addCategoriesItem(Category categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    /**
     * This array returns the name and ID of each category associated with the item, including
     * top level, branch, and leaf categories.
     *
     * @return categories
     **/
    @Schema(description = "This array returns the name and ID of each category associated with " +
            "the item, including top level, branch, and leaf categories.")
    public List<Category> getCategories() {
        return categories;
    }

    public ItemSummary compatibilityMatch(String compatibilityMatch) {
        this.compatibilityMatch = compatibilityMatch;
        return this;
    }

    /**
     * This indicates how well the item matches the <b>compatibility_filter</b> product attributes.
     * <br><br><b> Valid Values: </b> EXACT or POSSIBLE <br><br>Code so that your app gracefully
     * handles any future changes to this list. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:CompatibilityMatchEnum'>
     * eBay API documentation</a>
     *
     * @return compatibilityMatch
     **/
    @Schema(description = "This indicates how well the item matches the <b>compatibility_filter</b> " +
            "product attributes.  <br><br><b> Valid Values: </b> EXACT or POSSIBLE <br><br>Code so that " +
            "your app gracefully handles any future changes to this list. For implementation help, " +
            "refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:CompatibilityMatchEnum'>" +
            "eBay API documentation</a>")
    public String getCompatibilityMatch() {
        return compatibilityMatch;
    }

    public ItemSummary compatibilityProperties(List<CompatibilityProperty> compatibilityProperties) {
        this.compatibilityProperties = compatibilityProperties;
        return this;
    }

    public ItemSummary addCompatibilityPropertiesItem(CompatibilityProperty compatibilityPropertiesItem) {
        if (this.compatibilityProperties == null) {
            this.compatibilityProperties = new ArrayList<>();
        }
        this.compatibilityProperties.add(compatibilityPropertiesItem);
        return this;
    }

    /**
     * This container returns only the product attributes that are compatible with the item.
     * These attributes were specified in the <b>compatibility_filter</b> in the request.
     * This means that if you passed in 5 attributes and only 4 are compatible, only those
     * 4 are returned. If none of the attributes are compatible, this container is not returned.
     *
     * @return compatibilityProperties
     **/
    @Schema(description = "This container returns only the product attributes that are compatible " +
            "with the item. These attributes were specified in the <b>compatibility_filter</b> in " +
            "the request. This means that if you passed in 5 attributes and only 4 are compatible, " +
            "only those 4 are returned. If none of the attributes are compatible, this container is not returned.")
    public List<CompatibilityProperty> getCompatibilityProperties() {
        return compatibilityProperties;
    }

    public ItemSummary condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * The text describing the condition of the item, such as New or Used. For a list of condition
     * names, see <a href="/devzone/finding/callref/enums/conditionIdList.html " target="_blank">
     * Item Condition IDs and Names</a>.
     * <br><br>Code so that your app gracefully handles any future changes to this list.</span>
     *
     * @return condition
     **/
    @Schema(description = "The text describing the condition of the item, such as New or Used. " +
            "For a list of condition names, see " +
            "<a href=\"/devzone/finding/callref/enums/conditionIdList.html \" target=\"_blank\">" +
            "Item Condition IDs and Names</a>.  <br><br>Code so that your app gracefully handles " +
            "any future changes to this list.</span>")
    public String getCondition() {
        return condition;
    }

    public ItemSummary conditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    /**
     * The identifier of the condition of the item. For example, 1000 is the identifier for NEW.
     * For a list of condition names and IDs, see
     * <a href="/devzone/finding/callref/enums/conditionIdList.html " target="_blank">
     * Item Condition IDs and Names</a>. <br><br>Code so that your app gracefully handles any
     * future changes to this list.
     *
     * @return conditionId
     **/
    @Schema(description = "The identifier of the condition of the item. For example, 1000 is the " +
            "identifier for NEW. For a list of condition names and IDs, see " +
            "<a href=\"/devzone/finding/callref/enums/conditionIdList.html \" target=\"_blank\">" +
            "Item Condition IDs and Names</a>. <br><br>Code so that your app gracefully handles any future " +
            "changes to this list.")
    public String getConditionId() {
        return conditionId;
    }

    public ItemSummary currentBidPrice(ConvertedAmount currentBidPrice) {
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

    public ItemSummary distanceFromPickupLocation(TargetLocation distanceFromPickupLocation) {
        this.distanceFromPickupLocation = distanceFromPickupLocation;
        return this;
    }

    /**
     * Get distanceFromPickupLocation
     *
     * @return distanceFromPickupLocation
     **/
    @Schema(description = "")
    public TargetLocation getDistanceFromPickupLocation() {
        return distanceFromPickupLocation;
    }

    public ItemSummary energyEfficiencyClass(String energyEfficiencyClass) {
        this.energyEfficiencyClass = energyEfficiencyClass;
        return this;
    }

    /**
     * This indicates the <a href="https://en.wikipedia.org/wiki/European_Union_energy_label ">
     * European energy efficiency</a> rating (EEK) of the item.  Energy efficiency ratings apply
     * to products listed by commercial vendors in electronics categories only.
     * <br><br>Currently, this field is only applicable for the Germany site, and  is only returned
     * if the seller specified the energy efficiency rating through item specifics at listing time.
     * Rating values include <code>A+++</code>, <code>A++</code>, <code>A+</code>, <code>A</code>,
     * <code>B</code>, <code>C</code>, <code>D</code>, <code>E</code>, <code>F</code>, and <code>G</code>.
     *
     * @return energyEfficiencyClass
     **/
    @Schema(description = "This indicates the <a href=\"https://en.wikipedia.org/wiki/European_Union_energy_label \">" +
            "European energy efficiency</a> rating (EEK) of the item.  Energy efficiency ratings apply to " +
            "products listed by commercial vendors in electronics categories only. <br><br>Currently, " +
            "this field is only applicable for the Germany site, and  is only returned if the seller " +
            "specified the energy efficiency rating through item specifics at listing time. Rating values " +
            "include <code>A+++</code>, <code>A++</code>, <code>A+</code>, <code>A</code>, <code>B</code>, " +
            "<code>C</code>, <code>D</code>, <code>E</code>, <code>F</code>, and <code>G</code>.")
    public String getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    public ItemSummary epid(String epid) {
        this.epid = epid;
        return this;
    }

    /**
     * An ePID is the eBay product identifier of a product from the eBay product catalog.
     * This indicates the product in which the item belongs.
     *
     * @return epid
     **/
    @Schema(description = "An ePID is the eBay product identifier of a product from the eBay product catalog.  " +
            "This indicates the product in which the item belongs.")
    public String getEpid() {
        return epid;
    }

    public ItemSummary image(Image image) {
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

    public ItemSummary itemAffiliateWebUrl(String itemAffiliateWebUrl) {
        this.itemAffiliateWebUrl = itemAffiliateWebUrl;
        return this;
    }

    /**
     * The URL to the View Item page of the item which includes the affiliate tracking ID.
     * <br><br><span class="tablenote"><b>Note:</b> In order to receive commissions on sales,
     * eBay Partner Network affiliates must use this URL to forward buyers to the listing on
     * the eBay marketplace.</span><br>The <b>itemAffiliateWebUrl</b> is only returned if:
     * <ul><li>The marketplace through which the item is being viewed is part of the eBay
     * Partner Network. Currently Poland (<code>EBAY_PL</code>) and Singapore (<code>EBAY_SG</code>)
     * are <b>not</b> supported.<br><br>For additional information, refer to
     * <a href="https://partnerhelp.ebay.com/helpcenter/s/article/countries-available-as-a-program-in-EPN?language=en_US " target="_blank">
     * eBay Partner Network</a>.</li><li>The seller enables affiliate tracking for the item by including
     * the <code><a href="/api-docs/buy/static/api-browse.html#Headers">X-EBAY-C-ENDUSERCTX</a></code>
     * request header in the method.</li></ul>
     *
     * @return itemAffiliateWebUrl
     **/
    @Schema(description = "The URL to the View Item page of the item which includes the affiliate tracking ID." +
            "<br><br><span class=\"tablenote\"><b>Note:</b> In order to receive commissions on sales, eBay " +
            "Partner Network affiliates must use this URL to forward buyers to the listing on the eBay " +
            "marketplace.</span><br>The <b>itemAffiliateWebUrl</b> is only returned if:<ul><li>The marketplace " +
            "through which the item is being viewed is part of the eBay Partner Network. Currently Poland " +
            "(<code>EBAY_PL</code>) and Singapore (<code>EBAY_SG</code>) are <b>not</b> supported." +
            "<br><br>For additional information, refer to " +
            "<a href=\"https://partnerhelp.ebay.com/helpcenter/s/article/countries-available-as-a-program-in-EPN?language=en_US \" target=\"_blank\">" +
            "eBay Partner Network</a>.</li><li>The seller enables affiliate tracking for the item by " +
            "including the <code><a href=\"/api-docs/buy/static/api-browse.html#Headers\">X-EBAY-C-ENDUSERCTX</a></code> " +
            "request header in the method.</li></ul>")
    public String getItemAffiliateWebUrl() {
        return itemAffiliateWebUrl;
    }

    public ItemSummary itemCreationDate(String itemCreationDate) {
        this.itemCreationDate = itemCreationDate;
        return this;
    }

    /**
     * The date and time when the item listing was created.  This value is returned in UTC format
     * (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into the local time of the buyer.
     *
     * @return itemCreationDate
     **/
    @Schema(description = "The date and time when the item listing was created.  This value is " +
            "returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into the local " +
            "time of the buyer.")
    public String getItemCreationDate() {
        return itemCreationDate;
    }

    public ItemSummary itemEndDate(String itemEndDate) {
        this.itemEndDate = itemEndDate;
        return this;
    }

    /**
     * The date and time up to which the item can be purchased.  This value is returned in UTC
     * format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into the local time of the buyer.
     * <br><br><span class="tablenote"><b> Note: </b>This field is not returned for Good 'Til
     * Cancelled (GTC) listings.</span>
     *
     * @return itemEndDate
     **/
    @Schema(description = "The date and time up to which the item can be purchased.  This value " +
            "is returned in UTC format (yyyy-MM-ddThh:mm:ss.sssZ), which you can convert into " +
            "the local time of the buyer.<br><br><span class=\"tablenote\"><b> Note: </b>This field " +
            "is not returned for Good 'Til Cancelled (GTC) listings.</span>")
    public String getItemEndDate() {
        return itemEndDate;
    }

    public ItemSummary itemGroupHref(String itemGroupHref) {
        this.itemGroupHref = itemGroupHref;
        return this;
    }

    /**
     * The HATEOAS reference of the parent page of the item group. An item group is an item
     * that has various aspect differences, such as color, size, storage capacity, etc.
     * <br> <br><span class="tablenote"> <b>  Note: </b>This field is returned only for item groups.</span>
     *
     * @return itemGroupHref
     **/
    @Schema(description = "The HATEOAS reference of the parent page of the item group. An item group " +
            "is an item that has various aspect differences, such as color, size, storage capacity, etc. " +
            "<br> <br><span class=\"tablenote\"> <b>  Note: </b>This field is returned only for item groups.</span>")
    public String getItemGroupHref() {
        return itemGroupHref;
    }

    public ItemSummary itemGroupType(String itemGroupType) {
        this.itemGroupType = itemGroupType;
        return this;
    }

    /**
     * The indicates the item group type. An item group is an item that has various aspect
     * differences, such as color, size, storage capacity, etc. <br><br>Currently only the
     * <code>SELLER_DEFINED_VARIATIONS</code> is supported and indicates this is an item group
     * created by the seller. <br> <br><span class="tablenote"> <b> Note: </b>This field is
     * returned only for item groups.</span><br><br>Code so that your app gracefully handles
     * any future changes to this list.
     *
     * @return itemGroupType
     **/
    @Schema(description = "The indicates the item group type. An item group is an item that has various " +
            "aspect differences, such as color, size, storage capacity, etc. <br><br>Currently only the " +
            "<code>SELLER_DEFINED_VARIATIONS</code> is supported and indicates this is an item group " +
            "created by the seller. <br> <br><span class=\"tablenote\"> <b> Note: </b>This field is " +
            "returned only for item groups.</span><br><br>Code so that your app gracefully handles any " +
            "future changes to this list.")
    public String getItemGroupType() {
        return itemGroupType;
    }

    public ItemSummary itemHref(String itemHref) {
        this.itemHref = itemHref;
        return this;
    }

    /**
     * The URI for the Browse API <a href="/api-docs/buy/browse/resources/item/methods/getItem">getItem</a>
     * method, which can be used to retrieve more details about items in the search results.
     *
     * @return itemHref
     **/
    @Schema(description = "The URI for the Browse API <a href=\"/api-docs/buy/browse/resources/item/methods/getItem\">" +
            "getItem</a> method, which can be used to retrieve more details about items in the search results. ")
    public String getItemHref() {
        return itemHref;
    }

    public ItemSummary itemId(String itemId) {
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

    public ItemSummary itemLocation(ItemLocationImpl itemLocation) {
        this.itemLocation = itemLocation;
        return this;
    }

    /**
     * Get itemLocation
     *
     * @return itemLocation
     **/
    @Schema(description = "")
    public ItemLocationImpl getItemLocation() {
        return itemLocation;
    }

    public ItemSummary itemWebUrl(String itemWebUrl) {
        this.itemWebUrl = itemWebUrl;
        return this;
    }

    /**
     * The URL to the View Item page of the item.  This enables you to include a "Report Item on eBay"
     * hyperlink that takes the buyer to the View Item page on eBay. From there they can report any
     * issues regarding this item to eBay.
     *
     * @return itemWebUrl
     **/
    @Schema(description = "The URL to the View Item page of the item.  This enables you to include " +
            "a \"Report Item on eBay\" hyperlink that takes the buyer to the View Item page on eBay. " +
            "From there they can report any issues regarding this item to eBay.")
    public String getItemWebUrl() {
        return itemWebUrl;
    }

    public ItemSummary leafCategoryIds(List<String> leafCategoryIds) {
        this.leafCategoryIds = leafCategoryIds;
        return this;
    }

    public ItemSummary addLeafCategoryIdsItem(String leafCategoryIdsItem) {
        if (this.leafCategoryIds == null) {
            this.leafCategoryIds = new ArrayList<>();
        }
        this.leafCategoryIds.add(leafCategoryIdsItem);
        return this;
    }

    /**
     * The leaf category IDs of the item. When the item belongs to two leaf categories,
     * the ID values are returned in the order primary, secondary.
     *
     * @return leafCategoryIds
     **/
    @Schema(description = "The leaf category IDs of the item. When the item belongs to two leaf " +
            "categories, the ID values are returned in the order primary, secondary.")
    public List<String> getLeafCategoryIds() {
        return leafCategoryIds;
    }

    public ItemSummary legacyItemId(String legacyItemId) {
        this.legacyItemId = legacyItemId;
        return this;
    }

    /**
     * The unique identifier of the eBay listing that contains the item. This is the
     * traditional/legacy ID that is often seen in the URL of the listing View Item page.
     *
     * @return legacyItemId
     **/
    @Schema(description = "The unique identifier of the eBay listing that contains the item. " +
            "This is the traditional/legacy ID that is often seen in the URL of the listing View Item page.")
    public String getLegacyItemId() {
        return legacyItemId;
    }

    public ItemSummary listingMarketplaceId(String listingMarketplaceId) {
        this.listingMarketplaceId = listingMarketplaceId;
        return this;
    }

    /**
     * The ID of the eBay marketplace where the seller listed the item. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:MarketplaceIdEnum'>eBay API
     * documentation</a>
     *
     * @return listingMarketplaceId
     **/
    @Schema(description = "The ID of the eBay marketplace where the seller listed the item. For " +
            "implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:MarketplaceIdEnum'>" +
            "eBay API documentation</a>")
    public String getListingMarketplaceId() {
        return listingMarketplaceId;
    }

    public ItemSummary marketingPrice(MarketingPrice marketingPrice) {
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

    public ItemSummary pickupOptions(List<PickupOptionSummary> pickupOptions) {
        this.pickupOptions = pickupOptions;
        return this;
    }

    public ItemSummary addPickupOptionsItem(PickupOptionSummary pickupOptionsItem) {
        if (this.pickupOptions == null) {
            this.pickupOptions = new ArrayList<>();
        }
        this.pickupOptions.add(pickupOptionsItem);
        return this;
    }

    /**
     * This container returns the local pickup options available to the buyer. This container is
     * only returned if the user is searching for local pickup items and set the local pickup
     * filters in the method request.
     *
     * @return pickupOptions
     **/
    @Schema(description = "This container returns the local pickup options available to the buyer. " +
            "This container is only returned if the user is searching for local pickup items and set " +
            "the local pickup filters in the method request.")
    public List<PickupOptionSummary> getPickupOptions() {
        return pickupOptions;
    }

    public ItemSummary price(ConvertedAmount price) {
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

    public ItemSummary priceDisplayCondition(String priceDisplayCondition) {
        this.priceDisplayCondition = priceDisplayCondition;
        return this;
    }

    /**
     * Indicates when in the buying flow the item's price can appear for minimum advertised
     * price (MAP) items, which is the lowest price a retailer can advertise/show for this
     * item. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PriceDisplayConditionEnum'>
     * eBay API documentation</a>
     *
     * @return priceDisplayCondition
     **/
    @Schema(description = "Indicates when in the buying flow the item's price can appear for minimum " +
            "advertised price (MAP) items, which is the lowest price a retailer can advertise/show " +
            "for this item. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:PriceDisplayConditionEnum'>" +
            "eBay API documentation</a>")
    public String getPriceDisplayCondition() {
        return priceDisplayCondition;
    }

    public ItemSummary priorityListing(Boolean priorityListing) {
        this.priorityListing = priorityListing;
        return this;
    }

    /**
     * This field is returned as <code>true</code> if the listing is part of a Promoted Listing
     * campaign. Promoted Listings are available to Above Standard and Top Rated sellers with
     * recent sales activity.<br><br><span class="tablenote"><b>Note:</b> Priority Listing is
     * returned only with a Best Match sort and will not be returned for other sort options.</span>
     *
     * @return priorityListing
     **/
    @Schema(description = "This field is returned as <code>true</code> if the listing is part of " +
            "a Promoted Listing campaign. Promoted Listings are available to Above Standard and " +
            "Top Rated sellers with recent sales activity.<br><br><span class=\"tablenote\"><b>Note:</b> " +
            "Priority Listing is returned only with a Best Match sort and will not be returned for other " +
            "sort options.</span>")
    public Boolean isPriorityListing() {
        return priorityListing;
    }

    public ItemSummary qualifiedPrograms(List<String> qualifiedPrograms) {
        this.qualifiedPrograms = qualifiedPrograms;
        return this;
    }

    public ItemSummary addQualifiedProgramsItem(String qualifiedProgramsItem) {
        if (this.qualifiedPrograms == null) {
            this.qualifiedPrograms = new ArrayList<>();
        }
        this.qualifiedPrograms.add(qualifiedProgramsItem);
        return this;
    }

    /**
     * An array of the qualified programs available for the item, such as EBAY_PLUS,
     * AUTHENTICITY_GUARANTEE, and AUTHENTICITY_VERIFICATION.<br><br>eBay Plus is a premium
     * account option for buyers, which provides benefits such as fast free domestic shipping
     * and free returns on selected items. Top-Rated eBay sellers must opt in to eBay Plus to
     * be able to offer the program on qualifying listings. Sellers must commit to next-day
     * delivery of those items.<br><br><span class="tablenote"><b>Note: </b> eBay Plus is
     * available only to buyers in Germany, Austria, and Australia marketplaces.</span>
     * <br><br>The eBay <a href="https://pages.ebay.com/authenticity-guarantee/ " target="_blank">
     * Authenticity Guarantee</a> program enables third-party authenticators to perform
     * authentication verification inspections on items such as watches and sneakers.
     *
     * @return qualifiedPrograms
     **/
    @Schema(description = "An array of the qualified programs available for the item, such as EBAY_PLUS, " +
            "AUTHENTICITY_GUARANTEE, and AUTHENTICITY_VERIFICATION.<br><br>eBay Plus is a premium account " +
            "option for buyers, which provides benefits such as fast free domestic shipping and free returns " +
            "on selected items. Top-Rated eBay sellers must opt in to eBay Plus to be able to offer " +
            "the program on qualifying listings. Sellers must commit to next-day delivery of those items." +
            "<br><br><span class=\"tablenote\"><b>Note: </b> eBay Plus is available only to buyers in Germany, " +
            "Austria, and Australia marketplaces.</span><br><br>The eBay " +
            "<a href=\"https://pages.ebay.com/authenticity-guarantee/ \" target=\"_blank\">Authenticity Guarantee" +
            "</a> program enables third-party authenticators to perform authentication verification inspections " +
            "on items such as watches and sneakers.")
    public List<String> getQualifiedPrograms() {
        return qualifiedPrograms;
    }

    public ItemSummary seller(Seller seller) {
        this.seller = seller;
        return this;
    }

    /**
     * Get seller
     *
     * @return seller
     **/
    @Schema(description = "")
    public Seller getSeller() {
        return seller;
    }

    public ItemSummary shippingOptions(List<ShippingOptionSummary> shippingOptions) {
        this.shippingOptions = shippingOptions;
        return this;
    }

    public ItemSummary addShippingOptionsItem(ShippingOptionSummary shippingOptionsItem) {
        if (this.shippingOptions == null) {
            this.shippingOptions = new ArrayList<>();
        }
        this.shippingOptions.add(shippingOptionsItem);
        return this;
    }

    /**
     * This container returns the shipping options available to ship the item.
     *
     * @return shippingOptions
     **/
    @Schema(description = "This container returns the shipping options available to ship the item.")
    public List<ShippingOptionSummary> getShippingOptions() {
        return shippingOptions;
    }

    public ItemSummary shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * This text string is derived from the item condition and the item aspects (such as size,
     * color, capacity, model, brand, etc.). Sometimes the title doesn't give enough information
     * but the description is too big. Surfacing the <b>shortDescription</b> can often provide
     * buyers with the additional information that could help them make a buying decision.
     * <br><br>For example: <br><br>    <code>   "<b> title</b>": "Petrel U42W FPV Drone RC
     * Quadcopter w/HD Camera Live Video One Key Off / Landing",
     * <br>"<b>shortDescription</b>": "1 U42W Quadcopter. Syma X5SW-V3 Wifi FPV RC Drone
     * Quadcopter 2.4Ghz 6-Axis Gyro with Headless Mode. Syma X20 Pocket Drone 2.4Ghz Mini RC
     * Quadcopter Headless Mode Altitude Hold. One Key Take Off / Landing function: allow beginner
     * to easy to fly the drone without any skill.",</code>       <br><br><b>Restriction: </b>
     * This field is returned by the <b> search</b> method only when <b> fieldgroups</b> = <code>EXTENDED</code>.
     *
     * @return shortDescription
     **/
    @Schema(description = "This text string is derived from the item condition and the item aspects " +
            "(such as size, color, capacity, model, brand, etc.). Sometimes the title doesn't give enough " +
            "information but the description is too big. Surfacing the <b>shortDescription</b> can often " +
            "provide buyers with the additional information that could help them make a buying decision.  " +
            "<br><br>For example: <br><br>    <code>   \"<b> title</b>\": \"Petrel U42W FPV Drone RC Quadcopter " +
            "w/HD Camera Live Video One Key Off / Landing\", <br>\"<b>shortDescription</b>\": \"1 U42W Quadcopter. " +
            "Syma X5SW-V3 Wifi FPV RC Drone Quadcopter 2.4Ghz 6-Axis Gyro with Headless Mode. Syma X20 Pocket " +
            "Drone 2.4Ghz Mini RC Quadcopter Headless Mode Altitude Hold. One Key Take Off / Landing function: " +
            "allow beginner to easy to fly the drone without any skill.\",</code>       <br><br><b>Restriction: </b> " +
            "This field is returned by the <b> search</b> method only when <b> fieldgroups</b> = <code>EXTENDED</code>.")
    public String getShortDescription() {
        return shortDescription;
    }

    public ItemSummary thumbnailImages(List<Image> thumbnailImages) {
        this.thumbnailImages = thumbnailImages;
        return this;
    }

    public ItemSummary addThumbnailImagesItem(Image thumbnailImagesItem) {
        if (this.thumbnailImages == null) {
            this.thumbnailImages = new ArrayList<>();
        }
        this.thumbnailImages.add(thumbnailImagesItem);
        return this;
    }

    /**
     * An array of thumbnail images for the item.
     *
     * @return thumbnailImages
     **/
    @Schema(description = "An array of thumbnail images for the item. ")
    public List<Image> getThumbnailImages() {
        return thumbnailImages;
    }

    public ItemSummary title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The seller-created title of the item. <br><br><b>Maximum Length: </b> 80 characters
     *
     * @return title
     **/
    @Schema(description = "The seller-created title of the item. <br><br><b>Maximum Length: </b> 80 characters")
    public String getTitle() {
        return title;
    }

    public ItemSummary topRatedBuyingExperience(Boolean topRatedBuyingExperience) {
        this.topRatedBuyingExperience = topRatedBuyingExperience;
        return this;
    }

    /**
     * This indicates if the item is a top-rated plus item. There are three benefits of
     * a top-rated plus item: a  minimum 30-day money-back return policy, shipping the item in
     * 1 business day with tracking provided, and the added comfort of knowing that this item
     * is from an experienced seller with the highest buyer ratings. See the
     * <a href="https://pages.ebay.com/topratedplus/index.html " target="_blank">Top Rated Plus Items </a>
     * and <a href="https://pages.ebay.com/help/sell/top-rated.html " target="_blank">Becoming
     * a Top Rated Seller and qualifying for Top Rated Plus</a> help topics for more information.
     *
     * @return topRatedBuyingExperience
     **/
    @Schema(description = "This indicates if the item is a top-rated plus item. There are three benefits " +
            "of a top-rated plus item: a  minimum 30-day money-back return policy, shipping the item in " +
            "1 business day with tracking provided, and the added comfort of knowing that this item is " +
            "from an experienced seller with the highest buyer ratings. See the " +
            "<a href=\"https://pages.ebay.com/topratedplus/index.html \" target=\"_blank\">Top Rated Plus Items </a> " +
            "and <a href=\"https://pages.ebay.com/help/sell/top-rated.html \" target=\"_blank\">Becoming " +
            "a Top Rated Seller and qualifying for Top Rated Plus</a> help topics for more information.")
    public Boolean isTopRatedBuyingExperience() {
        return topRatedBuyingExperience;
    }

    public ItemSummary tyreLabelImageUrl(String tyreLabelImageUrl) {
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

    public ItemSummary unitPrice(ConvertedAmount unitPrice) {
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

    public ItemSummary unitPricingMeasure(String unitPricingMeasure) {
        this.unitPricingMeasure = unitPricingMeasure;
        return this;
    }

    /**
     * The designation, such as size, weight, volume, count, etc., that was used to specify
     * the quantity of the item. This helps buyers compare prices. <br><br>For example,
     * the following tells the buyer that the item is 7.99 per 100 grams.
     * <br><br><code>"unitPricingMeasure": "100g",<br> "unitPrice": {<br>&nbsp;&nbsp;"value": "7.99",
     * <br>&nbsp;&nbsp;"currency": "GBP"</code>
     *
     * @return unitPricingMeasure
     **/
    @Schema(description = "The designation, such as size, weight, volume, count, etc., that was " +
            "used to specify the quantity of the item. This helps buyers compare prices. " +
            "<br><br>For example, the following tells the buyer that the item is 7.99 per 100 grams. " +
            "<br><br><code>\"unitPricingMeasure\": \"100g\",<br> \"unitPrice\": {<br>&nbsp;&nbsp;\"value\": \"7.99\"," +
            "<br>&nbsp;&nbsp;\"currency\": \"GBP\"</code>")
    public String getUnitPricingMeasure() {
        return unitPricingMeasure;
    }

    public ItemSummary watchCount(Integer watchCount) {
        this.watchCount = watchCount;
        return this;
    }

    /**
     * The number of users that have added the item to their watch list.
     * <br><br><span class="tablenote"> <strong>Note:</strong> This field is restricted to
     * applications that have been granted permission to access this feature. You must submit an
     * <a href="/my/support/tickets?tab=app-check ">App Check ticket</a> to request this access.
     * In the App Check form, add a note to the <b>Application Title/Summary</b> and/or
     * <b>Application Details</b> fields that you want access to Watch Count data in the Browse API.</span>
     *
     * @return watchCount
     **/
    @Schema(description = "The number of users that have added the item to their watch list." +
            "<br><br><span class=\"tablenote\"> <strong>Note:</strong> This field is restricted " +
            "to applications that have been granted permission to access this feature. You must " +
            "submit an <a href=\"/my/support/tickets?tab=app-check \">App Check ticket</a> to " +
            "request this access. In the App Check form, add a note to the <b>Application Title/Summary</b> " +
            "and/or <b>Application Details</b> fields that you want access to Watch Count data in " +
            "the Browse API.</span>")
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
        ItemSummary itemSummary = (ItemSummary) o;
        return Objects.equals(this.additionalImages, itemSummary.additionalImages) &&
                Objects.equals(this.adultOnly, itemSummary.adultOnly) &&
                Objects.equals(this.availableCoupons, itemSummary.availableCoupons) &&
                Objects.equals(this.bidCount, itemSummary.bidCount) &&
                Objects.equals(this.buyingOptions, itemSummary.buyingOptions) &&
                Objects.equals(this.categories, itemSummary.categories) &&
                Objects.equals(this.compatibilityMatch, itemSummary.compatibilityMatch) &&
                Objects.equals(this.compatibilityProperties, itemSummary.compatibilityProperties) &&
                Objects.equals(this.condition, itemSummary.condition) &&
                Objects.equals(this.conditionId, itemSummary.conditionId) &&
                Objects.equals(this.currentBidPrice, itemSummary.currentBidPrice) &&
                Objects.equals(this.distanceFromPickupLocation, itemSummary.distanceFromPickupLocation) &&
                Objects.equals(this.energyEfficiencyClass, itemSummary.energyEfficiencyClass) &&
                Objects.equals(this.epid, itemSummary.epid) &&
                Objects.equals(this.image, itemSummary.image) &&
                Objects.equals(this.itemAffiliateWebUrl, itemSummary.itemAffiliateWebUrl) &&
                Objects.equals(this.itemCreationDate, itemSummary.itemCreationDate) &&
                Objects.equals(this.itemEndDate, itemSummary.itemEndDate) &&
                Objects.equals(this.itemGroupHref, itemSummary.itemGroupHref) &&
                Objects.equals(this.itemGroupType, itemSummary.itemGroupType) &&
                Objects.equals(this.itemHref, itemSummary.itemHref) &&
                Objects.equals(this.itemId, itemSummary.itemId) &&
                Objects.equals(this.itemLocation, itemSummary.itemLocation) &&
                Objects.equals(this.itemWebUrl, itemSummary.itemWebUrl) &&
                Objects.equals(this.leafCategoryIds, itemSummary.leafCategoryIds) &&
                Objects.equals(this.legacyItemId, itemSummary.legacyItemId) &&
                Objects.equals(this.listingMarketplaceId, itemSummary.listingMarketplaceId) &&
                Objects.equals(this.marketingPrice, itemSummary.marketingPrice) &&
                Objects.equals(this.pickupOptions, itemSummary.pickupOptions) &&
                Objects.equals(this.price, itemSummary.price) &&
                Objects.equals(this.priceDisplayCondition, itemSummary.priceDisplayCondition) &&
                Objects.equals(this.priorityListing, itemSummary.priorityListing) &&
                Objects.equals(this.qualifiedPrograms, itemSummary.qualifiedPrograms) &&
                Objects.equals(this.seller, itemSummary.seller) &&
                Objects.equals(this.shippingOptions, itemSummary.shippingOptions) &&
                Objects.equals(this.shortDescription, itemSummary.shortDescription) &&
                Objects.equals(this.thumbnailImages, itemSummary.thumbnailImages) &&
                Objects.equals(this.title, itemSummary.title) &&
                Objects.equals(this.topRatedBuyingExperience, itemSummary.topRatedBuyingExperience) &&
                Objects.equals(this.tyreLabelImageUrl, itemSummary.tyreLabelImageUrl) &&
                Objects.equals(this.unitPrice, itemSummary.unitPrice) &&
                Objects.equals(this.unitPricingMeasure, itemSummary.unitPricingMeasure) &&
                Objects.equals(this.watchCount, itemSummary.watchCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalImages, adultOnly, availableCoupons, bidCount, buyingOptions, categories, compatibilityMatch, compatibilityProperties, condition, conditionId, currentBidPrice, distanceFromPickupLocation, energyEfficiencyClass, epid, image, itemAffiliateWebUrl, itemCreationDate, itemEndDate, itemGroupHref, itemGroupType, itemHref, itemId, itemLocation, itemWebUrl, leafCategoryIds, legacyItemId, listingMarketplaceId, marketingPrice, pickupOptions, price, priceDisplayCondition, priorityListing, qualifiedPrograms, seller, shippingOptions, shortDescription, thumbnailImages, title, topRatedBuyingExperience, tyreLabelImageUrl, unitPrice, unitPricingMeasure, watchCount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemSummary {\n");
        sb.append("    additionalImages: ").append(toIndentedString(additionalImages)).append("\n");
        sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
        sb.append("    availableCoupons: ").append(toIndentedString(availableCoupons)).append("\n");
        sb.append("    bidCount: ").append(toIndentedString(bidCount)).append("\n");
        sb.append("    buyingOptions: ").append(toIndentedString(buyingOptions)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    compatibilityMatch: ").append(toIndentedString(compatibilityMatch)).append("\n");
        sb.append("    compatibilityProperties: ").append(toIndentedString(compatibilityProperties)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
        sb.append("    currentBidPrice: ").append(toIndentedString(currentBidPrice)).append("\n");
        sb.append("    distanceFromPickupLocation: ").append(toIndentedString(distanceFromPickupLocation)).append("\n");
        sb.append("    energyEfficiencyClass: ").append(toIndentedString(energyEfficiencyClass)).append("\n");
        sb.append("    epid: ").append(toIndentedString(epid)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    itemAffiliateWebUrl: ").append(toIndentedString(itemAffiliateWebUrl)).append("\n");
        sb.append("    itemCreationDate: ").append(toIndentedString(itemCreationDate)).append("\n");
        sb.append("    itemEndDate: ").append(toIndentedString(itemEndDate)).append("\n");
        sb.append("    itemGroupHref: ").append(toIndentedString(itemGroupHref)).append("\n");
        sb.append("    itemGroupType: ").append(toIndentedString(itemGroupType)).append("\n");
        sb.append("    itemHref: ").append(toIndentedString(itemHref)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemLocation: ").append(toIndentedString(itemLocation)).append("\n");
        sb.append("    itemWebUrl: ").append(toIndentedString(itemWebUrl)).append("\n");
        sb.append("    leafCategoryIds: ").append(toIndentedString(leafCategoryIds)).append("\n");
        sb.append("    legacyItemId: ").append(toIndentedString(legacyItemId)).append("\n");
        sb.append("    listingMarketplaceId: ").append(toIndentedString(listingMarketplaceId)).append("\n");
        sb.append("    marketingPrice: ").append(toIndentedString(marketingPrice)).append("\n");
        sb.append("    pickupOptions: ").append(toIndentedString(pickupOptions)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    priceDisplayCondition: ").append(toIndentedString(priceDisplayCondition)).append("\n");
        sb.append("    priorityListing: ").append(toIndentedString(priorityListing)).append("\n");
        sb.append("    qualifiedPrograms: ").append(toIndentedString(qualifiedPrograms)).append("\n");
        sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
        sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    thumbnailImages: ").append(toIndentedString(thumbnailImages)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    topRatedBuyingExperience: ").append(toIndentedString(topRatedBuyingExperience)).append("\n");
        sb.append("    tyreLabelImageUrl: ").append(toIndentedString(tyreLabelImageUrl)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    unitPricingMeasure: ").append(toIndentedString(unitPricingMeasure)).append("\n");
        sb.append("    watchCount: ").append(toIndentedString(watchCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
