// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationState extends io.pulumi.resources.ResourceArgs {

    public static final NotificationState Empty = new NotificationState();

    /**
     * A list of AutoScaling Group Names
     * 
     */
    @InputImport(name="groupNames")
    private final @Nullable Input<List<String>> groupNames;

    public Input<List<String>> getGroupNames() {
        return this.groupNames == null ? Input.empty() : this.groupNames;
    }

    /**
     * A list of Notification Types that trigger
     * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
     * 
     */
    @InputImport(name="notifications")
    private final @Nullable Input<List<String>> notifications;

    public Input<List<String>> getNotifications() {
        return this.notifications == null ? Input.empty() : this.notifications;
    }

    /**
     * The Topic ARN for notifications to be sent through
     * 
     */
    @InputImport(name="topicArn")
    private final @Nullable Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn == null ? Input.empty() : this.topicArn;
    }

    public NotificationState(
        @Nullable Input<List<String>> groupNames,
        @Nullable Input<List<String>> notifications,
        @Nullable Input<String> topicArn) {
        this.groupNames = groupNames;
        this.notifications = notifications;
        this.topicArn = topicArn;
    }

    private NotificationState() {
        this.groupNames = Input.empty();
        this.notifications = Input.empty();
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> groupNames;
        private @Nullable Input<List<String>> notifications;
        private @Nullable Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupNames = defaults.groupNames;
    	      this.notifications = defaults.notifications;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setGroupNames(@Nullable Input<List<String>> groupNames) {
            this.groupNames = groupNames;
            return this;
        }

        public Builder setGroupNames(@Nullable List<String> groupNames) {
            this.groupNames = Input.ofNullable(groupNames);
            return this;
        }

        public Builder setNotifications(@Nullable Input<List<String>> notifications) {
            this.notifications = notifications;
            return this;
        }

        public Builder setNotifications(@Nullable List<String> notifications) {
            this.notifications = Input.ofNullable(notifications);
            return this;
        }

        public Builder setTopicArn(@Nullable Input<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = Input.ofNullable(topicArn);
            return this;
        }
        public NotificationState build() {
            return new NotificationState(groupNames, notifications, topicArn);
        }
    }
}
