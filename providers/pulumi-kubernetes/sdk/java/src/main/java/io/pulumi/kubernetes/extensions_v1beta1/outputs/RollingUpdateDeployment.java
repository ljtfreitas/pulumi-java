// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RollingUpdateDeployment {
    /**
     * The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     * 
     */
    private final @Nullable Either<Integer,String> maxSurge;
    /**
     * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     * 
     */
    private final @Nullable Either<Integer,String> maxUnavailable;

    @CustomType.Constructor
    private RollingUpdateDeployment(
        @CustomType.Parameter("maxSurge") @Nullable Either<Integer,String> maxSurge,
        @CustomType.Parameter("maxUnavailable") @Nullable Either<Integer,String> maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    /**
     * The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     * 
    */
    public Optional<Either<Integer,String>> getMaxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    /**
     * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     * 
    */
    public Optional<Either<Integer,String>> getMaxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<Integer,String> maxSurge;
        private @Nullable Either<Integer,String> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxSurge(@Nullable Either<Integer,String> maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        public Builder maxUnavailable(@Nullable Either<Integer,String> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public RollingUpdateDeployment build() {
            return new RollingUpdateDeployment(maxSurge, maxUnavailable);
        }
    }
}
