// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.bigquery.inputs.JobStatusErrorGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobStatusErrorResultGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusGetArgs Empty = new JobStatusGetArgs();

    @Import(name="errorResults")
      private final @Nullable Output<List<JobStatusErrorResultGetArgs>> errorResults;

    public Output<List<JobStatusErrorResultGetArgs>> getErrorResults() {
        return this.errorResults == null ? Output.empty() : this.errorResults;
    }

    @Import(name="errors")
      private final @Nullable Output<List<JobStatusErrorGetArgs>> errors;

    public Output<List<JobStatusErrorGetArgs>> getErrors() {
        return this.errors == null ? Output.empty() : this.errors;
    }

    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public JobStatusGetArgs(
        @Nullable Output<List<JobStatusErrorResultGetArgs>> errorResults,
        @Nullable Output<List<JobStatusErrorGetArgs>> errors,
        @Nullable Output<String> state) {
        this.errorResults = errorResults;
        this.errors = errors;
        this.state = state;
    }

    private JobStatusGetArgs() {
        this.errorResults = Output.empty();
        this.errors = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<JobStatusErrorResultGetArgs>> errorResults;
        private @Nullable Output<List<JobStatusErrorGetArgs>> errors;
        private @Nullable Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorResults = defaults.errorResults;
    	      this.errors = defaults.errors;
    	      this.state = defaults.state;
        }

        public Builder errorResults(@Nullable Output<List<JobStatusErrorResultGetArgs>> errorResults) {
            this.errorResults = errorResults;
            return this;
        }

        public Builder errorResults(@Nullable List<JobStatusErrorResultGetArgs> errorResults) {
            this.errorResults = Output.ofNullable(errorResults);
            return this;
        }

        public Builder errors(@Nullable Output<List<JobStatusErrorGetArgs>> errors) {
            this.errors = errors;
            return this;
        }

        public Builder errors(@Nullable List<JobStatusErrorGetArgs> errors) {
            this.errors = Output.ofNullable(errors);
            return this;
        }

        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public JobStatusGetArgs build() {
            return new JobStatusGetArgs(errorResults, errors, state);
        }
    }
}
