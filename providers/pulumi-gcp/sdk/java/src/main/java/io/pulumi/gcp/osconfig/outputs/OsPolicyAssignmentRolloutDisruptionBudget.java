// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentRolloutDisruptionBudget {
    /**
     * Specifies a fixed value.
     * 
     */
    private final @Nullable Integer fixed;
    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    private final @Nullable Integer percent;

    @CustomType.Constructor
    private OsPolicyAssignmentRolloutDisruptionBudget(
        @CustomType.Parameter("fixed") @Nullable Integer fixed,
        @CustomType.Parameter("percent") @Nullable Integer percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    /**
     * Specifies a fixed value.
     * 
    */
    public Optional<Integer> getFixed() {
        return Optional.ofNullable(this.fixed);
    }
    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
    */
    public Optional<Integer> getPercent() {
        return Optional.ofNullable(this.percent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentRolloutDisruptionBudget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fixed;
        private @Nullable Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentRolloutDisruptionBudget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(@Nullable Integer fixed) {
            this.fixed = fixed;
            return this;
        }

        public Builder percent(@Nullable Integer percent) {
            this.percent = percent;
            return this;
        }
        public OsPolicyAssignmentRolloutDisruptionBudget build() {
            return new OsPolicyAssignmentRolloutDisruptionBudget(fixed, percent);
        }
    }
}
