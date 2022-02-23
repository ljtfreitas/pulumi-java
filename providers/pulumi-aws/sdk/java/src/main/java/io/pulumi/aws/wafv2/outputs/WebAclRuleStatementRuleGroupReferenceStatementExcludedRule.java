// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementRuleGroupReferenceStatementExcludedRule {
    /**
     * The name of the rule to exclude. If the rule group is managed by AWS, see the [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-list.html) for a list of names in the appropriate rule group in use.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private WebAclRuleStatementRuleGroupReferenceStatementExcludedRule(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The name of the rule to exclude. If the rule group is managed by AWS, see the [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-list.html) for a list of names in the appropriate rule group in use.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRuleGroupReferenceStatementExcludedRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRuleGroupReferenceStatementExcludedRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public WebAclRuleStatementRuleGroupReferenceStatementExcludedRule build() {
            return new WebAclRuleStatementRuleGroupReferenceStatementExcludedRule(name);
        }
    }
}
