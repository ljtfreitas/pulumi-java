// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

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
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service resource.
     * 
     */
    @InputImport(name="serviceName")
    private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    /**
     * The name of the service topology .
     * 
     */
    @InputImport(name="serviceTopologyName", required=true)
    private final Input<String> serviceTopologyName;

    public Input<String> getServiceTopologyName() {
        return this.serviceTopologyName;
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
     * The Azure location to which the resources in the service belong to or should be deployed to.
     * 
     */
    @InputImport(name="targetLocation", required=true)
    private final Input<String> targetLocation;

    public Input<String> getTargetLocation() {
        return this.targetLocation;
    }

    /**
     * The subscription to which the resources in the service belong to or should be deployed to.
     * 
     */
    @InputImport(name="targetSubscriptionId", required=true)
    private final Input<String> targetSubscriptionId;

    public Input<String> getTargetSubscriptionId() {
        return this.targetSubscriptionId;
    }

    public ServiceArgs(
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> serviceName,
        Input<String> serviceTopologyName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> targetLocation,
        Input<String> targetSubscriptionId) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = serviceName;
        this.serviceTopologyName = Objects.requireNonNull(serviceTopologyName, "expected parameter 'serviceTopologyName' to be non-null");
        this.tags = tags;
        this.targetLocation = Objects.requireNonNull(targetLocation, "expected parameter 'targetLocation' to be non-null");
        this.targetSubscriptionId = Objects.requireNonNull(targetSubscriptionId, "expected parameter 'targetSubscriptionId' to be non-null");
    }

    private ServiceArgs() {
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.serviceTopologyName = Input.empty();
        this.tags = Input.empty();
        this.targetLocation = Input.empty();
        this.targetSubscriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> serviceName;
        private Input<String> serviceTopologyName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> targetLocation;
        private Input<String> targetSubscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceTopologyName = defaults.serviceTopologyName;
    	      this.tags = defaults.tags;
    	      this.targetLocation = defaults.targetLocation;
    	      this.targetSubscriptionId = defaults.targetSubscriptionId;
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

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public Builder setServiceTopologyName(Input<String> serviceTopologyName) {
            this.serviceTopologyName = Objects.requireNonNull(serviceTopologyName);
            return this;
        }

        public Builder setServiceTopologyName(String serviceTopologyName) {
            this.serviceTopologyName = Input.of(Objects.requireNonNull(serviceTopologyName));
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

        public Builder setTargetLocation(Input<String> targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }

        public Builder setTargetLocation(String targetLocation) {
            this.targetLocation = Input.of(Objects.requireNonNull(targetLocation));
            return this;
        }

        public Builder setTargetSubscriptionId(Input<String> targetSubscriptionId) {
            this.targetSubscriptionId = Objects.requireNonNull(targetSubscriptionId);
            return this;
        }

        public Builder setTargetSubscriptionId(String targetSubscriptionId) {
            this.targetSubscriptionId = Input.of(Objects.requireNonNull(targetSubscriptionId));
            return this;
        }

        public ServiceArgs build() {
            return new ServiceArgs(location, resourceGroupName, serviceName, serviceTopologyName, tags, targetLocation, targetSubscriptionId);
        }
    }
}
