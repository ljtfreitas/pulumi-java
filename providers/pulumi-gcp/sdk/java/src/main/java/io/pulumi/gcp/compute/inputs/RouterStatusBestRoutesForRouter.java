// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouterStatusBestRoutesForRouter extends io.pulumi.resources.InvokeArgs {

    public static final RouterStatusBestRoutesForRouter Empty = new RouterStatusBestRoutesForRouter();

    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    @Import(name="destRange", required=true)
      private final String destRange;

    public String destRange() {
        return this.destRange;
    }

    /**
     * The name of the router.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The network name or resource link to the parent
     * network of this subnetwork.
     * 
     */
    @Import(name="network", required=true)
      private final String network;

    public String network() {
        return this.network;
    }

    @Import(name="nextHopGateway", required=true)
      private final String nextHopGateway;

    public String nextHopGateway() {
        return this.nextHopGateway;
    }

    @Import(name="nextHopIlb", required=true)
      private final String nextHopIlb;

    public String nextHopIlb() {
        return this.nextHopIlb;
    }

    @Import(name="nextHopInstance", required=true)
      private final String nextHopInstance;

    public String nextHopInstance() {
        return this.nextHopInstance;
    }

    @Import(name="nextHopInstanceZone", required=true)
      private final String nextHopInstanceZone;

    public String nextHopInstanceZone() {
        return this.nextHopInstanceZone;
    }

    @Import(name="nextHopIp", required=true)
      private final String nextHopIp;

    public String nextHopIp() {
        return this.nextHopIp;
    }

    @Import(name="nextHopNetwork", required=true)
      private final String nextHopNetwork;

    public String nextHopNetwork() {
        return this.nextHopNetwork;
    }

    @Import(name="nextHopVpnTunnel", required=true)
      private final String nextHopVpnTunnel;

    public String nextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }

    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer priority() {
        return this.priority;
    }

    /**
     * The ID of the project in which the resource
     * belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String project() {
        return this.project;
    }

    @Import(name="selfLink", required=true)
      private final String selfLink;

    public String selfLink() {
        return this.selfLink;
    }

    @Import(name="tags", required=true)
      private final List<String> tags;

    public List<String> tags() {
        return this.tags;
    }

    public RouterStatusBestRoutesForRouter(
        String description,
        String destRange,
        String name,
        String network,
        String nextHopGateway,
        String nextHopIlb,
        String nextHopInstance,
        String nextHopInstanceZone,
        String nextHopIp,
        String nextHopNetwork,
        String nextHopVpnTunnel,
        Integer priority,
        String project,
        String selfLink,
        List<String> tags) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.destRange = Objects.requireNonNull(destRange, "expected parameter 'destRange' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.nextHopGateway = Objects.requireNonNull(nextHopGateway, "expected parameter 'nextHopGateway' to be non-null");
        this.nextHopIlb = Objects.requireNonNull(nextHopIlb, "expected parameter 'nextHopIlb' to be non-null");
        this.nextHopInstance = Objects.requireNonNull(nextHopInstance, "expected parameter 'nextHopInstance' to be non-null");
        this.nextHopInstanceZone = Objects.requireNonNull(nextHopInstanceZone, "expected parameter 'nextHopInstanceZone' to be non-null");
        this.nextHopIp = Objects.requireNonNull(nextHopIp, "expected parameter 'nextHopIp' to be non-null");
        this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork, "expected parameter 'nextHopNetwork' to be non-null");
        this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel, "expected parameter 'nextHopVpnTunnel' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private RouterStatusBestRoutesForRouter() {
        this.description = null;
        this.destRange = null;
        this.name = null;
        this.network = null;
        this.nextHopGateway = null;
        this.nextHopIlb = null;
        this.nextHopInstance = null;
        this.nextHopInstanceZone = null;
        this.nextHopIp = null;
        this.nextHopNetwork = null;
        this.nextHopVpnTunnel = null;
        this.priority = null;
        this.project = null;
        this.selfLink = null;
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterStatusBestRoutesForRouter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String destRange;
        private String name;
        private String network;
        private String nextHopGateway;
        private String nextHopIlb;
        private String nextHopInstance;
        private String nextHopInstanceZone;
        private String nextHopIp;
        private String nextHopNetwork;
        private String nextHopVpnTunnel;
        private Integer priority;
        private String project;
        private String selfLink;
        private List<String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterStatusBestRoutesForRouter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destRange = defaults.destRange;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nextHopGateway = defaults.nextHopGateway;
    	      this.nextHopIlb = defaults.nextHopIlb;
    	      this.nextHopInstance = defaults.nextHopInstance;
    	      this.nextHopInstanceZone = defaults.nextHopInstanceZone;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.nextHopNetwork = defaults.nextHopNetwork;
    	      this.nextHopVpnTunnel = defaults.nextHopVpnTunnel;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.tags = defaults.tags;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder destRange(String destRange) {
            this.destRange = Objects.requireNonNull(destRange);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder nextHopGateway(String nextHopGateway) {
            this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
            return this;
        }
        public Builder nextHopIlb(String nextHopIlb) {
            this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
            return this;
        }
        public Builder nextHopInstance(String nextHopInstance) {
            this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
            return this;
        }
        public Builder nextHopInstanceZone(String nextHopInstanceZone) {
            this.nextHopInstanceZone = Objects.requireNonNull(nextHopInstanceZone);
            return this;
        }
        public Builder nextHopIp(String nextHopIp) {
            this.nextHopIp = Objects.requireNonNull(nextHopIp);
            return this;
        }
        public Builder nextHopNetwork(String nextHopNetwork) {
            this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
            return this;
        }
        public Builder nextHopVpnTunnel(String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }        public RouterStatusBestRoutesForRouter build() {
            return new RouterStatusBestRoutesForRouter(description, destRange, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopInstanceZone, nextHopIp, nextHopNetwork, nextHopVpnTunnel, priority, project, selfLink, tags);
        }
    }
}
