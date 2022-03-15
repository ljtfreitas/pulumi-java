// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobParameterMapArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class JobStatisticOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatisticOverrideArgs Empty = new JobStatisticOverrideArgs();

    @Import(name="parameters", required=true)
      private final Output<JobParameterMapArgs> parameters;

    public Output<JobParameterMapArgs> getParameters() {
        return this.parameters;
    }

    @Import(name="statistic", required=true)
      private final Output<String> statistic;

    public Output<String> getStatistic() {
        return this.statistic;
    }

    public JobStatisticOverrideArgs(
        Output<JobParameterMapArgs> parameters,
        Output<String> statistic) {
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
    }

    private JobStatisticOverrideArgs() {
        this.parameters = Output.empty();
        this.statistic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatisticOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<JobParameterMapArgs> parameters;
        private Output<String> statistic;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatisticOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.statistic = defaults.statistic;
        }

        public Builder parameters(Output<JobParameterMapArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder parameters(JobParameterMapArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder statistic(Output<String> statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder statistic(String statistic) {
            this.statistic = Output.of(Objects.requireNonNull(statistic));
            return this;
        }
        public JobStatisticOverrideArgs build() {
            return new JobStatisticOverrideArgs(parameters, statistic);
        }
    }
}
