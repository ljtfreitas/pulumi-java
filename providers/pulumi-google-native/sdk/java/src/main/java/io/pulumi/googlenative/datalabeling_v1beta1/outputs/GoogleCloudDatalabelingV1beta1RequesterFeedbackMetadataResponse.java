// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse {
    @CustomType.Constructor
    private GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse build() {
            return new GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse();
        }
    }
}
