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
 * This is the OS disk image.
 * 
 */
public final class GalleryOSDiskImageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GalleryOSDiskImageResponse Empty = new GalleryOSDiskImageResponse();

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

    public GalleryOSDiskImageResponse(
        @Nullable String hostCaching,
        Integer sizeInGB,
        @Nullable GalleryArtifactVersionSourceResponse source) {
        this.hostCaching = hostCaching;
        this.sizeInGB = Objects.requireNonNull(sizeInGB, "expected parameter 'sizeInGB' to be non-null");
        this.source = source;
    }

    private GalleryOSDiskImageResponse() {
        this.hostCaching = null;
        this.sizeInGB = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryOSDiskImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostCaching;
        private Integer sizeInGB;
        private @Nullable GalleryArtifactVersionSourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryOSDiskImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostCaching = defaults.hostCaching;
    	      this.sizeInGB = defaults.sizeInGB;
    	      this.source = defaults.source;
        }

        public Builder setHostCaching(@Nullable String hostCaching) {
            this.hostCaching = hostCaching;
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
        public GalleryOSDiskImageResponse build() {
            return new GalleryOSDiskImageResponse(hostCaching, sizeInGB, source);
        }
    }
}
