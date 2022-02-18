// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PortResponse {
    /**
     * Backend port of the target virtual machine.
     * 
     */
    private final @Nullable Integer backendPort;
    /**
     * Protocol type of the port.
     * 
     */
    private final @Nullable String transportProtocol;

    @OutputCustomType.Constructor({"backendPort","transportProtocol"})
    private PortResponse(
        @Nullable Integer backendPort,
        @Nullable String transportProtocol) {
        this.backendPort = backendPort;
        this.transportProtocol = transportProtocol;
    }

    /**
     * Backend port of the target virtual machine.
     * 
     */
    public Optional<Integer> getBackendPort() {
        return Optional.ofNullable(this.backendPort);
    }
    /**
     * Protocol type of the port.
     * 
     */
    public Optional<String> getTransportProtocol() {
        return Optional.ofNullable(this.transportProtocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backendPort;
        private @Nullable String transportProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(PortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.transportProtocol = defaults.transportProtocol;
        }

        public Builder setBackendPort(@Nullable Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        public Builder setTransportProtocol(@Nullable String transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }

        public PortResponse build() {
            return new PortResponse(backendPort, transportProtocol);
        }
    }
}
