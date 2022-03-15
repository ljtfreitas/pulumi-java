// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionS3Output;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ModelQualityJobDefinitionMonitoringOutput {
    private final ModelQualityJobDefinitionS3Output s3Output;

    @CustomType.Constructor
    private ModelQualityJobDefinitionMonitoringOutput(@CustomType.Parameter("s3Output") ModelQualityJobDefinitionS3Output s3Output) {
        this.s3Output = s3Output;
    }

    public ModelQualityJobDefinitionS3Output getS3Output() {
        return this.s3Output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionMonitoringOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelQualityJobDefinitionS3Output s3Output;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionMonitoringOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Output = defaults.s3Output;
        }

        public Builder s3Output(ModelQualityJobDefinitionS3Output s3Output) {
            this.s3Output = Objects.requireNonNull(s3Output);
            return this;
        }
        public ModelQualityJobDefinitionMonitoringOutput build() {
            return new ModelQualityJobDefinitionMonitoringOutput(s3Output);
        }
    }
}
