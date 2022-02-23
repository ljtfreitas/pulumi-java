// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomRequestHandling;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Allow traffic towards application.
 * 
 */
public final class RuleGroupRuleActionAllowProperties extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupRuleActionAllowProperties Empty = new RuleGroupRuleActionAllowProperties();

    @InputImport(name="customRequestHandling")
        private final @Nullable RuleGroupCustomRequestHandling customRequestHandling;

    public Optional<RuleGroupCustomRequestHandling> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Optional.empty() : Optional.ofNullable(this.customRequestHandling);
    }

    public RuleGroupRuleActionAllowProperties(@Nullable RuleGroupCustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private RuleGroupRuleActionAllowProperties() {
        this.customRequestHandling = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionAllowProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupCustomRequestHandling customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionAllowProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable RuleGroupCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public RuleGroupRuleActionAllowProperties build() {
            return new RuleGroupRuleActionAllowProperties(customRequestHandling);
        }
    }
}
