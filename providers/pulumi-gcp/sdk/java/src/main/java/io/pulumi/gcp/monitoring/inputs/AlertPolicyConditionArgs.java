// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMatchedLogArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionArgs Empty = new AlertPolicyConditionArgs();

    /**
     * A condition that checks that a time series
     * continues to receive new data points.
     * Structure is documented below.
     * 
     */
    @Import(name="conditionAbsent")
      private final @Nullable Output<AlertPolicyConditionConditionAbsentArgs> conditionAbsent;

    public Output<AlertPolicyConditionConditionAbsentArgs> conditionAbsent() {
        return this.conditionAbsent == null ? Codegen.empty() : this.conditionAbsent;
    }

    /**
     * A condition that checks for log messages matching given constraints.
     * If set, no other conditions can be present.
     * Structure is documented below.
     * 
     */
    @Import(name="conditionMatchedLog")
      private final @Nullable Output<AlertPolicyConditionConditionMatchedLogArgs> conditionMatchedLog;

    public Output<AlertPolicyConditionConditionMatchedLogArgs> conditionMatchedLog() {
        return this.conditionMatchedLog == null ? Codegen.empty() : this.conditionMatchedLog;
    }

    /**
     * A Monitoring Query Language query that outputs a boolean stream
     * Structure is documented below.
     * 
     */
    @Import(name="conditionMonitoringQueryLanguage")
      private final @Nullable Output<AlertPolicyConditionConditionMonitoringQueryLanguageArgs> conditionMonitoringQueryLanguage;

    public Output<AlertPolicyConditionConditionMonitoringQueryLanguageArgs> conditionMonitoringQueryLanguage() {
        return this.conditionMonitoringQueryLanguage == null ? Codegen.empty() : this.conditionMonitoringQueryLanguage;
    }

    /**
     * A condition that compares a time series against a
     * threshold.
     * Structure is documented below.
     * 
     */
    @Import(name="conditionThreshold")
      private final @Nullable Output<AlertPolicyConditionConditionThresholdArgs> conditionThreshold;

    public Output<AlertPolicyConditionConditionThresholdArgs> conditionThreshold() {
        return this.conditionThreshold == null ? Codegen.empty() : this.conditionThreshold;
    }

    /**
     * A short name or phrase used to identify the
     * condition in dashboards, notifications, and
     * incidents. To avoid confusion, don't use the same
     * display name for multiple conditions in the same
     * policy.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * - 
     * The unique resource name for this condition.
     * Its syntax is:
     * projects/[PROJECT_ID]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
     * [CONDITION_ID] is assigned by Stackdriver Monitoring when
     * the condition is created as part of a new or updated alerting
     * policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public AlertPolicyConditionArgs(
        @Nullable Output<AlertPolicyConditionConditionAbsentArgs> conditionAbsent,
        @Nullable Output<AlertPolicyConditionConditionMatchedLogArgs> conditionMatchedLog,
        @Nullable Output<AlertPolicyConditionConditionMonitoringQueryLanguageArgs> conditionMonitoringQueryLanguage,
        @Nullable Output<AlertPolicyConditionConditionThresholdArgs> conditionThreshold,
        Output<String> displayName,
        @Nullable Output<String> name) {
        this.conditionAbsent = conditionAbsent;
        this.conditionMatchedLog = conditionMatchedLog;
        this.conditionMonitoringQueryLanguage = conditionMonitoringQueryLanguage;
        this.conditionThreshold = conditionThreshold;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.name = name;
    }

    private AlertPolicyConditionArgs() {
        this.conditionAbsent = Codegen.empty();
        this.conditionMatchedLog = Codegen.empty();
        this.conditionMonitoringQueryLanguage = Codegen.empty();
        this.conditionThreshold = Codegen.empty();
        this.displayName = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AlertPolicyConditionConditionAbsentArgs> conditionAbsent;
        private @Nullable Output<AlertPolicyConditionConditionMatchedLogArgs> conditionMatchedLog;
        private @Nullable Output<AlertPolicyConditionConditionMonitoringQueryLanguageArgs> conditionMonitoringQueryLanguage;
        private @Nullable Output<AlertPolicyConditionConditionThresholdArgs> conditionThreshold;
        private Output<String> displayName;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionAbsent = defaults.conditionAbsent;
    	      this.conditionMatchedLog = defaults.conditionMatchedLog;
    	      this.conditionMonitoringQueryLanguage = defaults.conditionMonitoringQueryLanguage;
    	      this.conditionThreshold = defaults.conditionThreshold;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder conditionAbsent(@Nullable Output<AlertPolicyConditionConditionAbsentArgs> conditionAbsent) {
            this.conditionAbsent = conditionAbsent;
            return this;
        }
        public Builder conditionAbsent(@Nullable AlertPolicyConditionConditionAbsentArgs conditionAbsent) {
            this.conditionAbsent = Codegen.ofNullable(conditionAbsent);
            return this;
        }
        public Builder conditionMatchedLog(@Nullable Output<AlertPolicyConditionConditionMatchedLogArgs> conditionMatchedLog) {
            this.conditionMatchedLog = conditionMatchedLog;
            return this;
        }
        public Builder conditionMatchedLog(@Nullable AlertPolicyConditionConditionMatchedLogArgs conditionMatchedLog) {
            this.conditionMatchedLog = Codegen.ofNullable(conditionMatchedLog);
            return this;
        }
        public Builder conditionMonitoringQueryLanguage(@Nullable Output<AlertPolicyConditionConditionMonitoringQueryLanguageArgs> conditionMonitoringQueryLanguage) {
            this.conditionMonitoringQueryLanguage = conditionMonitoringQueryLanguage;
            return this;
        }
        public Builder conditionMonitoringQueryLanguage(@Nullable AlertPolicyConditionConditionMonitoringQueryLanguageArgs conditionMonitoringQueryLanguage) {
            this.conditionMonitoringQueryLanguage = Codegen.ofNullable(conditionMonitoringQueryLanguage);
            return this;
        }
        public Builder conditionThreshold(@Nullable Output<AlertPolicyConditionConditionThresholdArgs> conditionThreshold) {
            this.conditionThreshold = conditionThreshold;
            return this;
        }
        public Builder conditionThreshold(@Nullable AlertPolicyConditionConditionThresholdArgs conditionThreshold) {
            this.conditionThreshold = Codegen.ofNullable(conditionThreshold);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public AlertPolicyConditionArgs build() {
            return new AlertPolicyConditionArgs(conditionAbsent, conditionMatchedLog, conditionMonitoringQueryLanguage, conditionThreshold, displayName, name);
        }
    }
}
