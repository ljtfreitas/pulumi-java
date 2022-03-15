// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a custom encryption key configuration that can be applied to a resource.
 * 
 */
public final class GoogleCloudMlV1__EncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__EncryptionConfigArgs Empty = new GoogleCloudMlV1__EncryptionConfigArgs();

    /**
     * The Cloud KMS resource identifier of the customer-managed encryption key used to protect a resource, such as a training job. It has the following format: `projects/{PROJECT_ID}/locations/{REGION}/keyRings/{KEY_RING_NAME}/cryptoKeys/{KEY_NAME}`
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Output.empty() : this.kmsKeyName;
    }

    public GoogleCloudMlV1__EncryptionConfigArgs(@Nullable Output<String> kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    private GoogleCloudMlV1__EncryptionConfigArgs() {
        this.kmsKeyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__EncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Output.ofNullable(kmsKeyName);
            return this;
        }
        public GoogleCloudMlV1__EncryptionConfigArgs build() {
            return new GoogleCloudMlV1__EncryptionConfigArgs(kmsKeyName);
        }
    }
}
