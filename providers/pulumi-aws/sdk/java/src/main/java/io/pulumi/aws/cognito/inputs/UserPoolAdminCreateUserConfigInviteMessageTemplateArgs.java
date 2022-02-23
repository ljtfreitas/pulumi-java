// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolAdminCreateUserConfigInviteMessageTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolAdminCreateUserConfigInviteMessageTemplateArgs Empty = new UserPoolAdminCreateUserConfigInviteMessageTemplateArgs();

    /**
     * Email message template. Must contain the `{####}` placeholder. Conflicts with `email_verification_message` argument.
     * 
     */
    @InputImport(name="emailMessage")
    private final @Nullable Input<String> emailMessage;

    public Input<String> getEmailMessage() {
        return this.emailMessage == null ? Input.empty() : this.emailMessage;
    }

    /**
     * Subject line for the email message template. Conflicts with `email_verification_subject` argument.
     * 
     */
    @InputImport(name="emailSubject")
    private final @Nullable Input<String> emailSubject;

    public Input<String> getEmailSubject() {
        return this.emailSubject == null ? Input.empty() : this.emailSubject;
    }

    /**
     * SMS message template. Must contain the `{####}` placeholder. Conflicts with `sms_verification_message` argument.
     * 
     */
    @InputImport(name="smsMessage")
    private final @Nullable Input<String> smsMessage;

    public Input<String> getSmsMessage() {
        return this.smsMessage == null ? Input.empty() : this.smsMessage;
    }

    public UserPoolAdminCreateUserConfigInviteMessageTemplateArgs(
        @Nullable Input<String> emailMessage,
        @Nullable Input<String> emailSubject,
        @Nullable Input<String> smsMessage) {
        this.emailMessage = emailMessage;
        this.emailSubject = emailSubject;
        this.smsMessage = smsMessage;
    }

    private UserPoolAdminCreateUserConfigInviteMessageTemplateArgs() {
        this.emailMessage = Input.empty();
        this.emailSubject = Input.empty();
        this.smsMessage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAdminCreateUserConfigInviteMessageTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> emailMessage;
        private @Nullable Input<String> emailSubject;
        private @Nullable Input<String> smsMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAdminCreateUserConfigInviteMessageTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailMessage = defaults.emailMessage;
    	      this.emailSubject = defaults.emailSubject;
    	      this.smsMessage = defaults.smsMessage;
        }

        public Builder setEmailMessage(@Nullable Input<String> emailMessage) {
            this.emailMessage = emailMessage;
            return this;
        }

        public Builder setEmailMessage(@Nullable String emailMessage) {
            this.emailMessage = Input.ofNullable(emailMessage);
            return this;
        }

        public Builder setEmailSubject(@Nullable Input<String> emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }

        public Builder setEmailSubject(@Nullable String emailSubject) {
            this.emailSubject = Input.ofNullable(emailSubject);
            return this;
        }

        public Builder setSmsMessage(@Nullable Input<String> smsMessage) {
            this.smsMessage = smsMessage;
            return this;
        }

        public Builder setSmsMessage(@Nullable String smsMessage) {
            this.smsMessage = Input.ofNullable(smsMessage);
            return this;
        }
        public UserPoolAdminCreateUserConfigInviteMessageTemplateArgs build() {
            return new UserPoolAdminCreateUserConfigInviteMessageTemplateArgs(emailMessage, emailSubject, smsMessage);
        }
    }
}
