// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codebuild.ResourcePolicyArgs;
import io.pulumi.aws.codebuild.inputs.ResourcePolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CodeBuild Resource Policy Resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeBuild Resource Policy can be imported using the CodeBuild Resource Policy arn, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codebuild/resourcePolicy:ResourcePolicy example arn:aws:codebuild:us-west-2:123456789:report-group/report-group-name
 * ```
 * 
 */
@ResourceType(type="aws:codebuild/resourcePolicy:ResourcePolicy")
public class ResourcePolicy extends io.pulumi.resources.CustomResource {
    /**
     * A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
     * 
     */
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
     * 
     */
    @OutputExport(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
     * 
     */
    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/resourcePolicy:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourcePolicy(String name, Input<String> id, @Nullable ResourcePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/resourcePolicy:ResourcePolicy", name, state, makeResourceOptions(options, id));
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
    public static ResourcePolicy get(String name, Input<String> id, @Nullable ResourcePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, state, options);
    }
}
