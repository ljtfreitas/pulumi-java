// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineSshCredentialsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineResponseProperties Empty = new VirtualMachineResponseProperties();

    /**
     * Public IP address of the virtual machine.
     * 
     */
    @Import(name="address")
      private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    /**
     * Admin credentials for virtual machine
     * 
     */
    @Import(name="administratorAccount")
      private final @Nullable VirtualMachineSshCredentialsResponse administratorAccount;

    public Optional<VirtualMachineSshCredentialsResponse> getAdministratorAccount() {
        return this.administratorAccount == null ? Optional.empty() : Optional.ofNullable(this.administratorAccount);
    }

    /**
     * Port open for ssh connections.
     * 
     */
    @Import(name="sshPort")
      private final @Nullable Integer sshPort;

    public Optional<Integer> getSshPort() {
        return this.sshPort == null ? Optional.empty() : Optional.ofNullable(this.sshPort);
    }

    /**
     * Virtual Machine size
     * 
     */
    @Import(name="virtualMachineSize")
      private final @Nullable String virtualMachineSize;

    public Optional<String> getVirtualMachineSize() {
        return this.virtualMachineSize == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineSize);
    }

    public VirtualMachineResponseProperties(
        @Nullable String address,
        @Nullable VirtualMachineSshCredentialsResponse administratorAccount,
        @Nullable Integer sshPort,
        @Nullable String virtualMachineSize) {
        this.address = address;
        this.administratorAccount = administratorAccount;
        this.sshPort = sshPort;
        this.virtualMachineSize = virtualMachineSize;
    }

    private VirtualMachineResponseProperties() {
        this.address = null;
        this.administratorAccount = null;
        this.sshPort = null;
        this.virtualMachineSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable VirtualMachineSshCredentialsResponse administratorAccount;
        private @Nullable Integer sshPort;
        private @Nullable String virtualMachineSize;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.administratorAccount = defaults.administratorAccount;
    	      this.sshPort = defaults.sshPort;
    	      this.virtualMachineSize = defaults.virtualMachineSize;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder administratorAccount(@Nullable VirtualMachineSshCredentialsResponse administratorAccount) {
            this.administratorAccount = administratorAccount;
            return this;
        }

        public Builder sshPort(@Nullable Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }

        public Builder virtualMachineSize(@Nullable String virtualMachineSize) {
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }
        public VirtualMachineResponseProperties build() {
            return new VirtualMachineResponseProperties(address, administratorAccount, sshPort, virtualMachineSize);
        }
    }
}
