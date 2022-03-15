// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RealtimeLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigArgs Empty = new RealtimeLogConfigArgs();

    /**
     * The Amazon Kinesis data streams where real-time log data is sent.
     * 
     */
    @Import(name="endpoint", required=true)
      private final Output<RealtimeLogConfigEndpointArgs> endpoint;

    public Output<RealtimeLogConfigEndpointArgs> getEndpoint() {
        return this.endpoint;
    }

    /**
     * The fields that are included in each real-time log record. See the [AWS documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields) for supported values.
     * 
     */
    @Import(name="fields", required=true)
      private final Output<List<String>> fields;

    public Output<List<String>> getFields() {
        return this.fields;
    }

    /**
     * The unique name to identify this real-time log configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. An integer between `1` and `100`, inclusive.
     * 
     */
    @Import(name="samplingRate", required=true)
      private final Output<Integer> samplingRate;

    public Output<Integer> getSamplingRate() {
        return this.samplingRate;
    }

    public RealtimeLogConfigArgs(
        Output<RealtimeLogConfigEndpointArgs> endpoint,
        Output<List<String>> fields,
        @Nullable Output<String> name,
        Output<Integer> samplingRate) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.name = name;
        this.samplingRate = Objects.requireNonNull(samplingRate, "expected parameter 'samplingRate' to be non-null");
    }

    private RealtimeLogConfigArgs() {
        this.endpoint = Output.empty();
        this.fields = Output.empty();
        this.name = Output.empty();
        this.samplingRate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RealtimeLogConfigEndpointArgs> endpoint;
        private Output<List<String>> fields;
        private @Nullable Output<String> name;
        private Output<Integer> samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder endpoint(Output<RealtimeLogConfigEndpointArgs> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder endpoint(RealtimeLogConfigEndpointArgs endpoint) {
            this.endpoint = Output.of(Objects.requireNonNull(endpoint));
            return this;
        }

        public Builder fields(Output<List<String>> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder fields(List<String> fields) {
            this.fields = Output.of(Objects.requireNonNull(fields));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder samplingRate(Output<Integer> samplingRate) {
            this.samplingRate = Objects.requireNonNull(samplingRate);
            return this;
        }

        public Builder samplingRate(Integer samplingRate) {
            this.samplingRate = Output.of(Objects.requireNonNull(samplingRate));
            return this;
        }
        public RealtimeLogConfigArgs build() {
            return new RealtimeLogConfigArgs(endpoint, fields, name, samplingRate);
        }
    }
}
