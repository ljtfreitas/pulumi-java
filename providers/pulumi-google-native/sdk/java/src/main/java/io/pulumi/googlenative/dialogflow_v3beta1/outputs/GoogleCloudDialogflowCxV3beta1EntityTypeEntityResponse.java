// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse {
    private final List<String> synonyms;
    private final String value;

    @OutputCustomType.Constructor({"synonyms","value"})
    private GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse(
        List<String> synonyms,
        String value) {
        this.synonyms = Objects.requireNonNull(synonyms);
        this.value = Objects.requireNonNull(value);
    }

    public List<String> getSynonyms() {
        return this.synonyms;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> synonyms;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder setSynonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse(synonyms, value);
        }
    }
}