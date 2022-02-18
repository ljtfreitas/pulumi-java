// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A type of synchronization setting based on schedule
 * 
 */
public final class ScheduledSourceSynchronizationSettingResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduledSourceSynchronizationSettingResponse Empty = new ScheduledSourceSynchronizationSettingResponse();

    /**
     * Kind of synchronization setting on share.
     * Expected value is 'ScheduleBased'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Recurrence Interval
     * 
     */
    @InputImport(name="recurrenceInterval")
    private final @Nullable String recurrenceInterval;

    public Optional<String> getRecurrenceInterval() {
        return this.recurrenceInterval == null ? Optional.empty() : Optional.ofNullable(this.recurrenceInterval);
    }

    /**
     * Synchronization time
     * 
     */
    @InputImport(name="synchronizationTime")
    private final @Nullable String synchronizationTime;

    public Optional<String> getSynchronizationTime() {
        return this.synchronizationTime == null ? Optional.empty() : Optional.ofNullable(this.synchronizationTime);
    }

    public ScheduledSourceSynchronizationSettingResponse(
        String kind,
        @Nullable String recurrenceInterval,
        @Nullable String synchronizationTime) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.recurrenceInterval = recurrenceInterval;
        this.synchronizationTime = synchronizationTime;
    }

    private ScheduledSourceSynchronizationSettingResponse() {
        this.kind = null;
        this.recurrenceInterval = null;
        this.synchronizationTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledSourceSynchronizationSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private @Nullable String recurrenceInterval;
        private @Nullable String synchronizationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledSourceSynchronizationSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.recurrenceInterval = defaults.recurrenceInterval;
    	      this.synchronizationTime = defaults.synchronizationTime;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setRecurrenceInterval(@Nullable String recurrenceInterval) {
            this.recurrenceInterval = recurrenceInterval;
            return this;
        }

        public Builder setSynchronizationTime(@Nullable String synchronizationTime) {
            this.synchronizationTime = synchronizationTime;
            return this;
        }

        public ScheduledSourceSynchronizationSettingResponse build() {
            return new ScheduledSourceSynchronizationSettingResponse(kind, recurrenceInterval, synchronizationTime);
        }
    }
}
