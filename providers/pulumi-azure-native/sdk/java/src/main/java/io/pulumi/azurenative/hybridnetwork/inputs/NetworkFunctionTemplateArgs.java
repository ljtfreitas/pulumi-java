// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.NetworkFunctionRoleConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The network function template.
 * 
 */
public final class NetworkFunctionTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkFunctionTemplateArgs Empty = new NetworkFunctionTemplateArgs();

    /**
     * An array of network function role definitions.
     * 
     */
    @InputImport(name="networkFunctionRoleConfigurations")
    private final @Nullable Input<List<NetworkFunctionRoleConfigurationArgs>> networkFunctionRoleConfigurations;

    public Input<List<NetworkFunctionRoleConfigurationArgs>> getNetworkFunctionRoleConfigurations() {
        return this.networkFunctionRoleConfigurations == null ? Input.empty() : this.networkFunctionRoleConfigurations;
    }

    public NetworkFunctionTemplateArgs(@Nullable Input<List<NetworkFunctionRoleConfigurationArgs>> networkFunctionRoleConfigurations) {
        this.networkFunctionRoleConfigurations = networkFunctionRoleConfigurations;
    }

    private NetworkFunctionTemplateArgs() {
        this.networkFunctionRoleConfigurations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NetworkFunctionRoleConfigurationArgs>> networkFunctionRoleConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkFunctionTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkFunctionRoleConfigurations = defaults.networkFunctionRoleConfigurations;
        }

        public Builder setNetworkFunctionRoleConfigurations(@Nullable Input<List<NetworkFunctionRoleConfigurationArgs>> networkFunctionRoleConfigurations) {
            this.networkFunctionRoleConfigurations = networkFunctionRoleConfigurations;
            return this;
        }

        public Builder setNetworkFunctionRoleConfigurations(@Nullable List<NetworkFunctionRoleConfigurationArgs> networkFunctionRoleConfigurations) {
            this.networkFunctionRoleConfigurations = Input.ofNullable(networkFunctionRoleConfigurations);
            return this;
        }

        public NetworkFunctionTemplateArgs build() {
            return new NetworkFunctionTemplateArgs(networkFunctionRoleConfigurations);
        }
    }
}
