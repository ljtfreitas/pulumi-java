// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail.inputs;

import io.pulumi.awsnative.cloudtrail.enums.TrailEventSelectorReadWriteType;
import io.pulumi.awsnative.cloudtrail.inputs.TrailDataResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The type of email sending events to publish to the event destination.
 * 
 */
public final class TrailEventSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailEventSelectorArgs Empty = new TrailEventSelectorArgs();

    @InputImport(name="dataResources")
        private final @Nullable Input<List<TrailDataResourceArgs>> dataResources;

    public Input<List<TrailDataResourceArgs>> getDataResources() {
        return this.dataResources == null ? Input.empty() : this.dataResources;
    }

    /**
     * An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing "kms.amazonaws.com". By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
     * 
     */
    @InputImport(name="excludeManagementEventSources")
        private final @Nullable Input<List<String>> excludeManagementEventSources;

    public Input<List<String>> getExcludeManagementEventSources() {
        return this.excludeManagementEventSources == null ? Input.empty() : this.excludeManagementEventSources;
    }

    /**
     * Specify if you want your event selector to include management events for your trail.
     * 
     */
    @InputImport(name="includeManagementEvents")
        private final @Nullable Input<Boolean> includeManagementEvents;

    public Input<Boolean> getIncludeManagementEvents() {
        return this.includeManagementEvents == null ? Input.empty() : this.includeManagementEvents;
    }

    /**
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.
     * 
     */
    @InputImport(name="readWriteType")
        private final @Nullable Input<TrailEventSelectorReadWriteType> readWriteType;

    public Input<TrailEventSelectorReadWriteType> getReadWriteType() {
        return this.readWriteType == null ? Input.empty() : this.readWriteType;
    }

    public TrailEventSelectorArgs(
        @Nullable Input<List<TrailDataResourceArgs>> dataResources,
        @Nullable Input<List<String>> excludeManagementEventSources,
        @Nullable Input<Boolean> includeManagementEvents,
        @Nullable Input<TrailEventSelectorReadWriteType> readWriteType) {
        this.dataResources = dataResources;
        this.excludeManagementEventSources = excludeManagementEventSources;
        this.includeManagementEvents = includeManagementEvents;
        this.readWriteType = readWriteType;
    }

    private TrailEventSelectorArgs() {
        this.dataResources = Input.empty();
        this.excludeManagementEventSources = Input.empty();
        this.includeManagementEvents = Input.empty();
        this.readWriteType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailEventSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TrailDataResourceArgs>> dataResources;
        private @Nullable Input<List<String>> excludeManagementEventSources;
        private @Nullable Input<Boolean> includeManagementEvents;
        private @Nullable Input<TrailEventSelectorReadWriteType> readWriteType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailEventSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataResources = defaults.dataResources;
    	      this.excludeManagementEventSources = defaults.excludeManagementEventSources;
    	      this.includeManagementEvents = defaults.includeManagementEvents;
    	      this.readWriteType = defaults.readWriteType;
        }

        public Builder setDataResources(@Nullable Input<List<TrailDataResourceArgs>> dataResources) {
            this.dataResources = dataResources;
            return this;
        }

        public Builder setDataResources(@Nullable List<TrailDataResourceArgs> dataResources) {
            this.dataResources = Input.ofNullable(dataResources);
            return this;
        }

        public Builder setExcludeManagementEventSources(@Nullable Input<List<String>> excludeManagementEventSources) {
            this.excludeManagementEventSources = excludeManagementEventSources;
            return this;
        }

        public Builder setExcludeManagementEventSources(@Nullable List<String> excludeManagementEventSources) {
            this.excludeManagementEventSources = Input.ofNullable(excludeManagementEventSources);
            return this;
        }

        public Builder setIncludeManagementEvents(@Nullable Input<Boolean> includeManagementEvents) {
            this.includeManagementEvents = includeManagementEvents;
            return this;
        }

        public Builder setIncludeManagementEvents(@Nullable Boolean includeManagementEvents) {
            this.includeManagementEvents = Input.ofNullable(includeManagementEvents);
            return this;
        }

        public Builder setReadWriteType(@Nullable Input<TrailEventSelectorReadWriteType> readWriteType) {
            this.readWriteType = readWriteType;
            return this;
        }

        public Builder setReadWriteType(@Nullable TrailEventSelectorReadWriteType readWriteType) {
            this.readWriteType = Input.ofNullable(readWriteType);
            return this;
        }
        public TrailEventSelectorArgs build() {
            return new TrailEventSelectorArgs(dataResources, excludeManagementEventSources, includeManagementEvents, readWriteType);
        }
    }
}
