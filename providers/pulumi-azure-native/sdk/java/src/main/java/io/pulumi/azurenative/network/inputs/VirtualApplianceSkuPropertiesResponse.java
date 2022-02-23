// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network Virtual Appliance Sku Properties.
 * 
 */
public final class VirtualApplianceSkuPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualApplianceSkuPropertiesResponse Empty = new VirtualApplianceSkuPropertiesResponse();

    /**
     * Virtual Appliance Scale Unit.
     * 
     */
    @InputImport(name="bundledScaleUnit")
        private final @Nullable String bundledScaleUnit;

    public Optional<String> getBundledScaleUnit() {
        return this.bundledScaleUnit == null ? Optional.empty() : Optional.ofNullable(this.bundledScaleUnit);
    }

    /**
     * Virtual Appliance Version.
     * 
     */
    @InputImport(name="marketPlaceVersion")
        private final @Nullable String marketPlaceVersion;

    public Optional<String> getMarketPlaceVersion() {
        return this.marketPlaceVersion == null ? Optional.empty() : Optional.ofNullable(this.marketPlaceVersion);
    }

    /**
     * Virtual Appliance Vendor.
     * 
     */
    @InputImport(name="vendor")
        private final @Nullable String vendor;

    public Optional<String> getVendor() {
        return this.vendor == null ? Optional.empty() : Optional.ofNullable(this.vendor);
    }

    public VirtualApplianceSkuPropertiesResponse(
        @Nullable String bundledScaleUnit,
        @Nullable String marketPlaceVersion,
        @Nullable String vendor) {
        this.bundledScaleUnit = bundledScaleUnit;
        this.marketPlaceVersion = marketPlaceVersion;
        this.vendor = vendor;
    }

    private VirtualApplianceSkuPropertiesResponse() {
        this.bundledScaleUnit = null;
        this.marketPlaceVersion = null;
        this.vendor = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualApplianceSkuPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bundledScaleUnit;
        private @Nullable String marketPlaceVersion;
        private @Nullable String vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualApplianceSkuPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundledScaleUnit = defaults.bundledScaleUnit;
    	      this.marketPlaceVersion = defaults.marketPlaceVersion;
    	      this.vendor = defaults.vendor;
        }

        public Builder setBundledScaleUnit(@Nullable String bundledScaleUnit) {
            this.bundledScaleUnit = bundledScaleUnit;
            return this;
        }

        public Builder setMarketPlaceVersion(@Nullable String marketPlaceVersion) {
            this.marketPlaceVersion = marketPlaceVersion;
            return this;
        }

        public Builder setVendor(@Nullable String vendor) {
            this.vendor = vendor;
            return this;
        }
        public VirtualApplianceSkuPropertiesResponse build() {
            return new VirtualApplianceSkuPropertiesResponse(bundledScaleUnit, marketPlaceVersion, vendor);
        }
    }
}
