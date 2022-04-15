// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs Empty = new FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs();

    /**
     * Target bytes received per second.
     * 
     */
    @Import(name="targetReceivedBytesPerSecond")
      private final @Nullable Output<Integer> targetReceivedBytesPerSecond;

    public Output<Integer> targetReceivedBytesPerSecond() {
        return this.targetReceivedBytesPerSecond == null ? Codegen.empty() : this.targetReceivedBytesPerSecond;
    }

    /**
     * Target packets received per second.
     * 
     */
    @Import(name="targetReceivedPacketsPerSecond")
      private final @Nullable Output<Integer> targetReceivedPacketsPerSecond;

    public Output<Integer> targetReceivedPacketsPerSecond() {
        return this.targetReceivedPacketsPerSecond == null ? Codegen.empty() : this.targetReceivedPacketsPerSecond;
    }

    /**
     * Target bytes sent per second.
     * 
     */
    @Import(name="targetSentBytesPerSecond")
      private final @Nullable Output<Integer> targetSentBytesPerSecond;

    public Output<Integer> targetSentBytesPerSecond() {
        return this.targetSentBytesPerSecond == null ? Codegen.empty() : this.targetSentBytesPerSecond;
    }

    /**
     * Target packets sent per second.
     * 
     */
    @Import(name="targetSentPacketsPerSecond")
      private final @Nullable Output<Integer> targetSentPacketsPerSecond;

    public Output<Integer> targetSentPacketsPerSecond() {
        return this.targetSentPacketsPerSecond == null ? Codegen.empty() : this.targetSentPacketsPerSecond;
    }

    public FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs(
        @Nullable Output<Integer> targetReceivedBytesPerSecond,
        @Nullable Output<Integer> targetReceivedPacketsPerSecond,
        @Nullable Output<Integer> targetSentBytesPerSecond,
        @Nullable Output<Integer> targetSentPacketsPerSecond) {
        this.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
        this.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
        this.targetSentBytesPerSecond = targetSentBytesPerSecond;
        this.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
    }

    private FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs() {
        this.targetReceivedBytesPerSecond = Codegen.empty();
        this.targetReceivedPacketsPerSecond = Codegen.empty();
        this.targetSentBytesPerSecond = Codegen.empty();
        this.targetSentPacketsPerSecond = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> targetReceivedBytesPerSecond;
        private @Nullable Output<Integer> targetReceivedPacketsPerSecond;
        private @Nullable Output<Integer> targetSentBytesPerSecond;
        private @Nullable Output<Integer> targetSentPacketsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReceivedBytesPerSecond = defaults.targetReceivedBytesPerSecond;
    	      this.targetReceivedPacketsPerSecond = defaults.targetReceivedPacketsPerSecond;
    	      this.targetSentBytesPerSecond = defaults.targetSentBytesPerSecond;
    	      this.targetSentPacketsPerSecond = defaults.targetSentPacketsPerSecond;
        }

        public Builder targetReceivedBytesPerSecond(@Nullable Output<Integer> targetReceivedBytesPerSecond) {
            this.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
            return this;
        }
        public Builder targetReceivedBytesPerSecond(@Nullable Integer targetReceivedBytesPerSecond) {
            this.targetReceivedBytesPerSecond = Codegen.ofNullable(targetReceivedBytesPerSecond);
            return this;
        }
        public Builder targetReceivedPacketsPerSecond(@Nullable Output<Integer> targetReceivedPacketsPerSecond) {
            this.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
            return this;
        }
        public Builder targetReceivedPacketsPerSecond(@Nullable Integer targetReceivedPacketsPerSecond) {
            this.targetReceivedPacketsPerSecond = Codegen.ofNullable(targetReceivedPacketsPerSecond);
            return this;
        }
        public Builder targetSentBytesPerSecond(@Nullable Output<Integer> targetSentBytesPerSecond) {
            this.targetSentBytesPerSecond = targetSentBytesPerSecond;
            return this;
        }
        public Builder targetSentBytesPerSecond(@Nullable Integer targetSentBytesPerSecond) {
            this.targetSentBytesPerSecond = Codegen.ofNullable(targetSentBytesPerSecond);
            return this;
        }
        public Builder targetSentPacketsPerSecond(@Nullable Output<Integer> targetSentPacketsPerSecond) {
            this.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
            return this;
        }
        public Builder targetSentPacketsPerSecond(@Nullable Integer targetSentPacketsPerSecond) {
            this.targetSentPacketsPerSecond = Codegen.ofNullable(targetSentPacketsPerSecond);
            return this;
        }        public FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs build() {
            return new FlexibleAppVersionAutomaticScalingNetworkUtilizationGetArgs(targetReceivedBytesPerSecond, targetReceivedPacketsPerSecond, targetSentBytesPerSecond, targetSentPacketsPerSecond);
        }
    }
}
