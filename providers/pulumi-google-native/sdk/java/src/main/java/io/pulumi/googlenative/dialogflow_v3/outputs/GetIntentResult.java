// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3IntentParameterResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetIntentResult {
    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    private final String description;
    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    private final String displayName;
    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    private final Boolean isFallback;
    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent. "sys.contextual" means the intent is a contextual intent.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
     */
    private final String name;
    /**
     * The collection of parameters associated with the intent.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3IntentParameterResponse> parameters;
    /**
     * The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    private final Integer priority;
    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse> trainingPhrases;

    @CustomType.Constructor
    private GetIntentResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("isFallback") Boolean isFallback,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") List<GoogleCloudDialogflowCxV3IntentParameterResponse> parameters,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("trainingPhrases") List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse> trainingPhrases) {
        this.description = description;
        this.displayName = displayName;
        this.isFallback = isFallback;
        this.labels = labels;
        this.name = name;
        this.parameters = parameters;
        this.priority = priority;
        this.trainingPhrases = trainingPhrases;
    }

    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the intent, unique within the agent.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
    */
    public Boolean getIsFallback() {
        return this.isFallback;
    }
    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent. "sys.contextual" means the intent is a contextual intent.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The collection of parameters associated with the intent.
     * 
    */
    public List<GoogleCloudDialogflowCxV3IntentParameterResponse> getParameters() {
        return this.parameters;
    }
    /**
     * The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * 
    */
    public List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse> getTrainingPhrases() {
        return this.trainingPhrases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private Boolean isFallback;
        private Map<String,String> labels;
        private String name;
        private List<GoogleCloudDialogflowCxV3IntentParameterResponse> parameters;
        private Integer priority;
        private List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse> trainingPhrases;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isFallback = defaults.isFallback;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.priority = defaults.priority;
    	      this.trainingPhrases = defaults.trainingPhrases;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder isFallback(Boolean isFallback) {
            this.isFallback = Objects.requireNonNull(isFallback);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parameters(List<GoogleCloudDialogflowCxV3IntentParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder trainingPhrases(List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse> trainingPhrases) {
            this.trainingPhrases = Objects.requireNonNull(trainingPhrases);
            return this;
        }
        public GetIntentResult build() {
            return new GetIntentResult(description, displayName, isFallback, labels, name, parameters, priority, trainingPhrases);
        }
    }
}
