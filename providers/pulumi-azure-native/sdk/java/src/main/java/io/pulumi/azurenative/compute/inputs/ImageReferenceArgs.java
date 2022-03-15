// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies information about the image to use. You can specify information about platform images, marketplace images, or virtual machine images. This element is required when you want to use a platform image, marketplace image, or virtual machine image, but is not used in other creation operations. NOTE: Image reference publisher and offer can only be set when you create the scale set.
 * 
 */
public final class ImageReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageReferenceArgs Empty = new ImageReferenceArgs();

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Specifies the offer of the platform image or marketplace image used to create the virtual machine.
     * 
     */
    @Import(name="offer")
      private final @Nullable Output<String> offer;

    public Output<String> getOffer() {
        return this.offer == null ? Output.empty() : this.offer;
    }

    /**
     * The image publisher.
     * 
     */
    @Import(name="publisher")
      private final @Nullable Output<String> publisher;

    public Output<String> getPublisher() {
        return this.publisher == null ? Output.empty() : this.publisher;
    }

    /**
     * The image SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<String> sku;

    public Output<String> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Specifies the version of the platform image or marketplace image used to create the virtual machine. The allowed formats are Major.Minor.Build or 'latest'. Major, Minor, and Build are decimal numbers. Specify 'latest' to use the latest version of an image available at deploy time. Even if you use 'latest', the VM image will not automatically update after deploy time even if a new version becomes available.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ImageReferenceArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> offer,
        @Nullable Output<String> publisher,
        @Nullable Output<String> sku,
        @Nullable Output<String> version) {
        this.id = id;
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    private ImageReferenceArgs() {
        this.id = Output.empty();
        this.offer = Output.empty();
        this.publisher = Output.empty();
        this.sku = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> offer;
        private @Nullable Output<String> publisher;
        private @Nullable Output<String> sku;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder offer(@Nullable Output<String> offer) {
            this.offer = offer;
            return this;
        }

        public Builder offer(@Nullable String offer) {
            this.offer = Output.ofNullable(offer);
            return this;
        }

        public Builder publisher(@Nullable Output<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = Output.ofNullable(publisher);
            return this;
        }

        public Builder sku(@Nullable Output<String> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable String sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public ImageReferenceArgs build() {
            return new ImageReferenceArgs(id, offer, publisher, sku, version);
        }
    }
}
