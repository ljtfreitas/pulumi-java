// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainClusterConfigZoneAwarenessConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainClusterConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainClusterConfigGetArgs Empty = new DomainClusterConfigGetArgs();

    /**
     * Number of dedicated main nodes in the cluster.
     * 
     */
    @Import(name="dedicatedMasterCount")
      private final @Nullable Output<Integer> dedicatedMasterCount;

    public Output<Integer> getDedicatedMasterCount() {
        return this.dedicatedMasterCount == null ? Output.empty() : this.dedicatedMasterCount;
    }

    /**
     * Whether dedicated main nodes are enabled for the cluster.
     * 
     */
    @Import(name="dedicatedMasterEnabled")
      private final @Nullable Output<Boolean> dedicatedMasterEnabled;

    public Output<Boolean> getDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled == null ? Output.empty() : this.dedicatedMasterEnabled;
    }

    /**
     * Instance type of the dedicated main nodes in the cluster.
     * 
     */
    @Import(name="dedicatedMasterType")
      private final @Nullable Output<String> dedicatedMasterType;

    public Output<String> getDedicatedMasterType() {
        return this.dedicatedMasterType == null ? Output.empty() : this.dedicatedMasterType;
    }

    /**
     * Number of instances in the cluster.
     * 
     */
    @Import(name="instanceCount")
      private final @Nullable Output<Integer> instanceCount;

    public Output<Integer> getInstanceCount() {
        return this.instanceCount == null ? Output.empty() : this.instanceCount;
    }

    /**
     * Instance type of data nodes in the cluster.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * Number of warm nodes in the cluster. Valid values are between `2` and `150`. `warm_count` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    @Import(name="warmCount")
      private final @Nullable Output<Integer> warmCount;

    public Output<Integer> getWarmCount() {
        return this.warmCount == null ? Output.empty() : this.warmCount;
    }

    /**
     * Whether to enable warm storage.
     * 
     */
    @Import(name="warmEnabled")
      private final @Nullable Output<Boolean> warmEnabled;

    public Output<Boolean> getWarmEnabled() {
        return this.warmEnabled == null ? Output.empty() : this.warmEnabled;
    }

    /**
     * Instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warm_type` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    @Import(name="warmType")
      private final @Nullable Output<String> warmType;

    public Output<String> getWarmType() {
        return this.warmType == null ? Output.empty() : this.warmType;
    }

    /**
     * Configuration block containing zone awareness settings. Detailed below.
     * 
     */
    @Import(name="zoneAwarenessConfig")
      private final @Nullable Output<DomainClusterConfigZoneAwarenessConfigGetArgs> zoneAwarenessConfig;

    public Output<DomainClusterConfigZoneAwarenessConfigGetArgs> getZoneAwarenessConfig() {
        return this.zoneAwarenessConfig == null ? Output.empty() : this.zoneAwarenessConfig;
    }

    /**
     * Whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availability_zone_count` within the `zone_awareness_config` must be set to `3`.
     * 
     */
    @Import(name="zoneAwarenessEnabled")
      private final @Nullable Output<Boolean> zoneAwarenessEnabled;

    public Output<Boolean> getZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled == null ? Output.empty() : this.zoneAwarenessEnabled;
    }

    public DomainClusterConfigGetArgs(
        @Nullable Output<Integer> dedicatedMasterCount,
        @Nullable Output<Boolean> dedicatedMasterEnabled,
        @Nullable Output<String> dedicatedMasterType,
        @Nullable Output<Integer> instanceCount,
        @Nullable Output<String> instanceType,
        @Nullable Output<Integer> warmCount,
        @Nullable Output<Boolean> warmEnabled,
        @Nullable Output<String> warmType,
        @Nullable Output<DomainClusterConfigZoneAwarenessConfigGetArgs> zoneAwarenessConfig,
        @Nullable Output<Boolean> zoneAwarenessEnabled) {
        this.dedicatedMasterCount = dedicatedMasterCount;
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        this.dedicatedMasterType = dedicatedMasterType;
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.warmCount = warmCount;
        this.warmEnabled = warmEnabled;
        this.warmType = warmType;
        this.zoneAwarenessConfig = zoneAwarenessConfig;
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    private DomainClusterConfigGetArgs() {
        this.dedicatedMasterCount = Output.empty();
        this.dedicatedMasterEnabled = Output.empty();
        this.dedicatedMasterType = Output.empty();
        this.instanceCount = Output.empty();
        this.instanceType = Output.empty();
        this.warmCount = Output.empty();
        this.warmEnabled = Output.empty();
        this.warmType = Output.empty();
        this.zoneAwarenessConfig = Output.empty();
        this.zoneAwarenessEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> dedicatedMasterCount;
        private @Nullable Output<Boolean> dedicatedMasterEnabled;
        private @Nullable Output<String> dedicatedMasterType;
        private @Nullable Output<Integer> instanceCount;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<Integer> warmCount;
        private @Nullable Output<Boolean> warmEnabled;
        private @Nullable Output<String> warmType;
        private @Nullable Output<DomainClusterConfigZoneAwarenessConfigGetArgs> zoneAwarenessConfig;
        private @Nullable Output<Boolean> zoneAwarenessEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainClusterConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfig = defaults.zoneAwarenessConfig;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        public Builder dedicatedMasterCount(@Nullable Output<Integer> dedicatedMasterCount) {
            this.dedicatedMasterCount = dedicatedMasterCount;
            return this;
        }

        public Builder dedicatedMasterCount(@Nullable Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = Output.ofNullable(dedicatedMasterCount);
            return this;
        }

        public Builder dedicatedMasterEnabled(@Nullable Output<Boolean> dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = dedicatedMasterEnabled;
            return this;
        }

        public Builder dedicatedMasterEnabled(@Nullable Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = Output.ofNullable(dedicatedMasterEnabled);
            return this;
        }

        public Builder dedicatedMasterType(@Nullable Output<String> dedicatedMasterType) {
            this.dedicatedMasterType = dedicatedMasterType;
            return this;
        }

        public Builder dedicatedMasterType(@Nullable String dedicatedMasterType) {
            this.dedicatedMasterType = Output.ofNullable(dedicatedMasterType);
            return this;
        }

        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = Output.ofNullable(instanceCount);
            return this;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }

        public Builder warmCount(@Nullable Output<Integer> warmCount) {
            this.warmCount = warmCount;
            return this;
        }

        public Builder warmCount(@Nullable Integer warmCount) {
            this.warmCount = Output.ofNullable(warmCount);
            return this;
        }

        public Builder warmEnabled(@Nullable Output<Boolean> warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }

        public Builder warmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = Output.ofNullable(warmEnabled);
            return this;
        }

        public Builder warmType(@Nullable Output<String> warmType) {
            this.warmType = warmType;
            return this;
        }

        public Builder warmType(@Nullable String warmType) {
            this.warmType = Output.ofNullable(warmType);
            return this;
        }

        public Builder zoneAwarenessConfig(@Nullable Output<DomainClusterConfigZoneAwarenessConfigGetArgs> zoneAwarenessConfig) {
            this.zoneAwarenessConfig = zoneAwarenessConfig;
            return this;
        }

        public Builder zoneAwarenessConfig(@Nullable DomainClusterConfigZoneAwarenessConfigGetArgs zoneAwarenessConfig) {
            this.zoneAwarenessConfig = Output.ofNullable(zoneAwarenessConfig);
            return this;
        }

        public Builder zoneAwarenessEnabled(@Nullable Output<Boolean> zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return this;
        }

        public Builder zoneAwarenessEnabled(@Nullable Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = Output.ofNullable(zoneAwarenessEnabled);
            return this;
        }
        public DomainClusterConfigGetArgs build() {
            return new DomainClusterConfigGetArgs(dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, warmCount, warmEnabled, warmType, zoneAwarenessConfig, zoneAwarenessEnabled);
        }
    }
}
