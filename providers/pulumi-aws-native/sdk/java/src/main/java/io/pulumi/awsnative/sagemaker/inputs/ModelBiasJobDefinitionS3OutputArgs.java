// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.ModelBiasJobDefinitionS3OutputS3UploadMode;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about where and how to store the results of a monitoring job.
 * 
 */
public final class ModelBiasJobDefinitionS3OutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionS3OutputArgs Empty = new ModelBiasJobDefinitionS3OutputArgs();

    /**
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job. LocalPath is an absolute path for the output data.
     * 
     */
    @Import(name="localPath", required=true)
      private final Output<String> localPath;

    public Output<String> getLocalPath() {
        return this.localPath;
    }

    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * 
     */
    @Import(name="s3UploadMode")
      private final @Nullable Output<ModelBiasJobDefinitionS3OutputS3UploadMode> s3UploadMode;

    public Output<ModelBiasJobDefinitionS3OutputS3UploadMode> getS3UploadMode() {
        return this.s3UploadMode == null ? Output.empty() : this.s3UploadMode;
    }

    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * 
     */
    @Import(name="s3Uri", required=true)
      private final Output<String> s3Uri;

    public Output<String> getS3Uri() {
        return this.s3Uri;
    }

    public ModelBiasJobDefinitionS3OutputArgs(
        Output<String> localPath,
        @Nullable Output<ModelBiasJobDefinitionS3OutputS3UploadMode> s3UploadMode,
        Output<String> s3Uri) {
        this.localPath = Objects.requireNonNull(localPath, "expected parameter 'localPath' to be non-null");
        this.s3UploadMode = s3UploadMode;
        this.s3Uri = Objects.requireNonNull(s3Uri, "expected parameter 's3Uri' to be non-null");
    }

    private ModelBiasJobDefinitionS3OutputArgs() {
        this.localPath = Output.empty();
        this.s3UploadMode = Output.empty();
        this.s3Uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionS3OutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> localPath;
        private @Nullable Output<ModelBiasJobDefinitionS3OutputS3UploadMode> s3UploadMode;
        private Output<String> s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionS3OutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localPath = defaults.localPath;
    	      this.s3UploadMode = defaults.s3UploadMode;
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder localPath(Output<String> localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }

        public Builder localPath(String localPath) {
            this.localPath = Output.of(Objects.requireNonNull(localPath));
            return this;
        }

        public Builder s3UploadMode(@Nullable Output<ModelBiasJobDefinitionS3OutputS3UploadMode> s3UploadMode) {
            this.s3UploadMode = s3UploadMode;
            return this;
        }

        public Builder s3UploadMode(@Nullable ModelBiasJobDefinitionS3OutputS3UploadMode s3UploadMode) {
            this.s3UploadMode = Output.ofNullable(s3UploadMode);
            return this;
        }

        public Builder s3Uri(Output<String> s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }

        public Builder s3Uri(String s3Uri) {
            this.s3Uri = Output.of(Objects.requireNonNull(s3Uri));
            return this;
        }
        public ModelBiasJobDefinitionS3OutputArgs build() {
            return new ModelBiasJobDefinitionS3OutputArgs(localPath, s3UploadMode, s3Uri);
        }
    }
}
