// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AacAudioResponse;
import io.pulumi.azurenative.media.inputs.AudioResponse;
import io.pulumi.azurenative.media.inputs.CopyAudioResponse;
import io.pulumi.azurenative.media.inputs.CopyVideoResponse;
import io.pulumi.azurenative.media.inputs.FiltersResponse;
import io.pulumi.azurenative.media.inputs.H264VideoResponse;
import io.pulumi.azurenative.media.inputs.H265VideoResponse;
import io.pulumi.azurenative.media.inputs.ImageFormatResponse;
import io.pulumi.azurenative.media.inputs.ImageResponse;
import io.pulumi.azurenative.media.inputs.JpgFormatResponse;
import io.pulumi.azurenative.media.inputs.JpgImageResponse;
import io.pulumi.azurenative.media.inputs.Mp4FormatResponse;
import io.pulumi.azurenative.media.inputs.MultiBitrateFormatResponse;
import io.pulumi.azurenative.media.inputs.PngFormatResponse;
import io.pulumi.azurenative.media.inputs.PngImageResponse;
import io.pulumi.azurenative.media.inputs.TransportStreamFormatResponse;
import io.pulumi.azurenative.media.inputs.VideoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes all the settings to be used when encoding the input video with the Standard Encoder.
 * 
 */
public final class StandardEncoderPresetResponse extends io.pulumi.resources.InvokeArgs {

    public static final StandardEncoderPresetResponse Empty = new StandardEncoderPresetResponse();

    /**
     * The list of codecs to be used when encoding the input video.
     * 
     */
    @InputImport(name="codecs", required=true)
    private final List<Object> codecs;

    public List<Object> getCodecs() {
        return this.codecs;
    }

    /**
     * One or more filtering operations that are applied to the input media before encoding.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable FiltersResponse filters;

    public Optional<FiltersResponse> getFilters() {
        return this.filters == null ? Optional.empty() : Optional.ofNullable(this.filters);
    }

    /**
     * The list of outputs to be produced by the encoder.
     * 
     */
    @InputImport(name="formats", required=true)
    private final List<Object> formats;

    public List<Object> getFormats() {
        return this.formats;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.StandardEncoderPreset'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public StandardEncoderPresetResponse(
        List<Object> codecs,
        @Nullable FiltersResponse filters,
        List<Object> formats,
        String odataType) {
        this.codecs = Objects.requireNonNull(codecs, "expected parameter 'codecs' to be non-null");
        this.filters = filters;
        this.formats = Objects.requireNonNull(formats, "expected parameter 'formats' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private StandardEncoderPresetResponse() {
        this.codecs = List.of();
        this.filters = null;
        this.formats = List.of();
        this.odataType = null;
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
