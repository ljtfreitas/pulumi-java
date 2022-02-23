// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * This is the gallery image definition identifier.
 * 
 */
public final class GalleryImageIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryImageIdentifierArgs Empty = new GalleryImageIdentifierArgs();

    /**
     * The name of the gallery image definition offer.
     * 
     */
    @InputImport(name="offer", required=true)
        private final Input<String> offer;

    public Input<String> getOffer() {
        return this.offer;
    }

    /**
     * The name of the gallery image definition publisher.
     * 
     */
    @InputImport(name="publisher", required=true)
        private final Input<String> publisher;

    public Input<String> getPublisher() {
        return this.publisher;
    }

    /**
     * The name of the gallery image definition SKU.
     * 
     */
    @InputImport(name="sku", required=true)
        private final Input<String> sku;

    public Input<String> getSku() {
        return this.sku;
    }

    public GalleryImageIdentifierArgs(
        Input<String> offer,
        Input<String> publisher,
        Input<String> sku) {
        this.offer = Objects.requireNonNull(offer, "expected parameter 'offer' to be non-null");
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private GalleryImageIdentifierArgs() {
        this.offer = Input.empty();
        this.publisher = Input.empty();
        this.sku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> offer;
        private Input<String> publisher;
        private Input<String> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
        }

        public Builder setOffer(Input<String> offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }

        public Builder setOffer(String offer) {
            this.offer = Input.of(Objects.requireNonNull(offer));
            return this;
        }

        public Builder setPublisher(Input<String> publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Input.of(Objects.requireNonNull(publisher));
            return this;
        }

        public Builder setSku(Input<String> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }
        public GalleryImageIdentifierArgs build() {
            return new GalleryImageIdentifierArgs(offer, publisher, sku);
        }
    }
}
