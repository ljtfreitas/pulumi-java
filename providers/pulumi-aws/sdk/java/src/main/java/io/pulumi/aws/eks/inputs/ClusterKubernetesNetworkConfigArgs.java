// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterKubernetesNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterKubernetesNetworkConfigArgs Empty = new ClusterKubernetesNetworkConfigArgs();

    /**
     * The IP family used to assign Kubernetes pod and service addresses. Valid values are `ipv4` (default) and `ipv6`. You can only specify an IP family when you create a cluster, changing this value will force a new cluster to be created.
     * 
     */
    @InputImport(name="ipFamily")
    private final @Nullable Input<String> ipFamily;

    public Input<String> getIpFamily() {
        return this.ipFamily == null ? Input.empty() : this.ipFamily;
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. You can only specify a custom CIDR block when you create a cluster, changing this value will force a new cluster to be created. The block must meet the following requirements:
     * 
     */
    @InputImport(name="serviceIpv4Cidr")
    private final @Nullable Input<String> serviceIpv4Cidr;

    public Input<String> getServiceIpv4Cidr() {
        return this.serviceIpv4Cidr == null ? Input.empty() : this.serviceIpv4Cidr;
    }

    public ClusterKubernetesNetworkConfigArgs(
        @Nullable Input<String> ipFamily,
        @Nullable Input<String> serviceIpv4Cidr) {
        this.ipFamily = ipFamily;
        this.serviceIpv4Cidr = serviceIpv4Cidr;
    }

    private ClusterKubernetesNetworkConfigArgs() {
        this.ipFamily = Input.empty();
        this.serviceIpv4Cidr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKubernetesNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipFamily;
        private @Nullable Input<String> serviceIpv4Cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKubernetesNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
        }

        public Builder setIpFamily(@Nullable Input<String> ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }

        public Builder setIpFamily(@Nullable String ipFamily) {
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
        public ClusterKubernetesNetworkConfigArgs build() {
            return new ClusterKubernetesNetworkConfigArgs(ipFamily, serviceIpv4Cidr);
        }
    }
}
