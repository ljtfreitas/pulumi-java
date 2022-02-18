// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.azurenative.alertsmanagement.outputs.VmGuestHealthAlertCriterionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class HealthAlertCriteriaResponse {
    /**
     * The list of metric criteria for this 'all of' operation.
     * 
     */
    private final @Nullable List<VmGuestHealthAlertCriterionResponse> allOf;

    @OutputCustomType.Constructor({"allOf"})
    private HealthAlertCriteriaResponse(@Nullable List<VmGuestHealthAlertCriterionResponse> allOf) {
        this.allOf = allOf;
    }

    /**
     * The list of metric criteria for this 'all of' operation.
     * 
     */
    public List<VmGuestHealthAlertCriterionResponse> getAllOf() {
        return this.allOf == null ? List.of() : this.allOf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthAlertCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VmGuestHealthAlertCriterionResponse> allOf;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthAlertCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
        }

        public Builder setAllOf(@Nullable List<VmGuestHealthAlertCriterionResponse> allOf) {
            this.allOf = allOf;
            return this;
        }

        public HealthAlertCriteriaResponse build() {
            return new HealthAlertCriteriaResponse(allOf);
        }
    }
}
