// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EncryptionConfigResponse {
    /**
     * Optional. Customer-managed Encryption Key available through Google's Key Management Service. Cannot be updated. If not specified, Google-managed key will be used.
     * 
     */
    private final String kmsKeyName;

    @OutputCustomType.Constructor({"kmsKeyName"})
    private EncryptionConfigResponse(String kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
    }

    /**
     * Optional. Customer-managed Encryption Key available through Google's Key Management Service. Cannot be updated. If not specified, Google-managed key will be used.
     * 
     */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(kmsKeyName);
        }
    }
}
