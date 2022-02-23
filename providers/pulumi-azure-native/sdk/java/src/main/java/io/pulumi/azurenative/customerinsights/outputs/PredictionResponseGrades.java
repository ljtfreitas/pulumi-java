// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PredictionResponseGrades {
    /**
     * Name of the grade.
     * 
     */
    private final @Nullable String gradeName;
    /**
     * Maximum score threshold.
     * 
     */
    private final @Nullable Integer maxScoreThreshold;
    /**
     * Minimum score threshold.
     * 
     */
    private final @Nullable Integer minScoreThreshold;

    @OutputCustomType.Constructor({"gradeName","maxScoreThreshold","minScoreThreshold"})
    private PredictionResponseGrades(
        @Nullable String gradeName,
        @Nullable Integer maxScoreThreshold,
        @Nullable Integer minScoreThreshold) {
        this.gradeName = gradeName;
        this.maxScoreThreshold = maxScoreThreshold;
        this.minScoreThreshold = minScoreThreshold;
    }

    /**
     * Name of the grade.
     * 
     */
    public Optional<String> getGradeName() {
        return Optional.ofNullable(this.gradeName);
    }
    /**
     * Maximum score threshold.
     * 
     */
    public Optional<Integer> getMaxScoreThreshold() {
        return Optional.ofNullable(this.maxScoreThreshold);
    }
    /**
     * Minimum score threshold.
     * 
     */
    public Optional<Integer> getMinScoreThreshold() {
        return Optional.ofNullable(this.minScoreThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PredictionResponseGrades defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String gradeName;
        private @Nullable Integer maxScoreThreshold;
        private @Nullable Integer minScoreThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(PredictionResponseGrades defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gradeName = defaults.gradeName;
    	      this.maxScoreThreshold = defaults.maxScoreThreshold;
    	      this.minScoreThreshold = defaults.minScoreThreshold;
        }

        public Builder setGradeName(@Nullable String gradeName) {
            this.gradeName = gradeName;
            return this;
        }

        public Builder setMaxScoreThreshold(@Nullable Integer maxScoreThreshold) {
            this.maxScoreThreshold = maxScoreThreshold;
            return this;
        }

        public Builder setMinScoreThreshold(@Nullable Integer minScoreThreshold) {
            this.minScoreThreshold = minScoreThreshold;
            return this;
        }
        public PredictionResponseGrades build() {
            return new PredictionResponseGrades(gradeName, maxScoreThreshold, minScoreThreshold);
        }
    }
}
