// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.GetInstanceTemplateReservationAffinitySpecificReservation;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTemplateReservationAffinity extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateReservationAffinity Empty = new GetInstanceTemplateReservationAffinity();

    @Import(name="specificReservations", required=true)
      private final List<GetInstanceTemplateReservationAffinitySpecificReservation> specificReservations;

    public List<GetInstanceTemplateReservationAffinitySpecificReservation> getSpecificReservations() {
        return this.specificReservations;
    }

    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GetInstanceTemplateReservationAffinity(
        List<GetInstanceTemplateReservationAffinitySpecificReservation> specificReservations,
        String type) {
        this.specificReservations = Objects.requireNonNull(specificReservations, "expected parameter 'specificReservations' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetInstanceTemplateReservationAffinity() {
        this.specificReservations = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateReservationAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInstanceTemplateReservationAffinitySpecificReservation> specificReservations;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateReservationAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservations = defaults.specificReservations;
    	      this.type = defaults.type;
        }

        public Builder specificReservations(List<GetInstanceTemplateReservationAffinitySpecificReservation> specificReservations) {
            this.specificReservations = Objects.requireNonNull(specificReservations);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInstanceTemplateReservationAffinity build() {
            return new GetInstanceTemplateReservationAffinity(specificReservations, type);
        }
    }
}
