// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
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
 * HDInsight linked service.
 * 
 */
public final class HDInsightLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HDInsightLinkedServiceArgs Empty = new HDInsightLinkedServiceArgs();

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
     * HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="clusterUri", required=true)
    private final Input<Object> clusterUri;

    public Input<Object> getClusterUri() {
        return this.clusterUri;
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
     * Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileSystem")
    private final @Nullable Input<Object> fileSystem;

    public Input<Object> getFileSystem() {
        return this.fileSystem == null ? Input.empty() : this.fileSystem;
    }

    /**
     * A reference to the Azure SQL linked service that points to the HCatalog database.
     * 
     */
    @InputImport(name="hcatalogLinkedServiceName")
    private final @Nullable Input<LinkedServiceReferenceArgs> hcatalogLinkedServiceName;

    public Input<LinkedServiceReferenceArgs> getHcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName == null ? Input.empty() : this.hcatalogLinkedServiceName;
    }

    /**
     * Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     * 
     */
    @InputImport(name="isEspEnabled")
    private final @Nullable Input<Object> isEspEnabled;

    public Input<Object> getIsEspEnabled() {
        return this.isEspEnabled == null ? Input.empty() : this.isEspEnabled;
    }

    /**
     * The Azure Storage linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
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
     * HDInsight cluster password.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'HDInsight'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userName")
    private final @Nullable Input<Object> userName;

    public Input<Object> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public HDInsightLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        Input<Object> clusterUri,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> fileSystem,
        @Nullable Input<LinkedServiceReferenceArgs> hcatalogLinkedServiceName,
        @Nullable Input<Object> isEspEnabled,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Input<String> type,
        @Nullable Input<Object> userName) {
        this.annotations = annotations;
        this.clusterUri = Objects.requireNonNull(clusterUri, "expected parameter 'clusterUri' to be non-null");
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.fileSystem = fileSystem;
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        this.isEspEnabled = isEspEnabled;
        this.linkedServiceName = linkedServiceName;
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private HDInsightLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.clusterUri = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.fileSystem = Input.empty();
        this.hcatalogLinkedServiceName = Input.empty();
        this.isEspEnabled = Input.empty();
        this.linkedServiceName = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.type = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private Input<Object> clusterUri;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> fileSystem;
        private @Nullable Input<LinkedServiceReferenceArgs> hcatalogLinkedServiceName;
        private @Nullable Input<Object> isEspEnabled;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Input<String> type;
        private @Nullable Input<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterUri = defaults.clusterUri;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.fileSystem = defaults.fileSystem;
    	      this.hcatalogLinkedServiceName = defaults.hcatalogLinkedServiceName;
    	      this.isEspEnabled = defaults.isEspEnabled;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
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

        public Builder setClusterUri(Input<Object> clusterUri) {
            this.clusterUri = Objects.requireNonNull(clusterUri);
            return this;
        }

        public Builder setClusterUri(Object clusterUri) {
            this.clusterUri = Input.of(Objects.requireNonNull(clusterUri));
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

        public Builder setFileSystem(@Nullable Input<Object> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder setFileSystem(@Nullable Object fileSystem) {
            this.fileSystem = Input.ofNullable(fileSystem);
            return this;
        }

        public Builder setHcatalogLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> hcatalogLinkedServiceName) {
            this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
            return this;
        }

        public Builder setHcatalogLinkedServiceName(@Nullable LinkedServiceReferenceArgs hcatalogLinkedServiceName) {
            this.hcatalogLinkedServiceName = Input.ofNullable(hcatalogLinkedServiceName);
            return this;
        }

        public Builder setIsEspEnabled(@Nullable Input<Object> isEspEnabled) {
            this.isEspEnabled = isEspEnabled;
            return this;
        }

        public Builder setIsEspEnabled(@Nullable Object isEspEnabled) {
            this.isEspEnabled = Input.ofNullable(isEspEnabled);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
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

        public Builder setUserName(@Nullable Input<Object> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public HDInsightLinkedServiceArgs build() {
            return new HDInsightLinkedServiceArgs(annotations, clusterUri, connectVia, description, encryptedCredential, fileSystem, hcatalogLinkedServiceName, isEspEnabled, linkedServiceName, parameters, password, type, userName);
        }
    }
}
