// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import java.util.Objects;


/**
 * Metadata describing the feedback from the operator.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse Empty = new GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse();

    public GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse build() {
            return new GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse();
        }
    }
}
