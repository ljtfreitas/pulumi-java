// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.enums.OSType;
import io.pulumi.azurenative.containerservice.enums.OpenShiftAgentPoolProfileRole;
import io.pulumi.azurenative.containerservice.enums.OpenShiftContainerServiceVMSize;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the configuration of the OpenShift cluster VMs.
 * 
 */
public final class OpenShiftManagedClusterAgentPoolProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterAgentPoolProfileArgs Empty = new OpenShiftManagedClusterAgentPoolProfileArgs();

    /**
     * Number of agents (VMs) to host docker containers.
     * 
     */
    @InputImport(name="count", required=true)
        private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    /**
     * Unique name of the pool profile in the context of the subscription and resource group.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    @InputImport(name="osType")
        private final @Nullable Input<Either<String,OSType>> osType;

    public Input<Either<String,OSType>> getOsType() {
        return this.osType == null ? Input.empty() : this.osType;
    }

    /**
     * Define the role of the AgentPoolProfile.
     * 
     */
    @InputImport(name="role")
        private final @Nullable Input<Either<String,OpenShiftAgentPoolProfileRole>> role;

    public Input<Either<String,OpenShiftAgentPoolProfileRole>> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * Subnet CIDR for the peering.
     * 
     */
    @InputImport(name="subnetCidr")
        private final @Nullable Input<String> subnetCidr;

    public Input<String> getSubnetCidr() {
        return this.subnetCidr == null ? Input.empty() : this.subnetCidr;
    }

    /**
     * Size of agent VMs.
     * 
     */
    @InputImport(name="vmSize", required=true)
        private final Input<Either<String,OpenShiftContainerServiceVMSize>> vmSize;

    public Input<Either<String,OpenShiftContainerServiceVMSize>> getVmSize() {
        return this.vmSize;
    }

    public OpenShiftManagedClusterAgentPoolProfileArgs(
        Input<Integer> count,
        Input<String> name,
        @Nullable Input<Either<String,OSType>> osType,
        @Nullable Input<Either<String,OpenShiftAgentPoolProfileRole>> role,
        @Nullable Input<String> subnetCidr,
        Input<Either<String,OpenShiftContainerServiceVMSize>> vmSize) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.osType = osType;
        this.role = role;
        this.subnetCidr = subnetCidr == null ? Input.ofNullable("10.0.0.0/24") : subnetCidr;
        this.vmSize = Objects.requireNonNull(vmSize, "expected parameter 'vmSize' to be non-null");
    }

    private OpenShiftManagedClusterAgentPoolProfileArgs() {
        this.count = Input.empty();
        this.name = Input.empty();
        this.osType = Input.empty();
        this.role = Input.empty();
        this.subnetCidr = Input.empty();
        this.vmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAgentPoolProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private Input<String> name;
        private @Nullable Input<Either<String,OSType>> osType;
        private @Nullable Input<Either<String,OpenShiftAgentPoolProfileRole>> role;
        private @Nullable Input<String> subnetCidr;
        private Input<Either<String,OpenShiftContainerServiceVMSize>> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAgentPoolProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.role = defaults.role;
    	      this.subnetCidr = defaults.subnetCidr;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setCount(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOsType(@Nullable Input<Either<String,OSType>> osType) {
            this.osType = osType;
            return this;
        }

        public Builder setOsType(@Nullable Either<String,OSType> osType) {
            this.osType = Input.ofNullable(osType);
            return this;
        }

        public Builder setRole(@Nullable Input<Either<String,OpenShiftAgentPoolProfileRole>> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable Either<String,OpenShiftAgentPoolProfileRole> role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setSubnetCidr(@Nullable Input<String> subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }

        public Builder setSubnetCidr(@Nullable String subnetCidr) {
            this.subnetCidr = Input.ofNullable(subnetCidr);
            return this;
        }

        public Builder setVmSize(Input<Either<String,OpenShiftContainerServiceVMSize>> vmSize) {
            this.vmSize = Objects.requireNonNull(vmSize);
            return this;
        }

        public Builder setVmSize(Either<String,OpenShiftContainerServiceVMSize> vmSize) {
            this.vmSize = Input.of(Objects.requireNonNull(vmSize));
            return this;
        }
        public OpenShiftManagedClusterAgentPoolProfileArgs build() {
            return new OpenShiftManagedClusterAgentPoolProfileArgs(count, name, osType, role, subnetCidr, vmSize);
        }
    }
}
