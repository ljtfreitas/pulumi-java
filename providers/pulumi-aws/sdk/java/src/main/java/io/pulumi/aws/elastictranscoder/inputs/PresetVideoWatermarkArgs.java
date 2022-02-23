// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PresetVideoWatermarkArgs extends io.pulumi.resources.ResourceArgs {

    public static final PresetVideoWatermarkArgs Empty = new PresetVideoWatermarkArgs();

    /**
     * The horizontal position of the watermark unless you specify a nonzero value for `horzontal_offset`.
     * 
     */
    @InputImport(name="horizontalAlign")
    private final @Nullable Input<String> horizontalAlign;

    public Input<String> getHorizontalAlign() {
        return this.horizontalAlign == null ? Input.empty() : this.horizontalAlign;
    }

    /**
     * The amount by which you want the horizontal position of the watermark to be offset from the position specified by `horizontal_align`.
     * 
     */
    @InputImport(name="horizontalOffset")
    private final @Nullable Input<String> horizontalOffset;

    public Input<String> getHorizontalOffset() {
        return this.horizontalOffset == null ? Input.empty() : this.horizontalOffset;
    }

    /**
     * A unique identifier for the settings for one watermark. The value of Id can be up to 40 characters long. You can specify settings for up to four watermarks.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The maximum height of the watermark.
     * 
     */
    @InputImport(name="maxHeight")
    private final @Nullable Input<String> maxHeight;

    public Input<String> getMaxHeight() {
        return this.maxHeight == null ? Input.empty() : this.maxHeight;
    }

    /**
     * The maximum width of the watermark.
     * 
     */
    @InputImport(name="maxWidth")
    private final @Nullable Input<String> maxWidth;

    public Input<String> getMaxWidth() {
        return this.maxWidth == null ? Input.empty() : this.maxWidth;
    }

    /**
     * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
     * 
     */
    @InputImport(name="opacity")
    private final @Nullable Input<String> opacity;

    public Input<String> getOpacity() {
        return this.opacity == null ? Input.empty() : this.opacity;
    }

    /**
     * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
     * 
     */
    @InputImport(name="sizingPolicy")
    private final @Nullable Input<String> sizingPolicy;

    public Input<String> getSizingPolicy() {
        return this.sizingPolicy == null ? Input.empty() : this.sizingPolicy;
    }

    /**
     * A value that determines how Elastic Transcoder interprets values that you specified for `video_watermarks.horizontal_offset`, `video_watermarks.vertical_offset`, `video_watermarks.max_width`, and `video_watermarks.max_height`. Valid values are `Content` and `Frame`.
     * 
     */
    @InputImport(name="target")
    private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * The vertical position of the watermark unless you specify a nonzero value for `vertical_align`. Valid values are `Top`, `Bottom`, `Center`.
     * 
     */
    @InputImport(name="verticalAlign")
    private final @Nullable Input<String> verticalAlign;

    public Input<String> getVerticalAlign() {
        return this.verticalAlign == null ? Input.empty() : this.verticalAlign;
    }

    /**
     * The amount by which you want the vertical position of the watermark to be offset from the position specified by `vertical_align`
     * 
     */
    @InputImport(name="verticalOffset")
    private final @Nullable Input<String> verticalOffset;

    public Input<String> getVerticalOffset() {
        return this.verticalOffset == null ? Input.empty() : this.verticalOffset;
    }

    public PresetVideoWatermarkArgs(
        @Nullable Input<String> horizontalAlign,
        @Nullable Input<String> horizontalOffset,
        @Nullable Input<String> id,
        @Nullable Input<String> maxHeight,
        @Nullable Input<String> maxWidth,
        @Nullable Input<String> opacity,
        @Nullable Input<String> sizingPolicy,
        @Nullable Input<String> target,
        @Nullable Input<String> verticalAlign,
        @Nullable Input<String> verticalOffset) {
        this.horizontalAlign = horizontalAlign;
        this.horizontalOffset = horizontalOffset;
        this.id = id;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.opacity = opacity;
        this.sizingPolicy = sizingPolicy;
        this.target = target;
        this.verticalAlign = verticalAlign;
        this.verticalOffset = verticalOffset;
    }

    private PresetVideoWatermarkArgs() {
        this.horizontalAlign = Input.empty();
        this.horizontalOffset = Input.empty();
        this.id = Input.empty();
        this.maxHeight = Input.empty();
        this.maxWidth = Input.empty();
        this.opacity = Input.empty();
        this.sizingPolicy = Input.empty();
        this.target = Input.empty();
        this.verticalAlign = Input.empty();
        this.verticalOffset = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetVideoWatermarkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> horizontalAlign;
        private @Nullable Input<String> horizontalOffset;
        private @Nullable Input<String> id;
        private @Nullable Input<String> maxHeight;
        private @Nullable Input<String> maxWidth;
        private @Nullable Input<String> opacity;
        private @Nullable Input<String> sizingPolicy;
        private @Nullable Input<String> target;
        private @Nullable Input<String> verticalAlign;
        private @Nullable Input<String> verticalOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetVideoWatermarkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.horizontalAlign = defaults.horizontalAlign;
    	      this.horizontalOffset = defaults.horizontalOffset;
    	      this.id = defaults.id;
    	      this.maxHeight = defaults.maxHeight;
    	      this.maxWidth = defaults.maxWidth;
    	      this.opacity = defaults.opacity;
    	      this.sizingPolicy = defaults.sizingPolicy;
    	      this.target = defaults.target;
    	      this.verticalAlign = defaults.verticalAlign;
    	      this.verticalOffset = defaults.verticalOffset;
        }

        public Builder setHorizontalAlign(@Nullable Input<String> horizontalAlign) {
            this.horizontalAlign = horizontalAlign;
            return this;
        }

        public Builder setHorizontalAlign(@Nullable String horizontalAlign) {
            this.horizontalAlign = Input.ofNullable(horizontalAlign);
            return this;
        }

        public Builder setHorizontalOffset(@Nullable Input<String> horizontalOffset) {
            this.horizontalOffset = horizontalOffset;
            return this;
        }

        public Builder setHorizontalOffset(@Nullable String horizontalOffset) {
            this.horizontalOffset = Input.ofNullable(horizontalOffset);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder setOpacity(@Nullable Input<String> opacity) {
            this.opacity = opacity;
            return this;
        }

        public Builder setOpacity(@Nullable String opacity) {
            this.opacity = Input.ofNullable(opacity);
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

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setVerticalAlign(@Nullable Input<String> verticalAlign) {
            this.verticalAlign = verticalAlign;
            return this;
        }

        public Builder setVerticalAlign(@Nullable String verticalAlign) {
            this.verticalAlign = Input.ofNullable(verticalAlign);
            return this;
        }

        public Builder setVerticalOffset(@Nullable Input<String> verticalOffset) {
            this.verticalOffset = verticalOffset;
            return this;
        }

        public Builder setVerticalOffset(@Nullable String verticalOffset) {
            this.verticalOffset = Input.ofNullable(verticalOffset);
            return this;
        }
        public PresetVideoWatermarkArgs build() {
            return new PresetVideoWatermarkArgs(horizontalAlign, horizontalOffset, id, maxHeight, maxWidth, opacity, sizingPolicy, target, verticalAlign, verticalOffset);
        }
    }
}
