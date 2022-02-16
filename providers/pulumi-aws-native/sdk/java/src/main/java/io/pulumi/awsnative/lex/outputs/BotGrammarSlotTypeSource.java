// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotGrammarSlotTypeSource {
    private final @Nullable String kmsKeyArn;
    private final String s3BucketName;
    private final String s3ObjectKey;

    @OutputCustomType.Constructor({"kmsKeyArn","s3BucketName","s3ObjectKey"})
    private BotGrammarSlotTypeSource(
        @Nullable String kmsKeyArn,
        String s3BucketName,
        String s3ObjectKey) {
        this.kmsKeyArn = kmsKeyArn;
        this.s3BucketName = Objects.requireNonNull(s3BucketName);
        this.s3ObjectKey = Objects.requireNonNull(s3ObjectKey);
    }

    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    public String getS3BucketName() {
        return this.s3BucketName;
    }
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