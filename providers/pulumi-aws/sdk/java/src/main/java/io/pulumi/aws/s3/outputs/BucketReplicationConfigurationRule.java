// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleDestination;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleFilter;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleSourceSelectionCriteria;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketReplicationConfigurationRule {
    /**
     * Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
     * 
     */
    private final @Nullable String deleteMarkerReplicationStatus;
    /**
     * Specifies the destination for the rule (documented below).
     * 
     */
    private final BucketReplicationConfigurationRuleDestination destination;
    /**
     * Filter that identifies subset of objects to which the replication rule applies (documented below).
     * 
     */
    private final @Nullable BucketReplicationConfigurationRuleFilter filter;
    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    private final @Nullable String id;
    /**
     * Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    private final @Nullable String prefix;
    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * Specifies special object selection criteria (documented below).
     * 
     */
    private final @Nullable BucketReplicationConfigurationRuleSourceSelectionCriteria sourceSelectionCriteria;
    /**
     * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"deleteMarkerReplicationStatus","destination","filter","id","prefix","priority","sourceSelectionCriteria","status"})
    private BucketReplicationConfigurationRule(
        @Nullable String deleteMarkerReplicationStatus,
        BucketReplicationConfigurationRuleDestination destination,
        @Nullable BucketReplicationConfigurationRuleFilter filter,
        @Nullable String id,
        @Nullable String prefix,
        @Nullable Integer priority,
        @Nullable BucketReplicationConfigurationRuleSourceSelectionCriteria sourceSelectionCriteria,
        String status) {
        this.deleteMarkerReplicationStatus = deleteMarkerReplicationStatus;
        this.destination = Objects.requireNonNull(destination);
        this.filter = filter;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
     * 
     */
    public Optional<String> getDeleteMarkerReplicationStatus() {
        return Optional.ofNullable(this.deleteMarkerReplicationStatus);
    }
    /**
     * Specifies the destination for the rule (documented below).
     * 
     */
    public BucketReplicationConfigurationRuleDestination getDestination() {
        return this.destination;
    }
    /**
     * Filter that identifies subset of objects to which the replication rule applies (documented below).
     * 
     */
    public Optional<BucketReplicationConfigurationRuleFilter> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Specifies special object selection criteria (documented below).
     * 
     */
    public Optional<BucketReplicationConfigurationRuleSourceSelectionCriteria> getSourceSelectionCriteria() {
        return Optional.ofNullable(this.sourceSelectionCriteria);
    }
    /**
     * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteMarkerReplicationStatus;
        private BucketReplicationConfigurationRuleDestination destination;
        private @Nullable BucketReplicationConfigurationRuleFilter filter;
        private @Nullable String id;
        private @Nullable String prefix;
        private @Nullable Integer priority;
        private @Nullable BucketReplicationConfigurationRuleSourceSelectionCriteria sourceSelectionCriteria;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplicationStatus = defaults.deleteMarkerReplicationStatus;
    	      this.destination = defaults.destination;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriteria = defaults.sourceSelectionCriteria;
    	      this.status = defaults.status;
        }

        public Builder setDeleteMarkerReplicationStatus(@Nullable String deleteMarkerReplicationStatus) {
            this.deleteMarkerReplicationStatus = deleteMarkerReplicationStatus;
            return this;
        }

        public Builder setDestination(BucketReplicationConfigurationRuleDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setFilter(@Nullable BucketReplicationConfigurationRuleFilter filter) {
            this.filter = filter;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setSourceSelectionCriteria(@Nullable BucketReplicationConfigurationRuleSourceSelectionCriteria sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BucketReplicationConfigurationRule build() {
            return new BucketReplicationConfigurationRule(deleteMarkerReplicationStatus, destination, filter, id, prefix, priority, sourceSelectionCriteria, status);
        }
    }
}
