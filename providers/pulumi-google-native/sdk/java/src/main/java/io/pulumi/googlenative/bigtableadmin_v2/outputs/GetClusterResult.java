// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.ClusterConfigResponse;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.EncryptionConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterResult {
    /**
     * Configuration for this cluster.
     * 
     */
    private final ClusterConfigResponse clusterConfig;
    /**
     * Immutable. The type of storage used by this cluster to serve its parent instance's tables, unless explicitly overridden.
     * 
     */
    private final String defaultStorageType;
    /**
     * Immutable. The encryption configuration for CMEK-protected clusters.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * Immutable. The location where this cluster's nodes and storage reside. For best performance, clients should be located as close as possible to this cluster. Currently only zones are supported, so values should be of the form `projects/{project}/locations/{zone}`.
     * 
     */
    private final String location;
    /**
     * The unique name of the cluster. Values are of the form `projects/{project}/instances/{instance}/clusters/a-z*`.
     * 
     */
    private final String name;
    /**
     * The number of nodes allocated to this cluster. More nodes enable higher throughput and more consistent performance.
     * 
     */
    private final Integer serveNodes;
    /**
     * The current state of the cluster.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"clusterConfig","defaultStorageType","encryptionConfig","location","name","serveNodes","state"})
    private GetClusterResult(
        ClusterConfigResponse clusterConfig,
        String defaultStorageType,
        EncryptionConfigResponse encryptionConfig,
        String location,
        String name,
        Integer serveNodes,
        String state) {
        this.clusterConfig = Objects.requireNonNull(clusterConfig);
        this.defaultStorageType = Objects.requireNonNull(defaultStorageType);
        this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.serveNodes = Objects.requireNonNull(serveNodes);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * Configuration for this cluster.
     * 
     */
    public ClusterConfigResponse getClusterConfig() {
        return this.clusterConfig;
    }
    /**
     * Immutable. The type of storage used by this cluster to serve its parent instance's tables, unless explicitly overridden.
     * 
     */
    public String getDefaultStorageType() {
        return this.defaultStorageType;
    }
    /**
     * Immutable. The encryption configuration for CMEK-protected clusters.
     * 
     */
    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * Immutable. The location where this cluster's nodes and storage reside. For best performance, clients should be located as close as possible to this cluster. Currently only zones are supported, so values should be of the form `projects/{project}/locations/{zone}`.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The unique name of the cluster. Values are of the form `projects/{project}/instances/{instance}/clusters/a-z*`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The number of nodes allocated to this cluster. More nodes enable higher throughput and more consistent performance.
     * 
     */
    public Integer getServeNodes() {
        return this.serveNodes;
    }
    /**
     * The current state of the cluster.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConfigResponse clusterConfig;
        private String defaultStorageType;
        private EncryptionConfigResponse encryptionConfig;
        private String location;
        private String name;
        private Integer serveNodes;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.defaultStorageType = defaults.defaultStorageType;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.serveNodes = defaults.serveNodes;
    	      this.state = defaults.state;
        }

        public Builder setClusterConfig(ClusterConfigResponse clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }

        public Builder setDefaultStorageType(String defaultStorageType) {
            this.defaultStorageType = Objects.requireNonNull(defaultStorageType);
            return this;
        }

        public Builder setEncryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServeNodes(Integer serveNodes) {
            this.serveNodes = Objects.requireNonNull(serveNodes);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(clusterConfig, defaultStorageType, encryptionConfig, location, name, serveNodes, state);
        }
    }
}
