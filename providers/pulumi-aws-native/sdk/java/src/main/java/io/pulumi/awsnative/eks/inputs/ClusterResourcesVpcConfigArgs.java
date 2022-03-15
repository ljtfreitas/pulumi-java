// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object representing the VPC configuration to use for an Amazon EKS cluster.
 * 
 */
public final class ClusterResourcesVpcConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterResourcesVpcConfigArgs Empty = new ClusterResourcesVpcConfigArgs();

    /**
     * Set this value to true to enable private access for your cluster's Kubernetes API server endpoint. If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC endpoint. The default value for this parameter is false, which disables private access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the nodes or Fargate pods.
     * 
     */
    @Import(name="endpointPrivateAccess")
      private final @Nullable Output<Boolean> endpointPrivateAccess;

    public Output<Boolean> getEndpointPrivateAccess() {
        return this.endpointPrivateAccess == null ? Output.empty() : this.endpointPrivateAccess;
    }

    /**
     * Set this value to false to disable public access to your cluster's Kubernetes API server endpoint. If you disable public access, your cluster's Kubernetes API server can only receive requests from within the cluster VPC. The default value for this parameter is true, which enables public access for your Kubernetes API server.
     * 
     */
    @Import(name="endpointPublicAccess")
      private final @Nullable Output<Boolean> endpointPublicAccess;

    public Output<Boolean> getEndpointPublicAccess() {
        return this.endpointPublicAccess == null ? Output.empty() : this.endpointPublicAccess;
    }

    /**
     * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you've disabled private endpoint access and you have nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
     * 
     */
    @Import(name="publicAccessCidrs")
      private final @Nullable Output<List<String>> publicAccessCidrs;

    public Output<List<String>> getPublicAccessCidrs() {
        return this.publicAccessCidrs == null ? Output.empty() : this.publicAccessCidrs;
    }

    /**
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you don't specify a security group, the default security group for your VPC is used.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Output.empty() : this.securityGroupIds;
    }

    /**
     * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your nodes and the Kubernetes control plane.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    public ClusterResourcesVpcConfigArgs(
        @Nullable Output<Boolean> endpointPrivateAccess,
        @Nullable Output<Boolean> endpointPublicAccess,
        @Nullable Output<List<String>> publicAccessCidrs,
        @Nullable Output<List<String>> securityGroupIds,
        Output<List<String>> subnetIds) {
        this.endpointPrivateAccess = endpointPrivateAccess;
        this.endpointPublicAccess = endpointPublicAccess;
        this.publicAccessCidrs = publicAccessCidrs;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
    }

    private ClusterResourcesVpcConfigArgs() {
        this.endpointPrivateAccess = Output.empty();
        this.endpointPublicAccess = Output.empty();
        this.publicAccessCidrs = Output.empty();
        this.securityGroupIds = Output.empty();
        this.subnetIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourcesVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> endpointPrivateAccess;
        private @Nullable Output<Boolean> endpointPublicAccess;
        private @Nullable Output<List<String>> publicAccessCidrs;
        private @Nullable Output<List<String>> securityGroupIds;
        private Output<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourcesVpcConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointPrivateAccess = defaults.endpointPrivateAccess;
    	      this.endpointPublicAccess = defaults.endpointPublicAccess;
    	      this.publicAccessCidrs = defaults.publicAccessCidrs;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder endpointPrivateAccess(@Nullable Output<Boolean> endpointPrivateAccess) {
            this.endpointPrivateAccess = endpointPrivateAccess;
            return this;
        }

        public Builder endpointPrivateAccess(@Nullable Boolean endpointPrivateAccess) {
            this.endpointPrivateAccess = Output.ofNullable(endpointPrivateAccess);
            return this;
        }

        public Builder endpointPublicAccess(@Nullable Output<Boolean> endpointPublicAccess) {
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        public Builder endpointPublicAccess(@Nullable Boolean endpointPublicAccess) {
            this.endpointPublicAccess = Output.ofNullable(endpointPublicAccess);
            return this;
        }

        public Builder publicAccessCidrs(@Nullable Output<List<String>> publicAccessCidrs) {
            this.publicAccessCidrs = publicAccessCidrs;
            return this;
        }

        public Builder publicAccessCidrs(@Nullable List<String> publicAccessCidrs) {
            this.publicAccessCidrs = Output.ofNullable(publicAccessCidrs);
            return this;
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Output.ofNullable(securityGroupIds);
            return this;
        }

        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }
        public ClusterResourcesVpcConfigArgs build() {
            return new ClusterResourcesVpcConfigArgs(endpointPrivateAccess, endpointPublicAccess, publicAccessCidrs, securityGroupIds, subnetIds);
        }
    }
}
