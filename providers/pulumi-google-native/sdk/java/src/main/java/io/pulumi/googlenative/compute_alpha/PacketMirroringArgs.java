// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.PacketMirroringEnable;
import io.pulumi.googlenative.compute_alpha.inputs.PacketMirroringFilterArgs;
import io.pulumi.googlenative.compute_alpha.inputs.PacketMirroringForwardingRuleInfoArgs;
import io.pulumi.googlenative.compute_alpha.inputs.PacketMirroringMirroredResourceInfoArgs;
import io.pulumi.googlenative.compute_alpha.inputs.PacketMirroringNetworkInfoArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringArgs Empty = new PacketMirroringArgs();

    /**
     * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    @Import(name="collectorIlb")
      private final @Nullable Output<PacketMirroringForwardingRuleInfoArgs> collectorIlb;

    public Output<PacketMirroringForwardingRuleInfoArgs> getCollectorIlb() {
        return this.collectorIlb == null ? Output.empty() : this.collectorIlb;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<PacketMirroringEnable> enable;

    public Output<PacketMirroringEnable> getEnable() {
        return this.enable == null ? Output.empty() : this.enable;
    }

    /**
     * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<PacketMirroringFilterArgs> filter;

    public Output<PacketMirroringFilterArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    @Import(name="mirroredResources")
      private final @Nullable Output<PacketMirroringMirroredResourceInfoArgs> mirroredResources;

    public Output<PacketMirroringMirroredResourceInfoArgs> getMirroredResources() {
        return this.mirroredResources == null ? Output.empty() : this.mirroredResources;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<PacketMirroringNetworkInfoArgs> network;

    public Output<PacketMirroringNetworkInfoArgs> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
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

    public PacketMirroringArgs(
        @Nullable Output<PacketMirroringForwardingRuleInfoArgs> collectorIlb,
        @Nullable Output<String> description,
        @Nullable Output<PacketMirroringEnable> enable,
        @Nullable Output<PacketMirroringFilterArgs> filter,
        @Nullable Output<PacketMirroringMirroredResourceInfoArgs> mirroredResources,
        @Nullable Output<String> name,
        @Nullable Output<PacketMirroringNetworkInfoArgs> network,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId) {
        this.collectorIlb = collectorIlb;
        this.description = description;
        this.enable = enable;
        this.filter = filter;
        this.mirroredResources = mirroredResources;
        this.name = name;
        this.network = network;
        this.priority = priority;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
    }

    private PacketMirroringArgs() {
        this.collectorIlb = Output.empty();
        this.description = Output.empty();
        this.enable = Output.empty();
        this.filter = Output.empty();
        this.mirroredResources = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.priority = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PacketMirroringForwardingRuleInfoArgs> collectorIlb;
        private @Nullable Output<String> description;
        private @Nullable Output<PacketMirroringEnable> enable;
        private @Nullable Output<PacketMirroringFilterArgs> filter;
        private @Nullable Output<PacketMirroringMirroredResourceInfoArgs> mirroredResources;
        private @Nullable Output<String> name;
        private @Nullable Output<PacketMirroringNetworkInfoArgs> network;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectorIlb = defaults.collectorIlb;
    	      this.description = defaults.description;
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
    	      this.mirroredResources = defaults.mirroredResources;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
        }

        public Builder collectorIlb(@Nullable Output<PacketMirroringForwardingRuleInfoArgs> collectorIlb) {
            this.collectorIlb = collectorIlb;
            return this;
        }

        public Builder collectorIlb(@Nullable PacketMirroringForwardingRuleInfoArgs collectorIlb) {
            this.collectorIlb = Output.ofNullable(collectorIlb);
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

        public Builder enable(@Nullable Output<PacketMirroringEnable> enable) {
            this.enable = enable;
            return this;
        }

        public Builder enable(@Nullable PacketMirroringEnable enable) {
            this.enable = Output.ofNullable(enable);
            return this;
        }

        public Builder filter(@Nullable Output<PacketMirroringFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable PacketMirroringFilterArgs filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }

        public Builder mirroredResources(@Nullable Output<PacketMirroringMirroredResourceInfoArgs> mirroredResources) {
            this.mirroredResources = mirroredResources;
            return this;
        }

        public Builder mirroredResources(@Nullable PacketMirroringMirroredResourceInfoArgs mirroredResources) {
            this.mirroredResources = Output.ofNullable(mirroredResources);
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

        public Builder network(@Nullable Output<PacketMirroringNetworkInfoArgs> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable PacketMirroringNetworkInfoArgs network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
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
        public PacketMirroringArgs build() {
            return new PacketMirroringArgs(collectorIlb, description, enable, filter, mirroredResources, name, network, priority, project, region, requestId);
        }
    }
}
