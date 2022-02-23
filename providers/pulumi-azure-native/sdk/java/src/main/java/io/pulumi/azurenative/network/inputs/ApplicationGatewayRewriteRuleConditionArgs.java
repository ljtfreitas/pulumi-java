// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set of conditions in the Rewrite Rule in Application Gateway.
 * 
 */
public final class ApplicationGatewayRewriteRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayRewriteRuleConditionArgs Empty = new ApplicationGatewayRewriteRuleConditionArgs();

    /**
     * Setting this parameter to truth value with force the pattern to do a case in-sensitive comparison.
     * 
     */
    @InputImport(name="ignoreCase")
        private final @Nullable Input<Boolean> ignoreCase;

    public Input<Boolean> getIgnoreCase() {
        return this.ignoreCase == null ? Input.empty() : this.ignoreCase;
    }

    /**
     * Setting this value as truth will force to check the negation of the condition given by the user.
     * 
     */
    @InputImport(name="negate")
        private final @Nullable Input<Boolean> negate;

    public Input<Boolean> getNegate() {
        return this.negate == null ? Input.empty() : this.negate;
    }

    /**
     * The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
     */
    @InputImport(name="pattern")
        private final @Nullable Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern == null ? Input.empty() : this.pattern;
    }

    /**
     * The condition parameter of the RewriteRuleCondition.
     * 
     */
    @InputImport(name="variable")
        private final @Nullable Input<String> variable;

    public Input<String> getVariable() {
        return this.variable == null ? Input.empty() : this.variable;
    }

    public ApplicationGatewayRewriteRuleConditionArgs(
        @Nullable Input<Boolean> ignoreCase,
        @Nullable Input<Boolean> negate,
        @Nullable Input<String> pattern,
        @Nullable Input<String> variable) {
        this.ignoreCase = ignoreCase;
        this.negate = negate;
        this.pattern = pattern;
        this.variable = variable;
    }

    private ApplicationGatewayRewriteRuleConditionArgs() {
        this.ignoreCase = Input.empty();
        this.negate = Input.empty();
        this.pattern = Input.empty();
        this.variable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> ignoreCase;
        private @Nullable Input<Boolean> negate;
        private @Nullable Input<String> pattern;
        private @Nullable Input<String> variable;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.negate = defaults.negate;
    	      this.pattern = defaults.pattern;
    	      this.variable = defaults.variable;
        }

        public Builder setIgnoreCase(@Nullable Input<Boolean> ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        public Builder setIgnoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = Input.ofNullable(ignoreCase);
            return this;
        }

        public Builder setNegate(@Nullable Input<Boolean> negate) {
            this.negate = negate;
            return this;
        }

        public Builder setNegate(@Nullable Boolean negate) {
            this.negate = Input.ofNullable(negate);
            return this;
        }

        public Builder setPattern(@Nullable Input<String> pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setPattern(@Nullable String pattern) {
            this.pattern = Input.ofNullable(pattern);
            return this;
        }

        public Builder setVariable(@Nullable Input<String> variable) {
            this.variable = variable;
            return this;
        }

        public Builder setVariable(@Nullable String variable) {
            this.variable = Input.ofNullable(variable);
            return this;
        }
        public ApplicationGatewayRewriteRuleConditionArgs build() {
            return new ApplicationGatewayRewriteRuleConditionArgs(ignoreCase, negate, pattern, variable);
        }
    }
}
