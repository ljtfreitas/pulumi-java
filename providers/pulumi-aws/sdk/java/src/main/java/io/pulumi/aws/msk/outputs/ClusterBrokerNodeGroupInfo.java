// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterBrokerNodeGroupInfo {
    /**
     * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
     * 
     */
    private final @Nullable String azDistribution;
    /**
     * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
     * 
     */
    private final List<String> clientSubnets;
    /**
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * 
     */
    private final Integer ebsVolumeSize;
    /**
     * Specify the instance type to use for the kafka brokersE.g., kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
     * 
     */
    private final String instanceType;
    /**
     * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
     * 
     */
    private final List<String> securityGroups;

    @CustomType.Constructor
    private ClusterBrokerNodeGroupInfo(
        @CustomType.Parameter("azDistribution") @Nullable String azDistribution,
        @CustomType.Parameter("clientSubnets") List<String> clientSubnets,
        @CustomType.Parameter("ebsVolumeSize") Integer ebsVolumeSize,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("securityGroups") List<String> securityGroups) {
        this.azDistribution = azDistribution;
        this.clientSubnets = clientSubnets;
        this.ebsVolumeSize = ebsVolumeSize;
        this.instanceType = instanceType;
        this.securityGroups = securityGroups;
    }

    /**
     * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
     * 
    */
    public Optional<String> getAzDistribution() {
        return Optional.ofNullable(this.azDistribution);
    }
    /**
     * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
     * 
    */
    public List<String> getClientSubnets() {
        return this.clientSubnets;
    }
    /**
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * 
    */
    public Integer getEbsVolumeSize() {
        return this.ebsVolumeSize;
    }
    /**
     * Specify the instance type to use for the kafka brokersE.g., kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
     * 
    */
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterBrokerNodeGroupInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azDistribution;
        private List<String> clientSubnets;
        private Integer ebsVolumeSize;
        private String instanceType;
        private List<String> securityGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterBrokerNodeGroupInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azDistribution = defaults.azDistribution;
    	      this.clientSubnets = defaults.clientSubnets;
    	      this.ebsVolumeSize = defaults.ebsVolumeSize;
    	      this.instanceType = defaults.instanceType;
    	      this.securityGroups = defaults.securityGroups;
        }

        public Builder azDistribution(@Nullable String azDistribution) {
            this.azDistribution = azDistribution;
            return this;
        }

        public Builder clientSubnets(List<String> clientSubnets) {
            this.clientSubnets = Objects.requireNonNull(clientSubnets);
            return this;
        }

        public Builder ebsVolumeSize(Integer ebsVolumeSize) {
            this.ebsVolumeSize = Objects.requireNonNull(ebsVolumeSize);
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public ClusterBrokerNodeGroupInfo build() {
            return new ClusterBrokerNodeGroupInfo(azDistribution, clientSubnets, ebsVolumeSize, instanceType, securityGroups);
        }
    }
}
