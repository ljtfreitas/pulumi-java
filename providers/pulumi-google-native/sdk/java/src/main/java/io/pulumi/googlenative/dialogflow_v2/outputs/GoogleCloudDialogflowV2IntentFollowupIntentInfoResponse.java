// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse {
    /**
     * The unique identifier of the followup intent. Format: `projects//agent/intents/`.
     * 
     */
    private final String followupIntentName;
    /**
     * The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`.
     * 
     */
    private final String parentFollowupIntentName;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse(
        @CustomType.Parameter("followupIntentName") String followupIntentName,
        @CustomType.Parameter("parentFollowupIntentName") String parentFollowupIntentName) {
        this.followupIntentName = followupIntentName;
        this.parentFollowupIntentName = parentFollowupIntentName;
    }

    /**
     * The unique identifier of the followup intent. Format: `projects//agent/intents/`.
     * 
    */
    public String getFollowupIntentName() {
        return this.followupIntentName;
    }
    /**
     * The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`.
     * 
    */
    public String getParentFollowupIntentName() {
        return this.parentFollowupIntentName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String followupIntentName;
        private String parentFollowupIntentName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followupIntentName = defaults.followupIntentName;
    	      this.parentFollowupIntentName = defaults.parentFollowupIntentName;
        }

        public Builder followupIntentName(String followupIntentName) {
            this.followupIntentName = Objects.requireNonNull(followupIntentName);
            return this;
        }

        public Builder parentFollowupIntentName(String parentFollowupIntentName) {
            this.parentFollowupIntentName = Objects.requireNonNull(parentFollowupIntentName);
            return this;
        }
        public GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse build() {
            return new GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse(followupIntentName, parentFollowupIntentName);
        }
    }
}
