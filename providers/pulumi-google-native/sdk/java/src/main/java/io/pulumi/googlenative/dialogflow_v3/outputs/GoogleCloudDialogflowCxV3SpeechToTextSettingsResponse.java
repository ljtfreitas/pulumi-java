// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse {
    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    private final Boolean enableSpeechAdaptation;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse(@CustomType.Parameter("enableSpeechAdaptation") Boolean enableSpeechAdaptation) {
        this.enableSpeechAdaptation = enableSpeechAdaptation;
    }

    /**
     * Whether to use speech adaptation for speech recognition.
     * 
    */
    public Boolean getEnableSpeechAdaptation() {
        return this.enableSpeechAdaptation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableSpeechAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSpeechAdaptation = defaults.enableSpeechAdaptation;
        }

        public Builder enableSpeechAdaptation(Boolean enableSpeechAdaptation) {
            this.enableSpeechAdaptation = Objects.requireNonNull(enableSpeechAdaptation);
            return this;
        }
        public GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse(enableSpeechAdaptation);
        }
    }
}
