// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs();

    /**
     * The ARN of the input Kinesis data stream to read.
     * 
     */
    @InputImport(name="resourceArn", required=true)
    private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs(Input<String> resourceArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs() {
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setResourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs(resourceArn);
        }
    }
}
