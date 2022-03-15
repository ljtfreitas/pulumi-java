// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm;

import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecyclePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyArgs Empty = new LifecyclePolicyArgs();

    /**
     * A description for the DLM lifecycle policy.
     * 
     */
    @Import(name="description", required=true)
      private final Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }

    /**
     * The ARN of an IAM role that is able to be assumed by the DLM service.
     * 
     */
    @Import(name="executionRoleArn", required=true)
      private final Output<String> executionRoleArn;

    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * See the `policy_details` configuration block. Max of 1.
     * 
     */
    @Import(name="policyDetails", required=true)
      private final Output<LifecyclePolicyPolicyDetailsArgs> policyDetails;

    public Output<LifecyclePolicyPolicyDetailsArgs> getPolicyDetails() {
        return this.policyDetails;
    }

    /**
     * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public LifecyclePolicyArgs(
        Output<String> description,
        Output<String> executionRoleArn,
        Output<LifecyclePolicyPolicyDetailsArgs> policyDetails,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.executionRoleArn = Objects.requireNonNull(executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
        this.policyDetails = Objects.requireNonNull(policyDetails, "expected parameter 'policyDetails' to be non-null");
        this.state = state;
        this.tags = tags;
    }

    private LifecyclePolicyArgs() {
        this.description = Output.empty();
        this.executionRoleArn = Output.empty();
        this.policyDetails = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> description;
        private Output<String> executionRoleArn;
        private Output<LifecyclePolicyPolicyDetailsArgs> policyDetails;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.policyDetails = defaults.policyDetails;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder description(Output<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder description(String description) {
            this.description = Output.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder executionRoleArn(Output<String> executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }

        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Output.of(Objects.requireNonNull(executionRoleArn));
            return this;
        }

        public Builder policyDetails(Output<LifecyclePolicyPolicyDetailsArgs> policyDetails) {
            this.policyDetails = Objects.requireNonNull(policyDetails);
            return this;
        }

        public Builder policyDetails(LifecyclePolicyPolicyDetailsArgs policyDetails) {
            this.policyDetails = Output.of(Objects.requireNonNull(policyDetails));
            return this;
        }

        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public LifecyclePolicyArgs build() {
            return new LifecyclePolicyArgs(description, executionRoleArn, policyDetails, state, tags);
        }
    }
}
