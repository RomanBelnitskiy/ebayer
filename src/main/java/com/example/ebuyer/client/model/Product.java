package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the product information of the item.
 */
@Setter
@Schema(description = "The type that defines the fields for the product information of the item.")
public class Product {
    @SerializedName("additionalImages")
    private List<Image> additionalImages = null;

    @SerializedName("additionalProductIdentities")
    private List<AdditionalProductIdentity> additionalProductIdentities = null;

    @SerializedName("aspectGroups")
    private List<AspectGroup> aspectGroups = null;

    @SerializedName("brand")
    private String brand = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("gtins")
    private List<String> gtins = null;

    @SerializedName("image")
    private Image image = null;

    @SerializedName("mpns")
    private List<String> mpns = null;

    @SerializedName("title")
    private String title = null;

    public Product additionalImages(List<Image> additionalImages) {
        this.additionalImages = additionalImages;
        return this;
    }

    public Product addAdditionalImagesItem(Image additionalImagesItem) {
        if (this.additionalImages == null) {
            this.additionalImages = new ArrayList<>();
        }
        this.additionalImages.add(additionalImagesItem);
        return this;
    }

    /**
     * An array of containers with the URLs for the product images that are in addition to the primary image.
     *
     * @return additionalImages
     **/
    @Schema(description = "An array of containers with the URLs for the product images that are " +
            "in addition to the primary image. ")
    public List<Image> getAdditionalImages() {
        return additionalImages;
    }

    public Product additionalProductIdentities(List<AdditionalProductIdentity> additionalProductIdentities) {
        this.additionalProductIdentities = additionalProductIdentities;
        return this;
    }

    public Product addAdditionalProductIdentitiesItem(AdditionalProductIdentity additionalProductIdentitiesItem) {
        if (this.additionalProductIdentities == null) {
            this.additionalProductIdentities = new ArrayList<>();
        }
        this.additionalProductIdentities.add(additionalProductIdentitiesItem);
        return this;
    }

    /**
     * An array of product identifiers associated with the item. This container is returned if
     * the seller has associated the eBay Product Identifier (ePID) with the item and in the request
     * <b> fieldgroups</b> is set to <code>PRODUCT</code>.
     *
     * @return additionalProductIdentities
     **/
    @Schema(description = "An array of product identifiers associated with the item. This container " +
            "is returned if the seller has associated the eBay Product Identifier (ePID) with the item " +
            "and in the request <b> fieldgroups</b> is set to <code>PRODUCT</code>.")
    public List<AdditionalProductIdentity> getAdditionalProductIdentities() {
        return additionalProductIdentities;
    }

    public Product aspectGroups(List<AspectGroup> aspectGroups) {
        this.aspectGroups = aspectGroups;
        return this;
    }

    public Product addAspectGroupsItem(AspectGroup aspectGroupsItem) {
        if (this.aspectGroups == null) {
            this.aspectGroups = new ArrayList<>();
        }
        this.aspectGroups.add(aspectGroupsItem);
        return this;
    }

    /**
     * An array of containers for the product aspects. Each group contains the aspect group name
     * and the aspect name/value pairs.
     *
     * @return aspectGroups
     **/
    @Schema(description = "An array of containers for the product aspects. Each group contains " +
            "the aspect group name and the aspect name/value pairs.")
    public List<AspectGroup> getAspectGroups() {
        return aspectGroups;
    }

    public Product brand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * The brand associated with product. To identify the product, this is always used along with
     * MPN (manufacturer part number).
     *
     * @return brand
     **/
    @Schema(description = "The brand associated with product. To identify the product, this is always " +
            "used along with MPN (manufacturer part number).")
    public String getBrand() {
        return brand;
    }

    public Product description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The rich description of an eBay product, which might contain HTML.
     *
     * @return description
     **/
    @Schema(description = "The rich description of an eBay product, which might contain HTML.")
    public String getDescription() {
        return description;
    }

    public Product gtins(List<String> gtins) {
        this.gtins = gtins;
        return this;
    }

    public Product addGtinsItem(String gtinsItem) {
        if (this.gtins == null) {
            this.gtins = new ArrayList<>();
        }
        this.gtins.add(gtinsItem);
        return this;
    }

    /**
     * An array of all the possible GTINs values associated with the product. A GTIN is
     * a unique Global Trade Item number of the item as defined by
     * <a href="https://www.gtin.info " target="_blank">https://www.gtin.info</a>.
     * This can be a UPC (Universal Product Code), EAN (European Article Number), or
     * an ISBN (International Standard Book Number) value.
     *
     * @return gtins
     **/
    @Schema(description = "An array of all the possible GTINs values associated with the product. " +
            "A GTIN is a unique Global Trade Item number of the item as defined by " +
            "<a href=\"https://www.gtin.info \" target=\"_blank\">https://www.gtin.info</a>. " +
            "This can be a UPC (Universal Product Code), EAN (European Article Number), or " +
            "an ISBN (International Standard Book Number) value.")
    public List<String> getGtins() {
        return gtins;
    }

    public Product image(Image image) {
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

    public Product mpns(List<String> mpns) {
        this.mpns = mpns;
        return this;
    }

    public Product addMpnsItem(String mpnsItem) {
        if (this.mpns == null) {
            this.mpns = new ArrayList<>();
        }
        this.mpns.add(mpnsItem);
        return this;
    }

    /**
     * An array of all possible MPN values associated with the product. A MPNs is manufacturer
     * part number of the product. To identify the product, this is always used along with brand.
     *
     * @return mpns
     **/
    @Schema(description = "An array of all possible MPN values associated with the product. " +
            "A MPNs is manufacturer part number of the product. To identify the product, this " +
            "is always used along with brand.")
    public List<String> getMpns() {
        return mpns;
    }

    public Product title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the product.
     *
     * @return title
     **/
    @Schema(description = "The title of the product.")
    public String getTitle() {
        return title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(this.additionalImages, product.additionalImages) &&
                Objects.equals(this.additionalProductIdentities, product.additionalProductIdentities) &&
                Objects.equals(this.aspectGroups, product.aspectGroups) &&
                Objects.equals(this.brand, product.brand) &&
                Objects.equals(this.description, product.description) &&
                Objects.equals(this.gtins, product.gtins) &&
                Objects.equals(this.image, product.image) &&
                Objects.equals(this.mpns, product.mpns) &&
                Objects.equals(this.title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalImages, additionalProductIdentities, aspectGroups, brand, description, gtins, image, mpns, title);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Product {\n");
        sb.append("    additionalImages: ").append(toIndentedString(additionalImages)).append("\n");
        sb.append("    additionalProductIdentities: ").append(toIndentedString(additionalProductIdentities)).append("\n");
        sb.append("    aspectGroups: ").append(toIndentedString(aspectGroups)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gtins: ").append(toIndentedString(gtins)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    mpns: ").append(toIndentedString(mpns)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
