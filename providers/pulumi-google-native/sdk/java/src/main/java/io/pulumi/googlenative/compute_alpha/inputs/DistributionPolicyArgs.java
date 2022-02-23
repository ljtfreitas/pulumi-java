// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.DistributionPolicyTargetShape;
import io.pulumi.googlenative.compute_alpha.inputs.DistributionPolicyZoneConfigurationArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionPolicyArgs Empty = new DistributionPolicyArgs();

    /**
     * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    @InputImport(name="targetShape")
      private final @Nullable Input<DistributionPolicyTargetShape> targetShape;

    public Input<DistributionPolicyTargetShape> getTargetShape() {
        return this.targetShape == null ? Input.empty() : this.targetShape;
    }

    /**
     * Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<List<DistributionPolicyZoneConfigurationArgs>> zones;

    public Input<List<DistributionPolicyZoneConfigurationArgs>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public DistributionPolicyArgs(
        @Nullable Input<DistributionPolicyTargetShape> targetShape,
        @Nullable Input<List<DistributionPolicyZoneConfigurationArgs>> zones) {
        this.targetShape = targetShape;
        this.zones = zones;
    }

    private DistributionPolicyArgs() {
        this.targetShape = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DistributionPolicyTargetShape> targetShape;
        private @Nullable Input<List<DistributionPolicyZoneConfigurationArgs>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetShape = defaults.targetShape;
    	      this.zones = defaults.zones;
        }

        public Builder setTargetShape(@Nullable Input<DistributionPolicyTargetShape> targetShape) {
            this.targetShape = targetShape;
            return this;
        }

        public Builder setTargetShape(@Nullable DistributionPolicyTargetShape targetShape) {
            this.targetShape = Input.ofNullable(targetShape);
            return this;
        }

        public Builder setZones(@Nullable Input<List<DistributionPolicyZoneConfigurationArgs>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<DistributionPolicyZoneConfigurationArgs> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public DistributionPolicyArgs build() {
            return new DistributionPolicyArgs(targetShape, zones);
        }
    }
}
