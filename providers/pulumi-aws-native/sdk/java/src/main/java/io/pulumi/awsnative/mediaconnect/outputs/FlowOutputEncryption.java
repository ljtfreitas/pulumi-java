// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.outputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowOutputEncryptionAlgorithm;
import io.pulumi.awsnative.mediaconnect.enums.FlowOutputEncryptionKeyType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowOutputEncryption {
    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    private final @Nullable FlowOutputEncryptionAlgorithm algorithm;
    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    private final @Nullable FlowOutputEncryptionKeyType keyType;
    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    private final String roleArn;
    /**
     *  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    private final String secretArn;

    @OutputCustomType.Constructor({"algorithm","keyType","roleArn","secretArn"})
    private FlowOutputEncryption(
        @Nullable FlowOutputEncryptionAlgorithm algorithm,
        @Nullable FlowOutputEncryptionKeyType keyType,
        String roleArn,
        String secretArn) {
        this.algorithm = algorithm;
        this.keyType = keyType;
        this.roleArn = Objects.requireNonNull(roleArn);
        this.secretArn = Objects.requireNonNull(secretArn);
    }

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    public Optional<FlowOutputEncryptionAlgorithm> getAlgorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    public Optional<FlowOutputEncryptionKeyType> getKeyType() {
        return Optional.ofNullable(this.keyType);
    }
    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     *  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    public String getSecretArn() {
        return this.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowOutputEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowOutputEncryptionAlgorithm algorithm;
        private @Nullable FlowOutputEncryptionKeyType keyType;
        private String roleArn;
        private String secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowOutputEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyType = defaults.keyType;
    	      this.roleArn = defaults.roleArn;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder setAlgorithm(@Nullable FlowOutputEncryptionAlgorithm algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setKeyType(@Nullable FlowOutputEncryptionKeyType keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }
        public FlowOutputEncryption build() {
            return new FlowOutputEncryption(algorithm, keyType, roleArn, secretArn);
        }
    }
}
