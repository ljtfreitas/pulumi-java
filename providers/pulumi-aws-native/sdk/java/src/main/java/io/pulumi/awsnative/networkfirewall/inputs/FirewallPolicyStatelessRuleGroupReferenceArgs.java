// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyStatelessRuleGroupReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyStatelessRuleGroupReferenceArgs Empty = new FirewallPolicyStatelessRuleGroupReferenceArgs();

    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    @Import(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    public FirewallPolicyStatelessRuleGroupReferenceArgs(
        Output<Integer> priority,
        Output<String> resourceArn) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private FirewallPolicyStatelessRuleGroupReferenceArgs() {
        this.priority = Output.empty();
        this.resourceArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyStatelessRuleGroupReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> priority;
        private Output<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyStatelessRuleGroupReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public FirewallPolicyStatelessRuleGroupReferenceArgs build() {
            return new FirewallPolicyStatelessRuleGroupReferenceArgs(priority, resourceArn);
        }
    }
}
