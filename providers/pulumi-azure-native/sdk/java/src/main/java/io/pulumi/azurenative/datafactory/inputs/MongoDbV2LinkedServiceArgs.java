// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Linked service for MongoDB data source.
 * 
 */
public final class MongoDbV2LinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDbV2LinkedServiceArgs Empty = new MongoDbV2LinkedServiceArgs();

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
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
    }

    /**
     * The MongoDB connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString", required=true)
      private final Output<Object> connectionString;

    public Output<Object> getConnectionString() {
        return this.connectionString;
    }

    /**
     * The name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="database", required=true)
      private final Output<Object> database;

    public Output<Object> getDatabase() {
        return this.database;
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
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Type of linked service.
     * Expected value is 'MongoDbV2'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public MongoDbV2LinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        Output<Object> connectionString,
        Output<Object> database,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<String> type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.description = description;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MongoDbV2LinkedServiceArgs() {
        this.annotations = Output.empty();
        this.connectVia = Output.empty();
        this.connectionString = Output.empty();
        this.database = Output.empty();
        this.description = Output.empty();
        this.parameters = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbV2LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private Output<Object> connectionString;
        private Output<Object> database;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbV2LinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
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

        public Builder connectionString(Output<Object> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder connectionString(Object connectionString) {
            this.connectionString = Output.of(Objects.requireNonNull(connectionString));
            return this;
        }

        public Builder database(Output<Object> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder database(Object database) {
            this.database = Output.of(Objects.requireNonNull(database));
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

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
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
        public MongoDbV2LinkedServiceArgs build() {
            return new MongoDbV2LinkedServiceArgs(annotations, connectVia, connectionString, database, description, parameters, type);
        }
    }
}
