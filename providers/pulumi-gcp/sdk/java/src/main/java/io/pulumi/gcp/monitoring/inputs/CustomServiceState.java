// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.CustomServiceTelemetryGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomServiceState extends io.pulumi.resources.ResourceArgs {

    public static final CustomServiceState Empty = new CustomServiceState();

    /**
     * Name used for UI elements listing this Service.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The full resource name for this service. The syntax is: projects/[PROJECT_ID]/services/[SERVICE_ID].
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * An optional service ID to use. If not given, the server will generate a
     * service ID.
     * 
     */
    @InputImport(name="serviceId")
        private final @Nullable Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId == null ? Input.empty() : this.serviceId;
    }

    /**
     * Configuration for how to query telemetry on a Service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="telemetry")
        private final @Nullable Input<CustomServiceTelemetryGetArgs> telemetry;

    public Input<CustomServiceTelemetryGetArgs> getTelemetry() {
        return this.telemetry == null ? Input.empty() : this.telemetry;
    }

    public CustomServiceState(
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> serviceId,
        @Nullable Input<CustomServiceTelemetryGetArgs> telemetry) {
        this.displayName = displayName;
        this.name = name;
        this.project = project;
        this.serviceId = serviceId;
        this.telemetry = telemetry;
    }

    private CustomServiceState() {
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.serviceId = Input.empty();
        this.telemetry = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> serviceId;
        private @Nullable Input<CustomServiceTelemetryGetArgs> telemetry;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setTelemetry(@Nullable Input<CustomServiceTelemetryGetArgs> telemetry) {
            this.telemetry = telemetry;
            return this;
        }

        public Builder setTelemetry(@Nullable CustomServiceTelemetryGetArgs telemetry) {
            this.telemetry = Input.ofNullable(telemetry);
            return this;
        }
        public CustomServiceState build() {
            return new CustomServiceState(displayName, name, project, serviceId, telemetry);
        }
    }
}
