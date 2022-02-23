// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a custom encryption key configuration that can be applied to a resource. This will encrypt all disks in Virtual Machine.
 * 
 */
public final class EncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * The Cloud KMS resource identifier of the customer-managed encryption key used to protect a resource, such as a disks. It has the following format: `projects/{PROJECT_ID}/locations/{REGION}/keyRings/{KEY_RING_NAME}/cryptoKeys/{KEY_NAME}`
     * 
     */
    @InputImport(name="kmsKey")
      private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    public EncryptionConfigArgs(@Nullable Input<String> kmsKey) {
        this.kmsKey = kmsKey;
    }

    private EncryptionConfigArgs() {
        this.kmsKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder setKmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder setKmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }
        public EncryptionConfigArgs build() {
            return new EncryptionConfigArgs(kmsKey);
        }
    }
}
