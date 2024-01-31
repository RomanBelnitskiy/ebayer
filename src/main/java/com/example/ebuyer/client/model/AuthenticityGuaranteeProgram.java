package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * A type that identifies whether the item is qualified for the Authenticity Guarantee program.
 */
@Setter
@Schema(description = "A type that identifies whether the item is qualified for the Authenticity Guarantee program.")
public class AuthenticityGuaranteeProgram {
  @SerializedName("description")
  private String description = null;

  @SerializedName("termsWebUrl")
  private String termsWebUrl = null;

  public AuthenticityGuaranteeProgram description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An indication that the item is qualified for the Authenticity Guarantee program.
    *
   * @return description
  **/
  @Schema(description = "An indication that the item is qualified for the Authenticity Guarantee program.")
  public String getDescription() {
    return description;
  }

  public AuthenticityGuaranteeProgram termsWebUrl(String termsWebUrl) {
    this.termsWebUrl = termsWebUrl;
    return this;
  }

   /**
   * The URL to the Authenticity Guarantee program terms of use.
    *
   * @return termsWebUrl
  **/
  @Schema(description = "The URL to the Authenticity Guarantee program terms of use.")
  public String getTermsWebUrl() {
    return termsWebUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticityGuaranteeProgram authenticityGuaranteeProgram = (AuthenticityGuaranteeProgram) o;
    return Objects.equals(this.description, authenticityGuaranteeProgram.description) &&
        Objects.equals(this.termsWebUrl, authenticityGuaranteeProgram.termsWebUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, termsWebUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticityGuaranteeProgram {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsWebUrl: ").append(toIndentedString(termsWebUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
