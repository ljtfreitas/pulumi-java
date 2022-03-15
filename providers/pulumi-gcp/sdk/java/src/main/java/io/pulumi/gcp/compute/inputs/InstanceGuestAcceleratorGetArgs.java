// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGuestAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGuestAcceleratorGetArgs Empty = new InstanceGuestAcceleratorGetArgs();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public InstanceGuestAcceleratorGetArgs(
        Output<Integer> count,
        Output<String> type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceGuestAcceleratorGetArgs() {
        this.count = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGuestAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGuestAcceleratorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public InstanceGuestAcceleratorGetArgs build() {
            return new InstanceGuestAcceleratorGetArgs(count, type);
        }
    }
}
