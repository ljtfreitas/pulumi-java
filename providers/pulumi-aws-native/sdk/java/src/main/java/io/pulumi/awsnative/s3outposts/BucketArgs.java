// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts;

import io.pulumi.awsnative.s3outposts.inputs.BucketLifecycleConfigurationArgs;
import io.pulumi.awsnative.s3outposts.inputs.BucketTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * A name for the bucket.
     * 
     */
    @InputImport(name="bucketName")
        private final @Nullable Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    /**
     * Rules that define how Amazon S3Outposts manages objects during their lifetime.
     * 
     */
    @InputImport(name="lifecycleConfiguration")
        private final @Nullable Input<BucketLifecycleConfigurationArgs> lifecycleConfiguration;

    public Input<BucketLifecycleConfigurationArgs> getLifecycleConfiguration() {
        return this.lifecycleConfiguration == null ? Input.empty() : this.lifecycleConfiguration;
    }

    /**
     * The id of the customer outpost on which the bucket resides.
     * 
     */
    @InputImport(name="outpostId", required=true)
        private final Input<String> outpostId;

    public Input<String> getOutpostId() {
        return this.outpostId;
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this S3Outposts bucket.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<BucketTagArgs>> tags;

    public Input<List<BucketTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public BucketArgs(
        @Nullable Input<String> bucketName,
        @Nullable Input<BucketLifecycleConfigurationArgs> lifecycleConfiguration,
        Input<String> outpostId,
        @Nullable Input<List<BucketTagArgs>> tags) {
        this.bucketName = bucketName;
        this.lifecycleConfiguration = lifecycleConfiguration;
        this.outpostId = Objects.requireNonNull(outpostId, "expected parameter 'outpostId' to be non-null");
        this.tags = tags;
    }

    private BucketArgs() {
        this.bucketName = Input.empty();
        this.lifecycleConfiguration = Input.empty();
        this.outpostId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketName;
        private @Nullable Input<BucketLifecycleConfigurationArgs> lifecycleConfiguration;
        private Input<String> outpostId;
        private @Nullable Input<List<BucketTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.lifecycleConfiguration = defaults.lifecycleConfiguration;
    	      this.outpostId = defaults.outpostId;
    	      this.tags = defaults.tags;
        }

        public Builder setBucketName(@Nullable Input<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder setBucketName(@Nullable String bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder setLifecycleConfiguration(@Nullable Input<BucketLifecycleConfigurationArgs> lifecycleConfiguration) {
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }

        public Builder setLifecycleConfiguration(@Nullable BucketLifecycleConfigurationArgs lifecycleConfiguration) {
            this.lifecycleConfiguration = Input.ofNullable(lifecycleConfiguration);
            return this;
        }

        public Builder setOutpostId(Input<String> outpostId) {
            this.outpostId = Objects.requireNonNull(outpostId);
            return this;
        }

        public Builder setOutpostId(String outpostId) {
            this.outpostId = Input.of(Objects.requireNonNull(outpostId));
            return this;
        }

        public Builder setTags(@Nullable Input<List<BucketTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<BucketTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public BucketArgs build() {
            return new BucketArgs(bucketName, lifecycleConfiguration, outpostId, tags);
        }
    }
}
