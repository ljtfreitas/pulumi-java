// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader {
    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader(name);
        }
    }
}
