// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow.v3.TransitionRouteGroupArgs;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates an TransitionRouteGroup in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
 * 
 */
@ResourceType(type="google-native:dialogflow/v3:TransitionRouteGroup")
public class TransitionRouteGroup extends com.pulumi.resources.CustomResource {
    @Export(name="agentId", type=String.class, parameters={})
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * The human-readable name of the transition route group, unique within the flow. The display name can be no longer than 30 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the transition route group, unique within the flow. The display name can be no longer than 30 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    @Export(name="flowId", type=String.class, parameters={})
    private Output<String> flowId;

    public Output<String> flowId() {
        return this.flowId;
    }
    /**
     * The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output<Optional<String>> languageCode() {
        return Codegen.optional(this.languageCode);
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Transition routes associated with the TransitionRouteGroup.
     * 
     */
    @Export(name="transitionRoutes", type=List.class, parameters={GoogleCloudDialogflowCxV3TransitionRouteResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3TransitionRouteResponse>> transitionRoutes;

    /**
     * @return Transition routes associated with the TransitionRouteGroup.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3TransitionRouteResponse>> transitionRoutes() {
        return this.transitionRoutes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitionRouteGroup(String name) {
        this(name, TransitionRouteGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitionRouteGroup(String name, TransitionRouteGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitionRouteGroup(String name, TransitionRouteGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:TransitionRouteGroup", name, args == null ? TransitionRouteGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitionRouteGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:TransitionRouteGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TransitionRouteGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitionRouteGroup(name, id, options);
    }
}
