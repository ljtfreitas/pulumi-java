// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The reference information for an Azure Marketplace image.
 * 
 */
public final class GalleryImageReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GalleryImageReferenceResponse Empty = new GalleryImageReferenceResponse();

    /**
     * The offer of the gallery image.
     * 
     */
    @Import(name="offer")
      private final @Nullable String offer;

    public Optional<String> getOffer() {
        return this.offer == null ? Optional.empty() : Optional.ofNullable(this.offer);
    }

    /**
     * The OS type of the gallery image.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * The publisher of the gallery image.
     * 
     */
    @Import(name="publisher")
      private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    /**
     * The SKU of the gallery image.
     * 
     */
    @Import(name="sku")
      private final @Nullable String sku;

    public Optional<String> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * The version of the gallery image.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GalleryImageReferenceResponse(
        @Nullable String offer,
        @Nullable String osType,
        @Nullable String publisher,
        @Nullable String sku,
        @Nullable String version) {
        this.offer = offer;
        this.osType = osType;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    private GalleryImageReferenceResponse() {
        this.offer = null;
        this.osType = null;
        this.publisher = null;
        this.sku = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offer;
        private @Nullable String osType;
        private @Nullable String publisher;
        private @Nullable String sku;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.osType = defaults.osType;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GalleryImageReferenceResponse build() {
            return new GalleryImageReferenceResponse(offer, osType, publisher, sku, version);
        }
    }
}
