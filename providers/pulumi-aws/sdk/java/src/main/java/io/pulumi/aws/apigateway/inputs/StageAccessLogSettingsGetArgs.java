// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StageAccessLogSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageAccessLogSettingsGetArgs Empty = new StageAccessLogSettingsGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
     * 
     */
    @Import(name="destinationArn", required=true)
      private final Output<String> destinationArn;

    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * The formatting and values recorded in the logs.
     * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
     * 
     */
    @Import(name="format", required=true)
      private final Output<String> format;

    public Output<String> getFormat() {
        return this.format;
    }

    public StageAccessLogSettingsGetArgs(
        Output<String> destinationArn,
        Output<String> format) {
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
    }

    private StageAccessLogSettingsGetArgs() {
        this.destinationArn = Output.empty();
        this.format = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageAccessLogSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationArn;
        private Output<String> format;

        public Builder() {
    	      // Empty
        }

        public Builder(StageAccessLogSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.format = defaults.format;
        }

        public Builder destinationArn(Output<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }

        public Builder destinationArn(String destinationArn) {
            this.destinationArn = Output.of(Objects.requireNonNull(destinationArn));
            return this;
        }

        public Builder format(Output<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder format(String format) {
            this.format = Output.of(Objects.requireNonNull(format));
            return this;
        }
        public StageAccessLogSettingsGetArgs build() {
            return new StageAccessLogSettingsGetArgs(destinationArn, format);
        }
    }
}
