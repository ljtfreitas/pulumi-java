// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.MutationRecordResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNotificationChannelResult {
    /**
     * Record of the creation of this channel.
     * 
     */
    private final MutationRecordResponse creationRecord;
    /**
     * An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
     * 
     */
    private final String description;
    /**
     * An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
     * 
     */
    private final String displayName;
    /**
     * Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
     * 
     */
    private final Boolean enabled;
    /**
     * Configuration fields that define the channel and its behavior. The permissible and required labels are specified in the NotificationChannelDescriptor.labels of the NotificationChannelDescriptor corresponding to the type field.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Records of the modification of this channel.
     * 
     */
    private final List<MutationRecordResponse> mutationRecords;
    /**
     * The full REST resource name for this channel. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically assigned by the server on creation.
     * 
     */
    private final String name;
    /**
     * The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field.
     * 
     */
    private final String type;
    /**
     * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    private final Map<String,String> userLabels;
    /**
     * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
     */
    private final String verificationStatus;

    @CustomType.Constructor
    private GetNotificationChannelResult(
        @CustomType.Parameter("creationRecord") MutationRecordResponse creationRecord,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("mutationRecords") List<MutationRecordResponse> mutationRecords,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userLabels") Map<String,String> userLabels,
        @CustomType.Parameter("verificationStatus") String verificationStatus) {
        this.creationRecord = creationRecord;
        this.description = description;
        this.displayName = displayName;
        this.enabled = enabled;
        this.labels = labels;
        this.mutationRecords = mutationRecords;
        this.name = name;
        this.type = type;
        this.userLabels = userLabels;
        this.verificationStatus = verificationStatus;
    }

    /**
     * Record of the creation of this channel.
     * 
    */
    public MutationRecordResponse getCreationRecord() {
        return this.creationRecord;
    }
    /**
     * An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Configuration fields that define the channel and its behavior. The permissible and required labels are specified in the NotificationChannelDescriptor.labels of the NotificationChannelDescriptor corresponding to the type field.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Records of the modification of this channel.
     * 
    */
    public List<MutationRecordResponse> getMutationRecords() {
        return this.mutationRecords;
    }
    /**
     * The full REST resource name for this channel. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically assigned by the server on creation.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
    */
    public Map<String,String> getUserLabels() {
        return this.userLabels;
    }
    /**
     * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
    */
    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MutationRecordResponse creationRecord;
        private String description;
        private String displayName;
        private Boolean enabled;
        private Map<String,String> labels;
        private List<MutationRecordResponse> mutationRecords;
        private String name;
        private String type;
        private Map<String,String> userLabels;
        private String verificationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationRecord = defaults.creationRecord;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.labels = defaults.labels;
    	      this.mutationRecords = defaults.mutationRecords;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userLabels = defaults.userLabels;
    	      this.verificationStatus = defaults.verificationStatus;
        }

        public Builder creationRecord(MutationRecordResponse creationRecord) {
            this.creationRecord = Objects.requireNonNull(creationRecord);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder mutationRecords(List<MutationRecordResponse> mutationRecords) {
            this.mutationRecords = Objects.requireNonNull(mutationRecords);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }

        public Builder verificationStatus(String verificationStatus) {
            this.verificationStatus = Objects.requireNonNull(verificationStatus);
            return this;
        }
        public GetNotificationChannelResult build() {
            return new GetNotificationChannelResult(creationRecord, description, displayName, enabled, labels, mutationRecords, name, type, userLabels, verificationStatus);
        }
    }
}
