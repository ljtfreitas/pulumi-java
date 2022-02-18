// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenShiftManagedClusterMasterPoolProfileResponse {
    /**
     * Number of masters (VMs) to host docker containers. The default value is 3.
     * 
     */
    private final Integer count;
    /**
     * Unique name of the master pool profile in the context of the subscription and resource group.
     * 
     */
    private final @Nullable String name;
    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    private final @Nullable String osType;
    /**
     * Subnet CIDR for the peering.
     * 
     */
    private final @Nullable String subnetCidr;
    /**
     * Size of agent VMs.
     * 
     */
    private final String vmSize;

    @OutputCustomType.Constructor({"count","name","osType","subnetCidr","vmSize"})
    private OpenShiftManagedClusterMasterPoolProfileResponse(
        Integer count,
        @Nullable String name,
        @Nullable String osType,
        @Nullable String subnetCidr,
        String vmSize) {
        this.count = Objects.requireNonNull(count);
        this.name = name;
        this.osType = osType;
        this.subnetCidr = subnetCidr;
        this.vmSize = Objects.requireNonNull(vmSize);
    }

    /**
     * Number of masters (VMs) to host docker containers. The default value is 3.
     * 
     */
    public Integer getCount() {
        return this.count;
    }
    /**
     * Unique name of the master pool profile in the context of the subscription and resource group.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * Subnet CIDR for the peering.
     * 
     */
    public Optional<String> getSubnetCidr() {
        return Optional.ofNullable(this.subnetCidr);
    }
    /**
     * Size of agent VMs.
     * 
     */
    public String getVmSize() {
        return this.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterMasterPoolProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private @Nullable String name;
        private @Nullable String osType;
        private @Nullable String subnetCidr;
        private String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterMasterPoolProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.subnetCidr = defaults.subnetCidr;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setSubnetCidr(@Nullable String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }

        public Builder setVmSize(String vmSize) {
            this.vmSize = Objects.requireNonNull(vmSize);
            return this;
        }

        public OpenShiftManagedClusterMasterPoolProfileResponse build() {
            return new OpenShiftManagedClusterMasterPoolProfileResponse(count, name, osType, subnetCidr, vmSize);
        }
    }
}
