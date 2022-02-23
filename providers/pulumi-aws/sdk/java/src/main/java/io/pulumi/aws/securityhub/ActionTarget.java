// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.securityhub.ActionTargetArgs;
import io.pulumi.aws.securityhub.inputs.ActionTargetState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates Security Hub custom action.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Security Hub custom action can be imported using the action target ARN e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/actionTarget:ActionTarget example arn:aws:securityhub:eu-west-1:312940875350:action/custom/a
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/actionTarget:ActionTarget")
public class ActionTarget extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Security Hub custom action target.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Security Hub custom action target.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the custom action target.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The name of the custom action target.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The ID for the custom action target.
     * 
     */
    @OutputExport(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return The ID for the custom action target.
     * 
     */
    public Output<String> getIdentifier() {
        return this.identifier;
    }
    /**
     * The description for the custom action target.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The description for the custom action target.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionTarget(String name, ActionTargetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/actionTarget:ActionTarget", name, args == null ? ActionTargetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ActionTarget(String name, Input<String> id, @Nullable ActionTargetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/actionTarget:ActionTarget", name, state, makeResourceOptions(options, id));
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
    public static ActionTarget get(String name, Input<String> id, @Nullable ActionTargetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ActionTarget(name, id, state, options);
    }
}