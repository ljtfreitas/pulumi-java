// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The load-based autoscale request parameters
 * 
 */
public final class AutoscaleCapacityResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscaleCapacityResponse Empty = new AutoscaleCapacityResponse();

    /**
     * The maximum instance count of the cluster
     * 
     */
    @Import(name="maxInstanceCount")
      private final @Nullable Integer maxInstanceCount;

    public Optional<Integer> getMaxInstanceCount() {
        return this.maxInstanceCount == null ? Optional.empty() : Optional.ofNullable(this.maxInstanceCount);
    }

    /**
     * The minimum instance count of the cluster
     * 
     */
    @Import(name="minInstanceCount")
      private final @Nullable Integer minInstanceCount;

    public Optional<Integer> getMinInstanceCount() {
        return this.minInstanceCount == null ? Optional.empty() : Optional.ofNullable(this.minInstanceCount);
    }

    public AutoscaleCapacityResponse(
        @Nullable Integer maxInstanceCount,
        @Nullable Integer minInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        this.minInstanceCount = minInstanceCount;
    }

    private AutoscaleCapacityResponse() {
        this.maxInstanceCount = null;
        this.minInstanceCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstanceCount;
        private @Nullable Integer minInstanceCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
        }

        public Builder maxInstanceCount(@Nullable Integer maxInstanceCount) {
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }

        public Builder minInstanceCount(@Nullable Integer minInstanceCount) {
            this.minInstanceCount = minInstanceCount;
            return this;
        }
        public AutoscaleCapacityResponse build() {
            return new AutoscaleCapacityResponse(maxInstanceCount, minInstanceCount);
        }
    }
}
