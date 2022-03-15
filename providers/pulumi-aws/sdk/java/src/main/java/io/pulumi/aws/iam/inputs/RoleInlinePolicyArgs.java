// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleInlinePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleInlinePolicyArgs Empty = new RoleInlinePolicyArgs();

    /**
     * Name of the role policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Policy document as a JSON formatted string.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    public RoleInlinePolicyArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> policy) {
        this.name = name;
        this.policy = policy;
    }

    private RoleInlinePolicyArgs() {
        this.name = Output.empty();
        this.policy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleInlinePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleInlinePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }
        public RoleInlinePolicyArgs build() {
            return new RoleInlinePolicyArgs(name, policy);
        }
    }
}
