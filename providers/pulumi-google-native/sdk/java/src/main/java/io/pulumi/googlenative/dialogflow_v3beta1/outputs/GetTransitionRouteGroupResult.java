// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTransitionRouteGroupResult {
    /**
     * The human-readable name of the transition route group, unique within the Agent. The display name can be no longer than 30 characters.
     * 
     */
    private final String displayName;
    /**
     * The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    private final String name;
    /**
     * Transition routes associated with the TransitionRouteGroup.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> transitionRoutes;

    @CustomType.Constructor
    private GetTransitionRouteGroupResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("transitionRoutes") List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> transitionRoutes) {
        this.displayName = displayName;
        this.name = name;
        this.transitionRoutes = transitionRoutes;
    }

    /**
     * The human-readable name of the transition route group, unique within the Agent. The display name can be no longer than 30 characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Transition routes associated with the TransitionRouteGroup.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> getTransitionRoutes() {
        return this.transitionRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitionRouteGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String name;
        private List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitionRouteGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder transitionRoutes(List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> transitionRoutes) {
            this.transitionRoutes = Objects.requireNonNull(transitionRoutes);
            return this;
        }
        public GetTransitionRouteGroupResult build() {
            return new GetTransitionRouteGroupResult(displayName, name, transitionRoutes);
        }
    }
}
