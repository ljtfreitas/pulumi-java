// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.azurenative.virtualmachineimages.inputs.VirtualNetworkConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the virtual machine used to build, customize and capture images
 * 
 */
public final class ImageTemplateVmProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageTemplateVmProfileArgs Empty = new ImageTemplateVmProfileArgs();

    /**
     * Size of the OS disk in GB. Omit or specify 0 to use Azure's default OS disk size.
     * 
     */
    @InputImport(name="osDiskSizeGB")
    private final @Nullable Input<Integer> osDiskSizeGB;

    public Input<Integer> getOsDiskSizeGB() {
        return this.osDiskSizeGB == null ? Input.empty() : this.osDiskSizeGB;
    }

    /**
     * Size of the virtual machine used to build, customize and capture images. Omit or specify empty string to use the default (Standard_D1_v2 for Gen1 images and Standard_D2ds_v4 for Gen2 images).
     * 
     */
    @InputImport(name="vmSize")
    private final @Nullable Input<String> vmSize;

    public Input<String> getVmSize() {
        return this.vmSize == null ? Input.empty() : this.vmSize;
    }

    /**
     * Optional configuration of the virtual network to use to deploy the build virtual machine in. Omit if no specific virtual network needs to be used.
     * 
     */
    @InputImport(name="vnetConfig")
    private final @Nullable Input<VirtualNetworkConfigArgs> vnetConfig;

    public Input<VirtualNetworkConfigArgs> getVnetConfig() {
        return this.vnetConfig == null ? Input.empty() : this.vnetConfig;
    }

    public ImageTemplateVmProfileArgs(
        @Nullable Input<Integer> osDiskSizeGB,
        @Nullable Input<String> vmSize,
        @Nullable Input<VirtualNetworkConfigArgs> vnetConfig) {
        this.osDiskSizeGB = osDiskSizeGB == null ? Input.ofNullable(0) : osDiskSizeGB;
        this.vmSize = vmSize == null ? Input.ofNullable("") : vmSize;
        this.vnetConfig = vnetConfig;
    }

    private ImageTemplateVmProfileArgs() {
        this.osDiskSizeGB = Input.empty();
        this.vmSize = Input.empty();
        this.vnetConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateVmProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> osDiskSizeGB;
        private @Nullable Input<String> vmSize;
        private @Nullable Input<VirtualNetworkConfigArgs> vnetConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateVmProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osDiskSizeGB = defaults.osDiskSizeGB;
    	      this.vmSize = defaults.vmSize;
    	      this.vnetConfig = defaults.vnetConfig;
        }

        public Builder setOsDiskSizeGB(@Nullable Input<Integer> osDiskSizeGB) {
            this.osDiskSizeGB = osDiskSizeGB;
            return this;
        }

        public Builder setOsDiskSizeGB(@Nullable Integer osDiskSizeGB) {
            this.osDiskSizeGB = Input.ofNullable(osDiskSizeGB);
            return this;
        }

        public Builder setVmSize(@Nullable Input<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = Input.ofNullable(vmSize);
            return this;
        }

        public Builder setVnetConfig(@Nullable Input<VirtualNetworkConfigArgs> vnetConfig) {
            this.vnetConfig = vnetConfig;
            return this;
        }

        public Builder setVnetConfig(@Nullable VirtualNetworkConfigArgs vnetConfig) {
            this.vnetConfig = Input.ofNullable(vnetConfig);
            return this;
        }

        public ImageTemplateVmProfileArgs build() {
            return new ImageTemplateVmProfileArgs(osDiskSizeGB, vmSize, vnetConfig);
        }
    }
}
