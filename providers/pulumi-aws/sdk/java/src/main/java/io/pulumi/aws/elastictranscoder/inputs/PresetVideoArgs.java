// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PresetVideoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PresetVideoArgs Empty = new PresetVideoArgs();

    /**
     * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `max_width`, `max_height`, `sizing_policy`, `padding_policy`, and `display_aspect_ratio` instead of `resolution` and `aspect_ratio`.)
     * 
     */
    @InputImport(name="aspectRatio")
    private final @Nullable Input<String> aspectRatio;

    public Input<String> getAspectRatio() {
        return this.aspectRatio == null ? Input.empty() : this.aspectRatio;
    }

    /**
     * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
     * 
     */
    @InputImport(name="bitRate")
    private final @Nullable Input<String> bitRate;

    public Input<String> getBitRate() {
        return this.bitRate == null ? Input.empty() : this.bitRate;
    }

    /**
     * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
     * 
     */
    @InputImport(name="codec")
    private final @Nullable Input<String> codec;

    public Input<String> getCodec() {
        return this.codec == null ? Input.empty() : this.codec;
    }

    /**
     * The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
     * 
     */
    @InputImport(name="displayAspectRatio")
    private final @Nullable Input<String> displayAspectRatio;

    public Input<String> getDisplayAspectRatio() {
        return this.displayAspectRatio == null ? Input.empty() : this.displayAspectRatio;
    }

    /**
     * Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
     * 
     */
    @InputImport(name="fixedGop")
    private final @Nullable Input<String> fixedGop;

    public Input<String> getFixedGop() {
        return this.fixedGop == null ? Input.empty() : this.fixedGop;
    }

    /**
     * The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
     * 
     */
    @InputImport(name="frameRate")
    private final @Nullable Input<String> frameRate;

    public Input<String> getFrameRate() {
        return this.frameRate == null ? Input.empty() : this.frameRate;
    }

    /**
     * The maximum number of frames between key frames. Not applicable for containers of type gif.
     * 
     */
    @InputImport(name="keyframesMaxDist")
    private final @Nullable Input<String> keyframesMaxDist;

    public Input<String> getKeyframesMaxDist() {
        return this.keyframesMaxDist == null ? Input.empty() : this.keyframesMaxDist;
    }

    /**
     * If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
     * 
     */
    @InputImport(name="maxFrameRate")
    private final @Nullable Input<String> maxFrameRate;

    public Input<String> getMaxFrameRate() {
        return this.maxFrameRate == null ? Input.empty() : this.maxFrameRate;
    }

    /**
     * The maximum height of the output video in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072, inclusive.
     * 
     */
    @InputImport(name="maxHeight")
    private final @Nullable Input<String> maxHeight;

    public Input<String> getMaxHeight() {
        return this.maxHeight == null ? Input.empty() : this.maxHeight;
    }

    /**
     * The maximum width of the output video in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096, inclusive.
     * 
     */
    @InputImport(name="maxWidth")
    private final @Nullable Input<String> maxWidth;

    public Input<String> getMaxWidth() {
        return this.maxWidth == null ? Input.empty() : this.maxWidth;
    }

    /**
     * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `max_width` and `max_height`.
     * 
     */
    @InputImport(name="paddingPolicy")
    private final @Nullable Input<String> paddingPolicy;

    public Input<String> getPaddingPolicy() {
        return this.paddingPolicy == null ? Input.empty() : this.paddingPolicy;
    }

    /**
     * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspect_ratio`)
     * 
     */
    @InputImport(name="resolution")
    private final @Nullable Input<String> resolution;

    public Input<String> getResolution() {
        return this.resolution == null ? Input.empty() : this.resolution;
    }

    /**
     * A value that controls scaling of the output video. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, `ShrinkToFill`.
     * 
     */
    @InputImport(name="sizingPolicy")
    private final @Nullable Input<String> sizingPolicy;

    public Input<String> getSizingPolicy() {
        return this.sizingPolicy == null ? Input.empty() : this.sizingPolicy;
    }

    public PresetVideoArgs(
        @Nullable Input<String> aspectRatio,
        @Nullable Input<String> bitRate,
        @Nullable Input<String> codec,
        @Nullable Input<String> displayAspectRatio,
        @Nullable Input<String> fixedGop,
        @Nullable Input<String> frameRate,
        @Nullable Input<String> keyframesMaxDist,
        @Nullable Input<String> maxFrameRate,
        @Nullable Input<String> maxHeight,
        @Nullable Input<String> maxWidth,
        @Nullable Input<String> paddingPolicy,
        @Nullable Input<String> resolution,
        @Nullable Input<String> sizingPolicy) {
        this.aspectRatio = aspectRatio;
        this.bitRate = bitRate;
        this.codec = codec;
        this.displayAspectRatio = displayAspectRatio;
        this.fixedGop = fixedGop;
        this.frameRate = frameRate;
        this.keyframesMaxDist = keyframesMaxDist;
        this.maxFrameRate = maxFrameRate;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.paddingPolicy = paddingPolicy;
        this.resolution = resolution;
        this.sizingPolicy = sizingPolicy;
    }

    private PresetVideoArgs() {
        this.aspectRatio = Input.empty();
        this.bitRate = Input.empty();
        this.codec = Input.empty();
        this.displayAspectRatio = Input.empty();
        this.fixedGop = Input.empty();
        this.frameRate = Input.empty();
        this.keyframesMaxDist = Input.empty();
        this.maxFrameRate = Input.empty();
        this.maxHeight = Input.empty();
        this.maxWidth = Input.empty();
        this.paddingPolicy = Input.empty();
        this.resolution = Input.empty();
        this.sizingPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetVideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aspectRatio;
        private @Nullable Input<String> bitRate;
        private @Nullable Input<String> codec;
        private @Nullable Input<String> displayAspectRatio;
        private @Nullable Input<String> fixedGop;
        private @Nullable Input<String> frameRate;
        private @Nullable Input<String> keyframesMaxDist;
        private @Nullable Input<String> maxFrameRate;
        private @Nullable Input<String> maxHeight;
        private @Nullable Input<String> maxWidth;
        private @Nullable Input<String> paddingPolicy;
        private @Nullable Input<String> resolution;
        private @Nullable Input<String> sizingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetVideoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aspectRatio = defaults.aspectRatio;
    	      this.bitRate = defaults.bitRate;
    	      this.codec = defaults.codec;
    	      this.displayAspectRatio = defaults.displayAspectRatio;
    	      this.fixedGop = defaults.fixedGop;
    	      this.frameRate = defaults.frameRate;
    	      this.keyframesMaxDist = defaults.keyframesMaxDist;
    	      this.maxFrameRate = defaults.maxFrameRate;
    	      this.maxHeight = defaults.maxHeight;
    	      this.maxWidth = defaults.maxWidth;
    	      this.paddingPolicy = defaults.paddingPolicy;
    	      this.resolution = defaults.resolution;
    	      this.sizingPolicy = defaults.sizingPolicy;
        }

        public Builder setAspectRatio(@Nullable Input<String> aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder setAspectRatio(@Nullable String aspectRatio) {
            this.aspectRatio = Input.ofNullable(aspectRatio);
            return this;
        }

        public Builder setBitRate(@Nullable Input<String> bitRate) {
            this.bitRate = bitRate;
            return this;
        }

        public Builder setBitRate(@Nullable String bitRate) {
            this.bitRate = Input.ofNullable(bitRate);
            return this;
        }

        public Builder setCodec(@Nullable Input<String> codec) {
            this.codec = codec;
            return this;
        }

        public Builder setCodec(@Nullable String codec) {
            this.codec = Input.ofNullable(codec);
            return this;
        }

        public Builder setDisplayAspectRatio(@Nullable Input<String> displayAspectRatio) {
            this.displayAspectRatio = displayAspectRatio;
            return this;
        }

        public Builder setDisplayAspectRatio(@Nullable String displayAspectRatio) {
            this.displayAspectRatio = Input.ofNullable(displayAspectRatio);
            return this;
        }

        public Builder setFixedGop(@Nullable Input<String> fixedGop) {
            this.fixedGop = fixedGop;
            return this;
        }

        public Builder setFixedGop(@Nullable String fixedGop) {
            this.fixedGop = Input.ofNullable(fixedGop);
            return this;
        }

        public Builder setFrameRate(@Nullable Input<String> frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setFrameRate(@Nullable String frameRate) {
            this.frameRate = Input.ofNullable(frameRate);
            return this;
        }

        public Builder setKeyframesMaxDist(@Nullable Input<String> keyframesMaxDist) {
            this.keyframesMaxDist = keyframesMaxDist;
            return this;
        }

        public Builder setKeyframesMaxDist(@Nullable String keyframesMaxDist) {
            this.keyframesMaxDist = Input.ofNullable(keyframesMaxDist);
            return this;
        }

        public Builder setMaxFrameRate(@Nullable Input<String> maxFrameRate) {
            this.maxFrameRate = maxFrameRate;
            return this;
        }

        public Builder setMaxFrameRate(@Nullable String maxFrameRate) {
            this.maxFrameRate = Input.ofNullable(maxFrameRate);
            return this;
        }

        public Builder setMaxHeight(@Nullable Input<String> maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Builder setMaxHeight(@Nullable String maxHeight) {
            this.maxHeight = Input.ofNullable(maxHeight);
            return this;
        }

        public Builder setMaxWidth(@Nullable Input<String> maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        public Builder setMaxWidth(@Nullable String maxWidth) {
            this.maxWidth = Input.ofNullable(maxWidth);
            return this;
        }

        public Builder setPaddingPolicy(@Nullable Input<String> paddingPolicy) {
            this.paddingPolicy = paddingPolicy;
            return this;
        }

        public Builder setPaddingPolicy(@Nullable String paddingPolicy) {
            this.paddingPolicy = Input.ofNullable(paddingPolicy);
            return this;
        }

        public Builder setResolution(@Nullable Input<String> resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder setResolution(@Nullable String resolution) {
            this.resolution = Input.ofNullable(resolution);
            return this;
        }

        public Builder setSizingPolicy(@Nullable Input<String> sizingPolicy) {
            this.sizingPolicy = sizingPolicy;
            return this;
        }

        public Builder setSizingPolicy(@Nullable String sizingPolicy) {
            this.sizingPolicy = Input.ofNullable(sizingPolicy);
            return this;
        }
        public PresetVideoArgs build() {
            return new PresetVideoArgs(aspectRatio, bitRate, codec, displayAspectRatio, fixedGop, frameRate, keyframesMaxDist, maxFrameRate, maxHeight, maxWidth, paddingPolicy, resolution, sizingPolicy);
        }
    }
}
