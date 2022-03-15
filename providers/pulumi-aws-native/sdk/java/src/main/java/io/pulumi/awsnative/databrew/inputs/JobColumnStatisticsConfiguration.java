// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobColumnSelector;
import io.pulumi.awsnative.databrew.inputs.JobStatisticsConfiguration;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobColumnStatisticsConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final JobColumnStatisticsConfiguration Empty = new JobColumnStatisticsConfiguration();

    @Import(name="selectors")
      private final @Nullable List<JobColumnSelector> selectors;

    public List<JobColumnSelector> getSelectors() {
        return this.selectors == null ? List.of() : this.selectors;
    }

    @Import(name="statistics", required=true)
      private final JobStatisticsConfiguration statistics;

    public JobStatisticsConfiguration getStatistics() {
        return this.statistics;
    }

    public JobColumnStatisticsConfiguration(
        @Nullable List<JobColumnSelector> selectors,
        JobStatisticsConfiguration statistics) {
        this.selectors = selectors;
        this.statistics = Objects.requireNonNull(statistics, "expected parameter 'statistics' to be non-null");
    }

    private JobColumnStatisticsConfiguration() {
        this.selectors = List.of();
        this.statistics = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobColumnStatisticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<JobColumnSelector> selectors;
        private JobStatisticsConfiguration statistics;

        public Builder() {
    	      // Empty
        }

        public Builder(JobColumnStatisticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectors = defaults.selectors;
    	      this.statistics = defaults.statistics;
        }

        public Builder selectors(@Nullable List<JobColumnSelector> selectors) {
            this.selectors = selectors;
            return this;
        }

        public Builder statistics(JobStatisticsConfiguration statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }
        public JobColumnStatisticsConfiguration build() {
            return new JobColumnStatisticsConfiguration(selectors, statistics);
        }
    }
}
