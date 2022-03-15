// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceGuardOperationDetailResponse {
    private final @Nullable String defaultResourceRequest;
    private final @Nullable String vaultCriticalOperation;

    @CustomType.Constructor
    private ResourceGuardOperationDetailResponse(
        @CustomType.Parameter("defaultResourceRequest") @Nullable String defaultResourceRequest,
        @CustomType.Parameter("vaultCriticalOperation") @Nullable String vaultCriticalOperation) {
        this.defaultResourceRequest = defaultResourceRequest;
        this.vaultCriticalOperation = vaultCriticalOperation;
    }

    public Optional<String> getDefaultResourceRequest() {
        return Optional.ofNullable(this.defaultResourceRequest);
    }
    public Optional<String> getVaultCriticalOperation() {
        return Optional.ofNullable(this.vaultCriticalOperation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardOperationDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultResourceRequest;
        private @Nullable String vaultCriticalOperation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardOperationDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceRequest = defaults.defaultResourceRequest;
    	      this.vaultCriticalOperation = defaults.vaultCriticalOperation;
        }

        public Builder defaultResourceRequest(@Nullable String defaultResourceRequest) {
            this.defaultResourceRequest = defaultResourceRequest;
            return this;
        }

        public Builder vaultCriticalOperation(@Nullable String vaultCriticalOperation) {
            this.vaultCriticalOperation = vaultCriticalOperation;
            return this;
        }
        public ResourceGuardOperationDetailResponse build() {
            return new ResourceGuardOperationDetailResponse(defaultResourceRequest, vaultCriticalOperation);
        }
    }
}
