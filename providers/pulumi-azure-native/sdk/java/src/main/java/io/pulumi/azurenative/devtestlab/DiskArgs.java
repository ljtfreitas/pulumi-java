// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.enums.StorageType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskArgs Empty = new DiskArgs();

    /**
     * When backed by a blob, the name of the VHD blob without extension.
     * 
     */
    @Import(name="diskBlobName")
      private final @Nullable Output<String> diskBlobName;

    public Output<String> getDiskBlobName() {
        return this.diskBlobName == null ? Output.empty() : this.diskBlobName;
    }

    /**
     * The size of the disk in Gibibytes.
     * 
     */
    @Import(name="diskSizeGiB")
      private final @Nullable Output<Integer> diskSizeGiB;

    public Output<Integer> getDiskSizeGiB() {
        return this.diskSizeGiB == null ? Output.empty() : this.diskSizeGiB;
    }

    /**
     * The storage type for the disk (i.e. Standard, Premium).
     * 
     */
    @Import(name="diskType")
      private final @Nullable Output<Either<String,StorageType>> diskType;

    public Output<Either<String,StorageType>> getDiskType() {
        return this.diskType == null ? Output.empty() : this.diskType;
    }

    /**
     * When backed by a blob, the URI of underlying blob.
     * 
     */
    @Import(name="diskUri")
      private final @Nullable Output<String> diskUri;

    public Output<String> getDiskUri() {
        return this.diskUri == null ? Output.empty() : this.diskUri;
    }

    /**
     * The host caching policy of the disk (i.e. None, ReadOnly, ReadWrite).
     * 
     */
    @Import(name="hostCaching")
      private final @Nullable Output<String> hostCaching;

    public Output<String> getHostCaching() {
        return this.hostCaching == null ? Output.empty() : this.hostCaching;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final Output<String> labName;

    public Output<String> getLabName() {
        return this.labName;
    }

    /**
     * The resource ID of the VM to which this disk is leased.
     * 
     */
    @Import(name="leasedByLabVmId")
      private final @Nullable Output<String> leasedByLabVmId;

    public Output<String> getLeasedByLabVmId() {
        return this.leasedByLabVmId == null ? Output.empty() : this.leasedByLabVmId;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * When backed by managed disk, this is the ID of the compute disk resource.
     * 
     */
    @Import(name="managedDiskId")
      private final @Nullable Output<String> managedDiskId;

    public Output<String> getManagedDiskId() {
        return this.managedDiskId == null ? Output.empty() : this.managedDiskId;
    }

    /**
     * The name of the disk.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * When backed by a blob, the storage account where the blob is.
     * 
     */
    @Import(name="storageAccountId")
      private final @Nullable Output<String> storageAccountId;

    public Output<String> getStorageAccountId() {
        return this.storageAccountId == null ? Output.empty() : this.storageAccountId;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of the user profile.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public DiskArgs(
        @Nullable Output<String> diskBlobName,
        @Nullable Output<Integer> diskSizeGiB,
        @Nullable Output<Either<String,StorageType>> diskType,
        @Nullable Output<String> diskUri,
        @Nullable Output<String> hostCaching,
        Output<String> labName,
        @Nullable Output<String> leasedByLabVmId,
        @Nullable Output<String> location,
        @Nullable Output<String> managedDiskId,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> storageAccountId,
        @Nullable Output<Map<String,String>> tags,
        Output<String> userName) {
        this.diskBlobName = diskBlobName;
        this.diskSizeGiB = diskSizeGiB;
        this.diskType = diskType;
        this.diskUri = diskUri;
        this.hostCaching = hostCaching;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.leasedByLabVmId = leasedByLabVmId;
        this.location = location;
        this.managedDiskId = managedDiskId;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountId = storageAccountId;
        this.tags = tags;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private DiskArgs() {
        this.diskBlobName = Output.empty();
        this.diskSizeGiB = Output.empty();
        this.diskType = Output.empty();
        this.diskUri = Output.empty();
        this.hostCaching = Output.empty();
        this.labName = Output.empty();
        this.leasedByLabVmId = Output.empty();
        this.location = Output.empty();
        this.managedDiskId = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.storageAccountId = Output.empty();
        this.tags = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskBlobName;
        private @Nullable Output<Integer> diskSizeGiB;
        private @Nullable Output<Either<String,StorageType>> diskType;
        private @Nullable Output<String> diskUri;
        private @Nullable Output<String> hostCaching;
        private Output<String> labName;
        private @Nullable Output<String> leasedByLabVmId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> managedDiskId;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> storageAccountId;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskBlobName = defaults.diskBlobName;
    	      this.diskSizeGiB = defaults.diskSizeGiB;
    	      this.diskType = defaults.diskType;
    	      this.diskUri = defaults.diskUri;
    	      this.hostCaching = defaults.hostCaching;
    	      this.labName = defaults.labName;
    	      this.leasedByLabVmId = defaults.leasedByLabVmId;
    	      this.location = defaults.location;
    	      this.managedDiskId = defaults.managedDiskId;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder diskBlobName(@Nullable Output<String> diskBlobName) {
            this.diskBlobName = diskBlobName;
            return this;
        }

        public Builder diskBlobName(@Nullable String diskBlobName) {
            this.diskBlobName = Output.ofNullable(diskBlobName);
            return this;
        }

        public Builder diskSizeGiB(@Nullable Output<Integer> diskSizeGiB) {
            this.diskSizeGiB = diskSizeGiB;
            return this;
        }

        public Builder diskSizeGiB(@Nullable Integer diskSizeGiB) {
            this.diskSizeGiB = Output.ofNullable(diskSizeGiB);
            return this;
        }

        public Builder diskType(@Nullable Output<Either<String,StorageType>> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder diskType(@Nullable Either<String,StorageType> diskType) {
            this.diskType = Output.ofNullable(diskType);
            return this;
        }

        public Builder diskUri(@Nullable Output<String> diskUri) {
            this.diskUri = diskUri;
            return this;
        }

        public Builder diskUri(@Nullable String diskUri) {
            this.diskUri = Output.ofNullable(diskUri);
            return this;
        }

        public Builder hostCaching(@Nullable Output<String> hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }

        public Builder hostCaching(@Nullable String hostCaching) {
            this.hostCaching = Output.ofNullable(hostCaching);
            return this;
        }

        public Builder labName(Output<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder labName(String labName) {
            this.labName = Output.of(Objects.requireNonNull(labName));
            return this;
        }

        public Builder leasedByLabVmId(@Nullable Output<String> leasedByLabVmId) {
            this.leasedByLabVmId = leasedByLabVmId;
            return this;
        }

        public Builder leasedByLabVmId(@Nullable String leasedByLabVmId) {
            this.leasedByLabVmId = Output.ofNullable(leasedByLabVmId);
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

        public Builder managedDiskId(@Nullable Output<String> managedDiskId) {
            this.managedDiskId = managedDiskId;
            return this;
        }

        public Builder managedDiskId(@Nullable String managedDiskId) {
            this.managedDiskId = Output.ofNullable(managedDiskId);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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

        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Output.ofNullable(storageAccountId);
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

        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }
        public DiskArgs build() {
            return new DiskArgs(diskBlobName, diskSizeGiB, diskType, diskUri, hostCaching, labName, leasedByLabVmId, location, managedDiskId, name, resourceGroupName, storageAccountId, tags, userName);
        }
    }
}
