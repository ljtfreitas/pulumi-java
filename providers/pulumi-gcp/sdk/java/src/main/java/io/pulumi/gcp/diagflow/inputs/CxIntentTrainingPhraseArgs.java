// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhrasePartArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxIntentTrainingPhraseArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxIntentTrainingPhraseArgs Empty = new CxIntentTrainingPhraseArgs();

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="parts", required=true)
    private final Input<List<CxIntentTrainingPhrasePartArgs>> parts;

    public Input<List<CxIntentTrainingPhrasePartArgs>> getParts() {
        return this.parts;
    }

    @InputImport(name="repeatCount")
    private final @Nullable Input<Integer> repeatCount;

    public Input<Integer> getRepeatCount() {
        return this.repeatCount == null ? Input.empty() : this.repeatCount;
    }

    public CxIntentTrainingPhraseArgs(
        @Nullable Input<String> id,
        Input<List<CxIntentTrainingPhrasePartArgs>> parts,
        @Nullable Input<Integer> repeatCount) {
        this.id = id;
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
        this.repeatCount = repeatCount;
    }

    private CxIntentTrainingPhraseArgs() {
        this.id = Input.empty();
        this.parts = Input.empty();
        this.repeatCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxIntentTrainingPhraseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private Input<List<CxIntentTrainingPhrasePartArgs>> parts;
        private @Nullable Input<Integer> repeatCount;

        public Builder() {
    	      // Empty
        }

        public Builder(CxIntentTrainingPhraseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parts = defaults.parts;
    	      this.repeatCount = defaults.repeatCount;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setParts(Input<List<CxIntentTrainingPhrasePartArgs>> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder setParts(List<CxIntentTrainingPhrasePartArgs> parts) {
            this.parts = Input.of(Objects.requireNonNull(parts));
            return this;
        }

        public Builder setRepeatCount(@Nullable Input<Integer> repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }

        public Builder setRepeatCount(@Nullable Integer repeatCount) {
            this.repeatCount = Input.ofNullable(repeatCount);
            return this;
        }

        public CxIntentTrainingPhraseArgs build() {
            return new CxIntentTrainingPhraseArgs(id, parts, repeatCount);
        }
    }
}