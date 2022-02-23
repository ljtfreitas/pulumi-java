// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the error happened when create or update an image template
 * 
 */
public final class ProvisioningErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProvisioningErrorResponse Empty = new ProvisioningErrorResponse();

    /**
     * Verbose error message about the provisioning failure
     * 
     */
    @InputImport(name="message")
        private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Error code of the provisioning failure
     * 
     */
    @InputImport(name="provisioningErrorCode")
        private final @Nullable String provisioningErrorCode;

    public Optional<String> getProvisioningErrorCode() {
        return this.provisioningErrorCode == null ? Optional.empty() : Optional.ofNullable(this.provisioningErrorCode);
    }

    public ProvisioningErrorResponse(
        @Nullable String message,
        @Nullable String provisioningErrorCode) {
        this.message = message;
        this.provisioningErrorCode = provisioningErrorCode;
    }

    private ProvisioningErrorResponse() {
        this.message = null;
        this.provisioningErrorCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisioningErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String provisioningErrorCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisioningErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.provisioningErrorCode = defaults.provisioningErrorCode;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setProvisioningErrorCode(@Nullable String provisioningErrorCode) {
            this.provisioningErrorCode = provisioningErrorCode;
            return this;
        }
        public ProvisioningErrorResponse build() {
            return new ProvisioningErrorResponse(message, provisioningErrorCode);
        }
    }
}
