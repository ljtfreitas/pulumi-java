// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.UserFacingErrorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProtectionStatusDetailsResponse {
    /**
     * Specifies the protection status error of the resource
     * 
     */
    private final @Nullable UserFacingErrorResponse errorDetails;
    /**
     * Specifies the protection status of the resource
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private ProtectionStatusDetailsResponse(
        @CustomType.Parameter("errorDetails") @Nullable UserFacingErrorResponse errorDetails,
        @CustomType.Parameter("status") @Nullable String status) {
        this.errorDetails = errorDetails;
        this.status = status;
    }

    /**
     * Specifies the protection status error of the resource
     * 
    */
    public Optional<UserFacingErrorResponse> getErrorDetails() {
        return Optional.ofNullable(this.errorDetails);
    }
    /**
     * Specifies the protection status of the resource
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionStatusDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UserFacingErrorResponse errorDetails;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionStatusDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorDetails = defaults.errorDetails;
    	      this.status = defaults.status;
        }

        public Builder errorDetails(@Nullable UserFacingErrorResponse errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public ProtectionStatusDetailsResponse build() {
            return new ProtectionStatusDetailsResponse(errorDetails, status);
        }
    }
}
