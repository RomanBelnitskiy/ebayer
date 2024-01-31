package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields that can be returned in an error.
 */
@Setter
@Schema(description = "The type that defines the fields that can be returned in an error.")
public class Error {
    @SerializedName("category")
    private String category = null;

    @SerializedName("domain")
    private String domain = null;

    @SerializedName("errorId")
    private Integer errorId = null;

    @SerializedName("inputRefIds")
    private List<String> inputRefIds = null;

    @SerializedName("longMessage")
    private String longMessage = null;

    @SerializedName("message")
    private String message = null;

    @SerializedName("outputRefIds")
    private List<String> outputRefIds = null;

    @SerializedName("parameters")
    private List<ErrorParameter> parameters = null;

    @SerializedName("subdomain")
    private String subdomain = null;

    public Error category(String category) {
        this.category = category;
        return this;
    }

    /**
     * This string value indicates the error category. There are three categories of errors:
     * request errors, application errors, and system errors.
     *
     * @return category
     **/
    @Schema(description = "This string value indicates the error category. There are three categories " +
            "of errors: request errors, application errors, and system errors. ")
    public String getCategory() {
        return category;
    }

    public Error domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The name of the primary system where the error occurred. This is relevant for application errors.
     *
     * @return domain
     **/
    @Schema(description = "The name of the primary system where the error occurred. This is relevant " +
            "for application errors.")
    public String getDomain() {
        return domain;
    }

    public Error errorId(Integer errorId) {
        this.errorId = errorId;
        return this;
    }

    /**
     * A unique code that identifies the particular error or warning that occurred. Your application
     * can use error codes as identifiers in your customized error-handling algorithms.
     *
     * @return errorId
     **/
    @Schema(description = "A unique code that identifies the particular error or warning that occurred. " +
            "Your application can use error codes as identifiers in your customized error-handling algorithms.")
    public Integer getErrorId() {
        return errorId;
    }

    public Error inputRefIds(List<String> inputRefIds) {
        this.inputRefIds = inputRefIds;
        return this;
    }

    public Error addInputRefIdsItem(String inputRefIdsItem) {
        if (this.inputRefIds == null) {
            this.inputRefIds = new ArrayList<>();
        }
        this.inputRefIds.add(inputRefIdsItem);
        return this;
    }

    /**
     * An array of reference IDs that identify the specific request elements most closely associated
     * to the error or warning, if any.
     *
     * @return inputRefIds
     **/
    @Schema(description = "An array of reference IDs that identify the specific request elements most " +
            "closely associated to the error or warning, if any.")
    public List<String> getInputRefIds() {
        return inputRefIds;
    }

    public Error longMessage(String longMessage) {
        this.longMessage = longMessage;
        return this;
    }

    /**
     * A detailed description of the condition that caused the error or warning, and information
     * on what to do to correct the problem.
     *
     * @return longMessage
     **/
    @Schema(description = "A detailed description of the condition that caused the error or warning, " +
            "and information on what to do to correct the problem.")
    public String getLongMessage() {
        return longMessage;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A description of the condition that caused the error or warning.
     *
     * @return message
     **/
    @Schema(description = "A description of the condition that caused the error or warning.")
    public String getMessage() {
        return message;
    }

    public Error outputRefIds(List<String> outputRefIds) {
        this.outputRefIds = outputRefIds;
        return this;
    }

    public Error addOutputRefIdsItem(String outputRefIdsItem) {
        if (this.outputRefIds == null) {
            this.outputRefIds = new ArrayList<>();
        }
        this.outputRefIds.add(outputRefIdsItem);
        return this;
    }

    /**
     * An array of reference IDs that identify the specific response elements most closely associated
     * to the error or warning, if any.
     *
     * @return outputRefIds
     **/
    @Schema(description = "An array of reference IDs that identify the specific response elements " +
            "most closely associated to the error or warning, if any.")
    public List<String> getOutputRefIds() {
        return outputRefIds;
    }

    public Error parameters(List<ErrorParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Error addParametersItem(ErrorParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * An array of warning and error messages that return one or more variables contextual information
     * about the error or warning. This is often the field or value that triggered the error or warning.
     *
     * @return parameters
     **/
    @Schema(description = "An array of warning and error messages that return one or more variables " +
            "contextual information about the error or warning. This is often the field or value that " +
            "triggered the error or warning.")
    public List<ErrorParameter> getParameters() {
        return parameters;
    }

    public Error subdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    /**
     * The name of the subdomain in which the error or warning occurred.
     *
     * @return subdomain
     **/
    @Schema(description = "The name of the subdomain in which the error or warning occurred.")
    public String getSubdomain() {
        return subdomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.category, error.category) &&
                Objects.equals(this.domain, error.domain) &&
                Objects.equals(this.errorId, error.errorId) &&
                Objects.equals(this.inputRefIds, error.inputRefIds) &&
                Objects.equals(this.longMessage, error.longMessage) &&
                Objects.equals(this.message, error.message) &&
                Objects.equals(this.outputRefIds, error.outputRefIds) &&
                Objects.equals(this.parameters, error.parameters) &&
                Objects.equals(this.subdomain, error.subdomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, domain, errorId, inputRefIds, longMessage, message, outputRefIds, parameters, subdomain);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
        sb.append("    inputRefIds: ").append(toIndentedString(inputRefIds)).append("\n");
        sb.append("    longMessage: ").append(toIndentedString(longMessage)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    outputRefIds: ").append(toIndentedString(outputRefIds)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
