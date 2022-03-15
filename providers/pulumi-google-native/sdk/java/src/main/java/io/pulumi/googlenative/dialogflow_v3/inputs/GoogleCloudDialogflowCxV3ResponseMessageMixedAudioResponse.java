// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse;
import java.util.List;
import java.util.Objects;


/**
 * Represents an audio message that is composed of both segments synthesized from the Dialogflow agent prompts and ones hosted externally at the specified URIs. The external URIs are specified via play_audio. This message is generated by Dialogflow only and not supposed to be defined by the user.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse Empty = new GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse();

    /**
     * Segments this audio response is composed of.
     * 
     */
    @Import(name="segments", required=true)
      private final List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments;

    public List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> getSegments() {
        return this.segments;
    }

    public GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse(List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments) {
        this.segments = Objects.requireNonNull(segments, "expected parameter 'segments' to be non-null");
    }

    private GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse() {
        this.segments = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        public Builder segments(List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }
        public GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse(segments);
        }
    }
}
