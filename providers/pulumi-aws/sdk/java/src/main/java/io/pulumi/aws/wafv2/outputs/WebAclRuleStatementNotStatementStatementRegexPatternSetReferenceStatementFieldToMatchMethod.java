// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod {
    @OutputCustomType.Constructor({})
    private WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod build() {
            return new WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod();
        }
    }
}
