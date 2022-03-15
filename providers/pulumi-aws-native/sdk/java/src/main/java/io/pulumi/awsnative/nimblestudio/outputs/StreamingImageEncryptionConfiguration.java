// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.enums.StreamingImageEncryptionConfigurationKeyType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingImageEncryptionConfiguration {
    /**
     * <p>The ARN for a KMS key that is used to encrypt studio data.</p>
     * 
     */
    private final @Nullable String keyArn;
    private final StreamingImageEncryptionConfigurationKeyType keyType;

    @CustomType.Constructor
    private StreamingImageEncryptionConfiguration(
        @CustomType.Parameter("keyArn") @Nullable String keyArn,
        @CustomType.Parameter("keyType") StreamingImageEncryptionConfigurationKeyType keyType) {
        this.keyArn = keyArn;
        this.keyType = keyType;
    }

    /**
     * <p>The ARN for a KMS key that is used to encrypt studio data.</p>
     * 
    */
    public Optional<String> getKeyArn() {
        return Optional.ofNullable(this.keyArn);
    }
    public StreamingImageEncryptionConfigurationKeyType getKeyType() {
        return this.keyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingImageEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyArn;
        private StreamingImageEncryptionConfigurationKeyType keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingImageEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
    	      this.keyType = defaults.keyType;
        }

        public Builder keyArn(@Nullable String keyArn) {
            this.keyArn = keyArn;
            return this;
        }

        public Builder keyType(StreamingImageEncryptionConfigurationKeyType keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public StreamingImageEncryptionConfiguration build() {
            return new StreamingImageEncryptionConfiguration(keyArn, keyType);
        }
    }
}
