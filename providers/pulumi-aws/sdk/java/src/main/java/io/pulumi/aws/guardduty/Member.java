// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.guardduty.MemberArgs;
import io.pulumi.aws.guardduty.inputs.MemberState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a GuardDuty member. To accept invitations in member accounts, see the `aws.guardduty.InviteAccepter` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GuardDuty members can be imported using the the primary GuardDuty detector ID and member AWS account ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/member:Member MyMember 00b00fd5aecc0ab60a708659477e9617:123456789012
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/member:Member")
public class Member extends io.pulumi.resources.CustomResource {
    /**
     * AWS account ID for member account.
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return AWS account ID for member account.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The detector ID of the GuardDuty account where you want to create member accounts.
     * 
     */
    @OutputExport(name="detectorId", type=String.class, parameters={})
    private Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty account where you want to create member accounts.
     * 
     */
    public Output<String> getDetectorId() {
        return this.detectorId;
    }
    /**
     * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
     * 
     */
    @OutputExport(name="disableEmailNotification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableEmailNotification;

    /**
     * @return Boolean whether an email notification is sent to the accounts. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableEmailNotification() {
        return this.disableEmailNotification;
    }
    /**
     * Email address for member account.
     * 
     */
    @OutputExport(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return Email address for member account.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * Message for invitation.
     * 
     */
    @OutputExport(name="invitationMessage", type=String.class, parameters={})
    private Output</* @Nullable */ String> invitationMessage;

    /**
     * @return Message for invitation.
     * 
     */
    public Output</* @Nullable */ String> getInvitationMessage() {
        return this.invitationMessage;
    }
    /**
     * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
     * 
     */
    @OutputExport(name="invite", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> invite;

    /**
     * @return Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
     * 
     */
    public Output</* @Nullable */ Boolean> getInvite() {
        return this.invite;
    }
    /**
     * The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
     * 
     */
    @OutputExport(name="relationshipStatus", type=String.class, parameters={})
    private Output<String> relationshipStatus;

    /**
     * @return The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
     * 
     */
    public Output<String> getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Member(String name, MemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/member:Member", name, args == null ? MemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Member(String name, Input<String> id, @Nullable MemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/member:Member", name, state, makeResourceOptions(options, id));
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
    public static Member get(String name, Input<String> id, @Nullable MemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Member(name, id, state, options);
    }
}
