// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InvitationAccepterState extends io.pulumi.resources.ResourceArgs {

    public static final InvitationAccepterState Empty = new InvitationAccepterState();

    /**
     * The AWS account ID for the account that sent the invitation.
     * 
     */
    @InputImport(name="administratorAccountId")
    private final @Nullable Input<String> administratorAccountId;

    public Input<String> getAdministratorAccountId() {
        return this.administratorAccountId == null ? Input.empty() : this.administratorAccountId;
    }

    /**
     * The unique identifier for the invitation.
     * 
     */
    @InputImport(name="invitationId")
    private final @Nullable Input<String> invitationId;

    public Input<String> getInvitationId() {
        return this.invitationId == null ? Input.empty() : this.invitationId;
    }

    public InvitationAccepterState(
        @Nullable Input<String> administratorAccountId,
        @Nullable Input<String> invitationId) {
        this.administratorAccountId = administratorAccountId;
        this.invitationId = invitationId;
    }

    private InvitationAccepterState() {
        this.administratorAccountId = Input.empty();
        this.invitationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InvitationAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> administratorAccountId;
        private @Nullable Input<String> invitationId;

        public Builder() {
    	      // Empty
        }

        public Builder(InvitationAccepterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorAccountId = defaults.administratorAccountId;
    	      this.invitationId = defaults.invitationId;
        }

        public Builder setAdministratorAccountId(@Nullable Input<String> administratorAccountId) {
            this.administratorAccountId = administratorAccountId;
            return this;
        }

        public Builder setAdministratorAccountId(@Nullable String administratorAccountId) {
            this.administratorAccountId = Input.ofNullable(administratorAccountId);
            return this;
        }

        public Builder setInvitationId(@Nullable Input<String> invitationId) {
            this.invitationId = invitationId;
            return this;
        }

        public Builder setInvitationId(@Nullable String invitationId) {
            this.invitationId = Input.ofNullable(invitationId);
            return this;
        }
        public InvitationAccepterState build() {
            return new InvitationAccepterState(administratorAccountId, invitationId);
        }
    }
}
