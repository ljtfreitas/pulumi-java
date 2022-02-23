// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.awsnative.cloudformation.enums.StackSetRegionConcurrencyType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StackSetOperationPreferences {
    private final @Nullable Integer failureToleranceCount;
    private final @Nullable Integer failureTolerancePercentage;
    private final @Nullable Integer maxConcurrentCount;
    private final @Nullable Integer maxConcurrentPercentage;
    private final @Nullable StackSetRegionConcurrencyType regionConcurrencyType;
    private final @Nullable List<String> regionOrder;

    @OutputCustomType.Constructor({"failureToleranceCount","failureTolerancePercentage","maxConcurrentCount","maxConcurrentPercentage","regionConcurrencyType","regionOrder"})
    private StackSetOperationPreferences(
        @Nullable Integer failureToleranceCount,
        @Nullable Integer failureTolerancePercentage,
        @Nullable Integer maxConcurrentCount,
        @Nullable Integer maxConcurrentPercentage,
        @Nullable StackSetRegionConcurrencyType regionConcurrencyType,
        @Nullable List<String> regionOrder) {
        this.failureToleranceCount = failureToleranceCount;
        this.failureTolerancePercentage = failureTolerancePercentage;
        this.maxConcurrentCount = maxConcurrentCount;
        this.maxConcurrentPercentage = maxConcurrentPercentage;
        this.regionConcurrencyType = regionConcurrencyType;
        this.regionOrder = regionOrder;
    }

    public Optional<Integer> getFailureToleranceCount() {
        return Optional.ofNullable(this.failureToleranceCount);
    }
    public Optional<Integer> getFailureTolerancePercentage() {
        return Optional.ofNullable(this.failureTolerancePercentage);
    }
    public Optional<Integer> getMaxConcurrentCount() {
        return Optional.ofNullable(this.maxConcurrentCount);
    }
    public Optional<Integer> getMaxConcurrentPercentage() {
        return Optional.ofNullable(this.maxConcurrentPercentage);
    }
    public Optional<StackSetRegionConcurrencyType> getRegionConcurrencyType() {
        return Optional.ofNullable(this.regionConcurrencyType);
    }
    public List<String> getRegionOrder() {
        return this.regionOrder == null ? List.of() : this.regionOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetOperationPreferences defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failureToleranceCount;
        private @Nullable Integer failureTolerancePercentage;
        private @Nullable Integer maxConcurrentCount;
        private @Nullable Integer maxConcurrentPercentage;
        private @Nullable StackSetRegionConcurrencyType regionConcurrencyType;
        private @Nullable List<String> regionOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetOperationPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureToleranceCount = defaults.failureToleranceCount;
    	      this.failureTolerancePercentage = defaults.failureTolerancePercentage;
    	      this.maxConcurrentCount = defaults.maxConcurrentCount;
    	      this.maxConcurrentPercentage = defaults.maxConcurrentPercentage;
    	      this.regionConcurrencyType = defaults.regionConcurrencyType;
    	      this.regionOrder = defaults.regionOrder;
        }

        public Builder setFailureToleranceCount(@Nullable Integer failureToleranceCount) {
            this.failureToleranceCount = failureToleranceCount;
            return this;
        }

        public Builder setFailureTolerancePercentage(@Nullable Integer failureTolerancePercentage) {
            this.failureTolerancePercentage = failureTolerancePercentage;
            return this;
        }

        public Builder setMaxConcurrentCount(@Nullable Integer maxConcurrentCount) {
            this.maxConcurrentCount = maxConcurrentCount;
            return this;
        }

        public Builder setMaxConcurrentPercentage(@Nullable Integer maxConcurrentPercentage) {
            this.maxConcurrentPercentage = maxConcurrentPercentage;
            return this;
        }

        public Builder setRegionConcurrencyType(@Nullable StackSetRegionConcurrencyType regionConcurrencyType) {
            this.regionConcurrencyType = regionConcurrencyType;
            return this;
        }

        public Builder setRegionOrder(@Nullable List<String> regionOrder) {
            this.regionOrder = regionOrder;
            return this;
        }
        public StackSetOperationPreferences build() {
            return new StackSetOperationPreferences(failureToleranceCount, failureTolerancePercentage, maxConcurrentCount, maxConcurrentPercentage, regionConcurrencyType, regionOrder);
        }
    }
}
