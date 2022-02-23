// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm;

import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="description", required=true)
    private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * The ARN of an IAM role that is able to be assumed by the DLM service.
     * 
     */
    @InputImport(name="executionRoleArn", required=true)
    private final Input<String> executionRoleArn;

    public Input<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * See the `policy_details` configuration block. Max of 1.
     * 
     */
    @InputImport(name="policyDetails", required=true)
    private final Input<LifecyclePolicyPolicyDetailsArgs> policyDetails;

    public Input<LifecyclePolicyPolicyDetailsArgs> getPolicyDetails() {
        return this.policyDetails;
    }

    /**
     * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LifecyclePolicyArgs(
        Input<String> description,
        Input<String> executionRoleArn,
        Input<LifecyclePolicyPolicyDetailsArgs> policyDetails,
        @Nullable Input<String> state,
        @Nullable Input<Map<String,String>> tags) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.executionRoleArn = Objects.requireNonNull(executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
        this.policyDetails = Objects.requireNonNull(policyDetails, "expected parameter 'policyDetails' to be non-null");
        this.state = state;
        this.tags = tags;
    }

    private LifecyclePolicyArgs() {
        this.description = Input.empty();
        this.executionRoleArn = Input.empty();
        this.policyDetails = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> description;
        private Input<String> executionRoleArn;
        private Input<LifecyclePolicyPolicyDetailsArgs> policyDetails;
        private @Nullable Input<String> state;
        private @Nullable Input<Map<String,String>> tags;

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

        public Builder setDescription(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder setExecutionRoleArn(Input<String> executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }

        public Builder setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Input.of(Objects.requireNonNull(executionRoleArn));
            return this;
        }

        public Builder setPolicyDetails(Input<LifecyclePolicyPolicyDetailsArgs> policyDetails) {
            this.policyDetails = Objects.requireNonNull(policyDetails);
            return this;
        }

        public Builder setPolicyDetails(LifecyclePolicyPolicyDetailsArgs policyDetails) {
            this.policyDetails = Input.of(Objects.requireNonNull(policyDetails));
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LifecyclePolicyArgs build() {
            return new LifecyclePolicyArgs(description, executionRoleArn, policyDetails, state, tags);
        }
    }
}
