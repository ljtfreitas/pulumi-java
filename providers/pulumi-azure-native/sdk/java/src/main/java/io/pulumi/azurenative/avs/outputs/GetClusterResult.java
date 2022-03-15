// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.azurenative.avs.outputs.SkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
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
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The state of the cluster provisioning
     * 
     */
    private final String provisioningState;
    /**
     * The cluster SKU
     * 
     */
    private final SkuResponse sku;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetClusterResult(
        @CustomType.Parameter("clusterId") Integer clusterId,
        @CustomType.Parameter("clusterSize") Integer clusterSize,
        @CustomType.Parameter("hosts") List<String> hosts,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("type") String type) {
        this.clusterId = clusterId;
        this.clusterSize = clusterSize;
        this.hosts = hosts;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.type = type;
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
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The state of the cluster provisioning
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The cluster SKU
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer clusterId;
        private Integer clusterSize;
        private List<String> hosts;
        private String id;
        private String name;
        private String provisioningState;
        private SkuResponse sku;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterSize = defaults.clusterSize;
    	      this.hosts = defaults.hosts;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
        }

        public Builder clusterId(Integer clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }

        public Builder hosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(clusterId, clusterSize, hosts, id, name, provisioningState, sku, type);
        }
    }
}
