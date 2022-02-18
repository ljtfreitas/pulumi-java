// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the backing virtual machine.
 * 
 */
public final class VirtualMachineDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineDetailsResponse Empty = new VirtualMachineDetailsResponse();

    /**
     * Last known compute power state captured in DTL
     * 
     */
    @InputImport(name="lastKnownPowerState", required=true)
    private final String lastKnownPowerState;

    public String getLastKnownPowerState() {
        return this.lastKnownPowerState;
    }

    /**
     * PrivateIp address of the compute VM
     * 
     */
    @InputImport(name="privateIpAddress", required=true)
    private final String privateIpAddress;

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Provisioning state of the Dtl VM
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Connection information for Windows
     * 
     */
    @InputImport(name="rdpAuthority", required=true)
    private final String rdpAuthority;

    public String getRdpAuthority() {
        return this.rdpAuthority;
    }

    /**
     * Connection information for Linux
     * 
     */
    @InputImport(name="sshAuthority", required=true)
    private final String sshAuthority;

    public String getSshAuthority() {
        return this.sshAuthority;
    }

    /**
     * Compute VM login user name
     * 
     */
    @InputImport(name="userName", required=true)
    private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public VirtualMachineDetailsResponse(
        String lastKnownPowerState,
        String privateIpAddress,
        String provisioningState,
        String rdpAuthority,
        String sshAuthority,
        String userName) {
        this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState, "expected parameter 'lastKnownPowerState' to be non-null");
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.rdpAuthority = Objects.requireNonNull(rdpAuthority, "expected parameter 'rdpAuthority' to be non-null");
        this.sshAuthority = Objects.requireNonNull(sshAuthority, "expected parameter 'sshAuthority' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private VirtualMachineDetailsResponse() {
        this.lastKnownPowerState = null;
        this.privateIpAddress = null;
        this.provisioningState = null;
        this.rdpAuthority = null;
        this.sshAuthority = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastKnownPowerState;
        private String privateIpAddress;
        private String provisioningState;
        private String rdpAuthority;
        private String sshAuthority;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastKnownPowerState = defaults.lastKnownPowerState;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sshAuthority = defaults.sshAuthority;
    	      this.userName = defaults.userName;
        }

        public Builder setLastKnownPowerState(String lastKnownPowerState) {
            this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRdpAuthority(String rdpAuthority) {
            this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
            return this;
        }

        public Builder setSshAuthority(String sshAuthority) {
            this.sshAuthority = Objects.requireNonNull(sshAuthority);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public VirtualMachineDetailsResponse build() {
            return new VirtualMachineDetailsResponse(lastKnownPowerState, privateIpAddress, provisioningState, rdpAuthority, sshAuthority, userName);
        }
    }
}
