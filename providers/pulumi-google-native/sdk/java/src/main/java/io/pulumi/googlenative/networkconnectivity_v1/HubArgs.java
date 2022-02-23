// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.RoutingVPCArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubArgs Empty = new HubArgs();

    /**
     * An optional description of the hub.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="hubId", required=true)
      private final Input<String> hubId;

    public Input<String> getHubId() {
        return this.hubId;
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
     * Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number}/locations/global/hubs/{hub_id}`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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

    /**
     * The VPC networks associated with this hub's spokes. This field is read-only. Network Connectivity Center automatically populates it based on the set of spokes attached to the hub.
     * 
     */
    @InputImport(name="routingVpcs")
      private final @Nullable Input<List<RoutingVPCArgs>> routingVpcs;

    public Input<List<RoutingVPCArgs>> getRoutingVpcs() {
        return this.routingVpcs == null ? Input.empty() : this.routingVpcs;
    }

    public HubArgs(
        @Nullable Input<String> description,
        Input<String> hubId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<List<RoutingVPCArgs>> routingVpcs) {
        this.description = description;
        this.hubId = Objects.requireNonNull(hubId, "expected parameter 'hubId' to be non-null");
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.routingVpcs = routingVpcs;
    }

    private HubArgs() {
        this.description = Input.empty();
        this.hubId = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.routingVpcs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> hubId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<RoutingVPCArgs>> routingVpcs;

        public Builder() {
    	      // Empty
        }

        public Builder(HubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hubId = defaults.hubId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.routingVpcs = defaults.routingVpcs;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHubId(Input<String> hubId) {
            this.hubId = Objects.requireNonNull(hubId);
            return this;
        }

        public Builder setHubId(String hubId) {
            this.hubId = Input.of(Objects.requireNonNull(hubId));
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

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRoutingVpcs(@Nullable Input<List<RoutingVPCArgs>> routingVpcs) {
            this.routingVpcs = routingVpcs;
            return this;
        }

        public Builder setRoutingVpcs(@Nullable List<RoutingVPCArgs> routingVpcs) {
            this.routingVpcs = Input.ofNullable(routingVpcs);
            return this;
        }
        public HubArgs build() {
            return new HubArgs(description, hubId, labels, name, project, requestId, routingVpcs);
        }
    }
}
