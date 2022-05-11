// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.inputs;

import com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServiceState extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceState Empty = new LinkedServiceState();

    /**
     * A map of additional properties to associate with the Synapse Linked Service.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Synapse Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Synapse Linked Service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Synapse Linked Service.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The description for the Synapse Linked Service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Synapse Linked Service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A `integration_runtime` block as defined below.
     * 
     */
    @Import(name="integrationRuntime")
    private @Nullable Output<LinkedServiceIntegrationRuntimeArgs> integrationRuntime;

    /**
     * @return A `integration_runtime` block as defined below.
     * 
     */
    public Optional<Output<LinkedServiceIntegrationRuntimeArgs>> integrationRuntime() {
        return Optional.ofNullable(this.integrationRuntime);
    }

    /**
     * The name which should be used for this Synapse Linked Service. Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Synapse Linked Service. Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Synapse Linked Service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Synapse Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The Synapse Workspace ID in which to associate the Linked Service with. Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    @Import(name="synapseWorkspaceId")
    private @Nullable Output<String> synapseWorkspaceId;

    /**
     * @return The Synapse Workspace ID in which to associate the Linked Service with. Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    public Optional<Output<String>> synapseWorkspaceId() {
        return Optional.ofNullable(this.synapseWorkspaceId);
    }

    /**
     * The type of data stores that will be connected to Synapse. For full list of supported data stores, please refer to [Azure Synapse connector](https://docs.microsoft.com/en-us/azure/data-factory/connector-overview). Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of data stores that will be connected to Synapse. For full list of supported data stores, please refer to [Azure Synapse connector](https://docs.microsoft.com/en-us/azure/data-factory/connector-overview). Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * A JSON object that contains the properties of the Synapse Linked Service.
     * 
     */
    @Import(name="typePropertiesJson")
    private @Nullable Output<String> typePropertiesJson;

    /**
     * @return A JSON object that contains the properties of the Synapse Linked Service.
     * 
     */
    public Optional<Output<String>> typePropertiesJson() {
        return Optional.ofNullable(this.typePropertiesJson);
    }

    private LinkedServiceState() {}

    private LinkedServiceState(LinkedServiceState $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.description = $.description;
        this.integrationRuntime = $.integrationRuntime;
        this.name = $.name;
        this.parameters = $.parameters;
        this.synapseWorkspaceId = $.synapseWorkspaceId;
        this.type = $.type;
        this.typePropertiesJson = $.typePropertiesJson;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceState $;

        public Builder() {
            $ = new LinkedServiceState();
        }

        public Builder(LinkedServiceState defaults) {
            $ = new LinkedServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param description The description for the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param integrationRuntime A `integration_runtime` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntime(@Nullable Output<LinkedServiceIntegrationRuntimeArgs> integrationRuntime) {
            $.integrationRuntime = integrationRuntime;
            return this;
        }

        /**
         * @param integrationRuntime A `integration_runtime` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntime(LinkedServiceIntegrationRuntimeArgs integrationRuntime) {
            return integrationRuntime(Output.of(integrationRuntime));
        }

        /**
         * @param name The name which should be used for this Synapse Linked Service. Changing this forces a new Synapse Linked Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Synapse Linked Service. Changing this forces a new Synapse Linked Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param synapseWorkspaceId The Synapse Workspace ID in which to associate the Linked Service with. Changing this forces a new Synapse Linked Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(@Nullable Output<String> synapseWorkspaceId) {
            $.synapseWorkspaceId = synapseWorkspaceId;
            return this;
        }

        /**
         * @param synapseWorkspaceId The Synapse Workspace ID in which to associate the Linked Service with. Changing this forces a new Synapse Linked Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(String synapseWorkspaceId) {
            return synapseWorkspaceId(Output.of(synapseWorkspaceId));
        }

        /**
         * @param type The type of data stores that will be connected to Synapse. For full list of supported data stores, please refer to [Azure Synapse connector](https://docs.microsoft.com/en-us/azure/data-factory/connector-overview). Changing this forces a new Synapse Linked Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of data stores that will be connected to Synapse. For full list of supported data stores, please refer to [Azure Synapse connector](https://docs.microsoft.com/en-us/azure/data-factory/connector-overview). Changing this forces a new Synapse Linked Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typePropertiesJson A JSON object that contains the properties of the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder typePropertiesJson(@Nullable Output<String> typePropertiesJson) {
            $.typePropertiesJson = typePropertiesJson;
            return this;
        }

        /**
         * @param typePropertiesJson A JSON object that contains the properties of the Synapse Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder typePropertiesJson(String typePropertiesJson) {
            return typePropertiesJson(Output.of(typePropertiesJson));
        }

        public LinkedServiceState build() {
            return $;
        }
    }

}
