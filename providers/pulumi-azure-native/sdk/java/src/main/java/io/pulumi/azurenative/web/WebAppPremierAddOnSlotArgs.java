// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppPremierAddOnSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppPremierAddOnSlotArgs Empty = new WebAppPremierAddOnSlotArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Premier add on Marketplace offer.
     * 
     */
    @Import(name="marketplaceOffer")
      private final @Nullable Output<String> marketplaceOffer;

    public Output<String> getMarketplaceOffer() {
        return this.marketplaceOffer == null ? Output.empty() : this.marketplaceOffer;
    }

    /**
     * Premier add on Marketplace publisher.
     * 
     */
    @Import(name="marketplacePublisher")
      private final @Nullable Output<String> marketplacePublisher;

    public Output<String> getMarketplacePublisher() {
        return this.marketplacePublisher == null ? Output.empty() : this.marketplacePublisher;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Add-on name.
     * 
     */
    @Import(name="premierAddOnName")
      private final @Nullable Output<String> premierAddOnName;

    public Output<String> getPremierAddOnName() {
        return this.premierAddOnName == null ? Output.empty() : this.premierAddOnName;
    }

    /**
     * Premier add on Product.
     * 
     */
    @Import(name="product")
      private final @Nullable Output<String> product;

    public Output<String> getProduct() {
        return this.product == null ? Output.empty() : this.product;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Premier add on SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<String> sku;

    public Output<String> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will update the named add-on for the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final Output<String> slot;

    public Output<String> getSlot() {
        return this.slot;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Premier add on Vendor.
     * 
     */
    @Import(name="vendor")
      private final @Nullable Output<String> vendor;

    public Output<String> getVendor() {
        return this.vendor == null ? Output.empty() : this.vendor;
    }

    public WebAppPremierAddOnSlotArgs(
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> marketplaceOffer,
        @Nullable Output<String> marketplacePublisher,
        Output<String> name,
        @Nullable Output<String> premierAddOnName,
        @Nullable Output<String> product,
        Output<String> resourceGroupName,
        @Nullable Output<String> sku,
        Output<String> slot,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vendor) {
        this.kind = kind;
        this.location = location;
        this.marketplaceOffer = marketplaceOffer;
        this.marketplacePublisher = marketplacePublisher;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.premierAddOnName = premierAddOnName;
        this.product = product;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.tags = tags;
        this.vendor = vendor;
    }

    private WebAppPremierAddOnSlotArgs() {
        this.kind = Output.empty();
        this.location = Output.empty();
        this.marketplaceOffer = Output.empty();
        this.marketplacePublisher = Output.empty();
        this.name = Output.empty();
        this.premierAddOnName = Output.empty();
        this.product = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.slot = Output.empty();
        this.tags = Output.empty();
        this.vendor = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppPremierAddOnSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> marketplaceOffer;
        private @Nullable Output<String> marketplacePublisher;
        private Output<String> name;
        private @Nullable Output<String> premierAddOnName;
        private @Nullable Output<String> product;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sku;
        private Output<String> slot;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppPremierAddOnSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.marketplaceOffer = defaults.marketplaceOffer;
    	      this.marketplacePublisher = defaults.marketplacePublisher;
    	      this.name = defaults.name;
    	      this.premierAddOnName = defaults.premierAddOnName;
    	      this.product = defaults.product;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.slot = defaults.slot;
    	      this.tags = defaults.tags;
    	      this.vendor = defaults.vendor;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder marketplaceOffer(@Nullable Output<String> marketplaceOffer) {
            this.marketplaceOffer = marketplaceOffer;
            return this;
        }

        public Builder marketplaceOffer(@Nullable String marketplaceOffer) {
            this.marketplaceOffer = Output.ofNullable(marketplaceOffer);
            return this;
        }

        public Builder marketplacePublisher(@Nullable Output<String> marketplacePublisher) {
            this.marketplacePublisher = marketplacePublisher;
            return this;
        }

        public Builder marketplacePublisher(@Nullable String marketplacePublisher) {
            this.marketplacePublisher = Output.ofNullable(marketplacePublisher);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder premierAddOnName(@Nullable Output<String> premierAddOnName) {
            this.premierAddOnName = premierAddOnName;
            return this;
        }

        public Builder premierAddOnName(@Nullable String premierAddOnName) {
            this.premierAddOnName = Output.ofNullable(premierAddOnName);
            return this;
        }

        public Builder product(@Nullable Output<String> product) {
            this.product = product;
            return this;
        }

        public Builder product(@Nullable String product) {
            this.product = Output.ofNullable(product);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
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

        public Builder slot(Output<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder slot(String slot) {
            this.slot = Output.of(Objects.requireNonNull(slot));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder vendor(@Nullable Output<String> vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder vendor(@Nullable String vendor) {
            this.vendor = Output.ofNullable(vendor);
            return this;
        }
        public WebAppPremierAddOnSlotArgs build() {
            return new WebAppPremierAddOnSlotArgs(kind, location, marketplaceOffer, marketplacePublisher, name, premierAddOnName, product, resourceGroupName, sku, slot, tags, vendor);
        }
    }
}
