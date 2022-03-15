// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FtpServerLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The authentication type to be used to connect to the FTP server.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * If true, validate the FTP server SSL certificate when connect over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableServerCertificateValidation;
    /**
     * If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableSsl;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Host name of the FTP server. Type: string (or Expression with resultType string).
     * 
     */
    private final Object host;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Password to logon the FTP server.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The TCP port number that the FTP server uses to listen for client connections. Default value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object port;
    /**
     * Type of linked service.
     * Expected value is 'FtpServer'.
     * 
     */
    private final String type;
    /**
     * Username to logon the FTP server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userName;

    @CustomType.Constructor
    private FtpServerLinkedServiceResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enableServerCertificateValidation") @Nullable Object enableServerCertificateValidation,
        @CustomType.Parameter("enableSsl") @Nullable Object enableSsl,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("host") Object host,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("port") @Nullable Object port,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userName") @Nullable Object userName) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.type = type;
        this.userName = userName;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The authentication type to be used to connect to the FTP server.
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * If true, validate the FTP server SSL certificate when connect over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableServerCertificateValidation() {
        return Optional.ofNullable(this.enableServerCertificateValidation);
    }
    /**
     * If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Host name of the FTP server. Type: string (or Expression with resultType string).
     * 
    */
    public Object getHost() {
        return this.host;
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Password to logon the FTP server.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The TCP port number that the FTP server uses to listen for client connections. Default value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Type of linked service.
     * Expected value is 'FtpServer'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Username to logon the FTP server. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FtpServerLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object enableServerCertificateValidation;
        private @Nullable Object enableSsl;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(FtpServerLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.enableServerCertificateValidation = defaults.enableServerCertificateValidation;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder enableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            this.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }

        public Builder enableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder host(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder port(@Nullable Object port) {
            this.port = port;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }
        public FtpServerLinkedServiceResponse build() {
            return new FtpServerLinkedServiceResponse(annotations, authenticationType, connectVia, description, enableServerCertificateValidation, enableSsl, encryptedCredential, host, parameters, password, port, type, userName);
        }
    }
}
