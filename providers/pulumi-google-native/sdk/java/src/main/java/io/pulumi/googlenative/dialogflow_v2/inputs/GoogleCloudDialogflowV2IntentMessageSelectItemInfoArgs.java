// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs Empty = new GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs();

    @InputImport(name="key", required=true)
    private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="synonyms")
    private final @Nullable Input<List<String>> synonyms;

    public Input<List<String>> getSynonyms() {
        return this.synonyms == null ? Input.empty() : this.synonyms;
    }

    public GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs(
        Input<String> key,
        @Nullable Input<List<String>> synonyms) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.synonyms = synonyms;
    }

    private GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs() {
        this.key = Input.empty();
        this.synonyms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private @Nullable Input<List<String>> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setSynonyms(@Nullable Input<List<String>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public Builder setSynonyms(@Nullable List<String> synonyms) {
            this.synonyms = Input.ofNullable(synonyms);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs(key, synonyms);
        }
    }
}