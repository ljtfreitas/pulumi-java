// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.NodeGroupMaintenancePolicy;
import io.pulumi.googlenative.compute_v1.enums.NodeGroupStatus;
import io.pulumi.googlenative.compute_v1.inputs.NodeGroupAutoscalingPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.NodeGroupMaintenanceWindowArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupArgs Empty = new NodeGroupArgs();

    /**
     * Specifies how autoscaling should behave.
     * 
     */
    @InputImport(name="autoscalingPolicy")
      private final @Nullable Input<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy;

    public Input<NodeGroupAutoscalingPolicyArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy == null ? Input.empty() : this.autoscalingPolicy;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="initialNodeCount", required=true)
      private final Input<String> initialNodeCount;

    public Input<String> getInitialNodeCount() {
        return this.initialNodeCount;
    }

    /**
     * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    @InputImport(name="locationHint")
      private final @Nullable Input<String> locationHint;

    public Input<String> getLocationHint() {
        return this.locationHint == null ? Input.empty() : this.locationHint;
    }

    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    @InputImport(name="maintenancePolicy")
      private final @Nullable Input<NodeGroupMaintenancePolicy> maintenancePolicy;

    public Input<NodeGroupMaintenancePolicy> getMaintenancePolicy() {
        return this.maintenancePolicy == null ? Input.empty() : this.maintenancePolicy;
    }

    @InputImport(name="maintenanceWindow")
      private final @Nullable Input<NodeGroupMaintenanceWindowArgs> maintenanceWindow;

    public Input<NodeGroupMaintenanceWindowArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Input.empty() : this.maintenanceWindow;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * URL of the node template to create the node group from.
     * 
     */
    @InputImport(name="nodeTemplate")
      private final @Nullable Input<String> nodeTemplate;

    public Input<String> getNodeTemplate() {
        return this.nodeTemplate == null ? Input.empty() : this.nodeTemplate;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="status")
      private final @Nullable Input<NodeGroupStatus> status;

    public Input<NodeGroupStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public NodeGroupArgs(
        @Nullable Input<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy,
        @Nullable Input<String> description,
        Input<String> initialNodeCount,
        @Nullable Input<String> locationHint,
        @Nullable Input<NodeGroupMaintenancePolicy> maintenancePolicy,
        @Nullable Input<NodeGroupMaintenanceWindowArgs> maintenanceWindow,
        @Nullable Input<String> name,
        @Nullable Input<String> nodeTemplate,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<NodeGroupStatus> status,
        @Nullable Input<String> zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.description = description;
        this.initialNodeCount = Objects.requireNonNull(initialNodeCount, "expected parameter 'initialNodeCount' to be non-null");
        this.locationHint = locationHint;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceWindow = maintenanceWindow;
        this.name = name;
        this.nodeTemplate = nodeTemplate;
        this.project = project;
        this.requestId = requestId;
        this.status = status;
        this.zone = zone;
    }

    private NodeGroupArgs() {
        this.autoscalingPolicy = Input.empty();
        this.description = Input.empty();
        this.initialNodeCount = Input.empty();
        this.locationHint = Input.empty();
        this.maintenancePolicy = Input.empty();
        this.maintenanceWindow = Input.empty();
        this.name = Input.empty();
        this.nodeTemplate = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.status = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy;
        private @Nullable Input<String> description;
        private Input<String> initialNodeCount;
        private @Nullable Input<String> locationHint;
        private @Nullable Input<NodeGroupMaintenancePolicy> maintenancePolicy;
        private @Nullable Input<NodeGroupMaintenanceWindowArgs> maintenanceWindow;
        private @Nullable Input<String> name;
        private @Nullable Input<String> nodeTemplate;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<NodeGroupStatus> status;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.description = defaults.description;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeTemplate = defaults.nodeTemplate;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder setAutoscalingPolicy(@Nullable Input<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        public Builder setAutoscalingPolicy(@Nullable NodeGroupAutoscalingPolicyArgs autoscalingPolicy) {
            this.autoscalingPolicy = Input.ofNullable(autoscalingPolicy);
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

        public Builder setInitialNodeCount(Input<String> initialNodeCount) {
            this.initialNodeCount = Objects.requireNonNull(initialNodeCount);
            return this;
        }

        public Builder setInitialNodeCount(String initialNodeCount) {
            this.initialNodeCount = Input.of(Objects.requireNonNull(initialNodeCount));
            return this;
        }

        public Builder setLocationHint(@Nullable Input<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }

        public Builder setLocationHint(@Nullable String locationHint) {
            this.locationHint = Input.ofNullable(locationHint);
            return this;
        }

        public Builder setMaintenancePolicy(@Nullable Input<NodeGroupMaintenancePolicy> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }

        public Builder setMaintenancePolicy(@Nullable NodeGroupMaintenancePolicy maintenancePolicy) {
            this.maintenancePolicy = Input.ofNullable(maintenancePolicy);
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable Input<NodeGroupMaintenanceWindowArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable NodeGroupMaintenanceWindowArgs maintenanceWindow) {
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

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setStatus(@Nullable Input<NodeGroupStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable NodeGroupStatus status) {
            this.status = Input.ofNullable(status);
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
        public NodeGroupArgs build() {
            return new NodeGroupArgs(autoscalingPolicy, description, initialNodeCount, locationHint, maintenancePolicy, maintenanceWindow, name, nodeTemplate, project, requestId, status, zone);
        }
    }
}
