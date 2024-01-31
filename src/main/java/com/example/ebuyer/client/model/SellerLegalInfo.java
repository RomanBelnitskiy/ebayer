package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for the contact information for a seller.
 */
@Setter
@Schema(description = "The type that defines the fields for the contact information for a seller.")
public class SellerLegalInfo {
    @SerializedName("email")
    private String email = null;

    @SerializedName("fax")
    private String fax = null;

    @SerializedName("imprint")
    private String imprint = null;

    @SerializedName("legalContactFirstName")
    private String legalContactFirstName = null;

    @SerializedName("legalContactLastName")
    private String legalContactLastName = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("phone")
    private String phone = null;

    @SerializedName("registrationNumber")
    private String registrationNumber = null;

    @SerializedName("sellerProvidedLegalAddress")
    private LegalAddress sellerProvidedLegalAddress = null;

    @SerializedName("termsOfService")
    private String termsOfService = null;

    @SerializedName("vatDetails")
    private List<VatDetail> vatDetails = null;

    @SerializedName("weeeNumber")
    private String weeeNumber = null;

    public SellerLegalInfo email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The seller's business email address.
     *
     * @return email
     **/
    @Schema(description = "The seller's business email address.")
    public String getEmail() {
        return email;
    }

    public SellerLegalInfo fax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * The seller's business fax number.
     *
     * @return fax
     **/
    @Schema(description = "The seller's business fax number.")
    public String getFax() {
        return fax;
    }

    public SellerLegalInfo imprint(String imprint) {
        this.imprint = imprint;
        return this;
    }

    /**
     * This is a free-form string created by the seller. This is information often found on business
     * cards, such as address. This is information used by some countries.
     *
     * @return imprint
     **/
    @Schema(description = "This is a free-form string created by the seller. This is information " +
            "often found on business cards, such as address. This is information used by some countries.")
    public String getImprint() {
        return imprint;
    }

    public SellerLegalInfo legalContactFirstName(String legalContactFirstName) {
        this.legalContactFirstName = legalContactFirstName;
        return this;
    }

    /**
     * The seller's first name.
     *
     * @return legalContactFirstName
     **/
    @Schema(description = "The seller's first name.")
    public String getLegalContactFirstName() {
        return legalContactFirstName;
    }

    public SellerLegalInfo legalContactLastName(String legalContactLastName) {
        this.legalContactLastName = legalContactLastName;
        return this;
    }

    /**
     * The seller's last name.
     *
     * @return legalContactLastName
     **/
    @Schema(description = "The seller's last name.")
    public String getLegalContactLastName() {
        return legalContactLastName;
    }

    public SellerLegalInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the seller's business.
     *
     * @return name
     **/
    @Schema(description = "The name of the seller's business.")
    public String getName() {
        return name;
    }

    public SellerLegalInfo phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * The seller's business phone number.
     *
     * @return phone
     **/
    @Schema(description = "The seller's business phone number.")
    public String getPhone() {
        return phone;
    }

    public SellerLegalInfo registrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    /**
     * The seller's registration number. This is information used by some countries.
     *
     * @return registrationNumber
     **/
    @Schema(description = "The seller's registration number. This is information used by some countries.")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public SellerLegalInfo sellerProvidedLegalAddress(LegalAddress sellerProvidedLegalAddress) {
        this.sellerProvidedLegalAddress = sellerProvidedLegalAddress;
        return this;
    }

    /**
     * Get sellerProvidedLegalAddress
     *
     * @return sellerProvidedLegalAddress
     **/
    @Schema(description = "")
    public LegalAddress getSellerProvidedLegalAddress() {
        return sellerProvidedLegalAddress;
    }

