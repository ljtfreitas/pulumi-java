// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.macie2.MemberArgs;
import io.pulumi.aws.macie2.inputs.MemberState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [Amazon Macie Member](https://docs.aws.amazon.com/macie/latest/APIReference/members-id.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_macie2_member` can be imported using the account ID of the member account, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:macie2/member:Member example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:macie2/member:Member")
public class Member extends io.pulumi.resources.CustomResource {
    /**
     * The AWS account ID for the account.
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The AWS account ID for the account.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The AWS account ID for the administrator account.
     * 
     */
    @OutputExport(name="administratorAccountId", type=String.class, parameters={})
    private Output<String> administratorAccountId;

    /**
     * @return The AWS account ID for the administrator account.
     * 
     */
    public Output<String> getAdministratorAccountId() {
        return this.administratorAccountId;
    }
    /**
     * The Amazon Resource Name (ARN) of the account.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the account.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The email address for the account.
     * 
     */
    @OutputExport(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address for the account.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
     * 
     */
    @OutputExport(name="invitationDisableEmailNotification", type=String.class, parameters={})
    private Output</* @Nullable */ String> invitationDisableEmailNotification;

    /**
     * @return Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
     * 
     */
    public Output</* @Nullable */ String> getInvitationDisableEmailNotification() {
        return this.invitationDisableEmailNotification;
    }
    /**
     * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
     * 
     */
    @OutputExport(name="invitationMessage", type=String.class, parameters={})
    private Output</* @Nullable */ String> invitationMessage;

    /**
     * @return A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
     * 
     */
    public Output</* @Nullable */ String> getInvitationMessage() {
        return this.invitationMessage;
    }
    /**
     * Send an invitation to a member
     * 
     */
    @OutputExport(name="invite", type=Boolean.class, parameters={})
    private Output<Boolean> invite;

    /**
     * @return Send an invitation to a member
     * 
     */
    public Output<Boolean> getInvite() {
        return this.invite;
    }
    /**
     * The date and time, in UTC and extended RFC 3339 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * 
     */
    @OutputExport(name="invitedAt", type=String.class, parameters={})
    private Output<String> invitedAt;

    /**
     * @return The date and time, in UTC and extended RFC 3339 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * 
     */
    public Output<String> getInvitedAt() {
        return this.invitedAt;
    }
    @OutputExport(name="masterAccountId", type=String.class, parameters={})
    private Output<String> masterAccountId;

    public Output<String> getMasterAccountId() {
        return this.masterAccountId;
    }
    /**
     * The current status of the relationship between the account and the administrator account.
     * 
     */
    @OutputExport(name="relationshipStatus", type=String.class, parameters={})
    private Output<String> relationshipStatus;

    /**
     * @return The current status of the relationship between the account and the administrator account.
     * 
     */
    public Output<String> getRelationshipStatus() {
        return this.relationshipStatus;
    }
    /**
     * Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the relationship between the account and the administrator account.
     * 
     */
    @OutputExport(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the relationship between the account and the administrator account.
     * 
     */
    public Output<String> getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Member(String name, MemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie2/member:Member", name, args == null ? MemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Member(String name, Input<String> id, @Nullable MemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie2/member:Member", name, state, makeResourceOptions(options, id));
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
