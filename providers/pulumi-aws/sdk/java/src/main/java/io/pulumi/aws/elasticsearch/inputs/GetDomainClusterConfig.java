// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.GetDomainClusterConfigZoneAwarenessConfig;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainClusterConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainClusterConfig Empty = new GetDomainClusterConfig();

    /**
     * Number of dedicated master nodes in the cluster.
     * 
     */
    @InputImport(name="dedicatedMasterCount", required=true)
    private final Integer dedicatedMasterCount;

    public Integer getDedicatedMasterCount() {
        return this.dedicatedMasterCount;
    }

    /**
     * Indicates whether dedicated master nodes are enabled for the cluster.
     * 
     */
    @InputImport(name="dedicatedMasterEnabled", required=true)
    private final Boolean dedicatedMasterEnabled;

    public Boolean getDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * Instance type of the dedicated master nodes in the cluster.
     * 
     */
    @InputImport(name="dedicatedMasterType", required=true)
    private final String dedicatedMasterType;

    public String getDedicatedMasterType() {
        return this.dedicatedMasterType;
    }

    /**
     * Number of instances in the cluster.
     * 
     */
    @InputImport(name="instanceCount", required=true)
    private final Integer instanceCount;

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * Instance type of data nodes in the cluster.
     * 
     */
    @InputImport(name="instanceType", required=true)
    private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The number of warm nodes in the cluster.
     * 
     */
    @InputImport(name="warmCount", required=true)
    private final Integer warmCount;

    public Integer getWarmCount() {
        return this.warmCount;
    }

    /**
     * Indicates warm storage is enabled.
     * 
     */
    @InputImport(name="warmEnabled")
    private final @Nullable Boolean warmEnabled;

    public Optional<Boolean> getWarmEnabled() {
        return this.warmEnabled == null ? Optional.empty() : Optional.ofNullable(this.warmEnabled);
    }

    /**
     * The instance type for the Elasticsearch cluster's warm nodes.
     * 
     */
    @InputImport(name="warmType", required=true)
    private final String warmType;

    public String getWarmType() {
        return this.warmType;
    }

    /**
     * Configuration block containing zone awareness settings.
     * 
     */
    @InputImport(name="zoneAwarenessConfigs", required=true)
    private final List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs;

    public List<GetDomainClusterConfigZoneAwarenessConfig> getZoneAwarenessConfigs() {
        return this.zoneAwarenessConfigs;
    }

    /**
     * Indicates whether zone awareness is enabled.
     * 
     */
    @InputImport(name="zoneAwarenessEnabled", required=true)
    private final Boolean zoneAwarenessEnabled;

    public Boolean getZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    public GetDomainClusterConfig(
        Integer dedicatedMasterCount,
        Boolean dedicatedMasterEnabled,
        String dedicatedMasterType,
        Integer instanceCount,
        String instanceType,
        Integer warmCount,
        @Nullable Boolean warmEnabled,
        String warmType,
        List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs,
        Boolean zoneAwarenessEnabled) {
        this.dedicatedMasterCount = Objects.requireNonNull(dedicatedMasterCount, "expected parameter 'dedicatedMasterCount' to be non-null");
        this.dedicatedMasterEnabled = Objects.requireNonNull(dedicatedMasterEnabled, "expected parameter 'dedicatedMasterEnabled' to be non-null");
        this.dedicatedMasterType = Objects.requireNonNull(dedicatedMasterType, "expected parameter 'dedicatedMasterType' to be non-null");
        this.instanceCount = Objects.requireNonNull(instanceCount, "expected parameter 'instanceCount' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.warmCount = Objects.requireNonNull(warmCount, "expected parameter 'warmCount' to be non-null");
        this.warmEnabled = warmEnabled;
        this.warmType = Objects.requireNonNull(warmType, "expected parameter 'warmType' to be non-null");
        this.zoneAwarenessConfigs = Objects.requireNonNull(zoneAwarenessConfigs, "expected parameter 'zoneAwarenessConfigs' to be non-null");
        this.zoneAwarenessEnabled = Objects.requireNonNull(zoneAwarenessEnabled, "expected parameter 'zoneAwarenessEnabled' to be non-null");
    }

    private GetDomainClusterConfig() {
        this.dedicatedMasterCount = null;
        this.dedicatedMasterEnabled = null;
        this.dedicatedMasterType = null;
        this.instanceCount = null;
        this.instanceType = null;
        this.warmCount = null;
        this.warmEnabled = null;
        this.warmType = null;
        this.zoneAwarenessConfigs = List.of();
        this.zoneAwarenessEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer dedicatedMasterCount;
        private Boolean dedicatedMasterEnabled;
        private String dedicatedMasterType;
        private Integer instanceCount;
        private String instanceType;
        private Integer warmCount;
        private @Nullable Boolean warmEnabled;
        private String warmType;
        private List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs;
        private Boolean zoneAwarenessEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfigs = defaults.zoneAwarenessConfigs;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        public Builder setDedicatedMasterCount(Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = Objects.requireNonNull(dedicatedMasterCount);
            return this;
        }

        public Builder setDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = Objects.requireNonNull(dedicatedMasterEnabled);
            return this;
        }

        public Builder setDedicatedMasterType(String dedicatedMasterType) {
            this.dedicatedMasterType = Objects.requireNonNull(dedicatedMasterType);
            return this;
        }

        public Builder setInstanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setWarmCount(Integer warmCount) {
            this.warmCount = Objects.requireNonNull(warmCount);
            return this;
        }

        public Builder setWarmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }

        public Builder setWarmType(String warmType) {
            this.warmType = Objects.requireNonNull(warmType);
            return this;
        }

        public Builder setZoneAwarenessConfigs(List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs) {
            this.zoneAwarenessConfigs = Objects.requireNonNull(zoneAwarenessConfigs);
            return this;
        }

        public Builder setZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = Objects.requireNonNull(zoneAwarenessEnabled);
            return this;
        }
        public GetDomainClusterConfig build() {
            return new GetDomainClusterConfig(dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, warmCount, warmEnabled, warmType, zoneAwarenessConfigs, zoneAwarenessEnabled);
        }
    }
}
