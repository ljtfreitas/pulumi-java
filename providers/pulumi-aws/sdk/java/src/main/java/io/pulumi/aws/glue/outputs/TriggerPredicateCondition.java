// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerPredicateCondition {
    /**
     * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawler_name` must also be specified. Conflicts with `state`.
     * 
     */
    private final @Nullable String crawlState;
    /**
     * The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
     */
    private final @Nullable String crawlerName;
    /**
     * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
     */
    private final @Nullable String jobName;
    /**
     * A logical operator. Defaults to `EQUALS`.
     * 
     */
    private final @Nullable String logicalOperator;
    /**
     * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `job_name` must also be specified. Conflicts with `crawler_state`.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private TriggerPredicateCondition(
        @CustomType.Parameter("crawlState") @Nullable String crawlState,
        @CustomType.Parameter("crawlerName") @Nullable String crawlerName,
        @CustomType.Parameter("jobName") @Nullable String jobName,
        @CustomType.Parameter("logicalOperator") @Nullable String logicalOperator,
        @CustomType.Parameter("state") @Nullable String state) {
        this.crawlState = crawlState;
        this.crawlerName = crawlerName;
        this.jobName = jobName;
        this.logicalOperator = logicalOperator;
        this.state = state;
    }

    /**
     * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawler_name` must also be specified. Conflicts with `state`.
     * 
    */
    public Optional<String> getCrawlState() {
        return Optional.ofNullable(this.crawlState);
    }
    /**
     * The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
    */
    public Optional<String> getCrawlerName() {
        return Optional.ofNullable(this.crawlerName);
    }
    /**
     * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
    */
    public Optional<String> getJobName() {
        return Optional.ofNullable(this.jobName);
    }
    /**
     * A logical operator. Defaults to `EQUALS`.
     * 
    */
    public Optional<String> getLogicalOperator() {
        return Optional.ofNullable(this.logicalOperator);
    }
    /**
     * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `job_name` must also be specified. Conflicts with `crawler_state`.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPredicateCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String crawlState;
        private @Nullable String crawlerName;
        private @Nullable String jobName;
        private @Nullable String logicalOperator;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPredicateCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlState = defaults.crawlState;
    	      this.crawlerName = defaults.crawlerName;
    	      this.jobName = defaults.jobName;
    	      this.logicalOperator = defaults.logicalOperator;
    	      this.state = defaults.state;
        }

        public Builder crawlState(@Nullable String crawlState) {
            this.crawlState = crawlState;
            return this;
        }

        public Builder crawlerName(@Nullable String crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }

        public Builder jobName(@Nullable String jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder logicalOperator(@Nullable String logicalOperator) {
            this.logicalOperator = logicalOperator;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public TriggerPredicateCondition build() {
            return new TriggerPredicateCondition(crawlState, crawlerName, jobName, logicalOperator, state);
        }
    }
}
