// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.PngLayerResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties for producing a series of PNG images from the input video.
 * 
 */
public final class PngImageResponse extends io.pulumi.resources.InvokeArgs {

    public static final PngImageResponse Empty = new PngImageResponse();

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @InputImport(name="keyFrameInterval")
        private final @Nullable String keyFrameInterval;

    public Optional<String> getKeyFrameInterval() {
        return this.keyFrameInterval == null ? Optional.empty() : Optional.ofNullable(this.keyFrameInterval);
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @InputImport(name="label")
        private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * A collection of output PNG image layers to be produced by the encoder.
     * 
     */
    @InputImport(name="layers")
        private final @Nullable List<PngLayerResponse> layers;

    public List<PngLayerResponse> getLayers() {
        return this.layers == null ? List.of() : this.layers;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.PngImage'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30 seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, 50% to stop at half of stream duration from start time). The default value is 100%, which means to stop at the end of the stream.
     * 
     */
    @InputImport(name="range")
        private final @Nullable String range;

    public Optional<String> getRange() {
        return this.range == null ? Optional.empty() : Optional.ofNullable(this.range);
    }

    /**
     * The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default value is macro {Best}.
     * 
     */
    @InputImport(name="start", required=true)
        private final String start;

    public String getStart() {
        return this.start;
    }

    /**
     * The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames), or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is 10%, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one thumbnail is needed at start time.
     * 
     */
    @InputImport(name="step")
        private final @Nullable String step;

    public Optional<String> getStep() {
        return this.step == null ? Optional.empty() : Optional.ofNullable(this.step);
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @InputImport(name="stretchMode")
        private final @Nullable String stretchMode;

    public Optional<String> getStretchMode() {
        return this.stretchMode == null ? Optional.empty() : Optional.ofNullable(this.stretchMode);
    }

    /**
     * The Video Sync Mode
     * 
     */
    @InputImport(name="syncMode")
        private final @Nullable String syncMode;

    public Optional<String> getSyncMode() {
        return this.syncMode == null ? Optional.empty() : Optional.ofNullable(this.syncMode);
    }

    public PngImageResponse(
        @Nullable String keyFrameInterval,
        @Nullable String label,
        @Nullable List<PngLayerResponse> layers,
        String odataType,
        @Nullable String range,
        String start,
        @Nullable String step,
        @Nullable String stretchMode,
        @Nullable String syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.layers = layers;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.range = range;
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.step = step;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private PngImageResponse() {
        this.keyFrameInterval = null;
        this.label = null;
        this.layers = List.of();
        this.odataType = null;
        this.range = null;
        this.start = null;
        this.step = null;
        this.stretchMode = null;
        this.syncMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PngImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyFrameInterval;
        private @Nullable String label;
        private @Nullable List<PngLayerResponse> layers;
        private String odataType;
        private @Nullable String range;
        private String start;
        private @Nullable String step;
        private @Nullable String stretchMode;
        private @Nullable String syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(PngImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.layers = defaults.layers;
    	      this.odataType = defaults.odataType;
    	      this.range = defaults.range;
    	      this.start = defaults.start;
    	      this.step = defaults.step;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder setKeyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setLayers(@Nullable List<PngLayerResponse> layers) {
            this.layers = layers;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setRange(@Nullable String range) {
            this.range = range;
            return this;
        }

        public Builder setStart(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStep(@Nullable String step) {
            this.step = step;
            return this;
        }

        public Builder setStretchMode(@Nullable String stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }

        public Builder setSyncMode(@Nullable String syncMode) {
            this.syncMode = syncMode;
            return this;
        }
        public PngImageResponse build() {
            return new PngImageResponse(keyFrameInterval, label, layers, odataType, range, start, step, stretchMode, syncMode);
        }
    }
}
