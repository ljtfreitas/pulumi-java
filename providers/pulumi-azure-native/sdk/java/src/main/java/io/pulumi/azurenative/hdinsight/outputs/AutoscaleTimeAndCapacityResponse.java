// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscaleTimeAndCapacityResponse {
    /**
     * The maximum instance count of the cluster
     * 
     */
    private final @Nullable Integer maxInstanceCount;
    /**
     * The minimum instance count of the cluster
     * 
     */
    private final @Nullable Integer minInstanceCount;
    /**
     * 24-hour time in the form xx:xx
     * 
     */
    private final @Nullable String time;

    @OutputCustomType.Constructor({"maxInstanceCount","minInstanceCount","time"})
    private AutoscaleTimeAndCapacityResponse(
        @Nullable Integer maxInstanceCount,
        @Nullable Integer minInstanceCount,
        @Nullable String time) {
        this.maxInstanceCount = maxInstanceCount;
        this.minInstanceCount = minInstanceCount;
        this.time = time;
    }

    /**
     * The maximum instance count of the cluster
     * 
     */
    public Optional<Integer> getMaxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }
    /**
     * The minimum instance count of the cluster
     * 
     */
    public Optional<Integer> getMinInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }
    /**
     * 24-hour time in the form xx:xx
     * 
     */
    public Optional<String> getTime() {
        return Optional.ofNullable(this.time);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleTimeAndCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstanceCount;
        private @Nullable Integer minInstanceCount;
        private @Nullable String time;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleTimeAndCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
    	      this.time = defaults.time;
        }

        public Builder setMaxInstanceCount(@Nullable Integer maxInstanceCount) {
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }

        public Builder setMinInstanceCount(@Nullable Integer minInstanceCount) {
            this.minInstanceCount = minInstanceCount;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = time;
            return this;
        }
        public AutoscaleTimeAndCapacityResponse build() {
            return new AutoscaleTimeAndCapacityResponse(maxInstanceCount, minInstanceCount, time);
        }
    }
}
