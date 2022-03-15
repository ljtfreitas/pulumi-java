// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The details of the identity used for CMK
 * 
 */
public final class CmkKekIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CmkKekIdentityArgs Empty = new CmkKekIdentityArgs();

    /**
     * Indicate that system assigned identity should be used. Mutually exclusive with 'userAssignedIdentity' field
     * 
     */
    @Import(name="useSystemAssignedIdentity")
      private final @Nullable Output<Boolean> useSystemAssignedIdentity;

    public Output<Boolean> getUseSystemAssignedIdentity() {
        return this.useSystemAssignedIdentity == null ? Output.empty() : this.useSystemAssignedIdentity;
    }

    /**
     * The user assigned identity to be used to grant permissions in case the type of identity used is UserAssigned
     * 
     */
    @Import(name="userAssignedIdentity")
      private final @Nullable Output<String> userAssignedIdentity;

    public Output<String> getUserAssignedIdentity() {
        return this.userAssignedIdentity == null ? Output.empty() : this.userAssignedIdentity;
    }

    public CmkKekIdentityArgs(
        @Nullable Output<Boolean> useSystemAssignedIdentity,
        @Nullable Output<String> userAssignedIdentity) {
        this.useSystemAssignedIdentity = useSystemAssignedIdentity;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    private CmkKekIdentityArgs() {
        this.useSystemAssignedIdentity = Output.empty();
        this.userAssignedIdentity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmkKekIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> useSystemAssignedIdentity;
        private @Nullable Output<String> userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(CmkKekIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.useSystemAssignedIdentity = defaults.useSystemAssignedIdentity;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder useSystemAssignedIdentity(@Nullable Output<Boolean> useSystemAssignedIdentity) {
            this.useSystemAssignedIdentity = useSystemAssignedIdentity;
            return this;
        }

        public Builder useSystemAssignedIdentity(@Nullable Boolean useSystemAssignedIdentity) {
            this.useSystemAssignedIdentity = Output.ofNullable(useSystemAssignedIdentity);
            return this;
        }

        public Builder userAssignedIdentity(@Nullable Output<String> userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        public Builder userAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = Output.ofNullable(userAssignedIdentity);
            return this;
        }
        public CmkKekIdentityArgs build() {
            return new CmkKekIdentityArgs(useSystemAssignedIdentity, userAssignedIdentity);
        }
    }
}
