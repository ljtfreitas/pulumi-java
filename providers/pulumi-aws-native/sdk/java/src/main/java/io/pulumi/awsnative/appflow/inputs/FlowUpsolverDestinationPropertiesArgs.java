// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowUpsolverS3OutputFormatConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowUpsolverDestinationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowUpsolverDestinationPropertiesArgs Empty = new FlowUpsolverDestinationPropertiesArgs();

    @Import(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName;
    }

    @Import(name="bucketPrefix")
      private final @Nullable Output<String> bucketPrefix;

    public Output<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Output.empty() : this.bucketPrefix;
    }

    @Import(name="s3OutputFormatConfig", required=true)
      private final Output<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig;

    public Output<FlowUpsolverS3OutputFormatConfigArgs> getS3OutputFormatConfig() {
        return this.s3OutputFormatConfig;
    }

    public FlowUpsolverDestinationPropertiesArgs(
        Output<String> bucketName,
        @Nullable Output<String> bucketPrefix,
        Output<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.s3OutputFormatConfig = Objects.requireNonNull(s3OutputFormatConfig, "expected parameter 's3OutputFormatConfig' to be non-null");
    }

    private FlowUpsolverDestinationPropertiesArgs() {
        this.bucketName = Output.empty();
        this.bucketPrefix = Output.empty();
        this.s3OutputFormatConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowUpsolverDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketName;
        private @Nullable Output<String> bucketPrefix;
        private Output<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowUpsolverDestinationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3OutputFormatConfig = defaults.s3OutputFormatConfig;
        }

        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Output.ofNullable(bucketPrefix);
            return this;
        }

        public Builder s3OutputFormatConfig(Output<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig) {
            this.s3OutputFormatConfig = Objects.requireNonNull(s3OutputFormatConfig);
            return this;
        }

        public Builder s3OutputFormatConfig(FlowUpsolverS3OutputFormatConfigArgs s3OutputFormatConfig) {
            this.s3OutputFormatConfig = Output.of(Objects.requireNonNull(s3OutputFormatConfig));
            return this;
        }
        public FlowUpsolverDestinationPropertiesArgs build() {
            return new FlowUpsolverDestinationPropertiesArgs(bucketName, bucketPrefix, s3OutputFormatConfig);
        }
    }
}
