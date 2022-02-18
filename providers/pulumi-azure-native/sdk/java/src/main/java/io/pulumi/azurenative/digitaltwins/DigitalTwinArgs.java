// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins;

import io.pulumi.azurenative.digitaltwins.enums.PublicNetworkAccess;
import io.pulumi.azurenative.digitaltwins.inputs.DigitalTwinsIdentityArgs;
import io.pulumi.azurenative.digitaltwins.inputs.PrivateEndpointConnectionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DigitalTwinArgs extends io.pulumi.resources.ResourceArgs {

    public static final DigitalTwinArgs Empty = new DigitalTwinArgs();

    /**
     * The managed identity for the DigitalTwinsInstance.
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<DigitalTwinsIdentityArgs> identity;

    public Input<DigitalTwinsIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="privateEndpointConnections")
    private final @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    public Input<List<PrivateEndpointConnectionArgs>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? Input.empty() : this.privateEndpointConnections;
    }

    /**
     * Public network access for the DigitalTwinsInstance.
     * 
     */
    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group that contains the DigitalTwinsInstance.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the DigitalTwinsInstance.
     * 
     */
    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
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

    public DigitalTwinArgs(
        @Nullable Input<DigitalTwinsIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<Map<String,String>> tags) {
        this.identity = identity;
        this.location = location;
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
    }

    private DigitalTwinArgs() {
        this.identity = Input.empty();
        this.location = Input.empty();
        this.privateEndpointConnections = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DigitalTwinArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DigitalTwinsIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DigitalTwinArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
        }

        public Builder setIdentity(@Nullable Input<DigitalTwinsIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable DigitalTwinsIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
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

        public Builder setPrivateEndpointConnections(@Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            this.privateEndpointConnections = Input.ofNullable(privateEndpointConnections);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public DigitalTwinArgs build() {
            return new DigitalTwinArgs(identity, location, privateEndpointConnections, publicNetworkAccess, resourceGroupName, resourceName, tags);
        }
    }
}
