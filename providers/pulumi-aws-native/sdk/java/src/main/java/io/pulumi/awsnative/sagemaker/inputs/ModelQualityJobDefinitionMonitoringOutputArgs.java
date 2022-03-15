// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionS3OutputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The output object for a monitoring job.
 * 
 */
public final class ModelQualityJobDefinitionMonitoringOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionMonitoringOutputArgs Empty = new ModelQualityJobDefinitionMonitoringOutputArgs();

    @Import(name="s3Output", required=true)
      private final Output<ModelQualityJobDefinitionS3OutputArgs> s3Output;

    public Output<ModelQualityJobDefinitionS3OutputArgs> getS3Output() {
        return this.s3Output;
    }

    public ModelQualityJobDefinitionMonitoringOutputArgs(Output<ModelQualityJobDefinitionS3OutputArgs> s3Output) {
        this.s3Output = Objects.requireNonNull(s3Output, "expected parameter 's3Output' to be non-null");
    }

    private ModelQualityJobDefinitionMonitoringOutputArgs() {
        this.s3Output = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionMonitoringOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ModelQualityJobDefinitionS3OutputArgs> s3Output;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionMonitoringOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Output = defaults.s3Output;
        }

        public Builder s3Output(Output<ModelQualityJobDefinitionS3OutputArgs> s3Output) {
            this.s3Output = Objects.requireNonNull(s3Output);
            return this;
        }

        public Builder s3Output(ModelQualityJobDefinitionS3OutputArgs s3Output) {
            this.s3Output = Output.of(Objects.requireNonNull(s3Output));
            return this;
        }
        public ModelQualityJobDefinitionMonitoringOutputArgs build() {
            return new ModelQualityJobDefinitionMonitoringOutputArgs(s3Output);
        }
    }
}
