// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRepositoryEncryptionConfiguration {
    /**
     * The encryption type to use for the repository, either `AES256` or `KMS`.
     * 
     */
    private final String encryptionType;
    /**
     * If `encryption_type` is `KMS`, the ARN of the KMS key used.
     * 
     */
    private final String kmsKey;

    @OutputCustomType.Constructor({"encryptionType","kmsKey"})
    private GetRepositoryEncryptionConfiguration(
        String encryptionType,
        String kmsKey) {
        this.encryptionType = Objects.requireNonNull(encryptionType);
        this.kmsKey = Objects.requireNonNull(kmsKey);
    }

    /**
     * The encryption type to use for the repository, either `AES256` or `KMS`.
     * 
     */
    public String getEncryptionType() {
        return this.encryptionType;
    }
    /**
     * If `encryption_type` is `KMS`, the ARN of the KMS key used.
     * 
     */
    public String getKmsKey() {
        return this.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionType;
        private String kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionType = defaults.encryptionType;
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder setEncryptionType(String encryptionType) {
            this.encryptionType = Objects.requireNonNull(encryptionType);
            return this;
        }

        public Builder setKmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }
        public GetRepositoryEncryptionConfiguration build() {
            return new GetRepositoryEncryptionConfiguration(encryptionType, kmsKey);
        }
    }
}
