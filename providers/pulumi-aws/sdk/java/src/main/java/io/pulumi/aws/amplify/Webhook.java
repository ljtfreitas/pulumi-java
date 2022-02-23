// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.amplify.WebhookArgs;
import io.pulumi.aws.amplify.inputs.WebhookState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Amplify Webhook resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Amplify webhook can be imported using a webhook ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:amplify/webhook:Webhook master a26b22a0-748b-4b57-b9a0-ae7e601fe4b1
 * ```
 * 
 */
@ResourceType(type="aws:amplify/webhook:Webhook")
public class Webhook extends io.pulumi.resources.CustomResource {
    /**
     * The unique ID for an Amplify app.
     * 
     */
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return The unique ID for an Amplify app.
     * 
     */
    public Output<String> getAppId() {
        return this.appId;
    }
    /**
     * The Amazon Resource Name (ARN) for the webhook.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the webhook.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name for a branch that is part of the Amplify app.
     * 
     */
    @OutputExport(name="branchName", type=String.class, parameters={})
    private Output<String> branchName;

    /**
     * @return The name for a branch that is part of the Amplify app.
     * 
     */
    public Output<String> getBranchName() {
        return this.branchName;
    }
    /**
     * The description for a webhook.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for a webhook.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The URL of the webhook.
     * 
     */
    @OutputExport(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL of the webhook.
     * 
     */
    public Output<String> getUrl() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/webhook:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Webhook(String name, Input<String> id, @Nullable WebhookState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/webhook:Webhook", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Webhook get(String name, Input<String> id, @Nullable WebhookState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, state, options);
    }
}
