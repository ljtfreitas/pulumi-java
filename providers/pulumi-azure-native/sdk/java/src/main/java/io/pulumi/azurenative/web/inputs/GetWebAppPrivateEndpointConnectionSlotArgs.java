// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppPrivateEndpointConnectionSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppPrivateEndpointConnectionSlotArgs Empty = new GetWebAppPrivateEndpointConnectionSlotArgs();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="privateEndpointConnectionName", required=true)
    private final String privateEndpointConnectionName;

    public String getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="slot", required=true)
    private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public GetWebAppPrivateEndpointConnectionSlotArgs(
        String name,
        String privateEndpointConnectionName,
        String resourceGroupName,
        String slot) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private GetWebAppPrivateEndpointConnectionSlotArgs() {
        this.name = null;
        this.privateEndpointConnectionName = null;
        this.resourceGroupName = null;
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPrivateEndpointConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String privateEndpointConnectionName;
        private String resourceGroupName;
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppPrivateEndpointConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnectionName(String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public GetWebAppPrivateEndpointConnectionSlotArgs build() {
            return new GetWebAppPrivateEndpointConnectionSlotArgs(name, privateEndpointConnectionName, resourceGroupName, slot);
        }
    }
}