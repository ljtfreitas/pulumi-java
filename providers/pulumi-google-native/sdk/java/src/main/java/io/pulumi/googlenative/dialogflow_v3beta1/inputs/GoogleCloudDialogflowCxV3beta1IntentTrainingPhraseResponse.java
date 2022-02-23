// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * Represents an example that the agent is trained on to identify the intent.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse Empty = new GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse();

    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `parameter_id` field is set.
     * 
     */
    @InputImport(name="parts", required=true)
      private final List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> parts;

    public List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> getParts() {
        return this.parts;
    }

    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    @InputImport(name="repeatCount", required=true)
      private final Integer repeatCount;

    public Integer getRepeatCount() {
        return this.repeatCount;
    }

    public GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse(
        List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> parts,
        Integer repeatCount) {
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
        this.repeatCount = Objects.requireNonNull(repeatCount, "expected parameter 'repeatCount' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse() {
        this.parts = List.of();
        this.repeatCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> parts;
        private Integer repeatCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parts = defaults.parts;
    	      this.repeatCount = defaults.repeatCount;
        }

        public Builder setParts(List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder setRepeatCount(Integer repeatCount) {
            this.repeatCount = Objects.requireNonNull(repeatCount);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse build() {
            return new GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse(parts, repeatCount);
        }
    }
}
