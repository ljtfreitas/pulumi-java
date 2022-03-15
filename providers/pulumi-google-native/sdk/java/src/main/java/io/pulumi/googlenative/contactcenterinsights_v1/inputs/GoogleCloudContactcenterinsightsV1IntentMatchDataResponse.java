// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The data for an intent match. Represents an intent match for a text segment in the conversation. A text segment can be part of a sentence, a complete sentence, or an utterance with multiple sentences.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1IntentMatchDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1IntentMatchDataResponse Empty = new GoogleCloudContactcenterinsightsV1IntentMatchDataResponse();

    /**
     * The id of the matched intent. Can be used to retrieve the corresponding intent information.
     * 
     */
    @Import(name="intentUniqueId", required=true)
      private final String intentUniqueId;

    public String getIntentUniqueId() {
        return this.intentUniqueId;
    }

    public GoogleCloudContactcenterinsightsV1IntentMatchDataResponse(String intentUniqueId) {
        this.intentUniqueId = Objects.requireNonNull(intentUniqueId, "expected parameter 'intentUniqueId' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1IntentMatchDataResponse() {
        this.intentUniqueId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IntentMatchDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String intentUniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IntentMatchDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intentUniqueId = defaults.intentUniqueId;
        }

        public Builder intentUniqueId(String intentUniqueId) {
            this.intentUniqueId = Objects.requireNonNull(intentUniqueId);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1IntentMatchDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1IntentMatchDataResponse(intentUniqueId);
        }
    }
}
