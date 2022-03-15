// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationInputKeyType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamEncryptionConfigurationInput extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamEncryptionConfigurationInput Empty = new DeliveryStreamEncryptionConfigurationInput();

    @Import(name="keyARN")
      private final @Nullable String keyARN;

    public Optional<String> getKeyARN() {
        return this.keyARN == null ? Optional.empty() : Optional.ofNullable(this.keyARN);
    }

    @Import(name="keyType", required=true)
      private final DeliveryStreamEncryptionConfigurationInputKeyType keyType;

    public DeliveryStreamEncryptionConfigurationInputKeyType getKeyType() {
        return this.keyType;
    }

    public DeliveryStreamEncryptionConfigurationInput(
        @Nullable String keyARN,
        DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
        this.keyARN = keyARN;
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
    }

    private DeliveryStreamEncryptionConfigurationInput() {
        this.keyARN = null;
        this.keyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamEncryptionConfigurationInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyARN;
        private DeliveryStreamEncryptionConfigurationInputKeyType keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamEncryptionConfigurationInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyARN = defaults.keyARN;
    	      this.keyType = defaults.keyType;
        }

        public Builder keyARN(@Nullable String keyARN) {
            this.keyARN = keyARN;
            return this;
        }

        public Builder keyType(DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public DeliveryStreamEncryptionConfigurationInput build() {
            return new DeliveryStreamEncryptionConfigurationInput(keyARN, keyType);
        }
    }
}
