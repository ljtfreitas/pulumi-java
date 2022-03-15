// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.dbforpostgresql.inputs.ResourceIdentityArgs;
import io.pulumi.azurenative.dbforpostgresql.inputs.ServerPropertiesForDefaultCreateArgs;
import io.pulumi.azurenative.dbforpostgresql.inputs.ServerPropertiesForGeoRestoreArgs;
import io.pulumi.azurenative.dbforpostgresql.inputs.ServerPropertiesForReplicaArgs;
import io.pulumi.azurenative.dbforpostgresql.inputs.ServerPropertiesForRestoreArgs;
import io.pulumi.azurenative.dbforpostgresql.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ResourceIdentityArgs> identity;

    public Output<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * The location the resource resides in.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Properties of the server.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<Object> properties;

    public Output<Object> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName")
      private final @Nullable Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName == null ? Output.empty() : this.serverName;
    }

    /**
     * The SKU (pricing tier) of the server.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Application-specific metadata in the form of key-value pairs.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ServerArgs(
        @Nullable Output<ResourceIdentityArgs> identity,
        @Nullable Output<String> location,
        Output<Object> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> serverName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.identity = identity;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = serverName;
        this.sku = sku;
        this.tags = tags;
    }

    private ServerArgs() {
        this.identity = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serverName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceIdentityArgs> identity;
        private @Nullable Output<String> location;
        private Output<Object> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serverName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder properties(Output<Object> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(Object properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serverName(@Nullable Output<String> serverName) {
            this.serverName = serverName;
            return this;
        }

        public Builder serverName(@Nullable String serverName) {
            this.serverName = Output.ofNullable(serverName);
            return this;
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public ServerArgs build() {
            return new ServerArgs(identity, location, properties, resourceGroupName, serverName, sku, tags);
        }
    }
}
