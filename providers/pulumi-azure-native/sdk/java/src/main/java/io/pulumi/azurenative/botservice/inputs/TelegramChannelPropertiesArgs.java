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
 * The parameters to provide for the Telegram channel.
 * 
 */
public final class TelegramChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TelegramChannelPropertiesArgs Empty = new TelegramChannelPropertiesArgs();

    /**
     * The Telegram access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Output<String> accessToken;

    public Output<String> getAccessToken() {
        return this.accessToken == null ? Output.empty() : this.accessToken;
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
     * Whether this channel is validated for the bot
     * 
     */
    @Import(name="isValidated")
      private final @Nullable Output<Boolean> isValidated;

    public Output<Boolean> getIsValidated() {
        return this.isValidated == null ? Output.empty() : this.isValidated;
    }

    public TelegramChannelPropertiesArgs(
        @Nullable Output<String> accessToken,
        Output<Boolean> isEnabled,
        @Nullable Output<Boolean> isValidated) {
        this.accessToken = accessToken;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isValidated = isValidated;
    }

    private TelegramChannelPropertiesArgs() {
        this.accessToken = Output.empty();
        this.isEnabled = Output.empty();
        this.isValidated = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TelegramChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessToken;
        private Output<Boolean> isEnabled;
        private @Nullable Output<Boolean> isValidated;

        public Builder() {
    	      // Empty
        }

        public Builder(TelegramChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isValidated = defaults.isValidated;
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = Output.ofNullable(accessToken);
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

        public Builder isValidated(@Nullable Output<Boolean> isValidated) {
            this.isValidated = isValidated;
            return this;
        }

        public Builder isValidated(@Nullable Boolean isValidated) {
            this.isValidated = Output.ofNullable(isValidated);
            return this;
        }
        public TelegramChannelPropertiesArgs build() {
            return new TelegramChannelPropertiesArgs(accessToken, isEnabled, isValidated);
        }
    }
}
