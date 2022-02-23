// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.LinuxConfigurationResponse;
import io.pulumi.azurenative.compute.inputs.VaultSecretGroupResponse;
import io.pulumi.azurenative.compute.inputs.WindowsConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set OS profile.
 * 
 */
public final class VirtualMachineScaleSetOSProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetOSProfileResponse Empty = new VirtualMachineScaleSetOSProfileResponse();

    /**
     * Specifies the password of the administrator account. <br><br> **Minimum-length (Windows):** 8 characters <br><br> **Minimum-length (Linux):** 6 characters <br><br> **Max-length (Windows):** 123 characters <br><br> **Max-length (Linux):** 72 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" <br><br> For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) <br><br> For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     * 
     */
    @InputImport(name="adminPassword")
        private final @Nullable String adminPassword;

    public Optional<String> getAdminPassword() {
        return this.adminPassword == null ? Optional.empty() : Optional.ofNullable(this.adminPassword);
    }

    /**
     * Specifies the name of the administrator account. <br><br> **Windows-only restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1  character <br><br> **Max-length (Linux):** 64 characters <br><br> **Max-length (Windows):** 20 characters
     * 
     */
    @InputImport(name="adminUsername")
        private final @Nullable String adminUsername;

    public Optional<String> getAdminUsername() {
        return this.adminUsername == null ? Optional.empty() : Optional.ofNullable(this.adminUsername);
    }

    /**
     * Specifies the computer name prefix for all of the virtual machines in the scale set. Computer name prefixes must be 1 to 15 characters long.
     * 
     */
    @InputImport(name="computerNamePrefix")
        private final @Nullable String computerNamePrefix;

    public Optional<String> getComputerNamePrefix() {
        return this.computerNamePrefix == null ? Optional.empty() : Optional.ofNullable(this.computerNamePrefix);
    }

    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. <br><br> For using cloud-init for your VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
     * 
     */
    @InputImport(name="customData")
        private final @Nullable String customData;

    public Optional<String> getCustomData() {
        return this.customData == null ? Optional.empty() : Optional.ofNullable(this.customData);
    }

    /**
     * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
     * 
     */
    @InputImport(name="linuxConfiguration")
        private final @Nullable LinuxConfigurationResponse linuxConfiguration;

    public Optional<LinuxConfigurationResponse> getLinuxConfiguration() {
        return this.linuxConfiguration == null ? Optional.empty() : Optional.ofNullable(this.linuxConfiguration);
    }

    /**
     * Specifies set of certificates that should be installed onto the virtual machines in the scale set. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    @InputImport(name="secrets")
        private final @Nullable List<VaultSecretGroupResponse> secrets;

    public List<VaultSecretGroupResponse> getSecrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }

    /**
     * Specifies Windows operating system settings on the virtual machine.
     * 
     */
    @InputImport(name="windowsConfiguration")
        private final @Nullable WindowsConfigurationResponse windowsConfiguration;

    public Optional<WindowsConfigurationResponse> getWindowsConfiguration() {
        return this.windowsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.windowsConfiguration);
    }

    public VirtualMachineScaleSetOSProfileResponse(
        @Nullable String adminPassword,
        @Nullable String adminUsername,
        @Nullable String computerNamePrefix,
        @Nullable String customData,
        @Nullable LinuxConfigurationResponse linuxConfiguration,
        @Nullable List<VaultSecretGroupResponse> secrets,
        @Nullable WindowsConfigurationResponse windowsConfiguration) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.computerNamePrefix = computerNamePrefix;
        this.customData = customData;
        this.linuxConfiguration = linuxConfiguration;
        this.secrets = secrets;
        this.windowsConfiguration = windowsConfiguration;
    }

    private VirtualMachineScaleSetOSProfileResponse() {
        this.adminPassword = null;
        this.adminUsername = null;
        this.computerNamePrefix = null;
        this.customData = null;
        this.linuxConfiguration = null;
        this.secrets = List.of();
        this.windowsConfiguration = null;
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

        public Builder setAdminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminUsername(@Nullable String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder setComputerNamePrefix(@Nullable String computerNamePrefix) {
            this.computerNamePrefix = computerNamePrefix;
            return this;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }

        public Builder setLinuxConfiguration(@Nullable LinuxConfigurationResponse linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            return this;
        }

        public Builder setSecrets(@Nullable List<VaultSecretGroupResponse> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setWindowsConfiguration(@Nullable WindowsConfigurationResponse windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }
        public VirtualMachineScaleSetOSProfileResponse build() {
            return new VirtualMachineScaleSetOSProfileResponse(adminPassword, adminUsername, computerNamePrefix, customData, linuxConfiguration, secrets, windowsConfiguration);
        }
    }
}
