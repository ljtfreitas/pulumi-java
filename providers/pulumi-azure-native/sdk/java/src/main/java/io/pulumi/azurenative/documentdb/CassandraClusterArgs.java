// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.ClusterResourcePropertiesArgs;
import io.pulumi.azurenative.documentdb.inputs.ManagedServiceIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CassandraClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraClusterArgs Empty = new CassandraClusterArgs();

    /**
     * Managed Cassandra cluster name.
     * 
     */
    @InputImport(name="clusterName")
        private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * Identity for the resource.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Properties of a managed Cassandra cluster.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<ClusterResourcePropertiesArgs> properties;

    public Input<ClusterResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
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
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CassandraClusterArgs(
        @Nullable Input<String> clusterName,
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<ClusterResourcePropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.clusterName = clusterName;
        this.identity = identity;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private CassandraClusterArgs() {
        this.clusterName = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterName;
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<ClusterResourcePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
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

        public Builder setProperties(@Nullable Input<ClusterResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ClusterResourcePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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
        public CassandraClusterArgs build() {
            return new CassandraClusterArgs(clusterName, identity, location, properties, resourceGroupName, tags);
        }
    }
}
