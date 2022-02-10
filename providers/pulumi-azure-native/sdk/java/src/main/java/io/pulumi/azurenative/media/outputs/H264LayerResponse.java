// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class H264LayerResponse {
    private final @Nullable Boolean adaptiveBFrame;
    private final @Nullable Integer bFrames;
    private final Integer bitrate;
    private final @Nullable String bufferWindow;
    private final @Nullable String entropyMode;
    private final @Nullable String frameRate;
    private final @Nullable String height;
    private final @Nullable String label;
    private final @Nullable String level;
    private final @Nullable Integer maxBitrate;
    private final String odataType;
    private final @Nullable String profile;
    private final @Nullable Integer referenceFrames;
    private final @Nullable Integer slices;
    private final @Nullable String width;

    @OutputCustomType.Constructor({"adaptiveBFrame","bFrames","bitrate","bufferWindow","entropyMode","frameRate","height","label","level","maxBitrate","odataType","profile","referenceFrames","slices","width"})
    private H264LayerResponse(
        @Nullable Boolean adaptiveBFrame,
        @Nullable Integer bFrames,
        Integer bitrate,
        @Nullable String bufferWindow,
        @Nullable String entropyMode,
        @Nullable String frameRate,
        @Nullable String height,
        @Nullable String label,
        @Nullable String level,
        @Nullable Integer maxBitrate,
        String odataType,
        @Nullable String profile,
        @Nullable Integer referenceFrames,
        @Nullable Integer slices,
        @Nullable String width) {
        this.adaptiveBFrame = adaptiveBFrame;
        this.bFrames = bFrames;
        this.bitrate = Objects.requireNonNull(bitrate);
        this.bufferWindow = bufferWindow;
        this.entropyMode = entropyMode;
        this.frameRate = frameRate;
        this.height = height;
        this.label = label;
        this.level = level;
        this.maxBitrate = maxBitrate;
        this.odataType = Objects.requireNonNull(odataType);
        this.profile = profile;
        this.referenceFrames = referenceFrames;
        this.slices = slices;
        this.width = width;
    }

    public Optional<Boolean> getAdaptiveBFrame() {
        return Optional.ofNullable(this.adaptiveBFrame);
    }
    public Optional<Integer> getBFrames() {
        return Optional.ofNullable(this.bFrames);
    }
    public Integer getBitrate() {
        return this.bitrate;
    }
    public Optional<String> getBufferWindow() {
        return Optional.ofNullable(this.bufferWindow);
    }
    public Optional<String> getEntropyMode() {
        return Optional.ofNullable(this.entropyMode);
    }
    public Optional<String> getFrameRate() {
        return Optional.ofNullable(this.frameRate);
    }
    public Optional<String> getHeight() {
        return Optional.ofNullable(this.height);
    }
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    public Optional<String> getLevel() {
        return Optional.ofNullable(this.level);
    }
    public Optional<Integer> getMaxBitrate() {
        return Optional.ofNullable(this.maxBitrate);
    }
    public String getOdataType() {
        return this.odataType;
    }
    public Optional<String> getProfile() {
        return Optional.ofNullable(this.profile);
    }
    public Optional<Integer> getReferenceFrames() {
        return Optional.ofNullable(this.referenceFrames);
    }
    public Optional<Integer> getSlices() {
        return Optional.ofNullable(this.slices);
    }
    public Optional<String> getWidth() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H264LayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean adaptiveBFrame;
        private @Nullable Integer bFrames;
        private Integer bitrate;
        private @Nullable String bufferWindow;
        private @Nullable String entropyMode;
        private @Nullable String frameRate;
        private @Nullable String height;
        private @Nullable String label;
        private @Nullable String level;
        private @Nullable Integer maxBitrate;
        private String odataType;
        private @Nullable String profile;
        private @Nullable Integer referenceFrames;
        private @Nullable Integer slices;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(H264LayerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveBFrame = defaults.adaptiveBFrame;
    	      this.bFrames = defaults.bFrames;
    	      this.bitrate = defaults.bitrate;
    	      this.bufferWindow = defaults.bufferWindow;
    	      this.entropyMode = defaults.entropyMode;
    	      this.frameRate = defaults.frameRate;
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.level = defaults.level;
    	      this.maxBitrate = defaults.maxBitrate;
    	      this.odataType = defaults.odataType;
    	      this.profile = defaults.profile;
    	      this.referenceFrames = defaults.referenceFrames;
    	      this.slices = defaults.slices;
    	      this.width = defaults.width;
        }

        public Builder setAdaptiveBFrame(@Nullable Boolean adaptiveBFrame) {
            this.adaptiveBFrame = adaptiveBFrame;
            return this;
        }

        public Builder setBFrames(@Nullable Integer bFrames) {
            this.bFrames = bFrames;
            return this;
        }

        public Builder setBitrate(Integer bitrate) {
            this.bitrate = Objects.requireNonNull(bitrate);
            return this;
        }

        public Builder setBufferWindow(@Nullable String bufferWindow) {
            this.bufferWindow = bufferWindow;
            return this;
        }

        public Builder setEntropyMode(@Nullable String entropyMode) {
            this.entropyMode = entropyMode;
            return this;
        }

        public Builder setFrameRate(@Nullable String frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = height;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setMaxBitrate(@Nullable Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setProfile(@Nullable String profile) {
            this.profile = profile;
            return this;
        }

        public Builder setReferenceFrames(@Nullable Integer referenceFrames) {
            this.referenceFrames = referenceFrames;
            return this;
        }

        public Builder setSlices(@Nullable Integer slices) {
            this.slices = slices;
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = width;
            return this;
        }

        public H264LayerResponse build() {
            return new H264LayerResponse(adaptiveBFrame, bFrames, bitrate, bufferWindow, entropyMode, frameRate, height, label, level, maxBitrate, odataType, profile, referenceFrames, slices, width);
        }
    }
}