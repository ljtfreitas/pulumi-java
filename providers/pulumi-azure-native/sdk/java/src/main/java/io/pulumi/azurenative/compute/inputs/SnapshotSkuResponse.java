// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as the previous snapshot
 * 
 */
public final class SnapshotSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final SnapshotSkuResponse Empty = new SnapshotSkuResponse();

    /**
     * The sku name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The sku tier.
     * 
     */
    @InputImport(name="tier", required=true)
    private final String tier;

    public String getTier() {
        return this.tier;
    }

    public SnapshotSkuResponse(
        @Nullable String name,
        String tier) {
        this.name = name;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private SnapshotSkuResponse() {
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public SnapshotSkuResponse build() {
            return new SnapshotSkuResponse(name, tier);
        }
    }
}
