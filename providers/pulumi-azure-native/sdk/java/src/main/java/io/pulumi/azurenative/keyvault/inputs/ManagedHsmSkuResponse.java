// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * SKU details
 * 
 */
public final class ManagedHsmSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedHsmSkuResponse Empty = new ManagedHsmSkuResponse();

    /**
     * SKU Family of the managed HSM Pool
     * 
     */
    @Import(name="family", required=true)
      private final String family;

    public String getFamily() {
        return this.family;
    }

    /**
     * SKU of the managed HSM Pool
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public ManagedHsmSkuResponse(
        String family,
        String name) {
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ManagedHsmSkuResponse() {
        this.family = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedHsmSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String family;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedHsmSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder family(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ManagedHsmSkuResponse build() {
            return new ManagedHsmSkuResponse(family, name);
        }
    }
}
