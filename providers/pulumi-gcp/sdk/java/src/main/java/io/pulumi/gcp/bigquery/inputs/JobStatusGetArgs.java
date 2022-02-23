// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.JobStatusErrorGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobStatusErrorResultGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusGetArgs Empty = new JobStatusGetArgs();

    @InputImport(name="errorResults")
        private final @Nullable Input<List<JobStatusErrorResultGetArgs>> errorResults;

    public Input<List<JobStatusErrorResultGetArgs>> getErrorResults() {
        return this.errorResults == null ? Input.empty() : this.errorResults;
    }

    @InputImport(name="errors")
        private final @Nullable Input<List<JobStatusErrorGetArgs>> errors;

    public Input<List<JobStatusErrorGetArgs>> getErrors() {
        return this.errors == null ? Input.empty() : this.errors;
    }

    @InputImport(name="state")
        private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public JobStatusGetArgs(
        @Nullable Input<List<JobStatusErrorResultGetArgs>> errorResults,
        @Nullable Input<List<JobStatusErrorGetArgs>> errors,
        @Nullable Input<String> state) {
        this.errorResults = errorResults;
        this.errors = errors;
        this.state = state;
    }

    private JobStatusGetArgs() {
        this.errorResults = Input.empty();
        this.errors = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<JobStatusErrorResultGetArgs>> errorResults;
        private @Nullable Input<List<JobStatusErrorGetArgs>> errors;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorResults = defaults.errorResults;
    	      this.errors = defaults.errors;
    	      this.state = defaults.state;
        }

        public Builder setErrorResults(@Nullable Input<List<JobStatusErrorResultGetArgs>> errorResults) {
            this.errorResults = errorResults;
            return this;
        }

        public Builder setErrorResults(@Nullable List<JobStatusErrorResultGetArgs> errorResults) {
            this.errorResults = Input.ofNullable(errorResults);
            return this;
        }

        public Builder setErrors(@Nullable Input<List<JobStatusErrorGetArgs>> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setErrors(@Nullable List<JobStatusErrorGetArgs> errors) {
            this.errors = Input.ofNullable(errors);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public JobStatusGetArgs build() {
            return new JobStatusGetArgs(errorResults, errors, state);
        }
    }
}
