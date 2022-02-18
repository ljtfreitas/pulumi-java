// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a transcription track in the output of a live event, generated using speech-to-text transcription. This property is reserved for future use, any value set on this property will be ignored.
 * 
 */
public final class LiveEventOutputTranscriptionTrackResponse extends io.pulumi.resources.InvokeArgs {

    public static final LiveEventOutputTranscriptionTrackResponse Empty = new LiveEventOutputTranscriptionTrackResponse();

    /**
     * The output track name. This property is reserved for future use, any value set on this property will be ignored.
     * 
     */
    @InputImport(name="trackName", required=true)
    private final String trackName;

    public String getTrackName() {
        return this.trackName;
    }

    public LiveEventOutputTranscriptionTrackResponse(String trackName) {
        this.trackName = Objects.requireNonNull(trackName, "expected parameter 'trackName' to be non-null");
    }

    private LiveEventOutputTranscriptionTrackResponse() {
        this.trackName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventOutputTranscriptionTrackResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String trackName;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventOutputTranscriptionTrackResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackName = defaults.trackName;
        }

        public Builder setTrackName(String trackName) {
            this.trackName = Objects.requireNonNull(trackName);
            return this;
        }

        public LiveEventOutputTranscriptionTrackResponse build() {
            return new LiveEventOutputTranscriptionTrackResponse(trackName);
        }
    }
}
