// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouteSpecHttp2RouteTimeoutIdleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteTimeoutIdleGetArgs Empty = new RouteSpecHttp2RouteTimeoutIdleGetArgs();

    /**
     * The unit of time. Valid values: `ms`, `s`.
     * 
     */
    @Import(name="unit", required=true)
      private final Output<String> unit;

    public Output<String> getUnit() {
        return this.unit;
    }

    /**
     * The number of time units. Minimum value of `0`.
     * 
     */
    @Import(name="value", required=true)
      private final Output<Integer> value;

    public Output<Integer> getValue() {
        return this.value;
    }

    public RouteSpecHttp2RouteTimeoutIdleGetArgs(
        Output<String> unit,
        Output<Integer> value) {
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private RouteSpecHttp2RouteTimeoutIdleGetArgs() {
        this.unit = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteTimeoutIdleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> unit;
        private Output<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteTimeoutIdleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(Output<String> unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder unit(String unit) {
            this.unit = Output.of(Objects.requireNonNull(unit));
            return this;
        }

        public Builder value(Output<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(Integer value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public RouteSpecHttp2RouteTimeoutIdleGetArgs build() {
            return new RouteSpecHttp2RouteTimeoutIdleGetArgs(unit, value);
        }
    }
}
