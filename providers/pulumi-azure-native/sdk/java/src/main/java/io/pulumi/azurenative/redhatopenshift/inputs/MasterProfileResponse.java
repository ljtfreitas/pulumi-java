// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MasterProfile represents a master profile.
 * 
 */
public final class MasterProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final MasterProfileResponse Empty = new MasterProfileResponse();

    /**
     * The Azure resource ID of the master subnet (immutable).
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable String subnetId;

    public Optional<String> getSubnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    /**
     * The size of the master VMs (immutable).
     * 
     */
    @InputImport(name="vmSize")
    private final @Nullable String vmSize;

    public Optional<String> getVmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    public MasterProfileResponse(
        @Nullable String subnetId,
        @Nullable String vmSize) {
        this.subnetId = subnetId;
        this.vmSize = vmSize;
    }

    private MasterProfileResponse() {
        this.subnetId = null;
        this.vmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetId;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public MasterProfileResponse build() {
            return new MasterProfileResponse(subnetId, vmSize);
        }
    }
}
