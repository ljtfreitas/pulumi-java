// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMResourcesResponse {
    /**
     * The ARM id of the VM resource.
     * 
     */
    private final @Nullable String vmResourceId;

    @CustomType.Constructor
    private VMResourcesResponse(@CustomType.Parameter("vmResourceId") @Nullable String vmResourceId) {
        this.vmResourceId = vmResourceId;
    }

    /**
     * The ARM id of the VM resource.
     * 
    */
    public Optional<String> getVmResourceId() {
        return Optional.ofNullable(this.vmResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String vmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmResourceId = defaults.vmResourceId;
        }

        public Builder vmResourceId(@Nullable String vmResourceId) {
            this.vmResourceId = vmResourceId;
            return this;
        }
        public VMResourcesResponse build() {
            return new VMResourcesResponse(vmResourceId);
        }
    }
}
