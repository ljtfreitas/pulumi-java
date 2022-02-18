// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the hardware settings for the virtual machine.
 * 
 */
public final class HardwareProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final HardwareProfileResponse Empty = new HardwareProfileResponse();

    /**
     * Specifies the size of the virtual machine. <br><br> The enum data type is currently deprecated and will be removed by December 23rd 2023. <br><br> Recommended way to get the list of available sizes is using these APIs: <br><br> [List all available virtual machine sizes in an availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) <br><br> [List all available virtual machine sizes in a region](https://docs.microsoft.com/rest/api/compute/resourceskus/list) <br><br> [List all available virtual machine sizes for resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information about virtual machine sizes, see [Sizes for virtual machines](https://docs.microsoft.com/azure/virtual-machines/sizes). <br><br> The available VM sizes depend on region and availability set.
     * 
     */
    @InputImport(name="vmSize")
    private final @Nullable String vmSize;

    public Optional<String> getVmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    public HardwareProfileResponse(@Nullable String vmSize) {
        this.vmSize = vmSize;
    }

    private HardwareProfileResponse() {
        this.vmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HardwareProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(HardwareProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public HardwareProfileResponse build() {
            return new HardwareProfileResponse(vmSize);
        }
    }
}
