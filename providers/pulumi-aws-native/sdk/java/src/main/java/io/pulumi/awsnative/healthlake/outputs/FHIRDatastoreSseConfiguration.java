// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.outputs;

import io.pulumi.awsnative.healthlake.outputs.FHIRDatastoreKmsEncryptionConfig;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class FHIRDatastoreSseConfiguration {
    private final FHIRDatastoreKmsEncryptionConfig kmsEncryptionConfig;

    @CustomType.Constructor
    private FHIRDatastoreSseConfiguration(@CustomType.Parameter("kmsEncryptionConfig") FHIRDatastoreKmsEncryptionConfig kmsEncryptionConfig) {
        this.kmsEncryptionConfig = kmsEncryptionConfig;
    }

    public FHIRDatastoreKmsEncryptionConfig getKmsEncryptionConfig() {
        return this.kmsEncryptionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FHIRDatastoreSseConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FHIRDatastoreKmsEncryptionConfig kmsEncryptionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FHIRDatastoreSseConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsEncryptionConfig = defaults.kmsEncryptionConfig;
        }

        public Builder kmsEncryptionConfig(FHIRDatastoreKmsEncryptionConfig kmsEncryptionConfig) {
            this.kmsEncryptionConfig = Objects.requireNonNull(kmsEncryptionConfig);
            return this;
        }
        public FHIRDatastoreSseConfiguration build() {
            return new FHIRDatastoreSseConfiguration(kmsEncryptionConfig);
        }
    }
}
