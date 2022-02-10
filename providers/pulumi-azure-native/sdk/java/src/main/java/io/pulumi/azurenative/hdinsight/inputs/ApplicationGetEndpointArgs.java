// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationGetEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGetEndpointArgs Empty = new ApplicationGetEndpointArgs();

    @InputImport(name="destinationPort")
    private final @Nullable Input<Integer> destinationPort;

    public Input<Integer> getDestinationPort() {
        return this.destinationPort == null ? Input.empty() : this.destinationPort;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="privateIPAddress")
    private final @Nullable Input<String> privateIPAddress;

    public Input<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Input.empty() : this.privateIPAddress;
    }

    @InputImport(name="publicPort")
    private final @Nullable Input<Integer> publicPort;

    public Input<Integer> getPublicPort() {
        return this.publicPort == null ? Input.empty() : this.publicPort;
    }

    public ApplicationGetEndpointArgs(
        @Nullable Input<Integer> destinationPort,
        @Nullable Input<String> location,
        @Nullable Input<String> privateIPAddress,
        @Nullable Input<Integer> publicPort) {
        this.destinationPort = destinationPort;
        this.location = location;
        this.privateIPAddress = privateIPAddress;
        this.publicPort = publicPort;
    }

    private ApplicationGetEndpointArgs() {
        this.destinationPort = Input.empty();
        this.location = Input.empty();
        this.privateIPAddress = Input.empty();
        this.publicPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGetEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> destinationPort;
        private @Nullable Input<String> location;
        private @Nullable Input<String> privateIPAddress;
        private @Nullable Input<Integer> publicPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGetEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPort = defaults.destinationPort;
    	      this.location = defaults.location;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicPort = defaults.publicPort;
        }

        public Builder setDestinationPort(@Nullable Input<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder setDestinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Input.ofNullable(destinationPort);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable Input<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Input.ofNullable(privateIPAddress);
            return this;
        }

        public Builder setPublicPort(@Nullable Input<Integer> publicPort) {
            this.publicPort = publicPort;
            return this;
        }

        public Builder setPublicPort(@Nullable Integer publicPort) {
            this.publicPort = Input.ofNullable(publicPort);
            return this;
        }

        public ApplicationGetEndpointArgs build() {
            return new ApplicationGetEndpointArgs(destinationPort, location, privateIPAddress, publicPort);
        }
    }
}