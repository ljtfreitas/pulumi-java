// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SlotTypeEnumerationValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlotTypeEnumerationValueArgs Empty = new SlotTypeEnumerationValueArgs();

    /**
     * Additional values related to the slot type value. Each item must be less than or equal to 140 characters in length.
     * 
     */
    @InputImport(name="synonyms")
    private final @Nullable Input<List<String>> synonyms;

    public Input<List<String>> getSynonyms() {
        return this.synonyms == null ? Input.empty() : this.synonyms;
    }

    /**
     * The value of the slot type. Must be less than or equal to 140 characters in length.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public SlotTypeEnumerationValueArgs(
        @Nullable Input<List<String>> synonyms,
        Input<String> value) {
        this.synonyms = synonyms;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SlotTypeEnumerationValueArgs() {
        this.synonyms = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotTypeEnumerationValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> synonyms;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SlotTypeEnumerationValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder setSynonyms(@Nullable Input<List<String>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public Builder setSynonyms(@Nullable List<String> synonyms) {
            this.synonyms = Input.ofNullable(synonyms);
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public SlotTypeEnumerationValueArgs build() {
            return new SlotTypeEnumerationValueArgs(synonyms, value);
        }
    }
}
