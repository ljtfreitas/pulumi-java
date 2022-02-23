// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU of an Azure Firewall.
 * 
 */
public final class AzureFirewallSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFirewallSkuResponse Empty = new AzureFirewallSkuResponse();

    /**
     * Name of an Azure Firewall SKU.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Tier of an Azure Firewall.
     * 
     */
    @InputImport(name="tier")
        private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public AzureFirewallSkuResponse(
        @Nullable String name,
        @Nullable String tier) {
        this.name = name;
        this.tier = tier;
    }

    private AzureFirewallSkuResponse() {
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public AzureFirewallSkuResponse build() {
            return new AzureFirewallSkuResponse(name, tier);
        }
    }
}
