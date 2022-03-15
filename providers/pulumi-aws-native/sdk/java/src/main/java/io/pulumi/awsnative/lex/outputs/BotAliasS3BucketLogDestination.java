// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotAliasS3BucketLogDestination {
    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored in an S3 bucket.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * The Amazon S3 key of the deployment package.
     * 
     */
    private final String logPrefix;
    /**
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * 
     */
    private final String s3BucketArn;

    @CustomType.Constructor
    private BotAliasS3BucketLogDestination(
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @CustomType.Parameter("logPrefix") String logPrefix,
        @CustomType.Parameter("s3BucketArn") String s3BucketArn) {
        this.kmsKeyArn = kmsKeyArn;
        this.logPrefix = logPrefix;
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored in an S3 bucket.
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * The Amazon S3 key of the deployment package.
     * 
    */
    public String getLogPrefix() {
        return this.logPrefix;
    }
    /**
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * 
    */
    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasS3BucketLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyArn;
        private String logPrefix;
        private String s3BucketArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasS3BucketLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.logPrefix = defaults.logPrefix;
    	      this.s3BucketArn = defaults.s3BucketArn;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder logPrefix(String logPrefix) {
            this.logPrefix = Objects.requireNonNull(logPrefix);
            return this;
        }

        public Builder s3BucketArn(String s3BucketArn) {
            this.s3BucketArn = Objects.requireNonNull(s3BucketArn);
            return this;
        }
        public BotAliasS3BucketLogDestination build() {
            return new BotAliasS3BucketLogDestination(kmsKeyArn, logPrefix, s3BucketArn);
        }
    }
}
