// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3IntentParameterResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * An intent represents a user's intent to interact with a conversational agent. You can provide information for the Dialogflow API to use to match user input to an intent by adding training phrases (i.e., examples of user input) to your intent.
 * 
 */
public final class GoogleCloudDialogflowCxV3IntentResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3IntentResponse Empty = new GoogleCloudDialogflowCxV3IntentResponse();

    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    @Import(name="isFallback", required=true)
      private final Boolean isFallback;

    public Boolean getIsFallback() {
        return this.isFallback;
    }

    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent. "sys.contextual" means the intent is a contextual intent.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The collection of parameters associated with the intent.
     * 
     */
    @Import(name="parameters", required=true)
      private final List<GoogleCloudDialogflowCxV3IntentParameterResponse> parameters;

    public List<GoogleCloudDialogflowCxV3IntentParameterResponse> getParameters() {
        return this.parameters;
    }

    /**
     * The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * 
     */
    @Import(name="trainingPhrases", required=true)
      private final List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse> trainingPhrases;

    public List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse> getTrainingPhrases() {
        return this.trainingPhrases;
    }

    public GoogleCloudDialogflowCxV3IntentResponse(
        String description,
        String displayName,
        Boolean isFallback,
        Map<String,String> labels,
        String name,
        List<GoogleCloudDialogflowCxV3IntentParameterResponse> parameters,
        Integer priority,
        List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse> trainingPhrases) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.isFallback = Objects.requireNonNull(isFallback, "expected parameter 'isFallback' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.trainingPhrases = Objects.requireNonNull(trainingPhrases, "expected parameter 'trainingPhrases' to be non-null");
    }

    private GoogleCloudDialogflowCxV3IntentResponse() {
        this.description = null;
        this.displayName = null;
        this.isFallback = null;
        this.labels = Map.of();
        this.name = null;
        this.parameters = List.of();
        this.priority = null;
        this.trainingPhrases = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentResponse defaults) {
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

        public Builder(GoogleCloudDialogflowCxV3IntentResponse defaults) {
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
        public GoogleCloudDialogflowCxV3IntentResponse build() {
            return new GoogleCloudDialogflowCxV3IntentResponse(description, displayName, isFallback, labels, name, parameters, priority, trainingPhrases);
        }
    }
}
