// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs;
import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceFleetInstanceTypeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceFleetInstanceTypeConfigArgs Empty = new ClusterCoreInstanceFleetInstanceTypeConfigArgs();

    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    @Import(name="bidPrice")
      private final @Nullable Output<String> bidPrice;

    public Output<String> getBidPrice() {
        return this.bidPrice == null ? Output.empty() : this.bidPrice;
    }

    /**
     * Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    @Import(name="bidPriceAsPercentageOfOnDemandPrice")
      private final @Nullable Output<Double> bidPriceAsPercentageOfOnDemandPrice;

    public Output<Double> getBidPriceAsPercentageOfOnDemandPrice() {
        return this.bidPriceAsPercentageOfOnDemandPrice == null ? Output.empty() : this.bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    @Import(name="configurations")
      private final @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs>> configurations;

    public Output<List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs>> getConfigurations() {
        return this.configurations == null ? Output.empty() : this.configurations;
    }

    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    @Import(name="ebsConfigs")
      private final @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs>> ebsConfigs;

    public Output<List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs>> getEbsConfigs() {
        return this.ebsConfigs == null ? Output.empty() : this.ebsConfigs;
    }

    /**
     * EC2 instance type for all instances in the instance group.
     * 
     */
    @Import(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    @Import(name="weightedCapacity")
      private final @Nullable Output<Integer> weightedCapacity;

    public Output<Integer> getWeightedCapacity() {
        return this.weightedCapacity == null ? Output.empty() : this.weightedCapacity;
    }

    public ClusterCoreInstanceFleetInstanceTypeConfigArgs(
        @Nullable Output<String> bidPrice,
        @Nullable Output<Double> bidPriceAsPercentageOfOnDemandPrice,
        @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs>> configurations,
        @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs>> ebsConfigs,
        Output<String> instanceType,
        @Nullable Output<Integer> weightedCapacity) {
        this.bidPrice = bidPrice;
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
        this.configurations = configurations;
        this.ebsConfigs = ebsConfigs;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.weightedCapacity = weightedCapacity;
    }

    private ClusterCoreInstanceFleetInstanceTypeConfigArgs() {
        this.bidPrice = Output.empty();
        this.bidPriceAsPercentageOfOnDemandPrice = Output.empty();
        this.configurations = Output.empty();
        this.ebsConfigs = Output.empty();
        this.instanceType = Output.empty();
        this.weightedCapacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetInstanceTypeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bidPrice;
        private @Nullable Output<Double> bidPriceAsPercentageOfOnDemandPrice;
        private @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs>> configurations;
        private @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs>> ebsConfigs;
        private Output<String> instanceType;
        private @Nullable Output<Integer> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetInstanceTypeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bidPrice = defaults.bidPrice;
    	      this.bidPriceAsPercentageOfOnDemandPrice = defaults.bidPriceAsPercentageOfOnDemandPrice;
    	      this.configurations = defaults.configurations;
    	      this.ebsConfigs = defaults.ebsConfigs;
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder bidPrice(@Nullable Output<String> bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        public Builder bidPrice(@Nullable String bidPrice) {
            this.bidPrice = Output.ofNullable(bidPrice);
            return this;
        }

        public Builder bidPriceAsPercentageOfOnDemandPrice(@Nullable Output<Double> bidPriceAsPercentageOfOnDemandPrice) {
            this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
            return this;
        }

        public Builder bidPriceAsPercentageOfOnDemandPrice(@Nullable Double bidPriceAsPercentageOfOnDemandPrice) {
            this.bidPriceAsPercentageOfOnDemandPrice = Output.ofNullable(bidPriceAsPercentageOfOnDemandPrice);
            return this;
        }

        public Builder configurations(@Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs>> configurations) {
            this.configurations = configurations;
            return this;
        }

        public Builder configurations(@Nullable List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs> configurations) {
            this.configurations = Output.ofNullable(configurations);
            return this;
        }

        public Builder ebsConfigs(@Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs>> ebsConfigs) {
            this.ebsConfigs = ebsConfigs;
            return this;
        }

        public Builder ebsConfigs(@Nullable List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs> ebsConfigs) {
            this.ebsConfigs = Output.ofNullable(ebsConfigs);
            return this;
        }

        public Builder instanceType(Output<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Output.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder weightedCapacity(@Nullable Output<Integer> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(@Nullable Integer weightedCapacity) {
            this.weightedCapacity = Output.ofNullable(weightedCapacity);
            return this;
        }
        public ClusterCoreInstanceFleetInstanceTypeConfigArgs build() {
            return new ClusterCoreInstanceFleetInstanceTypeConfigArgs(bidPrice, bidPriceAsPercentageOfOnDemandPrice, configurations, ebsConfigs, instanceType, weightedCapacity);
        }
    }
}
