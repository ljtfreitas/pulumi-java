// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetResourceCreationLimitPolicy {
    /**
     * Maximum number of game sessions that an individual can create during the policy period.
     * 
     */
    private final @Nullable Integer newGameSessionsPerCreator;
    /**
     * Time span used in evaluating the resource creation limit policy.
     * 
     */
    private final @Nullable Integer policyPeriodInMinutes;

    @CustomType.Constructor
    private FleetResourceCreationLimitPolicy(
        @CustomType.Parameter("newGameSessionsPerCreator") @Nullable Integer newGameSessionsPerCreator,
        @CustomType.Parameter("policyPeriodInMinutes") @Nullable Integer policyPeriodInMinutes) {
        this.newGameSessionsPerCreator = newGameSessionsPerCreator;
        this.policyPeriodInMinutes = policyPeriodInMinutes;
    }

    /**
     * Maximum number of game sessions that an individual can create during the policy period.
     * 
    */
    public Optional<Integer> getNewGameSessionsPerCreator() {
        return Optional.ofNullable(this.newGameSessionsPerCreator);
    }
    /**
     * Time span used in evaluating the resource creation limit policy.
     * 
    */
    public Optional<Integer> getPolicyPeriodInMinutes() {
        return Optional.ofNullable(this.policyPeriodInMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetResourceCreationLimitPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer newGameSessionsPerCreator;
        private @Nullable Integer policyPeriodInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetResourceCreationLimitPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newGameSessionsPerCreator = defaults.newGameSessionsPerCreator;
    	      this.policyPeriodInMinutes = defaults.policyPeriodInMinutes;
        }

        public Builder newGameSessionsPerCreator(@Nullable Integer newGameSessionsPerCreator) {
            this.newGameSessionsPerCreator = newGameSessionsPerCreator;
            return this;
        }

        public Builder policyPeriodInMinutes(@Nullable Integer policyPeriodInMinutes) {
            this.policyPeriodInMinutes = policyPeriodInMinutes;
            return this;
        }
        public FleetResourceCreationLimitPolicy build() {
            return new FleetResourceCreationLimitPolicy(newGameSessionsPerCreator, policyPeriodInMinutes);
        }
    }
}
