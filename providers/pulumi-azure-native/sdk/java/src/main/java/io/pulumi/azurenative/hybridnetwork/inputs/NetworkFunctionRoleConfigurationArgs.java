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
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="customProfile")
        private final @Nullable Input<CustomProfileArgs> customProfile;

    public Input<CustomProfileArgs> getCustomProfile() {
        return this.customProfile == null ? Input.empty() : this.customProfile;
    }

    /**
     * The network interface configurations.
     * 
     */
    @InputImport(name="networkInterfaces")
        private final @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces;

    public Input<List<NetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Input.empty() : this.networkInterfaces;
    }

    /**
     * Specifies the operating system settings for the role instance. This value can be updated during the deployment of network function.
     * 
     */
    @InputImport(name="osProfile")
        private final @Nullable Input<OsProfileArgs> osProfile;

    public Input<OsProfileArgs> getOsProfile() {
        return this.osProfile == null ? Input.empty() : this.osProfile;
    }

    /**
     * The name of the network function role.
     * 
     */
    @InputImport(name="roleName")
        private final @Nullable Input<String> roleName;

    public Input<String> getRoleName() {
        return this.roleName == null ? Input.empty() : this.roleName;
    }

    /**
     * Role type.
     * 
     */
    @InputImport(name="roleType")
        private final @Nullable Input<Either<String,NetworkFunctionRoleConfigurationType>> roleType;

    public Input<Either<String,NetworkFunctionRoleConfigurationType>> getRoleType() {
        return this.roleType == null ? Input.empty() : this.roleType;
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @InputImport(name="storageProfile")
        private final @Nullable Input<StorageProfileArgs> storageProfile;

    public Input<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Input.empty() : this.storageProfile;
    }

    /**
     * The user parameters for customers. The format of user data parameters has to be matched with the provided user data template.
     * 
     */
    @InputImport(name="userDataParameters")
        private final @Nullable Input<Object> userDataParameters;

    public Input<Object> getUserDataParameters() {
        return this.userDataParameters == null ? Input.empty() : this.userDataParameters;
    }

    /**
     * The user data template for customers. This is a json schema template describing the format and data type of user data parameters.
     * 
     */
    @InputImport(name="userDataTemplate")
        private final @Nullable Input<Object> userDataTemplate;

    public Input<Object> getUserDataTemplate() {
        return this.userDataTemplate == null ? Input.empty() : this.userDataTemplate;
    }

    /**
     * The size of the virtual machine.
     * 
     */
    @InputImport(name="virtualMachineSize")
        private final @Nullable Input<Either<String,VirtualMachineSizeTypes>> virtualMachineSize;

    public Input<Either<String,VirtualMachineSizeTypes>> getVirtualMachineSize() {
        return this.virtualMachineSize == null ? Input.empty() : this.virtualMachineSize;
    }

    public NetworkFunctionRoleConfigurationArgs(
        @Nullable Input<CustomProfileArgs> customProfile,
        @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces,
        @Nullable Input<OsProfileArgs> osProfile,
        @Nullable Input<String> roleName,
        @Nullable Input<Either<String,NetworkFunctionRoleConfigurationType>> roleType,
        @Nullable Input<StorageProfileArgs> storageProfile,
        @Nullable Input<Object> userDataParameters,
        @Nullable Input<Object> userDataTemplate,
        @Nullable Input<Either<String,VirtualMachineSizeTypes>> virtualMachineSize) {
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
        this.customProfile = Input.empty();
        this.networkInterfaces = Input.empty();
        this.osProfile = Input.empty();
        this.roleName = Input.empty();
        this.roleType = Input.empty();
        this.storageProfile = Input.empty();
        this.userDataParameters = Input.empty();
        this.userDataTemplate = Input.empty();
        this.virtualMachineSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionRoleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomProfileArgs> customProfile;
        private @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Input<OsProfileArgs> osProfile;
        private @Nullable Input<String> roleName;
        private @Nullable Input<Either<String,NetworkFunctionRoleConfigurationType>> roleType;
        private @Nullable Input<StorageProfileArgs> storageProfile;
        private @Nullable Input<Object> userDataParameters;
        private @Nullable Input<Object> userDataTemplate;
        private @Nullable Input<Either<String,VirtualMachineSizeTypes>> virtualMachineSize;

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

        public Builder setCustomProfile(@Nullable Input<CustomProfileArgs> customProfile) {
            this.customProfile = customProfile;
            return this;
        }

        public Builder setCustomProfile(@Nullable CustomProfileArgs customProfile) {
            this.customProfile = Input.ofNullable(customProfile);
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable List<NetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Input.ofNullable(networkInterfaces);
            return this;
        }

        public Builder setOsProfile(@Nullable Input<OsProfileArgs> osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setOsProfile(@Nullable OsProfileArgs osProfile) {
            this.osProfile = Input.ofNullable(osProfile);
            return this;
        }

        public Builder setRoleName(@Nullable Input<String> roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder setRoleName(@Nullable String roleName) {
            this.roleName = Input.ofNullable(roleName);
            return this;
        }

        public Builder setRoleType(@Nullable Input<Either<String,NetworkFunctionRoleConfigurationType>> roleType) {
            this.roleType = roleType;
            return this;
        }

        public Builder setRoleType(@Nullable Either<String,NetworkFunctionRoleConfigurationType> roleType) {
            this.roleType = Input.ofNullable(roleType);
            return this;
        }

        public Builder setStorageProfile(@Nullable Input<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Input.ofNullable(storageProfile);
            return this;
        }

        public Builder setUserDataParameters(@Nullable Input<Object> userDataParameters) {
            this.userDataParameters = userDataParameters;
            return this;
        }

        public Builder setUserDataParameters(@Nullable Object userDataParameters) {
            this.userDataParameters = Input.ofNullable(userDataParameters);
            return this;
        }

        public Builder setUserDataTemplate(@Nullable Input<Object> userDataTemplate) {
            this.userDataTemplate = userDataTemplate;
            return this;
        }

        public Builder setUserDataTemplate(@Nullable Object userDataTemplate) {
            this.userDataTemplate = Input.ofNullable(userDataTemplate);
            return this;
        }

        public Builder setVirtualMachineSize(@Nullable Input<Either<String,VirtualMachineSizeTypes>> virtualMachineSize) {
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }

        public Builder setVirtualMachineSize(@Nullable Either<String,VirtualMachineSizeTypes> virtualMachineSize) {
            this.virtualMachineSize = Input.ofNullable(virtualMachineSize);
            return this;
        }
        public NetworkFunctionRoleConfigurationArgs build() {
            return new NetworkFunctionRoleConfigurationArgs(customProfile, networkInterfaces, osProfile, roleName, roleType, storageProfile, userDataParameters, userDataTemplate, virtualMachineSize);
        }
    }
}
