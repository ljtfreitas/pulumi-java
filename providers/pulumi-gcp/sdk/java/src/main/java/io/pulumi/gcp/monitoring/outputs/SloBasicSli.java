// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.monitoring.outputs.SloBasicSliAvailability;
import io.pulumi.gcp.monitoring.outputs.SloBasicSliLatency;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloBasicSli {
    /**
     * Availability based SLI, dervied from count of requests made to this service that return successfully.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloBasicSliAvailability availability;
    /**
     * Parameters for a latency threshold SLI.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloBasicSliLatency latency;
    /**
     * An optional set of locations to which this SLI is relevant.
     * Telemetry from other locations will not be used to calculate
     * performance for this SLI. If omitted, this SLI applies to all
     * locations in which the Service has activity. For service types
     * that don't support breaking down by location, setting this
     * field will result in an error.
     * 
     */
    private final @Nullable List<String> locations;
    /**
     * An optional set of RPCs to which this SLI is relevant.
     * Telemetry from other methods will not be used to calculate
     * performance for this SLI. If omitted, this SLI applies to all
     * the Service's methods. For service types that don't support
     * breaking down by method, setting this field will result in an
     * error.
     * 
     */
    private final @Nullable List<String> methods;
    /**
     * The set of API versions to which this SLI is relevant.
     * Telemetry from other API versions will not be used to
     * calculate performance for this SLI. If omitted,
     * this SLI applies to all API versions. For service types
     * that don't support breaking down by version, setting this
     * field will result in an error.
     * 
     */
    private final @Nullable List<String> versions;

    @CustomType.Constructor
    private SloBasicSli(
        @CustomType.Parameter("availability") @Nullable SloBasicSliAvailability availability,
        @CustomType.Parameter("latency") @Nullable SloBasicSliLatency latency,
        @CustomType.Parameter("locations") @Nullable List<String> locations,
        @CustomType.Parameter("methods") @Nullable List<String> methods,
        @CustomType.Parameter("versions") @Nullable List<String> versions) {
        this.availability = availability;
        this.latency = latency;
        this.locations = locations;
        this.methods = methods;
        this.versions = versions;
    }

    /**
     * Availability based SLI, dervied from count of requests made to this service that return successfully.
     * Structure is documented below.
     * 
    */
    public Optional<SloBasicSliAvailability> getAvailability() {
        return Optional.ofNullable(this.availability);
    }
    /**
     * Parameters for a latency threshold SLI.
     * Structure is documented below.
     * 
    */
    public Optional<SloBasicSliLatency> getLatency() {
        return Optional.ofNullable(this.latency);
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
    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
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
    public List<String> getMethods() {
        return this.methods == null ? List.of() : this.methods;
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
    public List<String> getVersions() {
        return this.versions == null ? List.of() : this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloBasicSli defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SloBasicSliAvailability availability;
        private @Nullable SloBasicSliLatency latency;
        private @Nullable List<String> locations;
        private @Nullable List<String> methods;
        private @Nullable List<String> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SloBasicSli defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.latency = defaults.latency;
    	      this.locations = defaults.locations;
    	      this.methods = defaults.methods;
    	      this.versions = defaults.versions;
        }

        public Builder availability(@Nullable SloBasicSliAvailability availability) {
            this.availability = availability;
            return this;
        }

        public Builder latency(@Nullable SloBasicSliLatency latency) {
            this.latency = latency;
            return this;
        }

        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder methods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }

        public Builder versions(@Nullable List<String> versions) {
            this.versions = versions;
            return this;
        }
        public SloBasicSli build() {
            return new SloBasicSli(availability, latency, locations, methods, versions);
        }
    }
}
