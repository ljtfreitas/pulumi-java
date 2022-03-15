// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SigningJobSignedObjectS3 {
    /**
     * Name of the S3 bucket.
     * 
     */
    private final @Nullable String bucket;
    /**
     * Key name of the bucket object that contains your unsigned code.
     * 
     */
    private final @Nullable String key;

    @CustomType.Constructor
    private SigningJobSignedObjectS3(
        @CustomType.Parameter("bucket") @Nullable String bucket,
        @CustomType.Parameter("key") @Nullable String key) {
        this.bucket = bucket;
        this.key = key;
    }

    /**
     * Name of the S3 bucket.
     * 
    */
    public Optional<String> getBucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * Key name of the bucket object that contains your unsigned code.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSignedObjectS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucket;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSignedObjectS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public SigningJobSignedObjectS3 build() {
            return new SigningJobSignedObjectS3(bucket, key);
        }
    }
}
