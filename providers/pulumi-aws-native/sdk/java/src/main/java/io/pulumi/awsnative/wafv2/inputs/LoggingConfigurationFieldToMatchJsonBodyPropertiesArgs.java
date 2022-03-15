// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope;
import io.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.
 * 
 */
public final class LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs Empty = new LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs();

    /**
     * What AWS WAF should do if it fails to completely parse the JSON body.
     * 
     */
    @Import(name="invalidFallbackBehavior")
      private final @Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior;

    public Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> getInvalidFallbackBehavior() {
        return this.invalidFallbackBehavior == null ? Output.empty() : this.invalidFallbackBehavior;
    }

    /**
     * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     * 
     */
    @Import(name="matchPattern", required=true)
      private final Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern;

    public Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> getMatchPattern() {
        return this.matchPattern;
    }

    /**
     * The parts of the JSON to match against using the MatchPattern. If you specify All, AWS WAF matches against keys and values.
     * 
     */
    @Import(name="matchScope", required=true)
      private final Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope;

    public Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> getMatchScope() {
        return this.matchScope;
    }

    public LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs(
        @Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior,
        Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern,
        Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope) {
        this.invalidFallbackBehavior = invalidFallbackBehavior;
        this.matchPattern = Objects.requireNonNull(matchPattern, "expected parameter 'matchPattern' to be non-null");
        this.matchScope = Objects.requireNonNull(matchScope, "expected parameter 'matchScope' to be non-null");
    }

    private LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs() {
        this.invalidFallbackBehavior = Output.empty();
        this.matchPattern = Output.empty();
        this.matchScope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior;
        private Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern;
        private Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidFallbackBehavior = defaults.invalidFallbackBehavior;
    	      this.matchPattern = defaults.matchPattern;
    	      this.matchScope = defaults.matchScope;
        }

        public Builder invalidFallbackBehavior(@Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior) {
            this.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }

        public Builder invalidFallbackBehavior(@Nullable LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior invalidFallbackBehavior) {
            this.invalidFallbackBehavior = Output.ofNullable(invalidFallbackBehavior);
            return this;
        }

        public Builder matchPattern(Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern) {
            this.matchPattern = Objects.requireNonNull(matchPattern);
            return this;
        }

        public Builder matchPattern(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs matchPattern) {
            this.matchPattern = Output.of(Objects.requireNonNull(matchPattern));
            return this;
        }

        public Builder matchScope(Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope) {
            this.matchScope = Objects.requireNonNull(matchScope);
            return this;
        }

        public Builder matchScope(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope matchScope) {
            this.matchScope = Output.of(Objects.requireNonNull(matchScope));
            return this;
        }
        public LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs build() {
            return new LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs(invalidFallbackBehavior, matchPattern, matchScope);
        }
    }
}
