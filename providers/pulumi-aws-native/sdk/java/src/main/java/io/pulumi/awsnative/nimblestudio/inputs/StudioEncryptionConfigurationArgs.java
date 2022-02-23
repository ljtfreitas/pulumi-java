// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.StudioEncryptionConfigurationKeyType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Configuration of the encryption method that is used for the studio.</p>
 * 
 */
public final class StudioEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioEncryptionConfigurationArgs Empty = new StudioEncryptionConfigurationArgs();

    /**
     * <p>The ARN for a KMS key that is used to encrypt studio data.</p>
     * 
     */
    @InputImport(name="keyArn")
        private final @Nullable Input<String> keyArn;

    public Input<String> getKeyArn() {
        return this.keyArn == null ? Input.empty() : this.keyArn;
    }

    @InputImport(name="keyType", required=true)
        private final Input<StudioEncryptionConfigurationKeyType> keyType;

    public Input<StudioEncryptionConfigurationKeyType> getKeyType() {
        return this.keyType;
    }

    public StudioEncryptionConfigurationArgs(
        @Nullable Input<String> keyArn,
        Input<StudioEncryptionConfigurationKeyType> keyType) {
        this.keyArn = keyArn;
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
    }

    private StudioEncryptionConfigurationArgs() {
        this.keyArn = Input.empty();
        this.keyType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyArn;
        private Input<StudioEncryptionConfigurationKeyType> keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
    	      this.keyType = defaults.keyType;
        }

        public Builder setKeyArn(@Nullable Input<String> keyArn) {
            this.keyArn = keyArn;
            return this;
        }

        public Builder setKeyArn(@Nullable String keyArn) {
            this.keyArn = Input.ofNullable(keyArn);
            return this;
        }

        public Builder setKeyType(Input<StudioEncryptionConfigurationKeyType> keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }

        public Builder setKeyType(StudioEncryptionConfigurationKeyType keyType) {
            this.keyType = Input.of(Objects.requireNonNull(keyType));
            return this;
        }
        public StudioEncryptionConfigurationArgs build() {
            return new StudioEncryptionConfigurationArgs(keyArn, keyType);
        }
    }
}
