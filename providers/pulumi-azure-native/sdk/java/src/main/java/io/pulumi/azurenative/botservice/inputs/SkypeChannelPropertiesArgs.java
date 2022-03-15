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
 * The parameters to provide for the Microsoft Teams channel.
 * 
 */
public final class SkypeChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkypeChannelPropertiesArgs Empty = new SkypeChannelPropertiesArgs();

    /**
     * Calling web hook for Skype channel
     * 
     */
    @Import(name="callingWebHook")
      private final @Nullable Output<String> callingWebHook;

    public Output<String> getCallingWebHook() {
        return this.callingWebHook == null ? Output.empty() : this.callingWebHook;
    }

    /**
     * Enable calling for Skype channel
     * 
     */
    @Import(name="enableCalling")
      private final @Nullable Output<Boolean> enableCalling;

    public Output<Boolean> getEnableCalling() {
        return this.enableCalling == null ? Output.empty() : this.enableCalling;
    }

    /**
     * Enable groups for Skype channel
     * 
     */
    @Import(name="enableGroups")
      private final @Nullable Output<Boolean> enableGroups;

    public Output<Boolean> getEnableGroups() {
        return this.enableGroups == null ? Output.empty() : this.enableGroups;
    }

    /**
     * Enable media cards for Skype channel
     * 
     */
    @Import(name="enableMediaCards")
      private final @Nullable Output<Boolean> enableMediaCards;

    public Output<Boolean> getEnableMediaCards() {
        return this.enableMediaCards == null ? Output.empty() : this.enableMediaCards;
    }

    /**
     * Enable messaging for Skype channel
     * 
     */
    @Import(name="enableMessaging")
      private final @Nullable Output<Boolean> enableMessaging;

    public Output<Boolean> getEnableMessaging() {
        return this.enableMessaging == null ? Output.empty() : this.enableMessaging;
    }

    /**
     * Enable screen sharing for Skype channel
     * 
     */
    @Import(name="enableScreenSharing")
      private final @Nullable Output<Boolean> enableScreenSharing;

    public Output<Boolean> getEnableScreenSharing() {
        return this.enableScreenSharing == null ? Output.empty() : this.enableScreenSharing;
    }

    /**
     * Enable video for Skype channel
     * 
     */
    @Import(name="enableVideo")
      private final @Nullable Output<Boolean> enableVideo;

    public Output<Boolean> getEnableVideo() {
        return this.enableVideo == null ? Output.empty() : this.enableVideo;
    }

    /**
     * Group mode for Skype channel
     * 
     */
    @Import(name="groupsMode")
      private final @Nullable Output<String> groupsMode;

    public Output<String> getGroupsMode() {
        return this.groupsMode == null ? Output.empty() : this.groupsMode;
    }

    /**
     * Incoming call route for Skype channel
     * 
     */
    @Import(name="incomingCallRoute")
      private final @Nullable Output<String> incomingCallRoute;

    public Output<String> getIncomingCallRoute() {
        return this.incomingCallRoute == null ? Output.empty() : this.incomingCallRoute;
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

    public SkypeChannelPropertiesArgs(
        @Nullable Output<String> callingWebHook,
        @Nullable Output<Boolean> enableCalling,
        @Nullable Output<Boolean> enableGroups,
        @Nullable Output<Boolean> enableMediaCards,
        @Nullable Output<Boolean> enableMessaging,
        @Nullable Output<Boolean> enableScreenSharing,
        @Nullable Output<Boolean> enableVideo,
        @Nullable Output<String> groupsMode,
        @Nullable Output<String> incomingCallRoute,
        Output<Boolean> isEnabled) {
        this.callingWebHook = callingWebHook;
        this.enableCalling = enableCalling;
        this.enableGroups = enableGroups;
        this.enableMediaCards = enableMediaCards;
        this.enableMessaging = enableMessaging;
        this.enableScreenSharing = enableScreenSharing;
        this.enableVideo = enableVideo;
        this.groupsMode = groupsMode;
        this.incomingCallRoute = incomingCallRoute;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
    }

    private SkypeChannelPropertiesArgs() {
        this.callingWebHook = Output.empty();
        this.enableCalling = Output.empty();
        this.enableGroups = Output.empty();
        this.enableMediaCards = Output.empty();
        this.enableMessaging = Output.empty();
        this.enableScreenSharing = Output.empty();
        this.enableVideo = Output.empty();
        this.groupsMode = Output.empty();
        this.incomingCallRoute = Output.empty();
        this.isEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkypeChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> callingWebHook;
        private @Nullable Output<Boolean> enableCalling;
        private @Nullable Output<Boolean> enableGroups;
        private @Nullable Output<Boolean> enableMediaCards;
        private @Nullable Output<Boolean> enableMessaging;
        private @Nullable Output<Boolean> enableScreenSharing;
        private @Nullable Output<Boolean> enableVideo;
        private @Nullable Output<String> groupsMode;
        private @Nullable Output<String> incomingCallRoute;
        private Output<Boolean> isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SkypeChannelPropertiesArgs defaults) {
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

        public Builder callingWebHook(@Nullable Output<String> callingWebHook) {
            this.callingWebHook = callingWebHook;
            return this;
        }

        public Builder callingWebHook(@Nullable String callingWebHook) {
            this.callingWebHook = Output.ofNullable(callingWebHook);
            return this;
        }

        public Builder enableCalling(@Nullable Output<Boolean> enableCalling) {
            this.enableCalling = enableCalling;
            return this;
        }

        public Builder enableCalling(@Nullable Boolean enableCalling) {
            this.enableCalling = Output.ofNullable(enableCalling);
            return this;
        }

        public Builder enableGroups(@Nullable Output<Boolean> enableGroups) {
            this.enableGroups = enableGroups;
            return this;
        }

        public Builder enableGroups(@Nullable Boolean enableGroups) {
            this.enableGroups = Output.ofNullable(enableGroups);
            return this;
        }

        public Builder enableMediaCards(@Nullable Output<Boolean> enableMediaCards) {
            this.enableMediaCards = enableMediaCards;
            return this;
        }

        public Builder enableMediaCards(@Nullable Boolean enableMediaCards) {
            this.enableMediaCards = Output.ofNullable(enableMediaCards);
            return this;
        }

        public Builder enableMessaging(@Nullable Output<Boolean> enableMessaging) {
            this.enableMessaging = enableMessaging;
            return this;
        }

        public Builder enableMessaging(@Nullable Boolean enableMessaging) {
            this.enableMessaging = Output.ofNullable(enableMessaging);
            return this;
        }

        public Builder enableScreenSharing(@Nullable Output<Boolean> enableScreenSharing) {
            this.enableScreenSharing = enableScreenSharing;
            return this;
        }

        public Builder enableScreenSharing(@Nullable Boolean enableScreenSharing) {
            this.enableScreenSharing = Output.ofNullable(enableScreenSharing);
            return this;
        }

        public Builder enableVideo(@Nullable Output<Boolean> enableVideo) {
            this.enableVideo = enableVideo;
            return this;
        }

        public Builder enableVideo(@Nullable Boolean enableVideo) {
            this.enableVideo = Output.ofNullable(enableVideo);
            return this;
        }

        public Builder groupsMode(@Nullable Output<String> groupsMode) {
            this.groupsMode = groupsMode;
            return this;
        }

        public Builder groupsMode(@Nullable String groupsMode) {
            this.groupsMode = Output.ofNullable(groupsMode);
            return this;
        }

        public Builder incomingCallRoute(@Nullable Output<String> incomingCallRoute) {
            this.incomingCallRoute = incomingCallRoute;
            return this;
        }

        public Builder incomingCallRoute(@Nullable String incomingCallRoute) {
            this.incomingCallRoute = Output.ofNullable(incomingCallRoute);
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
        public SkypeChannelPropertiesArgs build() {
            return new SkypeChannelPropertiesArgs(callingWebHook, enableCalling, enableGroups, enableMediaCards, enableMessaging, enableScreenSharing, enableVideo, groupsMode, incomingCallRoute, isEnabled);
        }
    }
}
