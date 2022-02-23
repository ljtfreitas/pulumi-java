// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserPoolEmailConfiguration {
    /**
     * Email configuration set name from SES.
     * 
     */
    private final @Nullable String configurationSet;
    /**
     * Email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
     * 
     */
    private final @Nullable String emailSendingAccount;
    /**
     * Sender’s email address or sender’s display name with their email address (e.g., `john@example.com`, `John Smith <john@example.com>` or `\"John Smith Ph.D.\" <john@example.com>`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
     * 
     */
    private final @Nullable String fromEmailAddress;
    /**
     * REPLY-TO email address.
     * 
     */
    private final @Nullable String replyToEmailAddress;
    /**
     * ARN of the SES verified email identity to to use. Required if `email_sending_account` is set to `DEVELOPER`.
     * 
     */
    private final @Nullable String sourceArn;

    @OutputCustomType.Constructor({"configurationSet","emailSendingAccount","fromEmailAddress","replyToEmailAddress","sourceArn"})
    private UserPoolEmailConfiguration(
        @Nullable String configurationSet,
        @Nullable String emailSendingAccount,
        @Nullable String fromEmailAddress,
        @Nullable String replyToEmailAddress,
        @Nullable String sourceArn) {
        this.configurationSet = configurationSet;
        this.emailSendingAccount = emailSendingAccount;
        this.fromEmailAddress = fromEmailAddress;
        this.replyToEmailAddress = replyToEmailAddress;
        this.sourceArn = sourceArn;
    }

    /**
     * Email configuration set name from SES.
     * 
     */
    public Optional<String> getConfigurationSet() {
        return Optional.ofNullable(this.configurationSet);
    }
    /**
     * Email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
     * 
     */
    public Optional<String> getEmailSendingAccount() {
        return Optional.ofNullable(this.emailSendingAccount);
    }
    /**
     * Sender’s email address or sender’s display name with their email address (e.g., `john@example.com`, `John Smith <john@example.com>` or `\"John Smith Ph.D.\" <john@example.com>`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
     * 
     */
    public Optional<String> getFromEmailAddress() {
        return Optional.ofNullable(this.fromEmailAddress);
    }
    /**
     * REPLY-TO email address.
     * 
     */
    public Optional<String> getReplyToEmailAddress() {
        return Optional.ofNullable(this.replyToEmailAddress);
    }
    /**
     * ARN of the SES verified email identity to to use. Required if `email_sending_account` is set to `DEVELOPER`.
     * 
     */
    public Optional<String> getSourceArn() {
        return Optional.ofNullable(this.sourceArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolEmailConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configurationSet;
        private @Nullable String emailSendingAccount;
        private @Nullable String fromEmailAddress;
        private @Nullable String replyToEmailAddress;
        private @Nullable String sourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolEmailConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationSet = defaults.configurationSet;
    	      this.emailSendingAccount = defaults.emailSendingAccount;
    	      this.fromEmailAddress = defaults.fromEmailAddress;
    	      this.replyToEmailAddress = defaults.replyToEmailAddress;
    	      this.sourceArn = defaults.sourceArn;
        }

        public Builder setConfigurationSet(@Nullable String configurationSet) {
            this.configurationSet = configurationSet;
            return this;
        }

        public Builder setEmailSendingAccount(@Nullable String emailSendingAccount) {
            this.emailSendingAccount = emailSendingAccount;
            return this;
        }

        public Builder setFromEmailAddress(@Nullable String fromEmailAddress) {
            this.fromEmailAddress = fromEmailAddress;
            return this;
        }

        public Builder setReplyToEmailAddress(@Nullable String replyToEmailAddress) {
            this.replyToEmailAddress = replyToEmailAddress;
            return this;
        }

        public Builder setSourceArn(@Nullable String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public UserPoolEmailConfiguration build() {
            return new UserPoolEmailConfiguration(configurationSet, emailSendingAccount, fromEmailAddress, replyToEmailAddress, sourceArn);
        }
    }
}
