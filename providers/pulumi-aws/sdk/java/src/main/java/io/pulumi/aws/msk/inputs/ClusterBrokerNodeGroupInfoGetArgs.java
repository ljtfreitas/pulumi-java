// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterBrokerNodeGroupInfoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterBrokerNodeGroupInfoGetArgs Empty = new ClusterBrokerNodeGroupInfoGetArgs();

    /**
     * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
     * 
     */
    @InputImport(name="azDistribution")
    private final @Nullable Input<String> azDistribution;

    public Input<String> getAzDistribution() {
        return this.azDistribution == null ? Input.empty() : this.azDistribution;
    }

    /**
     * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
     * 
     */
    @InputImport(name="clientSubnets", required=true)
    private final Input<List<String>> clientSubnets;

    public Input<List<String>> getClientSubnets() {
        return this.clientSubnets;
    }

    /**
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * 
     */
    @InputImport(name="ebsVolumeSize", required=true)
    private final Input<Integer> ebsVolumeSize;

    public Input<Integer> getEbsVolumeSize() {
        return this.ebsVolumeSize;
    }

    /**
     * Specify the instance type to use for the kafka brokersE.g., kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
     * 
     */
    @InputImport(name="instanceType", required=true)
    private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
     * 
     */
    @InputImport(name="securityGroups", required=true)
    private final Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups;
    }

    public ClusterBrokerNodeGroupInfoGetArgs(
        @Nullable Input<String> azDistribution,
        Input<List<String>> clientSubnets,
        Input<Integer> ebsVolumeSize,
        Input<String> instanceType,
        Input<List<String>> securityGroups) {
        this.azDistribution = azDistribution;
        this.clientSubnets = Objects.requireNonNull(clientSubnets, "expected parameter 'clientSubnets' to be non-null");
        this.ebsVolumeSize = Objects.requireNonNull(ebsVolumeSize, "expected parameter 'ebsVolumeSize' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.securityGroups = Objects.requireNonNull(securityGroups, "expected parameter 'securityGroups' to be non-null");
    }

    private ClusterBrokerNodeGroupInfoGetArgs() {
        this.azDistribution = Input.empty();
        this.clientSubnets = Input.empty();
        this.ebsVolumeSize = Input.empty();
        this.instanceType = Input.empty();
        this.securityGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterBrokerNodeGroupInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> azDistribution;
        private Input<List<String>> clientSubnets;
        private Input<Integer> ebsVolumeSize;
        private Input<String> instanceType;
        private Input<List<String>> securityGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterBrokerNodeGroupInfoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azDistribution = defaults.azDistribution;
    	      this.clientSubnets = defaults.clientSubnets;
    	      this.ebsVolumeSize = defaults.ebsVolumeSize;
    	      this.instanceType = defaults.instanceType;
    	      this.securityGroups = defaults.securityGroups;
        }

        public Builder setAzDistribution(@Nullable Input<String> azDistribution) {
            this.azDistribution = azDistribution;
            return this;
        }

        public Builder setAzDistribution(@Nullable String azDistribution) {
            this.azDistribution = Input.ofNullable(azDistribution);
            return this;
        }

        public Builder setClientSubnets(Input<List<String>> clientSubnets) {
            this.clientSubnets = Objects.requireNonNull(clientSubnets);
            return this;
        }

        public Builder setClientSubnets(List<String> clientSubnets) {
            this.clientSubnets = Input.of(Objects.requireNonNull(clientSubnets));
            return this;
        }

        public Builder setEbsVolumeSize(Input<Integer> ebsVolumeSize) {
            this.ebsVolumeSize = Objects.requireNonNull(ebsVolumeSize);
            return this;
        }

        public Builder setEbsVolumeSize(Integer ebsVolumeSize) {
            this.ebsVolumeSize = Input.of(Objects.requireNonNull(ebsVolumeSize));
            return this;
        }

        public Builder setInstanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder setSecurityGroups(Input<List<String>> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Input.of(Objects.requireNonNull(securityGroups));
            return this;
        }
        public ClusterBrokerNodeGroupInfoGetArgs build() {
            return new ClusterBrokerNodeGroupInfoGetArgs(azDistribution, clientSubnets, ebsVolumeSize, instanceType, securityGroups);
        }
    }
}
