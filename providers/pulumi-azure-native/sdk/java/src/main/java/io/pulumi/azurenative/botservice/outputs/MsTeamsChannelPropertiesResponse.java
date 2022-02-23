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
public final class MsTeamsChannelPropertiesResponse {
    /**
     * Whether this channel accepted terms
     * 
     */
    private final @Nullable Boolean acceptedTerms;
    /**
     * Webhook for Microsoft Teams channel calls
     * 
     */
    private final @Nullable String callingWebHook;
    /**
     * Deployment environment for Microsoft Teams channel calls
     * 
     */
    private final @Nullable String deploymentEnvironment;
    /**
     * Enable calling for Microsoft Teams channel
     * 
     */
    private final @Nullable Boolean enableCalling;
    /**
     * Webhook for Microsoft Teams channel calls
     * 
     */
    private final @Nullable String incomingCallRoute;
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    private final Boolean isEnabled;

    @OutputCustomType.Constructor({"acceptedTerms","callingWebHook","deploymentEnvironment","enableCalling","incomingCallRoute","isEnabled"})
    private MsTeamsChannelPropertiesResponse(
        @Nullable Boolean acceptedTerms,
        @Nullable String callingWebHook,
        @Nullable String deploymentEnvironment,
        @Nullable Boolean enableCalling,
        @Nullable String incomingCallRoute,
        Boolean isEnabled) {
        this.acceptedTerms = acceptedTerms;
        this.callingWebHook = callingWebHook;
        this.deploymentEnvironment = deploymentEnvironment;
        this.enableCalling = enableCalling;
        this.incomingCallRoute = incomingCallRoute;
        this.isEnabled = Objects.requireNonNull(isEnabled);
    }

    /**
     * Whether this channel accepted terms
     * 
     */
    public Optional<Boolean> getAcceptedTerms() {
        return Optional.ofNullable(this.acceptedTerms);
    }
    /**
     * Webhook for Microsoft Teams channel calls
     * 
     */
    public Optional<String> getCallingWebHook() {
        return Optional.ofNullable(this.callingWebHook);
    }
    /**
     * Deployment environment for Microsoft Teams channel calls
     * 
     */
    public Optional<String> getDeploymentEnvironment() {
        return Optional.ofNullable(this.deploymentEnvironment);
    }
    /**
     * Enable calling for Microsoft Teams channel
     * 
     */
    public Optional<Boolean> getEnableCalling() {
        return Optional.ofNullable(this.enableCalling);
    }
    /**
     * Webhook for Microsoft Teams channel calls
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

    public static Builder builder(MsTeamsChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean acceptedTerms;
        private @Nullable String callingWebHook;
        private @Nullable String deploymentEnvironment;
        private @Nullable Boolean enableCalling;
        private @Nullable String incomingCallRoute;
        private Boolean isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MsTeamsChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedTerms = defaults.acceptedTerms;
    	      this.callingWebHook = defaults.callingWebHook;
    	      this.deploymentEnvironment = defaults.deploymentEnvironment;
    	      this.enableCalling = defaults.enableCalling;
    	      this.incomingCallRoute = defaults.incomingCallRoute;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setAcceptedTerms(@Nullable Boolean acceptedTerms) {
            this.acceptedTerms = acceptedTerms;
            return this;
        }

        public Builder setCallingWebHook(@Nullable String callingWebHook) {
            this.callingWebHook = callingWebHook;
            return this;
        }

        public Builder setDeploymentEnvironment(@Nullable String deploymentEnvironment) {
            this.deploymentEnvironment = deploymentEnvironment;
            return this;
        }

        public Builder setEnableCalling(@Nullable Boolean enableCalling) {
            this.enableCalling = enableCalling;
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
        public MsTeamsChannelPropertiesResponse build() {
            return new MsTeamsChannelPropertiesResponse(acceptedTerms, callingWebHook, deploymentEnvironment, enableCalling, incomingCallRoute, isEnabled);
        }
    }
}
