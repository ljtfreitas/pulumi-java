// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyFirewallPolicyStatelessRuleGroupReference {
    /**
     * An integer setting that indicates the order in which to run the stateless rule groups in a single policy. AWS Network Firewall applies each stateless rule group to a packet starting with the group that has the lowest priority setting.
     * 
     */
    private final Integer priority;
    /**
     * The Amazon Resource Name (ARN) of the stateless rule group.
     * 
     */
    private final String resourceArn;

    @CustomType.Constructor
    private FirewallPolicyFirewallPolicyStatelessRuleGroupReference(
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("resourceArn") String resourceArn) {
        this.priority = priority;
        this.resourceArn = resourceArn;
    }

    /**
     * An integer setting that indicates the order in which to run the stateless rule groups in a single policy. AWS Network Firewall applies each stateless rule group to a packet starting with the group that has the lowest priority setting.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The Amazon Resource Name (ARN) of the stateless rule group.
     * 
    */
    public String getResourceArn() {
        return this.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessRuleGroupReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessRuleGroupReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public FirewallPolicyFirewallPolicyStatelessRuleGroupReference build() {
            return new FirewallPolicyFirewallPolicyStatelessRuleGroupReference(priority, resourceArn);
        }
    }
}
