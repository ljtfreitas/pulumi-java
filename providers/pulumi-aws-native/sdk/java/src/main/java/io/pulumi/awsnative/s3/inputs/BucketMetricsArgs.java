// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketMetricsStatus;
import io.pulumi.awsnative.s3.inputs.BucketReplicationTimeValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketMetricsArgs Empty = new BucketMetricsArgs();

    @InputImport(name="eventThreshold")
    private final @Nullable Input<BucketReplicationTimeValueArgs> eventThreshold;

    public Input<BucketReplicationTimeValueArgs> getEventThreshold() {
        return this.eventThreshold == null ? Input.empty() : this.eventThreshold;
    }

    @InputImport(name="status", required=true)
    private final Input<BucketMetricsStatus> status;

    public Input<BucketMetricsStatus> getStatus() {
        return this.status;
    }

    public BucketMetricsArgs(
        @Nullable Input<BucketReplicationTimeValueArgs> eventThreshold,
        Input<BucketMetricsStatus> status) {
        this.eventThreshold = eventThreshold;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketMetricsArgs() {
        this.eventThreshold = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketReplicationTimeValueArgs> eventThreshold;
        private Input<BucketMetricsStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventThreshold = defaults.eventThreshold;
    	      this.status = defaults.status;
        }

        public Builder setEventThreshold(@Nullable Input<BucketReplicationTimeValueArgs> eventThreshold) {
            this.eventThreshold = eventThreshold;
            return this;
        }

        public Builder setEventThreshold(@Nullable BucketReplicationTimeValueArgs eventThreshold) {
            this.eventThreshold = Input.ofNullable(eventThreshold);
            return this;
        }

        public Builder setStatus(Input<BucketMetricsStatus> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(BucketMetricsStatus status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public BucketMetricsArgs build() {
            return new BucketMetricsArgs(eventThreshold, status);
        }
    }
}