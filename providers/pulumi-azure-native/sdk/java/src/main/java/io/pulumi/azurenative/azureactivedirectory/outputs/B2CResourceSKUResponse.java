// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class B2CResourceSKUResponse {
    /**
     * The name of the SKU for the tenant.
     * 
     */
    private final @Nullable String name;
    /**
     * The tier of the tenant.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private B2CResourceSKUResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.name = name;
        this.tier = tier;
    }

    /**
     * The name of the SKU for the tenant.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The tier of the tenant.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(B2CResourceSKUResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(B2CResourceSKUResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public B2CResourceSKUResponse build() {
            return new B2CResourceSKUResponse(name, tier);
        }
    }
}
