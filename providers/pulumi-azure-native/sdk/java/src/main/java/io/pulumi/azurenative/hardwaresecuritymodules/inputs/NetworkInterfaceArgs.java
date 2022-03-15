// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The network interface definition.
 * 
 */
public final class NetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * Private Ip address of the interface
     * 
     */
    @Import(name="privateIpAddress")
      private final @Nullable Output<String> privateIpAddress;

    public Output<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Output.empty() : this.privateIpAddress;
    }

    public NetworkInterfaceArgs(@Nullable Output<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    private NetworkInterfaceArgs() {
        this.privateIpAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> privateIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIpAddress = defaults.privateIpAddress;
        }

        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Output.ofNullable(privateIpAddress);
            return this;
        }
        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(privateIpAddress);
        }
    }
}
