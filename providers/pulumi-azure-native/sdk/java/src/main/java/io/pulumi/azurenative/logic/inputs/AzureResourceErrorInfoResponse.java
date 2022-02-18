// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The azure resource error info.
 * 
 */
public final class AzureResourceErrorInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureResourceErrorInfoResponse Empty = new AzureResourceErrorInfoResponse();

    /**
     * The error code.
     * 
     */
    @InputImport(name="code", required=true)
    private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * The error details.
     * 
     */
    @InputImport(name="details")
    private final @Nullable List<AzureResourceErrorInfoResponse> details;

    public List<AzureResourceErrorInfoResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }

    /**
     * The error message.
     * 
     */
    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    public AzureResourceErrorInfoResponse(
        String code,
        @Nullable List<AzureResourceErrorInfoResponse> details,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = details;
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private AzureResourceErrorInfoResponse() {
        this.code = null;
        this.details = List.of();
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureResourceErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<AzureResourceErrorInfoResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureResourceErrorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(@Nullable List<AzureResourceErrorInfoResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public AzureResourceErrorInfoResponse build() {
            return new AzureResourceErrorInfoResponse(code, details, message);
        }
    }
}
