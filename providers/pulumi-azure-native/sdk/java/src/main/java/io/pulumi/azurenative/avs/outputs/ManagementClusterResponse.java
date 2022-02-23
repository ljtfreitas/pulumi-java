// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManagementClusterResponse {
    /**
     * The identity
     * 
     */
    private final Integer clusterId;
    /**
     * The cluster size
     * 
     */
    private final Integer clusterSize;
    /**
     * The hosts
     * 
     */
    private final List<String> hosts;
    /**
     * The state of the cluster provisioning
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"clusterId","clusterSize","hosts","provisioningState"})
    private ManagementClusterResponse(
        Integer clusterId,
        Integer clusterSize,
        List<String> hosts,
        String provisioningState) {
        this.clusterId = Objects.requireNonNull(clusterId);
        this.clusterSize = Objects.requireNonNull(clusterSize);
        this.hosts = Objects.requireNonNull(hosts);
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * The identity
     * 
     */
    public Integer getClusterId() {
        return this.clusterId;
    }
    /**
     * The cluster size
     * 
     */
    public Integer getClusterSize() {
        return this.clusterSize;
    }
    /**
     * The hosts
     * 
     */
    public List<String> getHosts() {
        return this.hosts;
    }
    /**
     * The state of the cluster provisioning
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer clusterId;
        private Integer clusterSize;
        private List<String> hosts;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterSize = defaults.clusterSize;
    	      this.hosts = defaults.hosts;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setClusterId(Integer clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterSize(Integer clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }

        public Builder setHosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ManagementClusterResponse build() {
            return new ManagementClusterResponse(clusterId, clusterSize, hosts, provisioningState);
        }
    }
}
