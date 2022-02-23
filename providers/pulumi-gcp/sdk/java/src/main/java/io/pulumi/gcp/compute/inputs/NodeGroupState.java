// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.NodeGroupAutoscalingPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.NodeGroupMaintenanceWindowGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupState extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupState Empty = new NodeGroupState();

    /**
     * If you use sole-tenant nodes for your workloads, you can use the node
     * group autoscaler to automatically manage the sizes of your node groups.
     * Structure is documented below.
     * 
     */
    @InputImport(name="autoscalingPolicy")
        private final @Nullable Input<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy;

    public Input<NodeGroupAutoscalingPolicyGetArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy == null ? Input.empty() : this.autoscalingPolicy;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
        private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional textual description of the resource.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The initial number of nodes in the node group. One of `initial_size` or `size` must be specified.
     * 
     */
    @InputImport(name="initialSize")
        private final @Nullable Input<Integer> initialSize;

    public Input<Integer> getInitialSize() {
        return this.initialSize == null ? Input.empty() : this.initialSize;
    }

    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
     * 
     */
    @InputImport(name="maintenancePolicy")
        private final @Nullable Input<String> maintenancePolicy;

    public Input<String> getMaintenancePolicy() {
        return this.maintenancePolicy == null ? Input.empty() : this.maintenancePolicy;
    }

    /**
     * contains properties for the timeframe of maintenance
     * Structure is documented below.
     * 
     */
    @InputImport(name="maintenanceWindow")
        private final @Nullable Input<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow;

    public Input<NodeGroupMaintenanceWindowGetArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Input.empty() : this.maintenanceWindow;
    }

    /**
     * Name of the resource.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The URL of the node template to which this node group belongs.
     * 
     */
    @InputImport(name="nodeTemplate")
        private final @Nullable Input<String> nodeTemplate;

    public Input<String> getNodeTemplate() {
        return this.nodeTemplate == null ? Input.empty() : this.nodeTemplate;
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
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
        private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * The total number of nodes in the node group. One of `initial_size` or `size` must be specified.
     * 
     */
    @InputImport(name="size")
        private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * Zone where this node group is located
     * 
     */
    @InputImport(name="zone")
        private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public NodeGroupState(
        @Nullable Input<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy,
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<Integer> initialSize,
        @Nullable Input<String> maintenancePolicy,
        @Nullable Input<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow,
        @Nullable Input<String> name,
        @Nullable Input<String> nodeTemplate,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<Integer> size,
        @Nullable Input<String> zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.initialSize = initialSize;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceWindow = maintenanceWindow;
        this.name = name;
        this.nodeTemplate = nodeTemplate;
        this.project = project;
        this.selfLink = selfLink;
        this.size = size;
        this.zone = zone;
    }

    private NodeGroupState() {
        this.autoscalingPolicy = Input.empty();
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.initialSize = Input.empty();
        this.maintenancePolicy = Input.empty();
        this.maintenanceWindow = Input.empty();
        this.name = Input.empty();
        this.nodeTemplate = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.size = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy;
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> initialSize;
        private @Nullable Input<String> maintenancePolicy;
        private @Nullable Input<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow;
        private @Nullable Input<String> name;
        private @Nullable Input<String> nodeTemplate;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<Integer> size;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.initialSize = defaults.initialSize;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeTemplate = defaults.nodeTemplate;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.zone = defaults.zone;
        }

        public Builder setAutoscalingPolicy(@Nullable Input<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        public Builder setAutoscalingPolicy(@Nullable NodeGroupAutoscalingPolicyGetArgs autoscalingPolicy) {
            this.autoscalingPolicy = Input.ofNullable(autoscalingPolicy);
            return this;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInitialSize(@Nullable Input<Integer> initialSize) {
            this.initialSize = initialSize;
            return this;
        }

        public Builder setInitialSize(@Nullable Integer initialSize) {
            this.initialSize = Input.ofNullable(initialSize);
            return this;
        }

        public Builder setMaintenancePolicy(@Nullable Input<String> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }

        public Builder setMaintenancePolicy(@Nullable String maintenancePolicy) {
            this.maintenancePolicy = Input.ofNullable(maintenancePolicy);
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable Input<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable NodeGroupMaintenanceWindowGetArgs maintenanceWindow) {
            this.maintenanceWindow = Input.ofNullable(maintenanceWindow);
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

        public Builder setNodeTemplate(@Nullable Input<String> nodeTemplate) {
            this.nodeTemplate = nodeTemplate;
            return this;
        }

        public Builder setNodeTemplate(@Nullable String nodeTemplate) {
            this.nodeTemplate = Input.ofNullable(nodeTemplate);
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

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public NodeGroupState build() {
            return new NodeGroupState(autoscalingPolicy, creationTimestamp, description, initialSize, maintenancePolicy, maintenanceWindow, name, nodeTemplate, project, selfLink, size, zone);
        }
    }
}
