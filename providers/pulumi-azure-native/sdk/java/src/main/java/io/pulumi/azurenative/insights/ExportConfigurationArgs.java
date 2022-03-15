// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExportConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportConfigurationArgs Empty = new ExportConfigurationArgs();

    /**
     * The name of destination storage account.
     * 
     */
    @Import(name="destinationAccountId")
      private final @Nullable Output<String> destinationAccountId;

    public Output<String> getDestinationAccountId() {
        return this.destinationAccountId == null ? Output.empty() : this.destinationAccountId;
    }

    /**
     * The SAS URL for the destination storage container. It must grant write permission.
     * 
     */
    @Import(name="destinationAddress")
      private final @Nullable Output<String> destinationAddress;

    public Output<String> getDestinationAddress() {
        return this.destinationAddress == null ? Output.empty() : this.destinationAddress;
    }

    /**
     * The location ID of the destination storage container.
     * 
     */
    @Import(name="destinationStorageLocationId")
      private final @Nullable Output<String> destinationStorageLocationId;

    public Output<String> getDestinationStorageLocationId() {
        return this.destinationStorageLocationId == null ? Output.empty() : this.destinationStorageLocationId;
    }

    /**
     * The subscription ID of the destination storage container.
     * 
     */
    @Import(name="destinationStorageSubscriptionId")
      private final @Nullable Output<String> destinationStorageSubscriptionId;

    public Output<String> getDestinationStorageSubscriptionId() {
        return this.destinationStorageSubscriptionId == null ? Output.empty() : this.destinationStorageSubscriptionId;
    }

    /**
     * The Continuous Export destination type. This has to be 'Blob'.
     * 
     */
    @Import(name="destinationType")
      private final @Nullable Output<String> destinationType;

    public Output<String> getDestinationType() {
        return this.destinationType == null ? Output.empty() : this.destinationType;
    }

    /**
     * The Continuous Export configuration ID. This is unique within a Application Insights component.
     * 
     */
    @Import(name="exportId")
      private final @Nullable Output<String> exportId;

    public Output<String> getExportId() {
        return this.exportId == null ? Output.empty() : this.exportId;
    }

    /**
     * Set to 'true' to create a Continuous Export configuration as enabled, otherwise set it to 'false'.
     * 
     */
    @Import(name="isEnabled")
      private final @Nullable Output<String> isEnabled;

    public Output<String> getIsEnabled() {
        return this.isEnabled == null ? Output.empty() : this.isEnabled;
    }

    /**
     * Deprecated
     * 
     */
    @Import(name="notificationQueueEnabled")
      private final @Nullable Output<String> notificationQueueEnabled;

    public Output<String> getNotificationQueueEnabled() {
        return this.notificationQueueEnabled == null ? Output.empty() : this.notificationQueueEnabled;
    }

    /**
     * Deprecated
     * 
     */
    @Import(name="notificationQueueUri")
      private final @Nullable Output<String> notificationQueueUri;

    public Output<String> getNotificationQueueUri() {
        return this.notificationQueueUri == null ? Output.empty() : this.notificationQueueUri;
    }

    /**
     * The document types to be exported, as comma separated values. Allowed values include 'Requests', 'Event', 'Exceptions', 'Metrics', 'PageViews', 'PageViewPerformance', 'Rdd', 'PerformanceCounters', 'Availability', 'Messages'.
     * 
     */
    @Import(name="recordTypes")
      private final @Nullable Output<String> recordTypes;

    public Output<String> getRecordTypes() {
        return this.recordTypes == null ? Output.empty() : this.recordTypes;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    public ExportConfigurationArgs(
        @Nullable Output<String> destinationAccountId,
        @Nullable Output<String> destinationAddress,
        @Nullable Output<String> destinationStorageLocationId,
        @Nullable Output<String> destinationStorageSubscriptionId,
        @Nullable Output<String> destinationType,
        @Nullable Output<String> exportId,
        @Nullable Output<String> isEnabled,
        @Nullable Output<String> notificationQueueEnabled,
        @Nullable Output<String> notificationQueueUri,
        @Nullable Output<String> recordTypes,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.destinationAccountId = destinationAccountId;
        this.destinationAddress = destinationAddress;
        this.destinationStorageLocationId = destinationStorageLocationId;
        this.destinationStorageSubscriptionId = destinationStorageSubscriptionId;
        this.destinationType = destinationType;
        this.exportId = exportId;
        this.isEnabled = isEnabled;
        this.notificationQueueEnabled = notificationQueueEnabled;
        this.notificationQueueUri = notificationQueueUri;
        this.recordTypes = recordTypes;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ExportConfigurationArgs() {
        this.destinationAccountId = Output.empty();
        this.destinationAddress = Output.empty();
        this.destinationStorageLocationId = Output.empty();
        this.destinationStorageSubscriptionId = Output.empty();
        this.destinationType = Output.empty();
        this.exportId = Output.empty();
        this.isEnabled = Output.empty();
        this.notificationQueueEnabled = Output.empty();
        this.notificationQueueUri = Output.empty();
        this.recordTypes = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> destinationAccountId;
        private @Nullable Output<String> destinationAddress;
        private @Nullable Output<String> destinationStorageLocationId;
        private @Nullable Output<String> destinationStorageSubscriptionId;
        private @Nullable Output<String> destinationType;
        private @Nullable Output<String> exportId;
        private @Nullable Output<String> isEnabled;
        private @Nullable Output<String> notificationQueueEnabled;
        private @Nullable Output<String> notificationQueueUri;
        private @Nullable Output<String> recordTypes;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAccountId = defaults.destinationAccountId;
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationStorageLocationId = defaults.destinationStorageLocationId;
    	      this.destinationStorageSubscriptionId = defaults.destinationStorageSubscriptionId;
    	      this.destinationType = defaults.destinationType;
    	      this.exportId = defaults.exportId;
    	      this.isEnabled = defaults.isEnabled;
    	      this.notificationQueueEnabled = defaults.notificationQueueEnabled;
    	      this.notificationQueueUri = defaults.notificationQueueUri;
    	      this.recordTypes = defaults.recordTypes;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder destinationAccountId(@Nullable Output<String> destinationAccountId) {
            this.destinationAccountId = destinationAccountId;
            return this;
        }

        public Builder destinationAccountId(@Nullable String destinationAccountId) {
            this.destinationAccountId = Output.ofNullable(destinationAccountId);
            return this;
        }

        public Builder destinationAddress(@Nullable Output<String> destinationAddress) {
            this.destinationAddress = destinationAddress;
            return this;
        }

        public Builder destinationAddress(@Nullable String destinationAddress) {
            this.destinationAddress = Output.ofNullable(destinationAddress);
            return this;
        }

        public Builder destinationStorageLocationId(@Nullable Output<String> destinationStorageLocationId) {
            this.destinationStorageLocationId = destinationStorageLocationId;
            return this;
        }

        public Builder destinationStorageLocationId(@Nullable String destinationStorageLocationId) {
            this.destinationStorageLocationId = Output.ofNullable(destinationStorageLocationId);
            return this;
        }

        public Builder destinationStorageSubscriptionId(@Nullable Output<String> destinationStorageSubscriptionId) {
            this.destinationStorageSubscriptionId = destinationStorageSubscriptionId;
            return this;
        }

        public Builder destinationStorageSubscriptionId(@Nullable String destinationStorageSubscriptionId) {
            this.destinationStorageSubscriptionId = Output.ofNullable(destinationStorageSubscriptionId);
            return this;
        }

        public Builder destinationType(@Nullable Output<String> destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder destinationType(@Nullable String destinationType) {
            this.destinationType = Output.ofNullable(destinationType);
            return this;
        }

        public Builder exportId(@Nullable Output<String> exportId) {
            this.exportId = exportId;
            return this;
        }

        public Builder exportId(@Nullable String exportId) {
            this.exportId = Output.ofNullable(exportId);
            return this;
        }

        public Builder isEnabled(@Nullable Output<String> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(@Nullable String isEnabled) {
            this.isEnabled = Output.ofNullable(isEnabled);
            return this;
        }

        public Builder notificationQueueEnabled(@Nullable Output<String> notificationQueueEnabled) {
            this.notificationQueueEnabled = notificationQueueEnabled;
            return this;
        }

        public Builder notificationQueueEnabled(@Nullable String notificationQueueEnabled) {
            this.notificationQueueEnabled = Output.ofNullable(notificationQueueEnabled);
            return this;
        }

        public Builder notificationQueueUri(@Nullable Output<String> notificationQueueUri) {
            this.notificationQueueUri = notificationQueueUri;
            return this;
        }

        public Builder notificationQueueUri(@Nullable String notificationQueueUri) {
            this.notificationQueueUri = Output.ofNullable(notificationQueueUri);
            return this;
        }

        public Builder recordTypes(@Nullable Output<String> recordTypes) {
            this.recordTypes = recordTypes;
            return this;
        }

        public Builder recordTypes(@Nullable String recordTypes) {
            this.recordTypes = Output.ofNullable(recordTypes);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public ExportConfigurationArgs build() {
            return new ExportConfigurationArgs(destinationAccountId, destinationAddress, destinationStorageLocationId, destinationStorageSubscriptionId, destinationType, exportId, isEnabled, notificationQueueEnabled, notificationQueueUri, recordTypes, resourceGroupName, resourceName);
        }
    }
}
