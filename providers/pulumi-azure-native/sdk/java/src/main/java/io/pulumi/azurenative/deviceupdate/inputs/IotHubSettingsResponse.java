// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Device Update account integration with IoT Hub settings.
 * 
 */
public final class IotHubSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final IotHubSettingsResponse Empty = new IotHubSettingsResponse();

    /**
     * EventHub connection string.
     * 
     */
    @InputImport(name="eventHubConnectionString")
    private final @Nullable String eventHubConnectionString;

    public Optional<String> getEventHubConnectionString() {
        return this.eventHubConnectionString == null ? Optional.empty() : Optional.ofNullable(this.eventHubConnectionString);
    }

    /**
     * IoTHub connection string.
     * 
     */
    @InputImport(name="ioTHubConnectionString")
    private final @Nullable String ioTHubConnectionString;

    public Optional<String> getIoTHubConnectionString() {
        return this.ioTHubConnectionString == null ? Optional.empty() : Optional.ofNullable(this.ioTHubConnectionString);
    }

    /**
     * IoTHub resource ID
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    public IotHubSettingsResponse(
        @Nullable String eventHubConnectionString,
        @Nullable String ioTHubConnectionString,
        String resourceId) {
        this.eventHubConnectionString = eventHubConnectionString;
        this.ioTHubConnectionString = ioTHubConnectionString;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private IotHubSettingsResponse() {
        this.eventHubConnectionString = null;
        this.ioTHubConnectionString = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventHubConnectionString;
        private @Nullable String ioTHubConnectionString;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubConnectionString = defaults.eventHubConnectionString;
    	      this.ioTHubConnectionString = defaults.ioTHubConnectionString;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setEventHubConnectionString(@Nullable String eventHubConnectionString) {
            this.eventHubConnectionString = eventHubConnectionString;
            return this;
        }

        public Builder setIoTHubConnectionString(@Nullable String ioTHubConnectionString) {
            this.ioTHubConnectionString = ioTHubConnectionString;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public IotHubSettingsResponse build() {
            return new IotHubSettingsResponse(eventHubConnectionString, ioTHubConnectionString, resourceId);
        }
    }
}
