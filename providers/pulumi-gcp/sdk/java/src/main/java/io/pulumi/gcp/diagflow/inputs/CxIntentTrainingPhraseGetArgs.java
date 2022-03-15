// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhrasePartGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxIntentTrainingPhraseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxIntentTrainingPhraseGetArgs Empty = new CxIntentTrainingPhraseGetArgs();

    /**
     * The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase.
     * Note: The API does not automatically annotate training phrases like the Dialogflow Console does.
     * Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated.
     * If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set.
     * If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways:
     * Part.text is set to a part of the phrase that has no parameters.
     * Part.text is set to a part of the phrase that you want to annotate, and the parameterId field is set.
     * Structure is documented below.
     * 
     */
    @Import(name="parts", required=true)
      private final Output<List<CxIntentTrainingPhrasePartGetArgs>> parts;

    public Output<List<CxIntentTrainingPhrasePartGetArgs>> getParts() {
        return this.parts;
    }

    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    @Import(name="repeatCount")
      private final @Nullable Output<Integer> repeatCount;

    public Output<Integer> getRepeatCount() {
        return this.repeatCount == null ? Output.empty() : this.repeatCount;
    }

    public CxIntentTrainingPhraseGetArgs(
        @Nullable Output<String> id,
        Output<List<CxIntentTrainingPhrasePartGetArgs>> parts,
        @Nullable Output<Integer> repeatCount) {
        this.id = id;
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
        this.repeatCount = repeatCount;
    }

    private CxIntentTrainingPhraseGetArgs() {
        this.id = Output.empty();
        this.parts = Output.empty();
        this.repeatCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxIntentTrainingPhraseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private Output<List<CxIntentTrainingPhrasePartGetArgs>> parts;
        private @Nullable Output<Integer> repeatCount;

        public Builder() {
    	      // Empty
        }

        public Builder(CxIntentTrainingPhraseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parts = defaults.parts;
    	      this.repeatCount = defaults.repeatCount;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder parts(Output<List<CxIntentTrainingPhrasePartGetArgs>> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder parts(List<CxIntentTrainingPhrasePartGetArgs> parts) {
            this.parts = Output.of(Objects.requireNonNull(parts));
            return this;
        }

        public Builder repeatCount(@Nullable Output<Integer> repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }

        public Builder repeatCount(@Nullable Integer repeatCount) {
            this.repeatCount = Output.ofNullable(repeatCount);
            return this;
        }
        public CxIntentTrainingPhraseGetArgs build() {
            return new CxIntentTrainingPhraseGetArgs(id, parts, repeatCount);
        }
    }
}
