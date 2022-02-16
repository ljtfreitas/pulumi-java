// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.CustomServiceTelemetryArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomServiceArgs Empty = new CustomServiceArgs();

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="serviceId")
    private final @Nullable Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId == null ? Input.empty() : this.serviceId;
    }

    @InputImport(name="telemetry")
    private final @Nullable Input<CustomServiceTelemetryArgs> telemetry;

    public Input<CustomServiceTelemetryArgs> getTelemetry() {
        return this.telemetry == null ? Input.empty() : this.telemetry;
    }

    public CustomServiceArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<String> project,
        @Nullable Input<String> serviceId,
        @Nullable Input<CustomServiceTelemetryArgs> telemetry) {
        this.displayName = displayName;
        this.project = project;
        this.serviceId = serviceId;
        this.telemetry = telemetry;
    }

    private CustomServiceArgs() {
        this.displayName = Input.empty();
        this.project = Input.empty();
        this.serviceId = Input.empty();
        this.telemetry = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> project;
        private @Nullable Input<String> serviceId;
        private @Nullable Input<CustomServiceTelemetryArgs> telemetry;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.telemetry = defaults.telemetry;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServiceId(@Nullable Input<String> serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setServiceId(@Nullable String serviceId) {
            this.serviceId = Input.ofNullable(serviceId);
            return this;
        }

        public Builder setTelemetry(@Nullable Input<CustomServiceTelemetryArgs> telemetry) {
            this.telemetry = telemetry;
            return this;
        }

        public Builder setTelemetry(@Nullable CustomServiceTelemetryArgs telemetry) {
            this.telemetry = Input.ofNullable(telemetry);
            return this;
        }

        public CustomServiceArgs build() {
            return new CustomServiceArgs(displayName, project, serviceId, telemetry);
        }
    }
}