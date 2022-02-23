// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs();

    /**
     * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    @InputImport(name="countryCodes", required=true)
    private final Input<List<String>> countryCodes;

    public Input<List<String>> getCountryCodes() {
        return this.countryCodes;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    @InputImport(name="forwardedIpConfig")
    private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> getForwardedIpConfig() {
        return this.forwardedIpConfig == null ? Input.empty() : this.forwardedIpConfig;
    }

    public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs(
        Input<List<String>> countryCodes,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig) {
        this.countryCodes = Objects.requireNonNull(countryCodes, "expected parameter 'countryCodes' to be non-null");
        this.forwardedIpConfig = forwardedIpConfig;
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs() {
        this.countryCodes = Input.empty();
        this.forwardedIpConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> countryCodes;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIpConfig = defaults.forwardedIpConfig;
        }

        public Builder setCountryCodes(Input<List<String>> countryCodes) {
            this.countryCodes = Objects.requireNonNull(countryCodes);
            return this;
        }

        public Builder setCountryCodes(List<String> countryCodes) {
            this.countryCodes = Input.of(Objects.requireNonNull(countryCodes));
            return this;
        }

        public Builder setForwardedIpConfig(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }

        public Builder setForwardedIpConfig(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs forwardedIpConfig) {
            this.forwardedIpConfig = Input.ofNullable(forwardedIpConfig);
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementArgs(countryCodes, forwardedIpConfig);
        }
    }
}
