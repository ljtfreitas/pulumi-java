// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.macie2.InvitationAccepterArgs;
import io.pulumi.aws.macie2.inputs.InvitationAccepterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [Amazon Macie Invitation Accepter](https://docs.aws.amazon.com/macie/latest/APIReference/invitations-accept.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_macie2_invitation_accepter` can be imported using the admin account ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:macie2/invitationAccepter:InvitationAccepter example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:macie2/invitationAccepter:InvitationAccepter")
public class InvitationAccepter extends io.pulumi.resources.CustomResource {
    /**
     * The AWS account ID for the account that sent the invitation.
     * 
     */
    @Export(name="administratorAccountId", type=String.class, parameters={})
    private Output<String> administratorAccountId;

    /**
     * @return The AWS account ID for the account that sent the invitation.
     * 
     */
    public Output<String> getAdministratorAccountId() {
        return this.administratorAccountId;
    }
    /**
     * The unique identifier for the invitation.
     * 
     */
    @Export(name="invitationId", type=String.class, parameters={})
    private Output<String> invitationId;

    /**
     * @return The unique identifier for the invitation.
     * 
     */
    public Output<String> getInvitationId() {
        return this.invitationId;
    }

    public interface BuilderApplicator {
        public void apply(InvitationAccepterArgs.Builder a);
    }
    private static io.pulumi.aws.macie2.InvitationAccepterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.macie2.InvitationAccepterArgs.builder();
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
        super("aws:macie2/invitationAccepter:InvitationAccepter", name, args == null ? InvitationAccepterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InvitationAccepter(String name, Output<String> id, @Nullable InvitationAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie2/invitationAccepter:InvitationAccepter", name, state, makeResourceOptions(options, id));
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
