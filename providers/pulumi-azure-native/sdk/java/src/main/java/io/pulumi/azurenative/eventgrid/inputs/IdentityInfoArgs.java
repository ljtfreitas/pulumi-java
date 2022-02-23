// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.enums.IdentityType;
import io.pulumi.azurenative.eventgrid.inputs.UserIdentityPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The identity information for the resource.
 * 
 */
public final class IdentityInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityInfoArgs Empty = new IdentityInfoArgs();

    /**
     * The principal ID of resource identity.
     * 
     */
    @InputImport(name="principalId")
        private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<Either<String,IdentityType>> type;

    public Input<Either<String,IdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * This property is currently not used and reserved for future usage.
     * 
     */
    @InputImport(name="userAssignedIdentities")
        private final @Nullable Input<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

    public Input<Map<String,UserIdentityPropertiesArgs>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public IdentityInfoArgs(
        @Nullable Input<String> principalId,
        @Nullable Input<String> tenantId,
        @Nullable Input<Either<String,IdentityType>> type,
        @Nullable Input<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private IdentityInfoArgs() {
        this.principalId = Input.empty();
        this.tenantId = Input.empty();
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> principalId;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<Either<String,IdentityType>> type;
        private @Nullable Input<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
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

        public Builder setType(@Nullable Input<Either<String,IdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,IdentityType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Input<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesArgs> userAssignedIdentities) {
            this.userAssignedIdentities = Input.ofNullable(userAssignedIdentities);
            return this;
        }
        public IdentityInfoArgs build() {
            return new IdentityInfoArgs(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
