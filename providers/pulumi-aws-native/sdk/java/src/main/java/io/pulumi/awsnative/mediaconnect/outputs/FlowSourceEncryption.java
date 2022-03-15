// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.outputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowSourceEncryptionAlgorithm;
import io.pulumi.awsnative.mediaconnect.enums.FlowSourceEncryptionKeyType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSourceEncryption {
    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    private final FlowSourceEncryptionAlgorithm algorithm;
    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
     * 
     */
    private final @Nullable String constantInitializationVector;
    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    private final @Nullable String deviceId;
    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    private final @Nullable FlowSourceEncryptionKeyType keyType;
    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    private final @Nullable String region;
    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    private final String roleArn;
    /**
     *  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    private final @Nullable String secretArn;
    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private FlowSourceEncryption(
        @CustomType.Parameter("algorithm") FlowSourceEncryptionAlgorithm algorithm,
        @CustomType.Parameter("constantInitializationVector") @Nullable String constantInitializationVector,
        @CustomType.Parameter("deviceId") @Nullable String deviceId,
        @CustomType.Parameter("keyType") @Nullable FlowSourceEncryptionKeyType keyType,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("secretArn") @Nullable String secretArn,
        @CustomType.Parameter("url") @Nullable String url) {
        this.algorithm = algorithm;
        this.constantInitializationVector = constantInitializationVector;
        this.deviceId = deviceId;
        this.keyType = keyType;
        this.region = region;
        this.resourceId = resourceId;
        this.roleArn = roleArn;
        this.secretArn = secretArn;
        this.url = url;
    }

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
    */
    public FlowSourceEncryptionAlgorithm getAlgorithm() {
        return this.algorithm;
    }
    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
     * 
    */
    public Optional<String> getConstantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }
    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
    */
    public Optional<String> getDeviceId() {
        return Optional.ofNullable(this.deviceId);
    }
    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
    */
    public Optional<FlowSourceEncryptionKeyType> getKeyType() {
        return Optional.ofNullable(this.keyType);
    }
    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
    */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
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
    public Optional<String> getSecretArn() {
        return Optional.ofNullable(this.secretArn);
    }
    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSourceEncryptionAlgorithm algorithm;
        private @Nullable String constantInitializationVector;
        private @Nullable String deviceId;
        private @Nullable FlowSourceEncryptionKeyType keyType;
        private @Nullable String region;
        private @Nullable String resourceId;
        private String roleArn;
        private @Nullable String secretArn;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceEncryption defaults) {
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

        public Builder algorithm(FlowSourceEncryptionAlgorithm algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder constantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder deviceId(@Nullable String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder keyType(@Nullable FlowSourceEncryptionKeyType keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder secretArn(@Nullable String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public FlowSourceEncryption build() {
            return new FlowSourceEncryption(algorithm, constantInitializationVector, deviceId, keyType, region, resourceId, roleArn, secretArn, url);
        }
    }
}
