// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs;
import io.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStreamArgs Empty = new MetricStreamArgs();

    /**
     * List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
     * 
     */
    @InputImport(name="excludeFilters")
    private final @Nullable Input<List<MetricStreamExcludeFilterArgs>> excludeFilters;

    public Input<List<MetricStreamExcludeFilterArgs>> getExcludeFilters() {
        return this.excludeFilters == null ? Input.empty() : this.excludeFilters;
    }

    /**
     * ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     * 
     */
    @InputImport(name="firehoseArn", required=true)
    private final Input<String> firehoseArn;

    public Input<String> getFirehoseArn() {
        return this.firehoseArn;
    }

    /**
     * List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
     * 
     */
    @InputImport(name="includeFilters")
    private final @Nullable Input<List<MetricStreamIncludeFilterArgs>> includeFilters;

    public Input<List<MetricStreamIncludeFilterArgs>> getIncludeFilters() {
        return this.includeFilters == null ? Input.empty() : this.includeFilters;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
    private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
     * 
     */
    @InputImport(name="outputFormat", required=true)
    private final Input<String> outputFormat;

    public Input<String> getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public MetricStreamArgs(
        @Nullable Input<List<MetricStreamExcludeFilterArgs>> excludeFilters,
        Input<String> firehoseArn,
        @Nullable Input<List<MetricStreamIncludeFilterArgs>> includeFilters,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        Input<String> outputFormat,
        Input<String> roleArn,
        @Nullable Input<Map<String,String>> tags) {
        this.excludeFilters = excludeFilters;
        this.firehoseArn = Objects.requireNonNull(firehoseArn, "expected parameter 'firehoseArn' to be non-null");
        this.includeFilters = includeFilters;
        this.name = name;
        this.namePrefix = namePrefix;
        this.outputFormat = Objects.requireNonNull(outputFormat, "expected parameter 'outputFormat' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private MetricStreamArgs() {
        this.excludeFilters = Input.empty();
        this.firehoseArn = Input.empty();
        this.includeFilters = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.outputFormat = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<MetricStreamExcludeFilterArgs>> excludeFilters;
        private Input<String> firehoseArn;
        private @Nullable Input<List<MetricStreamIncludeFilterArgs>> includeFilters;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private Input<String> outputFormat;
        private Input<String> roleArn;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeFilters = defaults.excludeFilters;
    	      this.firehoseArn = defaults.firehoseArn;
    	      this.includeFilters = defaults.includeFilters;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.outputFormat = defaults.outputFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setExcludeFilters(@Nullable Input<List<MetricStreamExcludeFilterArgs>> excludeFilters) {
            this.excludeFilters = excludeFilters;
            return this;
        }

        public Builder setExcludeFilters(@Nullable List<MetricStreamExcludeFilterArgs> excludeFilters) {
            this.excludeFilters = Input.ofNullable(excludeFilters);
            return this;
        }

        public Builder setFirehoseArn(Input<String> firehoseArn) {
            this.firehoseArn = Objects.requireNonNull(firehoseArn);
            return this;
        }

        public Builder setFirehoseArn(String firehoseArn) {
            this.firehoseArn = Input.of(Objects.requireNonNull(firehoseArn));
            return this;
        }

        public Builder setIncludeFilters(@Nullable Input<List<MetricStreamIncludeFilterArgs>> includeFilters) {
            this.includeFilters = includeFilters;
            return this;
        }

        public Builder setIncludeFilters(@Nullable List<MetricStreamIncludeFilterArgs> includeFilters) {
            this.includeFilters = Input.ofNullable(includeFilters);
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

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setOutputFormat(Input<String> outputFormat) {
            this.outputFormat = Objects.requireNonNull(outputFormat);
            return this;
        }

        public Builder setOutputFormat(String outputFormat) {
            this.outputFormat = Input.of(Objects.requireNonNull(outputFormat));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public MetricStreamArgs build() {
            return new MetricStreamArgs(excludeFilters, firehoseArn, includeFilters, name, namePrefix, outputFormat, roleArn, tags);
        }
    }
}
