// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.AllowedEndpointRecordType;
import io.pulumi.azurenative.network.enums.ProfileStatus;
import io.pulumi.azurenative.network.enums.TrafficRoutingMethod;
import io.pulumi.azurenative.network.enums.TrafficViewEnrollmentStatus;
import io.pulumi.azurenative.network.inputs.DnsConfigArgs;
import io.pulumi.azurenative.network.inputs.EndpointArgs;
import io.pulumi.azurenative.network.inputs.MonitorConfigArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProfileArgs Empty = new ProfileArgs();

    /**
     * The list of allowed endpoint record types.
     * 
     */
    @InputImport(name="allowedEndpointRecordTypes")
        private final @Nullable Input<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes;

    public Input<List<Either<String,AllowedEndpointRecordType>>> getAllowedEndpointRecordTypes() {
        return this.allowedEndpointRecordTypes == null ? Input.empty() : this.allowedEndpointRecordTypes;
    }

    /**
     * The DNS settings of the Traffic Manager profile.
     * 
     */
    @InputImport(name="dnsConfig")
        private final @Nullable Input<DnsConfigArgs> dnsConfig;

    public Input<DnsConfigArgs> getDnsConfig() {
        return this.dnsConfig == null ? Input.empty() : this.dnsConfig;
    }

    /**
     * The list of endpoints in the Traffic Manager profile.
     * 
     */
    @InputImport(name="endpoints")
        private final @Nullable Input<List<EndpointArgs>> endpoints;

    public Input<List<EndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The Azure Region where the resource lives
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Maximum number of endpoints to be returned for MultiValue routing type.
     * 
     */
    @InputImport(name="maxReturn")
        private final @Nullable Input<Double> maxReturn;

    public Input<Double> getMaxReturn() {
        return this.maxReturn == null ? Input.empty() : this.maxReturn;
    }

    /**
     * The endpoint monitoring settings of the Traffic Manager profile.
     * 
     */
    @InputImport(name="monitorConfig")
        private final @Nullable Input<MonitorConfigArgs> monitorConfig;

    public Input<MonitorConfigArgs> getMonitorConfig() {
        return this.monitorConfig == null ? Input.empty() : this.monitorConfig;
    }

    /**
     * The name of the resource
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the Traffic Manager profile.
     * 
     */
    @InputImport(name="profileName")
        private final @Nullable Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName == null ? Input.empty() : this.profileName;
    }

    /**
     * The status of the Traffic Manager profile.
     * 
     */
    @InputImport(name="profileStatus")
        private final @Nullable Input<Either<String,ProfileStatus>> profileStatus;

    public Input<Either<String,ProfileStatus>> getProfileStatus() {
        return this.profileStatus == null ? Input.empty() : this.profileStatus;
    }

    /**
     * The name of the resource group containing the Traffic Manager profile.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The traffic routing method of the Traffic Manager profile.
     * 
     */
    @InputImport(name="trafficRoutingMethod")
        private final @Nullable Input<Either<String,TrafficRoutingMethod>> trafficRoutingMethod;

    public Input<Either<String,TrafficRoutingMethod>> getTrafficRoutingMethod() {
        return this.trafficRoutingMethod == null ? Input.empty() : this.trafficRoutingMethod;
    }

    /**
     * Indicates whether Traffic View is 'Enabled' or 'Disabled' for the Traffic Manager profile. Null, indicates 'Disabled'. Enabling this feature will increase the cost of the Traffic Manage profile.
     * 
     */
    @InputImport(name="trafficViewEnrollmentStatus")
        private final @Nullable Input<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus;

    public Input<Either<String,TrafficViewEnrollmentStatus>> getTrafficViewEnrollmentStatus() {
        return this.trafficViewEnrollmentStatus == null ? Input.empty() : this.trafficViewEnrollmentStatus;
    }

    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ProfileArgs(
        @Nullable Input<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes,
        @Nullable Input<DnsConfigArgs> dnsConfig,
        @Nullable Input<List<EndpointArgs>> endpoints,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<Double> maxReturn,
        @Nullable Input<MonitorConfigArgs> monitorConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> profileName,
        @Nullable Input<Either<String,ProfileStatus>> profileStatus,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Either<String,TrafficRoutingMethod>> trafficRoutingMethod,
        @Nullable Input<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus,
        @Nullable Input<String> type) {
        this.allowedEndpointRecordTypes = allowedEndpointRecordTypes;
        this.dnsConfig = dnsConfig;
        this.endpoints = endpoints;
        this.id = id;
        this.location = location;
        this.maxReturn = maxReturn;
        this.monitorConfig = monitorConfig;
        this.name = name;
        this.profileName = profileName;
        this.profileStatus = profileStatus;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.trafficRoutingMethod = trafficRoutingMethod;
        this.trafficViewEnrollmentStatus = trafficViewEnrollmentStatus;
        this.type = type;
    }

    private ProfileArgs() {
        this.allowedEndpointRecordTypes = Input.empty();
        this.dnsConfig = Input.empty();
        this.endpoints = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.maxReturn = Input.empty();
        this.monitorConfig = Input.empty();
        this.name = Input.empty();
        this.profileName = Input.empty();
        this.profileStatus = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.trafficRoutingMethod = Input.empty();
        this.trafficViewEnrollmentStatus = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes;
        private @Nullable Input<DnsConfigArgs> dnsConfig;
        private @Nullable Input<List<EndpointArgs>> endpoints;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<Double> maxReturn;
        private @Nullable Input<MonitorConfigArgs> monitorConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> profileName;
        private @Nullable Input<Either<String,ProfileStatus>> profileStatus;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Either<String,TrafficRoutingMethod>> trafficRoutingMethod;
        private @Nullable Input<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedEndpointRecordTypes = defaults.allowedEndpointRecordTypes;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.endpoints = defaults.endpoints;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maxReturn = defaults.maxReturn;
    	      this.monitorConfig = defaults.monitorConfig;
    	      this.name = defaults.name;
    	      this.profileName = defaults.profileName;
    	      this.profileStatus = defaults.profileStatus;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.trafficRoutingMethod = defaults.trafficRoutingMethod;
    	      this.trafficViewEnrollmentStatus = defaults.trafficViewEnrollmentStatus;
    	      this.type = defaults.type;
        }

        public Builder setAllowedEndpointRecordTypes(@Nullable Input<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes) {
            this.allowedEndpointRecordTypes = allowedEndpointRecordTypes;
            return this;
        }

        public Builder setAllowedEndpointRecordTypes(@Nullable List<Either<String,AllowedEndpointRecordType>> allowedEndpointRecordTypes) {
            this.allowedEndpointRecordTypes = Input.ofNullable(allowedEndpointRecordTypes);
            return this;
        }

        public Builder setDnsConfig(@Nullable Input<DnsConfigArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setDnsConfig(@Nullable DnsConfigArgs dnsConfig) {
            this.dnsConfig = Input.ofNullable(dnsConfig);
            return this;
        }

        public Builder setEndpoints(@Nullable Input<List<EndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<EndpointArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaxReturn(@Nullable Input<Double> maxReturn) {
            this.maxReturn = maxReturn;
            return this;
        }

        public Builder setMaxReturn(@Nullable Double maxReturn) {
            this.maxReturn = Input.ofNullable(maxReturn);
            return this;
        }

        public Builder setMonitorConfig(@Nullable Input<MonitorConfigArgs> monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }

        public Builder setMonitorConfig(@Nullable MonitorConfigArgs monitorConfig) {
            this.monitorConfig = Input.ofNullable(monitorConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProfileName(@Nullable Input<String> profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder setProfileName(@Nullable String profileName) {
            this.profileName = Input.ofNullable(profileName);
            return this;
        }

        public Builder setProfileStatus(@Nullable Input<Either<String,ProfileStatus>> profileStatus) {
            this.profileStatus = profileStatus;
            return this;
        }

        public Builder setProfileStatus(@Nullable Either<String,ProfileStatus> profileStatus) {
            this.profileStatus = Input.ofNullable(profileStatus);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTrafficRoutingMethod(@Nullable Input<Either<String,TrafficRoutingMethod>> trafficRoutingMethod) {
            this.trafficRoutingMethod = trafficRoutingMethod;
            return this;
        }

        public Builder setTrafficRoutingMethod(@Nullable Either<String,TrafficRoutingMethod> trafficRoutingMethod) {
            this.trafficRoutingMethod = Input.ofNullable(trafficRoutingMethod);
            return this;
        }

        public Builder setTrafficViewEnrollmentStatus(@Nullable Input<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus) {
            this.trafficViewEnrollmentStatus = trafficViewEnrollmentStatus;
            return this;
        }

        public Builder setTrafficViewEnrollmentStatus(@Nullable Either<String,TrafficViewEnrollmentStatus> trafficViewEnrollmentStatus) {
            this.trafficViewEnrollmentStatus = Input.ofNullable(trafficViewEnrollmentStatus);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ProfileArgs build() {
            return new ProfileArgs(allowedEndpointRecordTypes, dnsConfig, endpoints, id, location, maxReturn, monitorConfig, name, profileName, profileStatus, resourceGroupName, tags, trafficRoutingMethod, trafficViewEnrollmentStatus, type);
        }
    }
}
