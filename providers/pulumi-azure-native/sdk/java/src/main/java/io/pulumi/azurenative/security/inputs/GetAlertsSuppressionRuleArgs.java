// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAlertsSuppressionRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAlertsSuppressionRuleArgs Empty = new GetAlertsSuppressionRuleArgs();

    /**
     * The unique name of the suppression alert rule
     * 
     */
    @InputImport(name="alertsSuppressionRuleName", required=true)
        private final String alertsSuppressionRuleName;

    public String getAlertsSuppressionRuleName() {
        return this.alertsSuppressionRuleName;
    }

    public GetAlertsSuppressionRuleArgs(String alertsSuppressionRuleName) {
        this.alertsSuppressionRuleName = Objects.requireNonNull(alertsSuppressionRuleName, "expected parameter 'alertsSuppressionRuleName' to be non-null");
    }

    private GetAlertsSuppressionRuleArgs() {
        this.alertsSuppressionRuleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertsSuppressionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alertsSuppressionRuleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertsSuppressionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertsSuppressionRuleName = defaults.alertsSuppressionRuleName;
        }

        public Builder setAlertsSuppressionRuleName(String alertsSuppressionRuleName) {
            this.alertsSuppressionRuleName = Objects.requireNonNull(alertsSuppressionRuleName);
            return this;
        }
        public GetAlertsSuppressionRuleArgs build() {
            return new GetAlertsSuppressionRuleArgs(alertsSuppressionRuleName);
        }
    }
}
