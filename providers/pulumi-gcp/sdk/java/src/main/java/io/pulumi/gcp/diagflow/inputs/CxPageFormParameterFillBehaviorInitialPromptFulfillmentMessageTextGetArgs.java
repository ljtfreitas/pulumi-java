// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs Empty = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs();

    /**
     * - 
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    @Import(name="allowPlaybackInterruption")
      private final @Nullable Output<Boolean> allowPlaybackInterruption;

    public Output<Boolean> allowPlaybackInterruption() {
        return this.allowPlaybackInterruption == null ? Codegen.empty() : this.allowPlaybackInterruption;
    }

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="texts")
      private final @Nullable Output<List<String>> texts;

    public Output<List<String>> texts() {
        return this.texts == null ? Codegen.empty() : this.texts;
    }

    public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs(
        @Nullable Output<Boolean> allowPlaybackInterruption,
        @Nullable Output<List<String>> texts) {
        this.allowPlaybackInterruption = allowPlaybackInterruption;
        this.texts = texts;
    }

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs() {
        this.allowPlaybackInterruption = Codegen.empty();
        this.texts = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowPlaybackInterruption;
        private @Nullable Output<List<String>> texts;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.texts = defaults.texts;
        }

        public Builder allowPlaybackInterruption(@Nullable Output<Boolean> allowPlaybackInterruption) {
            this.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }
        public Builder allowPlaybackInterruption(@Nullable Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Codegen.ofNullable(allowPlaybackInterruption);
            return this;
        }
        public Builder texts(@Nullable Output<List<String>> texts) {
            this.texts = texts;
            return this;
        }
        public Builder texts(@Nullable List<String> texts) {
            this.texts = Codegen.ofNullable(texts);
            return this;
        }
        public Builder texts(String... texts) {
            return texts(List.of(texts));
        }        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs build() {
            return new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs(allowPlaybackInterruption, texts);
        }
    }
}
