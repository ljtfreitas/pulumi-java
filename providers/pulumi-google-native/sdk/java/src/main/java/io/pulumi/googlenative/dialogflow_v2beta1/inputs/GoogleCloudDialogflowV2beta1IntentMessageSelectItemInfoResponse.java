// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Additional info about the select item for when it is triggered in a dialog.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse();

    /**
     * A unique key that will be sent back to the agent if this response is given.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Optional. A list of synonyms that can also be used to trigger this item in dialog.
     * 
     */
    @InputImport(name="synonyms", required=true)
      private final List<String> synonyms;

    public List<String> getSynonyms() {
        return this.synonyms;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse(
        String key,
        List<String> synonyms) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.synonyms = Objects.requireNonNull(synonyms, "expected parameter 'synonyms' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse() {
        this.key = null;
        this.synonyms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setSynonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse(key, synonyms);
        }
    }
}
