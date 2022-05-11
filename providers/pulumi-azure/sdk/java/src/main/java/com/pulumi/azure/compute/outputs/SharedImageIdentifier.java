// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SharedImageIdentifier {
    /**
     * @return The Offer Name for this Shared Image.
     * 
     */
    private final String offer;
    /**
     * @return The Publisher Name for this Gallery Image.
     * 
     */
    private final String publisher;
    /**
     * @return The Name of the SKU for this Gallery Image.
     * 
     */
    private final String sku;

    @CustomType.Constructor
    private SharedImageIdentifier(
        @CustomType.Parameter("offer") String offer,
        @CustomType.Parameter("publisher") String publisher,
        @CustomType.Parameter("sku") String sku) {
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
    }

    /**
     * @return The Offer Name for this Shared Image.
     * 
     */
    public String offer() {
        return this.offer;
    }
    /**
     * @return The Publisher Name for this Gallery Image.
     * 
     */
    public String publisher() {
        return this.publisher;
    }
    /**
     * @return The Name of the SKU for this Gallery Image.
     * 
     */
    public String sku() {
        return this.sku;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedImageIdentifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String offer;
        private String publisher;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedImageIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
        }

        public Builder offer(String offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }        public SharedImageIdentifier build() {
            return new SharedImageIdentifier(offer, publisher, sku);
        }
    }
}
