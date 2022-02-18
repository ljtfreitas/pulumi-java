// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork;

import io.pulumi.azurenative.managednetwork.inputs.ScopeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedNetworkArgs Empty = new ManagedNetworkArgs();

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
     * The name of the Managed Network.
     * 
     */
    @InputImport(name="managedNetworkName")
    private final @Nullable Input<String> managedNetworkName;

    public Input<String> getManagedNetworkName() {
        return this.managedNetworkName == null ? Input.empty() : this.managedNetworkName;
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
     * The collection of management groups, subscriptions, virtual networks, and subnets by the Managed Network. This is a read-only property that is reflective of all ScopeAssignments for this Managed Network
     * 
     */
    @InputImport(name="scope")
    private final @Nullable Input<ScopeArgs> scope;

    public Input<ScopeArgs> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ManagedNetworkArgs(
        @Nullable Input<String> location,
        @Nullable Input<String> managedNetworkName,
        Input<String> resourceGroupName,
        @Nullable Input<ScopeArgs> scope,
        @Nullable Input<Map<String,String>> tags) {
        this.location = location;
        this.managedNetworkName = managedNetworkName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = scope;
        this.tags = tags;
    }

    private ManagedNetworkArgs() {
        this.location = Input.empty();
        this.managedNetworkName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scope = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedNetworkName;
        private Input<String> resourceGroupName;
        private @Nullable Input<ScopeArgs> scope;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.managedNetworkName = defaults.managedNetworkName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedNetworkName(@Nullable Input<String> managedNetworkName) {
            this.managedNetworkName = managedNetworkName;
            return this;
        }

        public Builder setManagedNetworkName(@Nullable String managedNetworkName) {
            this.managedNetworkName = Input.ofNullable(managedNetworkName);
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

        public Builder setScope(@Nullable Input<ScopeArgs> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable ScopeArgs scope) {
            this.scope = Input.ofNullable(scope);
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

        public ManagedNetworkArgs build() {
            return new ManagedNetworkArgs(location, managedNetworkName, resourceGroupName, scope, tags);
        }
    }
}
