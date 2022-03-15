// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointAccessArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointAccessArgs Empty = new EndpointAccessArgs();

    /**
     * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. All alphabetical characters must be lower case, no hypens at the end, no two consecutive hyphens. Cluster name should be unique for all clusters within an AWS account
     * 
     */
    @Import(name="clusterIdentifier")
      private final @Nullable Output<String> clusterIdentifier;

    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier == null ? Output.empty() : this.clusterIdentifier;
    }

    /**
     * The name of the endpoint.
     * 
     */
    @Import(name="endpointName", required=true)
      private final Output<String> endpointName;

    public Output<String> getEndpointName() {
        return this.endpointName;
    }

    /**
     * The AWS account ID of the owner of the cluster.
     * 
     */
    @Import(name="resourceOwner")
      private final @Nullable Output<String> resourceOwner;

    public Output<String> getResourceOwner() {
        return this.resourceOwner == null ? Output.empty() : this.resourceOwner;
    }

    /**
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     * 
     */
    @Import(name="subnetGroupName")
      private final @Nullable Output<String> subnetGroupName;

    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName == null ? Output.empty() : this.subnetGroupName;
    }

    /**
     * A list of vpc security group ids to apply to the created endpoint access.
     * 
     */
    @Import(name="vpcSecurityGroupIds", required=true)
      private final Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    public EndpointAccessArgs(
        @Nullable Output<String> clusterIdentifier,
        Output<String> endpointName,
        @Nullable Output<String> resourceOwner,
        @Nullable Output<String> subnetGroupName,
        Output<List<String>> vpcSecurityGroupIds) {
        this.clusterIdentifier = clusterIdentifier;
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.resourceOwner = resourceOwner;
        this.subnetGroupName = subnetGroupName;
        this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds, "expected parameter 'vpcSecurityGroupIds' to be non-null");
    }

    private EndpointAccessArgs() {
        this.clusterIdentifier = Output.empty();
        this.endpointName = Output.empty();
        this.resourceOwner = Output.empty();
        this.subnetGroupName = Output.empty();
        this.vpcSecurityGroupIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterIdentifier;
        private Output<String> endpointName;
        private @Nullable Output<String> resourceOwner;
        private @Nullable Output<String> subnetGroupName;
        private Output<List<String>> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.endpointName = defaults.endpointName;
    	      this.resourceOwner = defaults.resourceOwner;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder clusterIdentifier(@Nullable Output<String> clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        public Builder clusterIdentifier(@Nullable String clusterIdentifier) {
            this.clusterIdentifier = Output.ofNullable(clusterIdentifier);
            return this;
        }

        public Builder endpointName(Output<String> endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder endpointName(String endpointName) {
            this.endpointName = Output.of(Objects.requireNonNull(endpointName));
            return this;
        }

        public Builder resourceOwner(@Nullable Output<String> resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }

        public Builder resourceOwner(@Nullable String resourceOwner) {
            this.resourceOwner = Output.ofNullable(resourceOwner);
            return this;
        }

        public Builder subnetGroupName(@Nullable Output<String> subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }

        public Builder subnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = Output.ofNullable(subnetGroupName);
            return this;
        }

        public Builder vpcSecurityGroupIds(Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }

        public Builder vpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Output.of(Objects.requireNonNull(vpcSecurityGroupIds));
            return this;
        }
        public EndpointAccessArgs build() {
            return new EndpointAccessArgs(clusterIdentifier, endpointName, resourceOwner, subnetGroupName, vpcSecurityGroupIds);
        }
    }
}
