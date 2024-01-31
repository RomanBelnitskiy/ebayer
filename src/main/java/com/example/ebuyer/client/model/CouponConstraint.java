package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This type is used to provide the expiration date of a coded coupon.
 */
@Setter
@Schema(description = "This type is used to provide the expiration date of a coded coupon.")
public class CouponConstraint {
    @SerializedName("expirationDate")
    private String expirationDate = null;

    public CouponConstraint expirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * This timestamp provides the expiration date of the coded coupon.
     *
     * @return expirationDate
     **/
    @Schema(description = "This timestamp provides the expiration date of the coded coupon.")
    public String getExpirationDate() {
        return expirationDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CouponConstraint couponConstraint = (CouponConstraint) o;
        return Objects.equals(this.expirationDate, couponConstraint.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponConstraint {\n");
        sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
