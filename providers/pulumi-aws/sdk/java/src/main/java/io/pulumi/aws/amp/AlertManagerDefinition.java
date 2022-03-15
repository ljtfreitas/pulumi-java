// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amp;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.amp.AlertManagerDefinitionArgs;
import io.pulumi.aws.amp.inputs.AlertManagerDefinitionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Amazon Managed Service for Prometheus (AMP) Alert Manager Definition
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * The prometheus alert manager definition can be imported using the workspace identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:amp/alertManagerDefinition:AlertManagerDefinition demo ws-C6DCB907-F2D7-4D96-957B-66691F865D8B
 * ```
 * 
 */
@ResourceType(type="aws:amp/alertManagerDefinition:AlertManagerDefinition")
public class AlertManagerDefinition extends io.pulumi.resources.CustomResource {
    /**
     * the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
     * 
     */
    @Export(name="definition", type=String.class, parameters={})
    private Output<String> definition;

    /**
     * @return the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
     * 
     */
    public Output<String> getDefinition() {
        return this.definition;
    }
    /**
     * The id of the prometheus workspace the alert manager definition should be linked to
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output<String> workspaceId;

    /**
     * @return The id of the prometheus workspace the alert manager definition should be linked to
     * 
     */
    public Output<String> getWorkspaceId() {
        return this.workspaceId;
    }

    public interface BuilderApplicator {
        public void apply(AlertManagerDefinitionArgs.Builder a);
    }
    private static io.pulumi.aws.amp.AlertManagerDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.amp.AlertManagerDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AlertManagerDefinition(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertManagerDefinition(String name) {
        this(name, AlertManagerDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertManagerDefinition(String name, AlertManagerDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertManagerDefinition(String name, AlertManagerDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:amp/alertManagerDefinition:AlertManagerDefinition", name, args == null ? AlertManagerDefinitionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AlertManagerDefinition(String name, Output<String> id, @Nullable AlertManagerDefinitionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:amp/alertManagerDefinition:AlertManagerDefinition", name, state, makeResourceOptions(options, id));
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
    public static AlertManagerDefinition get(String name, Output<String> id, @Nullable AlertManagerDefinitionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AlertManagerDefinition(name, id, state, options);
    }
}
