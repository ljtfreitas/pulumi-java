// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class Uint128Response extends io.pulumi.resources.InvokeArgs {

    public static final Uint128Response Empty = new Uint128Response();

    @InputImport(name="high", required=true)
      private final String high;

    public String getHigh() {
        return this.high;
    }

    @InputImport(name="low", required=true)
      private final String low;

    public String getLow() {
        return this.low;
    }

    public Uint128Response(
        String high,
        String low) {
        this.high = Objects.requireNonNull(high, "expected parameter 'high' to be non-null");
        this.low = Objects.requireNonNull(low, "expected parameter 'low' to be non-null");
    }

    private Uint128Response() {
        this.high = null;
        this.low = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Uint128Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String high;
        private String low;

        public Builder() {
    	      // Empty
        }

        public Builder(Uint128Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.high = defaults.high;
    	      this.low = defaults.low;
        }

        public Builder setHigh(String high) {
            this.high = Objects.requireNonNull(high);
            return this;
        }

        public Builder setLow(String low) {
            this.low = Objects.requireNonNull(low);
            return this;
        }
        public Uint128Response build() {
            return new Uint128Response(high, low);
        }
    }
}
