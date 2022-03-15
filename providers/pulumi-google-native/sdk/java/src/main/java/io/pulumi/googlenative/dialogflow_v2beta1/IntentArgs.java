// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.IntentDefaultResponsePlatformsItem;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.IntentWebhookState;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1ContextArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentParameterArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentArgs Empty = new IntentArgs();

    /**
     * Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * Optional. The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
     * 
     */
    @Import(name="defaultResponsePlatforms")
      private final @Nullable Output<List<IntentDefaultResponsePlatformsItem>> defaultResponsePlatforms;

    public Output<List<IntentDefaultResponsePlatformsItem>> getDefaultResponsePlatforms() {
        return this.defaultResponsePlatforms == null ? Output.empty() : this.defaultResponsePlatforms;
    }

    /**
     * The name of this intent.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on Google or Dialogflow phone gateway) use this information to close interaction with an end user. Default is false.
     * 
     */
    @Import(name="endInteraction")
      private final @Nullable Output<Boolean> endInteraction;

    public Output<Boolean> getEndInteraction() {
        return this.endInteraction == null ? Output.empty() : this.endInteraction;
    }

    /**
     * Optional. The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of the contexts must be present in the active user session for an event to trigger this intent. Event names are limited to 150 characters.
     * 
     */
    @Import(name="events")
      private final @Nullable Output<List<String>> events;

    public Output<List<String>> getEvents() {
        return this.events == null ? Output.empty() : this.events;
    }

    /**
     * Optional. The list of context names required for this intent to be triggered. Formats: - `projects//agent/sessions/-/contexts/` - `projects//locations//agent/sessions/-/contexts/`
     * 
     */
    @Import(name="inputContextNames")
      private final @Nullable Output<List<String>> inputContextNames;

    public Output<List<String>> getInputContextNames() {
        return this.inputContextNames == null ? Output.empty() : this.inputContextNames;
    }

    @Import(name="intentView")
      private final @Nullable Output<String> intentView;

    public Output<String> getIntentView() {
        return this.intentView == null ? Output.empty() : this.intentView;
    }

    /**
     * Optional. Indicates whether this is a fallback intent.
     * 
     */
    @Import(name="isFallback")
      private final @Nullable Output<Boolean> isFallback;

    public Output<Boolean> getIsFallback() {
        return this.isFallback == null ? Output.empty() : this.isFallback;
    }

    @Import(name="languageCode")
      private final @Nullable Output<String> languageCode;

    public Output<String> getLanguageCode() {
        return this.languageCode == null ? Output.empty() : this.languageCode;
    }

    /**
     * Optional. Indicates that a live agent should be brought in to handle the interaction with the user. In most cases, when you set this flag to true, you would also want to set end_interaction to true as well. Default is false.
     * 
     */
    @Import(name="liveAgentHandoff")
      private final @Nullable Output<Boolean> liveAgentHandoff;

    public Output<Boolean> getLiveAgentHandoff() {
        return this.liveAgentHandoff == null ? Output.empty() : this.liveAgentHandoff;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. The collection of rich messages corresponding to the `Response` field in the Dialogflow console.
     * 
     */
    @Import(name="messages")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageArgs>> messages;

    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageArgs>> getMessages() {
        return this.messages == null ? Output.empty() : this.messages;
    }

    /**
     * Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_disabled` setting is set to true, then this intent is not taken into account during inference in `ML ONLY` match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    @Import(name="mlDisabled")
      private final @Nullable Output<Boolean> mlDisabled;

    public Output<Boolean> getMlDisabled() {
        return this.mlDisabled == null ? Output.empty() : this.mlDisabled;
    }

    /**
     * Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Supported formats: - `projects//agent/intents/` - `projects//locations//agent/intents/`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Optional. The collection of contexts that are activated when the intent is matched. Context messages in this collection should not set the parameters field. Setting the `lifespan_count` to 0 will reset the context when the intent is matched. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    @Import(name="outputContexts")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1ContextArgs>> outputContexts;

    public Output<List<GoogleCloudDialogflowV2beta1ContextArgs>> getOutputContexts() {
        return this.outputContexts == null ? Output.empty() : this.outputContexts;
    }

    /**
     * Optional. The collection of parameters associated with the intent.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentParameterArgs>> parameters;

    public Output<List<GoogleCloudDialogflowV2beta1IntentParameterArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Optional. The unique identifier of the parent intent in the chain of followup intents. You can set this field when creating an intent, for example with CreateIntent or BatchUpdateIntents, in order to make this intent a followup intent. It identifies the parent followup intent. Format: `projects//agent/intents/`.
     * 
     */
    @Import(name="parentFollowupIntentName")
      private final @Nullable Output<String> parentFollowupIntentName;

    public Output<String> getParentFollowupIntentName() {
        return this.parentFollowupIntentName == null ? Output.empty() : this.parentFollowupIntentName;
    }

    /**
     * Optional. The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Optional. Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    @Import(name="resetContexts")
      private final @Nullable Output<Boolean> resetContexts;

    public Output<Boolean> getResetContexts() {
        return this.resetContexts == null ? Output.empty() : this.resetContexts;
    }

    /**
     * Optional. The collection of examples that the agent is trained on.
     * 
     */
    @Import(name="trainingPhrases")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs>> trainingPhrases;

    public Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs>> getTrainingPhrases() {
        return this.trainingPhrases == null ? Output.empty() : this.trainingPhrases;
    }

    /**
     * Optional. Indicates whether webhooks are enabled for the intent.
     * 
     */
    @Import(name="webhookState")
      private final @Nullable Output<IntentWebhookState> webhookState;

    public Output<IntentWebhookState> getWebhookState() {
        return this.webhookState == null ? Output.empty() : this.webhookState;
    }

    public IntentArgs(
        @Nullable Output<String> action,
        @Nullable Output<List<IntentDefaultResponsePlatformsItem>> defaultResponsePlatforms,
        Output<String> displayName,
        @Nullable Output<Boolean> endInteraction,
        @Nullable Output<List<String>> events,
        @Nullable Output<List<String>> inputContextNames,
        @Nullable Output<String> intentView,
        @Nullable Output<Boolean> isFallback,
        @Nullable Output<String> languageCode,
        @Nullable Output<Boolean> liveAgentHandoff,
        @Nullable Output<String> location,
        @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageArgs>> messages,
        @Nullable Output<Boolean> mlDisabled,
        @Nullable Output<String> name,
        @Nullable Output<List<GoogleCloudDialogflowV2beta1ContextArgs>> outputContexts,
        @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentParameterArgs>> parameters,
        @Nullable Output<String> parentFollowupIntentName,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> resetContexts,
        @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs>> trainingPhrases,
        @Nullable Output<IntentWebhookState> webhookState) {
        this.action = action;
        this.defaultResponsePlatforms = defaultResponsePlatforms;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.endInteraction = endInteraction;
        this.events = events;
        this.inputContextNames = inputContextNames;
        this.intentView = intentView;
        this.isFallback = isFallback;
        this.languageCode = languageCode;
        this.liveAgentHandoff = liveAgentHandoff;
        this.location = location;
        this.messages = messages;
        this.mlDisabled = mlDisabled;
        this.name = name;
        this.outputContexts = outputContexts;
        this.parameters = parameters;
        this.parentFollowupIntentName = parentFollowupIntentName;
        this.priority = priority;
        this.project = project;
        this.resetContexts = resetContexts;
        this.trainingPhrases = trainingPhrases;
        this.webhookState = webhookState;
    }

    private IntentArgs() {
        this.action = Output.empty();
        this.defaultResponsePlatforms = Output.empty();
        this.displayName = Output.empty();
        this.endInteraction = Output.empty();
        this.events = Output.empty();
        this.inputContextNames = Output.empty();
        this.intentView = Output.empty();
        this.isFallback = Output.empty();
        this.languageCode = Output.empty();
        this.liveAgentHandoff = Output.empty();
        this.location = Output.empty();
        this.messages = Output.empty();
        this.mlDisabled = Output.empty();
        this.name = Output.empty();
        this.outputContexts = Output.empty();
        this.parameters = Output.empty();
        this.parentFollowupIntentName = Output.empty();
        this.priority = Output.empty();
        this.project = Output.empty();
        this.resetContexts = Output.empty();
        this.trainingPhrases = Output.empty();
        this.webhookState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<List<IntentDefaultResponsePlatformsItem>> defaultResponsePlatforms;
        private Output<String> displayName;
        private @Nullable Output<Boolean> endInteraction;
        private @Nullable Output<List<String>> events;
        private @Nullable Output<List<String>> inputContextNames;
        private @Nullable Output<String> intentView;
        private @Nullable Output<Boolean> isFallback;
        private @Nullable Output<String> languageCode;
        private @Nullable Output<Boolean> liveAgentHandoff;
        private @Nullable Output<String> location;
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageArgs>> messages;
        private @Nullable Output<Boolean> mlDisabled;
        private @Nullable Output<String> name;
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1ContextArgs>> outputContexts;
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentParameterArgs>> parameters;
        private @Nullable Output<String> parentFollowupIntentName;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> resetContexts;
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs>> trainingPhrases;
        private @Nullable Output<IntentWebhookState> webhookState;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.defaultResponsePlatforms = defaults.defaultResponsePlatforms;
    	      this.displayName = defaults.displayName;
    	      this.endInteraction = defaults.endInteraction;
    	      this.events = defaults.events;
    	      this.inputContextNames = defaults.inputContextNames;
    	      this.intentView = defaults.intentView;
    	      this.isFallback = defaults.isFallback;
    	      this.languageCode = defaults.languageCode;
    	      this.liveAgentHandoff = defaults.liveAgentHandoff;
    	      this.location = defaults.location;
    	      this.messages = defaults.messages;
    	      this.mlDisabled = defaults.mlDisabled;
    	      this.name = defaults.name;
    	      this.outputContexts = defaults.outputContexts;
    	      this.parameters = defaults.parameters;
    	      this.parentFollowupIntentName = defaults.parentFollowupIntentName;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.resetContexts = defaults.resetContexts;
    	      this.trainingPhrases = defaults.trainingPhrases;
    	      this.webhookState = defaults.webhookState;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable String action) {
            this.action = Output.ofNullable(action);
            return this;
        }

        public Builder defaultResponsePlatforms(@Nullable Output<List<IntentDefaultResponsePlatformsItem>> defaultResponsePlatforms) {
            this.defaultResponsePlatforms = defaultResponsePlatforms;
            return this;
        }

        public Builder defaultResponsePlatforms(@Nullable List<IntentDefaultResponsePlatformsItem> defaultResponsePlatforms) {
            this.defaultResponsePlatforms = Output.ofNullable(defaultResponsePlatforms);
            return this;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder endInteraction(@Nullable Output<Boolean> endInteraction) {
            this.endInteraction = endInteraction;
            return this;
        }

        public Builder endInteraction(@Nullable Boolean endInteraction) {
            this.endInteraction = Output.ofNullable(endInteraction);
            return this;
        }

        public Builder events(@Nullable Output<List<String>> events) {
            this.events = events;
            return this;
        }

        public Builder events(@Nullable List<String> events) {
            this.events = Output.ofNullable(events);
            return this;
        }

        public Builder inputContextNames(@Nullable Output<List<String>> inputContextNames) {
            this.inputContextNames = inputContextNames;
            return this;
        }

        public Builder inputContextNames(@Nullable List<String> inputContextNames) {
            this.inputContextNames = Output.ofNullable(inputContextNames);
            return this;
        }

        public Builder intentView(@Nullable Output<String> intentView) {
            this.intentView = intentView;
            return this;
        }

        public Builder intentView(@Nullable String intentView) {
            this.intentView = Output.ofNullable(intentView);
            return this;
        }

        public Builder isFallback(@Nullable Output<Boolean> isFallback) {
            this.isFallback = isFallback;
            return this;
        }

        public Builder isFallback(@Nullable Boolean isFallback) {
            this.isFallback = Output.ofNullable(isFallback);
            return this;
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = Output.ofNullable(languageCode);
            return this;
        }

        public Builder liveAgentHandoff(@Nullable Output<Boolean> liveAgentHandoff) {
            this.liveAgentHandoff = liveAgentHandoff;
            return this;
        }

        public Builder liveAgentHandoff(@Nullable Boolean liveAgentHandoff) {
            this.liveAgentHandoff = Output.ofNullable(liveAgentHandoff);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder messages(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageArgs>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder messages(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageArgs> messages) {
            this.messages = Output.ofNullable(messages);
            return this;
        }

        public Builder mlDisabled(@Nullable Output<Boolean> mlDisabled) {
            this.mlDisabled = mlDisabled;
            return this;
        }

        public Builder mlDisabled(@Nullable Boolean mlDisabled) {
            this.mlDisabled = Output.ofNullable(mlDisabled);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder outputContexts(@Nullable Output<List<GoogleCloudDialogflowV2beta1ContextArgs>> outputContexts) {
            this.outputContexts = outputContexts;
            return this;
        }

        public Builder outputContexts(@Nullable List<GoogleCloudDialogflowV2beta1ContextArgs> outputContexts) {
            this.outputContexts = Output.ofNullable(outputContexts);
            return this;
        }

        public Builder parameters(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<GoogleCloudDialogflowV2beta1IntentParameterArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder parentFollowupIntentName(@Nullable Output<String> parentFollowupIntentName) {
            this.parentFollowupIntentName = parentFollowupIntentName;
            return this;
        }

        public Builder parentFollowupIntentName(@Nullable String parentFollowupIntentName) {
            this.parentFollowupIntentName = Output.ofNullable(parentFollowupIntentName);
            return this;
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder resetContexts(@Nullable Output<Boolean> resetContexts) {
            this.resetContexts = resetContexts;
            return this;
        }

        public Builder resetContexts(@Nullable Boolean resetContexts) {
            this.resetContexts = Output.ofNullable(resetContexts);
            return this;
        }

        public Builder trainingPhrases(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs>> trainingPhrases) {
            this.trainingPhrases = trainingPhrases;
            return this;
        }

        public Builder trainingPhrases(@Nullable List<GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs> trainingPhrases) {
            this.trainingPhrases = Output.ofNullable(trainingPhrases);
            return this;
        }

        public Builder webhookState(@Nullable Output<IntentWebhookState> webhookState) {
            this.webhookState = webhookState;
            return this;
        }

        public Builder webhookState(@Nullable IntentWebhookState webhookState) {
            this.webhookState = Output.ofNullable(webhookState);
            return this;
        }
        public IntentArgs build() {
            return new IntentArgs(action, defaultResponsePlatforms, displayName, endInteraction, events, inputContextNames, intentView, isFallback, languageCode, liveAgentHandoff, location, messages, mlDisabled, name, outputContexts, parameters, parentFollowupIntentName, priority, project, resetContexts, trainingPhrases, webhookState);
        }
    }
}
