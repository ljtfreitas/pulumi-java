// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.CassandraViewResourceArgs;
import io.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import io.pulumi.azurenative.documentdb.inputs.ManagedServiceIdentityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CassandraResourceCassandraViewArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraResourceCassandraViewArgs Empty = new CassandraResourceCassandraViewArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Identity for the resource.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Cosmos DB keyspace name.
     * 
     */
    @Import(name="keyspaceName", required=true)
      private final Output<String> keyspaceName;

    public Output<String> getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<CreateUpdateOptionsArgs> options;

    public Output<CreateUpdateOptionsArgs> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * The standard JSON format of a Cassandra view
     * 
     */
    @Import(name="resource", required=true)
      private final Output<CassandraViewResourceArgs> resource;

    public Output<CassandraViewResourceArgs> getResource() {
        return this.resource;
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
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Cosmos DB view name.
     * 
     */
    @Import(name="viewName")
      private final @Nullable Output<String> viewName;

    public Output<String> getViewName() {
        return this.viewName == null ? Output.empty() : this.viewName;
    }

    public CassandraResourceCassandraViewArgs(
        Output<String> accountName,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        Output<String> keyspaceName,
        @Nullable Output<String> location,
        @Nullable Output<CreateUpdateOptionsArgs> options,
        Output<CassandraViewResourceArgs> resource,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> viewName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.identity = identity;
        this.keyspaceName = Objects.requireNonNull(keyspaceName, "expected parameter 'keyspaceName' to be non-null");
        this.location = location;
        this.options = options;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.viewName = viewName;
    }

    private CassandraResourceCassandraViewArgs() {
        this.accountName = Output.empty();
        this.identity = Output.empty();
        this.keyspaceName = Output.empty();
        this.location = Output.empty();
        this.options = Output.empty();
        this.resource = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.viewName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraResourceCassandraViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private Output<String> keyspaceName;
        private @Nullable Output<String> location;
        private @Nullable Output<CreateUpdateOptionsArgs> options;
        private Output<CassandraViewResourceArgs> resource;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> viewName;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraResourceCassandraViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.identity = defaults.identity;
    	      this.keyspaceName = defaults.keyspaceName;
    	      this.location = defaults.location;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.viewName = defaults.viewName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }

        public Builder keyspaceName(Output<String> keyspaceName) {
            this.keyspaceName = Objects.requireNonNull(keyspaceName);
            return this;
        }

        public Builder keyspaceName(String keyspaceName) {
            this.keyspaceName = Output.of(Objects.requireNonNull(keyspaceName));
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

        public Builder options(@Nullable Output<CreateUpdateOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder options(@Nullable CreateUpdateOptionsArgs options) {
            this.options = Output.ofNullable(options);
            return this;
        }

        public Builder resource(Output<CassandraViewResourceArgs> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder resource(CassandraViewResourceArgs resource) {
            this.resource = Output.of(Objects.requireNonNull(resource));
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder viewName(@Nullable Output<String> viewName) {
            this.viewName = viewName;
            return this;
        }

        public Builder viewName(@Nullable String viewName) {
            this.viewName = Output.ofNullable(viewName);
            return this;
        }
        public CassandraResourceCassandraViewArgs build() {
            return new CassandraResourceCassandraViewArgs(accountName, identity, keyspaceName, location, options, resource, resourceGroupName, tags, viewName);
        }
    }
}
