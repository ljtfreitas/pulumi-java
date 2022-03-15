// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * For display only. Metadata associated with a VPC firewall rule, an implied VPC firewall rule, or a hierarchical firewall policy rule.
 * 
 */
public final class FirewallInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallInfoResponse Empty = new FirewallInfoResponse();

    /**
     * Possible values: ALLOW, DENY
     * 
     */
    @Import(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * Possible values: INGRESS, EGRESS
     * 
     */
    @Import(name="direction", required=true)
      private final String direction;

    public String getDirection() {
        return this.direction;
    }

    /**
     * The display name of the VPC firewall rule. This field is not applicable to hierarchical firewall policy rules.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * The firewall rule's type.
     * 
     */
    @Import(name="firewallRuleType", required=true)
      private final String firewallRuleType;

    public String getFirewallRuleType() {
        return this.firewallRuleType;
    }

    /**
     * The URI of the VPC network that the firewall rule is associated with. This field is not applicable to hierarchical firewall policy rules.
     * 
     */
    @Import(name="networkUri", required=true)
      private final String networkUri;

    public String getNetworkUri() {
        return this.networkUri;
    }

    /**
     * The hierarchical firewall policy that this rule is associated with. This field is not applicable to VPC firewall rules.
     * 
     */
    @Import(name="policy", required=true)
      private final String policy;

    public String getPolicy() {
        return this.policy;
    }

    /**
     * The priority of the firewall rule.
     * 
     */
    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * The target service accounts specified by the firewall rule.
     * 
     */
    @Import(name="targetServiceAccounts", required=true)
      private final List<String> targetServiceAccounts;

    public List<String> getTargetServiceAccounts() {
        return this.targetServiceAccounts;
    }

    /**
     * The target tags defined by the VPC firewall rule. This field is not applicable to hierarchical firewall policy rules.
     * 
     */
    @Import(name="targetTags", required=true)
      private final List<String> targetTags;

    public List<String> getTargetTags() {
        return this.targetTags;
    }

    /**
     * The URI of the VPC firewall rule. This field is not applicable to implied firewall rules or hierarchical firewall policy rules.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public FirewallInfoResponse(
        String action,
        String direction,
        String displayName,
        String firewallRuleType,
        String networkUri,
        String policy,
        Integer priority,
        List<String> targetServiceAccounts,
        List<String> targetTags,
        String uri) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.firewallRuleType = Objects.requireNonNull(firewallRuleType, "expected parameter 'firewallRuleType' to be non-null");
        this.networkUri = Objects.requireNonNull(networkUri, "expected parameter 'networkUri' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts, "expected parameter 'targetServiceAccounts' to be non-null");
        this.targetTags = Objects.requireNonNull(targetTags, "expected parameter 'targetTags' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private FirewallInfoResponse() {
        this.action = null;
        this.direction = null;
        this.displayName = null;
        this.firewallRuleType = null;
        this.networkUri = null;
        this.policy = null;
        this.priority = null;
        this.targetServiceAccounts = List.of();
        this.targetTags = List.of();
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String direction;
        private String displayName;
        private String firewallRuleType;
        private String networkUri;
        private String policy;
        private Integer priority;
        private List<String> targetServiceAccounts;
        private List<String> targetTags;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.firewallRuleType = defaults.firewallRuleType;
    	      this.networkUri = defaults.networkUri;
    	      this.policy = defaults.policy;
    	      this.priority = defaults.priority;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
    	      this.targetTags = defaults.targetTags;
    	      this.uri = defaults.uri;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder firewallRuleType(String firewallRuleType) {
            this.firewallRuleType = Objects.requireNonNull(firewallRuleType);
            return this;
        }

        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
            return this;
        }

        public Builder targetTags(List<String> targetTags) {
            this.targetTags = Objects.requireNonNull(targetTags);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public FirewallInfoResponse build() {
            return new FirewallInfoResponse(action, direction, displayName, firewallRuleType, networkUri, policy, priority, targetServiceAccounts, targetTags, uri);
        }
    }
}
