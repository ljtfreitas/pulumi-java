// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.VpnGatewayStackType;
import io.pulumi.googlenative.compute_alpha.inputs.VpnGatewayVpnGatewayInterfaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnGatewayArgs Empty = new VpnGatewayArgs();

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
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
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
     * The stack type for this VPN gateway to identify the IP protocols that are enabled. If not specified, IPV4_ONLY will be used.
     * 
     */
    @Import(name="stackType")
      private final @Nullable Output<VpnGatewayStackType> stackType;

    public Output<VpnGatewayStackType> getStackType() {
        return this.stackType == null ? Output.empty() : this.stackType;
    }

    /**
     * The list of VPN interfaces associated with this VPN gateway.
     * 
     */
    @Import(name="vpnInterfaces")
      private final @Nullable Output<List<VpnGatewayVpnGatewayInterfaceArgs>> vpnInterfaces;

    public Output<List<VpnGatewayVpnGatewayInterfaceArgs>> getVpnInterfaces() {
        return this.vpnInterfaces == null ? Output.empty() : this.vpnInterfaces;
    }

    public VpnGatewayArgs(
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<VpnGatewayStackType> stackType,
        @Nullable Output<List<VpnGatewayVpnGatewayInterfaceArgs>> vpnInterfaces) {
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.stackType = stackType;
        this.vpnInterfaces = vpnInterfaces;
    }

    private VpnGatewayArgs() {
        this.description = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
        this.stackType = Output.empty();
        this.vpnInterfaces = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<VpnGatewayStackType> stackType;
        private @Nullable Output<List<VpnGatewayVpnGatewayInterfaceArgs>> vpnInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.stackType = defaults.stackType;
    	      this.vpnInterfaces = defaults.vpnInterfaces;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
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

        public Builder stackType(@Nullable Output<VpnGatewayStackType> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder stackType(@Nullable VpnGatewayStackType stackType) {
            this.stackType = Output.ofNullable(stackType);
            return this;
        }

        public Builder vpnInterfaces(@Nullable Output<List<VpnGatewayVpnGatewayInterfaceArgs>> vpnInterfaces) {
            this.vpnInterfaces = vpnInterfaces;
            return this;
        }

        public Builder vpnInterfaces(@Nullable List<VpnGatewayVpnGatewayInterfaceArgs> vpnInterfaces) {
            this.vpnInterfaces = Output.ofNullable(vpnInterfaces);
            return this;
        }
        public VpnGatewayArgs build() {
            return new VpnGatewayArgs(description, labels, name, network, project, region, requestId, stackType, vpnInterfaces);
        }
    }
}
