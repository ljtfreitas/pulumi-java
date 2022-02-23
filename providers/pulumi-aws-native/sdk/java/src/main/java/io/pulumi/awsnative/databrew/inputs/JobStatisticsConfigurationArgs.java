// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobStatisticOverrideArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStatisticsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatisticsConfigurationArgs Empty = new JobStatisticsConfigurationArgs();

    @InputImport(name="includedStatistics")
        private final @Nullable Input<List<String>> includedStatistics;

    public Input<List<String>> getIncludedStatistics() {
        return this.includedStatistics == null ? Input.empty() : this.includedStatistics;
    }

    @InputImport(name="overrides")
        private final @Nullable Input<List<JobStatisticOverrideArgs>> overrides;

    public Input<List<JobStatisticOverrideArgs>> getOverrides() {
        return this.overrides == null ? Input.empty() : this.overrides;
    }

    public JobStatisticsConfigurationArgs(
        @Nullable Input<List<String>> includedStatistics,
        @Nullable Input<List<JobStatisticOverrideArgs>> overrides) {
        this.includedStatistics = includedStatistics;
        this.overrides = overrides;
    }

    private JobStatisticsConfigurationArgs() {
        this.includedStatistics = Input.empty();
        this.overrides = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatisticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> includedStatistics;
        private @Nullable Input<List<JobStatisticOverrideArgs>> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatisticsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedStatistics = defaults.includedStatistics;
    	      this.overrides = defaults.overrides;
        }

        public Builder setIncludedStatistics(@Nullable Input<List<String>> includedStatistics) {
            this.includedStatistics = includedStatistics;
            return this;
        }

        public Builder setIncludedStatistics(@Nullable List<String> includedStatistics) {
            this.includedStatistics = Input.ofNullable(includedStatistics);
            return this;
        }

        public Builder setOverrides(@Nullable Input<List<JobStatisticOverrideArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }

        public Builder setOverrides(@Nullable List<JobStatisticOverrideArgs> overrides) {
            this.overrides = Input.ofNullable(overrides);
            return this;
        }
        public JobStatisticsConfigurationArgs build() {
            return new JobStatisticsConfigurationArgs(includedStatistics, overrides);
        }
    }
}
