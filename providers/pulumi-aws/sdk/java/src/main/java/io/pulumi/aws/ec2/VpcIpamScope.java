// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcIpamScopeArgs;
import io.pulumi.aws.ec2.inputs.VpcIpamScopeState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a scope for AWS IPAM.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IPAMs can be imported using the `scope_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamScope:VpcIpamScope example ipam-scope-0513c69f283d11dfb
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpamScope:VpcIpamScope")
public class VpcIpamScope extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description for the scope you're creating.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the scope you're creating.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The ARN of the IPAM for which you're creating this scope.
     * 
     */
    @OutputExport(name="ipamArn", type=String.class, parameters={})
    private Output<String> ipamArn;

    /**
     * @return The ARN of the IPAM for which you're creating this scope.
     * 
     */
    public Output<String> getIpamArn() {
        return this.ipamArn;
    }
    /**
     * The ID of the IPAM for which you're creating this scope.
     * 
     */
    @OutputExport(name="ipamId", type=String.class, parameters={})
    private Output<String> ipamId;

    /**
     * @return The ID of the IPAM for which you're creating this scope.
     * 
     */
    public Output<String> getIpamId() {
        return this.ipamId;
    }
    @OutputExport(name="ipamScopeType", type=String.class, parameters={})
    private Output<String> ipamScopeType;

    public Output<String> getIpamScopeType() {
        return this.ipamScopeType;
    }
    /**
     * Defines if the scope is the default scope or not.
     * 
     */
    @OutputExport(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    /**
     * @return Defines if the scope is the default scope or not.
     * 
     */
    public Output<Boolean> getIsDefault() {
        return this.isDefault;
    }
    /**
     * Count of pools under this scope
     * 
     */
    @OutputExport(name="poolCount", type=Integer.class, parameters={})
    private Output<Integer> poolCount;

    /**
     * @return Count of pools under this scope
     * 
     */
    public Output<Integer> getPoolCount() {
        return this.poolCount;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpamScope(String name, VpcIpamScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamScope:VpcIpamScope", name, args == null ? VpcIpamScopeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VpcIpamScope(String name, Input<String> id, @Nullable VpcIpamScopeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamScope:VpcIpamScope", name, state, makeResourceOptions(options, id));
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
    public static VpcIpamScope get(String name, Input<String> id, @Nullable VpcIpamScopeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpamScope(name, id, state, options);
    }
}
