// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.aws.route53.inputs.ResolverRuleTargetIpGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverRuleState extends io.pulumi.resources.ResourceArgs {

    public static final ResolverRuleState Empty = new ResolverRuleState();

    /**
     * The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    /**
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Import(name="resolverEndpointId")
      private final @Nullable Output<String> resolverEndpointId;

    public Output<String> getResolverEndpointId() {
        return this.resolverEndpointId == null ? Output.empty() : this.resolverEndpointId;
    }

    /**
     * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    @Import(name="ruleType")
      private final @Nullable Output<String> ruleType;

    public Output<String> getRuleType() {
        return this.ruleType == null ? Output.empty() : this.ruleType;
    }

    /**
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @Import(name="shareStatus")
      private final @Nullable Output<String> shareStatus;

    public Output<String> getShareStatus() {
        return this.shareStatus == null ? Output.empty() : this.shareStatus;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Import(name="targetIps")
      private final @Nullable Output<List<ResolverRuleTargetIpGetArgs>> targetIps;

    public Output<List<ResolverRuleTargetIpGetArgs>> getTargetIps() {
        return this.targetIps == null ? Output.empty() : this.targetIps;
    }

    public ResolverRuleState(
        @Nullable Output<String> arn,
        @Nullable Output<String> domainName,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> resolverEndpointId,
        @Nullable Output<String> ruleType,
        @Nullable Output<String> shareStatus,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<ResolverRuleTargetIpGetArgs>> targetIps) {
        this.arn = arn;
        this.domainName = domainName;
        this.name = name;
        this.ownerId = ownerId;
        this.resolverEndpointId = resolverEndpointId;
        this.ruleType = ruleType;
        this.shareStatus = shareStatus;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetIps = targetIps;
    }

    private ResolverRuleState() {
        this.arn = Output.empty();
        this.domainName = Output.empty();
        this.name = Output.empty();
        this.ownerId = Output.empty();
        this.resolverEndpointId = Output.empty();
        this.ruleType = Output.empty();
        this.shareStatus = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.targetIps = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> domainName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> resolverEndpointId;
        private @Nullable Output<String> ruleType;
        private @Nullable Output<String> shareStatus;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<ResolverRuleTargetIpGetArgs>> targetIps;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domainName = defaults.domainName;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.ruleType = defaults.ruleType;
    	      this.shareStatus = defaults.shareStatus;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetIps = defaults.targetIps;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = Output.ofNullable(domainName);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }

        public Builder resolverEndpointId(@Nullable Output<String> resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }

        public Builder resolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = Output.ofNullable(resolverEndpointId);
            return this;
        }

        public Builder ruleType(@Nullable Output<String> ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public Builder ruleType(@Nullable String ruleType) {
            this.ruleType = Output.ofNullable(ruleType);
            return this;
        }

        public Builder shareStatus(@Nullable Output<String> shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }

        public Builder shareStatus(@Nullable String shareStatus) {
            this.shareStatus = Output.ofNullable(shareStatus);
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

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder targetIps(@Nullable Output<List<ResolverRuleTargetIpGetArgs>> targetIps) {
            this.targetIps = targetIps;
            return this;
        }

        public Builder targetIps(@Nullable List<ResolverRuleTargetIpGetArgs> targetIps) {
            this.targetIps = Output.ofNullable(targetIps);
            return this;
        }
        public ResolverRuleState build() {
            return new ResolverRuleState(arn, domainName, name, ownerId, resolverEndpointId, ruleType, shareStatus, tags, tagsAll, targetIps);
        }
    }
}
