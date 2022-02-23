// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoindexer.inputs;

import io.pulumi.azurenative.videoindexer.enums.ManagedServiceIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed service identity (system assigned and/or user assigned identities)
 * 
 */
public final class ManagedServiceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedServiceIdentityArgs Empty = new ManagedServiceIdentityArgs();

    /**
     * Type of managed service identity (where both SystemAssigned and UserAssigned types are allowed).
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<Either<String,ManagedServiceIdentityType>> type;

    public Input<Either<String,ManagedServiceIdentityType>> getType() {
        return this.type;
    }

    /**
     * The set of user assigned identities associated with the resource. The userAssignedIdentities dictionary keys will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}. The dictionary values can be empty objects ({}) in requests.
     * 
     */
    @InputImport(name="userAssignedIdentities")
        private final @Nullable Input<Map<String,Object>> userAssignedIdentities;

    public Input<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public ManagedServiceIdentityArgs(
        Input<Either<String,ManagedServiceIdentityType>> type,
        @Nullable Input<Map<String,Object>> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ManagedServiceIdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,ManagedServiceIdentityType>> type;
        private @Nullable Input<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(Input<Either<String,ManagedServiceIdentityType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,ManagedServiceIdentityType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Input<Map<String,Object>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = Input.ofNullable(userAssignedIdentities);
            return this;
        }
        public ManagedServiceIdentityArgs build() {
            return new ManagedServiceIdentityArgs(type, userAssignedIdentities);
        }
    }
}
