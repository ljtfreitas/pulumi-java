// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SapTableLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object clientId;
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object language;
    /**
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object logonGroup;
    /**
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object messageServer;
    /**
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object messageServerService;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Password to access the SAP server where the table is located.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object server;
    /**
     * External security product's library to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sncLibraryPath;
    /**
     * SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sncMode;
    /**
     * Initiator's SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sncMyName;
    /**
     * Communication partner's SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sncPartnerName;
    /**
     * SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sncQop;
    /**
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object systemId;
    /**
     * System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object systemNumber;
    /**
     * Type of linked service.
     * Expected value is 'SapTable'.
     * 
     */
    private final String type;
    /**
     * Username to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userName;

    @OutputCustomType.Constructor({"annotations","clientId","connectVia","description","encryptedCredential","language","logonGroup","messageServer","messageServerService","parameters","password","server","sncLibraryPath","sncMode","sncMyName","sncPartnerName","sncQop","systemId","systemNumber","type","userName"})
    private SapTableLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object clientId,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object language,
        @Nullable Object logonGroup,
        @Nullable Object messageServer,
        @Nullable Object messageServerService,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object server,
        @Nullable Object sncLibraryPath,
        @Nullable Object sncMode,
        @Nullable Object sncMyName,
        @Nullable Object sncPartnerName,
        @Nullable Object sncQop,
        @Nullable Object systemId,
        @Nullable Object systemNumber,
        String type,
        @Nullable Object userName) {
        this.annotations = annotations;
        this.clientId = clientId;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.language = language;
        this.logonGroup = logonGroup;
        this.messageServer = messageServer;
        this.messageServerService = messageServerService;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.sncLibraryPath = sncLibraryPath;
        this.sncMode = sncMode;
        this.sncMyName = sncMyName;
        this.sncPartnerName = sncPartnerName;
        this.sncQop = sncQop;
        this.systemId = systemId;
        this.systemNumber = systemNumber;
        this.type = Objects.requireNonNull(type);
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
     * Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getClientId() {
        return Optional.ofNullable(this.clientId);
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getLanguage() {
        return Optional.ofNullable(this.language);
    }
    /**
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getLogonGroup() {
        return Optional.ofNullable(this.logonGroup);
    }
    /**
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getMessageServer() {
        return Optional.ofNullable(this.messageServer);
    }
    /**
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getMessageServerService() {
        return Optional.ofNullable(this.messageServerService);
    }
    /**
     * Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Password to access the SAP server where the table is located.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getServer() {
        return Optional.ofNullable(this.server);
    }
    /**
     * External security product's library to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSncLibraryPath() {
        return Optional.ofNullable(this.sncLibraryPath);
    }
    /**
     * SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSncMode() {
        return Optional.ofNullable(this.sncMode);
    }
    /**
     * Initiator's SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSncMyName() {
        return Optional.ofNullable(this.sncMyName);
    }
    /**
     * Communication partner's SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSncPartnerName() {
        return Optional.ofNullable(this.sncPartnerName);
    }
    /**
     * SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSncQop() {
        return Optional.ofNullable(this.sncQop);
    }
    /**
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSystemId() {
        return Optional.ofNullable(this.systemId);
    }
    /**
     * System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSystemNumber() {
        return Optional.ofNullable(this.systemNumber);
    }
    /**
     * Type of linked service.
     * Expected value is 'SapTable'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Username to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTableLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object clientId;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object language;
        private @Nullable Object logonGroup;
        private @Nullable Object messageServer;
        private @Nullable Object messageServerService;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object server;
        private @Nullable Object sncLibraryPath;
        private @Nullable Object sncMode;
        private @Nullable Object sncMyName;
        private @Nullable Object sncPartnerName;
        private @Nullable Object sncQop;
        private @Nullable Object systemId;
        private @Nullable Object systemNumber;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTableLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.language = defaults.language;
    	      this.logonGroup = defaults.logonGroup;
    	      this.messageServer = defaults.messageServer;
    	      this.messageServerService = defaults.messageServerService;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.sncLibraryPath = defaults.sncLibraryPath;
    	      this.sncMode = defaults.sncMode;
    	      this.sncMyName = defaults.sncMyName;
    	      this.sncPartnerName = defaults.sncPartnerName;
    	      this.sncQop = defaults.sncQop;
    	      this.systemId = defaults.systemId;
    	      this.systemNumber = defaults.systemNumber;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setClientId(@Nullable Object clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setLanguage(@Nullable Object language) {
            this.language = language;
            return this;
        }

        public Builder setLogonGroup(@Nullable Object logonGroup) {
            this.logonGroup = logonGroup;
            return this;
        }

        public Builder setMessageServer(@Nullable Object messageServer) {
            this.messageServer = messageServer;
            return this;
        }

        public Builder setMessageServerService(@Nullable Object messageServerService) {
            this.messageServerService = messageServerService;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setServer(@Nullable Object server) {
            this.server = server;
            return this;
        }

        public Builder setSncLibraryPath(@Nullable Object sncLibraryPath) {
            this.sncLibraryPath = sncLibraryPath;
            return this;
        }

        public Builder setSncMode(@Nullable Object sncMode) {
            this.sncMode = sncMode;
            return this;
        }

        public Builder setSncMyName(@Nullable Object sncMyName) {
            this.sncMyName = sncMyName;
            return this;
        }

        public Builder setSncPartnerName(@Nullable Object sncPartnerName) {
            this.sncPartnerName = sncPartnerName;
            return this;
        }

        public Builder setSncQop(@Nullable Object sncQop) {
            this.sncQop = sncQop;
            return this;
        }

        public Builder setSystemId(@Nullable Object systemId) {
            this.systemId = systemId;
            return this;
        }

        public Builder setSystemNumber(@Nullable Object systemNumber) {
            this.systemNumber = systemNumber;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }
        public SapTableLinkedServiceResponse build() {
            return new SapTableLinkedServiceResponse(annotations, clientId, connectVia, description, encryptedCredential, language, logonGroup, messageServer, messageServerService, parameters, password, server, sncLibraryPath, sncMode, sncMyName, sncPartnerName, sncQop, systemId, systemNumber, type, userName);
        }
    }
}
