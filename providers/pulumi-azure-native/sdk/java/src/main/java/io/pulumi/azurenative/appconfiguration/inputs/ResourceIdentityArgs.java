// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.inputs;

import io.pulumi.azurenative.appconfiguration.enums.IdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An identity that can be associated with a resource.
 * 
 */
public final class ResourceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identities.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,IdentityType>> type;

    public Output<Either<String,IdentityType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The list of user-assigned identities associated with the resource. The user-assigned identity dictionary keys will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Output<Map<String,Object>> userAssignedIdentities;

    public Output<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Output.empty() : this.userAssignedIdentities;
    }

    public ResourceIdentityArgs(
        @Nullable Output<Either<String,IdentityType>> type,
        @Nullable Output<Map<String,Object>> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ResourceIdentityArgs() {
        this.type = Output.empty();
        this.userAssignedIdentities = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,IdentityType>> type;
        private @Nullable Output<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(@Nullable Output<Either<String,IdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable Either<String,IdentityType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = Output.ofNullable(userAssignedIdentities);
            return this;
        }
        public ResourceIdentityArgs build() {
            return new ResourceIdentityArgs(type, userAssignedIdentities);
        }
    }
}
