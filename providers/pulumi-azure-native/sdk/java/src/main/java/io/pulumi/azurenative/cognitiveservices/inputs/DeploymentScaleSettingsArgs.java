// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.enums.DeploymentScaleType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment model.
 * 
 */
public final class DeploymentScaleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentScaleSettingsArgs Empty = new DeploymentScaleSettingsArgs();

    /**
     * Deployment capacity.
     * 
     */
    @InputImport(name="capacity")
    private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * Deployment scale type.
     * 
     */
    @InputImport(name="scaleType")
    private final @Nullable Input<Either<String,DeploymentScaleType>> scaleType;

    public Input<Either<String,DeploymentScaleType>> getScaleType() {
        return this.scaleType == null ? Input.empty() : this.scaleType;
    }

    public DeploymentScaleSettingsArgs(
        @Nullable Input<Integer> capacity,
        @Nullable Input<Either<String,DeploymentScaleType>> scaleType) {
        this.capacity = capacity;
        this.scaleType = scaleType;
    }

    private DeploymentScaleSettingsArgs() {
        this.capacity = Input.empty();
        this.scaleType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private @Nullable Input<Either<String,DeploymentScaleType>> scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentScaleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder setCapacity(@Nullable Input<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder setScaleType(@Nullable Input<Either<String,DeploymentScaleType>> scaleType) {
            this.scaleType = scaleType;
            return this;
        }

        public Builder setScaleType(@Nullable Either<String,DeploymentScaleType> scaleType) {
            this.scaleType = Input.ofNullable(scaleType);
            return this;
        }

        public DeploymentScaleSettingsArgs build() {
            return new DeploymentScaleSettingsArgs(capacity, scaleType);
        }
    }
}
