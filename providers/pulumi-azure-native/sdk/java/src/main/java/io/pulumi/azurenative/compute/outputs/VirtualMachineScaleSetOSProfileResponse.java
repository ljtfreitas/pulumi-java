// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.LinuxConfigurationResponse;
import io.pulumi.azurenative.compute.outputs.VaultSecretGroupResponse;
import io.pulumi.azurenative.compute.outputs.WindowsConfigurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetOSProfileResponse {
    /**
     * Specifies the password of the administrator account. <br><br> **Minimum-length (Windows):** 8 characters <br><br> **Minimum-length (Linux):** 6 characters <br><br> **Max-length (Windows):** 123 characters <br><br> **Max-length (Linux):** 72 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" <br><br> For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) <br><br> For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     * 
     */
    private final @Nullable String adminPassword;
    /**
     * Specifies the name of the administrator account. <br><br> **Windows-only restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1  character <br><br> **Max-length (Linux):** 64 characters <br><br> **Max-length (Windows):** 20 characters
     * 
     */
    private final @Nullable String adminUsername;
    /**
     * Specifies the computer name prefix for all of the virtual machines in the scale set. Computer name prefixes must be 1 to 15 characters long.
     * 
     */
    private final @Nullable String computerNamePrefix;
    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. <br><br> For using cloud-init for your VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
     * 
     */
    private final @Nullable String customData;
    /**
     * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
     * 
     */
    private final @Nullable LinuxConfigurationResponse linuxConfiguration;
    /**
     * Specifies set of certificates that should be installed onto the virtual machines in the scale set. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    private final @Nullable List<VaultSecretGroupResponse> secrets;
    /**
     * Specifies Windows operating system settings on the virtual machine.
     * 
     */
    private final @Nullable WindowsConfigurationResponse windowsConfiguration;

    @CustomType.Constructor
    private VirtualMachineScaleSetOSProfileResponse(
        @CustomType.Parameter("adminPassword") @Nullable String adminPassword,
        @CustomType.Parameter("adminUsername") @Nullable String adminUsername,
        @CustomType.Parameter("computerNamePrefix") @Nullable String computerNamePrefix,
        @CustomType.Parameter("customData") @Nullable String customData,
        @CustomType.Parameter("linuxConfiguration") @Nullable LinuxConfigurationResponse linuxConfiguration,
        @CustomType.Parameter("secrets") @Nullable List<VaultSecretGroupResponse> secrets,
        @CustomType.Parameter("windowsConfiguration") @Nullable WindowsConfigurationResponse windowsConfiguration) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.computerNamePrefix = computerNamePrefix;
        this.customData = customData;
        this.linuxConfiguration = linuxConfiguration;
        this.secrets = secrets;
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * Specifies the password of the administrator account. <br><br> **Minimum-length (Windows):** 8 characters <br><br> **Minimum-length (Linux):** 6 characters <br><br> **Max-length (Windows):** 123 characters <br><br> **Max-length (Linux):** 72 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" <br><br> For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) <br><br> For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     * 
    */
    public Optional<String> getAdminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    /**
     * Specifies the name of the administrator account. <br><br> **Windows-only restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1  character <br><br> **Max-length (Linux):** 64 characters <br><br> **Max-length (Windows):** 20 characters
     * 
    */
    public Optional<String> getAdminUsername() {
        return Optional.ofNullable(this.adminUsername);
    }
    /**
     * Specifies the computer name prefix for all of the virtual machines in the scale set. Computer name prefixes must be 1 to 15 characters long.
     * 
    */
    public Optional<String> getComputerNamePrefix() {
        return Optional.ofNullable(this.computerNamePrefix);
    }
    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. <br><br> For using cloud-init for your VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
     * 
    */
    public Optional<String> getCustomData() {
        return Optional.ofNullable(this.customData);
    }
    /**
     * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
     * 
    */
    public Optional<LinuxConfigurationResponse> getLinuxConfiguration() {
        return Optional.ofNullable(this.linuxConfiguration);
    }
    /**
     * Specifies set of certificates that should be installed onto the virtual machines in the scale set. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
    */
    public List<VaultSecretGroupResponse> getSecrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }
    /**
     * Specifies Windows operating system settings on the virtual machine.
     * 
    */
    public Optional<WindowsConfigurationResponse> getWindowsConfiguration() {
        return Optional.ofNullable(this.windowsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetOSProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPassword;
        private @Nullable String adminUsername;
        private @Nullable String computerNamePrefix;
        private @Nullable String customData;
        private @Nullable LinuxConfigurationResponse linuxConfiguration;
        private @Nullable List<VaultSecretGroupResponse> secrets;
        private @Nullable WindowsConfigurationResponse windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetOSProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.computerNamePrefix = defaults.computerNamePrefix;
    	      this.customData = defaults.customData;
    	      this.linuxConfiguration = defaults.linuxConfiguration;
    	      this.secrets = defaults.secrets;
    	      this.windowsConfiguration = defaults.windowsConfiguration;
        }

        public Builder adminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder adminUsername(@Nullable String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder computerNamePrefix(@Nullable String computerNamePrefix) {
            this.computerNamePrefix = computerNamePrefix;
            return this;
        }

        public Builder customData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }

        public Builder linuxConfiguration(@Nullable LinuxConfigurationResponse linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            return this;
        }

        public Builder secrets(@Nullable List<VaultSecretGroupResponse> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder windowsConfiguration(@Nullable WindowsConfigurationResponse windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }
        public VirtualMachineScaleSetOSProfileResponse build() {
            return new VirtualMachineScaleSetOSProfileResponse(adminPassword, adminUsername, computerNamePrefix, customData, linuxConfiguration, secrets, windowsConfiguration);
        }
    }
}
