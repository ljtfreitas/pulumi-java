// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse;
import java.util.Objects;


public final class GoogleCloudDatalabelingV1beta1EvaluationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1EvaluationConfigResponse Empty = new GoogleCloudDatalabelingV1beta1EvaluationConfigResponse();

    @InputImport(name="boundingBoxEvaluationOptions", required=true)
    private final GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse boundingBoxEvaluationOptions;

    public GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse getBoundingBoxEvaluationOptions() {
        return this.boundingBoxEvaluationOptions;
    }

    public GoogleCloudDatalabelingV1beta1EvaluationConfigResponse(GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse boundingBoxEvaluationOptions) {
        this.boundingBoxEvaluationOptions = Objects.requireNonNull(boundingBoxEvaluationOptions, "expected parameter 'boundingBoxEvaluationOptions' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1EvaluationConfigResponse() {
        this.boundingBoxEvaluationOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1EvaluationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse boundingBoxEvaluationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1EvaluationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boundingBoxEvaluationOptions = defaults.boundingBoxEvaluationOptions;
        }

        public Builder setBoundingBoxEvaluationOptions(GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse boundingBoxEvaluationOptions) {
            this.boundingBoxEvaluationOptions = Objects.requireNonNull(boundingBoxEvaluationOptions);
            return this;
        }

        public GoogleCloudDatalabelingV1beta1EvaluationConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1EvaluationConfigResponse(boundingBoxEvaluationOptions);
        }
    }
}