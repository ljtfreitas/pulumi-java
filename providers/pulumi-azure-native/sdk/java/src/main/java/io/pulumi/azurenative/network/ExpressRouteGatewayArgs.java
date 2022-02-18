// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs;
import io.pulumi.azurenative.network.inputs.VirtualHubIdArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExpressRouteGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteGatewayArgs Empty = new ExpressRouteGatewayArgs();

    /**
     * Configuration for auto scaling.
     * 
     */
    @InputImport(name="autoScaleConfiguration")
    private final @Nullable Input<ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs> autoScaleConfiguration;

    public Input<ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs> getAutoScaleConfiguration() {
        return this.autoScaleConfiguration == null ? Input.empty() : this.autoScaleConfiguration;
    }

    /**
     * The name of the ExpressRoute gateway.
     * 
     */
    @InputImport(name="expressRouteGatewayName")
    private final @Nullable Input<String> expressRouteGatewayName;

    public Input<String> getExpressRouteGatewayName() {
        return this.expressRouteGatewayName == null ? Input.empty() : this.expressRouteGatewayName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
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
     * The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     * 
     */
    @InputImport(name="virtualHub", required=true)
    private final Input<VirtualHubIdArgs> virtualHub;

    public Input<VirtualHubIdArgs> getVirtualHub() {
        return this.virtualHub;
    }

    public ExpressRouteGatewayArgs(
        @Nullable Input<ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs> autoScaleConfiguration,
        @Nullable Input<String> expressRouteGatewayName,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<VirtualHubIdArgs> virtualHub) {
        this.autoScaleConfiguration = autoScaleConfiguration;
        this.expressRouteGatewayName = expressRouteGatewayName;
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.virtualHub = Objects.requireNonNull(virtualHub, "expected parameter 'virtualHub' to be non-null");
    }

    private ExpressRouteGatewayArgs() {
        this.autoScaleConfiguration = Input.empty();
        this.expressRouteGatewayName = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.virtualHub = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs> autoScaleConfiguration;
        private @Nullable Input<String> expressRouteGatewayName;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<VirtualHubIdArgs> virtualHub;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScaleConfiguration = defaults.autoScaleConfiguration;
    	      this.expressRouteGatewayName = defaults.expressRouteGatewayName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualHub = defaults.virtualHub;
        }

        public Builder setAutoScaleConfiguration(@Nullable Input<ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs> autoScaleConfiguration) {
            this.autoScaleConfiguration = autoScaleConfiguration;
            return this;
        }

        public Builder setAutoScaleConfiguration(@Nullable ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs autoScaleConfiguration) {
            this.autoScaleConfiguration = Input.ofNullable(autoScaleConfiguration);
            return this;
        }

        public Builder setExpressRouteGatewayName(@Nullable Input<String> expressRouteGatewayName) {
            this.expressRouteGatewayName = expressRouteGatewayName;
            return this;
        }

        public Builder setExpressRouteGatewayName(@Nullable String expressRouteGatewayName) {
            this.expressRouteGatewayName = Input.ofNullable(expressRouteGatewayName);
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

        public Builder setVirtualHub(Input<VirtualHubIdArgs> virtualHub) {
            this.virtualHub = Objects.requireNonNull(virtualHub);
            return this;
        }

        public Builder setVirtualHub(VirtualHubIdArgs virtualHub) {
            this.virtualHub = Input.of(Objects.requireNonNull(virtualHub));
            return this;
        }

        public ExpressRouteGatewayArgs build() {
            return new ExpressRouteGatewayArgs(autoScaleConfiguration, expressRouteGatewayName, id, location, resourceGroupName, tags, virtualHub);
        }
    }
}
