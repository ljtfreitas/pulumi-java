// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.GalleryArtifactVersionSourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is the data disk image.
 * 
 */
public final class GalleryDataDiskImageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GalleryDataDiskImageResponse Empty = new GalleryDataDiskImageResponse();

    /**
     * The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'
     * 
     */
    @InputImport(name="hostCaching")
    private final @Nullable String hostCaching;

    public Optional<String> getHostCaching() {
        return this.hostCaching == null ? Optional.empty() : Optional.ofNullable(this.hostCaching);
    }

    /**
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    @InputImport(name="lun", required=true)
    private final Integer lun;

    public Integer getLun() {
        return this.lun;
    }

    /**
     * This property indicates the size of the VHD to be created.
     * 
     */
    @InputImport(name="sizeInGB", required=true)
    private final Integer sizeInGB;

    public Integer getSizeInGB() {
        return this.sizeInGB;
    }

    /**
     * The gallery artifact version source.
     * 
     */
    @InputImport(name="source")
    private final @Nullable GalleryArtifactVersionSourceResponse source;

    public Optional<GalleryArtifactVersionSourceResponse> getSource() {
        return this.source == null ? Optional.empty() : Optional.ofNullable(this.source);
    }

    public GalleryDataDiskImageResponse(
        @Nullable String hostCaching,
        Integer lun,
        Integer sizeInGB,
        @Nullable GalleryArtifactVersionSourceResponse source) {
        this.hostCaching = hostCaching;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.sizeInGB = Objects.requireNonNull(sizeInGB, "expected parameter 'sizeInGB' to be non-null");
        this.source = source;
    }

    private GalleryDataDiskImageResponse() {
        this.hostCaching = null;
        this.lun = null;
        this.sizeInGB = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryDataDiskImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostCaching;
        private Integer lun;
        private Integer sizeInGB;
        private @Nullable GalleryArtifactVersionSourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryDataDiskImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostCaching = defaults.hostCaching;
    	      this.lun = defaults.lun;
    	      this.sizeInGB = defaults.sizeInGB;
    	      this.source = defaults.source;
        }

        public Builder setHostCaching(@Nullable String hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setSizeInGB(Integer sizeInGB) {
            this.sizeInGB = Objects.requireNonNull(sizeInGB);
            return this;
        }

        public Builder setSource(@Nullable GalleryArtifactVersionSourceResponse source) {
            this.source = source;
            return this;
        }

        public GalleryDataDiskImageResponse build() {
            return new GalleryDataDiskImageResponse(hostCaching, lun, sizeInGB, source);
        }
    }
}
