// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gets the application SSH endpoint
 * 
 */
public final class ApplicationGetEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGetEndpointResponse Empty = new ApplicationGetEndpointResponse();

    /**
     * The destination port to connect to.
     * 
     */
    @Import(name="destinationPort")
      private final @Nullable Integer destinationPort;

    public Optional<Integer> getDestinationPort() {
        return this.destinationPort == null ? Optional.empty() : Optional.ofNullable(this.destinationPort);
    }

    /**
     * The location of the endpoint.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * The private ip address of the endpoint.
     * 
     */
    @Import(name="privateIPAddress")
      private final @Nullable String privateIPAddress;

    public Optional<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIPAddress);
    }

    /**
     * The public port to connect to.
     * 
     */
    @Import(name="publicPort")
      private final @Nullable Integer publicPort;

    public Optional<Integer> getPublicPort() {
        return this.publicPort == null ? Optional.empty() : Optional.ofNullable(this.publicPort);
    }

    public ApplicationGetEndpointResponse(
        @Nullable Integer destinationPort,
        @Nullable String location,
        @Nullable String privateIPAddress,
        @Nullable Integer publicPort) {
        this.destinationPort = destinationPort;
        this.location = location;
        this.privateIPAddress = privateIPAddress;
        this.publicPort = publicPort;
    }

    private ApplicationGetEndpointResponse() {
        this.destinationPort = null;
        this.location = null;
        this.privateIPAddress = null;
        this.publicPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGetEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer destinationPort;
        private @Nullable String location;
        private @Nullable String privateIPAddress;
        private @Nullable Integer publicPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGetEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPort = defaults.destinationPort;
    	      this.location = defaults.location;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicPort = defaults.publicPort;
        }

        public Builder destinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder publicPort(@Nullable Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public ApplicationGetEndpointResponse build() {
            return new ApplicationGetEndpointResponse(destinationPort, location, privateIPAddress, publicPort);
        }
    }
}
