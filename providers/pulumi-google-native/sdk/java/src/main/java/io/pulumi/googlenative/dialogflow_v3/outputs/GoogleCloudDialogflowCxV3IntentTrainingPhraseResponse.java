// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse {
    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `parameter_id` field is set.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse> parts;
    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    private final Integer repeatCount;

    @OutputCustomType.Constructor({"parts","repeatCount"})
    private GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse(
        List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse> parts,
        Integer repeatCount) {
        this.parts = Objects.requireNonNull(parts);
        this.repeatCount = Objects.requireNonNull(repeatCount);
    }

    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `parameter_id` field is set.
     * 
     */
    public List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse> getParts() {
        return this.parts;
    }
    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    public Integer getRepeatCount() {
        return this.repeatCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse> parts;
        private Integer repeatCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parts = defaults.parts;
    	      this.repeatCount = defaults.repeatCount;
        }

        public Builder setParts(List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder setRepeatCount(Integer repeatCount) {
            this.repeatCount = Objects.requireNonNull(repeatCount);
            return this;
        }
        public GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse build() {
            return new GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse(parts, repeatCount);
        }
    }
}
