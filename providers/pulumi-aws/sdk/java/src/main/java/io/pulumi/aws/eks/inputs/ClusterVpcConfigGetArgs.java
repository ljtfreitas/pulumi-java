// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterVpcConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterVpcConfigGetArgs Empty = new ClusterVpcConfigGetArgs();

    /**
     * Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
     * 
     */
    @Import(name="clusterSecurityGroupId")
      private final @Nullable Output<String> clusterSecurityGroupId;

    public Output<String> getClusterSecurityGroupId() {
        return this.clusterSecurityGroupId == null ? Output.empty() : this.clusterSecurityGroupId;
    }

    /**
     * Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
     * 
     */
    @Import(name="endpointPrivateAccess")
      private final @Nullable Output<Boolean> endpointPrivateAccess;

    public Output<Boolean> getEndpointPrivateAccess() {
        return this.endpointPrivateAccess == null ? Output.empty() : this.endpointPrivateAccess;
    }

    /**
     * Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
     * 
     */
    @Import(name="endpointPublicAccess")
      private final @Nullable Output<Boolean> endpointPublicAccess;

    public Output<Boolean> getEndpointPublicAccess() {
        return this.endpointPublicAccess == null ? Output.empty() : this.endpointPublicAccess;
    }

    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="publicAccessCidrs")
      private final @Nullable Output<List<String>> publicAccessCidrs;

    public Output<List<String>> getPublicAccessCidrs() {
        return this.publicAccessCidrs == null ? Output.empty() : this.publicAccessCidrs;
    }

    /**
     * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Output.empty() : this.securityGroupIds;
    }

    /**
     * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * ID of the VPC associated with your cluster.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public ClusterVpcConfigGetArgs(
        @Nullable Output<String> clusterSecurityGroupId,
        @Nullable Output<Boolean> endpointPrivateAccess,
        @Nullable Output<Boolean> endpointPublicAccess,
        @Nullable Output<List<String>> publicAccessCidrs,
        @Nullable Output<List<String>> securityGroupIds,
        Output<List<String>> subnetIds,
        @Nullable Output<String> vpcId) {
        this.clusterSecurityGroupId = clusterSecurityGroupId;
        this.endpointPrivateAccess = endpointPrivateAccess;
        this.endpointPublicAccess = endpointPublicAccess;
        this.publicAccessCidrs = publicAccessCidrs;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcId = vpcId;
    }

    private ClusterVpcConfigGetArgs() {
        this.clusterSecurityGroupId = Output.empty();
        this.endpointPrivateAccess = Output.empty();
        this.endpointPublicAccess = Output.empty();
        this.publicAccessCidrs = Output.empty();
        this.securityGroupIds = Output.empty();
        this.subnetIds = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterVpcConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterSecurityGroupId;
        private @Nullable Output<Boolean> endpointPrivateAccess;
        private @Nullable Output<Boolean> endpointPublicAccess;
        private @Nullable Output<List<String>> publicAccessCidrs;
        private @Nullable Output<List<String>> securityGroupIds;
        private Output<List<String>> subnetIds;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterVpcConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSecurityGroupId = defaults.clusterSecurityGroupId;
    	      this.endpointPrivateAccess = defaults.endpointPrivateAccess;
    	      this.endpointPublicAccess = defaults.endpointPublicAccess;
    	      this.publicAccessCidrs = defaults.publicAccessCidrs;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder clusterSecurityGroupId(@Nullable Output<String> clusterSecurityGroupId) {
            this.clusterSecurityGroupId = clusterSecurityGroupId;
            return this;
        }

        public Builder clusterSecurityGroupId(@Nullable String clusterSecurityGroupId) {
            this.clusterSecurityGroupId = Output.ofNullable(clusterSecurityGroupId);
            return this;
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

        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }
        public ClusterVpcConfigGetArgs build() {
            return new ClusterVpcConfigGetArgs(clusterSecurityGroupId, endpointPrivateAccess, endpointPublicAccess, publicAccessCidrs, securityGroupIds, subnetIds, vpcId);
        }
    }
}
