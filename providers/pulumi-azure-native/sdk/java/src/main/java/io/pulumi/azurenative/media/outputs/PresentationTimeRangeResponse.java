// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PresentationTimeRangeResponse {
    /**
     * The absolute end time boundary.
     * 
     */
    private final @Nullable Double endTimestamp;
    /**
     * The indicator of forcing existing of end time stamp.
     * 
     */
    private final @Nullable Boolean forceEndTimestamp;
    /**
     * The relative to end right edge.
     * 
     */
    private final @Nullable Double liveBackoffDuration;
    /**
     * The relative to end sliding window.
     * 
     */
    private final @Nullable Double presentationWindowDuration;
    /**
     * The absolute start time boundary.
     * 
     */
    private final @Nullable Double startTimestamp;
    /**
     * The time scale of time stamps.
     * 
     */
    private final @Nullable Double timescale;

    @OutputCustomType.Constructor({"endTimestamp","forceEndTimestamp","liveBackoffDuration","presentationWindowDuration","startTimestamp","timescale"})
    private PresentationTimeRangeResponse(
        @Nullable Double endTimestamp,
        @Nullable Boolean forceEndTimestamp,
        @Nullable Double liveBackoffDuration,
        @Nullable Double presentationWindowDuration,
        @Nullable Double startTimestamp,
        @Nullable Double timescale) {
        this.endTimestamp = endTimestamp;
        this.forceEndTimestamp = forceEndTimestamp;
        this.liveBackoffDuration = liveBackoffDuration;
        this.presentationWindowDuration = presentationWindowDuration;
        this.startTimestamp = startTimestamp;
        this.timescale = timescale;
    }

    /**
     * The absolute end time boundary.
     * 
     */
    public Optional<Double> getEndTimestamp() {
        return Optional.ofNullable(this.endTimestamp);
    }
    /**
     * The indicator of forcing existing of end time stamp.
     * 
     */
    public Optional<Boolean> getForceEndTimestamp() {
        return Optional.ofNullable(this.forceEndTimestamp);
    }
    /**
     * The relative to end right edge.
     * 
     */
    public Optional<Double> getLiveBackoffDuration() {
        return Optional.ofNullable(this.liveBackoffDuration);
    }
    /**
     * The relative to end sliding window.
     * 
     */
    public Optional<Double> getPresentationWindowDuration() {
        return Optional.ofNullable(this.presentationWindowDuration);
    }
    /**
     * The absolute start time boundary.
     * 
     */
    public Optional<Double> getStartTimestamp() {
        return Optional.ofNullable(this.startTimestamp);
    }
    /**
     * The time scale of time stamps.
     * 
     */
    public Optional<Double> getTimescale() {
        return Optional.ofNullable(this.timescale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresentationTimeRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double endTimestamp;
        private @Nullable Boolean forceEndTimestamp;
        private @Nullable Double liveBackoffDuration;
        private @Nullable Double presentationWindowDuration;
        private @Nullable Double startTimestamp;
        private @Nullable Double timescale;

        public Builder() {
    	      // Empty
        }

        public Builder(PresentationTimeRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimestamp = defaults.endTimestamp;
    	      this.forceEndTimestamp = defaults.forceEndTimestamp;
    	      this.liveBackoffDuration = defaults.liveBackoffDuration;
    	      this.presentationWindowDuration = defaults.presentationWindowDuration;
    	      this.startTimestamp = defaults.startTimestamp;
    	      this.timescale = defaults.timescale;
        }

        public Builder setEndTimestamp(@Nullable Double endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }

        public Builder setForceEndTimestamp(@Nullable Boolean forceEndTimestamp) {
            this.forceEndTimestamp = forceEndTimestamp;
            return this;
        }

        public Builder setLiveBackoffDuration(@Nullable Double liveBackoffDuration) {
            this.liveBackoffDuration = liveBackoffDuration;
            return this;
        }

        public Builder setPresentationWindowDuration(@Nullable Double presentationWindowDuration) {
            this.presentationWindowDuration = presentationWindowDuration;
            return this;
        }

        public Builder setStartTimestamp(@Nullable Double startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }

        public Builder setTimescale(@Nullable Double timescale) {
            this.timescale = timescale;
            return this;
        }
        public PresentationTimeRangeResponse build() {
            return new PresentationTimeRangeResponse(endTimestamp, forceEndTimestamp, liveBackoffDuration, presentationWindowDuration, startTimestamp, timescale);
        }
    }
}
