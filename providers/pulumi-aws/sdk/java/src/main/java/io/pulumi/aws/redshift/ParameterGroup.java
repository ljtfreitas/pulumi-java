// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.redshift.ParameterGroupArgs;
import io.pulumi.aws.redshift.inputs.ParameterGroupState;
import io.pulumi.aws.redshift.outputs.ParameterGroupParameter;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Redshift Cluster parameter group resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Redshift Parameter Groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:redshift/parameterGroup:ParameterGroup paramgroup1 parameter-group-test
 * ```
 * 
 */
@ResourceType(type="aws:redshift/parameterGroup:ParameterGroup")
public class ParameterGroup extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of parameter group
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of parameter group
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the Redshift parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the Redshift parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The family of the Redshift parameter group.
     * 
     */
    @OutputExport(name="family", type=String.class, parameters={})
    private Output<String> family;

    /**
     * @return The family of the Redshift parameter group.
     * 
     */
    public Output<String> getFamily() {
        return this.family;
    }
    /**
     * The name of the Redshift parameter.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Redshift parameter.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of Redshift parameters to apply.
     * 
     */
    @OutputExport(name="parameters", type=List.class, parameters={ParameterGroupParameter.class})
    private Output</* @Nullable */ List<ParameterGroupParameter>> parameters;

    /**
     * @return A list of Redshift parameters to apply.
     * 
     */
    public Output</* @Nullable */ List<ParameterGroupParameter>> getParameters() {
        return this.parameters;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ParameterGroup(String name, ParameterGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/parameterGroup:ParameterGroup", name, args == null ? ParameterGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ParameterGroup(String name, Input<String> id, @Nullable ParameterGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/parameterGroup:ParameterGroup", name, state, makeResourceOptions(options, id));
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
    public static ParameterGroup get(String name, Input<String> id, @Nullable ParameterGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ParameterGroup(name, id, state, options);
    }
}
