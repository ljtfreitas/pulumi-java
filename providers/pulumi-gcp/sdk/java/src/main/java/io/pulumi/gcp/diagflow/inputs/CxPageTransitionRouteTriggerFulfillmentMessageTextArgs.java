// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageTransitionRouteTriggerFulfillmentMessageTextArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageTransitionRouteTriggerFulfillmentMessageTextArgs Empty = new CxPageTransitionRouteTriggerFulfillmentMessageTextArgs();

    /**
     * - 
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    @InputImport(name="allowPlaybackInterruption")
        private final @Nullable Input<Boolean> allowPlaybackInterruption;

    public Input<Boolean> getAllowPlaybackInterruption() {
        return this.allowPlaybackInterruption == null ? Input.empty() : this.allowPlaybackInterruption;
    }

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="texts")
        private final @Nullable Input<List<String>> texts;

    public Input<List<String>> getTexts() {
        return this.texts == null ? Input.empty() : this.texts;
    }

    public CxPageTransitionRouteTriggerFulfillmentMessageTextArgs(
        @Nullable Input<Boolean> allowPlaybackInterruption,
        @Nullable Input<List<String>> texts) {
        this.allowPlaybackInterruption = allowPlaybackInterruption;
        this.texts = texts;
    }

    private CxPageTransitionRouteTriggerFulfillmentMessageTextArgs() {
        this.allowPlaybackInterruption = Input.empty();
        this.texts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteTriggerFulfillmentMessageTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowPlaybackInterruption;
        private @Nullable Input<List<String>> texts;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteTriggerFulfillmentMessageTextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.texts = defaults.texts;
        }

        public Builder setAllowPlaybackInterruption(@Nullable Input<Boolean> allowPlaybackInterruption) {
            this.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }

        public Builder setAllowPlaybackInterruption(@Nullable Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Input.ofNullable(allowPlaybackInterruption);
            return this;
        }

        public Builder setTexts(@Nullable Input<List<String>> texts) {
            this.texts = texts;
            return this;
        }

        public Builder setTexts(@Nullable List<String> texts) {
            this.texts = Input.ofNullable(texts);
            return this;
        }
        public CxPageTransitionRouteTriggerFulfillmentMessageTextArgs build() {
            return new CxPageTransitionRouteTriggerFulfillmentMessageTextArgs(allowPlaybackInterruption, texts);
        }
    }
}
