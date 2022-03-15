// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VideoScaleResponse {
    /**
     * The desired output video height.
     * 
     */
    private final @Nullable String height;
    /**
     * Describes the video scaling mode to be applied. Default mode is 'Pad'. If the mode is 'Pad' or 'Stretch' then both width and height must be specified. Else if the mode is 'PreserveAspectRatio' then only one of width or height need be provided.
     * 
     */
    private final @Nullable String mode;
    /**
     * The desired output video width.
     * 
     */
    private final @Nullable String width;

    @CustomType.Constructor
    private VideoScaleResponse(
        @CustomType.Parameter("height") @Nullable String height,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("width") @Nullable String width) {
        this.height = height;
        this.mode = mode;
        this.width = width;
    }

    /**
     * The desired output video height.
     * 
    */
    public Optional<String> getHeight() {
        return Optional.ofNullable(this.height);
    }
    /**
     * Describes the video scaling mode to be applied. Default mode is 'Pad'. If the mode is 'Pad' or 'Stretch' then both width and height must be specified. Else if the mode is 'PreserveAspectRatio' then only one of width or height need be provided.
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The desired output video width.
     * 
    */
    public Optional<String> getWidth() {
        return Optional.ofNullable(this.width);
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

        public Builder height(@Nullable String height) {
            this.height = height;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder width(@Nullable String width) {
            this.width = width;
            return this;
        }
        public VideoScaleResponse build() {
            return new VideoScaleResponse(height, mode, width);
        }
    }
}
