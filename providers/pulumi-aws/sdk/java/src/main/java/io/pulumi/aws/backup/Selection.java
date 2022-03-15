// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.backup.SelectionArgs;
import io.pulumi.aws.backup.inputs.SelectionState;
import io.pulumi.aws.backup.outputs.SelectionCondition;
import io.pulumi.aws.backup.outputs.SelectionSelectionTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages selection conditions for AWS Backup plan resources.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Backup selection can be imported using the role plan_id and id separated by `|`.
 * 
 * ```sh
 *  $ pulumi import aws:backup/selection:Selection example plan-id|selection-id
 * ```
 * 
 */
@ResourceType(type="aws:backup/selection:Selection")
public class Selection extends io.pulumi.resources.CustomResource {
    /**
     * A list of conditions that you define to assign resources to your backup plans using tags.
     * 
     */
    @Export(name="conditions", type=List.class, parameters={SelectionCondition.class})
    private Output<List<SelectionCondition>> conditions;

    /**
     * @return A list of conditions that you define to assign resources to your backup plans using tags.
     * 
     */
    public Output<List<SelectionCondition>> getConditions() {
        return this.conditions;
    }
    /**
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
     * 
     */
    @Export(name="iamRoleArn", type=String.class, parameters={})
    private Output<String> iamRoleArn;

    /**
     * @return The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
     * 
     */
    public Output<String> getIamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * The display name of a resource selection document.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The display name of a resource selection document.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to exclude from a backup plan.
     * 
     */
    @Export(name="notResources", type=List.class, parameters={String.class})
    private Output<List<String>> notResources;

    /**
     * @return An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to exclude from a backup plan.
     * 
     */
    public Output<List<String>> getNotResources() {
        return this.notResources;
    }
    /**
     * The backup plan ID to be associated with the selection of resources.
     * 
     */
    @Export(name="planId", type=String.class, parameters={})
    private Output<String> planId;

    /**
     * @return The backup plan ID to be associated with the selection of resources.
     * 
     */
    public Output<String> getPlanId() {
        return this.planId;
    }
    /**
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan.
     * 
     */
    @Export(name="resources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> resources;

    /**
     * @return An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan.
     * 
     */
    public Output</* @Nullable */ List<String>> getResources() {
        return this.resources;
    }
    /**
     * Tag-based conditions used to specify a set of resources to assign to a backup plan.
     * 
     */
    @Export(name="selectionTags", type=List.class, parameters={SelectionSelectionTag.class})
    private Output</* @Nullable */ List<SelectionSelectionTag>> selectionTags;

    /**
     * @return Tag-based conditions used to specify a set of resources to assign to a backup plan.
     * 
     */
    public Output</* @Nullable */ List<SelectionSelectionTag>> getSelectionTags() {
        return this.selectionTags;
    }

    public interface BuilderApplicator {
        public void apply(SelectionArgs.Builder a);
    }
    private static io.pulumi.aws.backup.SelectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.backup.SelectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Selection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Selection(String name) {
        this(name, SelectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Selection(String name, SelectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Selection(String name, SelectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/selection:Selection", name, args == null ? SelectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Selection(String name, Output<String> id, @Nullable SelectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/selection:Selection", name, state, makeResourceOptions(options, id));
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
    public static Selection get(String name, Output<String> id, @Nullable SelectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Selection(name, id, state, options);
    }
}
