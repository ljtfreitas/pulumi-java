// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssociationOutputLocation {
    /**
     * The S3 bucket name.
     * 
     */
    private final String s3BucketName;
    /**
     * The S3 bucket prefix. Results stored in the root if not configured.
     * 
     */
    private final @Nullable String s3KeyPrefix;
    /**
     * The S3 bucket region.
     * 
     */
    private final @Nullable String s3Region;

    @CustomType.Constructor
    private AssociationOutputLocation(
        @CustomType.Parameter("s3BucketName") String s3BucketName,
        @CustomType.Parameter("s3KeyPrefix") @Nullable String s3KeyPrefix,
        @CustomType.Parameter("s3Region") @Nullable String s3Region) {
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
        this.s3Region = s3Region;
    }

    /**
     * The S3 bucket name.
     * 
    */
    public String getS3BucketName() {
        return this.s3BucketName;
    }
    /**
     * The S3 bucket prefix. Results stored in the root if not configured.
     * 
    */
    public Optional<String> getS3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }
    /**
     * The S3 bucket region.
     * 
    */
    public Optional<String> getS3Region() {
        return Optional.ofNullable(this.s3Region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationOutputLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String s3BucketName;
        private @Nullable String s3KeyPrefix;
        private @Nullable String s3Region;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationOutputLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
    	      this.s3Region = defaults.s3Region;
        }

        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder s3Region(@Nullable String s3Region) {
            this.s3Region = s3Region;
            return this;
        }
        public AssociationOutputLocation build() {
            return new AssociationOutputLocation(s3BucketName, s3KeyPrefix, s3Region);
        }
    }
}
