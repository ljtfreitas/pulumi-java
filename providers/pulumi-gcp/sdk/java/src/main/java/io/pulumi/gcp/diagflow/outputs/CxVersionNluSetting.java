// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxVersionNluSetting {
    private final @Nullable Double classificationThreshold;
    private final @Nullable String modelTrainingMode;
    private final @Nullable String modelType;

    @CustomType.Constructor
    private CxVersionNluSetting(
        @CustomType.Parameter("classificationThreshold") @Nullable Double classificationThreshold,
        @CustomType.Parameter("modelTrainingMode") @Nullable String modelTrainingMode,
        @CustomType.Parameter("modelType") @Nullable String modelType) {
        this.classificationThreshold = classificationThreshold;
        this.modelTrainingMode = modelTrainingMode;
        this.modelType = modelType;
    }

    public Optional<Double> getClassificationThreshold() {
        return Optional.ofNullable(this.classificationThreshold);
    }
    public Optional<String> getModelTrainingMode() {
        return Optional.ofNullable(this.modelTrainingMode);
    }
    public Optional<String> getModelType() {
        return Optional.ofNullable(this.modelType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxVersionNluSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double classificationThreshold;
        private @Nullable String modelTrainingMode;
        private @Nullable String modelType;

        public Builder() {
    	      // Empty
        }

        public Builder(CxVersionNluSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationThreshold = defaults.classificationThreshold;
    	      this.modelTrainingMode = defaults.modelTrainingMode;
    	      this.modelType = defaults.modelType;
        }

        public Builder classificationThreshold(@Nullable Double classificationThreshold) {
            this.classificationThreshold = classificationThreshold;
            return this;
        }

        public Builder modelTrainingMode(@Nullable String modelTrainingMode) {
            this.modelTrainingMode = modelTrainingMode;
            return this;
        }

        public Builder modelType(@Nullable String modelType) {
            this.modelType = modelType;
            return this;
        }
        public CxVersionNluSetting build() {
            return new CxVersionNluSetting(classificationThreshold, modelTrainingMode, modelType);
        }
    }
}
