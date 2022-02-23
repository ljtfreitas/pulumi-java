// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterRestoreToPointInTimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterRestoreToPointInTimeArgs Empty = new ClusterRestoreToPointInTimeArgs();

    /**
     * Date and time in UTC format to restore the database cluster to. Conflicts with `use_latest_restorable_time`.
     * 
     */
    @InputImport(name="restoreToTime")
    private final @Nullable Input<String> restoreToTime;

    public Input<String> getRestoreToTime() {
        return this.restoreToTime == null ? Input.empty() : this.restoreToTime;
    }

    /**
     * Type of restore to be performed.
     * Valid options are `full-copy` (default) and `copy-on-write`.
     * 
     */
    @InputImport(name="restoreType")
    private final @Nullable Input<String> restoreType;

    public Input<String> getRestoreType() {
        return this.restoreType == null ? Input.empty() : this.restoreType;
    }

    /**
     * The identifier of the source database cluster from which to restore.
     * 
     */
    @InputImport(name="sourceClusterIdentifier", required=true)
    private final Input<String> sourceClusterIdentifier;

    public Input<String> getSourceClusterIdentifier() {
        return this.sourceClusterIdentifier;
    }

    /**
     * Set to true to restore the database cluster to the latest restorable backup time. Defaults to false. Conflicts with `restore_to_time`.
     * 
     */
    @InputImport(name="useLatestRestorableTime")
    private final @Nullable Input<Boolean> useLatestRestorableTime;

    public Input<Boolean> getUseLatestRestorableTime() {
        return this.useLatestRestorableTime == null ? Input.empty() : this.useLatestRestorableTime;
    }

    public ClusterRestoreToPointInTimeArgs(
        @Nullable Input<String> restoreToTime,
        @Nullable Input<String> restoreType,
        Input<String> sourceClusterIdentifier,
        @Nullable Input<Boolean> useLatestRestorableTime) {
        this.restoreToTime = restoreToTime;
        this.restoreType = restoreType;
        this.sourceClusterIdentifier = Objects.requireNonNull(sourceClusterIdentifier, "expected parameter 'sourceClusterIdentifier' to be non-null");
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    private ClusterRestoreToPointInTimeArgs() {
        this.restoreToTime = Input.empty();
        this.restoreType = Input.empty();
        this.sourceClusterIdentifier = Input.empty();
        this.useLatestRestorableTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRestoreToPointInTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> restoreToTime;
        private @Nullable Input<String> restoreType;
        private Input<String> sourceClusterIdentifier;
        private @Nullable Input<Boolean> useLatestRestorableTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRestoreToPointInTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restoreToTime = defaults.restoreToTime;
    	      this.restoreType = defaults.restoreType;
    	      this.sourceClusterIdentifier = defaults.sourceClusterIdentifier;
    	      this.useLatestRestorableTime = defaults.useLatestRestorableTime;
        }

        public Builder setRestoreToTime(@Nullable Input<String> restoreToTime) {
            this.restoreToTime = restoreToTime;
            return this;
        }

        public Builder setRestoreToTime(@Nullable String restoreToTime) {
            this.restoreToTime = Input.ofNullable(restoreToTime);
            return this;
        }

        public Builder setRestoreType(@Nullable Input<String> restoreType) {
            this.restoreType = restoreType;
            return this;
        }

        public Builder setRestoreType(@Nullable String restoreType) {
            this.restoreType = Input.ofNullable(restoreType);
            return this;
        }

        public Builder setSourceClusterIdentifier(Input<String> sourceClusterIdentifier) {
            this.sourceClusterIdentifier = Objects.requireNonNull(sourceClusterIdentifier);
            return this;
        }

        public Builder setSourceClusterIdentifier(String sourceClusterIdentifier) {
            this.sourceClusterIdentifier = Input.of(Objects.requireNonNull(sourceClusterIdentifier));
            return this;
        }

        public Builder setUseLatestRestorableTime(@Nullable Input<Boolean> useLatestRestorableTime) {
            this.useLatestRestorableTime = useLatestRestorableTime;
            return this;
        }

        public Builder setUseLatestRestorableTime(@Nullable Boolean useLatestRestorableTime) {
            this.useLatestRestorableTime = Input.ofNullable(useLatestRestorableTime);
            return this;
        }
        public ClusterRestoreToPointInTimeArgs build() {
            return new ClusterRestoreToPointInTimeArgs(restoreToTime, restoreType, sourceClusterIdentifier, useLatestRestorableTime);
        }
    }
}