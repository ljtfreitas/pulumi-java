// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.enums.NetworkFunctionRoleConfigurationType;
import io.pulumi.azurenative.hybridnetwork.enums.VirtualMachineSizeTypes;
import io.pulumi.azurenative.hybridnetwork.inputs.CustomProfileArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.NetworkInterfaceArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.OsProfileArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.StorageProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network function role configuration.
 * 
 */
public final class NetworkFunctionRoleConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkFunctionRoleConfigurationArgs Empty = new NetworkFunctionRoleConfigurationArgs();

    /**
     * Specifies the custom settings for the virtual machine.
     * 
     */
    @Import(name="customProfile")
      private final @Nullable Output<CustomProfileArgs> customProfile;

    public Output<CustomProfileArgs> getCustomProfile() {
        return this.customProfile == null ? Output.empty() : this.customProfile;
    }

    /**
     * The network interface configurations.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

    public Output<List<NetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Output.empty() : this.networkInterfaces;
    }

    /**
     * Specifies the operating system settings for the role instance. This value can be updated during the deployment of network function.
     * 
     */
    @Import(name="osProfile")
      private final @Nullable Output<OsProfileArgs> osProfile;

    public Output<OsProfileArgs> getOsProfile() {
        return this.osProfile == null ? Output.empty() : this.osProfile;
    }

    /**
     * The name of the network function role.
     * 
     */
    @Import(name="roleName")
      private final @Nullable Output<String> roleName;

    public Output<String> getRoleName() {
        return this.roleName == null ? Output.empty() : this.roleName;
    }

    /**
     * Role type.
     * 
     */
    @Import(name="roleType")
      private final @Nullable Output<Either<String,NetworkFunctionRoleConfigurationType>> roleType;

    public Output<Either<String,NetworkFunctionRoleConfigurationType>> getRoleType() {
        return this.roleType == null ? Output.empty() : this.roleType;
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Import(name="storageProfile")
      private final @Nullable Output<StorageProfileArgs> storageProfile;

    public Output<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Output.empty() : this.storageProfile;
    }

    /**
     * The user parameters for customers. The format of user data parameters has to be matched with the provided user data template.
     * 
     */
    @Import(name="userDataParameters")
      private final @Nullable Output<Object> userDataParameters;

    public Output<Object> getUserDataParameters() {
        return this.userDataParameters == null ? Output.empty() : this.userDataParameters;
    }

    /**
     * The user data template for customers. This is a json schema template describing the format and data type of user data parameters.
     * 
     */
    @Import(name="userDataTemplate")
      private final @Nullable Output<Object> userDataTemplate;

    public Output<Object> getUserDataTemplate() {
        return this.userDataTemplate == null ? Output.empty() : this.userDataTemplate;
    }

    /**
     * The size of the virtual machine.
     * 
     */
    @Import(name="virtualMachineSize")
      private final @Nullable Output<Either<String,VirtualMachineSizeTypes>> virtualMachineSize;

    public Output<Either<String,VirtualMachineSizeTypes>> getVirtualMachineSize() {
        return this.virtualMachineSize == null ? Output.empty() : this.virtualMachineSize;
    }

    public NetworkFunctionRoleConfigurationArgs(
        @Nullable Output<CustomProfileArgs> customProfile,
        @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces,
        @Nullable Output<OsProfileArgs> osProfile,
        @Nullable Output<String> roleName,
        @Nullable Output<Either<String,NetworkFunctionRoleConfigurationType>> roleType,
        @Nullable Output<StorageProfileArgs> storageProfile,
        @Nullable Output<Object> userDataParameters,
        @Nullable Output<Object> userDataTemplate,
        @Nullable Output<Either<String,VirtualMachineSizeTypes>> virtualMachineSize) {
        this.customProfile = customProfile;
        this.networkInterfaces = networkInterfaces;
        this.osProfile = osProfile;
        this.roleName = roleName;
        this.roleType = roleType;
        this.storageProfile = storageProfile;
        this.userDataParameters = userDataParameters;
        this.userDataTemplate = userDataTemplate;
        this.virtualMachineSize = virtualMachineSize;
    }

    private NetworkFunctionRoleConfigurationArgs() {
        this.customProfile = Output.empty();
        this.networkInterfaces = Output.empty();
        this.osProfile = Output.empty();
        this.roleName = Output.empty();
        this.roleType = Output.empty();
        this.storageProfile = Output.empty();
        this.userDataParameters = Output.empty();
        this.userDataTemplate = Output.empty();
        this.virtualMachineSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionRoleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CustomProfileArgs> customProfile;
        private @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Output<OsProfileArgs> osProfile;
        private @Nullable Output<String> roleName;
        private @Nullable Output<Either<String,NetworkFunctionRoleConfigurationType>> roleType;
        private @Nullable Output<StorageProfileArgs> storageProfile;
        private @Nullable Output<Object> userDataParameters;
        private @Nullable Output<Object> userDataTemplate;
        private @Nullable Output<Either<String,VirtualMachineSizeTypes>> virtualMachineSize;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkFunctionRoleConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customProfile = defaults.customProfile;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.osProfile = defaults.osProfile;
    	      this.roleName = defaults.roleName;
    	      this.roleType = defaults.roleType;
    	      this.storageProfile = defaults.storageProfile;
    	      this.userDataParameters = defaults.userDataParameters;
    	      this.userDataTemplate = defaults.userDataTemplate;
    	      this.virtualMachineSize = defaults.virtualMachineSize;
        }

        public Builder customProfile(@Nullable Output<CustomProfileArgs> customProfile) {
            this.customProfile = customProfile;
            return this;
        }

        public Builder customProfile(@Nullable CustomProfileArgs customProfile) {
            this.customProfile = Output.ofNullable(customProfile);
            return this;
        }

        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(@Nullable List<NetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Output.ofNullable(networkInterfaces);
            return this;
        }

        public Builder osProfile(@Nullable Output<OsProfileArgs> osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder osProfile(@Nullable OsProfileArgs osProfile) {
            this.osProfile = Output.ofNullable(osProfile);
            return this;
        }

        public Builder roleName(@Nullable Output<String> roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder roleName(@Nullable String roleName) {
            this.roleName = Output.ofNullable(roleName);
            return this;
        }

        public Builder roleType(@Nullable Output<Either<String,NetworkFunctionRoleConfigurationType>> roleType) {
            this.roleType = roleType;
            return this;
        }

        public Builder roleType(@Nullable Either<String,NetworkFunctionRoleConfigurationType> roleType) {
            this.roleType = Output.ofNullable(roleType);
            return this;
        }

        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder storageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Output.ofNullable(storageProfile);
            return this;
        }

        public Builder userDataParameters(@Nullable Output<Object> userDataParameters) {
            this.userDataParameters = userDataParameters;
            return this;
        }

        public Builder userDataParameters(@Nullable Object userDataParameters) {
            this.userDataParameters = Output.ofNullable(userDataParameters);
            return this;
        }

        public Builder userDataTemplate(@Nullable Output<Object> userDataTemplate) {
            this.userDataTemplate = userDataTemplate;
            return this;
        }

        public Builder userDataTemplate(@Nullable Object userDataTemplate) {
            this.userDataTemplate = Output.ofNullable(userDataTemplate);
            return this;
        }

        public Builder virtualMachineSize(@Nullable Output<Either<String,VirtualMachineSizeTypes>> virtualMachineSize) {
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }

        public Builder virtualMachineSize(@Nullable Either<String,VirtualMachineSizeTypes> virtualMachineSize) {
            this.virtualMachineSize = Output.ofNullable(virtualMachineSize);
            return this;
        }
        public NetworkFunctionRoleConfigurationArgs build() {
            return new NetworkFunctionRoleConfigurationArgs(customProfile, networkInterfaces, osProfile, roleName, roleType, storageProfile, userDataParameters, userDataTemplate, virtualMachineSize);
        }
    }
}
