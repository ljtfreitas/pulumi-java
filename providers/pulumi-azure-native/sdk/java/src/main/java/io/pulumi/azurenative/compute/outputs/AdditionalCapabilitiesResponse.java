// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdditionalCapabilitiesResponse {
    /**
     * The flag that enables or disables a capability to have one or more managed data disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     * 
     */
    private final @Nullable Boolean ultraSSDEnabled;

    @CustomType.Constructor
    private AdditionalCapabilitiesResponse(@CustomType.Parameter("ultraSSDEnabled") @Nullable Boolean ultraSSDEnabled) {
        this.ultraSSDEnabled = ultraSSDEnabled;
    }

    /**
     * The flag that enables or disables a capability to have one or more managed data disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     * 
    */
    public Optional<Boolean> getUltraSSDEnabled() {
        return Optional.ofNullable(this.ultraSSDEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalCapabilitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ultraSSDEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalCapabilitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ultraSSDEnabled = defaults.ultraSSDEnabled;
        }

        public Builder ultraSSDEnabled(@Nullable Boolean ultraSSDEnabled) {
            this.ultraSSDEnabled = ultraSSDEnabled;
            return this;
        }
        public AdditionalCapabilitiesResponse build() {
            return new AdditionalCapabilitiesResponse(ultraSSDEnabled);
        }
    }
}
