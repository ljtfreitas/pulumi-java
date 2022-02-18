// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.PortArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for public IP address sharing.
 * 
 */
public final class SubnetSharedPublicIpAddressConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetSharedPublicIpAddressConfigurationArgs Empty = new SubnetSharedPublicIpAddressConfigurationArgs();

    /**
     * Backend ports that virtual machines on this subnet are allowed to expose
     * 
     */
    @InputImport(name="allowedPorts")
    private final @Nullable Input<List<PortArgs>> allowedPorts;

    public Input<List<PortArgs>> getAllowedPorts() {
        return this.allowedPorts == null ? Input.empty() : this.allowedPorts;
    }

    public SubnetSharedPublicIpAddressConfigurationArgs(@Nullable Input<List<PortArgs>> allowedPorts) {
        this.allowedPorts = allowedPorts;
    }

    private SubnetSharedPublicIpAddressConfigurationArgs() {
        this.allowedPorts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetSharedPublicIpAddressConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PortArgs>> allowedPorts;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetSharedPublicIpAddressConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPorts = defaults.allowedPorts;
        }

        public Builder setAllowedPorts(@Nullable Input<List<PortArgs>> allowedPorts) {
            this.allowedPorts = allowedPorts;
            return this;
        }

        public Builder setAllowedPorts(@Nullable List<PortArgs> allowedPorts) {
            this.allowedPorts = Input.ofNullable(allowedPorts);
            return this;
        }

        public SubnetSharedPublicIpAddressConfigurationArgs build() {
            return new SubnetSharedPublicIpAddressConfigurationArgs(allowedPorts);
        }
    }
}
