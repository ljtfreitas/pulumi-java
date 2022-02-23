// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.Rotation;
import io.pulumi.azurenative.media.inputs.AudioOverlayArgs;
import io.pulumi.azurenative.media.inputs.DeinterlaceArgs;
import io.pulumi.azurenative.media.inputs.RectangleArgs;
import io.pulumi.azurenative.media.inputs.VideoOverlayArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes all the filtering operations, such as de-interlacing, rotation etc. that are to be applied to the input media before encoding.
 * 
 */
public final class FiltersArgs extends io.pulumi.resources.ResourceArgs {

    public static final FiltersArgs Empty = new FiltersArgs();

    /**
     * The parameters for the rectangular window with which to crop the input video.
     * 
     */
    @InputImport(name="crop")
        private final @Nullable Input<RectangleArgs> crop;

    public Input<RectangleArgs> getCrop() {
        return this.crop == null ? Input.empty() : this.crop;
    }

    /**
     * The de-interlacing settings.
     * 
     */
    @InputImport(name="deinterlace")
        private final @Nullable Input<DeinterlaceArgs> deinterlace;

    public Input<DeinterlaceArgs> getDeinterlace() {
        return this.deinterlace == null ? Input.empty() : this.deinterlace;
    }

    /**
     * The properties of overlays to be applied to the input video. These could be audio, image or video overlays.
     * 
     */
    @InputImport(name="overlays")
        private final @Nullable Input<List<Either<AudioOverlayArgs,VideoOverlayArgs>>> overlays;

    public Input<List<Either<AudioOverlayArgs,VideoOverlayArgs>>> getOverlays() {
        return this.overlays == null ? Input.empty() : this.overlays;
    }

    /**
     * The rotation, if any, to be applied to the input video, before it is encoded. Default is Auto
     * 
     */
    @InputImport(name="rotation")
        private final @Nullable Input<Either<String,Rotation>> rotation;

    public Input<Either<String,Rotation>> getRotation() {
        return this.rotation == null ? Input.empty() : this.rotation;
    }

    public FiltersArgs(
        @Nullable Input<RectangleArgs> crop,
        @Nullable Input<DeinterlaceArgs> deinterlace,
        @Nullable Input<List<Either<AudioOverlayArgs,VideoOverlayArgs>>> overlays,
        @Nullable Input<Either<String,Rotation>> rotation) {
        this.crop = crop;
        this.deinterlace = deinterlace;
        this.overlays = overlays;
        this.rotation = rotation;
    }

    private FiltersArgs() {
        this.crop = Input.empty();
        this.deinterlace = Input.empty();
        this.overlays = Input.empty();
        this.rotation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FiltersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RectangleArgs> crop;
        private @Nullable Input<DeinterlaceArgs> deinterlace;
        private @Nullable Input<List<Either<AudioOverlayArgs,VideoOverlayArgs>>> overlays;
        private @Nullable Input<Either<String,Rotation>> rotation;

        public Builder() {
    	      // Empty
        }

        public Builder(FiltersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crop = defaults.crop;
    	      this.deinterlace = defaults.deinterlace;
    	      this.overlays = defaults.overlays;
    	      this.rotation = defaults.rotation;
        }

        public Builder setCrop(@Nullable Input<RectangleArgs> crop) {
            this.crop = crop;
            return this;
        }

        public Builder setCrop(@Nullable RectangleArgs crop) {
            this.crop = Input.ofNullable(crop);
            return this;
        }

        public Builder setDeinterlace(@Nullable Input<DeinterlaceArgs> deinterlace) {
            this.deinterlace = deinterlace;
            return this;
        }

        public Builder setDeinterlace(@Nullable DeinterlaceArgs deinterlace) {
            this.deinterlace = Input.ofNullable(deinterlace);
            return this;
        }

        public Builder setOverlays(@Nullable Input<List<Either<AudioOverlayArgs,VideoOverlayArgs>>> overlays) {
            this.overlays = overlays;
            return this;
        }

        public Builder setOverlays(@Nullable List<Either<AudioOverlayArgs,VideoOverlayArgs>> overlays) {
            this.overlays = Input.ofNullable(overlays);
            return this;
        }

        public Builder setRotation(@Nullable Input<Either<String,Rotation>> rotation) {
            this.rotation = rotation;
            return this;
        }

        public Builder setRotation(@Nullable Either<String,Rotation> rotation) {
            this.rotation = Input.ofNullable(rotation);
            return this;
        }
        public FiltersArgs build() {
            return new FiltersArgs(crop, deinterlace, overlays, rotation);
        }
    }
}
