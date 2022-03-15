// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InvitationAccepterState extends io.pulumi.resources.ResourceArgs {

    public static final InvitationAccepterState Empty = new InvitationAccepterState();

    /**
     * The AWS account ID for the account that sent the invitation.
     * 
     */
    @Import(name="administratorAccountId")
      private final @Nullable Output<String> administratorAccountId;

    public Output<String> getAdministratorAccountId() {
        return this.administratorAccountId == null ? Output.empty() : this.administratorAccountId;
    }

    /**
     * The unique identifier for the invitation.
     * 
     */
    @Import(name="invitationId")
      private final @Nullable Output<String> invitationId;

    public Output<String> getInvitationId() {
        return this.invitationId == null ? Output.empty() : this.invitationId;
    }

    public InvitationAccepterState(
        @Nullable Output<String> administratorAccountId,
        @Nullable Output<String> invitationId) {
        this.administratorAccountId = administratorAccountId;
        this.invitationId = invitationId;
    }

    private InvitationAccepterState() {
        this.administratorAccountId = Output.empty();
        this.invitationId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InvitationAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> administratorAccountId;
        private @Nullable Output<String> invitationId;

        public Builder() {
    	      // Empty
        }

        public Builder(InvitationAccepterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorAccountId = defaults.administratorAccountId;
    	      this.invitationId = defaults.invitationId;
        }

        public Builder administratorAccountId(@Nullable Output<String> administratorAccountId) {
            this.administratorAccountId = administratorAccountId;
            return this;
        }

        public Builder administratorAccountId(@Nullable String administratorAccountId) {
            this.administratorAccountId = Output.ofNullable(administratorAccountId);
            return this;
        }

        public Builder invitationId(@Nullable Output<String> invitationId) {
            this.invitationId = invitationId;
            return this;
        }

        public Builder invitationId(@Nullable String invitationId) {
            this.invitationId = Output.ofNullable(invitationId);
            return this;
        }
        public InvitationAccepterState build() {
            return new InvitationAccepterState(administratorAccountId, invitationId);
        }
    }
}
