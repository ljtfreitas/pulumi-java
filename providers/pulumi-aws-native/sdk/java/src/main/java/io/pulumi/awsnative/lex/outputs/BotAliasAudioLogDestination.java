// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotAliasS3BucketLogDestination;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotAliasAudioLogDestination {
    private final @Nullable BotAliasS3BucketLogDestination s3Bucket;

    @OutputCustomType.Constructor
    private BotAliasAudioLogDestination(@OutputCustomType.Parameter("s3Bucket") @Nullable BotAliasS3BucketLogDestination s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public Optional<BotAliasS3BucketLogDestination> getS3Bucket() {
        return Optional.ofNullable(this.s3Bucket);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasAudioLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotAliasS3BucketLogDestination s3Bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasAudioLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
        }

        public Builder setS3Bucket(@Nullable BotAliasS3BucketLogDestination s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }
        public BotAliasAudioLogDestination build() {
            return new BotAliasAudioLogDestination(s3Bucket);
        }
    }
}
