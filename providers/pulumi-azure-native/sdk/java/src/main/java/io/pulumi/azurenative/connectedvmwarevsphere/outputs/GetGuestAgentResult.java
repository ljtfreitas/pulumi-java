// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GuestCredentialResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.HttpProxyConfigurationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGuestAgentResult {
    /**
     * Username / Password Credentials to provision guest agent.
     * 
     */
    private final @Nullable GuestCredentialResponse credentials;
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    private final String customResourceName;
    /**
     * HTTP Proxy configuration for the VM.
     * 
     */
    private final @Nullable HttpProxyConfigurationResponse httpProxyConfig;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the guest agent provisioning action.
     * 
     */
    private final @Nullable String provisioningAction;
    /**
     * Gets or sets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Gets or sets the guest agent status.
     * 
     */
    private final String status;
    /**
     * The resource status information.
     * 
     */
    private final List<ResourceStatusResponse> statuses;
    /**
     * The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    private final String uuid;

    @OutputCustomType.Constructor({"credentials","customResourceName","httpProxyConfig","id","name","provisioningAction","provisioningState","status","statuses","systemData","type","uuid"})
    private GetGuestAgentResult(
        @Nullable GuestCredentialResponse credentials,
        String customResourceName,
        @Nullable HttpProxyConfigurationResponse httpProxyConfig,
        String id,
        String name,
        @Nullable String provisioningAction,
        String provisioningState,
        String status,
        List<ResourceStatusResponse> statuses,
        SystemDataResponse systemData,
        String type,
        String uuid) {
        this.credentials = credentials;
        this.customResourceName = Objects.requireNonNull(customResourceName);
        this.httpProxyConfig = httpProxyConfig;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningAction = provisioningAction;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.status = Objects.requireNonNull(status);
        this.statuses = Objects.requireNonNull(statuses);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
        this.uuid = Objects.requireNonNull(uuid);
    }

    /**
     * Username / Password Credentials to provision guest agent.
     * 
     */
    public Optional<GuestCredentialResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    public String getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * HTTP Proxy configuration for the VM.
     * 
     */
    public Optional<HttpProxyConfigurationResponse> getHttpProxyConfig() {
        return Optional.ofNullable(this.httpProxyConfig);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the guest agent provisioning action.
     * 
     */
    public Optional<String> getProvisioningAction() {
        return Optional.ofNullable(this.provisioningAction);
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the guest agent status.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * The resource status information.
     * 
     */
    public List<ResourceStatusResponse> getStatuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    public String getUuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuestAgentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GuestCredentialResponse credentials;
        private String customResourceName;
        private @Nullable HttpProxyConfigurationResponse httpProxyConfig;
        private String id;
        private String name;
        private @Nullable String provisioningAction;
        private String provisioningState;
        private String status;
        private List<ResourceStatusResponse> statuses;
        private SystemDataResponse systemData;
        private String type;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuestAgentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.customResourceName = defaults.customResourceName;
    	      this.httpProxyConfig = defaults.httpProxyConfig;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningAction = defaults.provisioningAction;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.statuses = defaults.statuses;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        public Builder setCredentials(@Nullable GuestCredentialResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCustomResourceName(String customResourceName) {
            this.customResourceName = Objects.requireNonNull(customResourceName);
            return this;
        }

        public Builder setHttpProxyConfig(@Nullable HttpProxyConfigurationResponse httpProxyConfig) {
            this.httpProxyConfig = httpProxyConfig;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningAction(@Nullable String provisioningAction) {
            this.provisioningAction = provisioningAction;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatuses(List<ResourceStatusResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public GetGuestAgentResult build() {
            return new GetGuestAgentResult(credentials, customResourceName, httpProxyConfig, id, name, provisioningAction, provisioningState, status, statuses, systemData, type, uuid);
        }
    }
}
