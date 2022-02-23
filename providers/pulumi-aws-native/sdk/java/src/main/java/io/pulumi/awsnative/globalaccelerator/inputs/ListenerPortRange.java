// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * A port range to support for connections from  clients to your accelerator.
 * 
 */
public final class ListenerPortRange extends io.pulumi.resources.InvokeArgs {

    public static final ListenerPortRange Empty = new ListenerPortRange();

    @InputImport(name="fromPort", required=true)
        private final Integer fromPort;

    public Integer getFromPort() {
        return this.fromPort;
    }

    @InputImport(name="toPort", required=true)
        private final Integer toPort;

    public Integer getToPort() {
        return this.toPort;
    }

    public ListenerPortRange(
        Integer fromPort,
        Integer toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private ListenerPortRange() {
        this.fromPort = null;
        this.toPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public ListenerPortRange build() {
            return new ListenerPortRange(fromPort, toPort);
        }
    }
}
