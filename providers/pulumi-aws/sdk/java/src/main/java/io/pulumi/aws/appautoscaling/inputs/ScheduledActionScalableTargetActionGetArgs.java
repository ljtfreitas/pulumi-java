// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionScalableTargetActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionScalableTargetActionGetArgs Empty = new ScheduledActionScalableTargetActionGetArgs();

    /**
     * The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
     * 
     */
    @InputImport(name="maxCapacity")
    private final @Nullable Input<Integer> maxCapacity;

    public Input<Integer> getMaxCapacity() {
        return this.maxCapacity == null ? Input.empty() : this.maxCapacity;
    }

    /**
     * The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
     * 
     */
    @InputImport(name="minCapacity")
    private final @Nullable Input<Integer> minCapacity;

    public Input<Integer> getMinCapacity() {
        return this.minCapacity == null ? Input.empty() : this.minCapacity;
    }

    public ScheduledActionScalableTargetActionGetArgs(
        @Nullable Input<Integer> maxCapacity,
        @Nullable Input<Integer> minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
    }

    private ScheduledActionScalableTargetActionGetArgs() {
        this.maxCapacity = Input.empty();
        this.minCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionScalableTargetActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxCapacity;
        private @Nullable Input<Integer> minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionScalableTargetActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder setMaxCapacity(@Nullable Input<Integer> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder setMaxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = Input.ofNullable(maxCapacity);
            return this;
        }

        public Builder setMinCapacity(@Nullable Input<Integer> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public Builder setMinCapacity(@Nullable Integer minCapacity) {
            this.minCapacity = Input.ofNullable(minCapacity);
            return this;
        }
        public ScheduledActionScalableTargetActionGetArgs build() {
            return new ScheduledActionScalableTargetActionGetArgs(maxCapacity, minCapacity);
        }
    }
}
