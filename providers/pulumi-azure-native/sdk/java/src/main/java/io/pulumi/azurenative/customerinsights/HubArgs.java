// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.customerinsights.inputs.HubBillingInfoFormatArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubArgs Empty = new HubArgs();

    /**
     * Billing settings of the hub.
     * 
     */
    @InputImport(name="hubBillingInfo")
    private final @Nullable Input<HubBillingInfoFormatArgs> hubBillingInfo;

    public Input<HubBillingInfoFormatArgs> getHubBillingInfo() {
        return this.hubBillingInfo == null ? Input.empty() : this.hubBillingInfo;
    }

    /**
     * The name of the Hub.
     * 
     */
    @InputImport(name="hubName")
    private final @Nullable Input<String> hubName;

    public Input<String> getHubName() {
        return this.hubName == null ? Input.empty() : this.hubName;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group.
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
     * The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     * 
     */
    @InputImport(name="tenantFeatures")
    private final @Nullable Input<Integer> tenantFeatures;

    public Input<Integer> getTenantFeatures() {
        return this.tenantFeatures == null ? Input.empty() : this.tenantFeatures;
    }

    public HubArgs(
        @Nullable Input<HubBillingInfoFormatArgs> hubBillingInfo,
        @Nullable Input<String> hubName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Integer> tenantFeatures) {
        this.hubBillingInfo = hubBillingInfo;
        this.hubName = hubName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.tenantFeatures = tenantFeatures;
    }

    private HubArgs() {
        this.hubBillingInfo = Input.empty();
        this.hubName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.tenantFeatures = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HubBillingInfoFormatArgs> hubBillingInfo;
        private @Nullable Input<String> hubName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Integer> tenantFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(HubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubBillingInfo = defaults.hubBillingInfo;
    	      this.hubName = defaults.hubName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.tenantFeatures = defaults.tenantFeatures;
        }

        public Builder setHubBillingInfo(@Nullable Input<HubBillingInfoFormatArgs> hubBillingInfo) {
            this.hubBillingInfo = hubBillingInfo;
            return this;
        }

        public Builder setHubBillingInfo(@Nullable HubBillingInfoFormatArgs hubBillingInfo) {
            this.hubBillingInfo = Input.ofNullable(hubBillingInfo);
            return this;
        }

        public Builder setHubName(@Nullable Input<String> hubName) {
            this.hubName = hubName;
            return this;
        }

        public Builder setHubName(@Nullable String hubName) {
            this.hubName = Input.ofNullable(hubName);
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

        public Builder setTenantFeatures(@Nullable Input<Integer> tenantFeatures) {
            this.tenantFeatures = tenantFeatures;
            return this;
        }

        public Builder setTenantFeatures(@Nullable Integer tenantFeatures) {
            this.tenantFeatures = Input.ofNullable(tenantFeatures);
            return this;
        }

        public HubArgs build() {
            return new HubArgs(hubBillingInfo, hubName, location, resourceGroupName, tags, tenantFeatures);
        }
    }
}
