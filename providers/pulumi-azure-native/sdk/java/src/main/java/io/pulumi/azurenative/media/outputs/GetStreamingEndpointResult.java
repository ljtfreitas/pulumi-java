// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.CrossSiteAccessPoliciesResponse;
import io.pulumi.azurenative.media.outputs.StreamingEndpointAccessControlResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStreamingEndpointResult {
    /**
     * The access control definition of the streaming endpoint.
     * 
     */
    private final @Nullable StreamingEndpointAccessControlResponse accessControl;
    /**
     * This feature is deprecated, do not set a value for this property.
     * 
     */
    private final @Nullable String availabilitySetName;
    /**
     * The CDN enabled flag.
     * 
     */
    private final @Nullable Boolean cdnEnabled;
    /**
     * The CDN profile name.
     * 
     */
    private final @Nullable String cdnProfile;
    /**
     * The CDN provider name.
     * 
     */
    private final @Nullable String cdnProvider;
    /**
     * The exact time the streaming endpoint was created.
     * 
     */
    private final String created;
    /**
     * The streaming endpoint access policies.
     * 
     */
    private final @Nullable CrossSiteAccessPoliciesResponse crossSiteAccessPolicies;
    /**
     * The custom host names of the streaming endpoint
     * 
     */
    private final @Nullable List<String> customHostNames;
    /**
     * The streaming endpoint description.
     * 
     */
    private final @Nullable String description;
    /**
     * The free trial expiration time.
     * 
     */
    private final String freeTrialEndTime;
    /**
     * The streaming endpoint host name.
     * 
     */
    private final String hostName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The exact time the streaming endpoint was last modified.
     * 
     */
    private final String lastModified;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Max cache age
     * 
     */
    private final @Nullable Double maxCacheAge;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioning state of the streaming endpoint.
     * 
     */
    private final String provisioningState;
    /**
     * The resource state of the streaming endpoint.
     * 
     */
    private final String resourceState;
    /**
     * The number of scale units. Use the Scale operation to adjust this value.
     * 
     */
    private final Integer scaleUnits;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accessControl","availabilitySetName","cdnEnabled","cdnProfile","cdnProvider","created","crossSiteAccessPolicies","customHostNames","description","freeTrialEndTime","hostName","id","lastModified","location","maxCacheAge","name","provisioningState","resourceState","scaleUnits","systemData","tags","type"})
    private GetStreamingEndpointResult(
        @Nullable StreamingEndpointAccessControlResponse accessControl,
        @Nullable String availabilitySetName,
        @Nullable Boolean cdnEnabled,
        @Nullable String cdnProfile,
        @Nullable String cdnProvider,
        String created,
        @Nullable CrossSiteAccessPoliciesResponse crossSiteAccessPolicies,
        @Nullable List<String> customHostNames,
        @Nullable String description,
        String freeTrialEndTime,
        String hostName,
        String id,
        String lastModified,
        String location,
        @Nullable Double maxCacheAge,
        String name,
        String provisioningState,
        String resourceState,
        Integer scaleUnits,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.accessControl = accessControl;
        this.availabilitySetName = availabilitySetName;
        this.cdnEnabled = cdnEnabled;
        this.cdnProfile = cdnProfile;
        this.cdnProvider = cdnProvider;
        this.created = Objects.requireNonNull(created);
        this.crossSiteAccessPolicies = crossSiteAccessPolicies;
        this.customHostNames = customHostNames;
        this.description = description;
        this.freeTrialEndTime = Objects.requireNonNull(freeTrialEndTime);
        this.hostName = Objects.requireNonNull(hostName);
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.location = Objects.requireNonNull(location);
        this.maxCacheAge = maxCacheAge;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceState = Objects.requireNonNull(resourceState);
        this.scaleUnits = Objects.requireNonNull(scaleUnits);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The access control definition of the streaming endpoint.
     * 
     */
    public Optional<StreamingEndpointAccessControlResponse> getAccessControl() {
        return Optional.ofNullable(this.accessControl);
    }
    /**
     * This feature is deprecated, do not set a value for this property.
     * 
     */
    public Optional<String> getAvailabilitySetName() {
        return Optional.ofNullable(this.availabilitySetName);
    }
    /**
     * The CDN enabled flag.
     * 
     */
    public Optional<Boolean> getCdnEnabled() {
        return Optional.ofNullable(this.cdnEnabled);
    }
    /**
     * The CDN profile name.
     * 
     */
    public Optional<String> getCdnProfile() {
        return Optional.ofNullable(this.cdnProfile);
    }
    /**
     * The CDN provider name.
     * 
     */
    public Optional<String> getCdnProvider() {
        return Optional.ofNullable(this.cdnProvider);
    }
    /**
     * The exact time the streaming endpoint was created.
     * 
     */
    public String getCreated() {
        return this.created;
    }
    /**
     * The streaming endpoint access policies.
     * 
     */
    public Optional<CrossSiteAccessPoliciesResponse> getCrossSiteAccessPolicies() {
        return Optional.ofNullable(this.crossSiteAccessPolicies);
    }
    /**
     * The custom host names of the streaming endpoint
     * 
     */
    public List<String> getCustomHostNames() {
        return this.customHostNames == null ? List.of() : this.customHostNames;
    }
    /**
     * The streaming endpoint description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The free trial expiration time.
     * 
     */
    public String getFreeTrialEndTime() {
        return this.freeTrialEndTime;
    }
    /**
     * The streaming endpoint host name.
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
     * The exact time the streaming endpoint was last modified.
     * 
     */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Max cache age
     * 
     */
    public Optional<Double> getMaxCacheAge() {
        return Optional.ofNullable(this.maxCacheAge);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the streaming endpoint.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource state of the streaming endpoint.
     * 
     */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * The number of scale units. Use the Scale operation to adjust this value.
     * 
     */
    public Integer getScaleUnits() {
        return this.scaleUnits;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StreamingEndpointAccessControlResponse accessControl;
        private @Nullable String availabilitySetName;
        private @Nullable Boolean cdnEnabled;
        private @Nullable String cdnProfile;
        private @Nullable String cdnProvider;
        private String created;
        private @Nullable CrossSiteAccessPoliciesResponse crossSiteAccessPolicies;
        private @Nullable List<String> customHostNames;
        private @Nullable String description;
        private String freeTrialEndTime;
        private String hostName;
        private String id;
        private String lastModified;
        private String location;
        private @Nullable Double maxCacheAge;
        private String name;
        private String provisioningState;
        private String resourceState;
        private Integer scaleUnits;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.availabilitySetName = defaults.availabilitySetName;
    	      this.cdnEnabled = defaults.cdnEnabled;
    	      this.cdnProfile = defaults.cdnProfile;
    	      this.cdnProvider = defaults.cdnProvider;
    	      this.created = defaults.created;
    	      this.crossSiteAccessPolicies = defaults.crossSiteAccessPolicies;
    	      this.customHostNames = defaults.customHostNames;
    	      this.description = defaults.description;
    	      this.freeTrialEndTime = defaults.freeTrialEndTime;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.location = defaults.location;
    	      this.maxCacheAge = defaults.maxCacheAge;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.scaleUnits = defaults.scaleUnits;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAccessControl(@Nullable StreamingEndpointAccessControlResponse accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Builder setAvailabilitySetName(@Nullable String availabilitySetName) {
            this.availabilitySetName = availabilitySetName;
            return this;
        }

        public Builder setCdnEnabled(@Nullable Boolean cdnEnabled) {
            this.cdnEnabled = cdnEnabled;
            return this;
        }

        public Builder setCdnProfile(@Nullable String cdnProfile) {
            this.cdnProfile = cdnProfile;
            return this;
        }

        public Builder setCdnProvider(@Nullable String cdnProvider) {
            this.cdnProvider = cdnProvider;
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setCrossSiteAccessPolicies(@Nullable CrossSiteAccessPoliciesResponse crossSiteAccessPolicies) {
            this.crossSiteAccessPolicies = crossSiteAccessPolicies;
            return this;
        }

        public Builder setCustomHostNames(@Nullable List<String> customHostNames) {
            this.customHostNames = customHostNames;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFreeTrialEndTime(String freeTrialEndTime) {
            this.freeTrialEndTime = Objects.requireNonNull(freeTrialEndTime);
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

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMaxCacheAge(@Nullable Double maxCacheAge) {
            this.maxCacheAge = maxCacheAge;
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

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setScaleUnits(Integer scaleUnits) {
            this.scaleUnits = Objects.requireNonNull(scaleUnits);
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
        public GetStreamingEndpointResult build() {
            return new GetStreamingEndpointResult(accessControl, availabilitySetName, cdnEnabled, cdnProfile, cdnProvider, created, crossSiteAccessPolicies, customHostNames, description, freeTrialEndTime, hostName, id, lastModified, location, maxCacheAge, name, provisioningState, resourceState, scaleUnits, systemData, tags, type);
        }
    }
}
