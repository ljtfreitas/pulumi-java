// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Vpn NatRule mapping.
 * 
 */
public final class VpnNatRuleMappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnNatRuleMappingResponse Empty = new VpnNatRuleMappingResponse();

    /**
     * Address space for Vpn NatRule mapping.
     * 
     */
    @InputImport(name="addressSpace")
    private final @Nullable String addressSpace;

    public Optional<String> getAddressSpace() {
        return this.addressSpace == null ? Optional.empty() : Optional.ofNullable(this.addressSpace);
    }

    public VpnNatRuleMappingResponse(@Nullable String addressSpace) {
        this.addressSpace = addressSpace;
    }

    private VpnNatRuleMappingResponse() {
        this.addressSpace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnNatRuleMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressSpace;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnNatRuleMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
        }

        public Builder setAddressSpace(@Nullable String addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }

        public VpnNatRuleMappingResponse build() {
            return new VpnNatRuleMappingResponse(addressSpace);
        }
    }
}
