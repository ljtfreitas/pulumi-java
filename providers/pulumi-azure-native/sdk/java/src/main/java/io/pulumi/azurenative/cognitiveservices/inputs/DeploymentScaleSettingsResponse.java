// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment model.
 * 
 */
public final class DeploymentScaleSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentScaleSettingsResponse Empty = new DeploymentScaleSettingsResponse();

    /**
     * Deployment capacity.
     * 
     */
    @InputImport(name="capacity")
        private final @Nullable Integer capacity;

    public Optional<Integer> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Deployment scale type.
     * 
     */
    @InputImport(name="scaleType")
        private final @Nullable String scaleType;

    public Optional<String> getScaleType() {
        return this.scaleType == null ? Optional.empty() : Optional.ofNullable(this.scaleType);
    }

    public DeploymentScaleSettingsResponse(
        @Nullable Integer capacity,
        @Nullable String scaleType) {
        this.capacity = capacity;
        this.scaleType = scaleType;
    }

    private DeploymentScaleSettingsResponse() {
        this.capacity = null;
        this.scaleType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setScaleType(@Nullable String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public DeploymentScaleSettingsResponse build() {
            return new DeploymentScaleSettingsResponse(capacity, scaleType);
        }
    }
}
