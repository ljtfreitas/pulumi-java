// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules.inputs;

import io.pulumi.azurenative.hardwaresecuritymodules.inputs.ApiEntityReferenceArgs;
import io.pulumi.azurenative.hardwaresecuritymodules.inputs.NetworkInterfaceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * Specifies the list of resource Ids for the network interfaces associated with the dedicated HSM.
     * 
     */
    @InputImport(name="networkInterfaces")
        private final @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces;

    public Input<List<NetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Input.empty() : this.networkInterfaces;
    }

    /**
     * Specifies the identifier of the subnet.
     * 
     */
    @InputImport(name="subnet")
        private final @Nullable Input<ApiEntityReferenceArgs> subnet;

    public Input<ApiEntityReferenceArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public NetworkProfileArgs(
        @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces,
        @Nullable Input<ApiEntityReferenceArgs> subnet) {
        this.networkInterfaces = networkInterfaces;
        this.subnet = subnet;
    }

    private NetworkProfileArgs() {
        this.networkInterfaces = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Input<ApiEntityReferenceArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.subnet = defaults.subnet;
        }

        public Builder setNetworkInterfaces(@Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable List<NetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Input.ofNullable(networkInterfaces);
            return this;
        }

        public Builder setSubnet(@Nullable Input<ApiEntityReferenceArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable ApiEntityReferenceArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }
        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(networkInterfaces, subnet);
        }
    }
}
