// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupShareStatus;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupStatus;
import io.pulumi.awsnative.route53resolver.outputs.FirewallRuleGroupFirewallRule;
import io.pulumi.awsnative.route53resolver.outputs.FirewallRuleGroupTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFirewallRuleGroupResult {
    /**
     * Arn
     * 
     */
    private final @Nullable String arn;
    /**
     * Rfc3339TimeString
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The id of the creator request.
     * 
     */
    private final @Nullable String creatorRequestId;
    /**
     * FirewallRules
     * 
     */
    private final @Nullable List<FirewallRuleGroupFirewallRule> firewallRules;
    /**
     * ResourceId
     * 
     */
    private final @Nullable String id;
    /**
     * Rfc3339TimeString
     * 
     */
    private final @Nullable String modificationTime;
    /**
     * AccountId
     * 
     */
    private final @Nullable String ownerId;
    /**
     * Count
     * 
     */
    private final @Nullable Integer ruleCount;
    /**
     * ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
     */
    private final @Nullable FirewallRuleGroupShareStatus shareStatus;
    /**
     * ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    private final @Nullable FirewallRuleGroupStatus status;
    /**
     * FirewallRuleGroupStatus
     * 
     */
    private final @Nullable String statusMessage;
    /**
     * Tags
     * 
     */
    private final @Nullable List<FirewallRuleGroupTag> tags;

    @OutputCustomType.Constructor({"arn","creationTime","creatorRequestId","firewallRules","id","modificationTime","ownerId","ruleCount","shareStatus","status","statusMessage","tags"})
    private GetFirewallRuleGroupResult(
        @Nullable String arn,
        @Nullable String creationTime,
        @Nullable String creatorRequestId,
        @Nullable List<FirewallRuleGroupFirewallRule> firewallRules,
        @Nullable String id,
        @Nullable String modificationTime,
        @Nullable String ownerId,
        @Nullable Integer ruleCount,
        @Nullable FirewallRuleGroupShareStatus shareStatus,
        @Nullable FirewallRuleGroupStatus status,
        @Nullable String statusMessage,
        @Nullable List<FirewallRuleGroupTag> tags) {
        this.arn = arn;
        this.creationTime = creationTime;
        this.creatorRequestId = creatorRequestId;
        this.firewallRules = firewallRules;
        this.id = id;
        this.modificationTime = modificationTime;
        this.ownerId = ownerId;
        this.ruleCount = ruleCount;
        this.shareStatus = shareStatus;
        this.status = status;
        this.statusMessage = statusMessage;
        this.tags = tags;
    }

    /**
     * Arn
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Rfc3339TimeString
     * 
     */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The id of the creator request.
     * 
     */
    public Optional<String> getCreatorRequestId() {
        return Optional.ofNullable(this.creatorRequestId);
    }
    /**
     * FirewallRules
     * 
     */
    public List<FirewallRuleGroupFirewallRule> getFirewallRules() {
        return this.firewallRules == null ? List.of() : this.firewallRules;
    }
    /**
     * ResourceId
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Rfc3339TimeString
     * 
     */
    public Optional<String> getModificationTime() {
        return Optional.ofNullable(this.modificationTime);
    }
    /**
     * AccountId
     * 
     */
    public Optional<String> getOwnerId() {
        return Optional.ofNullable(this.ownerId);
    }
    /**
     * Count
     * 
     */
    public Optional<Integer> getRuleCount() {
        return Optional.ofNullable(this.ruleCount);
    }
    /**
     * ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
     */
    public Optional<FirewallRuleGroupShareStatus> getShareStatus() {
        return Optional.ofNullable(this.shareStatus);
    }
    /**
     * ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    public Optional<FirewallRuleGroupStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * FirewallRuleGroupStatus
     * 
     */
    public Optional<String> getStatusMessage() {
        return Optional.ofNullable(this.statusMessage);
    }
    /**
     * Tags
     * 
     */
    public List<FirewallRuleGroupTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallRuleGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String creationTime;
        private @Nullable String creatorRequestId;
        private @Nullable List<FirewallRuleGroupFirewallRule> firewallRules;
        private @Nullable String id;
        private @Nullable String modificationTime;
        private @Nullable String ownerId;
        private @Nullable Integer ruleCount;
        private @Nullable FirewallRuleGroupShareStatus shareStatus;
        private @Nullable FirewallRuleGroupStatus status;
        private @Nullable String statusMessage;
        private @Nullable List<FirewallRuleGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationTime = defaults.creationTime;
    	      this.creatorRequestId = defaults.creatorRequestId;
    	      this.firewallRules = defaults.firewallRules;
    	      this.id = defaults.id;
    	      this.modificationTime = defaults.modificationTime;
    	      this.ownerId = defaults.ownerId;
    	      this.ruleCount = defaults.ruleCount;
    	      this.shareStatus = defaults.shareStatus;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreatorRequestId(@Nullable String creatorRequestId) {
            this.creatorRequestId = creatorRequestId;
            return this;
        }

        public Builder setFirewallRules(@Nullable List<FirewallRuleGroupFirewallRule> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setModificationTime(@Nullable String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setRuleCount(@Nullable Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }

        public Builder setShareStatus(@Nullable FirewallRuleGroupShareStatus shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }

        public Builder setStatus(@Nullable FirewallRuleGroupStatus status) {
            this.status = status;
            return this;
        }

        public Builder setStatusMessage(@Nullable String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        public Builder setTags(@Nullable List<FirewallRuleGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetFirewallRuleGroupResult build() {
            return new GetFirewallRuleGroupResult(arn, creationTime, creatorRequestId, firewallRules, id, modificationTime, ownerId, ruleCount, shareStatus, status, statusMessage, tags);
        }
    }
}
