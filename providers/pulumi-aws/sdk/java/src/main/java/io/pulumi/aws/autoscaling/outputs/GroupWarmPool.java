// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupWarmPool {
    /**
     * Specifies the total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
     * 
     */
    private final @Nullable Integer maxGroupPreparedCapacity;
    /**
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    private final @Nullable Integer minSize;
    /**
     * Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default) or Running.
     * 
     */
    private final @Nullable String poolState;

    @OutputCustomType.Constructor({"maxGroupPreparedCapacity","minSize","poolState"})
    private GroupWarmPool(
        @Nullable Integer maxGroupPreparedCapacity,
        @Nullable Integer minSize,
        @Nullable String poolState) {
        this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
        this.minSize = minSize;
        this.poolState = poolState;
    }

    /**
     * Specifies the total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
     * 
     */
    public Optional<Integer> getMaxGroupPreparedCapacity() {
        return Optional.ofNullable(this.maxGroupPreparedCapacity);
    }
    /**
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    public Optional<Integer> getMinSize() {
        return Optional.ofNullable(this.minSize);
    }
    /**
     * Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default) or Running.
     * 
     */
    public Optional<String> getPoolState() {
        return Optional.ofNullable(this.poolState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupWarmPool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxGroupPreparedCapacity;
        private @Nullable Integer minSize;
        private @Nullable String poolState;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupWarmPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxGroupPreparedCapacity = defaults.maxGroupPreparedCapacity;
    	      this.minSize = defaults.minSize;
    	      this.poolState = defaults.poolState;
        }

        public Builder setMaxGroupPreparedCapacity(@Nullable Integer maxGroupPreparedCapacity) {
            this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
            return this;
        }

        public Builder setMinSize(@Nullable Integer minSize) {
            this.minSize = minSize;
            return this;
        }

        public Builder setPoolState(@Nullable String poolState) {
            this.poolState = poolState;
            return this;
        }
        public GroupWarmPool build() {
            return new GroupWarmPool(maxGroupPreparedCapacity, minSize, poolState);
        }
    }
}
