// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.RouterNatRuleActionResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RouterNatRuleResponse {
    /**
     * The action to be enforced for traffic that matches this rule.
     * 
     */
    private final RouterNatRuleActionResponse action;
    /**
     * An optional description of this rule.
     * 
     */
    private final String description;
    /**
     * CEL expression that specifies the match condition that egress traffic from a VM is evaluated against. If it evaluates to true, the corresponding `action` is enforced. The following examples are valid match expressions for public NAT: "inIpRange(destination.ip, '1.1.0.0/16') || inIpRange(destination.ip, '2.2.0.0/16')" "destination.ip == '1.1.0.1' || destination.ip == '8.8.8.8'" The following example is a valid match expression for private NAT: "nexthop.hub == 'https://networkconnectivity.googleapis.com/v1alpha1/projects/my-project/global/hub/hub-1'"
     * 
     */
    private final String match;
    /**
     * An integer uniquely identifying a rule in the list. The rule number must be a positive value between 0 and 65000, and must be unique among rules within a NAT.
     * 
     */
    private final Integer ruleNumber;

    @OutputCustomType.Constructor({"action","description","match","ruleNumber"})
    private RouterNatRuleResponse(
        RouterNatRuleActionResponse action,
        String description,
        String match,
        Integer ruleNumber) {
        this.action = Objects.requireNonNull(action);
        this.description = Objects.requireNonNull(description);
        this.match = Objects.requireNonNull(match);
        this.ruleNumber = Objects.requireNonNull(ruleNumber);
    }

    /**
     * The action to be enforced for traffic that matches this rule.
     * 
     */
    public RouterNatRuleActionResponse getAction() {
        return this.action;
    }
    /**
     * An optional description of this rule.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * CEL expression that specifies the match condition that egress traffic from a VM is evaluated against. If it evaluates to true, the corresponding `action` is enforced. The following examples are valid match expressions for public NAT: "inIpRange(destination.ip, '1.1.0.0/16') || inIpRange(destination.ip, '2.2.0.0/16')" "destination.ip == '1.1.0.1' || destination.ip == '8.8.8.8'" The following example is a valid match expression for private NAT: "nexthop.hub == 'https://networkconnectivity.googleapis.com/v1alpha1/projects/my-project/global/hub/hub-1'"
     * 
     */
    public String getMatch() {
        return this.match;
    }
    /**
     * An integer uniquely identifying a rule in the list. The rule number must be a positive value between 0 and 65000, and must be unique among rules within a NAT.
     * 
     */
    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterNatRuleActionResponse action;
        private String description;
        private String match;
        private Integer ruleNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.match = defaults.match;
    	      this.ruleNumber = defaults.ruleNumber;
        }

        public Builder setAction(RouterNatRuleActionResponse action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setMatch(String match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setRuleNumber(Integer ruleNumber) {
            this.ruleNumber = Objects.requireNonNull(ruleNumber);
            return this;
        }
        public RouterNatRuleResponse build() {
            return new RouterNatRuleResponse(action, description, match, ruleNumber);
        }
    }
}
