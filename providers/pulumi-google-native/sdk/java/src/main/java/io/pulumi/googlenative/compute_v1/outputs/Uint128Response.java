// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class Uint128Response {
    private final String high;
    private final String low;

    @OutputCustomType.Constructor({"high","low"})
    private Uint128Response(
        String high,
        String low) {
        this.high = Objects.requireNonNull(high);
        this.low = Objects.requireNonNull(low);
    }

    public String getHigh() {
        return this.high;
    }
    public String getLow() {
        return this.low;
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
