// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoredResourceResponse {
    /**
     * The ARM id of the resource.
     * 
     */
    private final @Nullable String id;
    /**
     * Reason for why the resource is sending logs (or why it is not sending).
     * 
     */
    private final @Nullable String reasonForLogsStatus;
    /**
     * Flag indicating the status of the resource for sending logs operation to Elastic.
     * 
     */
    private final @Nullable String sendingLogs;

    @CustomType.Constructor
    private MonitoredResourceResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("reasonForLogsStatus") @Nullable String reasonForLogsStatus,
        @CustomType.Parameter("sendingLogs") @Nullable String sendingLogs) {
        this.id = id;
        this.reasonForLogsStatus = reasonForLogsStatus;
        this.sendingLogs = sendingLogs;
    }

    /**
     * The ARM id of the resource.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Reason for why the resource is sending logs (or why it is not sending).
     * 
    */
    public Optional<String> getReasonForLogsStatus() {
        return Optional.ofNullable(this.reasonForLogsStatus);
    }
    /**
     * Flag indicating the status of the resource for sending logs operation to Elastic.
     * 
    */
    public Optional<String> getSendingLogs() {
        return Optional.ofNullable(this.sendingLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String reasonForLogsStatus;
        private @Nullable String sendingLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoredResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.reasonForLogsStatus = defaults.reasonForLogsStatus;
    	      this.sendingLogs = defaults.sendingLogs;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder reasonForLogsStatus(@Nullable String reasonForLogsStatus) {
            this.reasonForLogsStatus = reasonForLogsStatus;
            return this;
        }

        public Builder sendingLogs(@Nullable String sendingLogs) {
            this.sendingLogs = sendingLogs;
            return this;
        }
        public MonitoredResourceResponse build() {
            return new MonitoredResourceResponse(id, reasonForLogsStatus, sendingLogs);
        }
    }
}
