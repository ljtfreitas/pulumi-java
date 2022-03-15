// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs();

    /**
     * The ARN of the input Kinesis data stream to read.
     * 
     */
    @Import(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs(Output<String> resourceArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs() {
        this.resourceArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs(resourceArn);
        }
    }
}
