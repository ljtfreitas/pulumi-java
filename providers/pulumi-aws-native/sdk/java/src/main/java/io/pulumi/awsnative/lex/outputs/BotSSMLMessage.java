// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BotSSMLMessage {
    /**
     * The SSML text that defines the prompt.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private BotSSMLMessage(@CustomType.Parameter("value") String value) {
        this.value = value;
    }

    /**
     * The SSML text that defines the prompt.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSSMLMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSSMLMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public BotSSMLMessage build() {
            return new BotSSMLMessage(value);
        }
    }
}
