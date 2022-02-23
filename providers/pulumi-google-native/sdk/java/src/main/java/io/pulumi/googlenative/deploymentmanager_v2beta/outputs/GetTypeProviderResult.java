// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.CollectionOverrideResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.CredentialResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.OperationResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.OptionsResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.TypeProviderLabelEntryResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTypeProviderResult {
    /**
     * Allows resource handling overrides for specific collections
     * 
     */
    private final List<CollectionOverrideResponse> collectionOverrides;
    /**
     * Credential used when interacting with this type.
     * 
     */
    private final CredentialResponse credential;
    /**
     * List of up to 2 custom certificate authority roots to use for TLS authentication when making calls on behalf of this type provider. If set, TLS authentication will exclusively use these roots instead of relying on publicly trusted certificate authorities when validating TLS certificate authenticity. The certificates must be in base64-encoded PEM format. The maximum size of each certificate must not exceed 10KB.
     * 
     */
    private final List<String> customCertificateAuthorityRoots;
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    private final String description;
    /**
     * Descriptor Url for the this type provider.
     * 
     */
    private final String descriptorUrl;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String insertTime;
    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`
     * 
     */
    private final List<TypeProviderLabelEntryResponse> labels;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The Operation that most recently ran, or is currently running, on this type provider.
     * 
     */
    private final OperationResponse operation;
    /**
     * Options to apply when handling any resources in this service.
     * 
     */
    private final OptionsResponse options;
    /**
     * Self link for the type provider.
     * 
     */
    private final String selfLink;

    @OutputCustomType.Constructor({"collectionOverrides","credential","customCertificateAuthorityRoots","description","descriptorUrl","insertTime","labels","name","operation","options","selfLink"})
    private GetTypeProviderResult(
        List<CollectionOverrideResponse> collectionOverrides,
        CredentialResponse credential,
        List<String> customCertificateAuthorityRoots,
        String description,
        String descriptorUrl,
        String insertTime,
        List<TypeProviderLabelEntryResponse> labels,
        String name,
        OperationResponse operation,
        OptionsResponse options,
        String selfLink) {
        this.collectionOverrides = Objects.requireNonNull(collectionOverrides);
        this.credential = Objects.requireNonNull(credential);
        this.customCertificateAuthorityRoots = Objects.requireNonNull(customCertificateAuthorityRoots);
        this.description = Objects.requireNonNull(description);
        this.descriptorUrl = Objects.requireNonNull(descriptorUrl);
        this.insertTime = Objects.requireNonNull(insertTime);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.operation = Objects.requireNonNull(operation);
        this.options = Objects.requireNonNull(options);
        this.selfLink = Objects.requireNonNull(selfLink);
    }

    /**
     * Allows resource handling overrides for specific collections
     * 
     */
    public List<CollectionOverrideResponse> getCollectionOverrides() {
        return this.collectionOverrides;
    }
    /**
     * Credential used when interacting with this type.
     * 
     */
    public CredentialResponse getCredential() {
        return this.credential;
    }
    /**
     * List of up to 2 custom certificate authority roots to use for TLS authentication when making calls on behalf of this type provider. If set, TLS authentication will exclusively use these roots instead of relying on publicly trusted certificate authorities when validating TLS certificate authenticity. The certificates must be in base64-encoded PEM format. The maximum size of each certificate must not exceed 10KB.
     * 
     */
    public List<String> getCustomCertificateAuthorityRoots() {
        return this.customCertificateAuthorityRoots;
    }
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Descriptor Url for the this type provider.
     * 
     */
    public String getDescriptorUrl() {
        return this.descriptorUrl;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getInsertTime() {
        return this.insertTime;
    }
    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`
     * 
     */
    public List<TypeProviderLabelEntryResponse> getLabels() {
        return this.labels;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The Operation that most recently ran, or is currently running, on this type provider.
     * 
     */
    public OperationResponse getOperation() {
        return this.operation;
    }
    /**
     * Options to apply when handling any resources in this service.
     * 
     */
    public OptionsResponse getOptions() {
        return this.options;
    }
    /**
     * Self link for the type provider.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTypeProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CollectionOverrideResponse> collectionOverrides;
        private CredentialResponse credential;
        private List<String> customCertificateAuthorityRoots;
        private String description;
        private String descriptorUrl;
        private String insertTime;
        private List<TypeProviderLabelEntryResponse> labels;
        private String name;
        private OperationResponse operation;
        private OptionsResponse options;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTypeProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionOverrides = defaults.collectionOverrides;
    	      this.credential = defaults.credential;
    	      this.customCertificateAuthorityRoots = defaults.customCertificateAuthorityRoots;
    	      this.description = defaults.description;
    	      this.descriptorUrl = defaults.descriptorUrl;
    	      this.insertTime = defaults.insertTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.options = defaults.options;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setCollectionOverrides(List<CollectionOverrideResponse> collectionOverrides) {
            this.collectionOverrides = Objects.requireNonNull(collectionOverrides);
            return this;
        }

        public Builder setCredential(CredentialResponse credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setCustomCertificateAuthorityRoots(List<String> customCertificateAuthorityRoots) {
            this.customCertificateAuthorityRoots = Objects.requireNonNull(customCertificateAuthorityRoots);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDescriptorUrl(String descriptorUrl) {
            this.descriptorUrl = Objects.requireNonNull(descriptorUrl);
            return this;
        }

        public Builder setInsertTime(String insertTime) {
            this.insertTime = Objects.requireNonNull(insertTime);
            return this;
        }

        public Builder setLabels(List<TypeProviderLabelEntryResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperation(OperationResponse operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setOptions(OptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public GetTypeProviderResult build() {
            return new GetTypeProviderResult(collectionOverrides, credential, customCertificateAuthorityRoots, description, descriptorUrl, insertTime, labels, name, operation, options, selfLink);
        }
    }
}
