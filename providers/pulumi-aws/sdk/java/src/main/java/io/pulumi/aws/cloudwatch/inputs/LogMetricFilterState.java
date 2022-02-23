// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogMetricFilterState extends io.pulumi.resources.ResourceArgs {

    public static final LogMetricFilterState Empty = new LogMetricFilterState();

    /**
     * The name of the log group to associate the metric filter with.
     * 
     */
    @InputImport(name="logGroupName")
    private final @Nullable Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName == null ? Input.empty() : this.logGroupName;
    }

    /**
     * A block defining collection of information needed to define how metric data gets emitted. See below.
     * 
     */
    @InputImport(name="metricTransformation")
    private final @Nullable Input<LogMetricFilterMetricTransformationGetArgs> metricTransformation;

    public Input<LogMetricFilterMetricTransformationGetArgs> getMetricTransformation() {
        return this.metricTransformation == null ? Input.empty() : this.metricTransformation;
    }

    /**
     * A name for the metric filter.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
     * for extracting metric data out of ingested log events.
     * 
     */
    @InputImport(name="pattern")
    private final @Nullable Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern == null ? Input.empty() : this.pattern;
    }

    public LogMetricFilterState(
        @Nullable Input<String> logGroupName,
        @Nullable Input<LogMetricFilterMetricTransformationGetArgs> metricTransformation,
        @Nullable Input<String> name,
        @Nullable Input<String> pattern) {
        this.logGroupName = logGroupName;
        this.metricTransformation = metricTransformation;
        this.name = name;
        this.pattern = pattern;
    }

    private LogMetricFilterState() {
        this.logGroupName = Input.empty();
        this.metricTransformation = Input.empty();
        this.name = Input.empty();
        this.pattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> logGroupName;
        private @Nullable Input<LogMetricFilterMetricTransformationGetArgs> metricTransformation;
        private @Nullable Input<String> name;
        private @Nullable Input<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricFilterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.metricTransformation = defaults.metricTransformation;
    	      this.name = defaults.name;
    	      this.pattern = defaults.pattern;
        }

        public Builder setLogGroupName(@Nullable Input<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = Input.ofNullable(logGroupName);
            return this;
        }

        public Builder setMetricTransformation(@Nullable Input<LogMetricFilterMetricTransformationGetArgs> metricTransformation) {
            this.metricTransformation = metricTransformation;
            return this;
        }

        public Builder setMetricTransformation(@Nullable LogMetricFilterMetricTransformationGetArgs metricTransformation) {
            this.metricTransformation = Input.ofNullable(metricTransformation);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPattern(@Nullable Input<String> pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setPattern(@Nullable String pattern) {
            this.pattern = Input.ofNullable(pattern);
            return this;
        }
        public LogMetricFilterState build() {
            return new LogMetricFilterState(logGroupName, metricTransformation, name, pattern);
        }
    }
}
