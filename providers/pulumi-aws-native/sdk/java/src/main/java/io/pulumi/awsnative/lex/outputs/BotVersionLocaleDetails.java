// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotVersionLocaleDetails {
    private final String sourceBotVersion;

    @OutputCustomType.Constructor({"sourceBotVersion"})
    private BotVersionLocaleDetails(String sourceBotVersion) {
        this.sourceBotVersion = Objects.requireNonNull(sourceBotVersion);
    }

    public String getSourceBotVersion() {
        return this.sourceBotVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotVersionLocaleDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceBotVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BotVersionLocaleDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceBotVersion = defaults.sourceBotVersion;
        }

        public Builder setSourceBotVersion(String sourceBotVersion) {
            this.sourceBotVersion = Objects.requireNonNull(sourceBotVersion);
            return this;
        }
        public BotVersionLocaleDetails build() {
            return new BotVersionLocaleDetails(sourceBotVersion);
        }
    }
}
