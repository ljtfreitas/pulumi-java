// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketReplicationRuleStatus;
import io.pulumi.awsnative.s3.outputs.BucketDeleteMarkerReplication;
import io.pulumi.awsnative.s3.outputs.BucketReplicationDestination;
import io.pulumi.awsnative.s3.outputs.BucketReplicationRuleFilter;
import io.pulumi.awsnative.s3.outputs.BucketSourceSelectionCriteria;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketReplicationRule {
    private final @Nullable BucketDeleteMarkerReplication deleteMarkerReplication;
    private final BucketReplicationDestination destination;
    private final @Nullable BucketReplicationRuleFilter filter;
    /**
     * A unique identifier for the rule.
     * 
     */
    private final @Nullable String id;
    /**
     * An object key name prefix that identifies the object or objects to which the rule applies.
     * 
     */
    private final @Nullable String prefix;
    private final @Nullable Integer priority;
    private final @Nullable BucketSourceSelectionCriteria sourceSelectionCriteria;
    /**
     * Specifies whether the rule is enabled.
     * 
     */
    private final BucketReplicationRuleStatus status;

    @OutputCustomType.Constructor({"deleteMarkerReplication","destination","filter","id","prefix","priority","sourceSelectionCriteria","status"})
    private BucketReplicationRule(
        @Nullable BucketDeleteMarkerReplication deleteMarkerReplication,
        BucketReplicationDestination destination,
        @Nullable BucketReplicationRuleFilter filter,
        @Nullable String id,
        @Nullable String prefix,
        @Nullable Integer priority,
        @Nullable BucketSourceSelectionCriteria sourceSelectionCriteria,
        BucketReplicationRuleStatus status) {
        this.deleteMarkerReplication = deleteMarkerReplication;
        this.destination = Objects.requireNonNull(destination);
        this.filter = filter;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        this.status = Objects.requireNonNull(status);
    }

    public Optional<BucketDeleteMarkerReplication> getDeleteMarkerReplication() {
        return Optional.ofNullable(this.deleteMarkerReplication);
    }
    public BucketReplicationDestination getDestination() {
        return this.destination;
    }
    public Optional<BucketReplicationRuleFilter> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * A unique identifier for the rule.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * An object key name prefix that identifies the object or objects to which the rule applies.
     * 
     */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    public Optional<BucketSourceSelectionCriteria> getSourceSelectionCriteria() {
        return Optional.ofNullable(this.sourceSelectionCriteria);
    }
    /**
     * Specifies whether the rule is enabled.
     * 
     */
    public BucketReplicationRuleStatus getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketDeleteMarkerReplication deleteMarkerReplication;
        private BucketReplicationDestination destination;
        private @Nullable BucketReplicationRuleFilter filter;
        private @Nullable String id;
        private @Nullable String prefix;
        private @Nullable Integer priority;
        private @Nullable BucketSourceSelectionCriteria sourceSelectionCriteria;
        private BucketReplicationRuleStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplication = defaults.deleteMarkerReplication;
    	      this.destination = defaults.destination;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriteria = defaults.sourceSelectionCriteria;
    	      this.status = defaults.status;
        }

        public Builder setDeleteMarkerReplication(@Nullable BucketDeleteMarkerReplication deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }

        public Builder setDestination(BucketReplicationDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setFilter(@Nullable BucketReplicationRuleFilter filter) {
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

        public Builder setSourceSelectionCriteria(@Nullable BucketSourceSelectionCriteria sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        public Builder setStatus(BucketReplicationRuleStatus status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BucketReplicationRule build() {
            return new BucketReplicationRule(deleteMarkerReplication, destination, filter, id, prefix, priority, sourceSelectionCriteria, status);
        }
    }
}
