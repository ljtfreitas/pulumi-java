// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.AzNsActionGroupResponse;
import io.pulumi.azurenative.insights.outputs.TriggerConditionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertingActionResponse {
    /**
     * Azure action group reference.
     * 
     */
    private final @Nullable AzNsActionGroupResponse aznsAction;
    /**
     * Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is 'Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction'.
     * 
     */
    private final String odataType;
    /**
     * Severity of the alert
     * 
     */
    private final String severity;
    /**
     * time (in minutes) for which Alerts should be throttled or suppressed.
     * 
     */
    private final @Nullable Integer throttlingInMin;
    /**
     * The trigger condition that results in the alert rule being.
     * 
     */
    private final TriggerConditionResponse trigger;

    @CustomType.Constructor
    private AlertingActionResponse(
        @CustomType.Parameter("aznsAction") @Nullable AzNsActionGroupResponse aznsAction,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("throttlingInMin") @Nullable Integer throttlingInMin,
        @CustomType.Parameter("trigger") TriggerConditionResponse trigger) {
        this.aznsAction = aznsAction;
        this.odataType = odataType;
        this.severity = severity;
        this.throttlingInMin = throttlingInMin;
        this.trigger = trigger;
    }

    /**
     * Azure action group reference.
     * 
    */
    public Optional<AzNsActionGroupResponse> getAznsAction() {
        return Optional.ofNullable(this.aznsAction);
    }
    /**
     * Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is 'Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Severity of the alert
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * time (in minutes) for which Alerts should be throttled or suppressed.
     * 
    */
    public Optional<Integer> getThrottlingInMin() {
        return Optional.ofNullable(this.throttlingInMin);
    }
    /**
     * The trigger condition that results in the alert rule being.
     * 
    */
    public TriggerConditionResponse getTrigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzNsActionGroupResponse aznsAction;
        private String odataType;
        private String severity;
        private @Nullable Integer throttlingInMin;
        private TriggerConditionResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertingActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aznsAction = defaults.aznsAction;
    	      this.odataType = defaults.odataType;
    	      this.severity = defaults.severity;
    	      this.throttlingInMin = defaults.throttlingInMin;
    	      this.trigger = defaults.trigger;
        }

        public Builder aznsAction(@Nullable AzNsActionGroupResponse aznsAction) {
            this.aznsAction = aznsAction;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder throttlingInMin(@Nullable Integer throttlingInMin) {
            this.throttlingInMin = throttlingInMin;
            return this;
        }

        public Builder trigger(TriggerConditionResponse trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }
        public AlertingActionResponse build() {
            return new AlertingActionResponse(aznsAction, odataType, severity, throttlingInMin, trigger);
        }
    }
}
