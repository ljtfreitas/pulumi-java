// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.media.inputs.CrossSiteAccessPoliciesArgs;
import io.pulumi.azurenative.media.inputs.StreamingEndpointAccessControlArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamingEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingEndpointArgs Empty = new StreamingEndpointArgs();

    /**
     * The access control definition of the streaming endpoint.
     * 
     */
    @InputImport(name="accessControl")
        private final @Nullable Input<StreamingEndpointAccessControlArgs> accessControl;

    public Input<StreamingEndpointAccessControlArgs> getAccessControl() {
        return this.accessControl == null ? Input.empty() : this.accessControl;
    }

    /**
     * The Media Services account name.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The flag indicates if the resource should be automatically started on creation.
     * 
     */
    @InputImport(name="autoStart")
        private final @Nullable Input<Boolean> autoStart;

    public Input<Boolean> getAutoStart() {
        return this.autoStart == null ? Input.empty() : this.autoStart;
    }

    /**
     * This feature is deprecated, do not set a value for this property.
     * 
     */
    @InputImport(name="availabilitySetName")
        private final @Nullable Input<String> availabilitySetName;

    public Input<String> getAvailabilitySetName() {
        return this.availabilitySetName == null ? Input.empty() : this.availabilitySetName;
    }

    /**
     * The CDN enabled flag.
     * 
     */
    @InputImport(name="cdnEnabled")
        private final @Nullable Input<Boolean> cdnEnabled;

    public Input<Boolean> getCdnEnabled() {
        return this.cdnEnabled == null ? Input.empty() : this.cdnEnabled;
    }

    /**
     * The CDN profile name.
     * 
     */
    @InputImport(name="cdnProfile")
        private final @Nullable Input<String> cdnProfile;

    public Input<String> getCdnProfile() {
        return this.cdnProfile == null ? Input.empty() : this.cdnProfile;
    }

    /**
     * The CDN provider name.
     * 
     */
    @InputImport(name="cdnProvider")
        private final @Nullable Input<String> cdnProvider;

    public Input<String> getCdnProvider() {
        return this.cdnProvider == null ? Input.empty() : this.cdnProvider;
    }

    /**
     * The streaming endpoint access policies.
     * 
     */
    @InputImport(name="crossSiteAccessPolicies")
        private final @Nullable Input<CrossSiteAccessPoliciesArgs> crossSiteAccessPolicies;

    public Input<CrossSiteAccessPoliciesArgs> getCrossSiteAccessPolicies() {
        return this.crossSiteAccessPolicies == null ? Input.empty() : this.crossSiteAccessPolicies;
    }

    /**
     * The custom host names of the streaming endpoint
     * 
     */
    @InputImport(name="customHostNames")
        private final @Nullable Input<List<String>> customHostNames;

    public Input<List<String>> getCustomHostNames() {
        return this.customHostNames == null ? Input.empty() : this.customHostNames;
    }

    /**
     * The streaming endpoint description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Max cache age
     * 
     */
    @InputImport(name="maxCacheAge")
        private final @Nullable Input<Double> maxCacheAge;

    public Input<Double> getMaxCacheAge() {
        return this.maxCacheAge == null ? Input.empty() : this.maxCacheAge;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The number of scale units. Use the Scale operation to adjust this value.
     * 
     */
    @InputImport(name="scaleUnits", required=true)
        private final Input<Integer> scaleUnits;

    public Input<Integer> getScaleUnits() {
        return this.scaleUnits;
    }

    /**
     * The name of the streaming endpoint, maximum length is 24.
     * 
     */
    @InputImport(name="streamingEndpointName")
        private final @Nullable Input<String> streamingEndpointName;

    public Input<String> getStreamingEndpointName() {
        return this.streamingEndpointName == null ? Input.empty() : this.streamingEndpointName;
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

    public StreamingEndpointArgs(
        @Nullable Input<StreamingEndpointAccessControlArgs> accessControl,
        Input<String> accountName,
        @Nullable Input<Boolean> autoStart,
        @Nullable Input<String> availabilitySetName,
        @Nullable Input<Boolean> cdnEnabled,
        @Nullable Input<String> cdnProfile,
        @Nullable Input<String> cdnProvider,
        @Nullable Input<CrossSiteAccessPoliciesArgs> crossSiteAccessPolicies,
        @Nullable Input<List<String>> customHostNames,
        @Nullable Input<String> description,
        @Nullable Input<String> location,
        @Nullable Input<Double> maxCacheAge,
        Input<String> resourceGroupName,
        Input<Integer> scaleUnits,
        @Nullable Input<String> streamingEndpointName,
        @Nullable Input<Map<String,String>> tags) {
        this.accessControl = accessControl;
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.autoStart = autoStart;
        this.availabilitySetName = availabilitySetName;
        this.cdnEnabled = cdnEnabled;
        this.cdnProfile = cdnProfile;
        this.cdnProvider = cdnProvider;
        this.crossSiteAccessPolicies = crossSiteAccessPolicies;
        this.customHostNames = customHostNames;
        this.description = description;
        this.location = location;
        this.maxCacheAge = maxCacheAge;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scaleUnits = Objects.requireNonNull(scaleUnits, "expected parameter 'scaleUnits' to be non-null");
        this.streamingEndpointName = streamingEndpointName;
        this.tags = tags;
    }

    private StreamingEndpointArgs() {
        this.accessControl = Input.empty();
        this.accountName = Input.empty();
        this.autoStart = Input.empty();
        this.availabilitySetName = Input.empty();
        this.cdnEnabled = Input.empty();
        this.cdnProfile = Input.empty();
        this.cdnProvider = Input.empty();
        this.crossSiteAccessPolicies = Input.empty();
        this.customHostNames = Input.empty();
        this.description = Input.empty();
        this.location = Input.empty();
        this.maxCacheAge = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scaleUnits = Input.empty();
        this.streamingEndpointName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StreamingEndpointAccessControlArgs> accessControl;
        private Input<String> accountName;
        private @Nullable Input<Boolean> autoStart;
        private @Nullable Input<String> availabilitySetName;
        private @Nullable Input<Boolean> cdnEnabled;
        private @Nullable Input<String> cdnProfile;
        private @Nullable Input<String> cdnProvider;
        private @Nullable Input<CrossSiteAccessPoliciesArgs> crossSiteAccessPolicies;
        private @Nullable Input<List<String>> customHostNames;
        private @Nullable Input<String> description;
        private @Nullable Input<String> location;
        private @Nullable Input<Double> maxCacheAge;
        private Input<String> resourceGroupName;
        private Input<Integer> scaleUnits;
        private @Nullable Input<String> streamingEndpointName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.accountName = defaults.accountName;
    	      this.autoStart = defaults.autoStart;
    	      this.availabilitySetName = defaults.availabilitySetName;
    	      this.cdnEnabled = defaults.cdnEnabled;
    	      this.cdnProfile = defaults.cdnProfile;
    	      this.cdnProvider = defaults.cdnProvider;
    	      this.crossSiteAccessPolicies = defaults.crossSiteAccessPolicies;
    	      this.customHostNames = defaults.customHostNames;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.maxCacheAge = defaults.maxCacheAge;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scaleUnits = defaults.scaleUnits;
    	      this.streamingEndpointName = defaults.streamingEndpointName;
    	      this.tags = defaults.tags;
        }

        public Builder setAccessControl(@Nullable Input<StreamingEndpointAccessControlArgs> accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Builder setAccessControl(@Nullable StreamingEndpointAccessControlArgs accessControl) {
            this.accessControl = Input.ofNullable(accessControl);
            return this;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setAutoStart(@Nullable Input<Boolean> autoStart) {
            this.autoStart = autoStart;
            return this;
        }

        public Builder setAutoStart(@Nullable Boolean autoStart) {
            this.autoStart = Input.ofNullable(autoStart);
            return this;
        }

        public Builder setAvailabilitySetName(@Nullable Input<String> availabilitySetName) {
            this.availabilitySetName = availabilitySetName;
            return this;
        }

        public Builder setAvailabilitySetName(@Nullable String availabilitySetName) {
            this.availabilitySetName = Input.ofNullable(availabilitySetName);
            return this;
        }

        public Builder setCdnEnabled(@Nullable Input<Boolean> cdnEnabled) {
            this.cdnEnabled = cdnEnabled;
            return this;
        }

        public Builder setCdnEnabled(@Nullable Boolean cdnEnabled) {
            this.cdnEnabled = Input.ofNullable(cdnEnabled);
            return this;
        }

        public Builder setCdnProfile(@Nullable Input<String> cdnProfile) {
            this.cdnProfile = cdnProfile;
            return this;
        }

        public Builder setCdnProfile(@Nullable String cdnProfile) {
            this.cdnProfile = Input.ofNullable(cdnProfile);
            return this;
        }

        public Builder setCdnProvider(@Nullable Input<String> cdnProvider) {
            this.cdnProvider = cdnProvider;
            return this;
        }

        public Builder setCdnProvider(@Nullable String cdnProvider) {
            this.cdnProvider = Input.ofNullable(cdnProvider);
            return this;
        }

        public Builder setCrossSiteAccessPolicies(@Nullable Input<CrossSiteAccessPoliciesArgs> crossSiteAccessPolicies) {
            this.crossSiteAccessPolicies = crossSiteAccessPolicies;
            return this;
        }

        public Builder setCrossSiteAccessPolicies(@Nullable CrossSiteAccessPoliciesArgs crossSiteAccessPolicies) {
            this.crossSiteAccessPolicies = Input.ofNullable(crossSiteAccessPolicies);
            return this;
        }

        public Builder setCustomHostNames(@Nullable Input<List<String>> customHostNames) {
            this.customHostNames = customHostNames;
            return this;
        }

        public Builder setCustomHostNames(@Nullable List<String> customHostNames) {
            this.customHostNames = Input.ofNullable(customHostNames);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setMaxCacheAge(@Nullable Input<Double> maxCacheAge) {
            this.maxCacheAge = maxCacheAge;
            return this;
        }

        public Builder setMaxCacheAge(@Nullable Double maxCacheAge) {
            this.maxCacheAge = Input.ofNullable(maxCacheAge);
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

        public Builder setScaleUnits(Input<Integer> scaleUnits) {
            this.scaleUnits = Objects.requireNonNull(scaleUnits);
            return this;
        }

        public Builder setScaleUnits(Integer scaleUnits) {
            this.scaleUnits = Input.of(Objects.requireNonNull(scaleUnits));
            return this;
        }

        public Builder setStreamingEndpointName(@Nullable Input<String> streamingEndpointName) {
            this.streamingEndpointName = streamingEndpointName;
            return this;
        }

        public Builder setStreamingEndpointName(@Nullable String streamingEndpointName) {
            this.streamingEndpointName = Input.ofNullable(streamingEndpointName);
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
        public StreamingEndpointArgs build() {
            return new StreamingEndpointArgs(accessControl, accountName, autoStart, availabilitySetName, cdnEnabled, cdnProfile, cdnProvider, crossSiteAccessPolicies, customHostNames, description, location, maxCacheAge, resourceGroupName, scaleUnits, streamingEndpointName, tags);
        }
    }
}
