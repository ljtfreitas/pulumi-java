// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AppLogsConfigurationResponse;
import io.pulumi.azurenative.web.outputs.ArcConfigurationResponse;
import io.pulumi.azurenative.web.outputs.ExtendedLocationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKubeEnvironmentResult {
    private final @Nullable String aksResourceID;
    /**
     * Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only "log-analytics" is
     * supported
     * 
     */
    private final @Nullable AppLogsConfigurationResponse appLogsConfiguration;
    /**
     * Cluster configuration which determines the ARC cluster
     * components types. Eg: Choosing between BuildService kind,
     * FrontEnd Service ArtifactsStorageType etc.
     * 
     */
    private final @Nullable ArcConfigurationResponse arcConfiguration;
    /**
     * Default Domain Name for the cluster
     * 
     */
    private final String defaultDomain;
    /**
     * Any errors that occurred during deployment or deployment validation
     * 
     */
    private final String deploymentErrors;
    /**
     * Extended Location.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Only visible within Vnet/Subnet
     * 
     */
    private final @Nullable Boolean internalLoadBalancerEnabled;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Location.
     * 
     */
    private final String location;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Provisioning state of the Kubernetes Environment.
     * 
     */
    private final String provisioningState;
    /**
     * Static IP of the KubeEnvironment
     * 
     */
    private final @Nullable String staticIp;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"aksResourceID","appLogsConfiguration","arcConfiguration","defaultDomain","deploymentErrors","extendedLocation","id","internalLoadBalancerEnabled","kind","location","name","provisioningState","staticIp","tags","type"})
    private GetKubeEnvironmentResult(
        @Nullable String aksResourceID,
        @Nullable AppLogsConfigurationResponse appLogsConfiguration,
        @Nullable ArcConfigurationResponse arcConfiguration,
        String defaultDomain,
        String deploymentErrors,
        @Nullable ExtendedLocationResponse extendedLocation,
        String id,
        @Nullable Boolean internalLoadBalancerEnabled,
        @Nullable String kind,
        String location,
        String name,
        String provisioningState,
        @Nullable String staticIp,
        @Nullable Map<String,String> tags,
        String type) {
        this.aksResourceID = aksResourceID;
        this.appLogsConfiguration = appLogsConfiguration;
        this.arcConfiguration = arcConfiguration;
        this.defaultDomain = Objects.requireNonNull(defaultDomain);
        this.deploymentErrors = Objects.requireNonNull(deploymentErrors);
        this.extendedLocation = extendedLocation;
        this.id = Objects.requireNonNull(id);
        this.internalLoadBalancerEnabled = internalLoadBalancerEnabled;
        this.kind = kind;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.staticIp = staticIp;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAksResourceID() {
        return Optional.ofNullable(this.aksResourceID);
    }
    /**
     * Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only "log-analytics" is
     * supported
     * 
     */
    public Optional<AppLogsConfigurationResponse> getAppLogsConfiguration() {
        return Optional.ofNullable(this.appLogsConfiguration);
    }
    /**
     * Cluster configuration which determines the ARC cluster
     * components types. Eg: Choosing between BuildService kind,
     * FrontEnd Service ArtifactsStorageType etc.
     * 
     */
    public Optional<ArcConfigurationResponse> getArcConfiguration() {
        return Optional.ofNullable(this.arcConfiguration);
    }
    /**
     * Default Domain Name for the cluster
     * 
     */
    public String getDefaultDomain() {
        return this.defaultDomain;
    }
    /**
     * Any errors that occurred during deployment or deployment validation
     * 
     */
    public String getDeploymentErrors() {
        return this.deploymentErrors;
    }
    /**
     * Extended Location.
     * 
     */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Only visible within Vnet/Subnet
     * 
     */
    public Optional<Boolean> getInternalLoadBalancerEnabled() {
        return Optional.ofNullable(this.internalLoadBalancerEnabled);
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the Kubernetes Environment.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Static IP of the KubeEnvironment
     * 
     */
    public Optional<String> getStaticIp() {
        return Optional.ofNullable(this.staticIp);
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubeEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aksResourceID;
        private @Nullable AppLogsConfigurationResponse appLogsConfiguration;
        private @Nullable ArcConfigurationResponse arcConfiguration;
        private String defaultDomain;
        private String deploymentErrors;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String id;
        private @Nullable Boolean internalLoadBalancerEnabled;
        private @Nullable String kind;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable String staticIp;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKubeEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aksResourceID = defaults.aksResourceID;
    	      this.appLogsConfiguration = defaults.appLogsConfiguration;
    	      this.arcConfiguration = defaults.arcConfiguration;
    	      this.defaultDomain = defaults.defaultDomain;
    	      this.deploymentErrors = defaults.deploymentErrors;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.internalLoadBalancerEnabled = defaults.internalLoadBalancerEnabled;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.staticIp = defaults.staticIp;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAksResourceID(@Nullable String aksResourceID) {
            this.aksResourceID = aksResourceID;
            return this;
        }

        public Builder setAppLogsConfiguration(@Nullable AppLogsConfigurationResponse appLogsConfiguration) {
            this.appLogsConfiguration = appLogsConfiguration;
            return this;
        }

        public Builder setArcConfiguration(@Nullable ArcConfigurationResponse arcConfiguration) {
            this.arcConfiguration = arcConfiguration;
            return this;
        }

        public Builder setDefaultDomain(String defaultDomain) {
            this.defaultDomain = Objects.requireNonNull(defaultDomain);
            return this;
        }

        public Builder setDeploymentErrors(String deploymentErrors) {
            this.deploymentErrors = Objects.requireNonNull(deploymentErrors);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInternalLoadBalancerEnabled(@Nullable Boolean internalLoadBalancerEnabled) {
            this.internalLoadBalancerEnabled = internalLoadBalancerEnabled;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStaticIp(@Nullable String staticIp) {
            this.staticIp = staticIp;
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
        public GetKubeEnvironmentResult build() {
            return new GetKubeEnvironmentResult(aksResourceID, appLogsConfiguration, arcConfiguration, defaultDomain, deploymentErrors, extendedLocation, id, internalLoadBalancerEnabled, kind, location, name, provisioningState, staticIp, tags, type);
        }
    }
}
