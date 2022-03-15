// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceBackendArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceBackendArgs Empty = new BackendServiceBackendArgs();

    /**
     * Specifies the balancing mode for this backend.
     * For global HTTP(S) or TCP/SSL load balancing, the default is
     * UTILIZATION. Valid values are UTILIZATION, RATE (for HTTP(S))
     * and CONNECTION (for TCP/SSL).
     * Default value is `UTILIZATION`.
     * Possible values are `UTILIZATION`, `RATE`, and `CONNECTION`.
     * 
     */
    @Import(name="balancingMode")
      private final @Nullable Output<String> balancingMode;

    public Output<String> getBalancingMode() {
        return this.balancingMode == null ? Output.empty() : this.balancingMode;
    }

    /**
     * A multiplier applied to the group's maximum servicing capacity
     * (based on UTILIZATION, RATE or CONNECTION).
     * Default value is 1, which means the group will serve up to 100%
     * of its configured capacity (depending on balancingMode). A
     * setting of 0 means the group is completely drained, offering
     * 0% of its available Capacity. Valid range is [0.0,1.0].
     * 
     */
    @Import(name="capacityScaler")
      private final @Nullable Output<Double> capacityScaler;

    public Output<Double> getCapacityScaler() {
        return this.capacityScaler == null ? Output.empty() : this.capacityScaler;
    }

    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The fully-qualified URL of an Instance Group or Network Endpoint
     * Group resource. In case of instance group this defines the list
     * of instances that serve traffic. Member virtual machine
     * instances from each instance group must live in the same zone as
     * the instance group itself. No two backends in a backend service
     * are allowed to use same Instance Group resource.
     * For Network Endpoint Groups this defines list of endpoints. All
     * endpoints of Network Endpoint Group must be hosted on instances
     * located in the same zone as the Network Endpoint Group.
     * Backend services cannot mix Instance Group and
     * Network Endpoint Group backends.
     * Note that you must specify an Instance Group or Network Endpoint
     * Group resource using the fully-qualified URL, rather than a
     * partial URL.
     * 
     */
    @Import(name="group", required=true)
      private final Output<String> group;

    public Output<String> getGroup() {
        return this.group;
    }

    /**
     * The maximum number of connections to the backend cluster.
     * Defaults to 1024.
     * 
     */
    @Import(name="maxConnections")
      private final @Nullable Output<Integer> maxConnections;

    public Output<Integer> getMaxConnections() {
        return this.maxConnections == null ? Output.empty() : this.maxConnections;
    }

    /**
     * The max number of simultaneous connections that a single backend
     * network endpoint can handle. This is used to calculate the
     * capacity of the group. Can be used in either CONNECTION or
     * UTILIZATION balancing modes.
     * For CONNECTION mode, either
     * maxConnections or maxConnectionsPerEndpoint must be set.
     * 
     */
    @Import(name="maxConnectionsPerEndpoint")
      private final @Nullable Output<Integer> maxConnectionsPerEndpoint;

    public Output<Integer> getMaxConnectionsPerEndpoint() {
        return this.maxConnectionsPerEndpoint == null ? Output.empty() : this.maxConnectionsPerEndpoint;
    }

    /**
     * The max number of simultaneous connections that a single
     * backend instance can handle. This is used to calculate the
     * capacity of the group. Can be used in either CONNECTION or
     * UTILIZATION balancing modes.
     * For CONNECTION mode, either maxConnections or
     * maxConnectionsPerInstance must be set.
     * 
     */
    @Import(name="maxConnectionsPerInstance")
      private final @Nullable Output<Integer> maxConnectionsPerInstance;

    public Output<Integer> getMaxConnectionsPerInstance() {
        return this.maxConnectionsPerInstance == null ? Output.empty() : this.maxConnectionsPerInstance;
    }

    /**
     * The max requests per second (RPS) of the group.
     * Can be used with either RATE or UTILIZATION balancing modes,
     * but required if RATE mode. For RATE mode, either maxRate or one
     * of maxRatePerInstance or maxRatePerEndpoint, as appropriate for
     * group type, must be set.
     * 
     */
    @Import(name="maxRate")
      private final @Nullable Output<Integer> maxRate;

    public Output<Integer> getMaxRate() {
        return this.maxRate == null ? Output.empty() : this.maxRate;
    }

    /**
     * The max requests per second (RPS) that a single backend network
     * endpoint can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerEndpoint must be set.
     * 
     */
    @Import(name="maxRatePerEndpoint")
      private final @Nullable Output<Double> maxRatePerEndpoint;

    public Output<Double> getMaxRatePerEndpoint() {
        return this.maxRatePerEndpoint == null ? Output.empty() : this.maxRatePerEndpoint;
    }

    /**
     * The max requests per second (RPS) that a single backend
     * instance can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerInstance must be set.
     * 
     */
    @Import(name="maxRatePerInstance")
      private final @Nullable Output<Double> maxRatePerInstance;

    public Output<Double> getMaxRatePerInstance() {
        return this.maxRatePerInstance == null ? Output.empty() : this.maxRatePerInstance;
    }

    /**
     * Used when balancingMode is UTILIZATION. This ratio defines the
     * CPU utilization target for the group. Valid range is [0.0, 1.0].
     * 
     */
    @Import(name="maxUtilization")
      private final @Nullable Output<Double> maxUtilization;

    public Output<Double> getMaxUtilization() {
        return this.maxUtilization == null ? Output.empty() : this.maxUtilization;
    }

    public BackendServiceBackendArgs(
        @Nullable Output<String> balancingMode,
        @Nullable Output<Double> capacityScaler,
        @Nullable Output<String> description,
        Output<String> group,
        @Nullable Output<Integer> maxConnections,
        @Nullable Output<Integer> maxConnectionsPerEndpoint,
        @Nullable Output<Integer> maxConnectionsPerInstance,
        @Nullable Output<Integer> maxRate,
        @Nullable Output<Double> maxRatePerEndpoint,
        @Nullable Output<Double> maxRatePerInstance,
        @Nullable Output<Double> maxUtilization) {
        this.balancingMode = balancingMode;
        this.capacityScaler = capacityScaler;
        this.description = description;
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.maxConnections = maxConnections;
        this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
        this.maxConnectionsPerInstance = maxConnectionsPerInstance;
        this.maxRate = maxRate;
        this.maxRatePerEndpoint = maxRatePerEndpoint;
        this.maxRatePerInstance = maxRatePerInstance;
        this.maxUtilization = maxUtilization;
    }

    private BackendServiceBackendArgs() {
        this.balancingMode = Output.empty();
        this.capacityScaler = Output.empty();
        this.description = Output.empty();
        this.group = Output.empty();
        this.maxConnections = Output.empty();
        this.maxConnectionsPerEndpoint = Output.empty();
        this.maxConnectionsPerInstance = Output.empty();
        this.maxRate = Output.empty();
        this.maxRatePerEndpoint = Output.empty();
        this.maxRatePerInstance = Output.empty();
        this.maxUtilization = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> balancingMode;
        private @Nullable Output<Double> capacityScaler;
        private @Nullable Output<String> description;
        private Output<String> group;
        private @Nullable Output<Integer> maxConnections;
        private @Nullable Output<Integer> maxConnectionsPerEndpoint;
        private @Nullable Output<Integer> maxConnectionsPerInstance;
        private @Nullable Output<Integer> maxRate;
        private @Nullable Output<Double> maxRatePerEndpoint;
        private @Nullable Output<Double> maxRatePerInstance;
        private @Nullable Output<Double> maxUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceBackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balancingMode = defaults.balancingMode;
    	      this.capacityScaler = defaults.capacityScaler;
    	      this.description = defaults.description;
    	      this.group = defaults.group;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxConnectionsPerEndpoint = defaults.maxConnectionsPerEndpoint;
    	      this.maxConnectionsPerInstance = defaults.maxConnectionsPerInstance;
    	      this.maxRate = defaults.maxRate;
    	      this.maxRatePerEndpoint = defaults.maxRatePerEndpoint;
    	      this.maxRatePerInstance = defaults.maxRatePerInstance;
    	      this.maxUtilization = defaults.maxUtilization;
        }

        public Builder balancingMode(@Nullable Output<String> balancingMode) {
            this.balancingMode = balancingMode;
            return this;
        }

        public Builder balancingMode(@Nullable String balancingMode) {
            this.balancingMode = Output.ofNullable(balancingMode);
            return this;
        }

        public Builder capacityScaler(@Nullable Output<Double> capacityScaler) {
            this.capacityScaler = capacityScaler;
            return this;
        }

        public Builder capacityScaler(@Nullable Double capacityScaler) {
            this.capacityScaler = Output.ofNullable(capacityScaler);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder group(Output<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder group(String group) {
            this.group = Output.of(Objects.requireNonNull(group));
            return this;
        }

        public Builder maxConnections(@Nullable Output<Integer> maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder maxConnections(@Nullable Integer maxConnections) {
            this.maxConnections = Output.ofNullable(maxConnections);
            return this;
        }

        public Builder maxConnectionsPerEndpoint(@Nullable Output<Integer> maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
            return this;
        }

        public Builder maxConnectionsPerEndpoint(@Nullable Integer maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = Output.ofNullable(maxConnectionsPerEndpoint);
            return this;
        }

        public Builder maxConnectionsPerInstance(@Nullable Output<Integer> maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = maxConnectionsPerInstance;
            return this;
        }

        public Builder maxConnectionsPerInstance(@Nullable Integer maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = Output.ofNullable(maxConnectionsPerInstance);
            return this;
        }

        public Builder maxRate(@Nullable Output<Integer> maxRate) {
            this.maxRate = maxRate;
            return this;
        }

        public Builder maxRate(@Nullable Integer maxRate) {
            this.maxRate = Output.ofNullable(maxRate);
            return this;
        }

        public Builder maxRatePerEndpoint(@Nullable Output<Double> maxRatePerEndpoint) {
            this.maxRatePerEndpoint = maxRatePerEndpoint;
            return this;
        }

        public Builder maxRatePerEndpoint(@Nullable Double maxRatePerEndpoint) {
            this.maxRatePerEndpoint = Output.ofNullable(maxRatePerEndpoint);
            return this;
        }

        public Builder maxRatePerInstance(@Nullable Output<Double> maxRatePerInstance) {
            this.maxRatePerInstance = maxRatePerInstance;
            return this;
        }

        public Builder maxRatePerInstance(@Nullable Double maxRatePerInstance) {
            this.maxRatePerInstance = Output.ofNullable(maxRatePerInstance);
            return this;
        }

        public Builder maxUtilization(@Nullable Output<Double> maxUtilization) {
            this.maxUtilization = maxUtilization;
            return this;
        }

        public Builder maxUtilization(@Nullable Double maxUtilization) {
            this.maxUtilization = Output.ofNullable(maxUtilization);
            return this;
        }
        public BackendServiceBackendArgs build() {
            return new BackendServiceBackendArgs(balancingMode, capacityScaler, description, group, maxConnections, maxConnectionsPerEndpoint, maxConnectionsPerInstance, maxRate, maxRatePerEndpoint, maxRatePerInstance, maxUtilization);
        }
    }
}
