// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReverseSshConnectivityResponse {
    /**
     * The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    private final String vm;
    /**
     * The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    private final String vmIp;
    /**
     * The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    private final Integer vmPort;
    /**
     * The name of the VPC to peer with the Cloud SQL private network.
     * 
     */
    private final String vpc;

    @OutputCustomType.Constructor({"vm","vmIp","vmPort","vpc"})
    private ReverseSshConnectivityResponse(
        String vm,
        String vmIp,
        Integer vmPort,
        String vpc) {
        this.vm = Objects.requireNonNull(vm);
        this.vmIp = Objects.requireNonNull(vmIp);
        this.vmPort = Objects.requireNonNull(vmPort);
        this.vpc = Objects.requireNonNull(vpc);
    }

    /**
     * The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    public String getVm() {
        return this.vm;
    }
    /**
     * The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    public String getVmIp() {
        return this.vmIp;
    }
    /**
     * The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    public Integer getVmPort() {
        return this.vmPort;
    }
    /**
     * The name of the VPC to peer with the Cloud SQL private network.
     * 
     */
    public String getVpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReverseSshConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vm;
        private String vmIp;
        private Integer vmPort;
        private String vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(ReverseSshConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vm = defaults.vm;
    	      this.vmIp = defaults.vmIp;
    	      this.vmPort = defaults.vmPort;
    	      this.vpc = defaults.vpc;
        }

        public Builder setVm(String vm) {
            this.vm = Objects.requireNonNull(vm);
            return this;
        }

        public Builder setVmIp(String vmIp) {
            this.vmIp = Objects.requireNonNull(vmIp);
            return this;
        }

        public Builder setVmPort(Integer vmPort) {
            this.vmPort = Objects.requireNonNull(vmPort);
            return this;
        }

        public Builder setVpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public ReverseSshConnectivityResponse build() {
            return new ReverseSshConnectivityResponse(vm, vmIp, vmPort, vpc);
        }
    }
}
