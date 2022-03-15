// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLBodyParsingFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.WebACLJsonMatchScope;
import io.pulumi.awsnative.wafv2.inputs.WebACLJsonMatchPattern;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inspect the request body as JSON. The request body immediately follows the request headers.
 * 
 */
public final class WebACLJsonBody extends io.pulumi.resources.InvokeArgs {

    public static final WebACLJsonBody Empty = new WebACLJsonBody();

    @Import(name="invalidFallbackBehavior")
      private final @Nullable WebACLBodyParsingFallbackBehavior invalidFallbackBehavior;

    public Optional<WebACLBodyParsingFallbackBehavior> getInvalidFallbackBehavior() {
        return this.invalidFallbackBehavior == null ? Optional.empty() : Optional.ofNullable(this.invalidFallbackBehavior);
    }

    @Import(name="matchPattern", required=true)
      private final WebACLJsonMatchPattern matchPattern;

    public WebACLJsonMatchPattern getMatchPattern() {
        return this.matchPattern;
    }

    @Import(name="matchScope", required=true)
      private final WebACLJsonMatchScope matchScope;

    public WebACLJsonMatchScope getMatchScope() {
        return this.matchScope;
    }

    public WebACLJsonBody(
        @Nullable WebACLBodyParsingFallbackBehavior invalidFallbackBehavior,
        WebACLJsonMatchPattern matchPattern,
        WebACLJsonMatchScope matchScope) {
        this.invalidFallbackBehavior = invalidFallbackBehavior;
        this.matchPattern = Objects.requireNonNull(matchPattern, "expected parameter 'matchPattern' to be non-null");
        this.matchScope = Objects.requireNonNull(matchScope, "expected parameter 'matchScope' to be non-null");
    }

    private WebACLJsonBody() {
        this.invalidFallbackBehavior = null;
        this.matchPattern = null;
        this.matchScope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLJsonBody defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLBodyParsingFallbackBehavior invalidFallbackBehavior;
        private WebACLJsonMatchPattern matchPattern;
        private WebACLJsonMatchScope matchScope;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLJsonBody defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidFallbackBehavior = defaults.invalidFallbackBehavior;
    	      this.matchPattern = defaults.matchPattern;
    	      this.matchScope = defaults.matchScope;
        }

        public Builder invalidFallbackBehavior(@Nullable WebACLBodyParsingFallbackBehavior invalidFallbackBehavior) {
            this.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }

        public Builder matchPattern(WebACLJsonMatchPattern matchPattern) {
            this.matchPattern = Objects.requireNonNull(matchPattern);
            return this;
        }

        public Builder matchScope(WebACLJsonMatchScope matchScope) {
            this.matchScope = Objects.requireNonNull(matchScope);
            return this;
        }
        public WebACLJsonBody build() {
            return new WebACLJsonBody(invalidFallbackBehavior, matchPattern, matchScope);
        }
    }
}
