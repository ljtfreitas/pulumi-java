// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.CapacityProviderAutoScalingGroupProviderManagedTerminationProtection;
import io.pulumi.awsnative.ecs.inputs.CapacityProviderManagedScalingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderAutoScalingGroupProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderAutoScalingGroupProviderArgs Empty = new CapacityProviderAutoScalingGroupProviderArgs();

    @Import(name="autoScalingGroupArn", required=true)
      private final Output<String> autoScalingGroupArn;

    public Output<String> getAutoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }

    @Import(name="managedScaling")
      private final @Nullable Output<CapacityProviderManagedScalingArgs> managedScaling;

    public Output<CapacityProviderManagedScalingArgs> getManagedScaling() {
        return this.managedScaling == null ? Output.empty() : this.managedScaling;
    }

    @Import(name="managedTerminationProtection")
      private final @Nullable Output<CapacityProviderAutoScalingGroupProviderManagedTerminationProtection> managedTerminationProtection;

    public Output<CapacityProviderAutoScalingGroupProviderManagedTerminationProtection> getManagedTerminationProtection() {
        return this.managedTerminationProtection == null ? Output.empty() : this.managedTerminationProtection;
    }

    public CapacityProviderAutoScalingGroupProviderArgs(
        Output<String> autoScalingGroupArn,
        @Nullable Output<CapacityProviderManagedScalingArgs> managedScaling,
        @Nullable Output<CapacityProviderAutoScalingGroupProviderManagedTerminationProtection> managedTerminationProtection) {
        this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn, "expected parameter 'autoScalingGroupArn' to be non-null");
        this.managedScaling = managedScaling;
        this.managedTerminationProtection = managedTerminationProtection;
    }

    private CapacityProviderAutoScalingGroupProviderArgs() {
        this.autoScalingGroupArn = Output.empty();
        this.managedScaling = Output.empty();
        this.managedTerminationProtection = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderAutoScalingGroupProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> autoScalingGroupArn;
        private @Nullable Output<CapacityProviderManagedScalingArgs> managedScaling;
        private @Nullable Output<CapacityProviderAutoScalingGroupProviderManagedTerminationProtection> managedTerminationProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderAutoScalingGroupProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupArn = defaults.autoScalingGroupArn;
    	      this.managedScaling = defaults.managedScaling;
    	      this.managedTerminationProtection = defaults.managedTerminationProtection;
        }

        public Builder autoScalingGroupArn(Output<String> autoScalingGroupArn) {
            this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn);
            return this;
        }

        public Builder autoScalingGroupArn(String autoScalingGroupArn) {
            this.autoScalingGroupArn = Output.of(Objects.requireNonNull(autoScalingGroupArn));
            return this;
        }

        public Builder managedScaling(@Nullable Output<CapacityProviderManagedScalingArgs> managedScaling) {
            this.managedScaling = managedScaling;
            return this;
        }

        public Builder managedScaling(@Nullable CapacityProviderManagedScalingArgs managedScaling) {
            this.managedScaling = Output.ofNullable(managedScaling);
            return this;
        }

        public Builder managedTerminationProtection(@Nullable Output<CapacityProviderAutoScalingGroupProviderManagedTerminationProtection> managedTerminationProtection) {
            this.managedTerminationProtection = managedTerminationProtection;
            return this;
        }

        public Builder managedTerminationProtection(@Nullable CapacityProviderAutoScalingGroupProviderManagedTerminationProtection managedTerminationProtection) {
            this.managedTerminationProtection = Output.ofNullable(managedTerminationProtection);
            return this;
        }
        public CapacityProviderAutoScalingGroupProviderArgs build() {
            return new CapacityProviderAutoScalingGroupProviderArgs(autoScalingGroupArn, managedScaling, managedTerminationProtection);
        }
    }
}
