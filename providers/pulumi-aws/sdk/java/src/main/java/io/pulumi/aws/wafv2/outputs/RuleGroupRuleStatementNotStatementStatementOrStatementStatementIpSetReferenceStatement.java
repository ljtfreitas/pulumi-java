// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement {
    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

    @CustomType.Constructor
    private RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("ipSetForwardedIpConfig") @Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
        this.arn = arn;
        this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig> getIpSetForwardedIpConfig() {
        return Optional.ofNullable(this.ipSetForwardedIpConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder ipSetForwardedIpConfig(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement build() {
            return new RuleGroupRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement(arn, ipSetForwardedIpConfig);
        }
    }
}
