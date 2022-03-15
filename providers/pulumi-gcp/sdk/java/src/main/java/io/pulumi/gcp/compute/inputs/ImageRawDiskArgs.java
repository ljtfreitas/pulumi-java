// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageRawDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRawDiskArgs Empty = new ImageRawDiskArgs();

    /**
     * The format used to encode and transmit the block device, which
     * should be TAR. This is just a container and transmission format
     * and not a runtime format. Provided by the client when the disk
     * image is created.
     * Default value is `TAR`.
     * Possible values are `TAR`.
     * 
     */
    @Import(name="containerType")
      private final @Nullable Output<String> containerType;

    public Output<String> getContainerType() {
        return this.containerType == null ? Output.empty() : this.containerType;
    }

    /**
     * An optional SHA1 checksum of the disk image before unpackaging.
     * This is provided by the client when the disk image is created.
     * 
     */
    @Import(name="sha1")
      private final @Nullable Output<String> sha1;

    public Output<String> getSha1() {
        return this.sha1 == null ? Output.empty() : this.sha1;
    }

    /**
     * The full Google Cloud Storage URL where disk storage is stored
     * You must provide either this property or the sourceDisk property
     * but not both.
     * 
     */
    @Import(name="source", required=true)
      private final Output<String> source;

    public Output<String> getSource() {
        return this.source;
    }

    public ImageRawDiskArgs(
        @Nullable Output<String> containerType,
        @Nullable Output<String> sha1,
        Output<String> source) {
        this.containerType = containerType;
        this.sha1 = sha1;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private ImageRawDiskArgs() {
        this.containerType = Output.empty();
        this.sha1 = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRawDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerType;
        private @Nullable Output<String> sha1;
        private Output<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRawDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerType = defaults.containerType;
    	      this.sha1 = defaults.sha1;
    	      this.source = defaults.source;
        }

        public Builder containerType(@Nullable Output<String> containerType) {
            this.containerType = containerType;
            return this;
        }

        public Builder containerType(@Nullable String containerType) {
            this.containerType = Output.ofNullable(containerType);
            return this;
        }

        public Builder sha1(@Nullable Output<String> sha1) {
            this.sha1 = sha1;
            return this;
        }

        public Builder sha1(@Nullable String sha1) {
            this.sha1 = Output.ofNullable(sha1);
            return this;
        }

        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public ImageRawDiskArgs build() {
            return new ImageRawDiskArgs(containerType, sha1, source);
        }
    }
}
