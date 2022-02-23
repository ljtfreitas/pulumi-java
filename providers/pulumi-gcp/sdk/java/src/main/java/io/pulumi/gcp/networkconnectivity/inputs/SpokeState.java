// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsGetArgs;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesGetArgs;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpokeState extends io.pulumi.resources.ResourceArgs {

    public static final SpokeState Empty = new SpokeState();

    /**
     * Output only. The time the spoke was created.
     * 
     */
    @InputImport(name="createTime")
        private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * An optional description of the spoke.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Immutable. The URI of the hub that this spoke is attached to.
     * 
     */
    @InputImport(name="hub")
        private final @Nullable Input<String> hub;

    public Input<String> getHub() {
        return this.hub == null ? Input.empty() : this.hub;
    }

    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    @InputImport(name="labels")
        private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     * 
     */
    @InputImport(name="linkedInterconnectAttachments")
        private final @Nullable Input<SpokeLinkedInterconnectAttachmentsGetArgs> linkedInterconnectAttachments;

    public Input<SpokeLinkedInterconnectAttachmentsGetArgs> getLinkedInterconnectAttachments() {
        return this.linkedInterconnectAttachments == null ? Input.empty() : this.linkedInterconnectAttachments;
    }

    /**
     * The URIs of linked Router appliance resources
     * 
     */
    @InputImport(name="linkedRouterApplianceInstances")
        private final @Nullable Input<SpokeLinkedRouterApplianceInstancesGetArgs> linkedRouterApplianceInstances;

    public Input<SpokeLinkedRouterApplianceInstancesGetArgs> getLinkedRouterApplianceInstances() {
        return this.linkedRouterApplianceInstances == null ? Input.empty() : this.linkedRouterApplianceInstances;
    }

    /**
     * The URIs of linked VPN tunnel resources
     * 
     */
    @InputImport(name="linkedVpnTunnels")
        private final @Nullable Input<SpokeLinkedVpnTunnelsGetArgs> linkedVpnTunnels;

    public Input<SpokeLinkedVpnTunnelsGetArgs> getLinkedVpnTunnels() {
        return this.linkedVpnTunnels == null ? Input.empty() : this.linkedVpnTunnels;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Immutable. The name of the spoke. Spoke names must be unique.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
     * 
     */
    @InputImport(name="state")
        private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is
     * deleted and another with the same name is created, the new spoke is assigned a different unique_id.
     * 
     */
    @InputImport(name="uniqueId")
        private final @Nullable Input<String> uniqueId;

    public Input<String> getUniqueId() {
        return this.uniqueId == null ? Input.empty() : this.uniqueId;
    }

    /**
     * Output only. The time the spoke was last updated.
     * 
     */
    @InputImport(name="updateTime")
        private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public SpokeState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> hub,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<SpokeLinkedInterconnectAttachmentsGetArgs> linkedInterconnectAttachments,
        @Nullable Input<SpokeLinkedRouterApplianceInstancesGetArgs> linkedRouterApplianceInstances,
        @Nullable Input<SpokeLinkedVpnTunnelsGetArgs> linkedVpnTunnels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> state,
        @Nullable Input<String> uniqueId,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.hub = hub;
        this.labels = labels;
        this.linkedInterconnectAttachments = linkedInterconnectAttachments;
        this.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
        this.linkedVpnTunnels = linkedVpnTunnels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.state = state;
        this.uniqueId = uniqueId;
        this.updateTime = updateTime;
    }

    private SpokeState() {
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.hub = Input.empty();
        this.labels = Input.empty();
        this.linkedInterconnectAttachments = Input.empty();
        this.linkedRouterApplianceInstances = Input.empty();
        this.linkedVpnTunnels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.state = Input.empty();
        this.uniqueId = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> hub;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<SpokeLinkedInterconnectAttachmentsGetArgs> linkedInterconnectAttachments;
        private @Nullable Input<SpokeLinkedRouterApplianceInstancesGetArgs> linkedRouterApplianceInstances;
        private @Nullable Input<SpokeLinkedVpnTunnelsGetArgs> linkedVpnTunnels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> state;
        private @Nullable Input<String> uniqueId;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.hub = defaults.hub;
    	      this.labels = defaults.labels;
    	      this.linkedInterconnectAttachments = defaults.linkedInterconnectAttachments;
    	      this.linkedRouterApplianceInstances = defaults.linkedRouterApplianceInstances;
    	      this.linkedVpnTunnels = defaults.linkedVpnTunnels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.uniqueId = defaults.uniqueId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
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

        public Builder setHub(@Nullable Input<String> hub) {
            this.hub = hub;
            return this;
        }

        public Builder setHub(@Nullable String hub) {
            this.hub = Input.ofNullable(hub);
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

        public Builder setLinkedInterconnectAttachments(@Nullable Input<SpokeLinkedInterconnectAttachmentsGetArgs> linkedInterconnectAttachments) {
            this.linkedInterconnectAttachments = linkedInterconnectAttachments;
            return this;
        }

        public Builder setLinkedInterconnectAttachments(@Nullable SpokeLinkedInterconnectAttachmentsGetArgs linkedInterconnectAttachments) {
            this.linkedInterconnectAttachments = Input.ofNullable(linkedInterconnectAttachments);
            return this;
        }

        public Builder setLinkedRouterApplianceInstances(@Nullable Input<SpokeLinkedRouterApplianceInstancesGetArgs> linkedRouterApplianceInstances) {
            this.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
            return this;
        }

        public Builder setLinkedRouterApplianceInstances(@Nullable SpokeLinkedRouterApplianceInstancesGetArgs linkedRouterApplianceInstances) {
            this.linkedRouterApplianceInstances = Input.ofNullable(linkedRouterApplianceInstances);
            return this;
        }

        public Builder setLinkedVpnTunnels(@Nullable Input<SpokeLinkedVpnTunnelsGetArgs> linkedVpnTunnels) {
            this.linkedVpnTunnels = linkedVpnTunnels;
            return this;
        }

        public Builder setLinkedVpnTunnels(@Nullable SpokeLinkedVpnTunnelsGetArgs linkedVpnTunnels) {
            this.linkedVpnTunnels = Input.ofNullable(linkedVpnTunnels);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setUniqueId(@Nullable Input<String> uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }

        public Builder setUniqueId(@Nullable String uniqueId) {
            this.uniqueId = Input.ofNullable(uniqueId);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }
        public SpokeState build() {
            return new SpokeState(createTime, description, hub, labels, linkedInterconnectAttachments, linkedRouterApplianceInstances, linkedVpnTunnels, location, name, project, state, uniqueId, updateTime);
        }
    }
}
