// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codebuild.WebhookArgs;
import io.pulumi.aws.codebuild.inputs.WebhookState;
import io.pulumi.aws.codebuild.outputs.WebhookFilterGroup;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a CodeBuild webhook, which is an endpoint accepted by the CodeBuild service to trigger builds from source code repositories. Depending on the source type of the CodeBuild project, the CodeBuild service may also automatically create and delete the actual repository webhook as well.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeBuild Webhooks can be imported using the CodeBuild Project name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codebuild/webhook:Webhook example MyProjectName
 * ```
 * 
 */
@ResourceType(type="aws:codebuild/webhook:Webhook")
public class Webhook extends io.pulumi.resources.CustomResource {
    /**
     * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filter_group` over `branch_filter`.
     * 
     */
    @Export(name="branchFilter", type=String.class, parameters={})
    private Output</* @Nullable */ String> branchFilter;

    /**
     * @return A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filter_group` over `branch_filter`.
     * 
     */
    public Output</* @Nullable */ String> getBranchFilter() {
        return this.branchFilter;
    }
    /**
     * The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
     * 
     */
    @Export(name="buildType", type=String.class, parameters={})
    private Output</* @Nullable */ String> buildType;

    /**
     * @return The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
     * 
     */
    public Output</* @Nullable */ String> getBuildType() {
        return this.buildType;
    }
    /**
     * Information about the webhook's trigger. Filter group blocks are documented below.
     * 
     */
    @Export(name="filterGroups", type=List.class, parameters={WebhookFilterGroup.class})
    private Output</* @Nullable */ List<WebhookFilterGroup>> filterGroups;

    /**
     * @return Information about the webhook's trigger. Filter group blocks are documented below.
     * 
     */
    public Output</* @Nullable */ List<WebhookFilterGroup>> getFilterGroups() {
        return this.filterGroups;
    }
    /**
     * The CodeBuild endpoint where webhook events are sent.
     * 
     */
    @Export(name="payloadUrl", type=String.class, parameters={})
    private Output<String> payloadUrl;

    /**
     * @return The CodeBuild endpoint where webhook events are sent.
     * 
     */
    public Output<String> getPayloadUrl() {
        return this.payloadUrl;
    }
    /**
     * The name of the build project.
     * 
     */
    @Export(name="projectName", type=String.class, parameters={})
    private Output<String> projectName;

    /**
     * @return The name of the build project.
     * 
     */
    public Output<String> getProjectName() {
        return this.projectName;
    }
    /**
     * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
     * 
     */
    @Export(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    /**
     * @return The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
     * 
     */
    public Output<String> getSecret() {
        return this.secret;
    }
    /**
     * The URL to the webhook.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL to the webhook.
     * 
     */
    public Output<String> getUrl() {
        return this.url;
    }

    public interface BuilderApplicator {
        public void apply(WebhookArgs.Builder a);
    }
    private static io.pulumi.aws.codebuild.WebhookArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.codebuild.WebhookArgs.builder();
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
        super("aws:codebuild/webhook:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Webhook(String name, Output<String> id, @Nullable WebhookState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/webhook:Webhook", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Webhook get(String name, Output<String> id, @Nullable WebhookState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, state, options);
    }
}
