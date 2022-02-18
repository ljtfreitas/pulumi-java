// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Port range details
 * 
 */
public final class EndpointRangeDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointRangeDescriptionResponse Empty = new EndpointRangeDescriptionResponse();

    /**
     * End port of a range of ports
     * 
     */
    @InputImport(name="endPort", required=true)
    private final Integer endPort;

    public Integer getEndPort() {
        return this.endPort;
    }

    /**
     * Starting port of a range of ports
     * 
     */
    @InputImport(name="startPort", required=true)
    private final Integer startPort;

    public Integer getStartPort() {
        return this.startPort;
    }

    public EndpointRangeDescriptionResponse(
        Integer endPort,
        Integer startPort) {
        this.endPort = Objects.requireNonNull(endPort, "expected parameter 'endPort' to be non-null");
        this.startPort = Objects.requireNonNull(startPort, "expected parameter 'startPort' to be non-null");
    }

    private EndpointRangeDescriptionResponse() {
        this.endPort = null;
        this.startPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointRangeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer endPort;
        private Integer startPort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointRangeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPort = defaults.endPort;
    	      this.startPort = defaults.startPort;
        }

        public Builder setEndPort(Integer endPort) {
            this.endPort = Objects.requireNonNull(endPort);
            return this;
        }

        public Builder setStartPort(Integer startPort) {
            this.startPort = Objects.requireNonNull(startPort);
            return this;
        }

        public EndpointRangeDescriptionResponse build() {
            return new EndpointRangeDescriptionResponse(endPort, startPort);
        }
    }
}
