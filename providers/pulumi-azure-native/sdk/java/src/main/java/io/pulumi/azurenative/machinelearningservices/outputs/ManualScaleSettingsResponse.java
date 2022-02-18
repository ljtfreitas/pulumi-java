// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManualScaleSettingsResponse {
    /**
     * Fixed number of instances for this deployment.
     * 
     */
    private final @Nullable Integer instanceCount;
    /**
     * Maximum number of instances for this deployment.
     * 
     */
    private final @Nullable Integer maxInstances;
    /**
     * Minimum number of instances for this deployment.
     * 
     */
    private final @Nullable Integer minInstances;
    /**
     * Expected value is 'Manual'.
     * 
     */
    private final String scaleType;

    @OutputCustomType.Constructor({"instanceCount","maxInstances","minInstances","scaleType"})
    private ManualScaleSettingsResponse(
        @Nullable Integer instanceCount,
        @Nullable Integer maxInstances,
        @Nullable Integer minInstances,
        String scaleType) {
        this.instanceCount = instanceCount;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.scaleType = Objects.requireNonNull(scaleType);
    }

    /**
     * Fixed number of instances for this deployment.
     * 
     */
    public Optional<Integer> getInstanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * Maximum number of instances for this deployment.
     * 
     */
    public Optional<Integer> getMaxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }
    /**
     * Minimum number of instances for this deployment.
     * 
     */
    public Optional<Integer> getMinInstances() {
        return Optional.ofNullable(this.minInstances);
    }
    /**
     * Expected value is 'Manual'.
     * 
     */
    public String getScaleType() {
        return this.scaleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceCount;
        private @Nullable Integer maxInstances;
        private @Nullable Integer minInstances;
        private String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder setInstanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder setMaxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder setMinInstances(@Nullable Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder setScaleType(String scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }

        public ManualScaleSettingsResponse build() {
            return new ManualScaleSettingsResponse(instanceCount, maxInstances, minInstances, scaleType);
        }
    }
}
