// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse {
    /**
     * Segments this audio response is composed of.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> segments;

    @OutputCustomType.Constructor({"segments"})
    private GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse(List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> segments) {
        this.segments = Objects.requireNonNull(segments);
    }

    /**
     * Segments this audio response is composed of.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> getSegments() {
        return this.segments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> segments;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        public Builder setSegments(List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse(segments);
        }
    }
}
