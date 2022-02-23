// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleActionAllowCustomRequestHandling;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleActionAllow {
    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    private final @Nullable RuleGroupRuleActionAllowCustomRequestHandling customRequestHandling;

    @OutputCustomType.Constructor({"customRequestHandling"})
    private RuleGroupRuleActionAllow(@Nullable RuleGroupRuleActionAllowCustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    public Optional<RuleGroupRuleActionAllowCustomRequestHandling> getCustomRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionAllow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleActionAllowCustomRequestHandling customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionAllow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable RuleGroupRuleActionAllowCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public RuleGroupRuleActionAllow build() {
            return new RuleGroupRuleActionAllow(customRequestHandling);
        }
    }
}
