// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Linked service for Amazon S3 Compatible.
 * 
 */
public final class AmazonS3CompatibleLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmazonS3CompatibleLinkedServiceArgs Empty = new AmazonS3CompatibleLinkedServiceArgs();

    /**
     * The access key identifier of the Amazon S3 Compatible Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="accessKeyId")
    private final @Nullable Input<Object> accessKeyId;

    public Input<Object> getAccessKeyId() {
        return this.accessKeyId == null ? Input.empty() : this.accessKeyId;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
    private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * If true, use S3 path-style access instead of virtual hosted-style access. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="forcePathStyle")
    private final @Nullable Input<Object> forcePathStyle;

    public Input<Object> getForcePathStyle() {
        return this.forcePathStyle == null ? Input.empty() : this.forcePathStyle;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The secret access key of the Amazon S3 Compatible Identity and Access Management (IAM) user.
     * 
     */
    @InputImport(name="secretAccessKey")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getSecretAccessKey() {
        return this.secretAccessKey == null ? Input.empty() : this.secretAccessKey;
    }

    /**
     * This value specifies the endpoint to access with the Amazon S3 Compatible Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="serviceUrl")
    private final @Nullable Input<Object> serviceUrl;

    public Input<Object> getServiceUrl() {
        return this.serviceUrl == null ? Input.empty() : this.serviceUrl;
    }

    /**
     * Type of linked service.
     * Expected value is 'AmazonS3Compatible'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AmazonS3CompatibleLinkedServiceArgs(
        @Nullable Input<Object> accessKeyId,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> forcePathStyle,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey,
        @Nullable Input<Object> serviceUrl,
        Input<String> type) {
        this.accessKeyId = accessKeyId;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.forcePathStyle = forcePathStyle;
        this.parameters = parameters;
        this.secretAccessKey = secretAccessKey;
        this.serviceUrl = serviceUrl;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AmazonS3CompatibleLinkedServiceArgs() {
        this.accessKeyId = Input.empty();
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.forcePathStyle = Input.empty();
        this.parameters = Input.empty();
        this.secretAccessKey = Input.empty();
        this.serviceUrl = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3CompatibleLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> accessKeyId;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> forcePathStyle;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey;
        private @Nullable Input<Object> serviceUrl;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3CompatibleLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.forcePathStyle = defaults.forcePathStyle;
    	      this.parameters = defaults.parameters;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.type = defaults.type;
        }

        public Builder setAccessKeyId(@Nullable Input<Object> accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        public Builder setAccessKeyId(@Nullable Object accessKeyId) {
            this.accessKeyId = Input.ofNullable(accessKeyId);
            return this;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setConnectVia(@Nullable Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Input<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Input.ofNullable(encryptedCredential);
            return this;
        }

        public Builder setForcePathStyle(@Nullable Input<Object> forcePathStyle) {
            this.forcePathStyle = forcePathStyle;
            return this;
        }

        public Builder setForcePathStyle(@Nullable Object forcePathStyle) {
            this.forcePathStyle = Input.ofNullable(forcePathStyle);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setSecretAccessKey(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }

        public Builder setSecretAccessKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> secretAccessKey) {
            this.secretAccessKey = Input.ofNullable(secretAccessKey);
            return this;
        }

        public Builder setServiceUrl(@Nullable Input<Object> serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public Builder setServiceUrl(@Nullable Object serviceUrl) {
            this.serviceUrl = Input.ofNullable(serviceUrl);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AmazonS3CompatibleLinkedServiceArgs build() {
            return new AmazonS3CompatibleLinkedServiceArgs(accessKeyId, annotations, connectVia, description, encryptedCredential, forcePathStyle, parameters, secretAccessKey, serviceUrl, type);
        }
    }
}
