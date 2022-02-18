// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The video scaling information.
 * 
 */
public final class VideoScaleResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoScaleResponse Empty = new VideoScaleResponse();

    /**
     * The desired output video height.
     * 
     */
    @InputImport(name="height")
    private final @Nullable String height;

    public Optional<String> getHeight() {
        return this.height == null ? Optional.empty() : Optional.ofNullable(this.height);
    }

    /**
     * Describes the video scaling mode to be applied. Default mode is 'Pad'. If the mode is 'Pad' or 'Stretch' then both width and height must be specified. Else if the mode is 'PreserveAspectRatio' then only one of width or height need be provided.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * The desired output video width.
     * 
     */
    @InputImport(name="width")
    private final @Nullable String width;

    public Optional<String> getWidth() {
        return this.width == null ? Optional.empty() : Optional.ofNullable(this.width);
    }

    public VideoScaleResponse(
        @Nullable String height,
        @Nullable String mode,
        @Nullable String width) {
        this.height = height;
        this.mode = mode;
        this.width = width;
    }

    private VideoScaleResponse() {
        this.height = null;
        this.mode = null;
        this.width = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoScaleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String height;
        private @Nullable String mode;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoScaleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.mode = defaults.mode;
    	      this.width = defaults.width;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = height;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = width;
            return this;
        }

        public VideoScaleResponse build() {
            return new VideoScaleResponse(height, mode, width);
        }
    }
}
