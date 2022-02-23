// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Settings for using an Amazon Polly voice to communicate with a user.
 * 
 */
public final class BotVoiceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotVoiceSettingsArgs Empty = new BotVoiceSettingsArgs();

    /**
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * 
     */
    @InputImport(name="voiceId", required=true)
        private final Input<String> voiceId;

    public Input<String> getVoiceId() {
        return this.voiceId;
    }

    public BotVoiceSettingsArgs(Input<String> voiceId) {
        this.voiceId = Objects.requireNonNull(voiceId, "expected parameter 'voiceId' to be non-null");
    }

    private BotVoiceSettingsArgs() {
        this.voiceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotVoiceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> voiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotVoiceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.voiceId = defaults.voiceId;
        }

        public Builder setVoiceId(Input<String> voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId);
            return this;
        }

        public Builder setVoiceId(String voiceId) {
            this.voiceId = Input.of(Objects.requireNonNull(voiceId));
            return this;
        }
        public BotVoiceSettingsArgs build() {
            return new BotVoiceSettingsArgs(voiceId);
        }
    }
}
