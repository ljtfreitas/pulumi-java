// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.ContainerServiceSshConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContainerServiceLinuxProfileResponse {
    /**
     * The administrator username to use for Linux VMs.
     * 
     */
    private final String adminUsername;
    /**
     * SSH configuration for Linux-based VMs running on Azure.
     * 
     */
    private final ContainerServiceSshConfigurationResponse ssh;

    @OutputCustomType.Constructor({"adminUsername","ssh"})
    private ContainerServiceLinuxProfileResponse(
        String adminUsername,
        ContainerServiceSshConfigurationResponse ssh) {
        this.adminUsername = Objects.requireNonNull(adminUsername);
        this.ssh = Objects.requireNonNull(ssh);
    }

    /**
     * The administrator username to use for Linux VMs.
     * 
     */
    public String getAdminUsername() {
        return this.adminUsername;
    }
    /**
     * SSH configuration for Linux-based VMs running on Azure.
     * 
     */
    public ContainerServiceSshConfigurationResponse getSsh() {
        return this.ssh;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceLinuxProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminUsername;
        private ContainerServiceSshConfigurationResponse ssh;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceLinuxProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsername = defaults.adminUsername;
    	      this.ssh = defaults.ssh;
        }

        public Builder setAdminUsername(String adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }

        public Builder setSsh(ContainerServiceSshConfigurationResponse ssh) {
            this.ssh = Objects.requireNonNull(ssh);
            return this;
        }

        public ContainerServiceLinuxProfileResponse build() {
            return new ContainerServiceLinuxProfileResponse(adminUsername, ssh);
        }
    }
}
