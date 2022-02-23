// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.PrivateLinkConnectionStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppPrivateEndpointConnectionSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppPrivateEndpointConnectionSlotArgs Empty = new WebAppPrivateEndpointConnectionSlotArgs();

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the site.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="privateEndpointConnectionName")
        private final @Nullable Input<String> privateEndpointConnectionName;

    public Input<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Input.empty() : this.privateEndpointConnectionName;
    }

    /**
     * The state of a private link connection
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
        private final @Nullable Input<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="slot", required=true)
        private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    public WebAppPrivateEndpointConnectionSlotArgs(
        @Nullable Input<String> kind,
        Input<String> name,
        @Nullable Input<String> privateEndpointConnectionName,
        @Nullable Input<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState,
        Input<String> resourceGroupName,
        Input<String> slot) {
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private WebAppPrivateEndpointConnectionSlotArgs() {
        this.kind = Input.empty();
        this.name = Input.empty();
        this.privateEndpointConnectionName = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.slot = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppPrivateEndpointConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private Input<String> name;
        private @Nullable Input<String> privateEndpointConnectionName;
        private @Nullable Input<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState;
        private Input<String> resourceGroupName;
        private Input<String> slot;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppPrivateEndpointConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable Input<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Input.ofNullable(privateEndpointConnectionName);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
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

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }
        public WebAppPrivateEndpointConnectionSlotArgs build() {
            return new WebAppPrivateEndpointConnectionSlotArgs(kind, name, privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName, slot);
        }
    }
}
