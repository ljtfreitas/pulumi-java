// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AacAudioResponse;
import io.pulumi.azurenative.media.outputs.AudioResponse;
import io.pulumi.azurenative.media.outputs.CopyAudioResponse;
import io.pulumi.azurenative.media.outputs.CopyVideoResponse;
import io.pulumi.azurenative.media.outputs.FiltersResponse;
import io.pulumi.azurenative.media.outputs.H264VideoResponse;
import io.pulumi.azurenative.media.outputs.H265VideoResponse;
import io.pulumi.azurenative.media.outputs.ImageFormatResponse;
import io.pulumi.azurenative.media.outputs.ImageResponse;
import io.pulumi.azurenative.media.outputs.JpgFormatResponse;
import io.pulumi.azurenative.media.outputs.JpgImageResponse;
import io.pulumi.azurenative.media.outputs.Mp4FormatResponse;
import io.pulumi.azurenative.media.outputs.MultiBitrateFormatResponse;
import io.pulumi.azurenative.media.outputs.PngFormatResponse;
import io.pulumi.azurenative.media.outputs.PngImageResponse;
import io.pulumi.azurenative.media.outputs.TransportStreamFormatResponse;
import io.pulumi.azurenative.media.outputs.VideoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StandardEncoderPresetResponse {
    /**
     * The list of codecs to be used when encoding the input video.
     * 
     */
    private final List<Object> codecs;
    /**
     * One or more filtering operations that are applied to the input media before encoding.
     * 
     */
    private final @Nullable FiltersResponse filters;
    /**
     * The list of outputs to be produced by the encoder.
     * 
     */
    private final List<Object> formats;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.StandardEncoderPreset'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"codecs","filters","formats","odataType"})
    private StandardEncoderPresetResponse(
        List<Object> codecs,
        @Nullable FiltersResponse filters,
        List<Object> formats,
        String odataType) {
        this.codecs = Objects.requireNonNull(codecs);
        this.filters = filters;
        this.formats = Objects.requireNonNull(formats);
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * The list of codecs to be used when encoding the input video.
     * 
     */
    public List<Object> getCodecs() {
        return this.codecs;
    }
    /**
     * One or more filtering operations that are applied to the input media before encoding.
     * 
     */
    public Optional<FiltersResponse> getFilters() {
        return Optional.ofNullable(this.filters);
    }
    /**
     * The list of outputs to be produced by the encoder.
     * 
     */
    public List<Object> getFormats() {
        return this.formats;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.StandardEncoderPreset'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardEncoderPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> codecs;
        private @Nullable FiltersResponse filters;
        private List<Object> formats;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardEncoderPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codecs = defaults.codecs;
    	      this.filters = defaults.filters;
    	      this.formats = defaults.formats;
    	      this.odataType = defaults.odataType;
        }

        public Builder setCodecs(List<Object> codecs) {
            this.codecs = Objects.requireNonNull(codecs);
            return this;
        }

        public Builder setFilters(@Nullable FiltersResponse filters) {
            this.filters = filters;
            return this;
        }

        public Builder setFormats(List<Object> formats) {
            this.formats = Objects.requireNonNull(formats);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public StandardEncoderPresetResponse build() {
            return new StandardEncoderPresetResponse(codecs, filters, formats, odataType);
        }
    }
}
