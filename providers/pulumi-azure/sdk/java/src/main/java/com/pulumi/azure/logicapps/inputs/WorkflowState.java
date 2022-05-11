// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs;
import com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowState extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowState Empty = new WorkflowState();

    /**
     * A `access_control` block as defined below.
     * 
     */
    @Import(name="accessControl")
    private @Nullable Output<WorkflowAccessControlArgs> accessControl;

    /**
     * @return A `access_control` block as defined below.
     * 
     */
    public Optional<Output<WorkflowAccessControlArgs>> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }

    /**
     * The Access Endpoint for the Logic App Workflow.
     * 
     */
    @Import(name="accessEndpoint")
    private @Nullable Output<String> accessEndpoint;

    /**
     * @return The Access Endpoint for the Logic App Workflow.
     * 
     */
    public Optional<Output<String>> accessEndpoint() {
        return Optional.ofNullable(this.accessEndpoint);
    }

    /**
     * The list of access endpoint IP addresses of connector.
     * 
     */
    @Import(name="connectorEndpointIpAddresses")
    private @Nullable Output<List<String>> connectorEndpointIpAddresses;

    /**
     * @return The list of access endpoint IP addresses of connector.
     * 
     */
    public Optional<Output<List<String>>> connectorEndpointIpAddresses() {
        return Optional.ofNullable(this.connectorEndpointIpAddresses);
    }

    /**
     * The list of outgoing IP addresses of connector.
     * 
     */
    @Import(name="connectorOutboundIpAddresses")
    private @Nullable Output<List<String>> connectorOutboundIpAddresses;

    /**
     * @return The list of outgoing IP addresses of connector.
     * 
     */
    public Optional<Output<List<String>>> connectorOutboundIpAddresses() {
        return Optional.ofNullable(this.connectorOutboundIpAddresses);
    }

    /**
     * Is the Logic App Workflow enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the Logic App Workflow enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<WorkflowIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<WorkflowIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The ID of the Integration Service Environment to which this Logic App Workflow belongs.  Changing this forces a new Logic App Workflow to be created.
     * 
     */
    @Import(name="integrationServiceEnvironmentId")
    private @Nullable Output<String> integrationServiceEnvironmentId;

    /**
     * @return The ID of the Integration Service Environment to which this Logic App Workflow belongs.  Changing this forces a new Logic App Workflow to be created.
     * 
     */
    public Optional<Output<String>> integrationServiceEnvironmentId() {
        return Optional.ofNullable(this.integrationServiceEnvironmentId);
    }

    /**
     * Specifies the supported Azure location where the Logic App Workflow exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the Logic App Workflow exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the integration account linked by this Logic App Workflow.
     * 
     */
    @Import(name="logicAppIntegrationAccountId")
    private @Nullable Output<String> logicAppIntegrationAccountId;

    /**
     * @return The ID of the integration account linked by this Logic App Workflow.
     * 
     */
    public Optional<Output<String>> logicAppIntegrationAccountId() {
        return Optional.ofNullable(this.logicAppIntegrationAccountId);
    }

    /**
     * Specifies the name of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of Key-Value pairs.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of Key-Value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The name of the Resource Group in which the Logic App Workflow should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Logic App Workflow should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The list of access endpoint IP addresses of workflow.
     * 
     */
    @Import(name="workflowEndpointIpAddresses")
    private @Nullable Output<List<String>> workflowEndpointIpAddresses;

    /**
     * @return The list of access endpoint IP addresses of workflow.
     * 
     */
    public Optional<Output<List<String>>> workflowEndpointIpAddresses() {
        return Optional.ofNullable(this.workflowEndpointIpAddresses);
    }

    /**
     * The list of outgoing IP addresses of workflow.
     * 
     */
    @Import(name="workflowOutboundIpAddresses")
    private @Nullable Output<List<String>> workflowOutboundIpAddresses;

    /**
     * @return The list of outgoing IP addresses of workflow.
     * 
     */
    public Optional<Output<List<String>>> workflowOutboundIpAddresses() {
        return Optional.ofNullable(this.workflowOutboundIpAddresses);
    }

    /**
     * Specifies a map of Key-Value pairs of the Parameter Definitions to use for this Logic App Workflow. The key is the parameter name, and the value is a JSON encoded string of the parameter definition (see: https://docs.microsoft.com/en-us/azure/logic-apps/logic-apps-workflow-definition-language#parameters).
     * 
     */
    @Import(name="workflowParameters")
    private @Nullable Output<Map<String,String>> workflowParameters;

    /**
     * @return Specifies a map of Key-Value pairs of the Parameter Definitions to use for this Logic App Workflow. The key is the parameter name, and the value is a JSON encoded string of the parameter definition (see: https://docs.microsoft.com/en-us/azure/logic-apps/logic-apps-workflow-definition-language#parameters).
     * 
     */
    public Optional<Output<Map<String,String>>> workflowParameters() {
        return Optional.ofNullable(this.workflowParameters);
    }

    /**
     * Specifies the Schema to use for this Logic App Workflow. Defaults to `https://schema.management.azure.com/providers/Microsoft.Logic/schemas/2016-06-01/workflowdefinition.json#`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="workflowSchema")
    private @Nullable Output<String> workflowSchema;

    /**
     * @return Specifies the Schema to use for this Logic App Workflow. Defaults to `https://schema.management.azure.com/providers/Microsoft.Logic/schemas/2016-06-01/workflowdefinition.json#`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> workflowSchema() {
        return Optional.ofNullable(this.workflowSchema);
    }

    /**
     * Specifies the version of the Schema used for this Logic App Workflow. Defaults to `1.0.0.0`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="workflowVersion")
    private @Nullable Output<String> workflowVersion;

    /**
     * @return Specifies the version of the Schema used for this Logic App Workflow. Defaults to `1.0.0.0`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> workflowVersion() {
        return Optional.ofNullable(this.workflowVersion);
    }

    private WorkflowState() {}

    private WorkflowState(WorkflowState $) {
        this.accessControl = $.accessControl;
        this.accessEndpoint = $.accessEndpoint;
        this.connectorEndpointIpAddresses = $.connectorEndpointIpAddresses;
        this.connectorOutboundIpAddresses = $.connectorOutboundIpAddresses;
        this.enabled = $.enabled;
        this.identity = $.identity;
        this.integrationServiceEnvironmentId = $.integrationServiceEnvironmentId;
        this.location = $.location;
        this.logicAppIntegrationAccountId = $.logicAppIntegrationAccountId;
        this.name = $.name;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.workflowEndpointIpAddresses = $.workflowEndpointIpAddresses;
        this.workflowOutboundIpAddresses = $.workflowOutboundIpAddresses;
        this.workflowParameters = $.workflowParameters;
        this.workflowSchema = $.workflowSchema;
        this.workflowVersion = $.workflowVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowState $;

        public Builder() {
            $ = new WorkflowState();
        }

        public Builder(WorkflowState defaults) {
            $ = new WorkflowState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessControl A `access_control` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder accessControl(@Nullable Output<WorkflowAccessControlArgs> accessControl) {
            $.accessControl = accessControl;
            return this;
        }

        /**
         * @param accessControl A `access_control` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder accessControl(WorkflowAccessControlArgs accessControl) {
            return accessControl(Output.of(accessControl));
        }

        /**
         * @param accessEndpoint The Access Endpoint for the Logic App Workflow.
         * 
         * @return builder
         * 
         */
        public Builder accessEndpoint(@Nullable Output<String> accessEndpoint) {
            $.accessEndpoint = accessEndpoint;
            return this;
        }

        /**
         * @param accessEndpoint The Access Endpoint for the Logic App Workflow.
         * 
         * @return builder
         * 
         */
        public Builder accessEndpoint(String accessEndpoint) {
            return accessEndpoint(Output.of(accessEndpoint));
        }

        /**
         * @param connectorEndpointIpAddresses The list of access endpoint IP addresses of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorEndpointIpAddresses(@Nullable Output<List<String>> connectorEndpointIpAddresses) {
            $.connectorEndpointIpAddresses = connectorEndpointIpAddresses;
            return this;
        }

        /**
         * @param connectorEndpointIpAddresses The list of access endpoint IP addresses of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorEndpointIpAddresses(List<String> connectorEndpointIpAddresses) {
            return connectorEndpointIpAddresses(Output.of(connectorEndpointIpAddresses));
        }

        /**
         * @param connectorEndpointIpAddresses The list of access endpoint IP addresses of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorEndpointIpAddresses(String... connectorEndpointIpAddresses) {
            return connectorEndpointIpAddresses(List.of(connectorEndpointIpAddresses));
        }

        /**
         * @param connectorOutboundIpAddresses The list of outgoing IP addresses of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorOutboundIpAddresses(@Nullable Output<List<String>> connectorOutboundIpAddresses) {
            $.connectorOutboundIpAddresses = connectorOutboundIpAddresses;
            return this;
        }

        /**
         * @param connectorOutboundIpAddresses The list of outgoing IP addresses of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorOutboundIpAddresses(List<String> connectorOutboundIpAddresses) {
            return connectorOutboundIpAddresses(Output.of(connectorOutboundIpAddresses));
        }

        /**
         * @param connectorOutboundIpAddresses The list of outgoing IP addresses of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorOutboundIpAddresses(String... connectorOutboundIpAddresses) {
            return connectorOutboundIpAddresses(List.of(connectorOutboundIpAddresses));
        }

        /**
         * @param enabled Is the Logic App Workflow enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the Logic App Workflow enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<WorkflowIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(WorkflowIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param integrationServiceEnvironmentId The ID of the Integration Service Environment to which this Logic App Workflow belongs.  Changing this forces a new Logic App Workflow to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentId(@Nullable Output<String> integrationServiceEnvironmentId) {
            $.integrationServiceEnvironmentId = integrationServiceEnvironmentId;
            return this;
        }

        /**
         * @param integrationServiceEnvironmentId The ID of the Integration Service Environment to which this Logic App Workflow belongs.  Changing this forces a new Logic App Workflow to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentId(String integrationServiceEnvironmentId) {
            return integrationServiceEnvironmentId(Output.of(integrationServiceEnvironmentId));
        }

        /**
         * @param location Specifies the supported Azure location where the Logic App Workflow exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the Logic App Workflow exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logicAppIntegrationAccountId The ID of the integration account linked by this Logic App Workflow.
         * 
         * @return builder
         * 
         */
        public Builder logicAppIntegrationAccountId(@Nullable Output<String> logicAppIntegrationAccountId) {
            $.logicAppIntegrationAccountId = logicAppIntegrationAccountId;
            return this;
        }

        /**
         * @param logicAppIntegrationAccountId The ID of the integration account linked by this Logic App Workflow.
         * 
         * @return builder
         * 
         */
        public Builder logicAppIntegrationAccountId(String logicAppIntegrationAccountId) {
            return logicAppIntegrationAccountId(Output.of(logicAppIntegrationAccountId));
        }

        /**
         * @param name Specifies the name of the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of Key-Value pairs.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of Key-Value pairs.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Logic App Workflow should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Logic App Workflow should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workflowEndpointIpAddresses The list of access endpoint IP addresses of workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowEndpointIpAddresses(@Nullable Output<List<String>> workflowEndpointIpAddresses) {
            $.workflowEndpointIpAddresses = workflowEndpointIpAddresses;
            return this;
        }

        /**
         * @param workflowEndpointIpAddresses The list of access endpoint IP addresses of workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowEndpointIpAddresses(List<String> workflowEndpointIpAddresses) {
            return workflowEndpointIpAddresses(Output.of(workflowEndpointIpAddresses));
        }

        /**
         * @param workflowEndpointIpAddresses The list of access endpoint IP addresses of workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowEndpointIpAddresses(String... workflowEndpointIpAddresses) {
            return workflowEndpointIpAddresses(List.of(workflowEndpointIpAddresses));
        }

        /**
         * @param workflowOutboundIpAddresses The list of outgoing IP addresses of workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowOutboundIpAddresses(@Nullable Output<List<String>> workflowOutboundIpAddresses) {
            $.workflowOutboundIpAddresses = workflowOutboundIpAddresses;
            return this;
        }

        /**
         * @param workflowOutboundIpAddresses The list of outgoing IP addresses of workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowOutboundIpAddresses(List<String> workflowOutboundIpAddresses) {
            return workflowOutboundIpAddresses(Output.of(workflowOutboundIpAddresses));
        }

        /**
         * @param workflowOutboundIpAddresses The list of outgoing IP addresses of workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowOutboundIpAddresses(String... workflowOutboundIpAddresses) {
            return workflowOutboundIpAddresses(List.of(workflowOutboundIpAddresses));
        }

        /**
         * @param workflowParameters Specifies a map of Key-Value pairs of the Parameter Definitions to use for this Logic App Workflow. The key is the parameter name, and the value is a JSON encoded string of the parameter definition (see: https://docs.microsoft.com/en-us/azure/logic-apps/logic-apps-workflow-definition-language#parameters).
         * 
         * @return builder
         * 
         */
        public Builder workflowParameters(@Nullable Output<Map<String,String>> workflowParameters) {
            $.workflowParameters = workflowParameters;
            return this;
        }

        /**
         * @param workflowParameters Specifies a map of Key-Value pairs of the Parameter Definitions to use for this Logic App Workflow. The key is the parameter name, and the value is a JSON encoded string of the parameter definition (see: https://docs.microsoft.com/en-us/azure/logic-apps/logic-apps-workflow-definition-language#parameters).
         * 
         * @return builder
         * 
         */
        public Builder workflowParameters(Map<String,String> workflowParameters) {
            return workflowParameters(Output.of(workflowParameters));
        }

        /**
         * @param workflowSchema Specifies the Schema to use for this Logic App Workflow. Defaults to `https://schema.management.azure.com/providers/Microsoft.Logic/schemas/2016-06-01/workflowdefinition.json#`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workflowSchema(@Nullable Output<String> workflowSchema) {
            $.workflowSchema = workflowSchema;
            return this;
        }

        /**
         * @param workflowSchema Specifies the Schema to use for this Logic App Workflow. Defaults to `https://schema.management.azure.com/providers/Microsoft.Logic/schemas/2016-06-01/workflowdefinition.json#`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workflowSchema(String workflowSchema) {
            return workflowSchema(Output.of(workflowSchema));
        }

        /**
         * @param workflowVersion Specifies the version of the Schema used for this Logic App Workflow. Defaults to `1.0.0.0`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workflowVersion(@Nullable Output<String> workflowVersion) {
            $.workflowVersion = workflowVersion;
            return this;
        }

        /**
         * @param workflowVersion Specifies the version of the Schema used for this Logic App Workflow. Defaults to `1.0.0.0`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workflowVersion(String workflowVersion) {
            return workflowVersion(Output.of(workflowVersion));
        }

        public WorkflowState build() {
            return $;
        }
    }

}
