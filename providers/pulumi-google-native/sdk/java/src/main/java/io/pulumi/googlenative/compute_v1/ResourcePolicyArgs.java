// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.ResourcePolicyGroupPlacementPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.ResourcePolicyInstanceSchedulePolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.ResourcePolicySnapshotSchedulePolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Resource policy for instances for placement configuration.
     * 
     */
    @Import(name="groupPlacementPolicy")
      private final @Nullable Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy;

    public Output<ResourcePolicyGroupPlacementPolicyArgs> getGroupPlacementPolicy() {
        return this.groupPlacementPolicy == null ? Output.empty() : this.groupPlacementPolicy;
    }

    /**
     * Resource policy for scheduling instance operations.
     * 
     */
    @Import(name="instanceSchedulePolicy")
      private final @Nullable Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy;

    public Output<ResourcePolicyInstanceSchedulePolicyArgs> getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy == null ? Output.empty() : this.instanceSchedulePolicy;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
     */
    @Import(name="snapshotSchedulePolicy")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy;

    public Output<ResourcePolicySnapshotSchedulePolicyArgs> getSnapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy == null ? Output.empty() : this.snapshotSchedulePolicy;
    }

    public ResourcePolicyArgs(
        @Nullable Output<String> description,
        @Nullable Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy,
        @Nullable Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy) {
        this.description = description;
        this.groupPlacementPolicy = groupPlacementPolicy;
        this.instanceSchedulePolicy = instanceSchedulePolicy;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.snapshotSchedulePolicy = snapshotSchedulePolicy;
    }

    private ResourcePolicyArgs() {
        this.description = Output.empty();
        this.groupPlacementPolicy = Output.empty();
        this.instanceSchedulePolicy = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
        this.snapshotSchedulePolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy;
        private @Nullable Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.groupPlacementPolicy = defaults.groupPlacementPolicy;
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.snapshotSchedulePolicy = defaults.snapshotSchedulePolicy;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder groupPlacementPolicy(@Nullable Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy) {
            this.groupPlacementPolicy = groupPlacementPolicy;
            return this;
        }

        public Builder groupPlacementPolicy(@Nullable ResourcePolicyGroupPlacementPolicyArgs groupPlacementPolicy) {
            this.groupPlacementPolicy = Output.ofNullable(groupPlacementPolicy);
            return this;
        }

        public Builder instanceSchedulePolicy(@Nullable Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy) {
            this.instanceSchedulePolicy = instanceSchedulePolicy;
            return this;
        }

        public Builder instanceSchedulePolicy(@Nullable ResourcePolicyInstanceSchedulePolicyArgs instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Output.ofNullable(instanceSchedulePolicy);
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

        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder snapshotSchedulePolicy(@Nullable Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = snapshotSchedulePolicy;
            return this;
        }

        public Builder snapshotSchedulePolicy(@Nullable ResourcePolicySnapshotSchedulePolicyArgs snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = Output.ofNullable(snapshotSchedulePolicy);
            return this;
        }
        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(description, groupPlacementPolicy, instanceSchedulePolicy, name, project, region, requestId, snapshotSchedulePolicy);
        }
    }
}
