// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.diagflow.outputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageText;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessage {
    /**
     * A collection of text responses.
     * 
     */
    private final @Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageText text;

    @OutputCustomType.Constructor({"text"})
    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessage(@Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageText text) {
        this.text = text;
    }

    /**
     * A collection of text responses.
     * 
     */
    public Optional<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageText> getText() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageText text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageText text) {
            this.text = text;
            return this;
        }
        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessage build() {
            return new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessage(text);
        }
    }
}
