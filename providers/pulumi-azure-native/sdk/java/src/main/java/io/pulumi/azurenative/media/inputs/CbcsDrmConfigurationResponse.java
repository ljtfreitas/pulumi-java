// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.StreamingPolicyFairPlayConfigurationResponse;
import io.pulumi.azurenative.media.inputs.StreamingPolicyPlayReadyConfigurationResponse;
import io.pulumi.azurenative.media.inputs.StreamingPolicyWidevineConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify DRM configurations of CommonEncryptionCbcs scheme in Streaming Policy
 * 
 */
public final class CbcsDrmConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CbcsDrmConfigurationResponse Empty = new CbcsDrmConfigurationResponse();

    /**
     * FairPlay configurations
     * 
     */
    @InputImport(name="fairPlay")
    private final @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay;

    public Optional<StreamingPolicyFairPlayConfigurationResponse> getFairPlay() {
        return this.fairPlay == null ? Optional.empty() : Optional.ofNullable(this.fairPlay);
    }

    /**
     * PlayReady configurations
     * 
     */
    @InputImport(name="playReady")
    private final @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;

    public Optional<StreamingPolicyPlayReadyConfigurationResponse> getPlayReady() {
        return this.playReady == null ? Optional.empty() : Optional.ofNullable(this.playReady);
    }

    /**
     * Widevine configurations
     * 
     */
    @InputImport(name="widevine")
    private final @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

    public Optional<StreamingPolicyWidevineConfigurationResponse> getWidevine() {
        return this.widevine == null ? Optional.empty() : Optional.ofNullable(this.widevine);
    }

    public CbcsDrmConfigurationResponse(
        @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay,
        @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady,
        @Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
        this.fairPlay = fairPlay;
        this.playReady = playReady;
        this.widevine = widevine;
    }

    private CbcsDrmConfigurationResponse() {
        this.fairPlay = null;
        this.playReady = null;
        this.widevine = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CbcsDrmConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay;
        private @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;
        private @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

        public Builder() {
    	      // Empty
        }

        public Builder(CbcsDrmConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fairPlay = defaults.fairPlay;
    	      this.playReady = defaults.playReady;
    	      this.widevine = defaults.widevine;
        }

        public Builder setFairPlay(@Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay) {
            this.fairPlay = fairPlay;
            return this;
        }

        public Builder setPlayReady(@Nullable StreamingPolicyPlayReadyConfigurationResponse playReady) {
            this.playReady = playReady;
            return this;
        }

        public Builder setWidevine(@Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
            this.widevine = widevine;
            return this;
        }

        public CbcsDrmConfigurationResponse build() {
            return new CbcsDrmConfigurationResponse(fairPlay, playReady, widevine);
        }
    }
}
