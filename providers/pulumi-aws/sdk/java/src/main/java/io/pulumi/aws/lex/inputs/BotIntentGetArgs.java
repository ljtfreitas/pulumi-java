// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BotIntentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotIntentGetArgs Empty = new BotIntentGetArgs();

    /**
     * The name of the intent. Must be less than or equal to 100 characters in length.
     * 
     */
    @InputImport(name="intentName", required=true)
    private final Input<String> intentName;

    public Input<String> getIntentName() {
        return this.intentName;
    }

    /**
     * The version of the intent. Must be less than or equal to 64 characters in length.
     * 
     */
    @InputImport(name="intentVersion", required=true)
    private final Input<String> intentVersion;

    public Input<String> getIntentVersion() {
        return this.intentVersion;
    }

    public BotIntentGetArgs(
        Input<String> intentName,
        Input<String> intentVersion) {
        this.intentName = Objects.requireNonNull(intentName, "expected parameter 'intentName' to be non-null");
        this.intentVersion = Objects.requireNonNull(intentVersion, "expected parameter 'intentVersion' to be non-null");
    }

    private BotIntentGetArgs() {
        this.intentName = Input.empty();
        this.intentVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> intentName;
        private Input<String> intentVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BotIntentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intentName = defaults.intentName;
    	      this.intentVersion = defaults.intentVersion;
        }

        public Builder setIntentName(Input<String> intentName) {
            this.intentName = Objects.requireNonNull(intentName);
            return this;
        }

        public Builder setIntentName(String intentName) {
            this.intentName = Input.of(Objects.requireNonNull(intentName));
            return this;
        }

        public Builder setIntentVersion(Input<String> intentVersion) {
            this.intentVersion = Objects.requireNonNull(intentVersion);
            return this;
        }

        public Builder setIntentVersion(String intentVersion) {
            this.intentVersion = Input.of(Objects.requireNonNull(intentVersion));
            return this;
        }
        public BotIntentGetArgs build() {
            return new BotIntentGetArgs(intentName, intentVersion);
        }
    }
}