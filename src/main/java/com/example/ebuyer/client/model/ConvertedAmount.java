package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This type defines the monetary value of an amount. It can provide the amount in both the currency
 * used on the eBay site where an item is being offered and the conversion of that value into another
 * currency, if applicable.
 */
@Setter
@Schema(description = "This type defines the monetary value of an amount. It can provide the amount in both " +
        "the currency used on the eBay site where an item is being offered and the conversion of that value " +
        "into another currency, if applicable.")
public class ConvertedAmount {
    @SerializedName("convertedFromCurrency")
    private String convertedFromCurrency = null;

    @SerializedName("convertedFromValue")
    private String convertedFromValue = null;

    @SerializedName("currency")
    private String currency = null;

    @SerializedName("value")
    private String value = null;

    public ConvertedAmount convertedFromCurrency(String convertedFromCurrency) {
        this.convertedFromCurrency = convertedFromCurrency;
        return this;
    }

    /**
     * The three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html " target="_blank">ISO 4217</a>
     * code representing the currency of the amount in the <b> convertedFromValue</b> field. This value is
     * required or returned only if currency conversion/localization is required, and represents
     * the pre-conversion currency. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CurrencyCodeEnum'>eBay API documentation</a>
     *
     * @return convertedFromCurrency
     **/
    @Schema(description = "The three-letter " +
            "<a href=\"https://www.iso.org/iso-4217-currency-codes.html \" target=\"_blank\">ISO 4217</a>" +
            " code representing the currency of the amount in the <b> convertedFromValue</b> field. " +
            "This value is required or returned only if currency conversion/localization is required, " +
            "and represents the pre-conversion currency. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CurrencyCodeEnum'>eBay API documentation</a>")
    public String getConvertedFromCurrency() {
        return convertedFromCurrency;
    }

    public ConvertedAmount convertedFromValue(String convertedFromValue) {
        this.convertedFromValue = convertedFromValue;
        return this;
    }

    /**
     * The monetary amount before any conversion is performed, in the currency specified by the
     * <b> convertedFromCurrency</b> field. This value is required or returned only if currency
     * conversion/localization is required. The <b> value</b> field contains the converted amount
     * of this value, in the currency specified by the <b> currency</b> field.
     *
     * @return convertedFromValue
     **/
    @Schema(description = "The monetary amount before any conversion is performed, in the currency " +
            "specified by the <b> convertedFromCurrency</b> field. This value is required or returned only " +
            "if currency conversion/localization is required. The <b> value</b> field contains the converted " +
            "amount of this value, in the currency specified by the <b> currency</b> field.")
    public String getConvertedFromValue() {
        return convertedFromValue;
    }

    public ConvertedAmount currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * The three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html " target="_blank">ISO 4217</a>
     * code representing the currency of the amount in the <b> value</b> field. If currency conversion/localization
     * is required, this is the post-conversion currency of the amount in the <b> value</b> field.
     * <br><br><b> Default:</b> The currency of the authenticated user's country. For implementation help,
     * refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CurrencyCodeEnum'>eBay API documentation</a>
     *
     * @return currency
     **/
    @Schema(description = "The three-letter " +
            "<a href=\"https://www.iso.org/iso-4217-currency-codes.html \" target=\"_blank\">ISO 4217</a> " +
            "code representing the currency of the amount in the <b> value</b> field. If currency " +
            "conversion/localization is required, this is the post-conversion currency of the amount in the " +
            "<b> value</b> field.   <br><br><b> Default:</b> The currency of the authenticated user's country. " +
            "For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/ba:CurrencyCodeEnum'>eBay API documentation</a>")
    public String getCurrency() {
        return currency;
    }

    public ConvertedAmount value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The monetary amount, in the currency specified by the <b> currency</b> field. If currency
     * conversion/localization is required, this value is the converted amount, and the <b> convertedFromValue</b>
     * field contains the amount in the original currency.
     *
     * @return value
     **/
    @Schema(description = "The monetary amount, in the currency specified by the <b> currency</b> field. " +
            "If currency conversion/localization is required, this value is the converted amount, and " +
            "the <b> convertedFromValue</b> field contains the amount in the original currency. ")
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
        ConvertedAmount convertedAmount = (ConvertedAmount) o;
        return Objects.equals(this.convertedFromCurrency, convertedAmount.convertedFromCurrency) &&
                Objects.equals(this.convertedFromValue, convertedAmount.convertedFromValue) &&
                Objects.equals(this.currency, convertedAmount.currency) &&
                Objects.equals(this.value, convertedAmount.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(convertedFromCurrency, convertedFromValue, currency, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertedAmount {\n");
        sb.append("    convertedFromCurrency: ").append(toIndentedString(convertedFromCurrency)).append("\n");
        sb.append("    convertedFromValue: ").append(toIndentedString(convertedFromValue)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
