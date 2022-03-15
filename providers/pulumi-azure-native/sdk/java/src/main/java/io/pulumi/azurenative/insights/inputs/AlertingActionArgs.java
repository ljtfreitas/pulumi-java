// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.AlertSeverity;
import io.pulumi.azurenative.insights.inputs.AzNsActionGroupArgs;
import io.pulumi.azurenative.insights.inputs.TriggerConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specify action need to be taken when rule type is Alert
 * 
 */
public final class AlertingActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertingActionArgs Empty = new AlertingActionArgs();

    /**
     * Azure action group reference.
     * 
     */
    @Import(name="aznsAction")
      private final @Nullable Output<AzNsActionGroupArgs> aznsAction;

    public Output<AzNsActionGroupArgs> getAznsAction() {
        return this.aznsAction == null ? Output.empty() : this.aznsAction;
    }

    /**
     * Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is 'Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Severity of the alert
     * 
     */
    @Import(name="severity", required=true)
      private final Output<Either<String,AlertSeverity>> severity;

    public Output<Either<String,AlertSeverity>> getSeverity() {
        return this.severity;
    }

    /**
     * time (in minutes) for which Alerts should be throttled or suppressed.
     * 
     */
    @Import(name="throttlingInMin")
      private final @Nullable Output<Integer> throttlingInMin;

    public Output<Integer> getThrottlingInMin() {
        return this.throttlingInMin == null ? Output.empty() : this.throttlingInMin;
    }

    /**
     * The trigger condition that results in the alert rule being.
     * 
     */
    @Import(name="trigger", required=true)
      private final Output<TriggerConditionArgs> trigger;

    public Output<TriggerConditionArgs> getTrigger() {
        return this.trigger;
    }

    public AlertingActionArgs(
        @Nullable Output<AzNsActionGroupArgs> aznsAction,
        Output<String> odataType,
        Output<Either<String,AlertSeverity>> severity,
        @Nullable Output<Integer> throttlingInMin,
        Output<TriggerConditionArgs> trigger) {
        this.aznsAction = aznsAction;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.throttlingInMin = throttlingInMin;
        this.trigger = Objects.requireNonNull(trigger, "expected parameter 'trigger' to be non-null");
    }

    private AlertingActionArgs() {
        this.aznsAction = Output.empty();
        this.odataType = Output.empty();
        this.severity = Output.empty();
        this.throttlingInMin = Output.empty();
        this.trigger = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AzNsActionGroupArgs> aznsAction;
        private Output<String> odataType;
        private Output<Either<String,AlertSeverity>> severity;
        private @Nullable Output<Integer> throttlingInMin;
        private Output<TriggerConditionArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertingActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aznsAction = defaults.aznsAction;
    	      this.odataType = defaults.odataType;
    	      this.severity = defaults.severity;
    	      this.throttlingInMin = defaults.throttlingInMin;
    	      this.trigger = defaults.trigger;
        }

        public Builder aznsAction(@Nullable Output<AzNsActionGroupArgs> aznsAction) {
            this.aznsAction = aznsAction;
            return this;
        }

        public Builder aznsAction(@Nullable AzNsActionGroupArgs aznsAction) {
            this.aznsAction = Output.ofNullable(aznsAction);
            return this;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder severity(Output<Either<String,AlertSeverity>> severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder severity(Either<String,AlertSeverity> severity) {
            this.severity = Output.of(Objects.requireNonNull(severity));
            return this;
        }

        public Builder throttlingInMin(@Nullable Output<Integer> throttlingInMin) {
            this.throttlingInMin = throttlingInMin;
            return this;
        }

        public Builder throttlingInMin(@Nullable Integer throttlingInMin) {
            this.throttlingInMin = Output.ofNullable(throttlingInMin);
            return this;
        }

        public Builder trigger(Output<TriggerConditionArgs> trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }

        public Builder trigger(TriggerConditionArgs trigger) {
            this.trigger = Output.of(Objects.requireNonNull(trigger));
            return this;
        }
        public AlertingActionArgs build() {
            return new AlertingActionArgs(aznsAction, odataType, severity, throttlingInMin, trigger);
        }
    }
}
