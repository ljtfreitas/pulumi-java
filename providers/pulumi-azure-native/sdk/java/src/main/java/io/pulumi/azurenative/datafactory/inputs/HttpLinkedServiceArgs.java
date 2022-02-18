// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.HttpAuthenticationType;
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
 * Linked service for an HTTP source.
 * 
 */
public final class HttpLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpLinkedServiceArgs Empty = new HttpLinkedServiceArgs();

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
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @InputImport(name="authHeaders")
    private final @Nullable Input<Object> authHeaders;

    public Input<Object> getAuthHeaders() {
        return this.authHeaders == null ? Input.empty() : this.authHeaders;
    }

    /**
     * The authentication type to be used to connect to the HTTP server.
     * 
     */
    @InputImport(name="authenticationType")
    private final @Nullable Input<Either<String,HttpAuthenticationType>> authenticationType;

    public Input<Either<String,HttpAuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * Thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="certThumbprint")
    private final @Nullable Input<Object> certThumbprint;

    public Input<Object> getCertThumbprint() {
        return this.certThumbprint == null ? Input.empty() : this.certThumbprint;
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
     * Base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="embeddedCertData")
    private final @Nullable Input<Object> embeddedCertData;

    public Input<Object> getEmbeddedCertData() {
        return this.embeddedCertData == null ? Input.empty() : this.embeddedCertData;
    }

    /**
     * If true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="enableServerCertificateValidation")
    private final @Nullable Input<Object> enableServerCertificateValidation;

    public Input<Object> getEnableServerCertificateValidation() {
        return this.enableServerCertificateValidation == null ? Input.empty() : this.enableServerCertificateValidation;
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
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'HttpServer'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="url", required=true)
    private final Input<Object> url;

    public Input<Object> getUrl() {
        return this.url;
    }

    /**
     * User name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userName")
    private final @Nullable Input<Object> userName;

    public Input<Object> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public HttpLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> authHeaders,
        @Nullable Input<Either<String,HttpAuthenticationType>> authenticationType,
        @Nullable Input<Object> certThumbprint,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> embeddedCertData,
        @Nullable Input<Object> enableServerCertificateValidation,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Input<String> type,
        Input<Object> url,
        @Nullable Input<Object> userName) {
        this.annotations = annotations;
        this.authHeaders = authHeaders;
        this.authenticationType = authenticationType;
        this.certThumbprint = certThumbprint;
        this.connectVia = connectVia;
        this.description = description;
        this.embeddedCertData = embeddedCertData;
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userName = userName;
    }

    private HttpLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.authHeaders = Input.empty();
        this.authenticationType = Input.empty();
        this.certThumbprint = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.embeddedCertData = Input.empty();
        this.enableServerCertificateValidation = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.type = Input.empty();
        this.url = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> authHeaders;
        private @Nullable Input<Either<String,HttpAuthenticationType>> authenticationType;
        private @Nullable Input<Object> certThumbprint;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> embeddedCertData;
        private @Nullable Input<Object> enableServerCertificateValidation;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Input<String> type;
        private Input<Object> url;
        private @Nullable Input<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authHeaders = defaults.authHeaders;
    	      this.authenticationType = defaults.authenticationType;
    	      this.certThumbprint = defaults.certThumbprint;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.embeddedCertData = defaults.embeddedCertData;
    	      this.enableServerCertificateValidation = defaults.enableServerCertificateValidation;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userName = defaults.userName;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAuthHeaders(@Nullable Input<Object> authHeaders) {
            this.authHeaders = authHeaders;
            return this;
        }

        public Builder setAuthHeaders(@Nullable Object authHeaders) {
            this.authHeaders = Input.ofNullable(authHeaders);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,HttpAuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,HttpAuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setCertThumbprint(@Nullable Input<Object> certThumbprint) {
            this.certThumbprint = certThumbprint;
            return this;
        }

        public Builder setCertThumbprint(@Nullable Object certThumbprint) {
            this.certThumbprint = Input.ofNullable(certThumbprint);
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

        public Builder setEmbeddedCertData(@Nullable Input<Object> embeddedCertData) {
            this.embeddedCertData = embeddedCertData;
            return this;
        }

        public Builder setEmbeddedCertData(@Nullable Object embeddedCertData) {
            this.embeddedCertData = Input.ofNullable(embeddedCertData);
            return this;
        }

        public Builder setEnableServerCertificateValidation(@Nullable Input<Object> enableServerCertificateValidation) {
            this.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }

        public Builder setEnableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            this.enableServerCertificateValidation = Input.ofNullable(enableServerCertificateValidation);
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

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPassword(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Input.ofNullable(password);
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

        public Builder setUrl(Input<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public Builder setUserName(@Nullable Input<Object> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public HttpLinkedServiceArgs build() {
            return new HttpLinkedServiceArgs(annotations, authHeaders, authenticationType, certThumbprint, connectVia, description, embeddedCertData, enableServerCertificateValidation, encryptedCredential, parameters, password, type, url, userName);
        }
    }
}
