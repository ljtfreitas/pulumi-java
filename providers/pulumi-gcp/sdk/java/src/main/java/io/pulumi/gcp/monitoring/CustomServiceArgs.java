// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.monitoring.inputs.CustomServiceTelemetryArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomServiceArgs Empty = new CustomServiceArgs();

    /**
     * Name used for UI elements listing this Service.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * An optional service ID to use. If not given, the server will generate a
     * service ID.
     * 
     */
    @Import(name="serviceId")
      private final @Nullable Output<String> serviceId;

    public Output<String> getServiceId() {
        return this.serviceId == null ? Output.empty() : this.serviceId;
    }

    /**
     * Configuration for how to query telemetry on a Service.
     * Structure is documented below.
     * 
     */
    @Import(name="telemetry")
      private final @Nullable Output<CustomServiceTelemetryArgs> telemetry;

    public Output<CustomServiceTelemetryArgs> getTelemetry() {
        return this.telemetry == null ? Output.empty() : this.telemetry;
    }

    public CustomServiceArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceId,
        @Nullable Output<CustomServiceTelemetryArgs> telemetry) {
        this.displayName = displayName;
        this.project = project;
        this.serviceId = serviceId;
        this.telemetry = telemetry;
    }

    private CustomServiceArgs() {
        this.displayName = Output.empty();
        this.project = Output.empty();
        this.serviceId = Output.empty();
        this.telemetry = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceId;
        private @Nullable Output<CustomServiceTelemetryArgs> telemetry;

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

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
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

        public Builder serviceId(@Nullable Output<String> serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = Output.ofNullable(serviceId);
            return this;
        }

        public Builder telemetry(@Nullable Output<CustomServiceTelemetryArgs> telemetry) {
            this.telemetry = telemetry;
            return this;
        }

        public Builder telemetry(@Nullable CustomServiceTelemetryArgs telemetry) {
            this.telemetry = Output.ofNullable(telemetry);
            return this;
        }
        public CustomServiceArgs build() {
            return new CustomServiceArgs(displayName, project, serviceId, telemetry);
        }
    }
}
