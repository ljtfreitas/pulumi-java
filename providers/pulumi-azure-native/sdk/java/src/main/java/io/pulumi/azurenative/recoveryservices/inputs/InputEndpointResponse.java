// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure VM input endpoint details.
 * 
 */
public final class InputEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final InputEndpointResponse Empty = new InputEndpointResponse();

    /**
     * The input endpoint name.
     * 
     */
    @InputImport(name="endpointName")
        private final @Nullable String endpointName;

    public Optional<String> getEndpointName() {
        return this.endpointName == null ? Optional.empty() : Optional.ofNullable(this.endpointName);
    }

    /**
     * The input endpoint private port.
     * 
     */
    @InputImport(name="privatePort")
        private final @Nullable Integer privatePort;

    public Optional<Integer> getPrivatePort() {
        return this.privatePort == null ? Optional.empty() : Optional.ofNullable(this.privatePort);
    }

    /**
     * The input endpoint protocol.
     * 
     */
    @InputImport(name="protocol")
        private final @Nullable String protocol;

    public Optional<String> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * The input endpoint public port.
     * 
     */
    @InputImport(name="publicPort")
        private final @Nullable Integer publicPort;

    public Optional<Integer> getPublicPort() {
        return this.publicPort == null ? Optional.empty() : Optional.ofNullable(this.publicPort);
    }

    public InputEndpointResponse(
        @Nullable String endpointName,
        @Nullable Integer privatePort,
        @Nullable String protocol,
        @Nullable Integer publicPort) {
        this.endpointName = endpointName;
        this.privatePort = privatePort;
        this.protocol = protocol;
        this.publicPort = publicPort;
    }

    private InputEndpointResponse() {
        this.endpointName = null;
        this.privatePort = null;
        this.protocol = null;
        this.publicPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointName;
        private @Nullable Integer privatePort;
        private @Nullable String protocol;
        private @Nullable Integer publicPort;

        public Builder() {
    	      // Empty
        }

        public Builder(InputEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.privatePort = defaults.privatePort;
    	      this.protocol = defaults.protocol;
    	      this.publicPort = defaults.publicPort;
        }

        public Builder setEndpointName(@Nullable String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        public Builder setPrivatePort(@Nullable Integer privatePort) {
            this.privatePort = privatePort;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setPublicPort(@Nullable Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public InputEndpointResponse build() {
            return new InputEndpointResponse(endpointName, privatePort, protocol, publicPort);
        }
    }
}
