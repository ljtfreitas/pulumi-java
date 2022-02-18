// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.PortResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubnetSharedPublicIpAddressConfigurationResponse {
    /**
     * Backend ports that virtual machines on this subnet are allowed to expose
     * 
     */
    private final @Nullable List<PortResponse> allowedPorts;

    @OutputCustomType.Constructor({"allowedPorts"})
    private SubnetSharedPublicIpAddressConfigurationResponse(@Nullable List<PortResponse> allowedPorts) {
        this.allowedPorts = allowedPorts;
    }

    /**
     * Backend ports that virtual machines on this subnet are allowed to expose
     * 
     */
    public List<PortResponse> getAllowedPorts() {
        return this.allowedPorts == null ? List.of() : this.allowedPorts;
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

        public Builder setAllowedPorts(@Nullable List<PortResponse> allowedPorts) {
            this.allowedPorts = allowedPorts;
            return this;
        }

        public SubnetSharedPublicIpAddressConfigurationResponse build() {
            return new SubnetSharedPublicIpAddressConfigurationResponse(allowedPorts);
        }
    }
}
