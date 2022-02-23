// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope;
import io.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="invalidFallbackBehavior")
        private final @Nullable Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior;

    public Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> getInvalidFallbackBehavior() {
        return this.invalidFallbackBehavior == null ? Input.empty() : this.invalidFallbackBehavior;
    }

    /**
     * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     * 
     */
    @InputImport(name="matchPattern", required=true)
        private final Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern;

    public Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> getMatchPattern() {
        return this.matchPattern;
    }

    /**
     * The parts of the JSON to match against using the MatchPattern. If you specify All, AWS WAF matches against keys and values.
     * 
     */
    @InputImport(name="matchScope", required=true)
        private final Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope;

    public Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> getMatchScope() {
        return this.matchScope;
    }

    public LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs(
        @Nullable Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior,
        Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern,
        Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope) {
        this.invalidFallbackBehavior = invalidFallbackBehavior;
        this.matchPattern = Objects.requireNonNull(matchPattern, "expected parameter 'matchPattern' to be non-null");
        this.matchScope = Objects.requireNonNull(matchScope, "expected parameter 'matchScope' to be non-null");
    }

    private LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs() {
        this.invalidFallbackBehavior = Input.empty();
        this.matchPattern = Input.empty();
        this.matchScope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior;
        private Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern;
        private Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidFallbackBehavior = defaults.invalidFallbackBehavior;
    	      this.matchPattern = defaults.matchPattern;
    	      this.matchScope = defaults.matchScope;
        }

        public Builder setInvalidFallbackBehavior(@Nullable Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior) {
            this.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }

        public Builder setInvalidFallbackBehavior(@Nullable LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior invalidFallbackBehavior) {
            this.invalidFallbackBehavior = Input.ofNullable(invalidFallbackBehavior);
            return this;
        }

        public Builder setMatchPattern(Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern) {
            this.matchPattern = Objects.requireNonNull(matchPattern);
            return this;
        }

        public Builder setMatchPattern(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs matchPattern) {
            this.matchPattern = Input.of(Objects.requireNonNull(matchPattern));
            return this;
        }

        public Builder setMatchScope(Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope) {
            this.matchScope = Objects.requireNonNull(matchScope);
            return this;
        }

        public Builder setMatchScope(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope matchScope) {
            this.matchScope = Input.of(Objects.requireNonNull(matchScope));
            return this;
        }
        public LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs build() {
            return new LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs(invalidFallbackBehavior, matchPattern, matchScope);
        }
    }
}
