// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs Empty = new ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs();

    /**
     * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
     * 
     */
    @Import(name="snapshotsEnabled", required=true)
      private final Output<Boolean> snapshotsEnabled;

    public Output<Boolean> getSnapshotsEnabled() {
        return this.snapshotsEnabled;
    }

    public ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs(Output<Boolean> snapshotsEnabled) {
        this.snapshotsEnabled = Objects.requireNonNull(snapshotsEnabled, "expected parameter 'snapshotsEnabled' to be non-null");
    }

    private ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs() {
        this.snapshotsEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> snapshotsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotsEnabled = defaults.snapshotsEnabled;
        }

        public Builder snapshotsEnabled(Output<Boolean> snapshotsEnabled) {
            this.snapshotsEnabled = Objects.requireNonNull(snapshotsEnabled);
            return this;
        }

        public Builder snapshotsEnabled(Boolean snapshotsEnabled) {
            this.snapshotsEnabled = Output.of(Objects.requireNonNull(snapshotsEnabled));
            return this;
        }
        public ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs build() {
            return new ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs(snapshotsEnabled);
        }
    }
}
