// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs Empty = new RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs();

    /**
     * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    @InputImport(name="fallbackBehavior", required=true)
    private final Input<String> fallbackBehavior;

    public Input<String> getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    /**
     * - The name of the HTTP header to use for the IP address.
     * 
     */
    @InputImport(name="headerName", required=true)
    private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    public RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs(
        Input<String> fallbackBehavior,
        Input<String> headerName) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs() {
        this.fallbackBehavior = Input.empty();
        this.headerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fallbackBehavior;
        private Input<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder setFallbackBehavior(Input<String> fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }

        public Builder setFallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Input.of(Objects.requireNonNull(fallbackBehavior));
            return this;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs(fallbackBehavior, headerName);
        }
    }
}
