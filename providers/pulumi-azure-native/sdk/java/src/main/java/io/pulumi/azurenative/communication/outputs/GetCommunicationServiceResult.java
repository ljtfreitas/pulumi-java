// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.communication.outputs;

import io.pulumi.azurenative.communication.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCommunicationServiceResult {
    /**
     * The location where the communication service stores its data at rest.
     * 
     */
    private final String dataLocation;
    /**
     * FQDN of the CommunicationService instance.
     * 
     */
    private final String hostName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The immutable resource Id of the communication service.
     * 
     */
    private final String immutableResourceId;
    /**
     * The Azure location where the CommunicationService is running.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Resource ID of an Azure Notification Hub linked to this resource.
     * 
     */
    private final String notificationHubId;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Version of the CommunicationService resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"dataLocation","hostName","id","immutableResourceId","location","name","notificationHubId","provisioningState","systemData","tags","type","version"})
    private GetCommunicationServiceResult(
        String dataLocation,
        String hostName,
        String id,
        String immutableResourceId,
        @Nullable String location,
        String name,
        String notificationHubId,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        String version) {
        this.dataLocation = Objects.requireNonNull(dataLocation);
        this.hostName = Objects.requireNonNull(hostName);
        this.id = Objects.requireNonNull(id);
        this.immutableResourceId = Objects.requireNonNull(immutableResourceId);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.notificationHubId = Objects.requireNonNull(notificationHubId);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The location where the communication service stores its data at rest.
     * 
     */
    public String getDataLocation() {
        return this.dataLocation;
    }
    /**
     * FQDN of the CommunicationService instance.
     * 
     */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The immutable resource Id of the communication service.
     * 
     */
    public String getImmutableResourceId() {
        return this.immutableResourceId;
    }
    /**
     * The Azure location where the CommunicationService is running.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Resource ID of an Azure Notification Hub linked to this resource.
     * 
     */
    public String getNotificationHubId() {
        return this.notificationHubId;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Version of the CommunicationService resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommunicationServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataLocation;
        private String hostName;
        private String id;
        private String immutableResourceId;
        private @Nullable String location;
        private String name;
        private String notificationHubId;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCommunicationServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLocation = defaults.dataLocation;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.immutableResourceId = defaults.immutableResourceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationHubId = defaults.notificationHubId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setDataLocation(String dataLocation) {
            this.dataLocation = Objects.requireNonNull(dataLocation);
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImmutableResourceId(String immutableResourceId) {
            this.immutableResourceId = Objects.requireNonNull(immutableResourceId);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationHubId(String notificationHubId) {
            this.notificationHubId = Objects.requireNonNull(notificationHubId);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetCommunicationServiceResult build() {
            return new GetCommunicationServiceResult(dataLocation, hostName, id, immutableResourceId, location, name, notificationHubId, provisioningState, systemData, tags, type, version);
        }
    }
}
