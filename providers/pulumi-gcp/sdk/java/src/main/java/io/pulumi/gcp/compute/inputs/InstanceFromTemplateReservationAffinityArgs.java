// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinitySpecificReservationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateReservationAffinityArgs Empty = new InstanceFromTemplateReservationAffinityArgs();

    @Import(name="specificReservation")
      private final @Nullable Output<InstanceFromTemplateReservationAffinitySpecificReservationArgs> specificReservation;

    public Output<InstanceFromTemplateReservationAffinitySpecificReservationArgs> getSpecificReservation() {
        return this.specificReservation == null ? Output.empty() : this.specificReservation;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public InstanceFromTemplateReservationAffinityArgs(
        @Nullable Output<InstanceFromTemplateReservationAffinitySpecificReservationArgs> specificReservation,
        Output<String> type) {
        this.specificReservation = specificReservation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceFromTemplateReservationAffinityArgs() {
        this.specificReservation = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceFromTemplateReservationAffinitySpecificReservationArgs> specificReservation;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder specificReservation(@Nullable Output<InstanceFromTemplateReservationAffinitySpecificReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }

        public Builder specificReservation(@Nullable InstanceFromTemplateReservationAffinitySpecificReservationArgs specificReservation) {
            this.specificReservation = Output.ofNullable(specificReservation);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public InstanceFromTemplateReservationAffinityArgs build() {
            return new InstanceFromTemplateReservationAffinityArgs(specificReservation, type);
        }
    }
}
