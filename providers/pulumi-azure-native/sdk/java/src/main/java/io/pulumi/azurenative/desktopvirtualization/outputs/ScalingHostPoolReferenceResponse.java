// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScalingHostPoolReferenceResponse {
    /**
     * Arm path of referenced hostpool.
     * 
     */
    private final @Nullable String hostPoolArmPath;
    /**
     * Is the scaling plan enabled for this hostpool.
     * 
     */
    private final @Nullable Boolean scalingPlanEnabled;

    @CustomType.Constructor
    private ScalingHostPoolReferenceResponse(
        @CustomType.Parameter("hostPoolArmPath") @Nullable String hostPoolArmPath,
        @CustomType.Parameter("scalingPlanEnabled") @Nullable Boolean scalingPlanEnabled) {
        this.hostPoolArmPath = hostPoolArmPath;
        this.scalingPlanEnabled = scalingPlanEnabled;
    }

    /**
     * Arm path of referenced hostpool.
     * 
    */
    public Optional<String> getHostPoolArmPath() {
        return Optional.ofNullable(this.hostPoolArmPath);
    }
    /**
     * Is the scaling plan enabled for this hostpool.
     * 
    */
    public Optional<Boolean> getScalingPlanEnabled() {
        return Optional.ofNullable(this.scalingPlanEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingHostPoolReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostPoolArmPath;
        private @Nullable Boolean scalingPlanEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingHostPoolReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPoolArmPath = defaults.hostPoolArmPath;
    	      this.scalingPlanEnabled = defaults.scalingPlanEnabled;
        }

        public Builder hostPoolArmPath(@Nullable String hostPoolArmPath) {
            this.hostPoolArmPath = hostPoolArmPath;
            return this;
        }

        public Builder scalingPlanEnabled(@Nullable Boolean scalingPlanEnabled) {
            this.scalingPlanEnabled = scalingPlanEnabled;
            return this;
        }
        public ScalingHostPoolReferenceResponse build() {
            return new ScalingHostPoolReferenceResponse(hostPoolArmPath, scalingPlanEnabled);
        }
    }
}
