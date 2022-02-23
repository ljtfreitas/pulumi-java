// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.SloBasicSliAvailabilityGetArgs;
import io.pulumi.gcp.monitoring.inputs.SloBasicSliLatencyGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloBasicSliGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloBasicSliGetArgs Empty = new SloBasicSliGetArgs();

    /**
     * Availability based SLI, dervied from count of requests made to this service that return successfully.
     * Structure is documented below.
     * 
     */
    @InputImport(name="availability")
        private final @Nullable Input<SloBasicSliAvailabilityGetArgs> availability;

    public Input<SloBasicSliAvailabilityGetArgs> getAvailability() {
        return this.availability == null ? Input.empty() : this.availability;
    }

    /**
     * Parameters for a latency threshold SLI.
     * Structure is documented below.
     * 
     */
    @InputImport(name="latency")
        private final @Nullable Input<SloBasicSliLatencyGetArgs> latency;

    public Input<SloBasicSliLatencyGetArgs> getLatency() {
        return this.latency == null ? Input.empty() : this.latency;
    }

    /**
     * An optional set of locations to which this SLI is relevant.
     * Telemetry from other locations will not be used to calculate
     * performance for this SLI. If omitted, this SLI applies to all
     * locations in which the Service has activity. For service types
     * that don't support breaking down by location, setting this
     * field will result in an error.
     * 
     */
    @InputImport(name="locations")
        private final @Nullable Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations == null ? Input.empty() : this.locations;
    }

    /**
     * An optional set of RPCs to which this SLI is relevant.
     * Telemetry from other methods will not be used to calculate
     * performance for this SLI. If omitted, this SLI applies to all
     * the Service's methods. For service types that don't support
     * breaking down by method, setting this field will result in an
     * error.
     * 
     */
    @InputImport(name="methods")
        private final @Nullable Input<List<String>> methods;

    public Input<List<String>> getMethods() {
        return this.methods == null ? Input.empty() : this.methods;
    }

    /**
     * The set of API versions to which this SLI is relevant.
     * Telemetry from other API versions will not be used to
     * calculate performance for this SLI. If omitted,
     * this SLI applies to all API versions. For service types
     * that don't support breaking down by version, setting this
     * field will result in an error.
     * 
     */
    @InputImport(name="versions")
        private final @Nullable Input<List<String>> versions;

    public Input<List<String>> getVersions() {
        return this.versions == null ? Input.empty() : this.versions;
    }

    public SloBasicSliGetArgs(
        @Nullable Input<SloBasicSliAvailabilityGetArgs> availability,
        @Nullable Input<SloBasicSliLatencyGetArgs> latency,
        @Nullable Input<List<String>> locations,
        @Nullable Input<List<String>> methods,
        @Nullable Input<List<String>> versions) {
        this.availability = availability;
        this.latency = latency;
        this.locations = locations;
        this.methods = methods;
        this.versions = versions;
    }

    private SloBasicSliGetArgs() {
        this.availability = Input.empty();
        this.latency = Input.empty();
        this.locations = Input.empty();
        this.methods = Input.empty();
        this.versions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloBasicSliGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SloBasicSliAvailabilityGetArgs> availability;
        private @Nullable Input<SloBasicSliLatencyGetArgs> latency;
        private @Nullable Input<List<String>> locations;
        private @Nullable Input<List<String>> methods;
        private @Nullable Input<List<String>> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SloBasicSliGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.latency = defaults.latency;
    	      this.locations = defaults.locations;
    	      this.methods = defaults.methods;
    	      this.versions = defaults.versions;
        }

        public Builder setAvailability(@Nullable Input<SloBasicSliAvailabilityGetArgs> availability) {
            this.availability = availability;
            return this;
        }

        public Builder setAvailability(@Nullable SloBasicSliAvailabilityGetArgs availability) {
            this.availability = Input.ofNullable(availability);
            return this;
        }

        public Builder setLatency(@Nullable Input<SloBasicSliLatencyGetArgs> latency) {
            this.latency = latency;
            return this;
        }

        public Builder setLatency(@Nullable SloBasicSliLatencyGetArgs latency) {
            this.latency = Input.ofNullable(latency);
            return this;
        }

        public Builder setLocations(@Nullable Input<List<String>> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = Input.ofNullable(locations);
            return this;
        }

        public Builder setMethods(@Nullable Input<List<String>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder setMethods(@Nullable List<String> methods) {
            this.methods = Input.ofNullable(methods);
            return this;
        }

        public Builder setVersions(@Nullable Input<List<String>> versions) {
            this.versions = versions;
            return this;
        }

        public Builder setVersions(@Nullable List<String> versions) {
            this.versions = Input.ofNullable(versions);
            return this;
        }
        public SloBasicSliGetArgs build() {
            return new SloBasicSliGetArgs(availability, latency, locations, methods, versions);
        }
    }
}
