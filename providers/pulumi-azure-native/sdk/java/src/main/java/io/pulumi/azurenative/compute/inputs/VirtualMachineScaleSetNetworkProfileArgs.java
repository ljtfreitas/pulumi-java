// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.NetworkApiVersion;
import io.pulumi.azurenative.compute.inputs.ApiEntityReferenceArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set network profile.
 * 
 */
public final class VirtualMachineScaleSetNetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetNetworkProfileArgs Empty = new VirtualMachineScaleSetNetworkProfileArgs();

    /**
     * A reference to a load balancer probe used to determine the health of an instance in the virtual machine scale set. The reference will be in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     * 
     */
    @InputImport(name="healthProbe")
        private final @Nullable Input<ApiEntityReferenceArgs> healthProbe;

    public Input<ApiEntityReferenceArgs> getHealthProbe() {
        return this.healthProbe == null ? Input.empty() : this.healthProbe;
    }

    /**
     * specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode 'Flexible'
     * 
     */
    @InputImport(name="networkApiVersion")
        private final @Nullable Input<Either<String,NetworkApiVersion>> networkApiVersion;

    public Input<Either<String,NetworkApiVersion>> getNetworkApiVersion() {
        return this.networkApiVersion == null ? Input.empty() : this.networkApiVersion;
    }

    /**
     * The list of network configurations.
     * 
     */
    @InputImport(name="networkInterfaceConfigurations")
        private final @Nullable Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations;

    public Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> getNetworkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations == null ? Input.empty() : this.networkInterfaceConfigurations;
    }

    public VirtualMachineScaleSetNetworkProfileArgs(
        @Nullable Input<ApiEntityReferenceArgs> healthProbe,
        @Nullable Input<Either<String,NetworkApiVersion>> networkApiVersion,
        @Nullable Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations) {
        this.healthProbe = healthProbe;
        this.networkApiVersion = networkApiVersion;
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
    }

    private VirtualMachineScaleSetNetworkProfileArgs() {
        this.healthProbe = Input.empty();
        this.networkApiVersion = Input.empty();
        this.networkInterfaceConfigurations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApiEntityReferenceArgs> healthProbe;
        private @Nullable Input<Either<String,NetworkApiVersion>> networkApiVersion;
        private @Nullable Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbe = defaults.healthProbe;
    	      this.networkApiVersion = defaults.networkApiVersion;
    	      this.networkInterfaceConfigurations = defaults.networkInterfaceConfigurations;
        }

        public Builder setHealthProbe(@Nullable Input<ApiEntityReferenceArgs> healthProbe) {
            this.healthProbe = healthProbe;
            return this;
        }

        public Builder setHealthProbe(@Nullable ApiEntityReferenceArgs healthProbe) {
            this.healthProbe = Input.ofNullable(healthProbe);
            return this;
        }

        public Builder setNetworkApiVersion(@Nullable Input<Either<String,NetworkApiVersion>> networkApiVersion) {
            this.networkApiVersion = networkApiVersion;
            return this;
        }

        public Builder setNetworkApiVersion(@Nullable Either<String,NetworkApiVersion> networkApiVersion) {
            this.networkApiVersion = Input.ofNullable(networkApiVersion);
            return this;
        }

        public Builder setNetworkInterfaceConfigurations(@Nullable Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations) {
            this.networkInterfaceConfigurations = networkInterfaceConfigurations;
            return this;
        }

        public Builder setNetworkInterfaceConfigurations(@Nullable List<VirtualMachineScaleSetNetworkConfigurationArgs> networkInterfaceConfigurations) {
            this.networkInterfaceConfigurations = Input.ofNullable(networkInterfaceConfigurations);
            return this;
        }
        public VirtualMachineScaleSetNetworkProfileArgs build() {
            return new VirtualMachineScaleSetNetworkProfileArgs(healthProbe, networkApiVersion, networkInterfaceConfigurations);
        }
    }
}
