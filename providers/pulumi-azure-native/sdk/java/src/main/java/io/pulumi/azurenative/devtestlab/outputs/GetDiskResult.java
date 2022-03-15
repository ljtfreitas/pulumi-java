// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDiskResult {
    /**
     * The creation date of the disk.
     * 
     */
    private final String createdDate;
    /**
     * When backed by a blob, the name of the VHD blob without extension.
     * 
     */
    private final @Nullable String diskBlobName;
    /**
     * The size of the disk in Gibibytes.
     * 
     */
    private final @Nullable Integer diskSizeGiB;
    /**
     * The storage type for the disk (i.e. Standard, Premium).
     * 
     */
    private final @Nullable String diskType;
    /**
     * When backed by a blob, the URI of underlying blob.
     * 
     */
    private final @Nullable String diskUri;
    /**
     * The host caching policy of the disk (i.e. None, ReadOnly, ReadWrite).
     * 
     */
    private final @Nullable String hostCaching;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The resource ID of the VM to which this disk is leased.
     * 
     */
    private final @Nullable String leasedByLabVmId;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * When backed by managed disk, this is the ID of the compute disk resource.
     * 
     */
    private final @Nullable String managedDiskId;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * When backed by a blob, the storage account where the blob is.
     * 
     */
    private final @Nullable String storageAccountId;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;

    @CustomType.Constructor
    private GetDiskResult(
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("diskBlobName") @Nullable String diskBlobName,
        @CustomType.Parameter("diskSizeGiB") @Nullable Integer diskSizeGiB,
        @CustomType.Parameter("diskType") @Nullable String diskType,
        @CustomType.Parameter("diskUri") @Nullable String diskUri,
        @CustomType.Parameter("hostCaching") @Nullable String hostCaching,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("leasedByLabVmId") @Nullable String leasedByLabVmId,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedDiskId") @Nullable String managedDiskId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("storageAccountId") @Nullable String storageAccountId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueIdentifier") String uniqueIdentifier) {
        this.createdDate = createdDate;
        this.diskBlobName = diskBlobName;
        this.diskSizeGiB = diskSizeGiB;
        this.diskType = diskType;
        this.diskUri = diskUri;
        this.hostCaching = hostCaching;
        this.id = id;
        this.leasedByLabVmId = leasedByLabVmId;
        this.location = location;
        this.managedDiskId = managedDiskId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.storageAccountId = storageAccountId;
        this.tags = tags;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * The creation date of the disk.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * When backed by a blob, the name of the VHD blob without extension.
     * 
    */
    public Optional<String> getDiskBlobName() {
        return Optional.ofNullable(this.diskBlobName);
    }
    /**
     * The size of the disk in Gibibytes.
     * 
    */
    public Optional<Integer> getDiskSizeGiB() {
        return Optional.ofNullable(this.diskSizeGiB);
    }
    /**
     * The storage type for the disk (i.e. Standard, Premium).
     * 
    */
    public Optional<String> getDiskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * When backed by a blob, the URI of underlying blob.
     * 
    */
    public Optional<String> getDiskUri() {
        return Optional.ofNullable(this.diskUri);
    }
    /**
     * The host caching policy of the disk (i.e. None, ReadOnly, ReadWrite).
     * 
    */
    public Optional<String> getHostCaching() {
        return Optional.ofNullable(this.hostCaching);
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource ID of the VM to which this disk is leased.
     * 
    */
    public Optional<String> getLeasedByLabVmId() {
        return Optional.ofNullable(this.leasedByLabVmId);
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * When backed by managed disk, this is the ID of the compute disk resource.
     * 
    */
    public Optional<String> getManagedDiskId() {
        return Optional.ofNullable(this.managedDiskId);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * When backed by a blob, the storage account where the blob is.
     * 
    */
    public Optional<String> getStorageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable String diskBlobName;
        private @Nullable Integer diskSizeGiB;
        private @Nullable String diskType;
        private @Nullable String diskUri;
        private @Nullable String hostCaching;
        private String id;
        private @Nullable String leasedByLabVmId;
        private @Nullable String location;
        private @Nullable String managedDiskId;
        private String name;
        private String provisioningState;
        private @Nullable String storageAccountId;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.diskBlobName = defaults.diskBlobName;
    	      this.diskSizeGiB = defaults.diskSizeGiB;
    	      this.diskType = defaults.diskType;
    	      this.diskUri = defaults.diskUri;
    	      this.hostCaching = defaults.hostCaching;
    	      this.id = defaults.id;
    	      this.leasedByLabVmId = defaults.leasedByLabVmId;
    	      this.location = defaults.location;
    	      this.managedDiskId = defaults.managedDiskId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder diskBlobName(@Nullable String diskBlobName) {
            this.diskBlobName = diskBlobName;
            return this;
        }

        public Builder diskSizeGiB(@Nullable Integer diskSizeGiB) {
            this.diskSizeGiB = diskSizeGiB;
            return this;
        }

        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder diskUri(@Nullable String diskUri) {
            this.diskUri = diskUri;
            return this;
        }

        public Builder hostCaching(@Nullable String hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder leasedByLabVmId(@Nullable String leasedByLabVmId) {
            this.leasedByLabVmId = leasedByLabVmId;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder managedDiskId(@Nullable String managedDiskId) {
            this.managedDiskId = managedDiskId;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder uniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }
        public GetDiskResult build() {
            return new GetDiskResult(createdDate, diskBlobName, diskSizeGiB, diskType, diskUri, hostCaching, id, leasedByLabVmId, location, managedDiskId, name, provisioningState, storageAccountId, tags, type, uniqueIdentifier);
        }
    }
}
