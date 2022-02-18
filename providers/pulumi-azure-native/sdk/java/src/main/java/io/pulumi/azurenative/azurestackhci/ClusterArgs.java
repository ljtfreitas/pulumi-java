// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci;

import io.pulumi.azurenative.azurestackhci.enums.CreatedByType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * App id of cluster AAD identity.
     * 
     */
    @InputImport(name="aadClientId", required=true)
    private final Input<String> aadClientId;

    public Input<String> getAadClientId() {
        return this.aadClientId;
    }

    /**
     * Tenant id of cluster AAD identity.
     * 
     */
    @InputImport(name="aadTenantId", required=true)
    private final Input<String> aadTenantId;

    public Input<String> getAadTenantId() {
        return this.aadTenantId;
    }

    /**
     * The name of the cluster.
     * 
     */
    @InputImport(name="clusterName")
    private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @InputImport(name="createdAt")
    private final @Nullable Input<String> createdAt;

    public Input<String> getCreatedAt() {
        return this.createdAt == null ? Input.empty() : this.createdAt;
    }

    /**
     * The identity that created the resource.
     * 
     */
    @InputImport(name="createdBy")
    private final @Nullable Input<String> createdBy;

    public Input<String> getCreatedBy() {
        return this.createdBy == null ? Input.empty() : this.createdBy;
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @InputImport(name="createdByType")
    private final @Nullable Input<Either<String,CreatedByType>> createdByType;

    public Input<Either<String,CreatedByType>> getCreatedByType() {
        return this.createdByType == null ? Input.empty() : this.createdByType;
    }

    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @InputImport(name="lastModifiedAt")
    private final @Nullable Input<String> lastModifiedAt;

    public Input<String> getLastModifiedAt() {
        return this.lastModifiedAt == null ? Input.empty() : this.lastModifiedAt;
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @InputImport(name="lastModifiedBy")
    private final @Nullable Input<String> lastModifiedBy;

    public Input<String> getLastModifiedBy() {
        return this.lastModifiedBy == null ? Input.empty() : this.lastModifiedBy;
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @InputImport(name="lastModifiedByType")
    private final @Nullable Input<Either<String,CreatedByType>> lastModifiedByType;

    public Input<Either<String,CreatedByType>> getLastModifiedByType() {
        return this.lastModifiedByType == null ? Input.empty() : this.lastModifiedByType;
    }

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
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ClusterArgs(
        Input<String> aadClientId,
        Input<String> aadTenantId,
        @Nullable Input<String> clusterName,
        @Nullable Input<String> createdAt,
        @Nullable Input<String> createdBy,
        @Nullable Input<Either<String,CreatedByType>> createdByType,
        @Nullable Input<String> lastModifiedAt,
        @Nullable Input<String> lastModifiedBy,
        @Nullable Input<Either<String,CreatedByType>> lastModifiedByType,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.aadClientId = Objects.requireNonNull(aadClientId, "expected parameter 'aadClientId' to be non-null");
        this.aadTenantId = Objects.requireNonNull(aadTenantId, "expected parameter 'aadTenantId' to be non-null");
        this.clusterName = clusterName;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ClusterArgs() {
        this.aadClientId = Input.empty();
        this.aadTenantId = Input.empty();
        this.clusterName = Input.empty();
        this.createdAt = Input.empty();
        this.createdBy = Input.empty();
        this.createdByType = Input.empty();
        this.lastModifiedAt = Input.empty();
        this.lastModifiedBy = Input.empty();
        this.lastModifiedByType = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> aadClientId;
        private Input<String> aadTenantId;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<String> createdAt;
        private @Nullable Input<String> createdBy;
        private @Nullable Input<Either<String,CreatedByType>> createdByType;
        private @Nullable Input<String> lastModifiedAt;
        private @Nullable Input<String> lastModifiedBy;
        private @Nullable Input<Either<String,CreatedByType>> lastModifiedByType;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.clusterName = defaults.clusterName;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAadClientId(Input<String> aadClientId) {
            this.aadClientId = Objects.requireNonNull(aadClientId);
            return this;
        }

        public Builder setAadClientId(String aadClientId) {
            this.aadClientId = Input.of(Objects.requireNonNull(aadClientId));
            return this;
        }

        public Builder setAadTenantId(Input<String> aadTenantId) {
            this.aadTenantId = Objects.requireNonNull(aadTenantId);
            return this;
        }

        public Builder setAadTenantId(String aadTenantId) {
            this.aadTenantId = Input.of(Objects.requireNonNull(aadTenantId));
            return this;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setCreatedAt(@Nullable Input<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = Input.ofNullable(createdAt);
            return this;
        }

        public Builder setCreatedBy(@Nullable Input<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedBy(@Nullable String createdBy) {
            this.createdBy = Input.ofNullable(createdBy);
            return this;
        }

        public Builder setCreatedByType(@Nullable Input<Either<String,CreatedByType>> createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder setCreatedByType(@Nullable Either<String,CreatedByType> createdByType) {
            this.createdByType = Input.ofNullable(createdByType);
            return this;
        }

        public Builder setLastModifiedAt(@Nullable Input<String> lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder setLastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = Input.ofNullable(lastModifiedAt);
            return this;
        }

        public Builder setLastModifiedBy(@Nullable Input<String> lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = Input.ofNullable(lastModifiedBy);
            return this;
        }

        public Builder setLastModifiedByType(@Nullable Input<Either<String,CreatedByType>> lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder setLastModifiedByType(@Nullable Either<String,CreatedByType> lastModifiedByType) {
            this.lastModifiedByType = Input.ofNullable(lastModifiedByType);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ClusterArgs build() {
            return new ClusterArgs(aadClientId, aadTenantId, clusterName, createdAt, createdBy, createdByType, lastModifiedAt, lastModifiedBy, lastModifiedByType, location, resourceGroupName, tags);
        }
    }
}
