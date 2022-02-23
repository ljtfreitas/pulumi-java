// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyGetArgs;
import io.pulumi.gcp.redis.inputs.InstanceMaintenanceScheduleGetArgs;
import io.pulumi.gcp.redis.inputs.InstanceNodeGetArgs;
import io.pulumi.gcp.redis.inputs.InstanceServerCaCertGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * Only applicable to STANDARD_HA tier which protects the instance
     * against zonal failures by provisioning it across two zones.
     * If provided, it must be a different zone from the one provided in
     * [locationId].
     * 
     */
    @InputImport(name="alternativeLocationId")
        private final @Nullable Input<String> alternativeLocationId;

    public Input<String> getAlternativeLocationId() {
        return this.alternativeLocationId == null ? Input.empty() : this.alternativeLocationId;
    }

    /**
     * Optional. Indicates whether OSS Redis AUTH is enabled for the
     * instance. If set to "true" AUTH is enabled on the instance.
     * Default value is "false" meaning AUTH is disabled.
     * 
     */
    @InputImport(name="authEnabled")
        private final @Nullable Input<Boolean> authEnabled;

    public Input<Boolean> getAuthEnabled() {
        return this.authEnabled == null ? Input.empty() : this.authEnabled;
    }

    /**
     * AUTH String set on the instance. This field will only be populated if auth_enabled is true.
     * 
     */
    @InputImport(name="authString")
        private final @Nullable Input<String> authString;

    public Input<String> getAuthString() {
        return this.authString == null ? Input.empty() : this.authString;
    }

    /**
     * The full name of the Google Compute Engine network to which the
     * instance is connected. If left unspecified, the default network
     * will be used.
     * 
     */
    @InputImport(name="authorizedNetwork")
        private final @Nullable Input<String> authorizedNetwork;

    public Input<String> getAuthorizedNetwork() {
        return this.authorizedNetwork == null ? Input.empty() : this.authorizedNetwork;
    }

    /**
     * The connection mode of the Redis instance.
     * Default value is `DIRECT_PEERING`.
     * Possible values are `DIRECT_PEERING` and `PRIVATE_SERVICE_ACCESS`.
     * 
     */
    @InputImport(name="connectMode")
        private final @Nullable Input<String> connectMode;

    public Input<String> getConnectMode() {
        return this.connectMode == null ? Input.empty() : this.connectMode;
    }

    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @InputImport(name="createTime")
        private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The current zone where the Redis endpoint is placed. For Basic Tier instances, this will always be the same as the
     * [locationId] provided by the user at creation time. For Standard Tier instances, this can be either [locationId] or
     * [alternativeLocationId] and can change after a failover event.
     * 
     */
    @InputImport(name="currentLocationId")
        private final @Nullable Input<String> currentLocationId;

    public Input<String> getCurrentLocationId() {
        return this.currentLocationId == null ? Input.empty() : this.currentLocationId;
    }

    /**
     * An arbitrary and optional user-provided name for the instance.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Hostname or IP address of the exposed Redis endpoint used by clients to connect to the service.
     * 
     */
    @InputImport(name="host")
        private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @InputImport(name="labels")
        private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The zone where the instance will be provisioned. If not provided,
     * the service will choose a zone for the instance. For STANDARD_HA tier,
     * instances will be created across two zones for protection against
     * zonal failures. If [alternativeLocationId] is also provided, it must
     * be different from [locationId].
     * 
     */
    @InputImport(name="locationId")
        private final @Nullable Input<String> locationId;

    public Input<String> getLocationId() {
        return this.locationId == null ? Input.empty() : this.locationId;
    }

    /**
     * Maintenance policy for an instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="maintenancePolicy")
        private final @Nullable Input<InstanceMaintenancePolicyGetArgs> maintenancePolicy;

    public Input<InstanceMaintenancePolicyGetArgs> getMaintenancePolicy() {
        return this.maintenancePolicy == null ? Input.empty() : this.maintenancePolicy;
    }

    /**
     * Upcoming maintenance schedule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="maintenanceSchedule")
        private final @Nullable Input<InstanceMaintenanceScheduleGetArgs> maintenanceSchedule;

    public Input<InstanceMaintenanceScheduleGetArgs> getMaintenanceSchedule() {
        return this.maintenanceSchedule == null ? Input.empty() : this.maintenanceSchedule;
    }

    /**
     * Redis memory size in GiB.
     * 
     */
    @InputImport(name="memorySizeGb")
        private final @Nullable Input<Integer> memorySizeGb;

    public Input<Integer> getMemorySizeGb() {
        return this.memorySizeGb == null ? Input.empty() : this.memorySizeGb;
    }

    /**
     * The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Output only. Info per node.
     * 
     */
    @InputImport(name="nodes")
        private final @Nullable Input<List<InstanceNodeGetArgs>> nodes;

    public Input<List<InstanceNodeGetArgs>> getNodes() {
        return this.nodes == null ? Input.empty() : this.nodes;
    }

    /**
     * Output only. Cloud IAM identity used by import / export operations to transfer data to/from Cloud Storage. Format is
     * "serviceAccount:". The value may change over time for a given instance so should be checked before each import/export
     * operation.
     * 
     */
    @InputImport(name="persistenceIamIdentity")
        private final @Nullable Input<String> persistenceIamIdentity;

    public Input<String> getPersistenceIamIdentity() {
        return this.persistenceIamIdentity == null ? Input.empty() : this.persistenceIamIdentity;
    }

    /**
     * The port number of the exposed Redis endpoint.
     * 
     */
    @InputImport(name="port")
        private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
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
     * Output only. Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only. Targets all healthy
     * replica nodes in instance. Replication is asynchronous and replica nodes will exhibit some lag behind the primary. Write
     * requests must target 'host'.
     * 
     */
    @InputImport(name="readEndpoint")
        private final @Nullable Input<String> readEndpoint;

    public Input<String> getReadEndpoint() {
        return this.readEndpoint == null ? Input.empty() : this.readEndpoint;
    }

    /**
     * Output only. The port number of the exposed readonly redis endpoint. Standard tier only. Write requests should target
     * 'port'.
     * 
     */
    @InputImport(name="readEndpointPort")
        private final @Nullable Input<Integer> readEndpointPort;

    public Input<Integer> getReadEndpointPort() {
        return this.readEndpointPort == null ? Input.empty() : this.readEndpointPort;
    }

    /**
     * Optional. Read replica mode. Can only be specified when trying to create the instance. If not set, Memorystore Redis
     * backend will default to READ_REPLICAS_DISABLED. - READ_REPLICAS_DISABLED: If disabled, read endpoint will not be
     * provided and the instance cannot scale up or down the number of replicas. - READ_REPLICAS_ENABLED: If enabled, read
     * endpoint will be provided and the instance can scale up and down the number of replicas. Default value:
     * "READ_REPLICAS_DISABLED" Possible values: ["READ_REPLICAS_DISABLED", "READ_REPLICAS_ENABLED"]
     * 
     */
    @InputImport(name="readReplicasMode")
        private final @Nullable Input<String> readReplicasMode;

    public Input<String> getReadReplicasMode() {
        return this.readReplicasMode == null ? Input.empty() : this.readReplicasMode;
    }

    /**
     * Redis configuration parameters, according to http://redis.io/topics/config.
     * Please check Memorystore documentation for the list of supported parameters:
     * https://cloud.google.com/memorystore/docs/redis/reference/rest/v1/projects.locations.instances#Instance.FIELDS.redis_configs
     * 
     */
    @InputImport(name="redisConfigs")
        private final @Nullable Input<Map<String,String>> redisConfigs;

    public Input<Map<String,String>> getRedisConfigs() {
        return this.redisConfigs == null ? Input.empty() : this.redisConfigs;
    }

    /**
     * The version of Redis software. If not provided, latest supported
     * version will be used. Please check the API documentation linked
     * at the top for the latest valid values.
     * 
     */
    @InputImport(name="redisVersion")
        private final @Nullable Input<String> redisVersion;

    public Input<String> getRedisVersion() {
        return this.redisVersion == null ? Input.empty() : this.redisVersion;
    }

    /**
     * The name of the Redis region of the instance.
     * 
     */
    @InputImport(name="region")
        private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and
     * defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default
     * is 1. The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    @InputImport(name="replicaCount")
        private final @Nullable Input<Integer> replicaCount;

    public Input<Integer> getReplicaCount() {
        return this.replicaCount == null ? Input.empty() : this.replicaCount;
    }

    /**
     * The CIDR range of internal addresses that are reserved for this
     * instance. If not provided, the service will choose an unused /29
     * block, for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be
     * unique and non-overlapping with existing subnets in an authorized
     * network.
     * 
     */
    @InputImport(name="reservedIpRange")
        private final @Nullable Input<String> reservedIpRange;

    public Input<String> getReservedIpRange() {
        return this.reservedIpRange == null ? Input.empty() : this.reservedIpRange;
    }

    /**
     * List of server CA certificates for the instance.
     * 
     */
    @InputImport(name="serverCaCerts")
        private final @Nullable Input<List<InstanceServerCaCertGetArgs>> serverCaCerts;

    public Input<List<InstanceServerCaCertGetArgs>> getServerCaCerts() {
        return this.serverCaCerts == null ? Input.empty() : this.serverCaCerts;
    }

    /**
     * The service tier of the instance. Must be one of these values:
     * - BASIC: standalone instance
     * - STANDARD_HA: highly available primary/replica instances
     *   Default value is `BASIC`.
     *   Possible values are `BASIC` and `STANDARD_HA`.
     * 
     */
    @InputImport(name="tier")
        private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    /**
     * The TLS mode of the Redis instance, If not provided, TLS is disabled for the instance.
     * - SERVER_AUTHENTICATION: Client to Server traffic encryption enabled with server authentication
     *   Default value is `DISABLED`.
     *   Possible values are `SERVER_AUTHENTICATION` and `DISABLED`.
     * 
     */
    @InputImport(name="transitEncryptionMode")
        private final @Nullable Input<String> transitEncryptionMode;

    public Input<String> getTransitEncryptionMode() {
        return this.transitEncryptionMode == null ? Input.empty() : this.transitEncryptionMode;
    }

    public InstanceState(
        @Nullable Input<String> alternativeLocationId,
        @Nullable Input<Boolean> authEnabled,
        @Nullable Input<String> authString,
        @Nullable Input<String> authorizedNetwork,
        @Nullable Input<String> connectMode,
        @Nullable Input<String> createTime,
        @Nullable Input<String> currentLocationId,
        @Nullable Input<String> displayName,
        @Nullable Input<String> host,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> locationId,
        @Nullable Input<InstanceMaintenancePolicyGetArgs> maintenancePolicy,
        @Nullable Input<InstanceMaintenanceScheduleGetArgs> maintenanceSchedule,
        @Nullable Input<Integer> memorySizeGb,
        @Nullable Input<String> name,
        @Nullable Input<List<InstanceNodeGetArgs>> nodes,
        @Nullable Input<String> persistenceIamIdentity,
        @Nullable Input<Integer> port,
        @Nullable Input<String> project,
        @Nullable Input<String> readEndpoint,
        @Nullable Input<Integer> readEndpointPort,
        @Nullable Input<String> readReplicasMode,
        @Nullable Input<Map<String,String>> redisConfigs,
        @Nullable Input<String> redisVersion,
        @Nullable Input<String> region,
        @Nullable Input<Integer> replicaCount,
        @Nullable Input<String> reservedIpRange,
        @Nullable Input<List<InstanceServerCaCertGetArgs>> serverCaCerts,
        @Nullable Input<String> tier,
        @Nullable Input<String> transitEncryptionMode) {
        this.alternativeLocationId = alternativeLocationId;
        this.authEnabled = authEnabled;
        this.authString = authString;
        this.authorizedNetwork = authorizedNetwork;
        this.connectMode = connectMode;
        this.createTime = createTime;
        this.currentLocationId = currentLocationId;
        this.displayName = displayName;
        this.host = host;
        this.labels = labels;
        this.locationId = locationId;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceSchedule = maintenanceSchedule;
        this.memorySizeGb = memorySizeGb;
        this.name = name;
        this.nodes = nodes;
        this.persistenceIamIdentity = persistenceIamIdentity;
        this.port = port;
        this.project = project;
        this.readEndpoint = readEndpoint;
        this.readEndpointPort = readEndpointPort;
        this.readReplicasMode = readReplicasMode;
        this.redisConfigs = redisConfigs;
        this.redisVersion = redisVersion;
        this.region = region;
        this.replicaCount = replicaCount;
        this.reservedIpRange = reservedIpRange;
        this.serverCaCerts = serverCaCerts;
        this.tier = tier;
        this.transitEncryptionMode = transitEncryptionMode;
    }

    private InstanceState() {
        this.alternativeLocationId = Input.empty();
        this.authEnabled = Input.empty();
        this.authString = Input.empty();
        this.authorizedNetwork = Input.empty();
        this.connectMode = Input.empty();
        this.createTime = Input.empty();
        this.currentLocationId = Input.empty();
        this.displayName = Input.empty();
        this.host = Input.empty();
        this.labels = Input.empty();
        this.locationId = Input.empty();
        this.maintenancePolicy = Input.empty();
        this.maintenanceSchedule = Input.empty();
        this.memorySizeGb = Input.empty();
        this.name = Input.empty();
        this.nodes = Input.empty();
        this.persistenceIamIdentity = Input.empty();
        this.port = Input.empty();
        this.project = Input.empty();
        this.readEndpoint = Input.empty();
        this.readEndpointPort = Input.empty();
        this.readReplicasMode = Input.empty();
        this.redisConfigs = Input.empty();
        this.redisVersion = Input.empty();
        this.region = Input.empty();
        this.replicaCount = Input.empty();
        this.reservedIpRange = Input.empty();
        this.serverCaCerts = Input.empty();
        this.tier = Input.empty();
        this.transitEncryptionMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alternativeLocationId;
        private @Nullable Input<Boolean> authEnabled;
        private @Nullable Input<String> authString;
        private @Nullable Input<String> authorizedNetwork;
        private @Nullable Input<String> connectMode;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> currentLocationId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> host;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> locationId;
        private @Nullable Input<InstanceMaintenancePolicyGetArgs> maintenancePolicy;
        private @Nullable Input<InstanceMaintenanceScheduleGetArgs> maintenanceSchedule;
        private @Nullable Input<Integer> memorySizeGb;
        private @Nullable Input<String> name;
        private @Nullable Input<List<InstanceNodeGetArgs>> nodes;
        private @Nullable Input<String> persistenceIamIdentity;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> project;
        private @Nullable Input<String> readEndpoint;
        private @Nullable Input<Integer> readEndpointPort;
        private @Nullable Input<String> readReplicasMode;
        private @Nullable Input<Map<String,String>> redisConfigs;
        private @Nullable Input<String> redisVersion;
        private @Nullable Input<String> region;
        private @Nullable Input<Integer> replicaCount;
        private @Nullable Input<String> reservedIpRange;
        private @Nullable Input<List<InstanceServerCaCertGetArgs>> serverCaCerts;
        private @Nullable Input<String> tier;
        private @Nullable Input<String> transitEncryptionMode;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeLocationId = defaults.alternativeLocationId;
    	      this.authEnabled = defaults.authEnabled;
    	      this.authString = defaults.authString;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.connectMode = defaults.connectMode;
    	      this.createTime = defaults.createTime;
    	      this.currentLocationId = defaults.currentLocationId;
    	      this.displayName = defaults.displayName;
    	      this.host = defaults.host;
    	      this.labels = defaults.labels;
    	      this.locationId = defaults.locationId;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceSchedule = defaults.maintenanceSchedule;
    	      this.memorySizeGb = defaults.memorySizeGb;
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.persistenceIamIdentity = defaults.persistenceIamIdentity;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.readEndpoint = defaults.readEndpoint;
    	      this.readEndpointPort = defaults.readEndpointPort;
    	      this.readReplicasMode = defaults.readReplicasMode;
    	      this.redisConfigs = defaults.redisConfigs;
    	      this.redisVersion = defaults.redisVersion;
    	      this.region = defaults.region;
    	      this.replicaCount = defaults.replicaCount;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.serverCaCerts = defaults.serverCaCerts;
    	      this.tier = defaults.tier;
    	      this.transitEncryptionMode = defaults.transitEncryptionMode;
        }

        public Builder setAlternativeLocationId(@Nullable Input<String> alternativeLocationId) {
            this.alternativeLocationId = alternativeLocationId;
            return this;
        }

        public Builder setAlternativeLocationId(@Nullable String alternativeLocationId) {
            this.alternativeLocationId = Input.ofNullable(alternativeLocationId);
            return this;
        }

        public Builder setAuthEnabled(@Nullable Input<Boolean> authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }

        public Builder setAuthEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = Input.ofNullable(authEnabled);
            return this;
        }

        public Builder setAuthString(@Nullable Input<String> authString) {
            this.authString = authString;
            return this;
        }

        public Builder setAuthString(@Nullable String authString) {
            this.authString = Input.ofNullable(authString);
            return this;
        }

        public Builder setAuthorizedNetwork(@Nullable Input<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }

        public Builder setAuthorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Input.ofNullable(authorizedNetwork);
            return this;
        }

        public Builder setConnectMode(@Nullable Input<String> connectMode) {
            this.connectMode = connectMode;
            return this;
        }

        public Builder setConnectMode(@Nullable String connectMode) {
            this.connectMode = Input.ofNullable(connectMode);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setCurrentLocationId(@Nullable Input<String> currentLocationId) {
            this.currentLocationId = currentLocationId;
            return this;
        }

        public Builder setCurrentLocationId(@Nullable String currentLocationId) {
            this.currentLocationId = Input.ofNullable(currentLocationId);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocationId(@Nullable Input<String> locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder setLocationId(@Nullable String locationId) {
            this.locationId = Input.ofNullable(locationId);
            return this;
        }

        public Builder setMaintenancePolicy(@Nullable Input<InstanceMaintenancePolicyGetArgs> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }

        public Builder setMaintenancePolicy(@Nullable InstanceMaintenancePolicyGetArgs maintenancePolicy) {
            this.maintenancePolicy = Input.ofNullable(maintenancePolicy);
            return this;
        }

        public Builder setMaintenanceSchedule(@Nullable Input<InstanceMaintenanceScheduleGetArgs> maintenanceSchedule) {
            this.maintenanceSchedule = maintenanceSchedule;
            return this;
        }

        public Builder setMaintenanceSchedule(@Nullable InstanceMaintenanceScheduleGetArgs maintenanceSchedule) {
            this.maintenanceSchedule = Input.ofNullable(maintenanceSchedule);
            return this;
        }

        public Builder setMemorySizeGb(@Nullable Input<Integer> memorySizeGb) {
            this.memorySizeGb = memorySizeGb;
            return this;
        }

        public Builder setMemorySizeGb(@Nullable Integer memorySizeGb) {
            this.memorySizeGb = Input.ofNullable(memorySizeGb);
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

        public Builder setNodes(@Nullable Input<List<InstanceNodeGetArgs>> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setNodes(@Nullable List<InstanceNodeGetArgs> nodes) {
            this.nodes = Input.ofNullable(nodes);
            return this;
        }

        public Builder setPersistenceIamIdentity(@Nullable Input<String> persistenceIamIdentity) {
            this.persistenceIamIdentity = persistenceIamIdentity;
            return this;
        }

        public Builder setPersistenceIamIdentity(@Nullable String persistenceIamIdentity) {
            this.persistenceIamIdentity = Input.ofNullable(persistenceIamIdentity);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
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

        public Builder setReadEndpoint(@Nullable Input<String> readEndpoint) {
            this.readEndpoint = readEndpoint;
            return this;
        }

        public Builder setReadEndpoint(@Nullable String readEndpoint) {
            this.readEndpoint = Input.ofNullable(readEndpoint);
            return this;
        }

        public Builder setReadEndpointPort(@Nullable Input<Integer> readEndpointPort) {
            this.readEndpointPort = readEndpointPort;
            return this;
        }

        public Builder setReadEndpointPort(@Nullable Integer readEndpointPort) {
            this.readEndpointPort = Input.ofNullable(readEndpointPort);
            return this;
        }

        public Builder setReadReplicasMode(@Nullable Input<String> readReplicasMode) {
            this.readReplicasMode = readReplicasMode;
            return this;
        }

        public Builder setReadReplicasMode(@Nullable String readReplicasMode) {
            this.readReplicasMode = Input.ofNullable(readReplicasMode);
            return this;
        }

        public Builder setRedisConfigs(@Nullable Input<Map<String,String>> redisConfigs) {
            this.redisConfigs = redisConfigs;
            return this;
        }

        public Builder setRedisConfigs(@Nullable Map<String,String> redisConfigs) {
            this.redisConfigs = Input.ofNullable(redisConfigs);
            return this;
        }

        public Builder setRedisVersion(@Nullable Input<String> redisVersion) {
            this.redisVersion = redisVersion;
            return this;
        }

        public Builder setRedisVersion(@Nullable String redisVersion) {
            this.redisVersion = Input.ofNullable(redisVersion);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setReplicaCount(@Nullable Input<Integer> replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder setReplicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = Input.ofNullable(replicaCount);
            return this;
        }

        public Builder setReservedIpRange(@Nullable Input<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }

        public Builder setReservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Input.ofNullable(reservedIpRange);
            return this;
        }

        public Builder setServerCaCerts(@Nullable Input<List<InstanceServerCaCertGetArgs>> serverCaCerts) {
            this.serverCaCerts = serverCaCerts;
            return this;
        }

        public Builder setServerCaCerts(@Nullable List<InstanceServerCaCertGetArgs> serverCaCerts) {
            this.serverCaCerts = Input.ofNullable(serverCaCerts);
            return this;
        }

        public Builder setTier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }

        public Builder setTransitEncryptionMode(@Nullable Input<String> transitEncryptionMode) {
            this.transitEncryptionMode = transitEncryptionMode;
            return this;
        }

        public Builder setTransitEncryptionMode(@Nullable String transitEncryptionMode) {
            this.transitEncryptionMode = Input.ofNullable(transitEncryptionMode);
            return this;
        }
        public InstanceState build() {
            return new InstanceState(alternativeLocationId, authEnabled, authString, authorizedNetwork, connectMode, createTime, currentLocationId, displayName, host, labels, locationId, maintenancePolicy, maintenanceSchedule, memorySizeGb, name, nodes, persistenceIamIdentity, port, project, readEndpoint, readEndpointPort, readReplicasMode, redisConfigs, redisVersion, region, replicaCount, reservedIpRange, serverCaCerts, tier, transitEncryptionMode);
        }
    }
}
