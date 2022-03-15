// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.AutoScaleRunErrorResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoScaleRunResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoScaleRunResponse Empty = new AutoScaleRunResponse();

    @Import(name="error")
      private final @Nullable AutoScaleRunErrorResponse error;

    public Optional<AutoScaleRunErrorResponse> getError() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    @Import(name="evaluationTime", required=true)
      private final String evaluationTime;

    public String getEvaluationTime() {
        return this.evaluationTime;
    }

    /**
     * Each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     * 
     */
    @Import(name="results")
      private final @Nullable String results;

    public Optional<String> getResults() {
        return this.results == null ? Optional.empty() : Optional.ofNullable(this.results);
    }

    public AutoScaleRunResponse(
        @Nullable AutoScaleRunErrorResponse error,
        String evaluationTime,
        @Nullable String results) {
        this.error = error;
        this.evaluationTime = Objects.requireNonNull(evaluationTime, "expected parameter 'evaluationTime' to be non-null");
        this.results = results;
    }

    private AutoScaleRunResponse() {
        this.error = null;
        this.evaluationTime = null;
        this.results = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoScaleRunErrorResponse error;
        private String evaluationTime;
        private @Nullable String results;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.evaluationTime = defaults.evaluationTime;
    	      this.results = defaults.results;
        }

        public Builder error(@Nullable AutoScaleRunErrorResponse error) {
            this.error = error;
            return this;
        }

        public Builder evaluationTime(String evaluationTime) {
            this.evaluationTime = Objects.requireNonNull(evaluationTime);
            return this;
        }

        public Builder results(@Nullable String results) {
            this.results = results;
            return this;
        }
        public AutoScaleRunResponse build() {
            return new AutoScaleRunResponse(error, evaluationTime, results);
        }
    }
}
