// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.DistributionPolicyTargetShape;
import io.pulumi.googlenative.compute_beta.inputs.DistributionPolicyZoneConfigurationArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionPolicyArgs Empty = new DistributionPolicyArgs();

    /**
     * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    @Import(name="targetShape")
      private final @Nullable Output<DistributionPolicyTargetShape> targetShape;

    public Output<DistributionPolicyTargetShape> getTargetShape() {
        return this.targetShape == null ? Output.empty() : this.targetShape;
    }

    /**
     * Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<DistributionPolicyZoneConfigurationArgs>> zones;

    public Output<List<DistributionPolicyZoneConfigurationArgs>> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public DistributionPolicyArgs(
        @Nullable Output<DistributionPolicyTargetShape> targetShape,
        @Nullable Output<List<DistributionPolicyZoneConfigurationArgs>> zones) {
        this.targetShape = targetShape;
        this.zones = zones;
    }

    private DistributionPolicyArgs() {
        this.targetShape = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DistributionPolicyTargetShape> targetShape;
        private @Nullable Output<List<DistributionPolicyZoneConfigurationArgs>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetShape = defaults.targetShape;
    	      this.zones = defaults.zones;
        }

        public Builder targetShape(@Nullable Output<DistributionPolicyTargetShape> targetShape) {
            this.targetShape = targetShape;
            return this;
        }

        public Builder targetShape(@Nullable DistributionPolicyTargetShape targetShape) {
            this.targetShape = Output.ofNullable(targetShape);
            return this;
        }

        public Builder zones(@Nullable Output<List<DistributionPolicyZoneConfigurationArgs>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable List<DistributionPolicyZoneConfigurationArgs> zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public DistributionPolicyArgs build() {
            return new DistributionPolicyArgs(targetShape, zones);
        }
    }
}
