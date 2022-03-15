// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.MetastoreServiceMaintenanceWindowGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetastoreServiceState extends io.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceState Empty = new MetastoreServiceState();

    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
     */
    @Import(name="artifactGcsUri")
      private final @Nullable Output<String> artifactGcsUri;

    public Output<String> getArtifactGcsUri() {
        return this.artifactGcsUri == null ? Output.empty() : this.artifactGcsUri;
    }

    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    @Import(name="endpointUri")
      private final @Nullable Output<String> endpointUri;

    public Output<String> getEndpointUri() {
        return this.endpointUri == null ? Output.empty() : this.endpointUri;
    }

    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     * 
     */
    @Import(name="hiveMetastoreConfig")
      private final @Nullable Output<MetastoreServiceHiveMetastoreConfigGetArgs> hiveMetastoreConfig;

    public Output<MetastoreServiceHiveMetastoreConfigGetArgs> getHiveMetastoreConfig() {
        return this.hiveMetastoreConfig == null ? Output.empty() : this.hiveMetastoreConfig;
    }

    /**
     * User-defined labels for the metastore service.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Structure is documented below.
     * 
     */
    @Import(name="maintenanceWindow")
      private final @Nullable Output<MetastoreServiceMaintenanceWindowGetArgs> maintenanceWindow;

    public Output<MetastoreServiceMaintenanceWindowGetArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Output.empty() : this.maintenanceWindow;
    }

    /**
     * The relative resource name of the metastore service.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
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
     * The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     * 
     */
    @Import(name="serviceId")
      private final @Nullable Output<String> serviceId;

    public Output<String> getServiceId() {
        return this.serviceId == null ? Output.empty() : this.serviceId;
    }

    /**
     * The current state of the metastore service.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * Additional information about the current state of the metastore service, if available.
     * 
     */
    @Import(name="stateMessage")
      private final @Nullable Output<String> stateMessage;

    public Output<String> getStateMessage() {
        return this.stateMessage == null ? Output.empty() : this.stateMessage;
    }

    /**
     * The tier of the service.
     * Possible values are `DEVELOPER` and `ENTERPRISE`.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public MetastoreServiceState(
        @Nullable Output<String> artifactGcsUri,
        @Nullable Output<String> endpointUri,
        @Nullable Output<MetastoreServiceHiveMetastoreConfigGetArgs> hiveMetastoreConfig,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<MetastoreServiceMaintenanceWindowGetArgs> maintenanceWindow,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<Integer> port,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceId,
        @Nullable Output<String> state,
        @Nullable Output<String> stateMessage,
        @Nullable Output<String> tier) {
        this.artifactGcsUri = artifactGcsUri;
        this.endpointUri = endpointUri;
        this.hiveMetastoreConfig = hiveMetastoreConfig;
        this.labels = labels;
        this.location = location;
        this.maintenanceWindow = maintenanceWindow;
        this.name = name;
        this.network = network;
        this.port = port;
        this.project = project;
        this.serviceId = serviceId;
        this.state = state;
        this.stateMessage = stateMessage;
        this.tier = tier;
    }

    private MetastoreServiceState() {
        this.artifactGcsUri = Output.empty();
        this.endpointUri = Output.empty();
        this.hiveMetastoreConfig = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.maintenanceWindow = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.port = Output.empty();
        this.project = Output.empty();
        this.serviceId = Output.empty();
        this.state = Output.empty();
        this.stateMessage = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactGcsUri;
        private @Nullable Output<String> endpointUri;
        private @Nullable Output<MetastoreServiceHiveMetastoreConfigGetArgs> hiveMetastoreConfig;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<MetastoreServiceMaintenanceWindowGetArgs> maintenanceWindow;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceId;
        private @Nullable Output<String> state;
        private @Nullable Output<String> stateMessage;
        private @Nullable Output<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactGcsUri = defaults.artifactGcsUri;
    	      this.endpointUri = defaults.endpointUri;
    	      this.hiveMetastoreConfig = defaults.hiveMetastoreConfig;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.tier = defaults.tier;
        }

        public Builder artifactGcsUri(@Nullable Output<String> artifactGcsUri) {
            this.artifactGcsUri = artifactGcsUri;
            return this;
        }

        public Builder artifactGcsUri(@Nullable String artifactGcsUri) {
            this.artifactGcsUri = Output.ofNullable(artifactGcsUri);
            return this;
        }

        public Builder endpointUri(@Nullable Output<String> endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = Output.ofNullable(endpointUri);
            return this;
        }

        public Builder hiveMetastoreConfig(@Nullable Output<MetastoreServiceHiveMetastoreConfigGetArgs> hiveMetastoreConfig) {
            this.hiveMetastoreConfig = hiveMetastoreConfig;
            return this;
        }

        public Builder hiveMetastoreConfig(@Nullable MetastoreServiceHiveMetastoreConfigGetArgs hiveMetastoreConfig) {
            this.hiveMetastoreConfig = Output.ofNullable(hiveMetastoreConfig);
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

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder maintenanceWindow(@Nullable Output<MetastoreServiceMaintenanceWindowGetArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder maintenanceWindow(@Nullable MetastoreServiceMaintenanceWindowGetArgs maintenanceWindow) {
            this.maintenanceWindow = Output.ofNullable(maintenanceWindow);
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

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
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

        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }

        public Builder stateMessage(@Nullable Output<String> stateMessage) {
            this.stateMessage = stateMessage;
            return this;
        }

        public Builder stateMessage(@Nullable String stateMessage) {
            this.stateMessage = Output.ofNullable(stateMessage);
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
        public MetastoreServiceState build() {
            return new MetastoreServiceState(artifactGcsUri, endpointUri, hiveMetastoreConfig, labels, location, maintenanceWindow, name, network, port, project, serviceId, state, stateMessage, tier);
        }
    }
}
