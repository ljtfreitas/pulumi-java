// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final MemberArgs Empty = new MemberArgs();

    /**
     * AWS account ID for member account.
     * 
     */
    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }

    /**
     * The detector ID of the GuardDuty account where you want to create member accounts.
     * 
     */
    @Import(name="detectorId", required=true)
      private final Output<String> detectorId;

    public Output<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
     * 
     */
    @Import(name="disableEmailNotification")
      private final @Nullable Output<Boolean> disableEmailNotification;

    public Output<Boolean> getDisableEmailNotification() {
        return this.disableEmailNotification == null ? Output.empty() : this.disableEmailNotification;
    }

    /**
     * Email address for member account.
     * 
     */
    @Import(name="email", required=true)
      private final Output<String> email;

    public Output<String> getEmail() {
        return this.email;
    }

    /**
     * Message for invitation.
     * 
     */
    @Import(name="invitationMessage")
      private final @Nullable Output<String> invitationMessage;

    public Output<String> getInvitationMessage() {
        return this.invitationMessage == null ? Output.empty() : this.invitationMessage;
    }

    /**
     * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
     * 
     */
    @Import(name="invite")
      private final @Nullable Output<Boolean> invite;

    public Output<Boolean> getInvite() {
        return this.invite == null ? Output.empty() : this.invite;
    }

    public MemberArgs(
        Output<String> accountId,
        Output<String> detectorId,
        @Nullable Output<Boolean> disableEmailNotification,
        Output<String> email,
        @Nullable Output<String> invitationMessage,
        @Nullable Output<Boolean> invite) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.disableEmailNotification = disableEmailNotification;
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.invitationMessage = invitationMessage;
        this.invite = invite;
    }

    private MemberArgs() {
        this.accountId = Output.empty();
        this.detectorId = Output.empty();
        this.disableEmailNotification = Output.empty();
        this.email = Output.empty();
        this.invitationMessage = Output.empty();
        this.invite = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private Output<String> detectorId;
        private @Nullable Output<Boolean> disableEmailNotification;
        private Output<String> email;
        private @Nullable Output<String> invitationMessage;
        private @Nullable Output<Boolean> invite;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.detectorId = defaults.detectorId;
    	      this.disableEmailNotification = defaults.disableEmailNotification;
    	      this.email = defaults.email;
    	      this.invitationMessage = defaults.invitationMessage;
    	      this.invite = defaults.invite;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }

        public Builder detectorId(Output<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }

        public Builder detectorId(String detectorId) {
            this.detectorId = Output.of(Objects.requireNonNull(detectorId));
            return this;
        }

        public Builder disableEmailNotification(@Nullable Output<Boolean> disableEmailNotification) {
            this.disableEmailNotification = disableEmailNotification;
            return this;
        }

        public Builder disableEmailNotification(@Nullable Boolean disableEmailNotification) {
            this.disableEmailNotification = Output.ofNullable(disableEmailNotification);
            return this;
        }

        public Builder email(Output<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder email(String email) {
            this.email = Output.of(Objects.requireNonNull(email));
            return this;
        }

        public Builder invitationMessage(@Nullable Output<String> invitationMessage) {
            this.invitationMessage = invitationMessage;
            return this;
        }

        public Builder invitationMessage(@Nullable String invitationMessage) {
            this.invitationMessage = Output.ofNullable(invitationMessage);
            return this;
        }

        public Builder invite(@Nullable Output<Boolean> invite) {
            this.invite = invite;
            return this;
        }

        public Builder invite(@Nullable Boolean invite) {
            this.invite = Output.ofNullable(invite);
            return this;
        }
        public MemberArgs build() {
            return new MemberArgs(accountId, detectorId, disableEmailNotification, email, invitationMessage, invite);
        }
    }
}
