// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowEncryptionAlgorithm;
import io.pulumi.awsnative.mediaconnect.enums.FlowEncryptionKeyType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the encryption of the flow.
 * 
 */
public final class FlowEncryption extends io.pulumi.resources.InvokeArgs {

    public static final FlowEncryption Empty = new FlowEncryption();

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    @InputImport(name="algorithm")
        private final @Nullable FlowEncryptionAlgorithm algorithm;

    public Optional<FlowEncryptionAlgorithm> getAlgorithm() {
        return this.algorithm == null ? Optional.empty() : Optional.ofNullable(this.algorithm);
    }

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
     * 
     */
    @InputImport(name="constantInitializationVector")
        private final @Nullable String constantInitializationVector;

    public Optional<String> getConstantInitializationVector() {
        return this.constantInitializationVector == null ? Optional.empty() : Optional.ofNullable(this.constantInitializationVector);
    }

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @InputImport(name="deviceId")
        private final @Nullable String deviceId;

    public Optional<String> getDeviceId() {
        return this.deviceId == null ? Optional.empty() : Optional.ofNullable(this.deviceId);
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    @InputImport(name="keyType")
        private final @Nullable FlowEncryptionKeyType keyType;

    public Optional<FlowEncryptionKeyType> getKeyType() {
        return this.keyType == null ? Optional.empty() : Optional.ofNullable(this.keyType);
    }

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @InputImport(name="region")
        private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @InputImport(name="resourceId")
        private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    @InputImport(name="roleArn", required=true)
        private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     *  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    @InputImport(name="secretArn")
        private final @Nullable String secretArn;

    public Optional<String> getSecretArn() {
        return this.secretArn == null ? Optional.empty() : Optional.ofNullable(this.secretArn);
    }

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @InputImport(name="url")
        private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public FlowEncryption(
        @Nullable FlowEncryptionAlgorithm algorithm,
        @Nullable String constantInitializationVector,
        @Nullable String deviceId,
        @Nullable FlowEncryptionKeyType keyType,
        @Nullable String region,
        @Nullable String resourceId,
        String roleArn,
        @Nullable String secretArn,
        @Nullable String url) {
        this.algorithm = algorithm;
        this.constantInitializationVector = constantInitializationVector;
        this.deviceId = deviceId;
        this.keyType = keyType;
        this.region = region;
        this.resourceId = resourceId;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.secretArn = secretArn;
        this.url = url;
    }

    private FlowEncryption() {
        this.algorithm = null;
        this.constantInitializationVector = null;
        this.deviceId = null;
        this.keyType = null;
        this.region = null;
        this.resourceId = null;
        this.roleArn = null;
        this.secretArn = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowEncryptionAlgorithm algorithm;
        private @Nullable String constantInitializationVector;
        private @Nullable String deviceId;
        private @Nullable FlowEncryptionKeyType keyType;
        private @Nullable String region;
        private @Nullable String resourceId;
        private String roleArn;
        private @Nullable String secretArn;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.deviceId = defaults.deviceId;
    	      this.keyType = defaults.keyType;
    	      this.region = defaults.region;
    	      this.resourceId = defaults.resourceId;
    	      this.roleArn = defaults.roleArn;
    	      this.secretArn = defaults.secretArn;
    	      this.url = defaults.url;
        }

        public Builder setAlgorithm(@Nullable FlowEncryptionAlgorithm algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setConstantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder setDeviceId(@Nullable String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder setKeyType(@Nullable FlowEncryptionKeyType keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setSecretArn(@Nullable String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public FlowEncryption build() {
            return new FlowEncryption(algorithm, constantInitializationVector, deviceId, keyType, region, resourceId, roleArn, secretArn, url);
        }
    }
}
