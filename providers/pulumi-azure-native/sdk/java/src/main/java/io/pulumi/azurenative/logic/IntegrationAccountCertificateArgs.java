// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.KeyVaultKeyReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationAccountCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountCertificateArgs Empty = new IntegrationAccountCertificateArgs();

    /**
     * The integration account certificate name.
     * 
     */
    @InputImport(name="certificateName")
        private final @Nullable Input<String> certificateName;

    public Input<String> getCertificateName() {
        return this.certificateName == null ? Input.empty() : this.certificateName;
    }

    /**
     * The integration account name.
     * 
     */
    @InputImport(name="integrationAccountName", required=true)
        private final Input<String> integrationAccountName;

    public Input<String> getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The key details in the key vault.
     * 
     */
    @InputImport(name="key")
        private final @Nullable Input<KeyVaultKeyReferenceArgs> key;

    public Input<KeyVaultKeyReferenceArgs> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The metadata.
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Input<Object> metadata;

    public Input<Object> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The public certificate.
     * 
     */
    @InputImport(name="publicCertificate")
        private final @Nullable Input<String> publicCertificate;

    public Input<String> getPublicCertificate() {
        return this.publicCertificate == null ? Input.empty() : this.publicCertificate;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public IntegrationAccountCertificateArgs(
        @Nullable Input<String> certificateName,
        Input<String> integrationAccountName,
        @Nullable Input<KeyVaultKeyReferenceArgs> key,
        @Nullable Input<String> location,
        @Nullable Input<Object> metadata,
        @Nullable Input<String> publicCertificate,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.certificateName = certificateName;
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.key = key;
        this.location = location;
        this.metadata = metadata;
        this.publicCertificate = publicCertificate;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private IntegrationAccountCertificateArgs() {
        this.certificateName = Input.empty();
        this.integrationAccountName = Input.empty();
        this.key = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.publicCertificate = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateName;
        private Input<String> integrationAccountName;
        private @Nullable Input<KeyVaultKeyReferenceArgs> key;
        private @Nullable Input<String> location;
        private @Nullable Input<Object> metadata;
        private @Nullable Input<String> publicCertificate;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.key = defaults.key;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.publicCertificate = defaults.publicCertificate;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setCertificateName(@Nullable Input<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        public Builder setCertificateName(@Nullable String certificateName) {
            this.certificateName = Input.ofNullable(certificateName);
            return this;
        }

        public Builder setIntegrationAccountName(Input<String> integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder setIntegrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Input.of(Objects.requireNonNull(integrationAccountName));
            return this;
        }

        public Builder setKey(@Nullable Input<KeyVaultKeyReferenceArgs> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable KeyVaultKeyReferenceArgs key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setPublicCertificate(@Nullable Input<String> publicCertificate) {
            this.publicCertificate = publicCertificate;
            return this;
        }

        public Builder setPublicCertificate(@Nullable String publicCertificate) {
            this.publicCertificate = Input.ofNullable(publicCertificate);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public IntegrationAccountCertificateArgs build() {
            return new IntegrationAccountCertificateArgs(certificateName, integrationAccountName, key, location, metadata, publicCertificate, resourceGroupName, tags);
        }
    }
}
