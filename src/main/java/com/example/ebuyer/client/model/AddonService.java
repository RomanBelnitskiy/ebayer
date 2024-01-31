package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * This container describes an add-on service that may be selected for an item or that may
 * apply automatically. A charge may be associated with the add-on service.
 */
@Setter
@Schema(description = "This container describes an add-on service that may be selected for an item or " +
        "that may apply automatically. A charge may be associated with the add-on service.")
public class AddonService {
    @SerializedName("selection")
    private String selection = null;

    @SerializedName("serviceFee")
    private ConvertedAmount serviceFee = null;

    @SerializedName("serviceId")
    private String serviceId = null;

    @SerializedName("serviceType")
    private String serviceType = null;

    public AddonService selection(String selection) {
        this.selection = selection;
        return this;
    }

    /**
     * This field indicates whether the add-on service must be selected for the item. For implementation
     * help, refer to <a href="https://developer.ebay.com/api-docs/buy/browse/types/gct:AddonServiceSelectionEnum">eBay API documentation</a>
     *
     * @return selection
     **/
    @Schema(description = "This field indicates whether the add-on service must be selected for the item. " +
            "For implementation help, refer to " +
            "<a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:AddonServiceSelectionEnum'>eBay API documentation</a>")
    public String getSelection() {
        return selection;
    }

    public AddonService serviceFee(ConvertedAmount serviceFee) {
        this.serviceFee = serviceFee;
        return this;
    }

    /**
     * Get serviceFee
     *
     * @return serviceFee
     **/
    @Schema(description = "")
    public ConvertedAmount getServiceFee() {
        return serviceFee;
    }

    public AddonService serviceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * The ID number of the add-on service.
     *
     * @return serviceId
     **/
    @Schema(description = "The ID number of the add-on service.")
    public String getServiceId() {
        return serviceId;
    }

    public AddonService serviceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * The type of add-on service, such as AUTHENTICITY_GUARANTEE. For implementation help, refer to
     * <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:AddonServiceTypeEnum'>eBay API documentation</a>
     *
     * @return serviceType
     **/
    @Schema(description = "The type of add-on service, such as AUTHENTICITY_GUARANTEE. For implementation help, " +
            "refer to <a href='https://developer.ebay.com/api-docs/buy/browse/types/gct:AddonServiceTypeEnum'>eBay API documentation</a>")
    public String getServiceType() {
        return serviceType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddonService addonService = (AddonService) o;
        return Objects.equals(this.selection, addonService.selection) &&
                Objects.equals(this.serviceFee, addonService.serviceFee) &&
                Objects.equals(this.serviceId, addonService.serviceId) &&
                Objects.equals(this.serviceType, addonService.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selection, serviceFee, serviceId, serviceType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonService {\n");

        sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
        sb.append("    serviceFee: ").append(toIndentedString(serviceFee)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
