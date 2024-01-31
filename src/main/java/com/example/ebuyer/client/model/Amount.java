package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * Amount
 */
@Setter
public class Amount {
    @SerializedName("currency")
    private String currency = null;

    @SerializedName("value")
    private String value = null;

    public Amount currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * The list of valid currencies.
     * Each <a href="https://www.iso.org/iso-4217-currency-codes.html " target="_blank">ISO 4217</a>
     * currency code includes the currency name followed by the numeric value.<br><br>For example,
     * the Canadian Dollar code (CAD) would take the following form: <i>Canadian Dollar, 124</i>.
     * For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CurrencyCodeEnum'>eBay API documentation</a>
     *
     * @return currency
     **/
    @Schema(description = "The list of valid currencies. " +
            "Each <a href=\"https://www.iso.org/iso-4217-currency-codes.html \" target=\"_blank\">ISO 4217</a> " +
            "currency code includes the currency name followed by the numeric value.<br><br>For example, " +
            "the Canadian Dollar code (CAD) would take the following form: <i>Canadian Dollar, 124</i>. " +
            "For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CurrencyCodeEnum'>eBay API documentation</a>")
    public String getCurrency() {
        return currency;
    }

    public Amount value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the discounted amount.
     *
     * @return value
     **/
    @Schema(description = "The value of the discounted amount.")
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Amount amount = (Amount) o;
        return Objects.equals(this.currency, amount.currency) &&
                Objects.equals(this.value, amount.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Amount {\n");

        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
