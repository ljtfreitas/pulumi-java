// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.FirewallPolicyAssociationResponse;
import io.pulumi.googlenative.compute_alpha.outputs.FirewallPolicyRuleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetFirewallPolicyResult {
    /**
     * A list of associations that belong to this firewall policy.
     * 
     */
    private final List<FirewallPolicyAssociationResponse> associations;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
     * 
     */
    private final String fingerprint;
    /**
     * [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
     * 
     */
    private final String kind;
    /**
     * Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    private final String name;
    /**
     * The parent of the firewall policy.
     * 
     */
    private final String parent;
    /**
     * URL of the region where the regional firewall policy resides. This field is not applicable to global firewall policies. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    private final Integer ruleTupleCount;
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
     * 
     */
    private final List<FirewallPolicyRuleResponse> rules;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String shortName;
    /**
     * The scope of networks allowed to be associated with the firewall policy. This field can be either GLOBAL_VPC_NETWORK or REGIONAL_VPC_NETWORK. A firewall policy with the VPC scope set to GLOBAL_VPC_NETWORK is allowed to be attached only to global networks. When the VPC scope is set to REGIONAL_VPC_NETWORK the firewall policy is allowed to be attached only to regional networks in the same scope as the firewall policy. Note: if not specified then GLOBAL_VPC_NETWORK will be used.
     * 
     */
    private final String vpcNetworkScope;

    @OutputCustomType.Constructor({"associations","creationTimestamp","description","fingerprint","kind","name","parent","region","ruleTupleCount","rules","selfLink","selfLinkWithId","shortName","vpcNetworkScope"})
    private GetFirewallPolicyResult(
        List<FirewallPolicyAssociationResponse> associations,
        String creationTimestamp,
        String description,
        String fingerprint,
        String kind,
        String name,
        String parent,
        String region,
        Integer ruleTupleCount,
        List<FirewallPolicyRuleResponse> rules,
        String selfLink,
        String selfLinkWithId,
        String shortName,
        String vpcNetworkScope) {
        this.associations = Objects.requireNonNull(associations);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.parent = Objects.requireNonNull(parent);
        this.region = Objects.requireNonNull(region);
        this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
        this.rules = Objects.requireNonNull(rules);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.shortName = Objects.requireNonNull(shortName);
        this.vpcNetworkScope = Objects.requireNonNull(vpcNetworkScope);
    }

    /**
     * A list of associations that belong to this firewall policy.
     * 
     */
    public List<FirewallPolicyAssociationResponse> getAssociations() {
        return this.associations;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
     * 
     */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The parent of the firewall policy.
     * 
     */
    public String getParent() {
        return this.parent;
    }
    /**
     * URL of the region where the regional firewall policy resides. This field is not applicable to global firewall policies. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    public Integer getRuleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
     * 
     */
    public List<FirewallPolicyRuleResponse> getRules() {
        return this.rules;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getShortName() {
        return this.shortName;
    }
    /**
     * The scope of networks allowed to be associated with the firewall policy. This field can be either GLOBAL_VPC_NETWORK or REGIONAL_VPC_NETWORK. A firewall policy with the VPC scope set to GLOBAL_VPC_NETWORK is allowed to be attached only to global networks. When the VPC scope is set to REGIONAL_VPC_NETWORK the firewall policy is allowed to be attached only to regional networks in the same scope as the firewall policy. Note: if not specified then GLOBAL_VPC_NETWORK will be used.
     * 
     */
    public String getVpcNetworkScope() {
        return this.vpcNetworkScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FirewallPolicyAssociationResponse> associations;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String kind;
        private String name;
        private String parent;
        private String region;
        private Integer ruleTupleCount;
        private List<FirewallPolicyRuleResponse> rules;
        private String selfLink;
        private String selfLinkWithId;
        private String shortName;
        private String vpcNetworkScope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associations = defaults.associations;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.region = defaults.region;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.rules = defaults.rules;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shortName = defaults.shortName;
    	      this.vpcNetworkScope = defaults.vpcNetworkScope;
        }

        public Builder setAssociations(List<FirewallPolicyAssociationResponse> associations) {
            this.associations = Objects.requireNonNull(associations);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRuleTupleCount(Integer ruleTupleCount) {
            this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
            return this;
        }

        public Builder setRules(List<FirewallPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setShortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }

        public Builder setVpcNetworkScope(String vpcNetworkScope) {
            this.vpcNetworkScope = Objects.requireNonNull(vpcNetworkScope);
            return this;
        }
        public GetFirewallPolicyResult build() {
            return new GetFirewallPolicyResult(associations, creationTimestamp, description, fingerprint, kind, name, parent, region, ruleTupleCount, rules, selfLink, selfLinkWithId, shortName, vpcNetworkScope);
        }
    }
}
