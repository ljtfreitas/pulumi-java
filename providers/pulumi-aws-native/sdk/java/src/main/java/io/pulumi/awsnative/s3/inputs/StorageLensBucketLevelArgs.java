// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.StorageLensActivityMetricsArgs;
import io.pulumi.awsnative.s3.inputs.StorageLensPrefixLevelArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Bucket-level metrics configurations.
 * 
 */
public final class StorageLensBucketLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensBucketLevelArgs Empty = new StorageLensBucketLevelArgs();

    @Import(name="activityMetrics")
      private final @Nullable Output<StorageLensActivityMetricsArgs> activityMetrics;

    public Output<StorageLensActivityMetricsArgs> getActivityMetrics() {
        return this.activityMetrics == null ? Output.empty() : this.activityMetrics;
    }

    @Import(name="prefixLevel")
      private final @Nullable Output<StorageLensPrefixLevelArgs> prefixLevel;

    public Output<StorageLensPrefixLevelArgs> getPrefixLevel() {
        return this.prefixLevel == null ? Output.empty() : this.prefixLevel;
    }

    public StorageLensBucketLevelArgs(
        @Nullable Output<StorageLensActivityMetricsArgs> activityMetrics,
        @Nullable Output<StorageLensPrefixLevelArgs> prefixLevel) {
        this.activityMetrics = activityMetrics;
        this.prefixLevel = prefixLevel;
    }

    private StorageLensBucketLevelArgs() {
        this.activityMetrics = Output.empty();
        this.prefixLevel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensBucketLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StorageLensActivityMetricsArgs> activityMetrics;
        private @Nullable Output<StorageLensPrefixLevelArgs> prefixLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensBucketLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityMetrics = defaults.activityMetrics;
    	      this.prefixLevel = defaults.prefixLevel;
        }

        public Builder activityMetrics(@Nullable Output<StorageLensActivityMetricsArgs> activityMetrics) {
            this.activityMetrics = activityMetrics;
            return this;
        }

        public Builder activityMetrics(@Nullable StorageLensActivityMetricsArgs activityMetrics) {
            this.activityMetrics = Output.ofNullable(activityMetrics);
            return this;
        }

        public Builder prefixLevel(@Nullable Output<StorageLensPrefixLevelArgs> prefixLevel) {
            this.prefixLevel = prefixLevel;
            return this;
        }

        public Builder prefixLevel(@Nullable StorageLensPrefixLevelArgs prefixLevel) {
            this.prefixLevel = Output.ofNullable(prefixLevel);
            return this;
        }
        public StorageLensBucketLevelArgs build() {
            return new StorageLensBucketLevelArgs(activityMetrics, prefixLevel);
        }
    }
}
