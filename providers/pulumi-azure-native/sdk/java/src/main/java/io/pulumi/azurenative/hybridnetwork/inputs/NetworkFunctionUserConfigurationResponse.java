// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.NetworkFunctionUserConfigurationResponseOsProfile;
import io.pulumi.azurenative.hybridnetwork.inputs.NetworkInterfaceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network function user configuration.
 * 
 */
public final class NetworkFunctionUserConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkFunctionUserConfigurationResponse Empty = new NetworkFunctionUserConfigurationResponse();

    /**
     * The network interface configuration.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }

    /**
     * Specifies the operating system settings for the role instance.
     * 
     */
    @Import(name="osProfile")
      private final @Nullable NetworkFunctionUserConfigurationResponseOsProfile osProfile;

    public Optional<NetworkFunctionUserConfigurationResponseOsProfile> getOsProfile() {
        return this.osProfile == null ? Optional.empty() : Optional.ofNullable(this.osProfile);
    }

    /**
     * The name of the network function role.
     * 
     */
    @Import(name="roleName")
      private final @Nullable String roleName;

    public Optional<String> getRoleName() {
        return this.roleName == null ? Optional.empty() : Optional.ofNullable(this.roleName);
    }

    /**
     * The user data parameters from the customer.
     * 
     */
    @Import(name="userDataParameters")
      private final @Nullable Object userDataParameters;

    public Optional<Object> getUserDataParameters() {
        return this.userDataParameters == null ? Optional.empty() : Optional.ofNullable(this.userDataParameters);
    }

    public NetworkFunctionUserConfigurationResponse(
        @Nullable List<NetworkInterfaceResponse> networkInterfaces,
        @Nullable NetworkFunctionUserConfigurationResponseOsProfile osProfile,
        @Nullable String roleName,
        @Nullable Object userDataParameters) {
        this.networkInterfaces = networkInterfaces;
        this.osProfile = osProfile;
        this.roleName = roleName;
        this.userDataParameters = userDataParameters;
    }

    private NetworkFunctionUserConfigurationResponse() {
        this.networkInterfaces = List.of();
        this.osProfile = null;
        this.roleName = null;
        this.userDataParameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionUserConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NetworkInterfaceResponse> networkInterfaces;
        private @Nullable NetworkFunctionUserConfigurationResponseOsProfile osProfile;
        private @Nullable String roleName;
        private @Nullable Object userDataParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkFunctionUserConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.osProfile = defaults.osProfile;
    	      this.roleName = defaults.roleName;
    	      this.userDataParameters = defaults.userDataParameters;
        }

        public Builder networkInterfaces(@Nullable List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder osProfile(@Nullable NetworkFunctionUserConfigurationResponseOsProfile osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder roleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder userDataParameters(@Nullable Object userDataParameters) {
            this.userDataParameters = userDataParameters;
            return this;
        }
        public NetworkFunctionUserConfigurationResponse build() {
            return new NetworkFunctionUserConfigurationResponse(networkInterfaces, osProfile, roleName, userDataParameters);
        }
    }
}
