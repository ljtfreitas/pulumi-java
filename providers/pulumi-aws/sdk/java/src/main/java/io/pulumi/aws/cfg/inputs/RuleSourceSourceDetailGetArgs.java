// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleSourceSourceDetailGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleSourceSourceDetailGetArgs Empty = new RuleSourceSourceDetailGetArgs();

    /**
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources. This defaults to `aws.config` and is the only valid value.
     * 
     */
    @InputImport(name="eventSource")
    private final @Nullable Input<String> eventSource;

    public Input<String> getEventSource() {
        return this.eventSource == null ? Input.empty() : this.eventSource;
    }

    /**
     * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
     */
    @InputImport(name="maximumExecutionFrequency")
    private final @Nullable Input<String> maximumExecutionFrequency;

    public Input<String> getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency == null ? Input.empty() : this.maximumExecutionFrequency;
    }

    /**
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:
     * 
     */
    @InputImport(name="messageType")
    private final @Nullable Input<String> messageType;

    public Input<String> getMessageType() {
        return this.messageType == null ? Input.empty() : this.messageType;
    }

    public RuleSourceSourceDetailGetArgs(
        @Nullable Input<String> eventSource,
        @Nullable Input<String> maximumExecutionFrequency,
        @Nullable Input<String> messageType) {
        this.eventSource = eventSource;
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        this.messageType = messageType;
    }

    private RuleSourceSourceDetailGetArgs() {
        this.eventSource = Input.empty();
        this.maximumExecutionFrequency = Input.empty();
        this.messageType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSourceSourceDetailGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eventSource;
        private @Nullable Input<String> maximumExecutionFrequency;
        private @Nullable Input<String> messageType;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleSourceSourceDetailGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSource = defaults.eventSource;
    	      this.maximumExecutionFrequency = defaults.maximumExecutionFrequency;
    	      this.messageType = defaults.messageType;
        }

        public Builder setEventSource(@Nullable Input<String> eventSource) {
            this.eventSource = eventSource;
            return this;
        }

        public Builder setEventSource(@Nullable String eventSource) {
            this.eventSource = Input.ofNullable(eventSource);
            return this;
        }

        public Builder setMaximumExecutionFrequency(@Nullable Input<String> maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }

        public Builder setMaximumExecutionFrequency(@Nullable String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = Input.ofNullable(maximumExecutionFrequency);
            return this;
        }

        public Builder setMessageType(@Nullable Input<String> messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder setMessageType(@Nullable String messageType) {
            this.messageType = Input.ofNullable(messageType);
            return this;
        }
        public RuleSourceSourceDetailGetArgs build() {
            return new RuleSourceSourceDetailGetArgs(eventSource, maximumExecutionFrequency, messageType);
        }
    }
}
