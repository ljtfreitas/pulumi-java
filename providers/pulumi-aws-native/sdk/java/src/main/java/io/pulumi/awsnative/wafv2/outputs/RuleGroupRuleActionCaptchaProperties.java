// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupCustomRequestHandling;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleActionCaptchaProperties {
    private final @Nullable RuleGroupCustomRequestHandling customRequestHandling;

    @OutputCustomType.Constructor({"customRequestHandling"})
    private RuleGroupRuleActionCaptchaProperties(@Nullable RuleGroupCustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    public Optional<RuleGroupCustomRequestHandling> getCustomRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCaptchaProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupCustomRequestHandling customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCaptchaProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable RuleGroupCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public RuleGroupRuleActionCaptchaProperties build() {
            return new RuleGroupRuleActionCaptchaProperties(customRequestHandling);
        }
    }
}
