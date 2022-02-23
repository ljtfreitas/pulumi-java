// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceEncryptionConfiguration {
    /**
     * The ARN of the KMS key used for encryption.
     * 
     */
    private final String kmsKey;

    @OutputCustomType.Constructor({"kmsKey"})
    private ServiceEncryptionConfiguration(String kmsKey) {
        this.kmsKey = Objects.requireNonNull(kmsKey);
    }

    /**
     * The ARN of the KMS key used for encryption.
     * 
     */
    public String getKmsKey() {
        return this.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder setKmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }
        public ServiceEncryptionConfiguration build() {
            return new ServiceEncryptionConfiguration(kmsKey);
        }
    }
}
