// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServiceOdbcState extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceOdbcState Empty = new LinkedServiceOdbcState();

    /**
     * A map of additional properties to associate with the Data Factory Linked Service ODBC.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service ODBC.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Linked Service ODBC.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service ODBC.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * A `basic_authentication` block as defined below.
     * 
     */
    @Import(name="basicAuthentication")
    private @Nullable Output<LinkedServiceOdbcBasicAuthenticationArgs> basicAuthentication;

    /**
     * @return A `basic_authentication` block as defined below.
     * 
     */
    public Optional<Output<LinkedServiceOdbcBasicAuthenticationArgs>> basicAuthentication() {
        return Optional.ofNullable(this.basicAuthentication);
    }

    /**
     * The connection string in which to authenticate with ODBC.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The connection string in which to authenticate with ODBC.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
    }

    /**
     * The description for the Data Factory Linked Service ODBC.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Linked Service ODBC.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The integration runtime reference to associate with the Data Factory Linked Service ODBC.
     * 
     */
    @Import(name="integrationRuntimeName")
    private @Nullable Output<String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service ODBC.
     * 
     */
    public Optional<Output<String>> integrationRuntimeName() {
        return Optional.ofNullable(this.integrationRuntimeName);
    }

    /**
     * Specifies the name of the Data Factory Linked Service ODBC. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service ODBC. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Linked Service ODBC.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service ODBC.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private LinkedServiceOdbcState() {}

    private LinkedServiceOdbcState(LinkedServiceOdbcState $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.basicAuthentication = $.basicAuthentication;
        this.connectionString = $.connectionString;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceOdbcState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceOdbcState $;

        public Builder() {
            $ = new LinkedServiceOdbcState();
        }

        public Builder(LinkedServiceOdbcState defaults) {
            $ = new LinkedServiceOdbcState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param basicAuthentication A `basic_authentication` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthentication(@Nullable Output<LinkedServiceOdbcBasicAuthenticationArgs> basicAuthentication) {
            $.basicAuthentication = basicAuthentication;
            return this;
        }

        /**
         * @param basicAuthentication A `basic_authentication` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthentication(LinkedServiceOdbcBasicAuthenticationArgs basicAuthentication) {
            return basicAuthentication(Output.of(basicAuthentication));
        }

        /**
         * @param connectionString The connection string in which to authenticate with ODBC.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string in which to authenticate with ODBC.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(@Nullable Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            return integrationRuntimeName(Output.of(integrationRuntimeName));
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service ODBC. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service ODBC. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service ODBC.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public LinkedServiceOdbcState build() {
            return $;
        }
    }

}
