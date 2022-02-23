// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionS3Output;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ModelBiasJobDefinitionMonitoringOutput {
    private final ModelBiasJobDefinitionS3Output s3Output;

    @OutputCustomType.Constructor({"s3Output"})
    private ModelBiasJobDefinitionMonitoringOutput(ModelBiasJobDefinitionS3Output s3Output) {
        this.s3Output = Objects.requireNonNull(s3Output);
    }

    public ModelBiasJobDefinitionS3Output getS3Output() {
        return this.s3Output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionMonitoringOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelBiasJobDefinitionS3Output s3Output;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionMonitoringOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Output = defaults.s3Output;
        }

        public Builder setS3Output(ModelBiasJobDefinitionS3Output s3Output) {
            this.s3Output = Objects.requireNonNull(s3Output);
            return this;
        }
        public ModelBiasJobDefinitionMonitoringOutput build() {
            return new ModelBiasJobDefinitionMonitoringOutput(s3Output);
        }
    }
}
