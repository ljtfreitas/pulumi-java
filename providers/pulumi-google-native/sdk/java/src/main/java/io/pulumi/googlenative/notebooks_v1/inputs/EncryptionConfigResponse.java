// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a custom encryption key configuration that can be applied to a resource. This will encrypt all disks in Virtual Machine.
 * 
 */
public final class EncryptionConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigResponse Empty = new EncryptionConfigResponse();

    /**
     * The Cloud KMS resource identifier of the customer-managed encryption key used to protect a resource, such as a disks. It has the following format: `projects/{PROJECT_ID}/locations/{REGION}/keyRings/{KEY_RING_NAME}/cryptoKeys/{KEY_NAME}`
     * 
     */
    @Import(name="kmsKey", required=true)
      private final String kmsKey;

    public String getKmsKey() {
        return this.kmsKey;
    }

    public EncryptionConfigResponse(String kmsKey) {
        this.kmsKey = Objects.requireNonNull(kmsKey, "expected parameter 'kmsKey' to be non-null");
    }

    private EncryptionConfigResponse() {
        this.kmsKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder kmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }
        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(kmsKey);
        }
    }
}
