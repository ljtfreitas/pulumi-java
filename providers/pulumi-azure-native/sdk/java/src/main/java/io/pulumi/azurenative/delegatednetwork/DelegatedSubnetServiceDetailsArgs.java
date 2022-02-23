// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.delegatednetwork.inputs.ControllerDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.inputs.SubnetDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DelegatedSubnetServiceDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelegatedSubnetServiceDetailsArgs Empty = new DelegatedSubnetServiceDetailsArgs();

    /**
     * Properties of the controller.
     * 
     */
    @InputImport(name="controllerDetails")
        private final @Nullable Input<ControllerDetailsArgs> controllerDetails;

    public Input<ControllerDetailsArgs> getControllerDetails() {
        return this.controllerDetails == null ? Input.empty() : this.controllerDetails;
    }

    /**
     * Location of the resource.
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
     * The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @InputImport(name="resourceName")
        private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * subnet details
     * 
     */
    @InputImport(name="subnetDetails")
        private final @Nullable Input<SubnetDetailsArgs> subnetDetails;

    public Input<SubnetDetailsArgs> getSubnetDetails() {
        return this.subnetDetails == null ? Input.empty() : this.subnetDetails;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DelegatedSubnetServiceDetailsArgs(
        @Nullable Input<ControllerDetailsArgs> controllerDetails,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<SubnetDetailsArgs> subnetDetails,
        @Nullable Input<Map<String,String>> tags) {
        this.controllerDetails = controllerDetails;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.subnetDetails = subnetDetails;
        this.tags = tags;
    }

    private DelegatedSubnetServiceDetailsArgs() {
        this.controllerDetails = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.subnetDetails = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelegatedSubnetServiceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ControllerDetailsArgs> controllerDetails;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<SubnetDetailsArgs> subnetDetails;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DelegatedSubnetServiceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controllerDetails = defaults.controllerDetails;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.subnetDetails = defaults.subnetDetails;
    	      this.tags = defaults.tags;
        }

        public Builder setControllerDetails(@Nullable Input<ControllerDetailsArgs> controllerDetails) {
            this.controllerDetails = controllerDetails;
            return this;
        }

        public Builder setControllerDetails(@Nullable ControllerDetailsArgs controllerDetails) {
            this.controllerDetails = Input.ofNullable(controllerDetails);
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setSubnetDetails(@Nullable Input<SubnetDetailsArgs> subnetDetails) {
            this.subnetDetails = subnetDetails;
            return this;
        }

        public Builder setSubnetDetails(@Nullable SubnetDetailsArgs subnetDetails) {
            this.subnetDetails = Input.ofNullable(subnetDetails);
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
        public DelegatedSubnetServiceDetailsArgs build() {
            return new DelegatedSubnetServiceDetailsArgs(controllerDetails, location, resourceGroupName, resourceName, subnetDetails, tags);
        }
    }
}
