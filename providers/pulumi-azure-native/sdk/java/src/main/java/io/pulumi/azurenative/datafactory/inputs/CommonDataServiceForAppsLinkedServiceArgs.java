// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common Data Service for Apps linked service.
 * 
 */
public final class CommonDataServiceForAppsLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommonDataServiceForAppsLinkedServiceArgs Empty = new CommonDataServiceForAppsLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * The authentication type to connect to Common Data Service for Apps server. 'Office365' for online scenario, 'Ifd' for on-premises with Ifd scenario. 'AADServicePrincipal' for Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType", required=true)
      private final Output<Object> authenticationType;

    public Output<Object> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
    }

    /**
     * The deployment type of the Common Data Service for Apps instance. 'Online' for Common Data Service for Apps Online and 'OnPremisesWithIfd' for Common Data Service for Apps on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deploymentType", required=true)
      private final Output<Object> deploymentType;

    public Output<Object> getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Output.empty() : this.encryptedCredential;
    }

    /**
     * The host name of the on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="hostName")
      private final @Nullable Output<Object> hostName;

    public Output<Object> getHostName() {
        return this.hostName == null ? Output.empty() : this.hostName;
    }

    /**
     * The organization name of the Common Data Service for Apps instance. The property is required for on-prem and required for online when there are more than one Common Data Service for Apps instances associated with the user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="organizationName")
      private final @Nullable Output<Object> organizationName;

    public Output<Object> getOrganizationName() {
        return this.organizationName == null ? Output.empty() : this.organizationName;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Password to access the Common Data Service for Apps instance.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * The port of on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Object> port;

    public Output<Object> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="servicePrincipalCredential")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalCredential() {
        return this.servicePrincipalCredential == null ? Output.empty() : this.servicePrincipalCredential;
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalCredentialType")
      private final @Nullable Output<Object> servicePrincipalCredentialType;

    public Output<Object> getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType == null ? Output.empty() : this.servicePrincipalCredentialType;
    }

    /**
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<Object> servicePrincipalId;

    public Output<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Output.empty() : this.servicePrincipalId;
    }

    /**
     * The URL to the Microsoft Common Data Service for Apps server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUri")
      private final @Nullable Output<Object> serviceUri;

    public Output<Object> getServiceUri() {
        return this.serviceUri == null ? Output.empty() : this.serviceUri;
    }

    /**
     * Type of linked service.
     * Expected value is 'CommonDataServiceForApps'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * User name to access the Common Data Service for Apps instance. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
      private final @Nullable Output<Object> username;

    public Output<Object> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public CommonDataServiceForAppsLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        Output<Object> authenticationType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        Output<Object> deploymentType,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Object> hostName,
        @Nullable Output<Object> organizationName,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Output<Object> port,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential,
        @Nullable Output<Object> servicePrincipalCredentialType,
        @Nullable Output<Object> servicePrincipalId,
        @Nullable Output<Object> serviceUri,
        Output<String> type,
        @Nullable Output<Object> username) {
        this.annotations = annotations;
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.connectVia = connectVia;
        this.deploymentType = Objects.requireNonNull(deploymentType, "expected parameter 'deploymentType' to be non-null");
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.hostName = hostName;
        this.organizationName = organizationName;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.servicePrincipalCredential = servicePrincipalCredential;
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        this.servicePrincipalId = servicePrincipalId;
        this.serviceUri = serviceUri;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private CommonDataServiceForAppsLinkedServiceArgs() {
        this.annotations = Output.empty();
        this.authenticationType = Output.empty();
        this.connectVia = Output.empty();
        this.deploymentType = Output.empty();
        this.description = Output.empty();
        this.encryptedCredential = Output.empty();
        this.hostName = Output.empty();
        this.organizationName = Output.empty();
        this.parameters = Output.empty();
        this.password = Output.empty();
        this.port = Output.empty();
        this.servicePrincipalCredential = Output.empty();
        this.servicePrincipalCredentialType = Output.empty();
        this.servicePrincipalId = Output.empty();
        this.serviceUri = Output.empty();
        this.type = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonDataServiceForAppsLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private Output<Object> authenticationType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private Output<Object> deploymentType;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Object> hostName;
        private @Nullable Output<Object> organizationName;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Output<Object> port;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential;
        private @Nullable Output<Object> servicePrincipalCredentialType;
        private @Nullable Output<Object> servicePrincipalId;
        private @Nullable Output<Object> serviceUri;
        private Output<String> type;
        private @Nullable Output<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonDataServiceForAppsLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.hostName = defaults.hostName;
    	      this.organizationName = defaults.organizationName;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.servicePrincipalCredential = defaults.servicePrincipalCredential;
    	      this.servicePrincipalCredentialType = defaults.servicePrincipalCredentialType;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.serviceUri = defaults.serviceUri;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }

        public Builder authenticationType(Output<Object> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder authenticationType(Object authenticationType) {
            this.authenticationType = Output.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Output.ofNullable(connectVia);
            return this;
        }

        public Builder deploymentType(Output<Object> deploymentType) {
            this.deploymentType = Objects.requireNonNull(deploymentType);
            return this;
        }

        public Builder deploymentType(Object deploymentType) {
            this.deploymentType = Output.of(Objects.requireNonNull(deploymentType));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Output.ofNullable(encryptedCredential);
            return this;
        }

        public Builder hostName(@Nullable Output<Object> hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder hostName(@Nullable Object hostName) {
            this.hostName = Output.ofNullable(hostName);
            return this;
        }

        public Builder organizationName(@Nullable Output<Object> organizationName) {
            this.organizationName = organizationName;
            return this;
        }

        public Builder organizationName(@Nullable Object organizationName) {
            this.organizationName = Output.ofNullable(organizationName);
            return this;
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Output.ofNullable(password);
            return this;
        }

        public Builder port(@Nullable Output<Object> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Object port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder servicePrincipalCredential(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential) {
            this.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }

        public Builder servicePrincipalCredential(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalCredential) {
            this.servicePrincipalCredential = Output.ofNullable(servicePrincipalCredential);
            return this;
        }

        public Builder servicePrincipalCredentialType(@Nullable Output<Object> servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }

        public Builder servicePrincipalCredentialType(@Nullable Object servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = Output.ofNullable(servicePrincipalCredentialType);
            return this;
        }

        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Output.ofNullable(servicePrincipalId);
            return this;
        }

        public Builder serviceUri(@Nullable Output<Object> serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }

        public Builder serviceUri(@Nullable Object serviceUri) {
            this.serviceUri = Output.ofNullable(serviceUri);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder username(@Nullable Output<Object> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable Object username) {
            this.username = Output.ofNullable(username);
            return this;
        }
        public CommonDataServiceForAppsLinkedServiceArgs build() {
            return new CommonDataServiceForAppsLinkedServiceArgs(annotations, authenticationType, connectVia, deploymentType, description, encryptedCredential, hostName, organizationName, parameters, password, port, servicePrincipalCredential, servicePrincipalCredentialType, servicePrincipalId, serviceUri, type, username);
        }
    }
}
