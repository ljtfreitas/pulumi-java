// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.enums.ResourceIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the MSI properties of the Move Collection.
 * 
 */
public final class IdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * Gets or sets the principal id.
     * 
     */
    @InputImport(name="principalId")
        private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * Gets or sets the tenant id.
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * The type of identity used for the resource mover service.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<Either<String,ResourceIdentityType>> type;

    public Input<Either<String,ResourceIdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public IdentityArgs(
        @Nullable Input<String> principalId,
        @Nullable Input<String> tenantId,
        @Nullable Input<Either<String,ResourceIdentityType>> type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    private IdentityArgs() {
        this.principalId = Input.empty();
        this.tenantId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> principalId;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<Either<String,ResourceIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
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

        public Builder setType(@Nullable Input<Either<String,ResourceIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ResourceIdentityType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public IdentityArgs build() {
            return new IdentityArgs(principalId, tenantId, type);
        }
    }
}
