// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Email channel.
 * 
 */
public final class EmailChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EmailChannelPropertiesArgs Empty = new EmailChannelPropertiesArgs();

    /**
     * The email address
     * 
     */
    @Import(name="emailAddress", required=true)
      private final Output<String> emailAddress;

    public Output<String> getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The password for the email address. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    public EmailChannelPropertiesArgs(
        Output<String> emailAddress,
        Output<Boolean> isEnabled,
        @Nullable Output<String> password) {
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.password = password;
    }

    private EmailChannelPropertiesArgs() {
        this.emailAddress = Output.empty();
        this.isEnabled = Output.empty();
        this.password = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> emailAddress;
        private Output<Boolean> isEnabled;
        private @Nullable Output<String> password;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.isEnabled = defaults.isEnabled;
    	      this.password = defaults.password;
        }

        public Builder emailAddress(Output<String> emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Output.of(Objects.requireNonNull(emailAddress));
            return this;
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public EmailChannelPropertiesArgs build() {
            return new EmailChannelPropertiesArgs(emailAddress, isEnabled, password);
        }
    }
}
