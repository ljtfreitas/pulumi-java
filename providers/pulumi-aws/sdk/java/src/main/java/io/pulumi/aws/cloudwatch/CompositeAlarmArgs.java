// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CompositeAlarmArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompositeAlarmArgs Empty = new CompositeAlarmArgs();

    /**
     * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. Defaults to `true`.
     * 
     */
    @Import(name="actionsEnabled")
      private final @Nullable Output<Boolean> actionsEnabled;

    public Output<Boolean> getActionsEnabled() {
        return this.actionsEnabled == null ? Output.empty() : this.actionsEnabled;
    }

    /**
     * The set of actions to execute when this alarm transitions to the `ALARM` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @Import(name="alarmActions")
      private final @Nullable Output<List<String>> alarmActions;

    public Output<List<String>> getAlarmActions() {
        return this.alarmActions == null ? Output.empty() : this.alarmActions;
    }

    /**
     * The description for the composite alarm.
     * 
     */
    @Import(name="alarmDescription")
      private final @Nullable Output<String> alarmDescription;

    public Output<String> getAlarmDescription() {
        return this.alarmDescription == null ? Output.empty() : this.alarmDescription;
    }

    /**
     * The name for the composite alarm. This name must be unique within the region.
     * 
     */
    @Import(name="alarmName", required=true)
      private final Output<String> alarmName;

    public Output<String> getAlarmName() {
        return this.alarmName;
    }

    /**
     * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For syntax, see [Creating a Composite Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Create_Composite_Alarm.html). The maximum length is 10240 characters.
     * 
     */
    @Import(name="alarmRule", required=true)
      private final Output<String> alarmRule;

    public Output<String> getAlarmRule() {
        return this.alarmRule;
    }

    /**
     * The set of actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @Import(name="insufficientDataActions")
      private final @Nullable Output<List<String>> insufficientDataActions;

    public Output<List<String>> getInsufficientDataActions() {
        return this.insufficientDataActions == null ? Output.empty() : this.insufficientDataActions;
    }

    /**
     * The set of actions to execute when this alarm transitions to an `OK` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @Import(name="okActions")
      private final @Nullable Output<List<String>> okActions;

    public Output<List<String>> getOkActions() {
        return this.okActions == null ? Output.empty() : this.okActions;
    }

    /**
     * A map of tags to associate with the alarm. Up to 50 tags are allowed. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CompositeAlarmArgs(
        @Nullable Output<Boolean> actionsEnabled,
        @Nullable Output<List<String>> alarmActions,
        @Nullable Output<String> alarmDescription,
        Output<String> alarmName,
        Output<String> alarmRule,
        @Nullable Output<List<String>> insufficientDataActions,
        @Nullable Output<List<String>> okActions,
        @Nullable Output<Map<String,String>> tags) {
        this.actionsEnabled = actionsEnabled;
        this.alarmActions = alarmActions;
        this.alarmDescription = alarmDescription;
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
        this.alarmRule = Objects.requireNonNull(alarmRule, "expected parameter 'alarmRule' to be non-null");
        this.insufficientDataActions = insufficientDataActions;
        this.okActions = okActions;
        this.tags = tags;
    }

    private CompositeAlarmArgs() {
        this.actionsEnabled = Output.empty();
        this.alarmActions = Output.empty();
        this.alarmDescription = Output.empty();
        this.alarmName = Output.empty();
        this.alarmRule = Output.empty();
        this.insufficientDataActions = Output.empty();
        this.okActions = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompositeAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> actionsEnabled;
        private @Nullable Output<List<String>> alarmActions;
        private @Nullable Output<String> alarmDescription;
        private Output<String> alarmName;
        private Output<String> alarmRule;
        private @Nullable Output<List<String>> insufficientDataActions;
        private @Nullable Output<List<String>> okActions;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CompositeAlarmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsEnabled = defaults.actionsEnabled;
    	      this.alarmActions = defaults.alarmActions;
    	      this.alarmDescription = defaults.alarmDescription;
    	      this.alarmName = defaults.alarmName;
    	      this.alarmRule = defaults.alarmRule;
    	      this.insufficientDataActions = defaults.insufficientDataActions;
    	      this.okActions = defaults.okActions;
    	      this.tags = defaults.tags;
        }

        public Builder actionsEnabled(@Nullable Output<Boolean> actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }

        public Builder actionsEnabled(@Nullable Boolean actionsEnabled) {
            this.actionsEnabled = Output.ofNullable(actionsEnabled);
            return this;
        }

        public Builder alarmActions(@Nullable Output<List<String>> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }

        public Builder alarmActions(@Nullable List<String> alarmActions) {
            this.alarmActions = Output.ofNullable(alarmActions);
            return this;
        }

        public Builder alarmDescription(@Nullable Output<String> alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }

        public Builder alarmDescription(@Nullable String alarmDescription) {
            this.alarmDescription = Output.ofNullable(alarmDescription);
            return this;
        }

        public Builder alarmName(Output<String> alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }

        public Builder alarmName(String alarmName) {
            this.alarmName = Output.of(Objects.requireNonNull(alarmName));
            return this;
        }

        public Builder alarmRule(Output<String> alarmRule) {
            this.alarmRule = Objects.requireNonNull(alarmRule);
            return this;
        }

        public Builder alarmRule(String alarmRule) {
            this.alarmRule = Output.of(Objects.requireNonNull(alarmRule));
            return this;
        }

        public Builder insufficientDataActions(@Nullable Output<List<String>> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }

        public Builder insufficientDataActions(@Nullable List<String> insufficientDataActions) {
            this.insufficientDataActions = Output.ofNullable(insufficientDataActions);
            return this;
        }

        public Builder okActions(@Nullable Output<List<String>> okActions) {
            this.okActions = okActions;
            return this;
        }

        public Builder okActions(@Nullable List<String> okActions) {
            this.okActions = Output.ofNullable(okActions);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public CompositeAlarmArgs build() {
            return new CompositeAlarmArgs(actionsEnabled, alarmActions, alarmDescription, alarmName, alarmRule, insufficientDataActions, okActions, tags);
        }
    }
}
