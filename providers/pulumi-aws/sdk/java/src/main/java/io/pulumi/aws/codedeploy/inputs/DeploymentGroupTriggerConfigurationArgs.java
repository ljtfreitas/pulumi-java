// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeploymentGroupTriggerConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupTriggerConfigurationArgs Empty = new DeploymentGroupTriggerConfigurationArgs();

    /**
     * The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
     * 
     */
    @InputImport(name="triggerEvents", required=true)
    private final Input<List<String>> triggerEvents;

    public Input<List<String>> getTriggerEvents() {
        return this.triggerEvents;
    }

    /**
     * The name of the notification trigger.
     * 
     */
    @InputImport(name="triggerName", required=true)
    private final Input<String> triggerName;

    public Input<String> getTriggerName() {
        return this.triggerName;
    }

    /**
     * The ARN of the SNS topic through which notifications are sent.
     * 
     */
    @InputImport(name="triggerTargetArn", required=true)
    private final Input<String> triggerTargetArn;

    public Input<String> getTriggerTargetArn() {
        return this.triggerTargetArn;
    }

    public DeploymentGroupTriggerConfigurationArgs(
        Input<List<String>> triggerEvents,
        Input<String> triggerName,
        Input<String> triggerTargetArn) {
        this.triggerEvents = Objects.requireNonNull(triggerEvents, "expected parameter 'triggerEvents' to be non-null");
        this.triggerName = Objects.requireNonNull(triggerName, "expected parameter 'triggerName' to be non-null");
        this.triggerTargetArn = Objects.requireNonNull(triggerTargetArn, "expected parameter 'triggerTargetArn' to be non-null");
    }

    private DeploymentGroupTriggerConfigurationArgs() {
        this.triggerEvents = Input.empty();
        this.triggerName = Input.empty();
        this.triggerTargetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupTriggerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> triggerEvents;
        private Input<String> triggerName;
        private Input<String> triggerTargetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupTriggerConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerEvents = defaults.triggerEvents;
    	      this.triggerName = defaults.triggerName;
    	      this.triggerTargetArn = defaults.triggerTargetArn;
        }

        public Builder setTriggerEvents(Input<List<String>> triggerEvents) {
            this.triggerEvents = Objects.requireNonNull(triggerEvents);
            return this;
        }

        public Builder setTriggerEvents(List<String> triggerEvents) {
            this.triggerEvents = Input.of(Objects.requireNonNull(triggerEvents));
            return this;
        }

        public Builder setTriggerName(Input<String> triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }

        public Builder setTriggerName(String triggerName) {
            this.triggerName = Input.of(Objects.requireNonNull(triggerName));
            return this;
        }

        public Builder setTriggerTargetArn(Input<String> triggerTargetArn) {
            this.triggerTargetArn = Objects.requireNonNull(triggerTargetArn);
            return this;
        }

        public Builder setTriggerTargetArn(String triggerTargetArn) {
            this.triggerTargetArn = Input.of(Objects.requireNonNull(triggerTargetArn));
            return this;
        }
        public DeploymentGroupTriggerConfigurationArgs build() {
            return new DeploymentGroupTriggerConfigurationArgs(triggerEvents, triggerName, triggerTargetArn);
        }
    }
}
