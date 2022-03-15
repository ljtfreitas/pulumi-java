// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.enums.ApimIdentityType;
import io.pulumi.azurenative.apimanagement.inputs.UserIdentityPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity properties of the Api Management service resource.
 * 
 */
public final class ApiManagementServiceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiManagementServiceIdentityArgs Empty = new ApiManagementServiceIdentityArgs();

    /**
     * The type of identity used for the resource. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the service.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,ApimIdentityType>> type;

    public Output<Either<String,ApimIdentityType>> getType() {
        return this.type;
    }

    /**
     * The list of user identities associated with the resource. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     *     providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

    public Output<Map<String,UserIdentityPropertiesArgs>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Output.empty() : this.userAssignedIdentities;
    }

    public ApiManagementServiceIdentityArgs(
        Output<Either<String,ApimIdentityType>> type,
        @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ApiManagementServiceIdentityArgs() {
        this.type = Output.empty();
        this.userAssignedIdentities = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiManagementServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ApimIdentityType>> type;
        private @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiManagementServiceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(Output<Either<String,ApimIdentityType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(Either<String,ApimIdentityType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesArgs> userAssignedIdentities) {
            this.userAssignedIdentities = Output.ofNullable(userAssignedIdentities);
            return this;
        }
        public ApiManagementServiceIdentityArgs build() {
            return new ApiManagementServiceIdentityArgs(type, userAssignedIdentities);
        }
    }
}
