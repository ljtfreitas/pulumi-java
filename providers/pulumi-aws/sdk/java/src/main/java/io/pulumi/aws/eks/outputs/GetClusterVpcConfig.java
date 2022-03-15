// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterVpcConfig {
    /**
     * The cluster security group that was created by Amazon EKS for the cluster.
     * 
     */
    private final String clusterSecurityGroupId;
    /**
     * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
     * 
     */
    private final Boolean endpointPrivateAccess;
    /**
     * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
     * 
     */
    private final Boolean endpointPublicAccess;
    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
     * 
     */
    private final List<String> publicAccessCidrs;
    /**
     * List of security group IDs
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * List of subnet IDs
     * 
     */
    private final List<String> subnetIds;
    /**
     * The VPC associated with your cluster.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetClusterVpcConfig(
        @CustomType.Parameter("clusterSecurityGroupId") String clusterSecurityGroupId,
        @CustomType.Parameter("endpointPrivateAccess") Boolean endpointPrivateAccess,
        @CustomType.Parameter("endpointPublicAccess") Boolean endpointPublicAccess,
        @CustomType.Parameter("publicAccessCidrs") List<String> publicAccessCidrs,
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.clusterSecurityGroupId = clusterSecurityGroupId;
        this.endpointPrivateAccess = endpointPrivateAccess;
        this.endpointPublicAccess = endpointPublicAccess;
        this.publicAccessCidrs = publicAccessCidrs;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * The cluster security group that was created by Amazon EKS for the cluster.
     * 
    */
    public String getClusterSecurityGroupId() {
        return this.clusterSecurityGroupId;
    }
    /**
     * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
     * 
    */
    public Boolean getEndpointPrivateAccess() {
        return this.endpointPrivateAccess;
    }
    /**
     * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
     * 
    */
    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }
    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
     * 
    */
    public List<String> getPublicAccessCidrs() {
        return this.publicAccessCidrs;
    }
    /**
     * List of security group IDs
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * List of subnet IDs
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * The VPC associated with your cluster.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterSecurityGroupId;
        private Boolean endpointPrivateAccess;
        private Boolean endpointPublicAccess;
        private List<String> publicAccessCidrs;
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSecurityGroupId = defaults.clusterSecurityGroupId;
    	      this.endpointPrivateAccess = defaults.endpointPrivateAccess;
    	      this.endpointPublicAccess = defaults.endpointPublicAccess;
    	      this.publicAccessCidrs = defaults.publicAccessCidrs;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder clusterSecurityGroupId(String clusterSecurityGroupId) {
            this.clusterSecurityGroupId = Objects.requireNonNull(clusterSecurityGroupId);
            return this;
        }

        public Builder endpointPrivateAccess(Boolean endpointPrivateAccess) {
            this.endpointPrivateAccess = Objects.requireNonNull(endpointPrivateAccess);
            return this;
        }

        public Builder endpointPublicAccess(Boolean endpointPublicAccess) {
            this.endpointPublicAccess = Objects.requireNonNull(endpointPublicAccess);
            return this;
        }

        public Builder publicAccessCidrs(List<String> publicAccessCidrs) {
            this.publicAccessCidrs = Objects.requireNonNull(publicAccessCidrs);
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetClusterVpcConfig build() {
            return new GetClusterVpcConfig(clusterSecurityGroupId, endpointPrivateAccess, endpointPublicAccess, publicAccessCidrs, securityGroupIds, subnetIds, vpcId);
        }
    }
}
