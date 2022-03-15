// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The presentation time range, this is asset related and not recommended for Account Filter.
 * 
 */
public final class PresentationTimeRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final PresentationTimeRangeResponse Empty = new PresentationTimeRangeResponse();

    /**
     * The absolute end time boundary.
     * 
     */
    @Import(name="endTimestamp")
      private final @Nullable Double endTimestamp;

    public Optional<Double> getEndTimestamp() {
        return this.endTimestamp == null ? Optional.empty() : Optional.ofNullable(this.endTimestamp);
    }

    /**
     * The indicator of forcing existing of end time stamp.
     * 
     */
    @Import(name="forceEndTimestamp")
      private final @Nullable Boolean forceEndTimestamp;

    public Optional<Boolean> getForceEndTimestamp() {
        return this.forceEndTimestamp == null ? Optional.empty() : Optional.ofNullable(this.forceEndTimestamp);
    }

    /**
     * The relative to end right edge.
     * 
     */
    @Import(name="liveBackoffDuration")
      private final @Nullable Double liveBackoffDuration;

    public Optional<Double> getLiveBackoffDuration() {
        return this.liveBackoffDuration == null ? Optional.empty() : Optional.ofNullable(this.liveBackoffDuration);
    }

    /**
     * The relative to end sliding window.
     * 
     */
    @Import(name="presentationWindowDuration")
      private final @Nullable Double presentationWindowDuration;

    public Optional<Double> getPresentationWindowDuration() {
        return this.presentationWindowDuration == null ? Optional.empty() : Optional.ofNullable(this.presentationWindowDuration);
    }

    /**
     * The absolute start time boundary.
     * 
     */
    @Import(name="startTimestamp")
      private final @Nullable Double startTimestamp;

    public Optional<Double> getStartTimestamp() {
        return this.startTimestamp == null ? Optional.empty() : Optional.ofNullable(this.startTimestamp);
    }

    /**
     * The time scale of time stamps.
     * 
     */
    @Import(name="timescale")
      private final @Nullable Double timescale;

    public Optional<Double> getTimescale() {
        return this.timescale == null ? Optional.empty() : Optional.ofNullable(this.timescale);
    }

    public PresentationTimeRangeResponse(
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

    private PresentationTimeRangeResponse() {
        this.endTimestamp = null;
        this.forceEndTimestamp = null;
        this.liveBackoffDuration = null;
        this.presentationWindowDuration = null;
        this.startTimestamp = null;
        this.timescale = null;
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

        public Builder endTimestamp(@Nullable Double endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }

        public Builder forceEndTimestamp(@Nullable Boolean forceEndTimestamp) {
            this.forceEndTimestamp = forceEndTimestamp;
            return this;
        }

        public Builder liveBackoffDuration(@Nullable Double liveBackoffDuration) {
            this.liveBackoffDuration = liveBackoffDuration;
            return this;
        }

        public Builder presentationWindowDuration(@Nullable Double presentationWindowDuration) {
            this.presentationWindowDuration = presentationWindowDuration;
            return this;
        }

        public Builder startTimestamp(@Nullable Double startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }

        public Builder timescale(@Nullable Double timescale) {
            this.timescale = timescale;
            return this;
        }
        public PresentationTimeRangeResponse build() {
            return new PresentationTimeRangeResponse(endTimestamp, forceEndTimestamp, liveBackoffDuration, presentationWindowDuration, startTimestamp, timescale);
        }
    }
}
