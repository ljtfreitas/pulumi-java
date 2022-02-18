// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.enums.ManagedIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed identity properties retrieved from ARM request headers.
 * 
 */
public final class ManagedIdentityPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIdentityPropertiesArgs Empty = new ManagedIdentityPropertiesArgs();

    /**
     * Principal Id
     * 
     */
    @InputImport(name="principalId")
    private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * Tenant Id
     * 
     */
    @InputImport(name="tenantId")
    private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * Type of the managed identity
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,ManagedIdentityType>> type;

    public Input<Either<String,ManagedIdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ManagedIdentityPropertiesArgs(
        @Nullable Input<String> principalId,
        @Nullable Input<String> tenantId,
        @Nullable Input<Either<String,ManagedIdentityType>> type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    private ManagedIdentityPropertiesArgs() {
        this.principalId = Input.empty();
        this.tenantId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> principalId;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<Either<String,ManagedIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setPrincipalId(@Nullable Input<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = Input.ofNullable(principalId);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,ManagedIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ManagedIdentityType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ManagedIdentityPropertiesArgs build() {
            return new ManagedIdentityPropertiesArgs(principalId, tenantId, type);
        }
    }
}
