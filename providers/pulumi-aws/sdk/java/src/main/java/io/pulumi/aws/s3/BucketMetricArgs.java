// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.s3.inputs.BucketMetricFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketMetricArgs Empty = new BucketMetricArgs();

    /**
     * The name of the bucket to put metric configuration.
     * 
     */
    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<BucketMetricFilterArgs> filter;

    public Input<BucketMetricFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Unique identifier of the metrics configuration for the bucket.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public BucketMetricArgs(
        Input<String> bucket,
        @Nullable Input<BucketMetricFilterArgs> filter,
        @Nullable Input<String> name) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.filter = filter;
        this.name = name;
    }

    private BucketMetricArgs() {
        this.bucket = Input.empty();
        this.filter = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<BucketMetricFilterArgs> filter;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setFilter(@Nullable Input<BucketMetricFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable BucketMetricFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public BucketMetricArgs build() {
            return new BucketMetricArgs(bucket, filter, name);
        }
    }
}
