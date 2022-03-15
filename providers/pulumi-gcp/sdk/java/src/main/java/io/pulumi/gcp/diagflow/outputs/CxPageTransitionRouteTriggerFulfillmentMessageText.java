// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageTransitionRouteTriggerFulfillmentMessageText {
    /**
     * - 
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    private final @Nullable Boolean allowPlaybackInterruption;
    /**
     * A collection of text responses.
     * 
     */
    private final @Nullable List<String> texts;

    @CustomType.Constructor
    private CxPageTransitionRouteTriggerFulfillmentMessageText(
        @CustomType.Parameter("allowPlaybackInterruption") @Nullable Boolean allowPlaybackInterruption,
        @CustomType.Parameter("texts") @Nullable List<String> texts) {
        this.allowPlaybackInterruption = allowPlaybackInterruption;
        this.texts = texts;
    }

    /**
     * - 
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
    */
    public Optional<Boolean> getAllowPlaybackInterruption() {
        return Optional.ofNullable(this.allowPlaybackInterruption);
    }
    /**
     * A collection of text responses.
     * 
    */
    public List<String> getTexts() {
        return this.texts == null ? List.of() : this.texts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteTriggerFulfillmentMessageText defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowPlaybackInterruption;
        private @Nullable List<String> texts;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteTriggerFulfillmentMessageText defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.texts = defaults.texts;
        }

        public Builder allowPlaybackInterruption(@Nullable Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }

        public Builder texts(@Nullable List<String> texts) {
            this.texts = texts;
            return this;
        }
        public CxPageTransitionRouteTriggerFulfillmentMessageText build() {
            return new CxPageTransitionRouteTriggerFulfillmentMessageText(allowPlaybackInterruption, texts);
        }
    }
}
