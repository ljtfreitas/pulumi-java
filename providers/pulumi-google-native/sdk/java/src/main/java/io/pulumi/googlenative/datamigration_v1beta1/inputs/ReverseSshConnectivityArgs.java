// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The details needed to configure a reverse SSH tunnel between the source and destination databases. These details will be used when calling the generateSshScript method (see https://cloud.google.com/database-migration/docs/reference/rest/v1beta1/projects.locations.migrationJobs/generateSshScript) to produce the script that will help set up the reverse SSH tunnel, and to set up the VPC peering between the Cloud SQL private network and the VPC.
 * 
 */
public final class ReverseSshConnectivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReverseSshConnectivityArgs Empty = new ReverseSshConnectivityArgs();

    /**
     * The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    @InputImport(name="vm")
      private final @Nullable Input<String> vm;

    public Input<String> getVm() {
        return this.vm == null ? Input.empty() : this.vm;
    }

    /**
     * The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    @InputImport(name="vmIp", required=true)
      private final Input<String> vmIp;

    public Input<String> getVmIp() {
        return this.vmIp;
    }

    /**
     * The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    @InputImport(name="vmPort", required=true)
      private final Input<Integer> vmPort;

    public Input<Integer> getVmPort() {
        return this.vmPort;
    }

    /**
     * The name of the VPC to peer with the Cloud SQL private network.
     * 
     */
    @InputImport(name="vpc")
      private final @Nullable Input<String> vpc;

    public Input<String> getVpc() {
        return this.vpc == null ? Input.empty() : this.vpc;
    }

    public ReverseSshConnectivityArgs(
        @Nullable Input<String> vm,
        Input<String> vmIp,
        Input<Integer> vmPort,
        @Nullable Input<String> vpc) {
        this.vm = vm;
        this.vmIp = Objects.requireNonNull(vmIp, "expected parameter 'vmIp' to be non-null");
        this.vmPort = Objects.requireNonNull(vmPort, "expected parameter 'vmPort' to be non-null");
        this.vpc = vpc;
    }

    private ReverseSshConnectivityArgs() {
        this.vm = Input.empty();
        this.vmIp = Input.empty();
        this.vmPort = Input.empty();
        this.vpc = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReverseSshConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> vm;
        private Input<String> vmIp;
        private Input<Integer> vmPort;
        private @Nullable Input<String> vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(ReverseSshConnectivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vm = defaults.vm;
    	      this.vmIp = defaults.vmIp;
    	      this.vmPort = defaults.vmPort;
    	      this.vpc = defaults.vpc;
        }

        public Builder setVm(@Nullable Input<String> vm) {
            this.vm = vm;
            return this;
        }

        public Builder setVm(@Nullable String vm) {
            this.vm = Input.ofNullable(vm);
            return this;
        }

        public Builder setVmIp(Input<String> vmIp) {
            this.vmIp = Objects.requireNonNull(vmIp);
            return this;
        }

        public Builder setVmIp(String vmIp) {
            this.vmIp = Input.of(Objects.requireNonNull(vmIp));
            return this;
        }

        public Builder setVmPort(Input<Integer> vmPort) {
            this.vmPort = Objects.requireNonNull(vmPort);
            return this;
        }

        public Builder setVmPort(Integer vmPort) {
            this.vmPort = Input.of(Objects.requireNonNull(vmPort));
            return this;
        }

        public Builder setVpc(@Nullable Input<String> vpc) {
            this.vpc = vpc;
            return this;
        }

        public Builder setVpc(@Nullable String vpc) {
            this.vpc = Input.ofNullable(vpc);
            return this;
        }
        public ReverseSshConnectivityArgs build() {
            return new ReverseSshConnectivityArgs(vm, vmIp, vmPort, vpc);
        }
    }
}
