package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the estimated item availability information.
 */
@Setter
@Schema(description = "The type that defines the fields for the estimated item availability information.")
public class EstimatedAvailability {
    @SerializedName("availabilityThreshold")
    private Integer availabilityThreshold = null;

    @SerializedName("availabilityThresholdType")
    private String availabilityThresholdType = null;

    @SerializedName("deliveryOptions")
    private List<String> deliveryOptions = null;

    @SerializedName("estimatedAvailabilityStatus")
    private String estimatedAvailabilityStatus = null;

    @SerializedName("estimatedAvailableQuantity")
    private Integer estimatedAvailableQuantity = null;

    @SerializedName("estimatedSoldQuantity")
    private Integer estimatedSoldQuantity = null;

    public EstimatedAvailability availabilityThreshold(Integer availabilityThreshold) {
        this.availabilityThreshold = availabilityThreshold;
        return this;
    }

    /**
     * This field is return only when the seller sets their '<a href="#display-item-quantity">display item quantity</a>'
     * preference to <b> Display "More than 10 available" in your listing (if applicable)</b>.
     * The value of this field will be "10", which is the threshold value. <br><br>Code so that your app
     * gracefully handles any future changes to this value.
     *
     * @return availabilityThreshold
     **/
    @Schema(description = "This field is return only when the seller sets their " +
            "'<a href=\"#display-item-quantity\">display item quantity</a>' preference to <b> Display " +
            "\"More than 10 available\" in your listing (if applicable)</b>. The value of this field will " +
            "be \"10\", which is the threshold value. <br><br>Code so that your app gracefully handles " +
            "any future changes to this value.")
    public Integer getAvailabilityThreshold() {
        return availabilityThreshold;
    }

    public EstimatedAvailability availabilityThresholdType(String availabilityThresholdType) {
        this.availabilityThresholdType = availabilityThresholdType;
        return this;
    }

    /**
     * <a name="display-item-quantity"></a> This field is return only when the seller sets their
     * <b> Display Item Quantity</b> preference to <b> Display "More than 10 available" in your
     * listing (if applicable)</b>. The value of this field will be <code> MORE_THAN</code>.
     * This indicates that the seller has more than the 'quantity display preference', which is 10,
     * in stock for this item.    <br><br> The following are the display item quantity preferences
     * the seller can set. <br><ul><li> <b> Display "More than 10 available" in your listing (if applicable) </b>
     * <ul> <li>If the seller enables this preference, this field is returned as long as there are more
     * than 10 of this item in inventory.</li>  <li> If the quantity is equal to 10 or drops below 10,
     * this field is not returned and the estimated quantity of the item is returned in the
     * <b> estimatedAvailableQuantity</b> field.</li></ul> </li> <li> <b> Display the exact quantity
     * in your items</b> <br>If the seller enables this preference, the <b> availabilityThresholdType</b>
     * and <b> availabilityThreshold</b> fields are not returned and the estimated quantity of the item
     * is returned in the <b> estimatedAvailableQuantity</b> field.<br><br><b> Note: </b> Because
     * the quantity of an item can change several times within a second, it is impossible to return
     * the exact quantity. </li></ul>   <br>Code so that your app gracefully handles any future changes
     * to these preferences. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:AvailabilityThresholdEnum'>eBay API documentation</a>
     *
     * @return availabilityThresholdType
     **/
    @Schema(description = "<a name=\"display-item-quantity\"></a> This field is return only when the seller " +
            "sets their <b> Display Item Quantity</b> preference to <b> Display \"More than 10 available\" " +
            "in your listing (if applicable)</b>. The value of this field will be <code> MORE_THAN</code>. " +
            "This indicates that the seller has more than the 'quantity display preference', which is 10, " +
            "in stock for this item.    <br><br> The following are the display item quantity preferences " +
            "the seller can set. <br><ul><li> <b> Display \"More than 10 available\" in your listing " +
            "(if applicable) </b><ul> <li>If the seller enables this preference, this field is returned " +
            "as long as there are more than 10 of this item in inventory.</li>  <li> If the quantity is equal " +
            "to 10 or drops below 10, this field is not returned and the estimated quantity of the item is " +
            "returned in the <b> estimatedAvailableQuantity</b> field.</li></ul> </li> <li> <b> Display " +
            "the exact quantity in your items</b> <br>If the seller enables this preference, the " +
            "<b> availabilityThresholdType</b> and <b> availabilityThreshold</b> fields are not returned " +
            "and the estimated quantity of the item is returned in the <b> estimatedAvailableQuantity</b> " +
            "field.<br><br><b> Note: </b> Because the quantity of an item can change several times within " +
            "a second, it is impossible to return the exact quantity. </li></ul>   <br>Code so that your app " +
            "gracefully handles any future changes to these preferences. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:AvailabilityThresholdEnum'>" +
            "eBay API documentation</a>")
    public String getAvailabilityThresholdType() {
        return availabilityThresholdType;
    }

    public EstimatedAvailability deliveryOptions(List<String> deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
        return this;
    }

    public EstimatedAvailability addDeliveryOptionsItem(String deliveryOptionsItem) {
        if (this.deliveryOptions == null) {
            this.deliveryOptions = new ArrayList<>();
        }
        this.deliveryOptions.add(deliveryOptionsItem);
        return this;
    }

