// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigArgs;
import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterInstanceFleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceFleetArgs Empty = new ClusterMasterInstanceFleetArgs();

    /**
     * ID of the cluster.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Configuration block for instance fleet.
     * 
     */
    @Import(name="instanceTypeConfigs")
      private final @Nullable Output<List<ClusterMasterInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs;

    public Output<List<ClusterMasterInstanceFleetInstanceTypeConfigArgs>> getInstanceTypeConfigs() {
        return this.instanceTypeConfigs == null ? Output.empty() : this.instanceTypeConfigs;
    }

    /**
     * Configuration block for launch specification.
     * 
     */
    @Import(name="launchSpecifications")
      private final @Nullable Output<ClusterMasterInstanceFleetLaunchSpecificationsArgs> launchSpecifications;

    public Output<ClusterMasterInstanceFleetLaunchSpecificationsArgs> getLaunchSpecifications() {
        return this.launchSpecifications == null ? Output.empty() : this.launchSpecifications;
    }

    /**
     * Name of the step.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="provisionedOnDemandCapacity")
      private final @Nullable Output<Integer> provisionedOnDemandCapacity;

    public Output<Integer> getProvisionedOnDemandCapacity() {
        return this.provisionedOnDemandCapacity == null ? Output.empty() : this.provisionedOnDemandCapacity;
    }

    @Import(name="provisionedSpotCapacity")
      private final @Nullable Output<Integer> provisionedSpotCapacity;

    public Output<Integer> getProvisionedSpotCapacity() {
        return this.provisionedSpotCapacity == null ? Output.empty() : this.provisionedSpotCapacity;
    }

    /**
     * Target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
     */
    @Import(name="targetOnDemandCapacity")
      private final @Nullable Output<Integer> targetOnDemandCapacity;

    public Output<Integer> getTargetOnDemandCapacity() {
        return this.targetOnDemandCapacity == null ? Output.empty() : this.targetOnDemandCapacity;
    }

    /**
     * Target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
     */
    @Import(name="targetSpotCapacity")
      private final @Nullable Output<Integer> targetSpotCapacity;

    public Output<Integer> getTargetSpotCapacity() {
        return this.targetSpotCapacity == null ? Output.empty() : this.targetSpotCapacity;
    }

    public ClusterMasterInstanceFleetArgs(
        @Nullable Output<String> id,
        @Nullable Output<List<ClusterMasterInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs,
        @Nullable Output<ClusterMasterInstanceFleetLaunchSpecificationsArgs> launchSpecifications,
        @Nullable Output<String> name,
        @Nullable Output<Integer> provisionedOnDemandCapacity,
        @Nullable Output<Integer> provisionedSpotCapacity,
        @Nullable Output<Integer> targetOnDemandCapacity,
        @Nullable Output<Integer> targetSpotCapacity) {
        this.id = id;
        this.instanceTypeConfigs = instanceTypeConfigs;
        this.launchSpecifications = launchSpecifications;
        this.name = name;
        this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
        this.provisionedSpotCapacity = provisionedSpotCapacity;
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        this.targetSpotCapacity = targetSpotCapacity;
    }

    private ClusterMasterInstanceFleetArgs() {
        this.id = Output.empty();
        this.instanceTypeConfigs = Output.empty();
        this.launchSpecifications = Output.empty();
        this.name = Output.empty();
        this.provisionedOnDemandCapacity = Output.empty();
        this.provisionedSpotCapacity = Output.empty();
        this.targetOnDemandCapacity = Output.empty();
        this.targetSpotCapacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<List<ClusterMasterInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs;
        private @Nullable Output<ClusterMasterInstanceFleetLaunchSpecificationsArgs> launchSpecifications;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> provisionedOnDemandCapacity;
        private @Nullable Output<Integer> provisionedSpotCapacity;
        private @Nullable Output<Integer> targetOnDemandCapacity;
        private @Nullable Output<Integer> targetSpotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceTypeConfigs = defaults.instanceTypeConfigs;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.name = defaults.name;
    	      this.provisionedOnDemandCapacity = defaults.provisionedOnDemandCapacity;
    	      this.provisionedSpotCapacity = defaults.provisionedSpotCapacity;
    	      this.targetOnDemandCapacity = defaults.targetOnDemandCapacity;
    	      this.targetSpotCapacity = defaults.targetSpotCapacity;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder instanceTypeConfigs(@Nullable Output<List<ClusterMasterInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs) {
            this.instanceTypeConfigs = instanceTypeConfigs;
            return this;
        }

        public Builder instanceTypeConfigs(@Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigArgs> instanceTypeConfigs) {
            this.instanceTypeConfigs = Output.ofNullable(instanceTypeConfigs);
            return this;
        }

        public Builder launchSpecifications(@Nullable Output<ClusterMasterInstanceFleetLaunchSpecificationsArgs> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }

        public Builder launchSpecifications(@Nullable ClusterMasterInstanceFleetLaunchSpecificationsArgs launchSpecifications) {
            this.launchSpecifications = Output.ofNullable(launchSpecifications);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder provisionedOnDemandCapacity(@Nullable Output<Integer> provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
            return this;
        }

        public Builder provisionedOnDemandCapacity(@Nullable Integer provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = Output.ofNullable(provisionedOnDemandCapacity);
            return this;
        }

        public Builder provisionedSpotCapacity(@Nullable Output<Integer> provisionedSpotCapacity) {
            this.provisionedSpotCapacity = provisionedSpotCapacity;
            return this;
        }

        public Builder provisionedSpotCapacity(@Nullable Integer provisionedSpotCapacity) {
            this.provisionedSpotCapacity = Output.ofNullable(provisionedSpotCapacity);
            return this;
        }

        public Builder targetOnDemandCapacity(@Nullable Output<Integer> targetOnDemandCapacity) {
            this.targetOnDemandCapacity = targetOnDemandCapacity;
            return this;
        }

        public Builder targetOnDemandCapacity(@Nullable Integer targetOnDemandCapacity) {
            this.targetOnDemandCapacity = Output.ofNullable(targetOnDemandCapacity);
            return this;
        }

        public Builder targetSpotCapacity(@Nullable Output<Integer> targetSpotCapacity) {
            this.targetSpotCapacity = targetSpotCapacity;
            return this;
        }

        public Builder targetSpotCapacity(@Nullable Integer targetSpotCapacity) {
            this.targetSpotCapacity = Output.ofNullable(targetSpotCapacity);
            return this;
        }
        public ClusterMasterInstanceFleetArgs build() {
            return new ClusterMasterInstanceFleetArgs(id, instanceTypeConfigs, launchSpecifications, name, provisionedOnDemandCapacity, provisionedSpotCapacity, targetOnDemandCapacity, targetSpotCapacity);
        }
    }
}
