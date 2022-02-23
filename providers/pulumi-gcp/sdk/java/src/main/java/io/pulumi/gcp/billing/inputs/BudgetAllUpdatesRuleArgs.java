// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetAllUpdatesRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetAllUpdatesRuleArgs Empty = new BudgetAllUpdatesRuleArgs();

    /**
     * Boolean. When set to true, disables default notifications sent
     * when a threshold is exceeded. Default recipients are
     * those with Billing Account Administrators and Billing
     * Account Users IAM roles for the target account.
     * 
     */
    @InputImport(name="disableDefaultIamRecipients")
        private final @Nullable Input<Boolean> disableDefaultIamRecipients;

    public Input<Boolean> getDisableDefaultIamRecipients() {
        return this.disableDefaultIamRecipients == null ? Input.empty() : this.disableDefaultIamRecipients;
    }

    /**
     * The full resource name of a monitoring notification
     * channel in the form
     * projects/{project_id}/notificationChannels/{channel_id}.
     * A maximum of 5 channels are allowed.
     * 
     */
    @InputImport(name="monitoringNotificationChannels")
        private final @Nullable Input<List<String>> monitoringNotificationChannels;

    public Input<List<String>> getMonitoringNotificationChannels() {
        return this.monitoringNotificationChannels == null ? Input.empty() : this.monitoringNotificationChannels;
    }

    /**
     * The name of the Cloud Pub/Sub topic where budget related
     * messages will be published, in the form
     * projects/{project_id}/topics/{topic_id}. Updates are sent
     * at regular intervals to the topic.
     * 
     */
    @InputImport(name="pubsubTopic")
        private final @Nullable Input<String> pubsubTopic;

    public Input<String> getPubsubTopic() {
        return this.pubsubTopic == null ? Input.empty() : this.pubsubTopic;
    }

    /**
     * The schema version of the notification. Only "1.0" is
     * accepted. It represents the JSON schema as defined in
     * https://cloud.google.com/billing/docs/how-to/budgets#notification_format.
     * 
     */
    @InputImport(name="schemaVersion")
        private final @Nullable Input<String> schemaVersion;

    public Input<String> getSchemaVersion() {
        return this.schemaVersion == null ? Input.empty() : this.schemaVersion;
    }

    public BudgetAllUpdatesRuleArgs(
        @Nullable Input<Boolean> disableDefaultIamRecipients,
        @Nullable Input<List<String>> monitoringNotificationChannels,
        @Nullable Input<String> pubsubTopic,
        @Nullable Input<String> schemaVersion) {
        this.disableDefaultIamRecipients = disableDefaultIamRecipients;
        this.monitoringNotificationChannels = monitoringNotificationChannels;
        this.pubsubTopic = pubsubTopic;
        this.schemaVersion = schemaVersion;
    }

    private BudgetAllUpdatesRuleArgs() {
        this.disableDefaultIamRecipients = Input.empty();
        this.monitoringNotificationChannels = Input.empty();
        this.pubsubTopic = Input.empty();
        this.schemaVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAllUpdatesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableDefaultIamRecipients;
        private @Nullable Input<List<String>> monitoringNotificationChannels;
        private @Nullable Input<String> pubsubTopic;
        private @Nullable Input<String> schemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAllUpdatesRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableDefaultIamRecipients = defaults.disableDefaultIamRecipients;
    	      this.monitoringNotificationChannels = defaults.monitoringNotificationChannels;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.schemaVersion = defaults.schemaVersion;
        }

        public Builder setDisableDefaultIamRecipients(@Nullable Input<Boolean> disableDefaultIamRecipients) {
            this.disableDefaultIamRecipients = disableDefaultIamRecipients;
            return this;
        }

        public Builder setDisableDefaultIamRecipients(@Nullable Boolean disableDefaultIamRecipients) {
            this.disableDefaultIamRecipients = Input.ofNullable(disableDefaultIamRecipients);
            return this;
        }

        public Builder setMonitoringNotificationChannels(@Nullable Input<List<String>> monitoringNotificationChannels) {
            this.monitoringNotificationChannels = monitoringNotificationChannels;
            return this;
        }

        public Builder setMonitoringNotificationChannels(@Nullable List<String> monitoringNotificationChannels) {
            this.monitoringNotificationChannels = Input.ofNullable(monitoringNotificationChannels);
            return this;
        }

        public Builder setPubsubTopic(@Nullable Input<String> pubsubTopic) {
            this.pubsubTopic = pubsubTopic;
            return this;
        }

        public Builder setPubsubTopic(@Nullable String pubsubTopic) {
            this.pubsubTopic = Input.ofNullable(pubsubTopic);
            return this;
        }

        public Builder setSchemaVersion(@Nullable Input<String> schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        public Builder setSchemaVersion(@Nullable String schemaVersion) {
            this.schemaVersion = Input.ofNullable(schemaVersion);
            return this;
        }
        public BudgetAllUpdatesRuleArgs build() {
            return new BudgetAllUpdatesRuleArgs(disableDefaultIamRecipients, monitoringNotificationChannels, pubsubTopic, schemaVersion);
        }
    }
}
