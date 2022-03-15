// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssociationS3OutputLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssociationS3OutputLocationArgs Empty = new AssociationS3OutputLocationArgs();

    @Import(name="outputS3BucketName")
      private final @Nullable Output<String> outputS3BucketName;

    public Output<String> getOutputS3BucketName() {
        return this.outputS3BucketName == null ? Output.empty() : this.outputS3BucketName;
    }

    @Import(name="outputS3KeyPrefix")
      private final @Nullable Output<String> outputS3KeyPrefix;

    public Output<String> getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix == null ? Output.empty() : this.outputS3KeyPrefix;
    }

    @Import(name="outputS3Region")
      private final @Nullable Output<String> outputS3Region;

    public Output<String> getOutputS3Region() {
        return this.outputS3Region == null ? Output.empty() : this.outputS3Region;
    }

    public AssociationS3OutputLocationArgs(
        @Nullable Output<String> outputS3BucketName,
        @Nullable Output<String> outputS3KeyPrefix,
        @Nullable Output<String> outputS3Region) {
        this.outputS3BucketName = outputS3BucketName;
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        this.outputS3Region = outputS3Region;
    }

    private AssociationS3OutputLocationArgs() {
        this.outputS3BucketName = Output.empty();
        this.outputS3KeyPrefix = Output.empty();
        this.outputS3Region = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationS3OutputLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> outputS3BucketName;
        private @Nullable Output<String> outputS3KeyPrefix;
        private @Nullable Output<String> outputS3Region;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationS3OutputLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputS3BucketName = defaults.outputS3BucketName;
    	      this.outputS3KeyPrefix = defaults.outputS3KeyPrefix;
    	      this.outputS3Region = defaults.outputS3Region;
        }

        public Builder outputS3BucketName(@Nullable Output<String> outputS3BucketName) {
            this.outputS3BucketName = outputS3BucketName;
            return this;
        }

        public Builder outputS3BucketName(@Nullable String outputS3BucketName) {
            this.outputS3BucketName = Output.ofNullable(outputS3BucketName);
            return this;
        }

        public Builder outputS3KeyPrefix(@Nullable Output<String> outputS3KeyPrefix) {
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            return this;
        }

        public Builder outputS3KeyPrefix(@Nullable String outputS3KeyPrefix) {
            this.outputS3KeyPrefix = Output.ofNullable(outputS3KeyPrefix);
            return this;
        }

        public Builder outputS3Region(@Nullable Output<String> outputS3Region) {
            this.outputS3Region = outputS3Region;
            return this;
        }

        public Builder outputS3Region(@Nullable String outputS3Region) {
            this.outputS3Region = Output.ofNullable(outputS3Region);
            return this;
        }
        public AssociationS3OutputLocationArgs build() {
            return new AssociationS3OutputLocationArgs(outputS3BucketName, outputS3KeyPrefix, outputS3Region);
        }
    }
}
