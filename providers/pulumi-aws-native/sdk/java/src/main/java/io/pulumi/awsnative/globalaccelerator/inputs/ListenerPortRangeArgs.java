// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * A port range to support for connections from  clients to your accelerator.
 * 
 */
public final class ListenerPortRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerPortRangeArgs Empty = new ListenerPortRangeArgs();

    @InputImport(name="fromPort", required=true)
        private final Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort;
    }

    @InputImport(name="toPort", required=true)
        private final Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort;
    }

    public ListenerPortRangeArgs(
        Input<Integer> fromPort,
        Input<Integer> toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private ListenerPortRangeArgs() {
        this.fromPort = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerPortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> fromPort;
        private Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerPortRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(Input<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Input.of(Objects.requireNonNull(fromPort));
            return this;
        }

        public Builder setToPort(Input<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Input.of(Objects.requireNonNull(toPort));
            return this;
        }
        public ListenerPortRangeArgs build() {
            return new ListenerPortRangeArgs(fromPort, toPort);
        }
    }
}
