// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Couchbase server linked service.
 * 
 */
public final class CouchbaseLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CouchbaseLinkedServiceArgs Empty = new CouchbaseLinkedServiceArgs();

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
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="connectionString")
        private final @Nullable Input<Object> connectionString;

    public Input<Object> getConnectionString() {
        return this.connectionString == null ? Input.empty() : this.connectionString;
    }

    /**
     * The Azure key vault secret reference of credString in connection string.
     * 
     */
    @InputImport(name="credString")
        private final @Nullable Input<AzureKeyVaultSecretReferenceArgs> credString;

    public Input<AzureKeyVaultSecretReferenceArgs> getCredString() {
        return this.credString == null ? Input.empty() : this.credString;
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
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Type of linked service.
     * Expected value is 'Couchbase'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public CouchbaseLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<Object> connectionString,
        @Nullable Input<AzureKeyVaultSecretReferenceArgs> credString,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        Input<String> type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.credString = credString;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CouchbaseLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.connectionString = Input.empty();
        this.credString = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CouchbaseLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<Object> connectionString;
        private @Nullable Input<AzureKeyVaultSecretReferenceArgs> credString;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CouchbaseLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.credString = defaults.credString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
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

        public Builder setConnectionString(@Nullable Input<Object> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setConnectionString(@Nullable Object connectionString) {
            this.connectionString = Input.ofNullable(connectionString);
            return this;
        }

        public Builder setCredString(@Nullable Input<AzureKeyVaultSecretReferenceArgs> credString) {
            this.credString = credString;
            return this;
        }

        public Builder setCredString(@Nullable AzureKeyVaultSecretReferenceArgs credString) {
            this.credString = Input.ofNullable(credString);
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

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
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
        public CouchbaseLinkedServiceArgs build() {
            return new CouchbaseLinkedServiceArgs(annotations, connectVia, connectionString, credString, description, encryptedCredential, parameters, type);
        }
    }
}
