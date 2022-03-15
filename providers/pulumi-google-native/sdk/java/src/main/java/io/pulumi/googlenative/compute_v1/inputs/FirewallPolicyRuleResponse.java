// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.FirewallPolicyRuleMatcherResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny).
 * 
 */
public final class FirewallPolicyRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyRuleResponse Empty = new FirewallPolicyRuleResponse();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
     * 
     */
    @Import(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * An optional description for this resource.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The direction in which this rule applies.
     * 
     */
    @Import(name="direction", required=true)
      private final String direction;

    public String getDirection() {
        return this.direction;
    }

    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    @Import(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
     * 
     */
    @Import(name="enableLogging", required=true)
      private final Boolean enableLogging;

    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    /**
     * [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
     */
    @Import(name="match", required=true)
      private final FirewallPolicyRuleMatcherResponse match;

    public FirewallPolicyRuleMatcherResponse getMatch() {
        return this.match;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Calculation of the complexity of a single firewall policy rule.
     * 
     */
    @Import(name="ruleTupleCount", required=true)
      private final Integer ruleTupleCount;

    public Integer getRuleTupleCount() {
        return this.ruleTupleCount;
    }

    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
     * 
     */
    @Import(name="targetResources", required=true)
      private final List<String> targetResources;

    public List<String> getTargetResources() {
        return this.targetResources;
    }

    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts", required=true)
      private final List<String> targetServiceAccounts;

    public List<String> getTargetServiceAccounts() {
        return this.targetServiceAccounts;
    }

    public FirewallPolicyRuleResponse(
        String action,
        String description,
        String direction,
        Boolean disabled,
        Boolean enableLogging,
        String kind,
        FirewallPolicyRuleMatcherResponse match,
        Integer priority,
        Integer ruleTupleCount,
        List<String> targetResources,
        List<String> targetServiceAccounts) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
        this.enableLogging = Objects.requireNonNull(enableLogging, "expected parameter 'enableLogging' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount, "expected parameter 'ruleTupleCount' to be non-null");
        this.targetResources = Objects.requireNonNull(targetResources, "expected parameter 'targetResources' to be non-null");
        this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts, "expected parameter 'targetServiceAccounts' to be non-null");
    }

    private FirewallPolicyRuleResponse() {
        this.action = null;
        this.description = null;
        this.direction = null;
        this.disabled = null;
        this.enableLogging = null;
        this.kind = null;
        this.match = null;
        this.priority = null;
        this.ruleTupleCount = null;
        this.targetResources = List.of();
        this.targetServiceAccounts = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String description;
        private String direction;
        private Boolean disabled;
        private Boolean enableLogging;
        private String kind;
        private FirewallPolicyRuleMatcherResponse match;
        private Integer priority;
        private Integer ruleTupleCount;
        private List<String> targetResources;
        private List<String> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.enableLogging = defaults.enableLogging;
    	      this.kind = defaults.kind;
    	      this.match = defaults.match;
    	      this.priority = defaults.priority;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.targetResources = defaults.targetResources;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder enableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder match(FirewallPolicyRuleMatcherResponse match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder ruleTupleCount(Integer ruleTupleCount) {
            this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
            return this;
        }

        public Builder targetResources(List<String> targetResources) {
            this.targetResources = Objects.requireNonNull(targetResources);
            return this;
        }

        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
            return this;
        }
        public FirewallPolicyRuleResponse build() {
            return new FirewallPolicyRuleResponse(action, description, direction, disabled, enableLogging, kind, match, priority, ruleTupleCount, targetResources, targetServiceAccounts);
        }
    }
}
