// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.detective;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.detective.InvitationAccepterArgs;
import io.pulumi.aws.detective.inputs.InvitationAccepterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [Amazon Detective Invitation Accepter](https://docs.aws.amazon.com/detective/latest/APIReference/API_AcceptInvitation.html). Ensure that the accepter is configured to use the AWS account you wish to _accept_ the invitation from the primary graph owner account.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_detective_invitation_accepter` can be imported using the graph ARN, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:detective/invitationAccepter:InvitationAccepter example arn:aws:detective:us-east-1:123456789101:graph:231684d34gh74g4bae1dbc7bd807d02d
 * ```
 * 
 */
@ResourceType(type="aws:detective/invitationAccepter:InvitationAccepter")
public class InvitationAccepter extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the behavior graph that the member account is accepting the invitation for.
     * 
     */
    @Export(name="graphArn", type=String.class, parameters={})
    private Output<String> graphArn;

    /**
     * @return ARN of the behavior graph that the member account is accepting the invitation for.
     * 
     */
    public Output<String> getGraphArn() {
        return this.graphArn;
    }

    public interface BuilderApplicator {
        public void apply(InvitationAccepterArgs.Builder a);
    }
    private static io.pulumi.aws.detective.InvitationAccepterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.detective.InvitationAccepterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InvitationAccepter(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InvitationAccepter(String name) {
        this(name, InvitationAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InvitationAccepter(String name, InvitationAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InvitationAccepter(String name, InvitationAccepterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:detective/invitationAccepter:InvitationAccepter", name, args == null ? InvitationAccepterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InvitationAccepter(String name, Output<String> id, @Nullable InvitationAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:detective/invitationAccepter:InvitationAccepter", name, state, makeResourceOptions(options, id));
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
    public static InvitationAccepter get(String name, Output<String> id, @Nullable InvitationAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InvitationAccepter(name, id, state, options);
    }
}
