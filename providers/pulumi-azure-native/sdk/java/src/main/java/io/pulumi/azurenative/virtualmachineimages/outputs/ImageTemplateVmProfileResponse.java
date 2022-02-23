// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.azurenative.virtualmachineimages.outputs.VirtualNetworkConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageTemplateVmProfileResponse {
    /**
     * Size of the OS disk in GB. Omit or specify 0 to use Azure's default OS disk size.
     * 
     */
    private final @Nullable Integer osDiskSizeGB;
    /**
     * Size of the virtual machine used to build, customize and capture images. Omit or specify empty string to use the default (Standard_D1_v2 for Gen1 images and Standard_D2ds_v4 for Gen2 images).
     * 
     */
    private final @Nullable String vmSize;
    /**
     * Optional configuration of the virtual network to use to deploy the build virtual machine in. Omit if no specific virtual network needs to be used.
     * 
     */
    private final @Nullable VirtualNetworkConfigResponse vnetConfig;

    @OutputCustomType.Constructor({"osDiskSizeGB","vmSize","vnetConfig"})
    private ImageTemplateVmProfileResponse(
        @Nullable Integer osDiskSizeGB,
        @Nullable String vmSize,
        @Nullable VirtualNetworkConfigResponse vnetConfig) {
        this.osDiskSizeGB = osDiskSizeGB;
        this.vmSize = vmSize;
        this.vnetConfig = vnetConfig;
    }

    /**
     * Size of the OS disk in GB. Omit or specify 0 to use Azure's default OS disk size.
     * 
     */
    public Optional<Integer> getOsDiskSizeGB() {
        return Optional.ofNullable(this.osDiskSizeGB);
    }
    /**
     * Size of the virtual machine used to build, customize and capture images. Omit or specify empty string to use the default (Standard_D1_v2 for Gen1 images and Standard_D2ds_v4 for Gen2 images).
     * 
     */
    public Optional<String> getVmSize() {
        return Optional.ofNullable(this.vmSize);
    }
    /**
     * Optional configuration of the virtual network to use to deploy the build virtual machine in. Omit if no specific virtual network needs to be used.
     * 
     */
    public Optional<VirtualNetworkConfigResponse> getVnetConfig() {
        return Optional.ofNullable(this.vnetConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateVmProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer osDiskSizeGB;
        private @Nullable String vmSize;
        private @Nullable VirtualNetworkConfigResponse vnetConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateVmProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osDiskSizeGB = defaults.osDiskSizeGB;
    	      this.vmSize = defaults.vmSize;
    	      this.vnetConfig = defaults.vnetConfig;
        }

        public Builder setOsDiskSizeGB(@Nullable Integer osDiskSizeGB) {
            this.osDiskSizeGB = osDiskSizeGB;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVnetConfig(@Nullable VirtualNetworkConfigResponse vnetConfig) {
            this.vnetConfig = vnetConfig;
            return this;
        }
        public ImageTemplateVmProfileResponse build() {
            return new ImageTemplateVmProfileResponse(osDiskSizeGB, vmSize, vnetConfig);
        }
    }
}
