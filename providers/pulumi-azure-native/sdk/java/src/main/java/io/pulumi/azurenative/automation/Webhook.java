// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.WebhookArgs;
import io.pulumi.azurenative.automation.outputs.RunbookAssociationPropertyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the webhook type.
 * API Version: 2015-10-31.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:Webhook TestWebhook /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount33/webhooks/TestWebhook 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:Webhook")
public class Webhook extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return Gets or sets the creation time.
     * 
     */
    public Output</* @Nullable */ String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Gets or sets the expiry time.
     * 
     */
    @Export(name="expiryTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> expiryTime;

    /**
     * @return Gets or sets the expiry time.
     * 
     */
    public Output</* @Nullable */ String> getExpiryTime() {
        return this.expiryTime;
    }
    /**
     * Gets or sets the value of the enabled flag of the webhook.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Gets or sets the value of the enabled flag of the webhook.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets or sets the last invoked time.
     * 
     */
    @Export(name="lastInvokedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastInvokedTime;

    /**
     * @return Gets or sets the last invoked time.
     * 
     */
    public Output</* @Nullable */ String> getLastInvokedTime() {
        return this.lastInvokedTime;
    }
    /**
     * Details of the user who last modified the Webhook
     * 
     */
    @Export(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    /**
     * @return Details of the user who last modified the Webhook
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets the parameters of the job that is created when the webhook calls the runbook it is associated with.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return Gets or sets the parameters of the job that is created when the webhook calls the runbook it is associated with.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getParameters() {
        return this.parameters;
    }
    /**
     * Gets or sets the name of the hybrid worker group the webhook job will run on.
     * 
     */
    @Export(name="runOn", type=String.class, parameters={})
    private Output</* @Nullable */ String> runOn;

    /**
     * @return Gets or sets the name of the hybrid worker group the webhook job will run on.
     * 
     */
    public Output</* @Nullable */ String> getRunOn() {
        return this.runOn;
    }
    /**
     * Gets or sets the runbook the webhook is associated with.
     * 
     */
    @Export(name="runbook", type=RunbookAssociationPropertyResponse.class, parameters={})
    private Output</* @Nullable */ RunbookAssociationPropertyResponse> runbook;

    /**
     * @return Gets or sets the runbook the webhook is associated with.
     * 
     */
    public Output</* @Nullable */ RunbookAssociationPropertyResponse> getRunbook() {
        return this.runbook;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets or sets the webhook uri.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output</* @Nullable */ String> uri;

    /**
     * @return Gets or sets the webhook uri.
     * 
     */
    public Output</* @Nullable */ String> getUri() {
        return this.uri;
    }

    public interface BuilderApplicator {
        public void apply(WebhookArgs.Builder a);
    }
    private static io.pulumi.azurenative.automation.WebhookArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.automation.WebhookArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Webhook(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Webhook(String name) {
        this(name, WebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Webhook(String name, WebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Webhook(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Webhook", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:automation/v20151031:Webhook").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Webhook get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, options);
    }
}