    public SellerLegalInfo termsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }

    /**
     * This is a free-form string created by the seller. This is the seller's terms or condition,
     * which is in addition to the seller's return policies.
     *
     * @return termsOfService
     **/
    @Schema(description = "This is a free-form string created by the seller. This is the seller's " +
            "terms or condition, which is in addition to the seller's return policies.")
    public String getTermsOfService() {
        return termsOfService;
    }

    public SellerLegalInfo vatDetails(List<VatDetail> vatDetails) {
        this.vatDetails = vatDetails;
        return this;
    }

    public SellerLegalInfo addVatDetailsItem(VatDetail vatDetailsItem) {
        if (this.vatDetails == null) {
            this.vatDetails = new ArrayList<>();
        }
        this.vatDetails.add(vatDetailsItem);
        return this;
    }

    /**
     * An array of the seller's VAT (value added tax) IDs and the issuing country. VAT is a tax
     * added by some European countries.
     *
     * @return vatDetails
     **/
    @Schema(description = "An array of the seller's VAT (value added tax) IDs and the issuing country. " +
            "VAT is a tax added by some European countries.")
    public List<VatDetail> getVatDetails() {
        return vatDetails;
    }

    public SellerLegalInfo weeeNumber(String weeeNumber) {
        this.weeeNumber = weeeNumber;
        return this;
    }

    /**
     * The Waste Electrical and Electronic Equipment (WEEE) registration number required for any seller
     * to place electrical and electronic equipment on the market in Germany. This manufacturer number
     * is assigned to the first distributors of electrical and electronic equipment and comprises
     * a country code and an 8-digit sequence of digits (e.g. “WEEE Reg. No. DE 12345678”).
     *
     * @return weeeNumber
     **/
    @Schema(description = "The Waste Electrical and Electronic Equipment (WEEE) registration number " +
            "required for any seller to place electrical and electronic equipment on the market in Germany. " +
            "This manufacturer number is assigned to the first distributors of electrical and electronic " +
            "equipment and comprises a country code and an 8-digit sequence of digits " +
            "(e.g. “WEEE Reg. No. DE 12345678”).")
    public String getWeeeNumber() {
        return weeeNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellerLegalInfo sellerLegalInfo = (SellerLegalInfo) o;
        return Objects.equals(this.email, sellerLegalInfo.email) &&
                Objects.equals(this.fax, sellerLegalInfo.fax) &&
                Objects.equals(this.imprint, sellerLegalInfo.imprint) &&
                Objects.equals(this.legalContactFirstName, sellerLegalInfo.legalContactFirstName) &&
                Objects.equals(this.legalContactLastName, sellerLegalInfo.legalContactLastName) &&
                Objects.equals(this.name, sellerLegalInfo.name) &&
                Objects.equals(this.phone, sellerLegalInfo.phone) &&
                Objects.equals(this.registrationNumber, sellerLegalInfo.registrationNumber) &&
                Objects.equals(this.sellerProvidedLegalAddress, sellerLegalInfo.sellerProvidedLegalAddress) &&
                Objects.equals(this.termsOfService, sellerLegalInfo.termsOfService) &&
                Objects.equals(this.vatDetails, sellerLegalInfo.vatDetails) &&
                Objects.equals(this.weeeNumber, sellerLegalInfo.weeeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, fax, imprint, legalContactFirstName, legalContactLastName, name, phone, registrationNumber, sellerProvidedLegalAddress, termsOfService, vatDetails, weeeNumber);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerLegalInfo {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    imprint: ").append(toIndentedString(imprint)).append("\n");
        sb.append("    legalContactFirstName: ").append(toIndentedString(legalContactFirstName)).append("\n");
        sb.append("    legalContactLastName: ").append(toIndentedString(legalContactLastName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
        sb.append("    sellerProvidedLegalAddress: ").append(toIndentedString(sellerProvidedLegalAddress)).append("\n");
        sb.append("    termsOfService: ").append(toIndentedString(termsOfService)).append("\n");
        sb.append("    vatDetails: ").append(toIndentedString(vatDetails)).append("\n");
        sb.append("    weeeNumber: ").append(toIndentedString(weeeNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
