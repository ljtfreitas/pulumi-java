// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SharedPrivateLinkResourcePropertiesResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAFDOriginResult {
    /**
     * Resource reference to the Azure origin resource.
     * 
     */
    private final @Nullable ResourceReferenceResponse azureOrigin;
    private final String deploymentStatus;
    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    private final @Nullable String enabledState;
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
     * Provisioning status
     * 
     */
    private final String provisioningState;
    /**
     * The properties of the private link resource for private origin.
     * 
     */
    private final @Nullable SharedPrivateLinkResourcePropertiesResponse sharedPrivateLinkResource;
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

    @OutputCustomType.Constructor({"azureOrigin","deploymentStatus","enabledState","hostName","httpPort","httpsPort","id","name","originHostHeader","priority","provisioningState","sharedPrivateLinkResource","systemData","type","weight"})
    private GetAFDOriginResult(
        @Nullable ResourceReferenceResponse azureOrigin,
        String deploymentStatus,
        @Nullable String enabledState,
        String hostName,
        @Nullable Integer httpPort,
        @Nullable Integer httpsPort,
        String id,
        String name,
        @Nullable String originHostHeader,
        @Nullable Integer priority,
        String provisioningState,
        @Nullable SharedPrivateLinkResourcePropertiesResponse sharedPrivateLinkResource,
        SystemDataResponse systemData,
        String type,
        @Nullable Integer weight) {
        this.azureOrigin = azureOrigin;
        this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
        this.enabledState = enabledState;
        this.hostName = Objects.requireNonNull(hostName);
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.originHostHeader = originHostHeader;
        this.priority = priority;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sharedPrivateLinkResource = sharedPrivateLinkResource;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
        this.weight = weight;
    }

    /**
     * Resource reference to the Azure origin resource.
     * 
     */
    public Optional<ResourceReferenceResponse> getAzureOrigin() {
        return Optional.ofNullable(this.azureOrigin);
    }
    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
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
     * Provisioning status
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The properties of the private link resource for private origin.
     * 
     */
    public Optional<SharedPrivateLinkResourcePropertiesResponse> getSharedPrivateLinkResource() {
        return Optional.ofNullable(this.sharedPrivateLinkResource);
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

    public static Builder builder(GetAFDOriginResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceReferenceResponse azureOrigin;
        private String deploymentStatus;
        private @Nullable String enabledState;
        private String hostName;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private String id;
        private String name;
        private @Nullable String originHostHeader;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable SharedPrivateLinkResourcePropertiesResponse sharedPrivateLinkResource;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAFDOriginResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureOrigin = defaults.azureOrigin;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.enabledState = defaults.enabledState;
    	      this.hostName = defaults.hostName;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.originHostHeader = defaults.originHostHeader;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sharedPrivateLinkResource = defaults.sharedPrivateLinkResource;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        public Builder setAzureOrigin(@Nullable ResourceReferenceResponse azureOrigin) {
            this.azureOrigin = azureOrigin;
            return this;
        }

        public Builder setDeploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSharedPrivateLinkResource(@Nullable SharedPrivateLinkResourcePropertiesResponse sharedPrivateLinkResource) {
            this.sharedPrivateLinkResource = sharedPrivateLinkResource;
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
        public GetAFDOriginResult build() {
            return new GetAFDOriginResult(azureOrigin, deploymentStatus, enabledState, hostName, httpPort, httpsPort, id, name, originHostHeader, priority, provisioningState, sharedPrivateLinkResource, systemData, type, weight);
        }
    }
}
