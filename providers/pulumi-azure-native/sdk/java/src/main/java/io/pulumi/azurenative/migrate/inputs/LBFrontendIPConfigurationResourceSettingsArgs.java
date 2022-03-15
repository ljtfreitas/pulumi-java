// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.SubnetReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines load balancer frontend IP configuration properties.
 * 
 */
public final class LBFrontendIPConfigurationResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LBFrontendIPConfigurationResourceSettingsArgs Empty = new LBFrontendIPConfigurationResourceSettingsArgs();

    /**
     * Gets or sets the frontend IP configuration name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Gets or sets the IP address of the Load Balancer.This is only specified if a specific
     * private IP address shall be allocated from the subnet specified in subnetRef.
     * 
     */
    @Import(name="privateIpAddress")
      private final @Nullable Output<String> privateIpAddress;

    public Output<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Output.empty() : this.privateIpAddress;
    }

    /**
     * Gets or sets PrivateIP allocation method (Static/Dynamic).
     * 
     */
    @Import(name="privateIpAllocationMethod")
      private final @Nullable Output<String> privateIpAllocationMethod;

    public Output<String> getPrivateIpAllocationMethod() {
        return this.privateIpAllocationMethod == null ? Output.empty() : this.privateIpAllocationMethod;
    }

    /**
     * Defines reference to subnet.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<SubnetReferenceArgs> subnet;

    public Output<SubnetReferenceArgs> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    /**
     * Gets or sets the csv list of zones.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<String> zones;

    public Output<String> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public LBFrontendIPConfigurationResourceSettingsArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> privateIpAddress,
        @Nullable Output<String> privateIpAllocationMethod,
        @Nullable Output<SubnetReferenceArgs> subnet,
        @Nullable Output<String> zones) {
        this.name = name;
        this.privateIpAddress = privateIpAddress;
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        this.subnet = subnet;
        this.zones = zones;
    }

    private LBFrontendIPConfigurationResourceSettingsArgs() {
        this.name = Output.empty();
        this.privateIpAddress = Output.empty();
        this.privateIpAllocationMethod = Output.empty();
        this.subnet = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LBFrontendIPConfigurationResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> privateIpAddress;
        private @Nullable Output<String> privateIpAllocationMethod;
        private @Nullable Output<SubnetReferenceArgs> subnet;
        private @Nullable Output<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(LBFrontendIPConfigurationResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAllocationMethod = defaults.privateIpAllocationMethod;
    	      this.subnet = defaults.subnet;
    	      this.zones = defaults.zones;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Output.ofNullable(privateIpAddress);
            return this;
        }

        public Builder privateIpAllocationMethod(@Nullable Output<String> privateIpAllocationMethod) {
            this.privateIpAllocationMethod = privateIpAllocationMethod;
            return this;
        }

        public Builder privateIpAllocationMethod(@Nullable String privateIpAllocationMethod) {
            this.privateIpAllocationMethod = Output.ofNullable(privateIpAllocationMethod);
            return this;
        }

        public Builder subnet(@Nullable Output<SubnetReferenceArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable SubnetReferenceArgs subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }

        public Builder zones(@Nullable Output<String> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable String zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public LBFrontendIPConfigurationResourceSettingsArgs build() {
            return new LBFrontendIPConfigurationResourceSettingsArgs(name, privateIpAddress, privateIpAllocationMethod, subnet, zones);
        }
    }
}
