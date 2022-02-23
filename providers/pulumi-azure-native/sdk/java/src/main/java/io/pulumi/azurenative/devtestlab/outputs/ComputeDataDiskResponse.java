// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComputeDataDiskResponse {
    /**
     * Gets data disk size in GiB.
     * 
     */
    private final @Nullable Integer diskSizeGiB;
    /**
     * When backed by a blob, the URI of underlying blob.
     * 
     */
    private final @Nullable String diskUri;
    /**
     * When backed by managed disk, this is the ID of the compute disk resource.
     * 
     */
    private final @Nullable String managedDiskId;
    /**
     * Gets data disk name.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"diskSizeGiB","diskUri","managedDiskId","name"})
    private ComputeDataDiskResponse(
        @Nullable Integer diskSizeGiB,
        @Nullable String diskUri,
        @Nullable String managedDiskId,
        @Nullable String name) {
        this.diskSizeGiB = diskSizeGiB;
        this.diskUri = diskUri;
        this.managedDiskId = managedDiskId;
        this.name = name;
    }

    /**
     * Gets data disk size in GiB.
     * 
     */
    public Optional<Integer> getDiskSizeGiB() {
        return Optional.ofNullable(this.diskSizeGiB);
    }
    /**
     * When backed by a blob, the URI of underlying blob.
     * 
     */
    public Optional<String> getDiskUri() {
        return Optional.ofNullable(this.diskUri);
    }
    /**
     * When backed by managed disk, this is the ID of the compute disk resource.
     * 
     */
    public Optional<String> getManagedDiskId() {
        return Optional.ofNullable(this.managedDiskId);
    }
    /**
     * Gets data disk name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeDataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskSizeGiB;
        private @Nullable String diskUri;
        private @Nullable String managedDiskId;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeDataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGiB = defaults.diskSizeGiB;
    	      this.diskUri = defaults.diskUri;
    	      this.managedDiskId = defaults.managedDiskId;
    	      this.name = defaults.name;
        }

        public Builder setDiskSizeGiB(@Nullable Integer diskSizeGiB) {
            this.diskSizeGiB = diskSizeGiB;
            return this;
        }

        public Builder setDiskUri(@Nullable String diskUri) {
            this.diskUri = diskUri;
            return this;
        }

        public Builder setManagedDiskId(@Nullable String managedDiskId) {
            this.managedDiskId = managedDiskId;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ComputeDataDiskResponse build() {
            return new ComputeDataDiskResponse(diskSizeGiB, diskUri, managedDiskId, name);
        }
    }
}
