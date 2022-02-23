// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Body of the error response returned from the API.
 * 
 */
public final class ErrorEntityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorEntityResponse Empty = new ErrorEntityResponse();

    /**
     * Basic error code.
     * 
     */
    @InputImport(name="code")
        private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * Type of error.
     * 
     */
    @InputImport(name="extendedCode")
        private final @Nullable String extendedCode;

    public Optional<String> getExtendedCode() {
        return this.extendedCode == null ? Optional.empty() : Optional.ofNullable(this.extendedCode);
    }

    /**
     * Inner errors.
     * 
     */
    @InputImport(name="innerErrors")
        private final @Nullable List<ErrorEntityResponse> innerErrors;

    public List<ErrorEntityResponse> getInnerErrors() {
        return this.innerErrors == null ? List.of() : this.innerErrors;
    }

    /**
     * Any details of the error.
     * 
     */
    @InputImport(name="message")
        private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Message template.
     * 
     */
    @InputImport(name="messageTemplate")
        private final @Nullable String messageTemplate;

    public Optional<String> getMessageTemplate() {
        return this.messageTemplate == null ? Optional.empty() : Optional.ofNullable(this.messageTemplate);
    }

    /**
     * Parameters for the template.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable List<String> parameters;

    public List<String> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public ErrorEntityResponse(
        @Nullable String code,
        @Nullable String extendedCode,
        @Nullable List<ErrorEntityResponse> innerErrors,
        @Nullable String message,
        @Nullable String messageTemplate,
        @Nullable List<String> parameters) {
        this.code = code;
        this.extendedCode = extendedCode;
        this.innerErrors = innerErrors;
        this.message = message;
        this.messageTemplate = messageTemplate;
        this.parameters = parameters;
    }

    private ErrorEntityResponse() {
        this.code = null;
        this.extendedCode = null;
        this.innerErrors = List.of();
        this.message = null;
        this.messageTemplate = null;
        this.parameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorEntityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String extendedCode;
        private @Nullable List<ErrorEntityResponse> innerErrors;
        private @Nullable String message;
        private @Nullable String messageTemplate;
        private @Nullable List<String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorEntityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.extendedCode = defaults.extendedCode;
    	      this.innerErrors = defaults.innerErrors;
    	      this.message = defaults.message;
    	      this.messageTemplate = defaults.messageTemplate;
    	      this.parameters = defaults.parameters;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setExtendedCode(@Nullable String extendedCode) {
            this.extendedCode = extendedCode;
            return this;
        }

        public Builder setInnerErrors(@Nullable List<ErrorEntityResponse> innerErrors) {
            this.innerErrors = innerErrors;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setMessageTemplate(@Nullable String messageTemplate) {
            this.messageTemplate = messageTemplate;
            return this;
        }

        public Builder setParameters(@Nullable List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public ErrorEntityResponse build() {
            return new ErrorEntityResponse(code, extendedCode, innerErrors, message, messageTemplate, parameters);
        }
    }
}
