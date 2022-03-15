// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OpenShiftManagedClusterMaterPoolProfile contains configuration for OpenShift master VMs.
 * 
 */
public final class OpenShiftManagedClusterMasterPoolProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final OpenShiftManagedClusterMasterPoolProfileResponse Empty = new OpenShiftManagedClusterMasterPoolProfileResponse();

    /**
     * Number of masters (VMs) to host docker containers. The default value is 3.
     * 
     */
    @Import(name="count", required=true)
      private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * Unique name of the master pool profile in the context of the subscription and resource group.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * Subnet CIDR for the peering.
     * 
     */
    @Import(name="subnetCidr")
      private final @Nullable String subnetCidr;

    public Optional<String> getSubnetCidr() {
        return this.subnetCidr == null ? Optional.empty() : Optional.ofNullable(this.subnetCidr);
    }

    /**
     * Size of agent VMs.
     * 
     */
    @Import(name="vmSize", required=true)
      private final String vmSize;

    public String getVmSize() {
        return this.vmSize;
    }

    public OpenShiftManagedClusterMasterPoolProfileResponse(
        Integer count,
        @Nullable String name,
        @Nullable String osType,
        @Nullable String subnetCidr,
        String vmSize) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.name = name;
        this.osType = osType;
        this.subnetCidr = subnetCidr;
        this.vmSize = Objects.requireNonNull(vmSize, "expected parameter 'vmSize' to be non-null");
    }

    private OpenShiftManagedClusterMasterPoolProfileResponse() {
        this.count = null;
        this.name = null;
        this.osType = null;
        this.subnetCidr = null;
        this.vmSize = null;
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

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder subnetCidr(@Nullable String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }

        public Builder vmSize(String vmSize) {
            this.vmSize = Objects.requireNonNull(vmSize);
            return this;
        }
        public OpenShiftManagedClusterMasterPoolProfileResponse build() {
            return new OpenShiftManagedClusterMasterPoolProfileResponse(count, name, osType, subnetCidr, vmSize);
        }
    }
}
