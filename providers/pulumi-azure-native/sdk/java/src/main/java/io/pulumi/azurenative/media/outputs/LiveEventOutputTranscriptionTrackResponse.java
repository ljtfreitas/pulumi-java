// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LiveEventOutputTranscriptionTrackResponse {
    private final String trackName;

    @OutputCustomType.Constructor({"trackName"})
    private LiveEventOutputTranscriptionTrackResponse(String trackName) {
        this.trackName = Objects.requireNonNull(trackName);
    }

    public String getTrackName() {
        return this.trackName;
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