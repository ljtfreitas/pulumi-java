// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlarmArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlarmArgs Empty = new AlarmArgs();

    /**
     * The name for the alarm. Specify the name of an existing alarm to update, and overwrite the previous configuration of the alarm.
     * 
     */
    @Import(name="alarmName")
      private final @Nullable Output<String> alarmName;

    public Output<String> getAlarmName() {
        return this.alarmName == null ? Output.empty() : this.alarmName;
    }

    /**
     * The arithmetic operation to use when comparing the specified statistic to the threshold. The specified statistic value is used as the first operand.
     * 
     */
    @Import(name="comparisonOperator", required=true)
      private final Output<String> comparisonOperator;

    public Output<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The contact protocols to use for the alarm, such as Email, SMS (text messaging), or both.
     * 
     */
    @Import(name="contactProtocols")
      private final @Nullable Output<List<String>> contactProtocols;

    public Output<List<String>> getContactProtocols() {
        return this.contactProtocols == null ? Output.empty() : this.contactProtocols;
    }

    /**
     * The number of data points that must be not within the specified threshold to trigger the alarm. If you are setting an "M out of N" alarm, this value (datapointsToAlarm) is the M.
     * 
     */
    @Import(name="datapointsToAlarm")
      private final @Nullable Output<Integer> datapointsToAlarm;

    public Output<Integer> getDatapointsToAlarm() {
        return this.datapointsToAlarm == null ? Output.empty() : this.datapointsToAlarm;
    }

    /**
     * The number of most recent periods over which data is compared to the specified threshold. If you are setting an "M out of N" alarm, this value (evaluationPeriods) is the N.
     * 
     */
    @Import(name="evaluationPeriods", required=true)
      private final Output<Integer> evaluationPeriods;

    public Output<Integer> getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * The name of the metric to associate with the alarm.
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The validation status of the SSL/TLS certificate.
     * 
     */
    @Import(name="monitoredResourceName", required=true)
      private final Output<String> monitoredResourceName;

    public Output<String> getMonitoredResourceName() {
        return this.monitoredResourceName;
    }

    /**
     * Indicates whether the alarm is enabled. Notifications are enabled by default if you don't specify this parameter.
     * 
     */
    @Import(name="notificationEnabled")
      private final @Nullable Output<Boolean> notificationEnabled;

    public Output<Boolean> getNotificationEnabled() {
        return this.notificationEnabled == null ? Output.empty() : this.notificationEnabled;
    }

    /**
     * The alarm states that trigger a notification.
     * 
     */
    @Import(name="notificationTriggers")
      private final @Nullable Output<List<String>> notificationTriggers;

    public Output<List<String>> getNotificationTriggers() {
        return this.notificationTriggers == null ? Output.empty() : this.notificationTriggers;
    }

    /**
     * The value against which the specified statistic is compared.
     * 
     */
    @Import(name="threshold", required=true)
      private final Output<Double> threshold;

    public Output<Double> getThreshold() {
        return this.threshold;
    }

    /**
     * Sets how this alarm will handle missing data points.
     * 
     */
    @Import(name="treatMissingData")
      private final @Nullable Output<String> treatMissingData;

    public Output<String> getTreatMissingData() {
        return this.treatMissingData == null ? Output.empty() : this.treatMissingData;
    }

    public AlarmArgs(
        @Nullable Output<String> alarmName,
        Output<String> comparisonOperator,
        @Nullable Output<List<String>> contactProtocols,
        @Nullable Output<Integer> datapointsToAlarm,
        Output<Integer> evaluationPeriods,
        Output<String> metricName,
        Output<String> monitoredResourceName,
        @Nullable Output<Boolean> notificationEnabled,
        @Nullable Output<List<String>> notificationTriggers,
        Output<Double> threshold,
        @Nullable Output<String> treatMissingData) {
        this.alarmName = alarmName;
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.contactProtocols = contactProtocols;
        this.datapointsToAlarm = datapointsToAlarm;
        this.evaluationPeriods = Objects.requireNonNull(evaluationPeriods, "expected parameter 'evaluationPeriods' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.monitoredResourceName = Objects.requireNonNull(monitoredResourceName, "expected parameter 'monitoredResourceName' to be non-null");
        this.notificationEnabled = notificationEnabled;
        this.notificationTriggers = notificationTriggers;
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.treatMissingData = treatMissingData;
    }

    private AlarmArgs() {
        this.alarmName = Output.empty();
        this.comparisonOperator = Output.empty();
        this.contactProtocols = Output.empty();
        this.datapointsToAlarm = Output.empty();
        this.evaluationPeriods = Output.empty();
        this.metricName = Output.empty();
        this.monitoredResourceName = Output.empty();
        this.notificationEnabled = Output.empty();
        this.notificationTriggers = Output.empty();
        this.threshold = Output.empty();
        this.treatMissingData = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alarmName;
        private Output<String> comparisonOperator;
        private @Nullable Output<List<String>> contactProtocols;
        private @Nullable Output<Integer> datapointsToAlarm;
        private Output<Integer> evaluationPeriods;
        private Output<String> metricName;
        private Output<String> monitoredResourceName;
        private @Nullable Output<Boolean> notificationEnabled;
        private @Nullable Output<List<String>> notificationTriggers;
        private Output<Double> threshold;
        private @Nullable Output<String> treatMissingData;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.contactProtocols = defaults.contactProtocols;
    	      this.datapointsToAlarm = defaults.datapointsToAlarm;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.metricName = defaults.metricName;
    	      this.monitoredResourceName = defaults.monitoredResourceName;
    	      this.notificationEnabled = defaults.notificationEnabled;
    	      this.notificationTriggers = defaults.notificationTriggers;
    	      this.threshold = defaults.threshold;
    	      this.treatMissingData = defaults.treatMissingData;
        }

        public Builder alarmName(@Nullable Output<String> alarmName) {
            this.alarmName = alarmName;
            return this;
        }

        public Builder alarmName(@Nullable String alarmName) {
            this.alarmName = Output.ofNullable(alarmName);
            return this;
        }

        public Builder comparisonOperator(Output<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Output.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder contactProtocols(@Nullable Output<List<String>> contactProtocols) {
            this.contactProtocols = contactProtocols;
            return this;
        }

        public Builder contactProtocols(@Nullable List<String> contactProtocols) {
            this.contactProtocols = Output.ofNullable(contactProtocols);
            return this;
        }

        public Builder datapointsToAlarm(@Nullable Output<Integer> datapointsToAlarm) {
            this.datapointsToAlarm = datapointsToAlarm;
            return this;
        }

        public Builder datapointsToAlarm(@Nullable Integer datapointsToAlarm) {
            this.datapointsToAlarm = Output.ofNullable(datapointsToAlarm);
            return this;
        }

        public Builder evaluationPeriods(Output<Integer> evaluationPeriods) {
            this.evaluationPeriods = Objects.requireNonNull(evaluationPeriods);
            return this;
        }

        public Builder evaluationPeriods(Integer evaluationPeriods) {
            this.evaluationPeriods = Output.of(Objects.requireNonNull(evaluationPeriods));
            return this;
        }

        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder monitoredResourceName(Output<String> monitoredResourceName) {
            this.monitoredResourceName = Objects.requireNonNull(monitoredResourceName);
            return this;
        }

        public Builder monitoredResourceName(String monitoredResourceName) {
            this.monitoredResourceName = Output.of(Objects.requireNonNull(monitoredResourceName));
            return this;
        }

        public Builder notificationEnabled(@Nullable Output<Boolean> notificationEnabled) {
            this.notificationEnabled = notificationEnabled;
            return this;
        }

        public Builder notificationEnabled(@Nullable Boolean notificationEnabled) {
            this.notificationEnabled = Output.ofNullable(notificationEnabled);
            return this;
        }

        public Builder notificationTriggers(@Nullable Output<List<String>> notificationTriggers) {
            this.notificationTriggers = notificationTriggers;
            return this;
        }

        public Builder notificationTriggers(@Nullable List<String> notificationTriggers) {
            this.notificationTriggers = Output.ofNullable(notificationTriggers);
            return this;
        }

        public Builder threshold(Output<Double> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder threshold(Double threshold) {
            this.threshold = Output.of(Objects.requireNonNull(threshold));
            return this;
        }

        public Builder treatMissingData(@Nullable Output<String> treatMissingData) {
            this.treatMissingData = treatMissingData;
            return this;
        }

        public Builder treatMissingData(@Nullable String treatMissingData) {
            this.treatMissingData = Output.ofNullable(treatMissingData);
            return this;
        }
        public AlarmArgs build() {
            return new AlarmArgs(alarmName, comparisonOperator, contactProtocols, datapointsToAlarm, evaluationPeriods, metricName, monitoredResourceName, notificationEnabled, notificationTriggers, threshold, treatMissingData);
        }
    }
}
