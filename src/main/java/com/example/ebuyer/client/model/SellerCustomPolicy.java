package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The container for custom policies that apply to a listed item.
 */
@Setter
@Schema(description = "The container for custom policies that apply to a listed item.")
public class SellerCustomPolicy {
    @SerializedName("description")
    private String description = null;

    @SerializedName("label")
    private String label = null;

    @SerializedName("type")
    private String type = null;

    public SellerCustomPolicy description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The seller-defined description of the policy.
     *
     * @return description
     **/
    @Schema(description = "The seller-defined description of the policy.")
    public String getDescription() {
        return description;
    }

    public SellerCustomPolicy label(String label) {
        this.label = label;
        return this;
    }

    /**
     * The seller-defined label for an individual custom policy.
     *
     * @return label
     **/
    @Schema(description = "The seller-defined label for an individual custom policy.")
    public String getLabel() {
        return label;
    }

    public SellerCustomPolicy type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of custom policy, such as PRODUCT_COMPLIANCE or TAKE_BACK. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:SellerCustomPolicyTypeEnum'>
     * eBay API documentation</a>
     *
     * @return type
     **/
    @Schema(description = "The type of custom policy, such as PRODUCT_COMPLIANCE or TAKE_BACK. For " +
            "implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:SellerCustomPolicyTypeEnum'>" +
            "eBay API documentation</a>")
    public String getType() {
        return type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellerCustomPolicy sellerCustomPolicy = (SellerCustomPolicy) o;
        return Objects.equals(this.description, sellerCustomPolicy.description) &&
                Objects.equals(this.label, sellerCustomPolicy.label) &&
                Objects.equals(this.type, sellerCustomPolicy.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, label, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerCustomPolicy {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
