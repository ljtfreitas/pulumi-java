// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.cache.enums.ReplicationRole;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkedServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedServerArgs Empty = new LinkedServerArgs();

    /**
     * Fully qualified resourceId of the linked redis cache.
     * 
     */
    @InputImport(name="linkedRedisCacheId", required=true)
        private final Input<String> linkedRedisCacheId;

    public Input<String> getLinkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }

    /**
     * Location of the linked redis cache.
     * 
     */
    @InputImport(name="linkedRedisCacheLocation", required=true)
        private final Input<String> linkedRedisCacheLocation;

    public Input<String> getLinkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }

    /**
     * The name of the linked server that is being added to the Redis cache.
     * 
     */
    @InputImport(name="linkedServerName")
        private final @Nullable Input<String> linkedServerName;

    public Input<String> getLinkedServerName() {
        return this.linkedServerName == null ? Input.empty() : this.linkedServerName;
    }

    /**
     * The name of the Redis cache.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
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
     * Role of the linked server.
     * 
     */
    @InputImport(name="serverRole", required=true)
        private final Input<ReplicationRole> serverRole;

    public Input<ReplicationRole> getServerRole() {
        return this.serverRole;
    }

    public LinkedServerArgs(
        Input<String> linkedRedisCacheId,
        Input<String> linkedRedisCacheLocation,
        @Nullable Input<String> linkedServerName,
        Input<String> name,
        Input<String> resourceGroupName,
        Input<ReplicationRole> serverRole) {
        this.linkedRedisCacheId = Objects.requireNonNull(linkedRedisCacheId, "expected parameter 'linkedRedisCacheId' to be non-null");
        this.linkedRedisCacheLocation = Objects.requireNonNull(linkedRedisCacheLocation, "expected parameter 'linkedRedisCacheLocation' to be non-null");
        this.linkedServerName = linkedServerName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverRole = Objects.requireNonNull(serverRole, "expected parameter 'serverRole' to be non-null");
    }

    private LinkedServerArgs() {
        this.linkedRedisCacheId = Input.empty();
        this.linkedRedisCacheLocation = Input.empty();
        this.linkedServerName = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverRole = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> linkedRedisCacheId;
        private Input<String> linkedRedisCacheLocation;
        private @Nullable Input<String> linkedServerName;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private Input<ReplicationRole> serverRole;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedRedisCacheId = defaults.linkedRedisCacheId;
    	      this.linkedRedisCacheLocation = defaults.linkedRedisCacheLocation;
    	      this.linkedServerName = defaults.linkedServerName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverRole = defaults.serverRole;
        }

        public Builder setLinkedRedisCacheId(Input<String> linkedRedisCacheId) {
            this.linkedRedisCacheId = Objects.requireNonNull(linkedRedisCacheId);
            return this;
        }

        public Builder setLinkedRedisCacheId(String linkedRedisCacheId) {
            this.linkedRedisCacheId = Input.of(Objects.requireNonNull(linkedRedisCacheId));
            return this;
        }

        public Builder setLinkedRedisCacheLocation(Input<String> linkedRedisCacheLocation) {
            this.linkedRedisCacheLocation = Objects.requireNonNull(linkedRedisCacheLocation);
            return this;
        }

        public Builder setLinkedRedisCacheLocation(String linkedRedisCacheLocation) {
            this.linkedRedisCacheLocation = Input.of(Objects.requireNonNull(linkedRedisCacheLocation));
            return this;
        }

        public Builder setLinkedServerName(@Nullable Input<String> linkedServerName) {
            this.linkedServerName = linkedServerName;
            return this;
        }

        public Builder setLinkedServerName(@Nullable String linkedServerName) {
            this.linkedServerName = Input.ofNullable(linkedServerName);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerRole(Input<ReplicationRole> serverRole) {
            this.serverRole = Objects.requireNonNull(serverRole);
            return this;
        }

        public Builder setServerRole(ReplicationRole serverRole) {
            this.serverRole = Input.of(Objects.requireNonNull(serverRole));
            return this;
        }
        public LinkedServerArgs build() {
            return new LinkedServerArgs(linkedRedisCacheId, linkedRedisCacheLocation, linkedServerName, name, resourceGroupName, serverRole);
        }
    }
}
