// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.memcache_v1beta2.enums.InstanceMemcacheVersion;
import io.pulumi.googlenative.memcache_v1beta2.inputs.InstanceMessageArgs;
import io.pulumi.googlenative.memcache_v1beta2.inputs.MemcacheParametersArgs;
import io.pulumi.googlenative.memcache_v1beta2.inputs.NodeConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    @InputImport(name="authorizedNetwork")
      private final @Nullable Input<String> authorizedNetwork;

    public Input<String> getAuthorizedNetwork() {
        return this.authorizedNetwork == null ? Input.empty() : this.authorizedNetwork;
    }

    /**
     * User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="instanceId", required=true)
      private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * List of messages that describe the current state of the Memcached instance.
     * 
     */
    @InputImport(name="instanceMessages")
      private final @Nullable Input<List<InstanceMessageArgs>> instanceMessages;

    public Input<List<InstanceMessageArgs>> getInstanceMessages() {
        return this.instanceMessages == null ? Input.empty() : this.instanceMessages;
    }

    /**
     * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    @InputImport(name="memcacheVersion")
      private final @Nullable Input<InstanceMemcacheVersion> memcacheVersion;

    public Input<InstanceMemcacheVersion> getMemcacheVersion() {
        return this.memcacheVersion == null ? Input.empty() : this.memcacheVersion;
    }

    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration for Memcached nodes.
     * 
     */
    @InputImport(name="nodeConfig", required=true)
      private final Input<NodeConfigArgs> nodeConfig;

    public Input<NodeConfigArgs> getNodeConfig() {
        return this.nodeConfig;
    }

    /**
     * Number of nodes in the Memcached instance.
     * 
     */
    @InputImport(name="nodeCount", required=true)
      private final Input<Integer> nodeCount;

    public Input<Integer> getNodeCount() {
        return this.nodeCount;
    }

    /**
     * User defined parameters to apply to the memcached process on each node.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<MemcacheParametersArgs> parameters;

    public Input<MemcacheParametersArgs> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public InstanceArgs(
        @Nullable Input<String> authorizedNetwork,
        @Nullable Input<String> displayName,
        Input<String> instanceId,
        @Nullable Input<List<InstanceMessageArgs>> instanceMessages,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<InstanceMemcacheVersion> memcacheVersion,
        @Nullable Input<String> name,
        Input<NodeConfigArgs> nodeConfig,
        Input<Integer> nodeCount,
        @Nullable Input<MemcacheParametersArgs> parameters,
        @Nullable Input<String> project,
        @Nullable Input<List<String>> zones) {
        this.authorizedNetwork = authorizedNetwork;
        this.displayName = displayName;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.instanceMessages = instanceMessages;
        this.labels = labels;
        this.location = location;
        this.memcacheVersion = memcacheVersion;
        this.name = name;
        this.nodeConfig = Objects.requireNonNull(nodeConfig, "expected parameter 'nodeConfig' to be non-null");
        this.nodeCount = Objects.requireNonNull(nodeCount, "expected parameter 'nodeCount' to be non-null");
        this.parameters = parameters;
        this.project = project;
        this.zones = zones;
    }

    private InstanceArgs() {
        this.authorizedNetwork = Input.empty();
        this.displayName = Input.empty();
        this.instanceId = Input.empty();
        this.instanceMessages = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.memcacheVersion = Input.empty();
        this.name = Input.empty();
        this.nodeConfig = Input.empty();
        this.nodeCount = Input.empty();
        this.parameters = Input.empty();
        this.project = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizedNetwork;
        private @Nullable Input<String> displayName;
        private Input<String> instanceId;
        private @Nullable Input<List<InstanceMessageArgs>> instanceMessages;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<InstanceMemcacheVersion> memcacheVersion;
        private @Nullable Input<String> name;
        private Input<NodeConfigArgs> nodeConfig;
        private Input<Integer> nodeCount;
        private @Nullable Input<MemcacheParametersArgs> parameters;
        private @Nullable Input<String> project;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.displayName = defaults.displayName;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceMessages = defaults.instanceMessages;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.memcacheVersion = defaults.memcacheVersion;
    	      this.name = defaults.name;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.zones = defaults.zones;
        }

        public Builder setAuthorizedNetwork(@Nullable Input<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }

        public Builder setAuthorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Input.ofNullable(authorizedNetwork);
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

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setInstanceMessages(@Nullable Input<List<InstanceMessageArgs>> instanceMessages) {
            this.instanceMessages = instanceMessages;
            return this;
        }

        public Builder setInstanceMessages(@Nullable List<InstanceMessageArgs> instanceMessages) {
            this.instanceMessages = Input.ofNullable(instanceMessages);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMemcacheVersion(@Nullable Input<InstanceMemcacheVersion> memcacheVersion) {
            this.memcacheVersion = memcacheVersion;
            return this;
        }

        public Builder setMemcacheVersion(@Nullable InstanceMemcacheVersion memcacheVersion) {
            this.memcacheVersion = Input.ofNullable(memcacheVersion);
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

        public Builder setNodeConfig(Input<NodeConfigArgs> nodeConfig) {
            this.nodeConfig = Objects.requireNonNull(nodeConfig);
            return this;
        }

        public Builder setNodeConfig(NodeConfigArgs nodeConfig) {
            this.nodeConfig = Input.of(Objects.requireNonNull(nodeConfig));
            return this;
        }

        public Builder setNodeCount(Input<Integer> nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder setNodeCount(Integer nodeCount) {
            this.nodeCount = Input.of(Objects.requireNonNull(nodeCount));
            return this;
        }

        public Builder setParameters(@Nullable Input<MemcacheParametersArgs> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable MemcacheParametersArgs parameters) {
            this.parameters = Input.ofNullable(parameters);
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

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(authorizedNetwork, displayName, instanceId, instanceMessages, labels, location, memcacheVersion, name, nodeConfig, nodeCount, parameters, project, zones);
        }
    }
}
