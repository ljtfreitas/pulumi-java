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
public final class SkypeChannelPropertiesResponse {
    /**
     * Calling web hook for Skype channel
     * 
     */
    private final @Nullable String callingWebHook;
    /**
     * Enable calling for Skype channel
     * 
     */
    private final @Nullable Boolean enableCalling;
    /**
     * Enable groups for Skype channel
     * 
     */
    private final @Nullable Boolean enableGroups;
    /**
     * Enable media cards for Skype channel
     * 
     */
    private final @Nullable Boolean enableMediaCards;
    /**
     * Enable messaging for Skype channel
     * 
     */
    private final @Nullable Boolean enableMessaging;
    /**
     * Enable screen sharing for Skype channel
     * 
     */
    private final @Nullable Boolean enableScreenSharing;
    /**
     * Enable video for Skype channel
     * 
     */
    private final @Nullable Boolean enableVideo;
    /**
     * Group mode for Skype channel
     * 
     */
    private final @Nullable String groupsMode;
    /**
     * Incoming call route for Skype channel
     * 
     */
    private final @Nullable String incomingCallRoute;
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    private final Boolean isEnabled;

    @OutputCustomType.Constructor({"callingWebHook","enableCalling","enableGroups","enableMediaCards","enableMessaging","enableScreenSharing","enableVideo","groupsMode","incomingCallRoute","isEnabled"})
    private SkypeChannelPropertiesResponse(
        @Nullable String callingWebHook,
        @Nullable Boolean enableCalling,
        @Nullable Boolean enableGroups,
        @Nullable Boolean enableMediaCards,
        @Nullable Boolean enableMessaging,
        @Nullable Boolean enableScreenSharing,
        @Nullable Boolean enableVideo,
        @Nullable String groupsMode,
        @Nullable String incomingCallRoute,
        Boolean isEnabled) {
        this.callingWebHook = callingWebHook;
        this.enableCalling = enableCalling;
        this.enableGroups = enableGroups;
        this.enableMediaCards = enableMediaCards;
        this.enableMessaging = enableMessaging;
        this.enableScreenSharing = enableScreenSharing;
        this.enableVideo = enableVideo;
        this.groupsMode = groupsMode;
        this.incomingCallRoute = incomingCallRoute;
        this.isEnabled = Objects.requireNonNull(isEnabled);
    }

    /**
     * Calling web hook for Skype channel
     * 
     */
    public Optional<String> getCallingWebHook() {
        return Optional.ofNullable(this.callingWebHook);
    }
    /**
     * Enable calling for Skype channel
     * 
     */
    public Optional<Boolean> getEnableCalling() {
        return Optional.ofNullable(this.enableCalling);
    }
    /**
     * Enable groups for Skype channel
     * 
     */
    public Optional<Boolean> getEnableGroups() {
        return Optional.ofNullable(this.enableGroups);
    }
    /**
     * Enable media cards for Skype channel
     * 
     */
    public Optional<Boolean> getEnableMediaCards() {
        return Optional.ofNullable(this.enableMediaCards);
    }
    /**
     * Enable messaging for Skype channel
     * 
     */
    public Optional<Boolean> getEnableMessaging() {
        return Optional.ofNullable(this.enableMessaging);
    }
    /**
     * Enable screen sharing for Skype channel
     * 
     */
    public Optional<Boolean> getEnableScreenSharing() {
        return Optional.ofNullable(this.enableScreenSharing);
    }
    /**
     * Enable video for Skype channel
     * 
     */
    public Optional<Boolean> getEnableVideo() {
        return Optional.ofNullable(this.enableVideo);
    }
    /**
     * Group mode for Skype channel
     * 
     */
    public Optional<String> getGroupsMode() {
        return Optional.ofNullable(this.groupsMode);
    }
    /**
     * Incoming call route for Skype channel
     * 
     */
    public Optional<String> getIncomingCallRoute() {
        return Optional.ofNullable(this.incomingCallRoute);
    }
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkypeChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String callingWebHook;
        private @Nullable Boolean enableCalling;
        private @Nullable Boolean enableGroups;
        private @Nullable Boolean enableMediaCards;
        private @Nullable Boolean enableMessaging;
        private @Nullable Boolean enableScreenSharing;
        private @Nullable Boolean enableVideo;
        private @Nullable String groupsMode;
        private @Nullable String incomingCallRoute;
        private Boolean isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SkypeChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callingWebHook = defaults.callingWebHook;
    	      this.enableCalling = defaults.enableCalling;
    	      this.enableGroups = defaults.enableGroups;
    	      this.enableMediaCards = defaults.enableMediaCards;
    	      this.enableMessaging = defaults.enableMessaging;
    	      this.enableScreenSharing = defaults.enableScreenSharing;
    	      this.enableVideo = defaults.enableVideo;
    	      this.groupsMode = defaults.groupsMode;
    	      this.incomingCallRoute = defaults.incomingCallRoute;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setCallingWebHook(@Nullable String callingWebHook) {
            this.callingWebHook = callingWebHook;
            return this;
        }

        public Builder setEnableCalling(@Nullable Boolean enableCalling) {
            this.enableCalling = enableCalling;
            return this;
        }

        public Builder setEnableGroups(@Nullable Boolean enableGroups) {
            this.enableGroups = enableGroups;
            return this;
        }

        public Builder setEnableMediaCards(@Nullable Boolean enableMediaCards) {
            this.enableMediaCards = enableMediaCards;
            return this;
        }

        public Builder setEnableMessaging(@Nullable Boolean enableMessaging) {
            this.enableMessaging = enableMessaging;
            return this;
        }

        public Builder setEnableScreenSharing(@Nullable Boolean enableScreenSharing) {
            this.enableScreenSharing = enableScreenSharing;
            return this;
        }

        public Builder setEnableVideo(@Nullable Boolean enableVideo) {
            this.enableVideo = enableVideo;
            return this;
        }

        public Builder setGroupsMode(@Nullable String groupsMode) {
            this.groupsMode = groupsMode;
            return this;
        }

        public Builder setIncomingCallRoute(@Nullable String incomingCallRoute) {
            this.incomingCallRoute = incomingCallRoute;
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public SkypeChannelPropertiesResponse build() {
            return new SkypeChannelPropertiesResponse(callingWebHook, enableCalling, enableGroups, enableMediaCards, enableMessaging, enableScreenSharing, enableVideo, groupsMode, incomingCallRoute, isEnabled);
        }
    }
}
