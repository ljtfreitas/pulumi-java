// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.ImageRawDiskContainerType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters of the raw disk image.
 * 
 */
public final class ImageRawDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRawDiskArgs Empty = new ImageRawDiskArgs();

    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
     * 
     */
    @Import(name="containerType")
      private final @Nullable Output<ImageRawDiskContainerType> containerType;

    public Output<ImageRawDiskContainerType> getContainerType() {
        return this.containerType == null ? Output.empty() : this.containerType;
    }

    /**
     * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    public ImageRawDiskArgs(
        @Nullable Output<ImageRawDiskContainerType> containerType,
        @Nullable Output<String> source) {
        this.containerType = containerType;
        this.source = source;
    }

    private ImageRawDiskArgs() {
        this.containerType = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRawDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ImageRawDiskContainerType> containerType;
        private @Nullable Output<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRawDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerType = defaults.containerType;
    	      this.source = defaults.source;
        }

        public Builder containerType(@Nullable Output<ImageRawDiskContainerType> containerType) {
            this.containerType = containerType;
            return this;
        }

        public Builder containerType(@Nullable ImageRawDiskContainerType containerType) {
            this.containerType = Output.ofNullable(containerType);
            return this;
        }

        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable String source) {
            this.source = Output.ofNullable(source);
            return this;
        }
        public ImageRawDiskArgs build() {
            return new ImageRawDiskArgs(containerType, source);
        }
    }
}
