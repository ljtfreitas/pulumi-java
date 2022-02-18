// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.enums.ManagedIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A class represent managed identities used for request and response
 * 
 */
public final class ManagedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIdentityArgs Empty = new ManagedIdentityArgs();

    /**
     * Represent the identity type: systemAssigned, userAssigned, None
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,ManagedIdentityType>> type;

    public Input<Either<String,ManagedIdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Get or set the user assigned identities
     * 
     */
    @InputImport(name="userAssignedIdentities")
    private final @Nullable Input<Map<String,Object>> userAssignedIdentities;

    public Input<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public ManagedIdentityArgs(
        @Nullable Input<Either<String,ManagedIdentityType>> type,
        @Nullable Input<Map<String,Object>> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ManagedIdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ManagedIdentityType>> type;
        private @Nullable Input<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(@Nullable Input<Either<String,ManagedIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ManagedIdentityType> type) {
            this.type = Input.ofNullable(type);
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

        public ManagedIdentityArgs build() {
            return new ManagedIdentityArgs(type, userAssignedIdentities);
        }
    }
}
