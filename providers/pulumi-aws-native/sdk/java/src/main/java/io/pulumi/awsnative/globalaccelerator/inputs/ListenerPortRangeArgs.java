// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * A port range to support for connections from  clients to your accelerator.
 * 
 */
public final class ListenerPortRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerPortRangeArgs Empty = new ListenerPortRangeArgs();

    @Import(name="fromPort", required=true)
      private final Output<Integer> fromPort;

    public Output<Integer> getFromPort() {
        return this.fromPort;
    }

    @Import(name="toPort", required=true)
      private final Output<Integer> toPort;

    public Output<Integer> getToPort() {
        return this.toPort;
    }

    public ListenerPortRangeArgs(
        Output<Integer> fromPort,
        Output<Integer> toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private ListenerPortRangeArgs() {
        this.fromPort = Output.empty();
        this.toPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerPortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> fromPort;
        private Output<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerPortRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Output<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Output.of(Objects.requireNonNull(fromPort));
            return this;
        }

        public Builder toPort(Output<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }

        public Builder toPort(Integer toPort) {
            this.toPort = Output.of(Objects.requireNonNull(toPort));
            return this;
        }
        public ListenerPortRangeArgs build() {
            return new ListenerPortRangeArgs(fromPort, toPort);
        }
    }
}
