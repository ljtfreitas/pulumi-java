// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIpAllocationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIpAllocationPolicyArgs Empty = new ClusterIpAllocationPolicyArgs();

    /**
     * The IP address range for the cluster pod IPs.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
     */
    @InputImport(name="clusterIpv4CidrBlock")
        private final @Nullable Input<String> clusterIpv4CidrBlock;

    public Input<String> getClusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock == null ? Input.empty() : this.clusterIpv4CidrBlock;
    }

    /**
     * The name of the existing secondary
     * range in the cluster's subnetwork to use for pod IP addresses. Alternatively,
     * `cluster_ipv4_cidr_block` can be used to automatically create a GKE-managed one.
     * 
     */
    @InputImport(name="clusterSecondaryRangeName")
        private final @Nullable Input<String> clusterSecondaryRangeName;

    public Input<String> getClusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName == null ? Input.empty() : this.clusterSecondaryRangeName;
    }

    /**
     * The IP address range of the services IPs in this cluster.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
     */
    @InputImport(name="servicesIpv4CidrBlock")
        private final @Nullable Input<String> servicesIpv4CidrBlock;

    public Input<String> getServicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock == null ? Input.empty() : this.servicesIpv4CidrBlock;
    }

    /**
     * The name of the existing
     * secondary range in the cluster's subnetwork to use for service `ClusterIP`s.
     * Alternatively, `services_ipv4_cidr_block` can be used to automatically create a
     * GKE-managed one.
     * 
     */
    @InputImport(name="servicesSecondaryRangeName")
        private final @Nullable Input<String> servicesSecondaryRangeName;

    public Input<String> getServicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName == null ? Input.empty() : this.servicesSecondaryRangeName;
    }

    public ClusterIpAllocationPolicyArgs(
        @Nullable Input<String> clusterIpv4CidrBlock,
        @Nullable Input<String> clusterSecondaryRangeName,
        @Nullable Input<String> servicesIpv4CidrBlock,
        @Nullable Input<String> servicesSecondaryRangeName) {
        this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = servicesSecondaryRangeName;
    }

    private ClusterIpAllocationPolicyArgs() {
        this.clusterIpv4CidrBlock = Input.empty();
        this.clusterSecondaryRangeName = Input.empty();
        this.servicesIpv4CidrBlock = Input.empty();
        this.servicesSecondaryRangeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIpAllocationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterIpv4CidrBlock;
        private @Nullable Input<String> clusterSecondaryRangeName;
        private @Nullable Input<String> servicesIpv4CidrBlock;
        private @Nullable Input<String> servicesSecondaryRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIpAllocationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
        }

        public Builder setClusterIpv4CidrBlock(@Nullable Input<String> clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        public Builder setClusterIpv4CidrBlock(@Nullable String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = Input.ofNullable(clusterIpv4CidrBlock);
            return this;
        }

        public Builder setClusterSecondaryRangeName(@Nullable Input<String> clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }

        public Builder setClusterSecondaryRangeName(@Nullable String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = Input.ofNullable(clusterSecondaryRangeName);
            return this;
        }

        public Builder setServicesIpv4CidrBlock(@Nullable Input<String> servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }

        public Builder setServicesIpv4CidrBlock(@Nullable String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = Input.ofNullable(servicesIpv4CidrBlock);
            return this;
        }

        public Builder setServicesSecondaryRangeName(@Nullable Input<String> servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }

        public Builder setServicesSecondaryRangeName(@Nullable String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = Input.ofNullable(servicesSecondaryRangeName);
            return this;
        }
        public ClusterIpAllocationPolicyArgs build() {
            return new ClusterIpAllocationPolicyArgs(clusterIpv4CidrBlock, clusterSecondaryRangeName, servicesIpv4CidrBlock, servicesSecondaryRangeName);
        }
    }
}
