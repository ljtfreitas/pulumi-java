// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquerydatatransfer_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquerydatatransfer_v1.inputs.EmailPreferencesArgs;
import io.pulumi.googlenative.bigquerydatatransfer_v1.inputs.ScheduleOptionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferConfigArgs Empty = new TransferConfigArgs();

    @Import(name="authorizationCode")
      private final @Nullable Output<String> authorizationCode;

    public Output<String> getAuthorizationCode() {
        return this.authorizationCode == null ? Output.empty() : this.authorizationCode;
    }

    /**
     * The number of days to look back to automatically refresh the data. For example, if `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10, today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports the feature. Set the value to 0 to use the default value.
     * 
     */
    @Import(name="dataRefreshWindowDays")
      private final @Nullable Output<Integer> dataRefreshWindowDays;

    public Output<Integer> getDataRefreshWindowDays() {
        return this.dataRefreshWindowDays == null ? Output.empty() : this.dataRefreshWindowDays;
    }

    /**
     * Data source id. Cannot be changed once data transfer is created.
     * 
     */
    @Import(name="dataSourceId")
      private final @Nullable Output<String> dataSourceId;

    public Output<String> getDataSourceId() {
        return this.dataSourceId == null ? Output.empty() : this.dataSourceId;
    }

    /**
     * The BigQuery target dataset id.
     * 
     */
    @Import(name="destinationDatasetId")
      private final @Nullable Output<String> destinationDatasetId;

    public Output<String> getDestinationDatasetId() {
        return this.destinationDatasetId == null ? Output.empty() : this.destinationDatasetId;
    }

    /**
     * Is this config disabled. When set to true, no runs are scheduled for a given transfer.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * User specified display name for the data transfer.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Email notifications will be sent according to these preferences to the email address of the user who owns this transfer config.
     * 
     */
    @Import(name="emailPreferences")
      private final @Nullable Output<EmailPreferencesArgs> emailPreferences;

    public Output<EmailPreferencesArgs> getEmailPreferences() {
        return this.emailPreferences == null ? Output.empty() : this.emailPreferences;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the transfer config. Transfer config names have the form `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is usually a uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Pub/Sub topic where notifications will be sent after transfer runs associated with this transfer config finish. The format for specifying a pubsub topic is: `projects/{project}/topics/{topic}`
     * 
     */
    @Import(name="notificationPubsubTopic")
      private final @Nullable Output<String> notificationPubsubTopic;

    public Output<String> getNotificationPubsubTopic() {
        return this.notificationPubsubTopic == null ? Output.empty() : this.notificationPubsubTopic;
    }

    /**
     * Parameters specific to each data source. For more information see the bq tab in the 'Setting up a data transfer' section for each data source. For example the parameters for Cloud Storage transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    @Import(name="params")
      private final @Nullable Output<Map<String,String>> params;

    public Output<Map<String,String>> getParams() {
        return this.params == null ? Output.empty() : this.params;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Data transfer schedule. If the data source does not support a custom schedule, this should be empty. If it is empty, the default value for the data source will be used. The specified times are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on the data source; refer to the documentation for your data source.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * Options customizing the data transfer schedule.
     * 
     */
    @Import(name="scheduleOptions")
      private final @Nullable Output<ScheduleOptionsArgs> scheduleOptions;

    public Output<ScheduleOptionsArgs> getScheduleOptions() {
        return this.scheduleOptions == null ? Output.empty() : this.scheduleOptions;
    }

    @Import(name="serviceAccountName")
      private final @Nullable Output<String> serviceAccountName;

    public Output<String> getServiceAccountName() {
        return this.serviceAccountName == null ? Output.empty() : this.serviceAccountName;
    }

    @Import(name="versionInfo")
      private final @Nullable Output<String> versionInfo;

    public Output<String> getVersionInfo() {
        return this.versionInfo == null ? Output.empty() : this.versionInfo;
    }

    public TransferConfigArgs(
        @Nullable Output<String> authorizationCode,
        @Nullable Output<Integer> dataRefreshWindowDays,
        @Nullable Output<String> dataSourceId,
        @Nullable Output<String> destinationDatasetId,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<String> displayName,
        @Nullable Output<EmailPreferencesArgs> emailPreferences,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> notificationPubsubTopic,
        @Nullable Output<Map<String,String>> params,
        @Nullable Output<String> project,
        @Nullable Output<String> schedule,
        @Nullable Output<ScheduleOptionsArgs> scheduleOptions,
        @Nullable Output<String> serviceAccountName,
        @Nullable Output<String> versionInfo) {
        this.authorizationCode = authorizationCode;
        this.dataRefreshWindowDays = dataRefreshWindowDays;
        this.dataSourceId = dataSourceId;
        this.destinationDatasetId = destinationDatasetId;
        this.disabled = disabled;
        this.displayName = displayName;
        this.emailPreferences = emailPreferences;
        this.location = location;
        this.name = name;
        this.notificationPubsubTopic = notificationPubsubTopic;
        this.params = params;
        this.project = project;
        this.schedule = schedule;
        this.scheduleOptions = scheduleOptions;
        this.serviceAccountName = serviceAccountName;
        this.versionInfo = versionInfo;
    }

    private TransferConfigArgs() {
        this.authorizationCode = Output.empty();
        this.dataRefreshWindowDays = Output.empty();
        this.dataSourceId = Output.empty();
        this.destinationDatasetId = Output.empty();
        this.disabled = Output.empty();
        this.displayName = Output.empty();
        this.emailPreferences = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.notificationPubsubTopic = Output.empty();
        this.params = Output.empty();
        this.project = Output.empty();
        this.schedule = Output.empty();
        this.scheduleOptions = Output.empty();
        this.serviceAccountName = Output.empty();
        this.versionInfo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationCode;
        private @Nullable Output<Integer> dataRefreshWindowDays;
        private @Nullable Output<String> dataSourceId;
        private @Nullable Output<String> destinationDatasetId;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<String> displayName;
        private @Nullable Output<EmailPreferencesArgs> emailPreferences;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> notificationPubsubTopic;
        private @Nullable Output<Map<String,String>> params;
        private @Nullable Output<String> project;
        private @Nullable Output<String> schedule;
        private @Nullable Output<ScheduleOptionsArgs> scheduleOptions;
        private @Nullable Output<String> serviceAccountName;
        private @Nullable Output<String> versionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationCode = defaults.authorizationCode;
    	      this.dataRefreshWindowDays = defaults.dataRefreshWindowDays;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.destinationDatasetId = defaults.destinationDatasetId;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.emailPreferences = defaults.emailPreferences;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationPubsubTopic = defaults.notificationPubsubTopic;
    	      this.params = defaults.params;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.scheduleOptions = defaults.scheduleOptions;
    	      this.serviceAccountName = defaults.serviceAccountName;
    	      this.versionInfo = defaults.versionInfo;
        }

        public Builder authorizationCode(@Nullable Output<String> authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }

        public Builder authorizationCode(@Nullable String authorizationCode) {
            this.authorizationCode = Output.ofNullable(authorizationCode);
            return this;
        }

        public Builder dataRefreshWindowDays(@Nullable Output<Integer> dataRefreshWindowDays) {
            this.dataRefreshWindowDays = dataRefreshWindowDays;
            return this;
        }

        public Builder dataRefreshWindowDays(@Nullable Integer dataRefreshWindowDays) {
            this.dataRefreshWindowDays = Output.ofNullable(dataRefreshWindowDays);
            return this;
        }

        public Builder dataSourceId(@Nullable Output<String> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder dataSourceId(@Nullable String dataSourceId) {
            this.dataSourceId = Output.ofNullable(dataSourceId);
            return this;
        }

        public Builder destinationDatasetId(@Nullable Output<String> destinationDatasetId) {
            this.destinationDatasetId = destinationDatasetId;
            return this;
        }

        public Builder destinationDatasetId(@Nullable String destinationDatasetId) {
            this.destinationDatasetId = Output.ofNullable(destinationDatasetId);
            return this;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder emailPreferences(@Nullable Output<EmailPreferencesArgs> emailPreferences) {
            this.emailPreferences = emailPreferences;
            return this;
        }

        public Builder emailPreferences(@Nullable EmailPreferencesArgs emailPreferences) {
            this.emailPreferences = Output.ofNullable(emailPreferences);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder notificationPubsubTopic(@Nullable Output<String> notificationPubsubTopic) {
            this.notificationPubsubTopic = notificationPubsubTopic;
            return this;
        }

        public Builder notificationPubsubTopic(@Nullable String notificationPubsubTopic) {
            this.notificationPubsubTopic = Output.ofNullable(notificationPubsubTopic);
            return this;
        }

        public Builder params(@Nullable Output<Map<String,String>> params) {
            this.params = params;
            return this;
        }

        public Builder params(@Nullable Map<String,String> params) {
            this.params = Output.ofNullable(params);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder schedule(@Nullable Output<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable String schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }

        public Builder scheduleOptions(@Nullable Output<ScheduleOptionsArgs> scheduleOptions) {
            this.scheduleOptions = scheduleOptions;
            return this;
        }

        public Builder scheduleOptions(@Nullable ScheduleOptionsArgs scheduleOptions) {
            this.scheduleOptions = Output.ofNullable(scheduleOptions);
            return this;
        }

        public Builder serviceAccountName(@Nullable Output<String> serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        public Builder serviceAccountName(@Nullable String serviceAccountName) {
            this.serviceAccountName = Output.ofNullable(serviceAccountName);
            return this;
        }

        public Builder versionInfo(@Nullable Output<String> versionInfo) {
            this.versionInfo = versionInfo;
            return this;
        }

        public Builder versionInfo(@Nullable String versionInfo) {
            this.versionInfo = Output.ofNullable(versionInfo);
            return this;
        }
        public TransferConfigArgs build() {
            return new TransferConfigArgs(authorizationCode, dataRefreshWindowDays, dataSourceId, destinationDatasetId, disabled, displayName, emailPreferences, location, name, notificationPubsubTopic, params, project, schedule, scheduleOptions, serviceAccountName, versionInfo);
        }
    }
}
