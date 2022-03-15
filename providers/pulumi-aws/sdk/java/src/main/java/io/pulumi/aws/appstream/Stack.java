// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appstream.StackArgs;
import io.pulumi.aws.appstream.inputs.StackState;
import io.pulumi.aws.appstream.outputs.StackAccessEndpoint;
import io.pulumi.aws.appstream.outputs.StackApplicationSettings;
import io.pulumi.aws.appstream.outputs.StackStorageConnector;
import io.pulumi.aws.appstream.outputs.StackUserSetting;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AppStream stack.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_appstream_stack` can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appstream/stack:Stack example stackID
 * ```
 * 
 */
@ResourceType(type="aws:appstream/stack:Stack")
public class Stack extends io.pulumi.resources.CustomResource {
    @Export(name="accessEndpoints", type=List.class, parameters={StackAccessEndpoint.class})
    private Output<List<StackAccessEndpoint>> accessEndpoints;

    public Output<List<StackAccessEndpoint>> getAccessEndpoints() {
        return this.accessEndpoints;
    }
    /**
     * Settings for application settings persistence.
     * 
     */
    @Export(name="applicationSettings", type=StackApplicationSettings.class, parameters={})
    private Output<StackApplicationSettings> applicationSettings;

    /**
     * @return Settings for application settings persistence.
     * 
     */
    public Output<StackApplicationSettings> getApplicationSettings() {
        return this.applicationSettings;
    }
    /**
     * ARN of the appstream stack.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the appstream stack.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Date and time, in UTC and extended RFC 3339 format, when the stack was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, when the stack was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Description for the AppStream stack.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description for the AppStream stack.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Stack name to display.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Stack name to display.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     * 
     */
    @Export(name="embedHostDomains", type=List.class, parameters={String.class})
    private Output<List<String>> embedHostDomains;

    /**
     * @return Domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     * 
     */
    public Output<List<String>> getEmbedHostDomains() {
        return this.embedHostDomains;
    }
    /**
     * URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed. .
     * 
     */
    @Export(name="feedbackUrl", type=String.class, parameters={})
    private Output<String> feedbackUrl;

    /**
     * @return URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed. .
     * 
     */
    public Output<String> getFeedbackUrl() {
        return this.feedbackUrl;
    }
    /**
     * Unique name for the AppStream stack.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name for the AppStream stack.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * URL that users are redirected to after their streaming session ends.
     * 
     */
    @Export(name="redirectUrl", type=String.class, parameters={})
    private Output<String> redirectUrl;

    /**
     * @return URL that users are redirected to after their streaming session ends.
     * 
     */
    public Output<String> getRedirectUrl() {
        return this.redirectUrl;
    }
    /**
     * Configuration block for the storage connectors to enable. See below.
     * 
     */
    @Export(name="storageConnectors", type=List.class, parameters={StackStorageConnector.class})
    private Output<List<StackStorageConnector>> storageConnectors;

    /**
     * @return Configuration block for the storage connectors to enable. See below.
     * 
     */
    public Output<List<StackStorageConnector>> getStorageConnectors() {
        return this.storageConnectors;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block for the actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. See below.
     * 
     */
    @Export(name="userSettings", type=List.class, parameters={StackUserSetting.class})
    private Output<List<StackUserSetting>> userSettings;

    /**
     * @return Configuration block for the actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. See below.
     * 
     */
    public Output<List<StackUserSetting>> getUserSettings() {
        return this.userSettings;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable StackArgs.Builder a);
    }
    private static io.pulumi.aws.appstream.StackArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appstream.StackArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Stack(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stack(String name) {
        this(name, StackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stack(String name, @Nullable StackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stack(String name, @Nullable StackArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/stack:Stack", name, args == null ? StackArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Stack(String name, Output<String> id, @Nullable StackState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/stack:Stack", name, state, makeResourceOptions(options, id));
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
    public static Stack get(String name, Output<String> id, @Nullable StackState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Stack(name, id, state, options);
    }
}
