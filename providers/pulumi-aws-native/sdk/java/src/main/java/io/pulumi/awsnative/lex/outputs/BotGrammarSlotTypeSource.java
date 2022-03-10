// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotGrammarSlotTypeSource {
    /**
     * The Amazon KMS key required to decrypt the contents of the grammar, if any.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * The name of the S3 bucket that contains the grammar source.
     * 
     */
    private final String s3BucketName;
    /**
     * The path to the grammar in the S3 bucket.
     * 
     */
    private final String s3ObjectKey;

    @OutputCustomType.Constructor
    private BotGrammarSlotTypeSource(
        @OutputCustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @OutputCustomType.Parameter("s3BucketName") String s3BucketName,
        @OutputCustomType.Parameter("s3ObjectKey") String s3ObjectKey) {
        this.kmsKeyArn = kmsKeyArn;
        this.s3BucketName = s3BucketName;
        this.s3ObjectKey = s3ObjectKey;
    }

    /**
     * The Amazon KMS key required to decrypt the contents of the grammar, if any.
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * The name of the S3 bucket that contains the grammar source.
     * 
    */
    public String getS3BucketName() {
        return this.s3BucketName;
    }
    /**
     * The path to the grammar in the S3 bucket.
     * 
    */
    public String getS3ObjectKey() {
        return this.s3ObjectKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotGrammarSlotTypeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyArn;
        private String s3BucketName;
        private String s3ObjectKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BotGrammarSlotTypeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3ObjectKey = defaults.s3ObjectKey;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setS3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder setS3ObjectKey(String s3ObjectKey) {
            this.s3ObjectKey = Objects.requireNonNull(s3ObjectKey);
            return this;
        }
        public BotGrammarSlotTypeSource build() {
            return new BotGrammarSlotTypeSource(kmsKeyArn, s3BucketName, s3ObjectKey);
        }
    }
}
