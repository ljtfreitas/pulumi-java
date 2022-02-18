// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies that the content key ID is specified in the PlayReady configuration.
 * 
 */
public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs Empty = new ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs();

    /**
     * The content key ID.
     * 
     */
    @InputImport(name="keyId", required=true)
    private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs(
        Input<String> keyId,
        Input<String> odataType) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs() {
        this.keyId = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyId;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.odataType = defaults.odataType;
        }

        public Builder setKeyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs build() {
            return new ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs(keyId, odataType);
        }
    }
}
