// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecoveryPlanA2ADetailsResponse {
    /**
     * Gets the Instance type.
     * Expected value is 'A2A'.
     * 
     */
    private final String instanceType;
    /**
     * The primary zone.
     * 
     */
    private final @Nullable String primaryZone;
    /**
     * The recovery zone.
     * 
     */
    private final @Nullable String recoveryZone;

    @OutputCustomType.Constructor({"instanceType","primaryZone","recoveryZone"})
    private RecoveryPlanA2ADetailsResponse(
        String instanceType,
        @Nullable String primaryZone,
        @Nullable String recoveryZone) {
        this.instanceType = Objects.requireNonNull(instanceType);
        this.primaryZone = primaryZone;
        this.recoveryZone = recoveryZone;
    }

    /**
     * Gets the Instance type.
     * Expected value is 'A2A'.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The primary zone.
     * 
     */
    public Optional<String> getPrimaryZone() {
        return Optional.ofNullable(this.primaryZone);
    }
    /**
     * The recovery zone.
     * 
     */
    public Optional<String> getRecoveryZone() {
        return Optional.ofNullable(this.recoveryZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanA2ADetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private @Nullable String primaryZone;
        private @Nullable String recoveryZone;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanA2ADetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.primaryZone = defaults.primaryZone;
    	      this.recoveryZone = defaults.recoveryZone;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setPrimaryZone(@Nullable String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }

        public Builder setRecoveryZone(@Nullable String recoveryZone) {
            this.recoveryZone = recoveryZone;
            return this;
        }
        public RecoveryPlanA2ADetailsResponse build() {
            return new RecoveryPlanA2ADetailsResponse(instanceType, primaryZone, recoveryZone);
        }
    }
}
