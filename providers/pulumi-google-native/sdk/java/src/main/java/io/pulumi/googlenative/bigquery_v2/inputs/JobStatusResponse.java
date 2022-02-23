// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.ErrorProtoResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class JobStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobStatusResponse Empty = new JobStatusResponse();

    /**
     * Final error result of the job. If present, indicates that the job has completed and was unsuccessful.
     * 
     */
    @InputImport(name="errorResult", required=true)
      private final ErrorProtoResponse errorResult;

    public ErrorProtoResponse getErrorResult() {
        return this.errorResult;
    }

    /**
     * The first errors encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
     * 
     */
    @InputImport(name="errors", required=true)
      private final List<ErrorProtoResponse> errors;

    public List<ErrorProtoResponse> getErrors() {
        return this.errors;
    }

    /**
     * Running state of the job.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public JobStatusResponse(
        ErrorProtoResponse errorResult,
        List<ErrorProtoResponse> errors,
        String state) {
        this.errorResult = Objects.requireNonNull(errorResult, "expected parameter 'errorResult' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private JobStatusResponse() {
        this.errorResult = null;
        this.errors = List.of();
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorProtoResponse errorResult;
        private List<ErrorProtoResponse> errors;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorResult = defaults.errorResult;
    	      this.errors = defaults.errors;
    	      this.state = defaults.state;
        }

        public Builder setErrorResult(ErrorProtoResponse errorResult) {
            this.errorResult = Objects.requireNonNull(errorResult);
            return this;
        }

        public Builder setErrors(List<ErrorProtoResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public JobStatusResponse build() {
            return new JobStatusResponse(errorResult, errors, state);
        }
    }
}
