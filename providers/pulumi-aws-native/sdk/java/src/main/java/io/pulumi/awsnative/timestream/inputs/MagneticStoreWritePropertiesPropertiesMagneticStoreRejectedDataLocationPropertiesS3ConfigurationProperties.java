// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * S3 configuration for location to store rejections from magnetic store writes
 * 
 */
public final class MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties extends io.pulumi.resources.InvokeArgs {

    public static final MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties Empty = new MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties();

    /**
     * The bucket name used to store the data.
     * 
     */
    @InputImport(name="bucketName", required=true)
        private final String bucketName;

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * Either SSE_KMS or SSE_S3.
     * 
     */
    @InputImport(name="encryptionOption", required=true)
        private final String encryptionOption;

    public String getEncryptionOption() {
        return this.encryptionOption;
    }

    /**
     * Must be provided if SSE_KMS is specified as the encryption option
     * 
     */
    @InputImport(name="kmsKeyId")
        private final @Nullable String kmsKeyId;

    public Optional<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Optional.empty() : Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * String used to prefix all data in the bucket.
     * 
     */
    @InputImport(name="objectKeyPrefix")
        private final @Nullable String objectKeyPrefix;

    public Optional<String> getObjectKeyPrefix() {
        return this.objectKeyPrefix == null ? Optional.empty() : Optional.ofNullable(this.objectKeyPrefix);
    }

    public MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties(
        String bucketName,
        String encryptionOption,
        @Nullable String kmsKeyId,
        @Nullable String objectKeyPrefix) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.encryptionOption = Objects.requireNonNull(encryptionOption, "expected parameter 'encryptionOption' to be non-null");
        this.kmsKeyId = kmsKeyId;
        this.objectKeyPrefix = objectKeyPrefix;
    }

    private MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties() {
        this.bucketName = null;
        this.encryptionOption = null;
        this.kmsKeyId = null;
        this.objectKeyPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String encryptionOption;
        private @Nullable String kmsKeyId;
        private @Nullable String objectKeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.objectKeyPrefix = defaults.objectKeyPrefix;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setEncryptionOption(String encryptionOption) {
            this.encryptionOption = Objects.requireNonNull(encryptionOption);
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setObjectKeyPrefix(@Nullable String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }
        public MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties build() {
            return new MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties(bucketName, encryptionOption, kmsKeyId, objectKeyPrefix);
        }
    }
}
