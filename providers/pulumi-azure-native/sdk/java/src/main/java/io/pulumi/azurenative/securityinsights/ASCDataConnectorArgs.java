// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.inputs.AlertsDataTypeOfDataConnectorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ASCDataConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ASCDataConnectorArgs Empty = new ASCDataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @InputImport(name="dataConnectorId")
    private final @Nullable Input<String> dataConnectorId;

    public Input<String> getDataConnectorId() {
        return this.dataConnectorId == null ? Input.empty() : this.dataConnectorId;
    }

    /**
     * The available data types for the connector.
     * 
     */
    @InputImport(name="dataTypes")
    private final @Nullable Input<AlertsDataTypeOfDataConnectorArgs> dataTypes;

    public Input<AlertsDataTypeOfDataConnectorArgs> getDataTypes() {
        return this.dataTypes == null ? Input.empty() : this.dataTypes;
    }

    /**
     * The kind of the data connector
     * Expected value is 'AzureSecurityCenter'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The subscription id to connect to, and get the data from.
     * 
     */
    @InputImport(name="subscriptionId")
    private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public ASCDataConnectorArgs(
        @Nullable Input<String> dataConnectorId,
        @Nullable Input<AlertsDataTypeOfDataConnectorArgs> dataTypes,
        Input<String> kind,
        Input<String> resourceGroupName,
        @Nullable Input<String> subscriptionId,
        Input<String> workspaceName) {
        this.dataConnectorId = dataConnectorId;
        this.dataTypes = dataTypes;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subscriptionId = subscriptionId;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ASCDataConnectorArgs() {
        this.dataConnectorId = Input.empty();
        this.dataTypes = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.subscriptionId = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ASCDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataConnectorId;
        private @Nullable Input<AlertsDataTypeOfDataConnectorArgs> dataTypes;
        private Input<String> kind;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> subscriptionId;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ASCDataConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectorId = defaults.dataConnectorId;
    	      this.dataTypes = defaults.dataTypes;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDataConnectorId(@Nullable Input<String> dataConnectorId) {
            this.dataConnectorId = dataConnectorId;
            return this;
        }

        public Builder setDataConnectorId(@Nullable String dataConnectorId) {
            this.dataConnectorId = Input.ofNullable(dataConnectorId);
            return this;
        }

        public Builder setDataTypes(@Nullable Input<AlertsDataTypeOfDataConnectorArgs> dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder setDataTypes(@Nullable AlertsDataTypeOfDataConnectorArgs dataTypes) {
            this.dataTypes = Input.ofNullable(dataTypes);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSubscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public ASCDataConnectorArgs build() {
            return new ASCDataConnectorArgs(dataConnectorId, dataTypes, kind, resourceGroupName, subscriptionId, workspaceName);
        }
    }
}
