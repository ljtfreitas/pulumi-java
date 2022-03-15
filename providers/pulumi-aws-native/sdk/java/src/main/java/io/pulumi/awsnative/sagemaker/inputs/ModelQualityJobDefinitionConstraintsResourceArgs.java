// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The baseline constraints resource for a monitoring job.
 * 
 */
public final class ModelQualityJobDefinitionConstraintsResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionConstraintsResourceArgs Empty = new ModelQualityJobDefinitionConstraintsResourceArgs();

    /**
     * The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
     * 
     */
    @Import(name="s3Uri")
      private final @Nullable Output<String> s3Uri;

    public Output<String> getS3Uri() {
        return this.s3Uri == null ? Output.empty() : this.s3Uri;
    }

    public ModelQualityJobDefinitionConstraintsResourceArgs(@Nullable Output<String> s3Uri) {
        this.s3Uri = s3Uri;
    }

    private ModelQualityJobDefinitionConstraintsResourceArgs() {
        this.s3Uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionConstraintsResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionConstraintsResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder s3Uri(@Nullable Output<String> s3Uri) {
            this.s3Uri = s3Uri;
            return this;
        }

        public Builder s3Uri(@Nullable String s3Uri) {
            this.s3Uri = Output.ofNullable(s3Uri);
            return this;
        }
        public ModelQualityJobDefinitionConstraintsResourceArgs build() {
            return new ModelQualityJobDefinitionConstraintsResourceArgs(s3Uri);
        }
    }
}
