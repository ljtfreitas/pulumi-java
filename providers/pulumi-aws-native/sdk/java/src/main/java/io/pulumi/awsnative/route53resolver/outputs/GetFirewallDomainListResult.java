// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.awsnative.route53resolver.enums.FirewallDomainListStatus;
import io.pulumi.awsnative.route53resolver.outputs.FirewallDomainListTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFirewallDomainListResult {
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
     * Count
     * 
     */
    private final @Nullable Integer domainCount;
    /**
     * ResourceId
     * 
     */
    private final @Nullable String id;
    /**
     * ServicePrincipal
     * 
     */
    private final @Nullable String managedOwnerName;
    /**
     * Rfc3339TimeString
     * 
     */
    private final @Nullable String modificationTime;
    /**
     * ResolverFirewallDomainList, possible values are COMPLETE, DELETING, UPDATING, COMPLETE_IMPORT_FAILED, IMPORTING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    private final @Nullable FirewallDomainListStatus status;
    /**
     * FirewallDomainListAssociationStatus
     * 
     */
    private final @Nullable String statusMessage;
    /**
     * Tags
     * 
     */
    private final @Nullable List<FirewallDomainListTag> tags;

    @OutputCustomType.Constructor
    private GetFirewallDomainListResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("creationTime") @Nullable String creationTime,
        @OutputCustomType.Parameter("creatorRequestId") @Nullable String creatorRequestId,
        @OutputCustomType.Parameter("domainCount") @Nullable Integer domainCount,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("managedOwnerName") @Nullable String managedOwnerName,
        @OutputCustomType.Parameter("modificationTime") @Nullable String modificationTime,
        @OutputCustomType.Parameter("status") @Nullable FirewallDomainListStatus status,
        @OutputCustomType.Parameter("statusMessage") @Nullable String statusMessage,
        @OutputCustomType.Parameter("tags") @Nullable List<FirewallDomainListTag> tags) {
        this.arn = arn;
        this.creationTime = creationTime;
        this.creatorRequestId = creatorRequestId;
        this.domainCount = domainCount;
        this.id = id;
        this.managedOwnerName = managedOwnerName;
        this.modificationTime = modificationTime;
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
     * Count
     * 
    */
    public Optional<Integer> getDomainCount() {
        return Optional.ofNullable(this.domainCount);
    }
    /**
     * ResourceId
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * ServicePrincipal
     * 
    */
    public Optional<String> getManagedOwnerName() {
        return Optional.ofNullable(this.managedOwnerName);
    }
    /**
     * Rfc3339TimeString
     * 
    */
    public Optional<String> getModificationTime() {
        return Optional.ofNullable(this.modificationTime);
    }
    /**
     * ResolverFirewallDomainList, possible values are COMPLETE, DELETING, UPDATING, COMPLETE_IMPORT_FAILED, IMPORTING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
    */
    public Optional<FirewallDomainListStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * FirewallDomainListAssociationStatus
     * 
    */
    public Optional<String> getStatusMessage() {
        return Optional.ofNullable(this.statusMessage);
    }
    /**
     * Tags
     * 
    */
    public List<FirewallDomainListTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallDomainListResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String creationTime;
        private @Nullable String creatorRequestId;
        private @Nullable Integer domainCount;
        private @Nullable String id;
        private @Nullable String managedOwnerName;
        private @Nullable String modificationTime;
        private @Nullable FirewallDomainListStatus status;
        private @Nullable String statusMessage;
        private @Nullable List<FirewallDomainListTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallDomainListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationTime = defaults.creationTime;
    	      this.creatorRequestId = defaults.creatorRequestId;
    	      this.domainCount = defaults.domainCount;
    	      this.id = defaults.id;
    	      this.managedOwnerName = defaults.managedOwnerName;
    	      this.modificationTime = defaults.modificationTime;
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

        public Builder setDomainCount(@Nullable Integer domainCount) {
            this.domainCount = domainCount;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setManagedOwnerName(@Nullable String managedOwnerName) {
            this.managedOwnerName = managedOwnerName;
            return this;
        }

        public Builder setModificationTime(@Nullable String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        public Builder setStatus(@Nullable FirewallDomainListStatus status) {
            this.status = status;
            return this;
        }

        public Builder setStatusMessage(@Nullable String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        public Builder setTags(@Nullable List<FirewallDomainListTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetFirewallDomainListResult build() {
            return new GetFirewallDomainListResult(arn, creationTime, creatorRequestId, domainCount, id, managedOwnerName, modificationTime, status, statusMessage, tags);
        }
    }
}
