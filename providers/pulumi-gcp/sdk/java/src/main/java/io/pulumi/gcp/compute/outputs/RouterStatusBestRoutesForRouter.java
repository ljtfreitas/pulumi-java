// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouterStatusBestRoutesForRouter {
    private final String description;
    private final String destRange;
    /**
     * The name of the router.
     * 
     */
    private final String name;
    /**
     * The network name or resource link to the parent
     * network of this subnetwork.
     * 
     */
    private final String network;
    private final String nextHopGateway;
    private final String nextHopIlb;
    private final String nextHopInstance;
    private final String nextHopInstanceZone;
    private final String nextHopIp;
    private final String nextHopNetwork;
    private final String nextHopVpnTunnel;
    private final Integer priority;
    /**
     * The ID of the project in which the resource
     * belongs. If it is not provided, the provider project is used.
     * 
     */
    private final String project;
    private final String selfLink;
    private final List<String> tags;

    @CustomType.Constructor
    private RouterStatusBestRoutesForRouter(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("destRange") String destRange,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("nextHopGateway") String nextHopGateway,
        @CustomType.Parameter("nextHopIlb") String nextHopIlb,
        @CustomType.Parameter("nextHopInstance") String nextHopInstance,
        @CustomType.Parameter("nextHopInstanceZone") String nextHopInstanceZone,
        @CustomType.Parameter("nextHopIp") String nextHopIp,
        @CustomType.Parameter("nextHopNetwork") String nextHopNetwork,
        @CustomType.Parameter("nextHopVpnTunnel") String nextHopVpnTunnel,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("tags") List<String> tags) {
        this.description = description;
        this.destRange = destRange;
        this.name = name;
        this.network = network;
        this.nextHopGateway = nextHopGateway;
        this.nextHopIlb = nextHopIlb;
        this.nextHopInstance = nextHopInstance;
        this.nextHopInstanceZone = nextHopInstanceZone;
        this.nextHopIp = nextHopIp;
        this.nextHopNetwork = nextHopNetwork;
        this.nextHopVpnTunnel = nextHopVpnTunnel;
        this.priority = priority;
        this.project = project;
        this.selfLink = selfLink;
        this.tags = tags;
    }

    public String getDescription() {
        return this.description;
    }
    public String getDestRange() {
        return this.destRange;
    }
    /**
     * The name of the router.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The network name or resource link to the parent
     * network of this subnetwork.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    public String getNextHopGateway() {
        return this.nextHopGateway;
    }
    public String getNextHopIlb() {
        return this.nextHopIlb;
    }
    public String getNextHopInstance() {
        return this.nextHopInstance;
    }
    public String getNextHopInstanceZone() {
        return this.nextHopInstanceZone;
    }
    public String getNextHopIp() {
        return this.nextHopIp;
    }
    public String getNextHopNetwork() {
        return this.nextHopNetwork;
    }
    public String getNextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The ID of the project in which the resource
     * belongs. If it is not provided, the provider project is used.
     * 
    */
    public String getProject() {
        return this.project;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public List<String> getTags() {
        return this.tags;
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
        public RouterStatusBestRoutesForRouter build() {
            return new RouterStatusBestRoutesForRouter(description, destRange, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopInstanceZone, nextHopIp, nextHopNetwork, nextHopVpnTunnel, priority, project, selfLink, tags);
        }
    }
}
