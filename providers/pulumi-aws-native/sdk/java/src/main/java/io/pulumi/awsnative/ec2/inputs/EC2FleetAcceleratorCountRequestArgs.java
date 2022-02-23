// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetAcceleratorCountRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetAcceleratorCountRequestArgs Empty = new EC2FleetAcceleratorCountRequestArgs();

    @InputImport(name="max")
        private final @Nullable Input<Integer> max;

    public Input<Integer> getMax() {
        return this.max == null ? Input.empty() : this.max;
    }

    @InputImport(name="min")
        private final @Nullable Input<Integer> min;

    public Input<Integer> getMin() {
        return this.min == null ? Input.empty() : this.min;
    }

    public EC2FleetAcceleratorCountRequestArgs(
        @Nullable Input<Integer> max,
        @Nullable Input<Integer> min) {
        this.max = max;
        this.min = min;
    }

    private EC2FleetAcceleratorCountRequestArgs() {
        this.max = Input.empty();
        this.min = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetAcceleratorCountRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> max;
        private @Nullable Input<Integer> min;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetAcceleratorCountRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(@Nullable Input<Integer> max) {
            this.max = max;
            return this;
        }

        public Builder setMax(@Nullable Integer max) {
            this.max = Input.ofNullable(max);
            return this;
        }

        public Builder setMin(@Nullable Input<Integer> min) {
            this.min = min;
            return this;
        }

        public Builder setMin(@Nullable Integer min) {
            this.min = Input.ofNullable(min);
            return this;
        }
        public EC2FleetAcceleratorCountRequestArgs build() {
            return new EC2FleetAcceleratorCountRequestArgs(max, min);
        }
    }
}
