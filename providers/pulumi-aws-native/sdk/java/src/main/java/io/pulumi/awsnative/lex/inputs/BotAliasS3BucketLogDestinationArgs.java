// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies an Amazon S3 bucket for logging audio conversations
 * 
 */
public final class BotAliasS3BucketLogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasS3BucketLogDestinationArgs Empty = new BotAliasS3BucketLogDestinationArgs();

    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored in an S3 bucket.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    /**
     * The Amazon S3 key of the deployment package.
     * 
     */
    @Import(name="logPrefix", required=true)
      private final Output<String> logPrefix;

    public Output<String> getLogPrefix() {
        return this.logPrefix;
    }

    /**
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * 
     */
    @Import(name="s3BucketArn", required=true)
      private final Output<String> s3BucketArn;

    public Output<String> getS3BucketArn() {
        return this.s3BucketArn;
    }

    public BotAliasS3BucketLogDestinationArgs(
        @Nullable Output<String> kmsKeyArn,
        Output<String> logPrefix,
        Output<String> s3BucketArn) {
        this.kmsKeyArn = kmsKeyArn;
        this.logPrefix = Objects.requireNonNull(logPrefix, "expected parameter 'logPrefix' to be non-null");
        this.s3BucketArn = Objects.requireNonNull(s3BucketArn, "expected parameter 's3BucketArn' to be non-null");
    }

    private BotAliasS3BucketLogDestinationArgs() {
        this.kmsKeyArn = Output.empty();
        this.logPrefix = Output.empty();
        this.s3BucketArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasS3BucketLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyArn;
        private Output<String> logPrefix;
        private Output<String> s3BucketArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasS3BucketLogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.logPrefix = defaults.logPrefix;
    	      this.s3BucketArn = defaults.s3BucketArn;
        }

        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder logPrefix(Output<String> logPrefix) {
            this.logPrefix = Objects.requireNonNull(logPrefix);
            return this;
        }

        public Builder logPrefix(String logPrefix) {
            this.logPrefix = Output.of(Objects.requireNonNull(logPrefix));
            return this;
        }

        public Builder s3BucketArn(Output<String> s3BucketArn) {
            this.s3BucketArn = Objects.requireNonNull(s3BucketArn);
            return this;
        }

        public Builder s3BucketArn(String s3BucketArn) {
            this.s3BucketArn = Output.of(Objects.requireNonNull(s3BucketArn));
            return this;
        }
        public BotAliasS3BucketLogDestinationArgs build() {
            return new BotAliasS3BucketLogDestinationArgs(kmsKeyArn, logPrefix, s3BucketArn);
        }
    }
}
