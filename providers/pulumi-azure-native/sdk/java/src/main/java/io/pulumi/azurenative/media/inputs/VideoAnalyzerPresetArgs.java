// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.AudioAnalysisMode;
import io.pulumi.azurenative.media.enums.InsightsType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A video analyzer preset that extracts insights (rich metadata) from both audio and video, and outputs a JSON format file.
 * 
 */
public final class VideoAnalyzerPresetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoAnalyzerPresetArgs Empty = new VideoAnalyzerPresetArgs();

    /**
     * The language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US').  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn't specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
     */
    @InputImport(name="audioLanguage")
        private final @Nullable Input<String> audioLanguage;

    public Input<String> getAudioLanguage() {
        return this.audioLanguage == null ? Input.empty() : this.audioLanguage;
    }

    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    @InputImport(name="experimentalOptions")
        private final @Nullable Input<Map<String,String>> experimentalOptions;

    public Input<Map<String,String>> getExperimentalOptions() {
        return this.experimentalOptions == null ? Input.empty() : this.experimentalOptions;
    }

    /**
     * Defines the type of insights that you want the service to generate. The allowed values are 'AudioInsightsOnly', 'VideoInsightsOnly', and 'AllInsights'. The default is AllInsights. If you set this to AllInsights and the input is audio only, then only audio insights are generated. Similarly if the input is video only, then only video insights are generated. It is recommended that you not use AudioInsightsOnly if you expect some of your inputs to be video only; or use VideoInsightsOnly if you expect some of your inputs to be audio only. Your Jobs in such conditions would error out.
     * 
     */
    @InputImport(name="insightsToExtract")
        private final @Nullable Input<Either<String,InsightsType>> insightsToExtract;

    public Input<Either<String,InsightsType>> getInsightsToExtract() {
        return this.insightsToExtract == null ? Input.empty() : this.insightsToExtract;
    }

    /**
     * Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    @InputImport(name="mode")
        private final @Nullable Input<Either<String,AudioAnalysisMode>> mode;

    public Input<Either<String,AudioAnalysisMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.VideoAnalyzerPreset'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public VideoAnalyzerPresetArgs(
        @Nullable Input<String> audioLanguage,
        @Nullable Input<Map<String,String>> experimentalOptions,
        @Nullable Input<Either<String,InsightsType>> insightsToExtract,
        @Nullable Input<Either<String,AudioAnalysisMode>> mode,
        Input<String> odataType) {
        this.audioLanguage = audioLanguage;
        this.experimentalOptions = experimentalOptions;
        this.insightsToExtract = insightsToExtract;
        this.mode = mode;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private VideoAnalyzerPresetArgs() {
        this.audioLanguage = Input.empty();
        this.experimentalOptions = Input.empty();
        this.insightsToExtract = Input.empty();
        this.mode = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoAnalyzerPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audioLanguage;
        private @Nullable Input<Map<String,String>> experimentalOptions;
        private @Nullable Input<Either<String,InsightsType>> insightsToExtract;
        private @Nullable Input<Either<String,AudioAnalysisMode>> mode;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoAnalyzerPresetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioLanguage = defaults.audioLanguage;
    	      this.experimentalOptions = defaults.experimentalOptions;
    	      this.insightsToExtract = defaults.insightsToExtract;
    	      this.mode = defaults.mode;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAudioLanguage(@Nullable Input<String> audioLanguage) {
            this.audioLanguage = audioLanguage;
            return this;
        }

        public Builder setAudioLanguage(@Nullable String audioLanguage) {
            this.audioLanguage = Input.ofNullable(audioLanguage);
            return this;
        }

        public Builder setExperimentalOptions(@Nullable Input<Map<String,String>> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }

        public Builder setExperimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = Input.ofNullable(experimentalOptions);
            return this;
        }

        public Builder setInsightsToExtract(@Nullable Input<Either<String,InsightsType>> insightsToExtract) {
            this.insightsToExtract = insightsToExtract;
            return this;
        }

        public Builder setInsightsToExtract(@Nullable Either<String,InsightsType> insightsToExtract) {
            this.insightsToExtract = Input.ofNullable(insightsToExtract);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,AudioAnalysisMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,AudioAnalysisMode> mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public VideoAnalyzerPresetArgs build() {
            return new VideoAnalyzerPresetArgs(audioLanguage, experimentalOptions, insightsToExtract, mode, odataType);
        }
    }
}
