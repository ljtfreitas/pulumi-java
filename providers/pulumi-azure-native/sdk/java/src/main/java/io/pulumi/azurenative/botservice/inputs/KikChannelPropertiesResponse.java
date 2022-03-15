// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Kik channel.
 * 
 */
public final class KikChannelPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KikChannelPropertiesResponse Empty = new KikChannelPropertiesResponse();

    /**
     * Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="apiKey")
      private final @Nullable String apiKey;

    public Optional<String> getApiKey() {
        return this.apiKey == null ? Optional.empty() : Optional.ofNullable(this.apiKey);
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this channel is validated for the bot
     * 
     */
    @Import(name="isValidated")
      private final @Nullable Boolean isValidated;

    public Optional<Boolean> getIsValidated() {
        return this.isValidated == null ? Optional.empty() : Optional.ofNullable(this.isValidated);
    }

    /**
     * The Kik user name
     * 
     */
    @Import(name="userName", required=true)
      private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public KikChannelPropertiesResponse(
        @Nullable String apiKey,
        Boolean isEnabled,
        @Nullable Boolean isValidated,
        String userName) {
        this.apiKey = apiKey;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isValidated = isValidated;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private KikChannelPropertiesResponse() {
        this.apiKey = null;
        this.isEnabled = null;
        this.isValidated = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KikChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiKey;
        private Boolean isEnabled;
        private @Nullable Boolean isValidated;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(KikChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isValidated = defaults.isValidated;
    	      this.userName = defaults.userName;
        }

        public Builder apiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isValidated(@Nullable Boolean isValidated) {
            this.isValidated = isValidated;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public KikChannelPropertiesResponse build() {
            return new KikChannelPropertiesResponse(apiKey, isEnabled, isValidated, userName);
        }
    }
}
