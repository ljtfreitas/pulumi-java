// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EventHandlerArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1NluSettingsArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TransitionRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowArgs Empty = new FlowArgs();

    @InputImport(name="agentId", required=true)
      private final Input<String> agentId;

    public Input<String> getAgentId() {
        return this.agentId;
    }

    /**
     * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the flow.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * A flow's event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page's event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * 
     */
    @InputImport(name="eventHandlers")
      private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers;

    public Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> getEventHandlers() {
        return this.eventHandlers == null ? Input.empty() : this.eventHandlers;
    }

    @InputImport(name="languageCode")
      private final @Nullable Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode == null ? Input.empty() : this.languageCode;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * NLU related settings of the flow.
     * 
     */
    @InputImport(name="nluSettings")
      private final @Nullable Input<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings;

    public Input<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> getNluSettings() {
        return this.nluSettings == null ? Input.empty() : this.nluSettings;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A flow's transition route group serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @InputImport(name="transitionRouteGroups")
      private final @Nullable Input<List<String>> transitionRouteGroups;

    public Input<List<String>> getTransitionRouteGroups() {
        return this.transitionRouteGroups == null ? Input.empty() : this.transitionRouteGroups;
    }

    /**
     * A flow's transition routes serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition routes and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified.. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
     * 
     */
    @InputImport(name="transitionRoutes")
      private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

    public Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> getTransitionRoutes() {
        return this.transitionRoutes == null ? Input.empty() : this.transitionRoutes;
    }

    public FlowArgs(
        Input<String> agentId,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers,
        @Nullable Input<String> languageCode,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings,
        @Nullable Input<String> project,
        @Nullable Input<List<String>> transitionRouteGroups,
        @Nullable Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.eventHandlers = eventHandlers;
        this.languageCode = languageCode;
        this.location = location;
        this.name = name;
        this.nluSettings = nluSettings;
        this.project = project;
        this.transitionRouteGroups = transitionRouteGroups;
        this.transitionRoutes = transitionRoutes;
    }

    private FlowArgs() {
        this.agentId = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.eventHandlers = Input.empty();
        this.languageCode = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.nluSettings = Input.empty();
        this.project = Input.empty();
        this.transitionRouteGroups = Input.empty();
        this.transitionRoutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> agentId;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers;
        private @Nullable Input<String> languageCode;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings;
        private @Nullable Input<String> project;
        private @Nullable Input<List<String>> transitionRouteGroups;
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nluSettings = defaults.nluSettings;
    	      this.project = defaults.project;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder setAgentId(Input<String> agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Input.of(Objects.requireNonNull(agentId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEventHandlers(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }

        public Builder setEventHandlers(@Nullable List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs> eventHandlers) {
            this.eventHandlers = Input.ofNullable(eventHandlers);
            return this;
        }

        public Builder setLanguageCode(@Nullable Input<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder setLanguageCode(@Nullable String languageCode) {
            this.languageCode = Input.ofNullable(languageCode);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNluSettings(@Nullable Input<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings) {
            this.nluSettings = nluSettings;
            return this;
        }

        public Builder setNluSettings(@Nullable GoogleCloudDialogflowCxV3beta1NluSettingsArgs nluSettings) {
            this.nluSettings = Input.ofNullable(nluSettings);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTransitionRouteGroups(@Nullable Input<List<String>> transitionRouteGroups) {
            this.transitionRouteGroups = transitionRouteGroups;
            return this;
        }

        public Builder setTransitionRouteGroups(@Nullable List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Input.ofNullable(transitionRouteGroups);
            return this;
        }

        public Builder setTransitionRoutes(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
            this.transitionRoutes = transitionRoutes;
            return this;
        }

        public Builder setTransitionRoutes(@Nullable List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs> transitionRoutes) {
            this.transitionRoutes = Input.ofNullable(transitionRoutes);
            return this;
        }
        public FlowArgs build() {
            return new FlowArgs(agentId, description, displayName, eventHandlers, languageCode, location, name, nluSettings, project, transitionRouteGroups, transitionRoutes);
        }
    }
}
