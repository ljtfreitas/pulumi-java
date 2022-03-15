// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.CxVersionArgs;
import io.pulumi.gcp.diagflow.inputs.CxVersionState;
import io.pulumi.gcp.diagflow.outputs.CxVersionNluSetting;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * You can create multiple versions of your agent flows and deploy them to separate serving environments.
 * When you edit a flow, you are editing a draft flow. At any point, you can save a draft flow as a flow version. A flow version is an immutable snapshot of your flow data and associated agent data like intents, entities, webhooks, pages, route groups, etc.
 * 
 * To get more information about Version, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.versions)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Version can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxVersion:CxVersion default {{parent}}/versions/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxVersion:CxVersion default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxVersion:CxVersion")
public class CxVersion extends io.pulumi.resources.CustomResource {
    /**
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples:
     * "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples:
     * "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the version. Limit of 64 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow
     * upon version creation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow
     * upon version creation.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The NLU settings of the flow at version creation.
     * 
     */
    @Export(name="nluSettings", type=List.class, parameters={CxVersionNluSetting.class})
    private Output<List<CxVersionNluSetting>> nluSettings;

    /**
     * @return The NLU settings of the flow at version creation.
     * 
     */
    public Output<List<CxVersionNluSetting>> getNluSettings() {
        return this.nluSettings;
    }
    /**
     * The Flow to create an Version for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The Flow to create an Version for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    public Output</* @Nullable */ String> getParent() {
        return this.parent;
    }
    /**
     * The state of this version. * RUNNING: Version is not ready to serve (e.g. training is running). * SUCCEEDED: Training
     * has succeeded and this version is ready to serve. * FAILED: Version training failed.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of this version. * RUNNING: Version is not ready to serve (e.g. training is running). * SUCCEEDED: Training
     * has succeeded and this version is ready to serve. * FAILED: Version training failed.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(CxVersionArgs.Builder a);
    }
    private static io.pulumi.gcp.diagflow.CxVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.diagflow.CxVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CxVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CxVersion(String name) {
        this(name, CxVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CxVersion(String name, CxVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxVersion(String name, CxVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxVersion:CxVersion", name, args == null ? CxVersionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CxVersion(String name, Output<String> id, @Nullable CxVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxVersion:CxVersion", name, state, makeResourceOptions(options, id));
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
    public static CxVersion get(String name, Output<String> id, @Nullable CxVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CxVersion(name, id, state, options);
    }
}
