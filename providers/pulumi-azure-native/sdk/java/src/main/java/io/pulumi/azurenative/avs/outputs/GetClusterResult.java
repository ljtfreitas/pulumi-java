// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.azurenative.avs.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterResult {
    private final Integer clusterId;
    private final Integer clusterSize;
    private final List<String> hosts;
    private final String id;
    private final String name;
    private final String provisioningState;
    private final SkuResponse sku;
    private final String type;

    @OutputCustomType.Constructor({"clusterId","clusterSize","hosts","id","name","provisioningState","sku","type"})
    private GetClusterResult(
        Integer clusterId,
        Integer clusterSize,
        List<String> hosts,
        String id,
        String name,
        String provisioningState,
        SkuResponse sku,
        String type) {
        this.clusterId = Objects.requireNonNull(clusterId);
        this.clusterSize = Objects.requireNonNull(clusterSize);
        this.hosts = Objects.requireNonNull(hosts);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = Objects.requireNonNull(sku);
        this.type = Objects.requireNonNull(type);
    }

    public Integer getClusterId() {
        return this.clusterId;
    }
    public Integer getClusterSize() {
        return this.clusterSize;
    }
    public List<String> getHosts() {
        return this.hosts;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SkuResponse getSku() {
        return this.sku;
    }
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

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetClusterResult build() {
            return new GetClusterResult(clusterId, clusterSize, hosts, id, name, provisioningState, sku, type);
        }
    }
}