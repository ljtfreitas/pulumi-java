// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.AvailabilityCriteriaArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.LatencyCriteriaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An SLI measuring performance on a well-known service type. Performance will be computed on the basis of pre-defined metrics. The type of the service_resource determines the metrics to use and the service_resource.labels and metric_labels are used to construct a monitoring filter to filter that metric down to just the data relevant to this service.
 * 
 */
public final class BasicSliArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicSliArgs Empty = new BasicSliArgs();

    /**
     * Good service is defined to be the count of requests made to this service that return successfully.
     * 
     */
    @InputImport(name="availability")
      private final @Nullable Input<AvailabilityCriteriaArgs> availability;

    public Input<AvailabilityCriteriaArgs> getAvailability() {
        return this.availability == null ? Input.empty() : this.availability;
    }

    /**
     * Good service is defined to be the count of requests made to this service that are fast enough with respect to latency.threshold.
     * 
     */
    @InputImport(name="latency")
      private final @Nullable Input<LatencyCriteriaArgs> latency;

    public Input<LatencyCriteriaArgs> getLatency() {
        return this.latency == null ? Input.empty() : this.latency;
    }

    /**
     * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations will not be used to calculate performance for this SLI. If omitted, this SLI applies to all locations in which the Service has activity. For service types that don't support breaking down by location, setting this field will result in an error.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<List<String>> location;

    public Input<List<String>> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not be used to calculate performance for this SLI. If omitted, this SLI applies to all the Service's methods. For service types that don't support breaking down by method, setting this field will result in an error.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<List<String>> method;

    public Input<List<String>> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API versions will not be used to calculate performance for this SLI. If omitted, this SLI applies to all API versions. For service types that don't support breaking down by version, setting this field will result in an error.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<List<String>> version;

    public Input<List<String>> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public BasicSliArgs(
        @Nullable Input<AvailabilityCriteriaArgs> availability,
        @Nullable Input<LatencyCriteriaArgs> latency,
        @Nullable Input<List<String>> location,
        @Nullable Input<List<String>> method,
        @Nullable Input<List<String>> version) {
        this.availability = availability;
        this.latency = latency;
        this.location = location;
        this.method = method;
        this.version = version;
    }

    private BasicSliArgs() {
        this.availability = Input.empty();
        this.latency = Input.empty();
        this.location = Input.empty();
        this.method = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicSliArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AvailabilityCriteriaArgs> availability;
        private @Nullable Input<LatencyCriteriaArgs> latency;
        private @Nullable Input<List<String>> location;
        private @Nullable Input<List<String>> method;
        private @Nullable Input<List<String>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicSliArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.latency = defaults.latency;
    	      this.location = defaults.location;
    	      this.method = defaults.method;
    	      this.version = defaults.version;
        }

        public Builder setAvailability(@Nullable Input<AvailabilityCriteriaArgs> availability) {
            this.availability = availability;
            return this;
        }

        public Builder setAvailability(@Nullable AvailabilityCriteriaArgs availability) {
            this.availability = Input.ofNullable(availability);
            return this;
        }

        public Builder setLatency(@Nullable Input<LatencyCriteriaArgs> latency) {
            this.latency = latency;
            return this;
        }

        public Builder setLatency(@Nullable LatencyCriteriaArgs latency) {
            this.latency = Input.ofNullable(latency);
            return this;
        }

        public Builder setLocation(@Nullable Input<List<String>> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable List<String> location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMethod(@Nullable Input<List<String>> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable List<String> method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setVersion(@Nullable Input<List<String>> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable List<String> version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public BasicSliArgs build() {
            return new BasicSliArgs(availability, latency, location, method, version);
        }
    }
}
