// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A video analyzer preset that extracts insights (rich metadata) from both audio and video, and outputs a JSON format file.
 * 
 */
public final class VideoAnalyzerPresetResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoAnalyzerPresetResponse Empty = new VideoAnalyzerPresetResponse();

    /**
     * The language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US').  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn't specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
     */
    @InputImport(name="audioLanguage")
        private final @Nullable String audioLanguage;

    public Optional<String> getAudioLanguage() {
        return this.audioLanguage == null ? Optional.empty() : Optional.ofNullable(this.audioLanguage);
    }

    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    @InputImport(name="experimentalOptions")
        private final @Nullable Map<String,String> experimentalOptions;

    public Map<String,String> getExperimentalOptions() {
        return this.experimentalOptions == null ? Map.of() : this.experimentalOptions;
    }

    /**
     * Defines the type of insights that you want the service to generate. The allowed values are 'AudioInsightsOnly', 'VideoInsightsOnly', and 'AllInsights'. The default is AllInsights. If you set this to AllInsights and the input is audio only, then only audio insights are generated. Similarly if the input is video only, then only video insights are generated. It is recommended that you not use AudioInsightsOnly if you expect some of your inputs to be video only; or use VideoInsightsOnly if you expect some of your inputs to be audio only. Your Jobs in such conditions would error out.
     * 
     */
    @InputImport(name="insightsToExtract")
        private final @Nullable String insightsToExtract;

    public Optional<String> getInsightsToExtract() {
        return this.insightsToExtract == null ? Optional.empty() : Optional.ofNullable(this.insightsToExtract);
    }

    /**
     * Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    @InputImport(name="mode")
        private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.VideoAnalyzerPreset'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public VideoAnalyzerPresetResponse(
        @Nullable String audioLanguage,
        @Nullable Map<String,String> experimentalOptions,
        @Nullable String insightsToExtract,
        @Nullable String mode,
        String odataType) {
        this.audioLanguage = audioLanguage;
        this.experimentalOptions = experimentalOptions;
        this.insightsToExtract = insightsToExtract;
        this.mode = mode;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private VideoAnalyzerPresetResponse() {
        this.audioLanguage = null;
        this.experimentalOptions = Map.of();
        this.insightsToExtract = null;
        this.mode = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoAnalyzerPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audioLanguage;
        private @Nullable Map<String,String> experimentalOptions;
        private @Nullable String insightsToExtract;
        private @Nullable String mode;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoAnalyzerPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioLanguage = defaults.audioLanguage;
    	      this.experimentalOptions = defaults.experimentalOptions;
    	      this.insightsToExtract = defaults.insightsToExtract;
    	      this.mode = defaults.mode;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAudioLanguage(@Nullable String audioLanguage) {
            this.audioLanguage = audioLanguage;
            return this;
        }

        public Builder setExperimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }

        public Builder setInsightsToExtract(@Nullable String insightsToExtract) {
            this.insightsToExtract = insightsToExtract;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public VideoAnalyzerPresetResponse build() {
            return new VideoAnalyzerPresetResponse(audioLanguage, experimentalOptions, insightsToExtract, mode, odataType);
        }
    }
}
