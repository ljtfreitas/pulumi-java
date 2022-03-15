// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a cloud service IP Configuration
 * 
 */
public final class LoadBalancerFrontendIPConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerFrontendIPConfigurationPropertiesArgs Empty = new LoadBalancerFrontendIPConfigurationPropertiesArgs();

    /**
     * The virtual network private IP address of the IP configuration.
     * 
     */
    @Import(name="privateIPAddress")
      private final @Nullable Output<String> privateIPAddress;

    public Output<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Output.empty() : this.privateIPAddress;
    }

    /**
     * The reference to the public ip address resource.
     * 
     */
    @Import(name="publicIPAddress")
      private final @Nullable Output<SubResourceArgs> publicIPAddress;

    public Output<SubResourceArgs> getPublicIPAddress() {
        return this.publicIPAddress == null ? Output.empty() : this.publicIPAddress;
    }

    /**
     * The reference to the virtual network subnet resource.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<SubResourceArgs> subnet;

    public Output<SubResourceArgs> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    public LoadBalancerFrontendIPConfigurationPropertiesArgs(
        @Nullable Output<String> privateIPAddress,
        @Nullable Output<SubResourceArgs> publicIPAddress,
        @Nullable Output<SubResourceArgs> subnet) {
        this.privateIPAddress = privateIPAddress;
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
    }

    private LoadBalancerFrontendIPConfigurationPropertiesArgs() {
        this.privateIPAddress = Output.empty();
        this.publicIPAddress = Output.empty();
        this.subnet = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerFrontendIPConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> privateIPAddress;
        private @Nullable Output<SubResourceArgs> publicIPAddress;
        private @Nullable Output<SubResourceArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerFrontendIPConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
        }

        public Builder privateIPAddress(@Nullable Output<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Output.ofNullable(privateIPAddress);
            return this;
        }

        public Builder publicIPAddress(@Nullable Output<SubResourceArgs> publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder publicIPAddress(@Nullable SubResourceArgs publicIPAddress) {
            this.publicIPAddress = Output.ofNullable(publicIPAddress);
            return this;
        }

        public Builder subnet(@Nullable Output<SubResourceArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable SubResourceArgs subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }
        public LoadBalancerFrontendIPConfigurationPropertiesArgs build() {
            return new LoadBalancerFrontendIPConfigurationPropertiesArgs(privateIPAddress, publicIPAddress, subnet);
        }
    }
}
