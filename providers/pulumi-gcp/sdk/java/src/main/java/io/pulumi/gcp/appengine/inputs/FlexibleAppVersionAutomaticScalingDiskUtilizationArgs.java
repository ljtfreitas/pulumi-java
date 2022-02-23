// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionAutomaticScalingDiskUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionAutomaticScalingDiskUtilizationArgs Empty = new FlexibleAppVersionAutomaticScalingDiskUtilizationArgs();

    /**
     * Target bytes read per second.
     * 
     */
    @InputImport(name="targetReadBytesPerSecond")
        private final @Nullable Input<Integer> targetReadBytesPerSecond;

    public Input<Integer> getTargetReadBytesPerSecond() {
        return this.targetReadBytesPerSecond == null ? Input.empty() : this.targetReadBytesPerSecond;
    }

    /**
     * Target ops read per seconds.
     * 
     */
    @InputImport(name="targetReadOpsPerSecond")
        private final @Nullable Input<Integer> targetReadOpsPerSecond;

    public Input<Integer> getTargetReadOpsPerSecond() {
        return this.targetReadOpsPerSecond == null ? Input.empty() : this.targetReadOpsPerSecond;
    }

    /**
     * Target bytes written per second.
     * 
     */
    @InputImport(name="targetWriteBytesPerSecond")
        private final @Nullable Input<Integer> targetWriteBytesPerSecond;

    public Input<Integer> getTargetWriteBytesPerSecond() {
        return this.targetWriteBytesPerSecond == null ? Input.empty() : this.targetWriteBytesPerSecond;
    }

    /**
     * Target ops written per second.
     * 
     */
    @InputImport(name="targetWriteOpsPerSecond")
        private final @Nullable Input<Integer> targetWriteOpsPerSecond;

    public Input<Integer> getTargetWriteOpsPerSecond() {
        return this.targetWriteOpsPerSecond == null ? Input.empty() : this.targetWriteOpsPerSecond;
    }

    public FlexibleAppVersionAutomaticScalingDiskUtilizationArgs(
        @Nullable Input<Integer> targetReadBytesPerSecond,
        @Nullable Input<Integer> targetReadOpsPerSecond,
        @Nullable Input<Integer> targetWriteBytesPerSecond,
        @Nullable Input<Integer> targetWriteOpsPerSecond) {
        this.targetReadBytesPerSecond = targetReadBytesPerSecond;
        this.targetReadOpsPerSecond = targetReadOpsPerSecond;
        this.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
        this.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
    }

    private FlexibleAppVersionAutomaticScalingDiskUtilizationArgs() {
        this.targetReadBytesPerSecond = Input.empty();
        this.targetReadOpsPerSecond = Input.empty();
        this.targetWriteBytesPerSecond = Input.empty();
        this.targetWriteOpsPerSecond = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionAutomaticScalingDiskUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> targetReadBytesPerSecond;
        private @Nullable Input<Integer> targetReadOpsPerSecond;
        private @Nullable Input<Integer> targetWriteBytesPerSecond;
        private @Nullable Input<Integer> targetWriteOpsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionAutomaticScalingDiskUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReadBytesPerSecond = defaults.targetReadBytesPerSecond;
    	      this.targetReadOpsPerSecond = defaults.targetReadOpsPerSecond;
    	      this.targetWriteBytesPerSecond = defaults.targetWriteBytesPerSecond;
    	      this.targetWriteOpsPerSecond = defaults.targetWriteOpsPerSecond;
        }

        public Builder setTargetReadBytesPerSecond(@Nullable Input<Integer> targetReadBytesPerSecond) {
            this.targetReadBytesPerSecond = targetReadBytesPerSecond;
            return this;
        }

        public Builder setTargetReadBytesPerSecond(@Nullable Integer targetReadBytesPerSecond) {
            this.targetReadBytesPerSecond = Input.ofNullable(targetReadBytesPerSecond);
            return this;
        }

        public Builder setTargetReadOpsPerSecond(@Nullable Input<Integer> targetReadOpsPerSecond) {
            this.targetReadOpsPerSecond = targetReadOpsPerSecond;
            return this;
        }

        public Builder setTargetReadOpsPerSecond(@Nullable Integer targetReadOpsPerSecond) {
            this.targetReadOpsPerSecond = Input.ofNullable(targetReadOpsPerSecond);
            return this;
        }

        public Builder setTargetWriteBytesPerSecond(@Nullable Input<Integer> targetWriteBytesPerSecond) {
            this.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
            return this;
        }

        public Builder setTargetWriteBytesPerSecond(@Nullable Integer targetWriteBytesPerSecond) {
            this.targetWriteBytesPerSecond = Input.ofNullable(targetWriteBytesPerSecond);
            return this;
        }

        public Builder setTargetWriteOpsPerSecond(@Nullable Input<Integer> targetWriteOpsPerSecond) {
            this.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
            return this;
        }

        public Builder setTargetWriteOpsPerSecond(@Nullable Integer targetWriteOpsPerSecond) {
            this.targetWriteOpsPerSecond = Input.ofNullable(targetWriteOpsPerSecond);
            return this;
        }
        public FlexibleAppVersionAutomaticScalingDiskUtilizationArgs build() {
            return new FlexibleAppVersionAutomaticScalingDiskUtilizationArgs(targetReadBytesPerSecond, targetReadOpsPerSecond, targetWriteBytesPerSecond, targetWriteOpsPerSecond);
        }
    }
}
