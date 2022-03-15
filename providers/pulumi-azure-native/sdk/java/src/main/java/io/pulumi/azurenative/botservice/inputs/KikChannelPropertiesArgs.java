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
 * The parameters to provide for the Kik channel.
 * 
 */
public final class KikChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KikChannelPropertiesArgs Empty = new KikChannelPropertiesArgs();

    /**
     * Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="apiKey")
      private final @Nullable Output<String> apiKey;

    public Output<String> getApiKey() {
        return this.apiKey == null ? Output.empty() : this.apiKey;
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

    /**
     * The Kik user name
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public KikChannelPropertiesArgs(
        @Nullable Output<String> apiKey,
        Output<Boolean> isEnabled,
        @Nullable Output<Boolean> isValidated,
        Output<String> userName) {
        this.apiKey = apiKey;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isValidated = isValidated;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private KikChannelPropertiesArgs() {
        this.apiKey = Output.empty();
        this.isEnabled = Output.empty();
        this.isValidated = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KikChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiKey;
        private Output<Boolean> isEnabled;
        private @Nullable Output<Boolean> isValidated;
        private Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(KikChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isValidated = defaults.isValidated;
    	      this.userName = defaults.userName;
        }

        public Builder apiKey(@Nullable Output<String> apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(@Nullable String apiKey) {
            this.apiKey = Output.ofNullable(apiKey);
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

        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }
        public KikChannelPropertiesArgs build() {
            return new KikChannelPropertiesArgs(apiKey, isEnabled, isValidated, userName);
        }
    }
}
