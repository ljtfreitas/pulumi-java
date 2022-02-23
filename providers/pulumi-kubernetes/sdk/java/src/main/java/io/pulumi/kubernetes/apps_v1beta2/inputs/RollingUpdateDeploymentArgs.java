// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Spec to control the desired behavior of rolling update.
 * 
 */
public final class RollingUpdateDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RollingUpdateDeploymentArgs Empty = new RollingUpdateDeploymentArgs();

    /**
     * The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     * 
     */
    @InputImport(name="maxSurge")
        private final @Nullable Input<Either<Integer,String>> maxSurge;

    public Input<Either<Integer,String>> getMaxSurge() {
        return this.maxSurge == null ? Input.empty() : this.maxSurge;
    }

    /**
     * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     * 
     */
    @InputImport(name="maxUnavailable")
        private final @Nullable Input<Either<Integer,String>> maxUnavailable;

    public Input<Either<Integer,String>> getMaxUnavailable() {
        return this.maxUnavailable == null ? Input.empty() : this.maxUnavailable;
    }

    public RollingUpdateDeploymentArgs(
        @Nullable Input<Either<Integer,String>> maxSurge,
        @Nullable Input<Either<Integer,String>> maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    private RollingUpdateDeploymentArgs() {
        this.maxSurge = Input.empty();
        this.maxUnavailable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<Integer,String>> maxSurge;
        private @Nullable Input<Either<Integer,String>> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder setMaxSurge(@Nullable Input<Either<Integer,String>> maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        public Builder setMaxSurge(@Nullable Either<Integer,String> maxSurge) {
            this.maxSurge = Input.ofNullable(maxSurge);
            return this;
        }

        public Builder setMaxUnavailable(@Nullable Input<Either<Integer,String>> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        public Builder setMaxUnavailable(@Nullable Either<Integer,String> maxUnavailable) {
            this.maxUnavailable = Input.ofNullable(maxUnavailable);
            return this;
        }
        public RollingUpdateDeploymentArgs build() {
            return new RollingUpdateDeploymentArgs(maxSurge, maxUnavailable);
        }
    }
}
