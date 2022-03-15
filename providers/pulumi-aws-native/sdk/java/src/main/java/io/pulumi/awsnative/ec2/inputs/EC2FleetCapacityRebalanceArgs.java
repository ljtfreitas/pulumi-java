// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetCapacityRebalanceReplacementStrategy;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetCapacityRebalanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetCapacityRebalanceArgs Empty = new EC2FleetCapacityRebalanceArgs();

    @Import(name="replacementStrategy")
      private final @Nullable Output<EC2FleetCapacityRebalanceReplacementStrategy> replacementStrategy;

    public Output<EC2FleetCapacityRebalanceReplacementStrategy> getReplacementStrategy() {
        return this.replacementStrategy == null ? Output.empty() : this.replacementStrategy;
    }

    @Import(name="terminationDelay")
      private final @Nullable Output<Integer> terminationDelay;

    public Output<Integer> getTerminationDelay() {
        return this.terminationDelay == null ? Output.empty() : this.terminationDelay;
    }

    public EC2FleetCapacityRebalanceArgs(
        @Nullable Output<EC2FleetCapacityRebalanceReplacementStrategy> replacementStrategy,
        @Nullable Output<Integer> terminationDelay) {
        this.replacementStrategy = replacementStrategy;
        this.terminationDelay = terminationDelay;
    }

    private EC2FleetCapacityRebalanceArgs() {
        this.replacementStrategy = Output.empty();
        this.terminationDelay = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetCapacityRebalanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EC2FleetCapacityRebalanceReplacementStrategy> replacementStrategy;
        private @Nullable Output<Integer> terminationDelay;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetCapacityRebalanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replacementStrategy = defaults.replacementStrategy;
    	      this.terminationDelay = defaults.terminationDelay;
        }

        public Builder replacementStrategy(@Nullable Output<EC2FleetCapacityRebalanceReplacementStrategy> replacementStrategy) {
            this.replacementStrategy = replacementStrategy;
            return this;
        }

        public Builder replacementStrategy(@Nullable EC2FleetCapacityRebalanceReplacementStrategy replacementStrategy) {
            this.replacementStrategy = Output.ofNullable(replacementStrategy);
            return this;
        }

        public Builder terminationDelay(@Nullable Output<Integer> terminationDelay) {
            this.terminationDelay = terminationDelay;
            return this;
        }

        public Builder terminationDelay(@Nullable Integer terminationDelay) {
            this.terminationDelay = Output.ofNullable(terminationDelay);
            return this;
        }
        public EC2FleetCapacityRebalanceArgs build() {
            return new EC2FleetCapacityRebalanceArgs(replacementStrategy, terminationDelay);
        }
    }
}
