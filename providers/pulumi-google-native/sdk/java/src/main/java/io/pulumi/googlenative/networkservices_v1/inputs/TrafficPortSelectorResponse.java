// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specification of a port-based selector.
 * 
 */
public final class TrafficPortSelectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrafficPortSelectorResponse Empty = new TrafficPortSelectorResponse();

    /**
     * Optional. A list of ports. Can be port numbers or port range (example, [80-90] specifies all ports from 80 to 90, including 80 and 90) or named ports or * to specify all ports. If the list is empty, all ports are selected.
     * 
     */
    @InputImport(name="ports", required=true)
      private final List<String> ports;

    public List<String> getPorts() {
        return this.ports;
    }

    public TrafficPortSelectorResponse(List<String> ports) {
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private TrafficPortSelectorResponse() {
        this.ports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficPortSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficPortSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
        }

        public Builder setPorts(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public TrafficPortSelectorResponse build() {
            return new TrafficPortSelectorResponse(ports);
        }
    }
}
