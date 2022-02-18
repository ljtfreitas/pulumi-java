// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam_instanceProfile;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceProfileArgs Empty = new InstanceProfileArgs();

    /**
     * Name of the role to add to the profile.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public InstanceProfileArgs(@Nullable Input<String> role) {
        this.role = role;
    }

    private InstanceProfileArgs() {
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public InstanceProfileArgs build() {
            return new InstanceProfileArgs(role);
        }
    }
}
