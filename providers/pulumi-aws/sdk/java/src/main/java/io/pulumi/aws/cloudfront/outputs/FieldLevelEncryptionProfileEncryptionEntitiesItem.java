// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatterns;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FieldLevelEncryptionProfileEncryptionEntitiesItem {
    /**
     * Object that contains an attribute `items` that contains the list of field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted.
     * 
     */
    private final FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatterns fieldPatterns;
    /**
     * The provider associated with the public key being used for encryption.
     * 
     */
    private final String providerId;
    /**
     * The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns.
     * 
     */
    private final String publicKeyId;

    @CustomType.Constructor
    private FieldLevelEncryptionProfileEncryptionEntitiesItem(
        @CustomType.Parameter("fieldPatterns") FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatterns fieldPatterns,
        @CustomType.Parameter("providerId") String providerId,
        @CustomType.Parameter("publicKeyId") String publicKeyId) {
        this.fieldPatterns = fieldPatterns;
        this.providerId = providerId;
        this.publicKeyId = publicKeyId;
    }

    /**
     * Object that contains an attribute `items` that contains the list of field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted.
     * 
    */
    public FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatterns getFieldPatterns() {
        return this.fieldPatterns;
    }
    /**
     * The provider associated with the public key being used for encryption.
     * 
    */
    public String getProviderId() {
        return this.providerId;
    }
    /**
     * The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns.
     * 
    */
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionProfileEncryptionEntitiesItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatterns fieldPatterns;
        private String providerId;
        private String publicKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionProfileEncryptionEntitiesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldPatterns = defaults.fieldPatterns;
    	      this.providerId = defaults.providerId;
    	      this.publicKeyId = defaults.publicKeyId;
        }

        public Builder fieldPatterns(FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatterns fieldPatterns) {
            this.fieldPatterns = Objects.requireNonNull(fieldPatterns);
            return this;
        }

        public Builder providerId(String providerId) {
            this.providerId = Objects.requireNonNull(providerId);
            return this;
        }

        public Builder publicKeyId(String publicKeyId) {
            this.publicKeyId = Objects.requireNonNull(publicKeyId);
            return this;
        }
        public FieldLevelEncryptionProfileEncryptionEntitiesItem build() {
            return new FieldLevelEncryptionProfileEncryptionEntitiesItem(fieldPatterns, providerId, publicKeyId);
        }
    }
}
