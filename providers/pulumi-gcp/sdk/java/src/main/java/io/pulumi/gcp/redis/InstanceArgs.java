// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs;
import io.pulumi.gcp.redis.inputs.InstanceMaintenanceScheduleArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Only applicable to STANDARD_HA tier which protects the instance
     * against zonal failures by provisioning it across two zones.
     * If provided, it must be a different zone from the one provided in
     * [locationId].
     * 
     */
    @Import(name="alternativeLocationId")
      private final @Nullable Output<String> alternativeLocationId;

    public Output<String> getAlternativeLocationId() {
        return this.alternativeLocationId == null ? Output.empty() : this.alternativeLocationId;
    }

    /**
     * Optional. Indicates whether OSS Redis AUTH is enabled for the
     * instance. If set to "true" AUTH is enabled on the instance.
     * Default value is "false" meaning AUTH is disabled.
     * 
     */
    @Import(name="authEnabled")
      private final @Nullable Output<Boolean> authEnabled;

    public Output<Boolean> getAuthEnabled() {
        return this.authEnabled == null ? Output.empty() : this.authEnabled;
    }

    /**
     * The full name of the Google Compute Engine network to which the
     * instance is connected. If left unspecified, the default network
     * will be used.
     * 
     */
    @Import(name="authorizedNetwork")
      private final @Nullable Output<String> authorizedNetwork;

    public Output<String> getAuthorizedNetwork() {
        return this.authorizedNetwork == null ? Output.empty() : this.authorizedNetwork;
    }

    /**
     * The connection mode of the Redis instance.
     * Default value is `DIRECT_PEERING`.
     * Possible values are `DIRECT_PEERING` and `PRIVATE_SERVICE_ACCESS`.
     * 
     */
    @Import(name="connectMode")
      private final @Nullable Output<String> connectMode;

    public Output<String> getConnectMode() {
        return this.connectMode == null ? Output.empty() : this.connectMode;
    }

    /**
     * An arbitrary and optional user-provided name for the instance.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The zone where the instance will be provisioned. If not provided,
     * the service will choose a zone for the instance. For STANDARD_HA tier,
     * instances will be created across two zones for protection against
     * zonal failures. If [alternativeLocationId] is also provided, it must
     * be different from [locationId].
     * 
     */
    @Import(name="locationId")
      private final @Nullable Output<String> locationId;

    public Output<String> getLocationId() {
        return this.locationId == null ? Output.empty() : this.locationId;
    }

    /**
     * Maintenance policy for an instance.
     * Structure is documented below.
     * 
     */
    @Import(name="maintenancePolicy")
      private final @Nullable Output<InstanceMaintenancePolicyArgs> maintenancePolicy;

    public Output<InstanceMaintenancePolicyArgs> getMaintenancePolicy() {
        return this.maintenancePolicy == null ? Output.empty() : this.maintenancePolicy;
    }

    /**
     * Upcoming maintenance schedule.
     * Structure is documented below.
     * 
     */
    @Import(name="maintenanceSchedule")
      private final @Nullable Output<InstanceMaintenanceScheduleArgs> maintenanceSchedule;

    public Output<InstanceMaintenanceScheduleArgs> getMaintenanceSchedule() {
        return this.maintenanceSchedule == null ? Output.empty() : this.maintenanceSchedule;
    }

    /**
     * Redis memory size in GiB.
     * 
     */
    @Import(name="memorySizeGb", required=true)
      private final Output<Integer> memorySizeGb;

    public Output<Integer> getMemorySizeGb() {
        return this.memorySizeGb;
    }

    /**
     * The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
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
     * Optional. Read replica mode. Can only be specified when trying to create the instance. If not set, Memorystore Redis
     * backend will default to READ_REPLICAS_DISABLED. - READ_REPLICAS_DISABLED: If disabled, read endpoint will not be
     * provided and the instance cannot scale up or down the number of replicas. - READ_REPLICAS_ENABLED: If enabled, read
     * endpoint will be provided and the instance can scale up and down the number of replicas. Default value:
     * "READ_REPLICAS_DISABLED" Possible values: ["READ_REPLICAS_DISABLED", "READ_REPLICAS_ENABLED"]
     * 
     */
    @Import(name="readReplicasMode")
      private final @Nullable Output<String> readReplicasMode;

    public Output<String> getReadReplicasMode() {
        return this.readReplicasMode == null ? Output.empty() : this.readReplicasMode;
    }

    /**
     * Redis configuration parameters, according to http://redis.io/topics/config.
     * Please check Memorystore documentation for the list of supported parameters:
     * https://cloud.google.com/memorystore/docs/redis/reference/rest/v1/projects.locations.instances#Instance.FIELDS.redis_configs
     * 
     */
    @Import(name="redisConfigs")
      private final @Nullable Output<Map<String,String>> redisConfigs;

    public Output<Map<String,String>> getRedisConfigs() {
        return this.redisConfigs == null ? Output.empty() : this.redisConfigs;
    }

    /**
     * The version of Redis software. If not provided, latest supported
     * version will be used. Please check the API documentation linked
     * at the top for the latest valid values.
     * 
     */
    @Import(name="redisVersion")
      private final @Nullable Output<String> redisVersion;

    public Output<String> getRedisVersion() {
        return this.redisVersion == null ? Output.empty() : this.redisVersion;
    }

    /**
     * The name of the Redis region of the instance.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and
     * defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default
     * is 1. The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    @Import(name="replicaCount")
      private final @Nullable Output<Integer> replicaCount;

    public Output<Integer> getReplicaCount() {
        return this.replicaCount == null ? Output.empty() : this.replicaCount;
    }

    /**
     * The CIDR range of internal addresses that are reserved for this
     * instance. If not provided, the service will choose an unused /29
     * block, for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be
     * unique and non-overlapping with existing subnets in an authorized
     * network.
     * 
     */
    @Import(name="reservedIpRange")
      private final @Nullable Output<String> reservedIpRange;

    public Output<String> getReservedIpRange() {
        return this.reservedIpRange == null ? Output.empty() : this.reservedIpRange;
    }

    /**
     * The service tier of the instance. Must be one of these values:
     * - BASIC: standalone instance
     * - STANDARD_HA: highly available primary/replica instances
     *   Default value is `BASIC`.
     *   Possible values are `BASIC` and `STANDARD_HA`.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    /**
     * The TLS mode of the Redis instance, If not provided, TLS is disabled for the instance.
     * - SERVER_AUTHENTICATION: Client to Server traffic encryption enabled with server authentication
     *   Default value is `DISABLED`.
     *   Possible values are `SERVER_AUTHENTICATION` and `DISABLED`.
     * 
     */
    @Import(name="transitEncryptionMode")
      private final @Nullable Output<String> transitEncryptionMode;

    public Output<String> getTransitEncryptionMode() {
        return this.transitEncryptionMode == null ? Output.empty() : this.transitEncryptionMode;
    }

    public InstanceArgs(
        @Nullable Output<String> alternativeLocationId,
        @Nullable Output<Boolean> authEnabled,
        @Nullable Output<String> authorizedNetwork,
        @Nullable Output<String> connectMode,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> locationId,
        @Nullable Output<InstanceMaintenancePolicyArgs> maintenancePolicy,
        @Nullable Output<InstanceMaintenanceScheduleArgs> maintenanceSchedule,
        Output<Integer> memorySizeGb,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> readReplicasMode,
        @Nullable Output<Map<String,String>> redisConfigs,
        @Nullable Output<String> redisVersion,
        @Nullable Output<String> region,
        @Nullable Output<Integer> replicaCount,
        @Nullable Output<String> reservedIpRange,
        @Nullable Output<String> tier,
        @Nullable Output<String> transitEncryptionMode) {
        this.alternativeLocationId = alternativeLocationId;
        this.authEnabled = authEnabled;
        this.authorizedNetwork = authorizedNetwork;
        this.connectMode = connectMode;
        this.displayName = displayName;
        this.labels = labels;
        this.locationId = locationId;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceSchedule = maintenanceSchedule;
        this.memorySizeGb = Objects.requireNonNull(memorySizeGb, "expected parameter 'memorySizeGb' to be non-null");
        this.name = name;
        this.project = project;
        this.readReplicasMode = readReplicasMode;
        this.redisConfigs = redisConfigs;
        this.redisVersion = redisVersion;
        this.region = region;
        this.replicaCount = replicaCount;
        this.reservedIpRange = reservedIpRange;
        this.tier = tier;
        this.transitEncryptionMode = transitEncryptionMode;
    }

    private InstanceArgs() {
        this.alternativeLocationId = Output.empty();
        this.authEnabled = Output.empty();
        this.authorizedNetwork = Output.empty();
        this.connectMode = Output.empty();
        this.displayName = Output.empty();
        this.labels = Output.empty();
        this.locationId = Output.empty();
        this.maintenancePolicy = Output.empty();
        this.maintenanceSchedule = Output.empty();
        this.memorySizeGb = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.readReplicasMode = Output.empty();
        this.redisConfigs = Output.empty();
        this.redisVersion = Output.empty();
        this.region = Output.empty();
        this.replicaCount = Output.empty();
        this.reservedIpRange = Output.empty();
        this.tier = Output.empty();
        this.transitEncryptionMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alternativeLocationId;
        private @Nullable Output<Boolean> authEnabled;
        private @Nullable Output<String> authorizedNetwork;
        private @Nullable Output<String> connectMode;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> locationId;
        private @Nullable Output<InstanceMaintenancePolicyArgs> maintenancePolicy;
        private @Nullable Output<InstanceMaintenanceScheduleArgs> maintenanceSchedule;
        private Output<Integer> memorySizeGb;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> readReplicasMode;
        private @Nullable Output<Map<String,String>> redisConfigs;
        private @Nullable Output<String> redisVersion;
        private @Nullable Output<String> region;
        private @Nullable Output<Integer> replicaCount;
        private @Nullable Output<String> reservedIpRange;
        private @Nullable Output<String> tier;
        private @Nullable Output<String> transitEncryptionMode;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeLocationId = defaults.alternativeLocationId;
    	      this.authEnabled = defaults.authEnabled;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.connectMode = defaults.connectMode;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.locationId = defaults.locationId;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceSchedule = defaults.maintenanceSchedule;
    	      this.memorySizeGb = defaults.memorySizeGb;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.readReplicasMode = defaults.readReplicasMode;
    	      this.redisConfigs = defaults.redisConfigs;
    	      this.redisVersion = defaults.redisVersion;
    	      this.region = defaults.region;
    	      this.replicaCount = defaults.replicaCount;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.tier = defaults.tier;
    	      this.transitEncryptionMode = defaults.transitEncryptionMode;
        }

        public Builder alternativeLocationId(@Nullable Output<String> alternativeLocationId) {
            this.alternativeLocationId = alternativeLocationId;
            return this;
        }

        public Builder alternativeLocationId(@Nullable String alternativeLocationId) {
            this.alternativeLocationId = Output.ofNullable(alternativeLocationId);
            return this;
        }

        public Builder authEnabled(@Nullable Output<Boolean> authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }

        public Builder authEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = Output.ofNullable(authEnabled);
            return this;
        }

        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }

        public Builder authorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Output.ofNullable(authorizedNetwork);
            return this;
        }

        public Builder connectMode(@Nullable Output<String> connectMode) {
            this.connectMode = connectMode;
            return this;
        }

        public Builder connectMode(@Nullable String connectMode) {
            this.connectMode = Output.ofNullable(connectMode);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder locationId(@Nullable Output<String> locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder locationId(@Nullable String locationId) {
            this.locationId = Output.ofNullable(locationId);
            return this;
        }

        public Builder maintenancePolicy(@Nullable Output<InstanceMaintenancePolicyArgs> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }

        public Builder maintenancePolicy(@Nullable InstanceMaintenancePolicyArgs maintenancePolicy) {
            this.maintenancePolicy = Output.ofNullable(maintenancePolicy);
            return this;
        }

        public Builder maintenanceSchedule(@Nullable Output<InstanceMaintenanceScheduleArgs> maintenanceSchedule) {
            this.maintenanceSchedule = maintenanceSchedule;
            return this;
        }

        public Builder maintenanceSchedule(@Nullable InstanceMaintenanceScheduleArgs maintenanceSchedule) {
            this.maintenanceSchedule = Output.ofNullable(maintenanceSchedule);
            return this;
        }

        public Builder memorySizeGb(Output<Integer> memorySizeGb) {
            this.memorySizeGb = Objects.requireNonNull(memorySizeGb);
            return this;
        }

        public Builder memorySizeGb(Integer memorySizeGb) {
            this.memorySizeGb = Output.of(Objects.requireNonNull(memorySizeGb));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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

        public Builder readReplicasMode(@Nullable Output<String> readReplicasMode) {
            this.readReplicasMode = readReplicasMode;
            return this;
        }

        public Builder readReplicasMode(@Nullable String readReplicasMode) {
            this.readReplicasMode = Output.ofNullable(readReplicasMode);
            return this;
        }

        public Builder redisConfigs(@Nullable Output<Map<String,String>> redisConfigs) {
            this.redisConfigs = redisConfigs;
            return this;
        }

        public Builder redisConfigs(@Nullable Map<String,String> redisConfigs) {
            this.redisConfigs = Output.ofNullable(redisConfigs);
            return this;
        }

        public Builder redisVersion(@Nullable Output<String> redisVersion) {
            this.redisVersion = redisVersion;
            return this;
        }

        public Builder redisVersion(@Nullable String redisVersion) {
            this.redisVersion = Output.ofNullable(redisVersion);
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder replicaCount(@Nullable Output<Integer> replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder replicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = Output.ofNullable(replicaCount);
            return this;
        }

        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }

        public Builder reservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Output.ofNullable(reservedIpRange);
            return this;
        }

        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }

        public Builder transitEncryptionMode(@Nullable Output<String> transitEncryptionMode) {
            this.transitEncryptionMode = transitEncryptionMode;
            return this;
        }

        public Builder transitEncryptionMode(@Nullable String transitEncryptionMode) {
            this.transitEncryptionMode = Output.ofNullable(transitEncryptionMode);
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(alternativeLocationId, authEnabled, authorizedNetwork, connectMode, displayName, labels, locationId, maintenancePolicy, maintenanceSchedule, memorySizeGb, name, project, readReplicasMode, redisConfigs, redisVersion, region, replicaCount, reservedIpRange, tier, transitEncryptionMode);
        }
    }
}
