// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentTrainingPhraseType;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an example that the agent is trained on.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs Empty = new GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs();

    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
     * 
     */
    @Import(name="parts", required=true)
      private final Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs>> parts;

    public Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs>> getParts() {
        return this.parts;
    }

    /**
     * Optional. Indicates how many times this example was added to the intent. Each time a developer adds an existing sample by editing an intent or training, this counter is increased.
     * 
     */
    @Import(name="timesAddedCount")
      private final @Nullable Output<Integer> timesAddedCount;

    public Output<Integer> getTimesAddedCount() {
        return this.timesAddedCount == null ? Output.empty() : this.timesAddedCount;
    }

    /**
     * The type of the training phrase.
     * 
     */
    @Import(name="type", required=true)
      private final Output<GoogleCloudDialogflowV2beta1IntentTrainingPhraseType> type;

    public Output<GoogleCloudDialogflowV2beta1IntentTrainingPhraseType> getType() {
        return this.type;
    }

    public GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs(
        Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs>> parts,
        @Nullable Output<Integer> timesAddedCount,
        Output<GoogleCloudDialogflowV2beta1IntentTrainingPhraseType> type) {
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
        this.timesAddedCount = timesAddedCount;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs() {
        this.parts = Output.empty();
        this.timesAddedCount = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs>> parts;
        private @Nullable Output<Integer> timesAddedCount;
        private Output<GoogleCloudDialogflowV2beta1IntentTrainingPhraseType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parts = defaults.parts;
    	      this.timesAddedCount = defaults.timesAddedCount;
    	      this.type = defaults.type;
        }

        public Builder parts(Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs>> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder parts(List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs> parts) {
            this.parts = Output.of(Objects.requireNonNull(parts));
            return this;
        }

        public Builder timesAddedCount(@Nullable Output<Integer> timesAddedCount) {
            this.timesAddedCount = timesAddedCount;
            return this;
        }

        public Builder timesAddedCount(@Nullable Integer timesAddedCount) {
            this.timesAddedCount = Output.ofNullable(timesAddedCount);
            return this;
        }

        public Builder type(Output<GoogleCloudDialogflowV2beta1IntentTrainingPhraseType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(GoogleCloudDialogflowV2beta1IntentTrainingPhraseType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs(parts, timesAddedCount, type);
        }
    }
}
