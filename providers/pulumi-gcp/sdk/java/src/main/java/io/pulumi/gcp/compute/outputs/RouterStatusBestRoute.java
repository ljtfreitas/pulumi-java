// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouterStatusBestRoute {
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

    @OutputCustomType.Constructor({"description","destRange","name","network","nextHopGateway","nextHopIlb","nextHopInstance","nextHopInstanceZone","nextHopIp","nextHopNetwork","nextHopVpnTunnel","priority","project","selfLink","tags"})
    private RouterStatusBestRoute(
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
        this.description = Objects.requireNonNull(description);
        this.destRange = Objects.requireNonNull(destRange);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
        this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
        this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
        this.nextHopInstanceZone = Objects.requireNonNull(nextHopInstanceZone);
        this.nextHopIp = Objects.requireNonNull(nextHopIp);
        this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
        this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
        this.priority = Objects.requireNonNull(priority);
        this.project = Objects.requireNonNull(project);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.tags = Objects.requireNonNull(tags);
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

    public static Builder builder(RouterStatusBestRoute defaults) {
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

        public Builder(RouterStatusBestRoute defaults) {
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

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDestRange(String destRange) {
            this.destRange = Objects.requireNonNull(destRange);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNextHopGateway(String nextHopGateway) {
            this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
            return this;
        }

        public Builder setNextHopIlb(String nextHopIlb) {
            this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
            return this;
        }

        public Builder setNextHopInstance(String nextHopInstance) {
            this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
            return this;
        }

        public Builder setNextHopInstanceZone(String nextHopInstanceZone) {
            this.nextHopInstanceZone = Objects.requireNonNull(nextHopInstanceZone);
            return this;
        }

        public Builder setNextHopIp(String nextHopIp) {
            this.nextHopIp = Objects.requireNonNull(nextHopIp);
            return this;
        }

        public Builder setNextHopNetwork(String nextHopNetwork) {
            this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
            return this;
        }

        public Builder setNextHopVpnTunnel(String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public RouterStatusBestRoute build() {
            return new RouterStatusBestRoute(description, destRange, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopInstanceZone, nextHopIp, nextHopNetwork, nextHopVpnTunnel, priority, project, selfLink, tags);
        }
    }
}
