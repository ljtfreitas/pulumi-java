// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KikChannelPropertiesResponse {
    /**
     * Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final @Nullable String apiKey;
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    private final Boolean isEnabled;
    /**
     * Whether this channel is validated for the bot
     * 
     */
    private final @Nullable Boolean isValidated;
    /**
     * The Kik user name
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"apiKey","isEnabled","isValidated","userName"})
    private KikChannelPropertiesResponse(
        @Nullable String apiKey,
        Boolean isEnabled,
        @Nullable Boolean isValidated,
        String userName) {
        this.apiKey = apiKey;
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.isValidated = isValidated;
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public Optional<String> getApiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Whether this channel is validated for the bot
     * 
     */
    public Optional<Boolean> getIsValidated() {
        return Optional.ofNullable(this.isValidated);
    }
    /**
     * The Kik user name
     * 
     */
    public String getUserName() {
        return this.userName;
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

        public Builder setApiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsValidated(@Nullable Boolean isValidated) {
            this.isValidated = isValidated;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public KikChannelPropertiesResponse build() {
            return new KikChannelPropertiesResponse(apiKey, isEnabled, isValidated, userName);
        }
    }
}
