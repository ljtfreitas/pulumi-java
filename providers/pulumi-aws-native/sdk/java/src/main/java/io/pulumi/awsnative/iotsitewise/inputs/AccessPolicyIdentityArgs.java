// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyIamRoleArgs;
import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyIamUserArgs;
import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyUserArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The identity for this access policy. Choose either an SSO user or group or an IAM user or role.
 * 
 */
public final class AccessPolicyIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyIdentityArgs Empty = new AccessPolicyIdentityArgs();

    @InputImport(name="iamRole")
        private final @Nullable Input<AccessPolicyIamRoleArgs> iamRole;

    public Input<AccessPolicyIamRoleArgs> getIamRole() {
        return this.iamRole == null ? Input.empty() : this.iamRole;
    }

    @InputImport(name="iamUser")
        private final @Nullable Input<AccessPolicyIamUserArgs> iamUser;

    public Input<AccessPolicyIamUserArgs> getIamUser() {
        return this.iamUser == null ? Input.empty() : this.iamUser;
    }

    @InputImport(name="user")
        private final @Nullable Input<AccessPolicyUserArgs> user;

    public Input<AccessPolicyUserArgs> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public AccessPolicyIdentityArgs(
        @Nullable Input<AccessPolicyIamRoleArgs> iamRole,
        @Nullable Input<AccessPolicyIamUserArgs> iamUser,
        @Nullable Input<AccessPolicyUserArgs> user) {
        this.iamRole = iamRole;
        this.iamUser = iamUser;
        this.user = user;
    }

    private AccessPolicyIdentityArgs() {
        this.iamRole = Input.empty();
        this.iamUser = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AccessPolicyIamRoleArgs> iamRole;
        private @Nullable Input<AccessPolicyIamUserArgs> iamUser;
        private @Nullable Input<AccessPolicyUserArgs> user;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRole = defaults.iamRole;
    	      this.iamUser = defaults.iamUser;
    	      this.user = defaults.user;
        }

        public Builder setIamRole(@Nullable Input<AccessPolicyIamRoleArgs> iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        public Builder setIamRole(@Nullable AccessPolicyIamRoleArgs iamRole) {
            this.iamRole = Input.ofNullable(iamRole);
            return this;
        }

        public Builder setIamUser(@Nullable Input<AccessPolicyIamUserArgs> iamUser) {
            this.iamUser = iamUser;
            return this;
        }

        public Builder setIamUser(@Nullable AccessPolicyIamUserArgs iamUser) {
            this.iamUser = Input.ofNullable(iamUser);
            return this;
        }

        public Builder setUser(@Nullable Input<AccessPolicyUserArgs> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable AccessPolicyUserArgs user) {
            this.user = Input.ofNullable(user);
            return this;
        }
        public AccessPolicyIdentityArgs build() {
            return new AccessPolicyIdentityArgs(iamRole, iamUser, user);
        }
    }
}
