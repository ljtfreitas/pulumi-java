// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.awsnative.eks.enums.ClusterKubernetesNetworkConfigIpFamily;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Kubernetes network configuration for the cluster.
 * 
 */
public final class ClusterKubernetesNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterKubernetesNetworkConfigArgs Empty = new ClusterKubernetesNetworkConfigArgs();

    /**
     * Ipv4 or Ipv6. You can only specify ipv6 for 1.21 and later clusters that use version 1.10.1 or later of the Amazon VPC CNI add-on
     * 
     */
    @InputImport(name="ipFamily")
        private final @Nullable Input<ClusterKubernetesNetworkConfigIpFamily> ipFamily;

    public Input<ClusterKubernetesNetworkConfigIpFamily> getIpFamily() {
        return this.ipFamily == null ? Input.empty() : this.ipFamily;
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC.
     * 
     */
    @InputImport(name="serviceIpv4Cidr")
        private final @Nullable Input<String> serviceIpv4Cidr;

    public Input<String> getServiceIpv4Cidr() {
        return this.serviceIpv4Cidr == null ? Input.empty() : this.serviceIpv4Cidr;
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     * 
     */
    @InputImport(name="serviceIpv6Cidr")
        private final @Nullable Input<String> serviceIpv6Cidr;

    public Input<String> getServiceIpv6Cidr() {
        return this.serviceIpv6Cidr == null ? Input.empty() : this.serviceIpv6Cidr;
    }

    public ClusterKubernetesNetworkConfigArgs(
        @Nullable Input<ClusterKubernetesNetworkConfigIpFamily> ipFamily,
        @Nullable Input<String> serviceIpv4Cidr,
        @Nullable Input<String> serviceIpv6Cidr) {
        this.ipFamily = ipFamily;
        this.serviceIpv4Cidr = serviceIpv4Cidr;
        this.serviceIpv6Cidr = serviceIpv6Cidr;
    }

    private ClusterKubernetesNetworkConfigArgs() {
        this.ipFamily = Input.empty();
        this.serviceIpv4Cidr = Input.empty();
        this.serviceIpv6Cidr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKubernetesNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterKubernetesNetworkConfigIpFamily> ipFamily;
        private @Nullable Input<String> serviceIpv4Cidr;
        private @Nullable Input<String> serviceIpv6Cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKubernetesNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
    	      this.serviceIpv6Cidr = defaults.serviceIpv6Cidr;
        }

        public Builder setIpFamily(@Nullable Input<ClusterKubernetesNetworkConfigIpFamily> ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }

        public Builder setIpFamily(@Nullable ClusterKubernetesNetworkConfigIpFamily ipFamily) {
            this.ipFamily = Input.ofNullable(ipFamily);
            return this;
        }

        public Builder setServiceIpv4Cidr(@Nullable Input<String> serviceIpv4Cidr) {
            this.serviceIpv4Cidr = serviceIpv4Cidr;
            return this;
        }

        public Builder setServiceIpv4Cidr(@Nullable String serviceIpv4Cidr) {
            this.serviceIpv4Cidr = Input.ofNullable(serviceIpv4Cidr);
            return this;
        }

        public Builder setServiceIpv6Cidr(@Nullable Input<String> serviceIpv6Cidr) {
            this.serviceIpv6Cidr = serviceIpv6Cidr;
            return this;
        }

        public Builder setServiceIpv6Cidr(@Nullable String serviceIpv6Cidr) {
            this.serviceIpv6Cidr = Input.ofNullable(serviceIpv6Cidr);
            return this;
        }
        public ClusterKubernetesNetworkConfigArgs build() {
            return new ClusterKubernetesNetworkConfigArgs(ipFamily, serviceIpv4Cidr, serviceIpv6Cidr);
        }
    }
}
