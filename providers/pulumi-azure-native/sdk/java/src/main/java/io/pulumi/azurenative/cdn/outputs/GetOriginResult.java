// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOriginResult {
    /**
     * Origin is enabled for load balancing or not
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    private final String hostName;
    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    private final @Nullable Integer httpPort;
    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    private final @Nullable Integer httpsPort;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    private final @Nullable String originHostHeader;
    /**
     * Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The approval status for the connection to the Private Link
     * 
     */
    private final String privateEndpointStatus;
    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'
     * 
     */
    private final @Nullable String privateLinkAlias;
    /**
     * A custom message to be included in the approval request to connect to the Private Link.
     * 
     */
    private final @Nullable String privateLinkApprovalMessage;
    /**
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
     */
    private final @Nullable String privateLinkLocation;
    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    private final @Nullable String privateLinkResourceId;
    /**
     * Provisioning status of the origin.
     * 
     */
    private final String provisioningState;
    /**
     * Resource status of the origin.
     * 
     */
    private final String resourceState;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    private final @Nullable Integer weight;

    @OutputCustomType.Constructor({"enabled","hostName","httpPort","httpsPort","id","name","originHostHeader","priority","privateEndpointStatus","privateLinkAlias","privateLinkApprovalMessage","privateLinkLocation","privateLinkResourceId","provisioningState","resourceState","systemData","type","weight"})
    private GetOriginResult(
        @Nullable Boolean enabled,
        String hostName,
        @Nullable Integer httpPort,
        @Nullable Integer httpsPort,
        String id,
        String name,
        @Nullable String originHostHeader,
        @Nullable Integer priority,
        String privateEndpointStatus,
        @Nullable String privateLinkAlias,
        @Nullable String privateLinkApprovalMessage,
        @Nullable String privateLinkLocation,
        @Nullable String privateLinkResourceId,
        String provisioningState,
        String resourceState,
        SystemDataResponse systemData,
        String type,
        @Nullable Integer weight) {
        this.enabled = enabled;
        this.hostName = Objects.requireNonNull(hostName);
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.originHostHeader = originHostHeader;
        this.priority = priority;
        this.privateEndpointStatus = Objects.requireNonNull(privateEndpointStatus);
        this.privateLinkAlias = privateLinkAlias;
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        this.privateLinkLocation = privateLinkLocation;
        this.privateLinkResourceId = privateLinkResourceId;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceState = Objects.requireNonNull(resourceState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
        this.weight = weight;
    }

    /**
     * Origin is enabled for load balancing or not
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    public Optional<Integer> getHttpPort() {
        return Optional.ofNullable(this.httpPort);
    }
    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    public Optional<Integer> getHttpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    public Optional<String> getOriginHostHeader() {
        return Optional.ofNullable(this.originHostHeader);
    }
    /**
     * Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The approval status for the connection to the Private Link
     * 
     */
    public String getPrivateEndpointStatus() {
        return this.privateEndpointStatus;
    }
    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'
     * 
     */
    public Optional<String> getPrivateLinkAlias() {
        return Optional.ofNullable(this.privateLinkAlias);
    }
    /**
     * A custom message to be included in the approval request to connect to the Private Link.
     * 
     */
    public Optional<String> getPrivateLinkApprovalMessage() {
        return Optional.ofNullable(this.privateLinkApprovalMessage);
    }
    /**
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
     */
    public Optional<String> getPrivateLinkLocation() {
        return Optional.ofNullable(this.privateLinkLocation);
    }
    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    public Optional<String> getPrivateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }
    /**
     * Provisioning status of the origin.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource status of the origin.
     * 
     */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * Read only system data
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private String hostName;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private String id;
        private String name;
        private @Nullable String originHostHeader;
        private @Nullable Integer priority;
        private String privateEndpointStatus;
        private @Nullable String privateLinkAlias;
        private @Nullable String privateLinkApprovalMessage;
        private @Nullable String privateLinkLocation;
        private @Nullable String privateLinkResourceId;
        private String provisioningState;
        private String resourceState;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.hostName = defaults.hostName;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.originHostHeader = defaults.originHostHeader;
    	      this.priority = defaults.priority;
    	      this.privateEndpointStatus = defaults.privateEndpointStatus;
    	      this.privateLinkAlias = defaults.privateLinkAlias;
    	      this.privateLinkApprovalMessage = defaults.privateLinkApprovalMessage;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setHttpPort(@Nullable Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }

        public Builder setHttpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = httpsPort;
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

        public Builder setOriginHostHeader(@Nullable String originHostHeader) {
            this.originHostHeader = originHostHeader;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPrivateEndpointStatus(String privateEndpointStatus) {
            this.privateEndpointStatus = Objects.requireNonNull(privateEndpointStatus);
            return this;
        }

        public Builder setPrivateLinkAlias(@Nullable String privateLinkAlias) {
            this.privateLinkAlias = privateLinkAlias;
            return this;
        }

        public Builder setPrivateLinkApprovalMessage(@Nullable String privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }

        public Builder setPrivateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
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

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public GetOriginResult build() {
            return new GetOriginResult(enabled, hostName, httpPort, httpsPort, id, name, originHostHeader, priority, privateEndpointStatus, privateLinkAlias, privateLinkApprovalMessage, privateLinkLocation, privateLinkResourceId, provisioningState, resourceState, systemData, type, weight);
        }
    }
}
