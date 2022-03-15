// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache;

import io.pulumi.azurenative.storagecache.enums.ProvisioningStateType;
import io.pulumi.azurenative.storagecache.enums.StorageTargetType;
import io.pulumi.azurenative.storagecache.inputs.BlobNfsTargetArgs;
import io.pulumi.azurenative.storagecache.inputs.ClfsTargetArgs;
import io.pulumi.azurenative.storagecache.inputs.NamespaceJunctionArgs;
import io.pulumi.azurenative.storagecache.inputs.Nfs3TargetArgs;
import io.pulumi.azurenative.storagecache.inputs.UnknownTargetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageTargetArgs Empty = new StorageTargetArgs();

    /**
     * Properties when targetType is blobNfs.
     * 
     */
    @Import(name="blobNfs")
      private final @Nullable Output<BlobNfsTargetArgs> blobNfs;

    public Output<BlobNfsTargetArgs> getBlobNfs() {
        return this.blobNfs == null ? Output.empty() : this.blobNfs;
    }

    /**
     * Name of Cache. Length of name must not be greater than 80 and chars must be from the [-0-9a-zA-Z_] char class.
     * 
     */
    @Import(name="cacheName", required=true)
      private final Output<String> cacheName;

    public Output<String> getCacheName() {
        return this.cacheName;
    }

    /**
     * Properties when targetType is clfs.
     * 
     */
    @Import(name="clfs")
      private final @Nullable Output<ClfsTargetArgs> clfs;

    public Output<ClfsTargetArgs> getClfs() {
        return this.clfs == null ? Output.empty() : this.clfs;
    }

    /**
     * List of Cache namespace junctions to target for namespace associations.
     * 
     */
    @Import(name="junctions")
      private final @Nullable Output<List<NamespaceJunctionArgs>> junctions;

    public Output<List<NamespaceJunctionArgs>> getJunctions() {
        return this.junctions == null ? Output.empty() : this.junctions;
    }

    /**
     * Properties when targetType is nfs3.
     * 
     */
    @Import(name="nfs3")
      private final @Nullable Output<Nfs3TargetArgs> nfs3;

    public Output<Nfs3TargetArgs> getNfs3() {
        return this.nfs3 == null ? Output.empty() : this.nfs3;
    }

    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,ProvisioningStateType>> provisioningState;

    public Output<Either<String,ProvisioningStateType>> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * Target resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Storage Target.
     * 
     */
    @Import(name="storageTargetName")
      private final @Nullable Output<String> storageTargetName;

    public Output<String> getStorageTargetName() {
        return this.storageTargetName == null ? Output.empty() : this.storageTargetName;
    }

    /**
     * Type of the Storage Target.
     * 
     */
    @Import(name="targetType", required=true)
      private final Output<Either<String,StorageTargetType>> targetType;

    public Output<Either<String,StorageTargetType>> getTargetType() {
        return this.targetType;
    }

    /**
     * Properties when targetType is unknown.
     * 
     */
    @Import(name="unknown")
      private final @Nullable Output<UnknownTargetArgs> unknown;

    public Output<UnknownTargetArgs> getUnknown() {
        return this.unknown == null ? Output.empty() : this.unknown;
    }

    public StorageTargetArgs(
        @Nullable Output<BlobNfsTargetArgs> blobNfs,
        Output<String> cacheName,
        @Nullable Output<ClfsTargetArgs> clfs,
        @Nullable Output<List<NamespaceJunctionArgs>> junctions,
        @Nullable Output<Nfs3TargetArgs> nfs3,
        @Nullable Output<Either<String,ProvisioningStateType>> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<String> storageTargetName,
        Output<Either<String,StorageTargetType>> targetType,
        @Nullable Output<UnknownTargetArgs> unknown) {
        this.blobNfs = blobNfs;
        this.cacheName = Objects.requireNonNull(cacheName, "expected parameter 'cacheName' to be non-null");
        this.clfs = clfs;
        this.junctions = junctions;
        this.nfs3 = nfs3;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageTargetName = storageTargetName;
        this.targetType = Objects.requireNonNull(targetType, "expected parameter 'targetType' to be non-null");
        this.unknown = unknown;
    }

    private StorageTargetArgs() {
        this.blobNfs = Output.empty();
        this.cacheName = Output.empty();
        this.clfs = Output.empty();
        this.junctions = Output.empty();
        this.nfs3 = Output.empty();
        this.provisioningState = Output.empty();
        this.resourceGroupName = Output.empty();
        this.storageTargetName = Output.empty();
        this.targetType = Output.empty();
        this.unknown = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BlobNfsTargetArgs> blobNfs;
        private Output<String> cacheName;
        private @Nullable Output<ClfsTargetArgs> clfs;
        private @Nullable Output<List<NamespaceJunctionArgs>> junctions;
        private @Nullable Output<Nfs3TargetArgs> nfs3;
        private @Nullable Output<Either<String,ProvisioningStateType>> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> storageTargetName;
        private Output<Either<String,StorageTargetType>> targetType;
        private @Nullable Output<UnknownTargetArgs> unknown;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobNfs = defaults.blobNfs;
    	      this.cacheName = defaults.cacheName;
    	      this.clfs = defaults.clfs;
    	      this.junctions = defaults.junctions;
    	      this.nfs3 = defaults.nfs3;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageTargetName = defaults.storageTargetName;
    	      this.targetType = defaults.targetType;
    	      this.unknown = defaults.unknown;
        }

        public Builder blobNfs(@Nullable Output<BlobNfsTargetArgs> blobNfs) {
            this.blobNfs = blobNfs;
            return this;
        }

        public Builder blobNfs(@Nullable BlobNfsTargetArgs blobNfs) {
            this.blobNfs = Output.ofNullable(blobNfs);
            return this;
        }

        public Builder cacheName(Output<String> cacheName) {
            this.cacheName = Objects.requireNonNull(cacheName);
            return this;
        }

        public Builder cacheName(String cacheName) {
            this.cacheName = Output.of(Objects.requireNonNull(cacheName));
            return this;
        }

        public Builder clfs(@Nullable Output<ClfsTargetArgs> clfs) {
            this.clfs = clfs;
            return this;
        }

        public Builder clfs(@Nullable ClfsTargetArgs clfs) {
            this.clfs = Output.ofNullable(clfs);
            return this;
        }

        public Builder junctions(@Nullable Output<List<NamespaceJunctionArgs>> junctions) {
            this.junctions = junctions;
            return this;
        }

        public Builder junctions(@Nullable List<NamespaceJunctionArgs> junctions) {
            this.junctions = Output.ofNullable(junctions);
            return this;
        }

        public Builder nfs3(@Nullable Output<Nfs3TargetArgs> nfs3) {
            this.nfs3 = nfs3;
            return this;
        }

        public Builder nfs3(@Nullable Nfs3TargetArgs nfs3) {
            this.nfs3 = Output.ofNullable(nfs3);
            return this;
        }

        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningStateType>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable Either<String,ProvisioningStateType> provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
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

        public Builder storageTargetName(@Nullable Output<String> storageTargetName) {
            this.storageTargetName = storageTargetName;
            return this;
        }

        public Builder storageTargetName(@Nullable String storageTargetName) {
            this.storageTargetName = Output.ofNullable(storageTargetName);
            return this;
        }

        public Builder targetType(Output<Either<String,StorageTargetType>> targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }

        public Builder targetType(Either<String,StorageTargetType> targetType) {
            this.targetType = Output.of(Objects.requireNonNull(targetType));
            return this;
        }

        public Builder unknown(@Nullable Output<UnknownTargetArgs> unknown) {
            this.unknown = unknown;
            return this;
        }

        public Builder unknown(@Nullable UnknownTargetArgs unknown) {
            this.unknown = Output.ofNullable(unknown);
            return this;
        }
        public StorageTargetArgs build() {
            return new StorageTargetArgs(blobNfs, cacheName, clfs, junctions, nfs3, provisioningState, resourceGroupName, storageTargetName, targetType, unknown);
        }
    }
}
