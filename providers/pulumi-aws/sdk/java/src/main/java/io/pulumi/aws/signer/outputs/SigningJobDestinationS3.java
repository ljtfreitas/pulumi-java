// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SigningJobDestinationS3 {
    /**
     * Name of the S3 bucket.
     * 
     */
    private final String bucket;
    /**
     * An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
     * 
     */
    private final @Nullable String prefix;

    @OutputCustomType.Constructor({"bucket","prefix"})
    private SigningJobDestinationS3(
        String bucket,
        @Nullable String prefix) {
        this.bucket = Objects.requireNonNull(bucket);
        this.prefix = prefix;
    }

    /**
     * Name of the S3 bucket.
     * 
     */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
     * 
     */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobDestinationS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobDestinationS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.prefix = defaults.prefix;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public SigningJobDestinationS3 build() {
            return new SigningJobDestinationS3(bucket, prefix);
        }
    }
}
