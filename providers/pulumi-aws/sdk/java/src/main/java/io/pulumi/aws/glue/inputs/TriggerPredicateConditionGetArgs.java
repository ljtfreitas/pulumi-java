// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerPredicateConditionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerPredicateConditionGetArgs Empty = new TriggerPredicateConditionGetArgs();

    /**
     * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawler_name` must also be specified. Conflicts with `state`.
     * 
     */
    @InputImport(name="crawlState")
    private final @Nullable Input<String> crawlState;

    public Input<String> getCrawlState() {
        return this.crawlState == null ? Input.empty() : this.crawlState;
    }

    /**
     * The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
     */
    @InputImport(name="crawlerName")
    private final @Nullable Input<String> crawlerName;

    public Input<String> getCrawlerName() {
        return this.crawlerName == null ? Input.empty() : this.crawlerName;
    }

    /**
     * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
     */
    @InputImport(name="jobName")
    private final @Nullable Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName == null ? Input.empty() : this.jobName;
    }

    /**
     * A logical operator. Defaults to `EQUALS`.
     * 
     */
    @InputImport(name="logicalOperator")
    private final @Nullable Input<String> logicalOperator;

    public Input<String> getLogicalOperator() {
        return this.logicalOperator == null ? Input.empty() : this.logicalOperator;
    }

    /**
     * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `job_name` must also be specified. Conflicts with `crawler_state`.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public TriggerPredicateConditionGetArgs(
        @Nullable Input<String> crawlState,
        @Nullable Input<String> crawlerName,
        @Nullable Input<String> jobName,
        @Nullable Input<String> logicalOperator,
        @Nullable Input<String> state) {
        this.crawlState = crawlState;
        this.crawlerName = crawlerName;
        this.jobName = jobName;
        this.logicalOperator = logicalOperator;
        this.state = state;
    }

    private TriggerPredicateConditionGetArgs() {
        this.crawlState = Input.empty();
        this.crawlerName = Input.empty();
        this.jobName = Input.empty();
        this.logicalOperator = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPredicateConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> crawlState;
        private @Nullable Input<String> crawlerName;
        private @Nullable Input<String> jobName;
        private @Nullable Input<String> logicalOperator;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPredicateConditionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlState = defaults.crawlState;
    	      this.crawlerName = defaults.crawlerName;
    	      this.jobName = defaults.jobName;
    	      this.logicalOperator = defaults.logicalOperator;
    	      this.state = defaults.state;
        }

        public Builder setCrawlState(@Nullable Input<String> crawlState) {
            this.crawlState = crawlState;
            return this;
        }

        public Builder setCrawlState(@Nullable String crawlState) {
            this.crawlState = Input.ofNullable(crawlState);
            return this;
        }

        public Builder setCrawlerName(@Nullable Input<String> crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }

        public Builder setCrawlerName(@Nullable String crawlerName) {
            this.crawlerName = Input.ofNullable(crawlerName);
            return this;
        }

        public Builder setJobName(@Nullable Input<String> jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder setJobName(@Nullable String jobName) {
            this.jobName = Input.ofNullable(jobName);
            return this;
        }

        public Builder setLogicalOperator(@Nullable Input<String> logicalOperator) {
            this.logicalOperator = logicalOperator;
            return this;
        }

        public Builder setLogicalOperator(@Nullable String logicalOperator) {
            this.logicalOperator = Input.ofNullable(logicalOperator);
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
        public TriggerPredicateConditionGetArgs build() {
            return new TriggerPredicateConditionGetArgs(crawlState, crawlerName, jobName, logicalOperator, state);
        }
    }
}