    /**
     * An array of available delivery options. <br><br><b> Valid Values: </b> SHIP_TO_HOME,
     * SELLER_ARRANGED_LOCAL_PICKUP, IN_STORE_PICKUP, PICKUP_DROP_OFF, or DIGITAL_DELIVERY
     * <br><br>Code so that your app gracefully handles any future changes to this list.
     *
     * @return deliveryOptions
     **/
    @Schema(description = "An array of available delivery options. <br><br><b> Valid Values: </b> " +
            "SHIP_TO_HOME, SELLER_ARRANGED_LOCAL_PICKUP, IN_STORE_PICKUP, PICKUP_DROP_OFF, or " +
            "DIGITAL_DELIVERY <br><br>Code so that your app gracefully handles any future changes to this list. ")
    public List<String> getDeliveryOptions() {
        return deliveryOptions;
    }

    public EstimatedAvailability estimatedAvailabilityStatus(String estimatedAvailabilityStatus) {
        this.estimatedAvailabilityStatus = estimatedAvailabilityStatus;
        return this;
    }

    /**
     * An enumeration value representing the inventory status of this item.<br><br><span class="tablenote">
     * <b> Note: </b>Be sure to review the <b>itemEndDate</b> field to determine whether the item is
     * available for purchase.</span><br><br><b> Valid Values: </b> IN_STOCK, LIMITED_STOCK, or
     * OUT_OF_STOCK <br><br>Code so that your app gracefully handles any future changes to this list.
     * For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:AvailabilityStatusEnum'>
     * eBay API documentation</a>
     *
     * @return estimatedAvailabilityStatus
     **/
    @Schema(description = "An enumeration value representing the inventory status of this item.<br><br>" +
            "<span class=\"tablenote\"><b> Note: </b>Be sure to review the <b>itemEndDate</b> field " +
            "to determine whether the item is available for purchase.</span><br><br><b> Valid Values: </b> " +
            "IN_STOCK, LIMITED_STOCK, or OUT_OF_STOCK <br><br>Code so that your app gracefully handles " +
            "any future changes to this list. For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:AvailabilityStatusEnum'>" +
            "eBay API documentation</a>")
    public String getEstimatedAvailabilityStatus() {
        return estimatedAvailabilityStatus;
    }

    public EstimatedAvailability estimatedAvailableQuantity(Integer estimatedAvailableQuantity) {
        this.estimatedAvailableQuantity = estimatedAvailableQuantity;
        return this;
    }

    /**
     * The estimated number of this item that are available for purchase. Because the quantity of
     * an item can change several times within a second, it is impossible to return the exact quantity.
     * So instead of returning quantity, the estimated availability of the item is returned.
     *
     * @return estimatedAvailableQuantity
     **/
    @Schema(description = "The estimated number of this item that are available for purchase. Because " +
            "the quantity of an item can change several times within a second, it is impossible to return " +
            "the exact quantity. So instead of returning quantity, the estimated availability of the item is returned.")
    public Integer getEstimatedAvailableQuantity() {
        return estimatedAvailableQuantity;
    }

    public EstimatedAvailability estimatedSoldQuantity(Integer estimatedSoldQuantity) {
        this.estimatedSoldQuantity = estimatedSoldQuantity;
        return this;
    }

    /**
     * The estimated number of this item that have been sold.
     *
     * @return estimatedSoldQuantity
     **/
    @Schema(description = "The estimated number of this item that have been sold.")
    public Integer getEstimatedSoldQuantity() {
        return estimatedSoldQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EstimatedAvailability estimatedAvailability = (EstimatedAvailability) o;
        return Objects.equals(this.availabilityThreshold, estimatedAvailability.availabilityThreshold) &&
                Objects.equals(this.availabilityThresholdType, estimatedAvailability.availabilityThresholdType) &&
                Objects.equals(this.deliveryOptions, estimatedAvailability.deliveryOptions) &&
                Objects.equals(this.estimatedAvailabilityStatus, estimatedAvailability.estimatedAvailabilityStatus) &&
                Objects.equals(this.estimatedAvailableQuantity, estimatedAvailability.estimatedAvailableQuantity) &&
                Objects.equals(this.estimatedSoldQuantity, estimatedAvailability.estimatedSoldQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityThreshold, availabilityThresholdType, deliveryOptions, estimatedAvailabilityStatus, estimatedAvailableQuantity, estimatedSoldQuantity);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EstimatedAvailability {\n");
        sb.append("    availabilityThreshold: ").append(toIndentedString(availabilityThreshold)).append("\n");
        sb.append("    availabilityThresholdType: ").append(toIndentedString(availabilityThresholdType)).append("\n");
        sb.append("    deliveryOptions: ").append(toIndentedString(deliveryOptions)).append("\n");
        sb.append("    estimatedAvailabilityStatus: ").append(toIndentedString(estimatedAvailabilityStatus)).append("\n");
        sb.append("    estimatedAvailableQuantity: ").append(toIndentedString(estimatedAvailableQuantity)).append("\n");
        sb.append("    estimatedSoldQuantity: ").append(toIndentedString(estimatedSoldQuantity)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
