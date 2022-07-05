// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container.v1.outputs.NetworkPerformanceConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodeNetworkConfigResponse {
    /**
     * @return Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    private final Boolean createPodRange;
    /**
     * @return Network bandwidth tier configuration.
     * 
     */
    private final NetworkPerformanceConfigResponse networkPerformanceConfig;
    /**
     * @return The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    private final String podIpv4CidrBlock;
    /**
     * @return The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    private final String podRange;

    @CustomType.Constructor
    private NodeNetworkConfigResponse(
        @CustomType.Parameter("createPodRange") Boolean createPodRange,
        @CustomType.Parameter("networkPerformanceConfig") NetworkPerformanceConfigResponse networkPerformanceConfig,
        @CustomType.Parameter("podIpv4CidrBlock") String podIpv4CidrBlock,
        @CustomType.Parameter("podRange") String podRange) {
        this.createPodRange = createPodRange;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.podIpv4CidrBlock = podIpv4CidrBlock;
        this.podRange = podRange;
    }

    /**
     * @return Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    public Boolean createPodRange() {
        return this.createPodRange;
    }
    /**
     * @return Network bandwidth tier configuration.
     * 
     */
    public NetworkPerformanceConfigResponse networkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }
    /**
     * @return The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    public String podIpv4CidrBlock() {
        return this.podIpv4CidrBlock;
    }
    /**
     * @return The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    public String podRange() {
        return this.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeNetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean createPodRange;
        private NetworkPerformanceConfigResponse networkPerformanceConfig;
        private String podIpv4CidrBlock;
        private String podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeNetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder createPodRange(Boolean createPodRange) {
            this.createPodRange = Objects.requireNonNull(createPodRange);
            return this;
        }
        public Builder networkPerformanceConfig(NetworkPerformanceConfigResponse networkPerformanceConfig) {
            this.networkPerformanceConfig = Objects.requireNonNull(networkPerformanceConfig);
            return this;
        }
        public Builder podIpv4CidrBlock(String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = Objects.requireNonNull(podIpv4CidrBlock);
            return this;
        }
        public Builder podRange(String podRange) {
            this.podRange = Objects.requireNonNull(podRange);
            return this;
        }        public NodeNetworkConfigResponse build() {
            return new NodeNetworkConfigResponse(createPodRange, networkPerformanceConfig, podIpv4CidrBlock, podRange);
        }
    }
}
