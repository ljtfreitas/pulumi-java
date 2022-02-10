// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.enums.StorageType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskArgs Empty = new DiskArgs();

    @InputImport(name="diskBlobName")
    private final @Nullable Input<String> diskBlobName;

    public Input<String> getDiskBlobName() {
        return this.diskBlobName == null ? Input.empty() : this.diskBlobName;
    }

    @InputImport(name="diskSizeGiB")
    private final @Nullable Input<Integer> diskSizeGiB;

    public Input<Integer> getDiskSizeGiB() {
        return this.diskSizeGiB == null ? Input.empty() : this.diskSizeGiB;
    }

    @InputImport(name="diskType")
    private final @Nullable Input<Either<String,StorageType>> diskType;

    public Input<Either<String,StorageType>> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    @InputImport(name="diskUri")
    private final @Nullable Input<String> diskUri;

    public Input<String> getDiskUri() {
        return this.diskUri == null ? Input.empty() : this.diskUri;
    }

    @InputImport(name="hostCaching")
    private final @Nullable Input<String> hostCaching;

    public Input<String> getHostCaching() {
        return this.hostCaching == null ? Input.empty() : this.hostCaching;
    }

    @InputImport(name="labName", required=true)
    private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    @InputImport(name="leasedByLabVmId")
    private final @Nullable Input<String> leasedByLabVmId;

    public Input<String> getLeasedByLabVmId() {
        return this.leasedByLabVmId == null ? Input.empty() : this.leasedByLabVmId;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="managedDiskId")
    private final @Nullable Input<String> managedDiskId;

    public Input<String> getManagedDiskId() {
        return this.managedDiskId == null ? Input.empty() : this.managedDiskId;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="storageAccountId")
    private final @Nullable Input<String> storageAccountId;

    public Input<String> getStorageAccountId() {
        return this.storageAccountId == null ? Input.empty() : this.storageAccountId;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="userName", required=true)
    private final Input<String> userName;

    public Input<String> getUserName() {
        return this.userName;
    }

    public DiskArgs(
        @Nullable Input<String> diskBlobName,
        @Nullable Input<Integer> diskSizeGiB,
        @Nullable Input<Either<String,StorageType>> diskType,
        @Nullable Input<String> diskUri,
        @Nullable Input<String> hostCaching,
        Input<String> labName,
        @Nullable Input<String> leasedByLabVmId,
        @Nullable Input<String> location,
        @Nullable Input<String> managedDiskId,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> storageAccountId,
        @Nullable Input<Map<String,String>> tags,
        Input<String> userName) {
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
        this.diskBlobName = Input.empty();
        this.diskSizeGiB = Input.empty();
        this.diskType = Input.empty();
        this.diskUri = Input.empty();
        this.hostCaching = Input.empty();
        this.labName = Input.empty();
        this.leasedByLabVmId = Input.empty();
        this.location = Input.empty();
        this.managedDiskId = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageAccountId = Input.empty();
        this.tags = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskBlobName;
        private @Nullable Input<Integer> diskSizeGiB;
        private @Nullable Input<Either<String,StorageType>> diskType;
        private @Nullable Input<String> diskUri;
        private @Nullable Input<String> hostCaching;
        private Input<String> labName;
        private @Nullable Input<String> leasedByLabVmId;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedDiskId;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> storageAccountId;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> userName;

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

        public Builder setDiskBlobName(@Nullable Input<String> diskBlobName) {
            this.diskBlobName = diskBlobName;
            return this;
        }

        public Builder setDiskBlobName(@Nullable String diskBlobName) {
            this.diskBlobName = Input.ofNullable(diskBlobName);
            return this;
        }

        public Builder setDiskSizeGiB(@Nullable Input<Integer> diskSizeGiB) {
            this.diskSizeGiB = diskSizeGiB;
            return this;
        }

        public Builder setDiskSizeGiB(@Nullable Integer diskSizeGiB) {
            this.diskSizeGiB = Input.ofNullable(diskSizeGiB);
            return this;
        }

        public Builder setDiskType(@Nullable Input<Either<String,StorageType>> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable Either<String,StorageType> diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder setDiskUri(@Nullable Input<String> diskUri) {
            this.diskUri = diskUri;
            return this;
        }

        public Builder setDiskUri(@Nullable String diskUri) {
            this.diskUri = Input.ofNullable(diskUri);
            return this;
        }

        public Builder setHostCaching(@Nullable Input<String> hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }

        public Builder setHostCaching(@Nullable String hostCaching) {
            this.hostCaching = Input.ofNullable(hostCaching);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
            return this;
        }

        public Builder setLeasedByLabVmId(@Nullable Input<String> leasedByLabVmId) {
            this.leasedByLabVmId = leasedByLabVmId;
            return this;
        }

        public Builder setLeasedByLabVmId(@Nullable String leasedByLabVmId) {
            this.leasedByLabVmId = Input.ofNullable(leasedByLabVmId);
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

        public Builder setManagedDiskId(@Nullable Input<String> managedDiskId) {
            this.managedDiskId = managedDiskId;
            return this;
        }

        public Builder setManagedDiskId(@Nullable String managedDiskId) {
            this.managedDiskId = Input.ofNullable(managedDiskId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setStorageAccountId(@Nullable Input<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder setStorageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Input.ofNullable(storageAccountId);
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

        public Builder setUserName(Input<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Input.of(Objects.requireNonNull(userName));
            return this;
        }

        public DiskArgs build() {
            return new DiskArgs(diskBlobName, diskSizeGiB, diskType, diskUri, hostCaching, labName, leasedByLabVmId, location, managedDiskId, name, resourceGroupName, storageAccountId, tags, userName);
        }
    }
}