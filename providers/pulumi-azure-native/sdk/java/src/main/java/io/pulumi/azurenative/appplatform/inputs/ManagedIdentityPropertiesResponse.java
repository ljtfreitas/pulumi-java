// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed identity properties retrieved from ARM request headers.
 * 
 */
public final class ManagedIdentityPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedIdentityPropertiesResponse Empty = new ManagedIdentityPropertiesResponse();

    /**
     * Principal Id
     * 
     */
    @InputImport(name="principalId")
        private final @Nullable String principalId;

    public Optional<String> getPrincipalId() {
        return this.principalId == null ? Optional.empty() : Optional.ofNullable(this.principalId);
    }

    /**
     * Tenant Id
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * Type of the managed identity
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ManagedIdentityPropertiesResponse(
        @Nullable String principalId,
        @Nullable String tenantId,
        @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    private ManagedIdentityPropertiesResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ManagedIdentityPropertiesResponse build() {
            return new ManagedIdentityPropertiesResponse(principalId, tenantId, type);
        }
    }
}
