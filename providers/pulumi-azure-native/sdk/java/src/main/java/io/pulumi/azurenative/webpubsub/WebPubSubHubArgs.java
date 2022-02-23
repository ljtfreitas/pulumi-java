// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub;

import io.pulumi.azurenative.webpubsub.inputs.WebPubSubHubPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebPubSubHubArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebPubSubHubArgs Empty = new WebPubSubHubArgs();

    /**
     * The hub name.
     * 
     */
    @InputImport(name="hubName")
        private final @Nullable Input<String> hubName;

    public Input<String> getHubName() {
        return this.hubName == null ? Input.empty() : this.hubName;
    }

    /**
     * Properties of a hub.
     * 
     */
    @InputImport(name="properties", required=true)
        private final Input<WebPubSubHubPropertiesArgs> properties;

    public Input<WebPubSubHubPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
        private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    public WebPubSubHubArgs(
        @Nullable Input<String> hubName,
        Input<WebPubSubHubPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> resourceName) {
        this.hubName = hubName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private WebPubSubHubArgs() {
        this.hubName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hubName;
        private Input<WebPubSubHubPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubName = defaults.hubName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setHubName(@Nullable Input<String> hubName) {
            this.hubName = hubName;
            return this;
        }

        public Builder setHubName(@Nullable String hubName) {
            this.hubName = Input.ofNullable(hubName);
            return this;
        }

        public Builder setProperties(Input<WebPubSubHubPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(WebPubSubHubPropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
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

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public WebPubSubHubArgs build() {
            return new WebPubSubHubArgs(hubName, properties, resourceGroupName, resourceName);
        }
    }
}
