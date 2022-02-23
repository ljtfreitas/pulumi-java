// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.securityhub.InviteAccepterArgs;
import io.pulumi.aws.securityhub.inputs.InviteAccepterState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * > **Note:** AWS accounts can only be associated with a single Security Hub master account. Destroying this resource will disassociate the member account from the master account.
 * 
 * Accepts a Security Hub invitation.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Security Hub invite acceptance can be imported using the account ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/inviteAccepter:InviteAccepter example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/inviteAccepter:InviteAccepter")
public class InviteAccepter extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the invitation.
     * 
     */
    @OutputExport(name="invitationId", type=String.class, parameters={})
    private Output<String> invitationId;

    /**
     * @return The ID of the invitation.
     * 
     */
    public Output<String> getInvitationId() {
        return this.invitationId;
    }
    /**
     * The account ID of the master Security Hub account whose invitation you're accepting.
     * 
     */
    @OutputExport(name="masterId", type=String.class, parameters={})
    private Output<String> masterId;

    /**
     * @return The account ID of the master Security Hub account whose invitation you're accepting.
     * 
     */
    public Output<String> getMasterId() {
        return this.masterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InviteAccepter(String name, InviteAccepterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/inviteAccepter:InviteAccepter", name, args == null ? InviteAccepterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InviteAccepter(String name, Input<String> id, @Nullable InviteAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/inviteAccepter:InviteAccepter", name, state, makeResourceOptions(options, id));
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
    public static InviteAccepter get(String name, Input<String> id, @Nullable InviteAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InviteAccepter(name, id, state, options);
    }
}
