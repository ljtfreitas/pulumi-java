// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.LinuxPatchSettingsResponse;
import io.pulumi.azurenative.compute.outputs.SshConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LinuxConfigurationResponse {
    /**
     * Specifies whether password authentication should be disabled.
     * 
     */
    private final @Nullable Boolean disablePasswordAuthentication;
    /**
     * [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     * 
     */
    private final @Nullable LinuxPatchSettingsResponse patchSettings;
    /**
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. <br><br> When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    private final @Nullable Boolean provisionVMAgent;
    /**
     * Specifies the ssh key configuration for a Linux OS.
     * 
     */
    private final @Nullable SshConfigurationResponse ssh;

    @OutputCustomType.Constructor({"disablePasswordAuthentication","patchSettings","provisionVMAgent","ssh"})
    private LinuxConfigurationResponse(
        @Nullable Boolean disablePasswordAuthentication,
        @Nullable LinuxPatchSettingsResponse patchSettings,
        @Nullable Boolean provisionVMAgent,
        @Nullable SshConfigurationResponse ssh) {
        this.disablePasswordAuthentication = disablePasswordAuthentication;
        this.patchSettings = patchSettings;
        this.provisionVMAgent = provisionVMAgent;
        this.ssh = ssh;
    }

    /**
     * Specifies whether password authentication should be disabled.
     * 
     */
    public Optional<Boolean> getDisablePasswordAuthentication() {
        return Optional.ofNullable(this.disablePasswordAuthentication);
    }
    /**
     * [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     * 
     */
    public Optional<LinuxPatchSettingsResponse> getPatchSettings() {
        return Optional.ofNullable(this.patchSettings);
    }
    /**
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. <br><br> When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    public Optional<Boolean> getProvisionVMAgent() {
        return Optional.ofNullable(this.provisionVMAgent);
    }
    /**
     * Specifies the ssh key configuration for a Linux OS.
     * 
     */
    public Optional<SshConfigurationResponse> getSsh() {
        return Optional.ofNullable(this.ssh);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disablePasswordAuthentication;
        private @Nullable LinuxPatchSettingsResponse patchSettings;
        private @Nullable Boolean provisionVMAgent;
        private @Nullable SshConfigurationResponse ssh;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disablePasswordAuthentication = defaults.disablePasswordAuthentication;
    	      this.patchSettings = defaults.patchSettings;
    	      this.provisionVMAgent = defaults.provisionVMAgent;
    	      this.ssh = defaults.ssh;
        }

        public Builder setDisablePasswordAuthentication(@Nullable Boolean disablePasswordAuthentication) {
            this.disablePasswordAuthentication = disablePasswordAuthentication;
            return this;
        }

        public Builder setPatchSettings(@Nullable LinuxPatchSettingsResponse patchSettings) {
            this.patchSettings = patchSettings;
            return this;
        }

        public Builder setProvisionVMAgent(@Nullable Boolean provisionVMAgent) {
            this.provisionVMAgent = provisionVMAgent;
            return this;
        }

        public Builder setSsh(@Nullable SshConfigurationResponse ssh) {
            this.ssh = ssh;
            return this;
        }

        public LinuxConfigurationResponse build() {
            return new LinuxConfigurationResponse(disablePasswordAuthentication, patchSettings, provisionVMAgent, ssh);
        }
    }
}
