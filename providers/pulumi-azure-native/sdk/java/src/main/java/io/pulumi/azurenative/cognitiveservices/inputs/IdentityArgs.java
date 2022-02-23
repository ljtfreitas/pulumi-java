// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.enums.IdentityType;
import io.pulumi.azurenative.cognitiveservices.inputs.UserAssignedIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed service identity.
 * 
 */
public final class IdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * Type of managed service identity.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<IdentityType> type;

    public Input<IdentityType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The list of user assigned identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}
     * 
     */
    @InputImport(name="userAssignedIdentities")
        private final @Nullable Input<Map<String,UserAssignedIdentityArgs>> userAssignedIdentities;

    public Input<Map<String,UserAssignedIdentityArgs>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public IdentityArgs(
        @Nullable Input<IdentityType> type,
        @Nullable Input<Map<String,UserAssignedIdentityArgs>> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private IdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IdentityType> type;
        private @Nullable Input<Map<String,UserAssignedIdentityArgs>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(@Nullable Input<IdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable IdentityType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Input<Map<String,UserAssignedIdentityArgs>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,UserAssignedIdentityArgs> userAssignedIdentities) {
            this.userAssignedIdentities = Input.ofNullable(userAssignedIdentities);
            return this;
        }
        public IdentityArgs build() {
            return new IdentityArgs(type, userAssignedIdentities);
        }
    }
}
