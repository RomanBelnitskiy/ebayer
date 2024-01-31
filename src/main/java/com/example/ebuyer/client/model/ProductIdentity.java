package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the product identifier type/value pairs of product associated with an item.
 */
@Setter
@Schema(description = "The type that defines the fields for the product identifier type/value pairs of product associated with an item.")
public class ProductIdentity {
    @SerializedName("identifierType")
    private String identifierType = null;

    @SerializedName("identifierValue")
    private String identifierValue = null;

    public ProductIdentity identifierType(String identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    /**
     * The type of product identifier, such as UPC and EAN.
     *
     * @return identifierType
     **/
    @Schema(description = "The type of product identifier, such as UPC and EAN.")
    public String getIdentifierType() {
        return identifierType;
    }

    public ProductIdentity identifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
        return this;
    }

    /**
     * The product identifier value.
     *
     * @return identifierValue
     **/
    @Schema(description = "The product identifier value.")
    public String getIdentifierValue() {
        return identifierValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductIdentity productIdentity = (ProductIdentity) o;
        return Objects.equals(this.identifierType, productIdentity.identifierType) &&
                Objects.equals(this.identifierValue, productIdentity.identifierValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifierType, identifierValue);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductIdentity {\n");
        sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
        sb.append("    identifierValue: ").append(toIndentedString(identifierValue)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
