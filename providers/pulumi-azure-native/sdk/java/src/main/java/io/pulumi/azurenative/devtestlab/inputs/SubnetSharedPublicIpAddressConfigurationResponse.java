// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.PortResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for public IP address sharing.
 * 
 */
public final class SubnetSharedPublicIpAddressConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubnetSharedPublicIpAddressConfigurationResponse Empty = new SubnetSharedPublicIpAddressConfigurationResponse();

    /**
     * Backend ports that virtual machines on this subnet are allowed to expose
     * 
     */
    @Import(name="allowedPorts")
      private final @Nullable List<PortResponse> allowedPorts;

    public List<PortResponse> getAllowedPorts() {
        return this.allowedPorts == null ? List.of() : this.allowedPorts;
    }

    public SubnetSharedPublicIpAddressConfigurationResponse(@Nullable List<PortResponse> allowedPorts) {
        this.allowedPorts = allowedPorts;
    }

    private SubnetSharedPublicIpAddressConfigurationResponse() {
        this.allowedPorts = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetSharedPublicIpAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PortResponse> allowedPorts;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetSharedPublicIpAddressConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPorts = defaults.allowedPorts;
        }

        public Builder allowedPorts(@Nullable List<PortResponse> allowedPorts) {
            this.allowedPorts = allowedPorts;
            return this;
        }
        public SubnetSharedPublicIpAddressConfigurationResponse build() {
            return new SubnetSharedPublicIpAddressConfigurationResponse(allowedPorts);
        }
    }
}
