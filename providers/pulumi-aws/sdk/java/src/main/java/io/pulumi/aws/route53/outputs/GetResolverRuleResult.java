// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetResolverRuleResult {
    /**
     * The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    private final String arn;
    private final String domainName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    private final String ownerId;
    private final String resolverEndpointId;
    private final String resolverRuleId;
    private final String ruleType;
    /**
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    private final String shareStatus;
    /**
     * A map of tags assigned to the resolver rule.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"arn","domainName","id","name","ownerId","resolverEndpointId","resolverRuleId","ruleType","shareStatus","tags"})
    private GetResolverRuleResult(
        String arn,
        String domainName,
        String id,
        String name,
        String ownerId,
        String resolverEndpointId,
        String resolverRuleId,
        String ruleType,
        String shareStatus,
        Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn);
        this.domainName = Objects.requireNonNull(domainName);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.resolverEndpointId = Objects.requireNonNull(resolverEndpointId);
        this.resolverRuleId = Objects.requireNonNull(resolverRuleId);
        this.ruleType = Objects.requireNonNull(ruleType);
        this.shareStatus = Objects.requireNonNull(shareStatus);
        this.tags = Objects.requireNonNull(tags);
    }

    /**
     * The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    public String getOwnerId() {
        return this.ownerId;
    }
    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }
    public String getResolverRuleId() {
        return this.resolverRuleId;
    }
    public String getRuleType() {
        return this.ruleType;
    }
    /**
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    public String getShareStatus() {
        return this.shareStatus;
    }
    /**
     * A map of tags assigned to the resolver rule.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String domainName;
        private String id;
        private String name;
        private String ownerId;
        private String resolverEndpointId;
        private String resolverRuleId;
        private String ruleType;
        private String shareStatus;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domainName = defaults.domainName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.resolverRuleId = defaults.resolverRuleId;
    	      this.ruleType = defaults.ruleType;
    	      this.shareStatus = defaults.shareStatus;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setResolverEndpointId(String resolverEndpointId) {
            this.resolverEndpointId = Objects.requireNonNull(resolverEndpointId);
            return this;
        }

        public Builder setResolverRuleId(String resolverRuleId) {
            this.resolverRuleId = Objects.requireNonNull(resolverRuleId);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setShareStatus(String shareStatus) {
            this.shareStatus = Objects.requireNonNull(shareStatus);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetResolverRuleResult build() {
            return new GetResolverRuleResult(arn, domainName, id, name, ownerId, resolverEndpointId, resolverRuleId, ruleType, shareStatus, tags);
        }
    }
}
