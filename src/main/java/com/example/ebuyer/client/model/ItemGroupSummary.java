package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the details of each item in an item group.
 * An item group is  an item that has various aspect differences, such as color, size,
 * storage capacity, etc. When an item group is created, one of the item variations, such
 * as the red shirt size L, is chosen as the "parent". All the other items in the group are
 * the children, such as the blue shirt size L, red shirt size M, etc.
 * <br><br><span class="tablenote"><b> Note: </b> This container is returned only if the <b> item_id</b>
 * in the request is an item group (parent ID of an item with variations).</span>
 */
@Setter
@Schema(description = "The type that defines the fields for the details of each item in an item group. " +
        "An item group is  an item that has various aspect differences, such as color, size, storage " +
        "capacity, etc. When an item group is created, one of the item variations, such as the red shirt " +
        "size L, is chosen as the \"parent\". All the other items in the group are the children, such as " +
        "the blue shirt size L, red shirt size M, etc. <br><br><span class=\"tablenote\"><b> Note: </b> " +
        "This container is returned only if the <b> item_id</b> in the request is an item group (parent " +
        "ID of an item with variations).</span>")
public class ItemGroupSummary {
    @SerializedName("itemGroupAdditionalImages")
    private List<Image> itemGroupAdditionalImages = null;

    @SerializedName("itemGroupHref")
    private String itemGroupHref = null;

    @SerializedName("itemGroupId")
    private String itemGroupId = null;

    @SerializedName("itemGroupImage")
    private Image itemGroupImage = null;

    @SerializedName("itemGroupTitle")
    private String itemGroupTitle = null;

    @SerializedName("itemGroupType")
    private String itemGroupType = null;

    public ItemGroupSummary itemGroupAdditionalImages(List<Image> itemGroupAdditionalImages) {
        this.itemGroupAdditionalImages = itemGroupAdditionalImages;
        return this;
    }

    public ItemGroupSummary addItemGroupAdditionalImagesItem(Image itemGroupAdditionalImagesItem) {
        if (this.itemGroupAdditionalImages == null) {
            this.itemGroupAdditionalImages = new ArrayList<>();
        }
        this.itemGroupAdditionalImages.add(itemGroupAdditionalImagesItem);
        return this;
    }

    /**
     * An array of containers with the URLs for images that are in addition to the primary image
     * of the item group.  The primary image is returned in the <b> itemGroupImage</b> field.
     *
     * @return itemGroupAdditionalImages
     **/
    @Schema(description = "An array of containers with the URLs for images that are in addition to " +
            "the primary image of the item group.  The primary image is returned in the <b> itemGroupImage</b> field.")
    public List<Image> getItemGroupAdditionalImages() {
        return itemGroupAdditionalImages;
    }

    public ItemGroupSummary itemGroupHref(String itemGroupHref) {
        this.itemGroupHref = itemGroupHref;
        return this;
    }

    /**
     * The HATEOAS reference of the parent page of the item group. An item group is an item that
     * has various aspect differences, such as color, size, storage capacity, etc.
     *
     * @return itemGroupHref
     **/
    @Schema(description = "The HATEOAS reference of the parent page of the item group. An item group is " +
            "an item that has various aspect differences, such as color, size, storage capacity, etc. ")
    public String getItemGroupHref() {
        return itemGroupHref;
    }

    public ItemGroupSummary itemGroupId(String itemGroupId) {
        this.itemGroupId = itemGroupId;
        return this;
    }

    /**
     * The unique identifier for the item group. An item group is an item that has various aspect
     * differences, such as color, size, storage capacity, etc.
     *
     * @return itemGroupId
     **/
    @Schema(description = "The unique identifier for the item group. An item group is an item that has " +
            "various aspect differences, such as color, size, storage capacity, etc. ")
    public String getItemGroupId() {
        return itemGroupId;
    }

    public ItemGroupSummary itemGroupImage(Image itemGroupImage) {
        this.itemGroupImage = itemGroupImage;
        return this;
    }

    /**
     * Get itemGroupImage
     *
     * @return itemGroupImage
     **/
    @Schema(description = "")
    public Image getItemGroupImage() {
        return itemGroupImage;
    }

    public ItemGroupSummary itemGroupTitle(String itemGroupTitle) {
        this.itemGroupTitle = itemGroupTitle;
        return this;
    }

    /**
     * The title of the item that appears on the item group page. An item group is an item that
     * has various aspect differences, such as color, size, storage capacity, etc.
     *
     * @return itemGroupTitle
     **/
    @Schema(description = "The title of the item that appears on the item group page. An item group is " +
            "an item that has various aspect differences, such as color, size, storage capacity, etc. ")
    public String getItemGroupTitle() {
        return itemGroupTitle;
    }

    public ItemGroupSummary itemGroupType(String itemGroupType) {
        this.itemGroupType = itemGroupType;
        return this;
    }

    /**
     * An enumeration value that indicates the type of the item group. An item group is an item
     * that has various aspect differences, such as color, size, storage capacity, etc.
     * For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:ItemGroupTypeEnum'>eBay API documentation</a>
     *
     * @return itemGroupType
     **/
    @Schema(description = "An enumeration value that indicates the type of the item group. An item group " +
            "is an item that has various aspect differences, such as color, size, storage capacity, etc. " +
            "For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:ItemGroupTypeEnum'>" +
            "eBay API documentation</a>")
    public String getItemGroupType() {
        return itemGroupType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemGroupSummary itemGroupSummary = (ItemGroupSummary) o;
        return Objects.equals(this.itemGroupAdditionalImages, itemGroupSummary.itemGroupAdditionalImages) &&
                Objects.equals(this.itemGroupHref, itemGroupSummary.itemGroupHref) &&
                Objects.equals(this.itemGroupId, itemGroupSummary.itemGroupId) &&
                Objects.equals(this.itemGroupImage, itemGroupSummary.itemGroupImage) &&
                Objects.equals(this.itemGroupTitle, itemGroupSummary.itemGroupTitle) &&
                Objects.equals(this.itemGroupType, itemGroupSummary.itemGroupType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemGroupAdditionalImages, itemGroupHref, itemGroupId, itemGroupImage, itemGroupTitle, itemGroupType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemGroupSummary {\n");
        sb.append("    itemGroupAdditionalImages: ").append(toIndentedString(itemGroupAdditionalImages)).append("\n");
        sb.append("    itemGroupHref: ").append(toIndentedString(itemGroupHref)).append("\n");
        sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
        sb.append("    itemGroupImage: ").append(toIndentedString(itemGroupImage)).append("\n");
        sb.append("    itemGroupTitle: ").append(toIndentedString(itemGroupTitle)).append("\n");
        sb.append("    itemGroupType: ").append(toIndentedString(itemGroupType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
