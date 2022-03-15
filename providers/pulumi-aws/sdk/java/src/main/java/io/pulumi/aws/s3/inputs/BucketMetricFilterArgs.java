// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketMetricFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketMetricFilterArgs Empty = new BucketMetricFilterArgs();

    /**
     * Object prefix for filtering (singular).
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * Object tags for filtering (up to 10).
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public BucketMetricFilterArgs(
        @Nullable Output<String> prefix,
        @Nullable Output<Map<String,String>> tags) {
        this.prefix = prefix;
        this.tags = tags;
    }

    private BucketMetricFilterArgs() {
        this.prefix = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketMetricFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> prefix;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketMetricFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public BucketMetricFilterArgs build() {
            return new BucketMetricFilterArgs(prefix, tags);
        }
    }
}
