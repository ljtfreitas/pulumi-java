// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.quicksight.GroupArgs;
import io.pulumi.aws.quicksight.inputs.GroupState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing QuickSight Group
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * QuickSight Group can be imported using the aws account id, namespace and group name separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:quicksight/group:Group example 123456789123/default/tf-example
 * ```
 * 
 */
@ResourceType(type="aws:quicksight/group:Group")
public class Group extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of group
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of group
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @OutputExport(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    /**
     * @return The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    public Output<String> getAwsAccountId() {
        return this.awsAccountId;
    }
    /**
     * A description for the group.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the group.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A name for the group.
     * 
     */
    @OutputExport(name="groupName", type=String.class, parameters={})
    private Output<String> groupName;

    /**
     * @return A name for the group.
     * 
     */
    public Output<String> getGroupName() {
        return this.groupName;
    }
    /**
     * The namespace. Currently, you should set this to `default`.
     * 
     */
    @OutputExport(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The namespace. Currently, you should set this to `default`.
     * 
     */
    public Output</* @Nullable */ String> getNamespace() {
        return this.namespace;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, GroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/group:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Group(String name, Input<String> id, @Nullable GroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/group:Group", name, state, makeResourceOptions(options, id));
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
    public static Group get(String name, Input<String> id, @Nullable GroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, state, options);
    }
}