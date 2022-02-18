// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The hardware profile.
 * 
 */
public final class HardwareProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final HardwareProfileResponse Empty = new HardwareProfileResponse();

    /**
     * The size of the VM
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
