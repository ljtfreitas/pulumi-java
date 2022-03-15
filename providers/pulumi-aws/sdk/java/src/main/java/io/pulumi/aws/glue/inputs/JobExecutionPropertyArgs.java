// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobExecutionPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobExecutionPropertyArgs Empty = new JobExecutionPropertyArgs();

    /**
     * The maximum number of concurrent runs allowed for a job. The default is 1.
     * 
     */
    @Import(name="maxConcurrentRuns")
      private final @Nullable Output<Integer> maxConcurrentRuns;

    public Output<Integer> getMaxConcurrentRuns() {
        return this.maxConcurrentRuns == null ? Output.empty() : this.maxConcurrentRuns;
    }

    public JobExecutionPropertyArgs(@Nullable Output<Integer> maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
    }

    private JobExecutionPropertyArgs() {
        this.maxConcurrentRuns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExecutionPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxConcurrentRuns;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExecutionPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentRuns = defaults.maxConcurrentRuns;
        }

        public Builder maxConcurrentRuns(@Nullable Output<Integer> maxConcurrentRuns) {
            this.maxConcurrentRuns = maxConcurrentRuns;
            return this;
        }

        public Builder maxConcurrentRuns(@Nullable Integer maxConcurrentRuns) {
            this.maxConcurrentRuns = Output.ofNullable(maxConcurrentRuns);
            return this;
        }
        public JobExecutionPropertyArgs build() {
            return new JobExecutionPropertyArgs(maxConcurrentRuns);
        }
    }
}
