// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigCloudrunConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigConfigConnectorConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigDnsCacheConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigHorizontalPodAutoscalingArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigHttpLoadBalancingArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigIstioConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigKalmConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterAddonsConfigNetworkPolicyConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterAddonsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAddonsConfigArgs Empty = new ClusterAddonsConfigArgs();

    /**
     * . Structure is documented below.
     * 
     */
    @Import(name="cloudrunConfig")
      private final @Nullable Output<ClusterAddonsConfigCloudrunConfigArgs> cloudrunConfig;

    public Output<ClusterAddonsConfigCloudrunConfigArgs> cloudrunConfig() {
        return this.cloudrunConfig == null ? Codegen.empty() : this.cloudrunConfig;
    }

    /**
     * .
     * The status of the ConfigConnector addon. It is disabled by default; Set `enabled = true` to enable.
     * 
     */
    @Import(name="configConnectorConfig")
      private final @Nullable Output<ClusterAddonsConfigConfigConnectorConfigArgs> configConnectorConfig;

    public Output<ClusterAddonsConfigConfigConnectorConfigArgs> configConnectorConfig() {
        return this.configConnectorConfig == null ? Codegen.empty() : this.configConnectorConfig;
    }

    /**
     * .
     * The status of the NodeLocal DNSCache addon. It is disabled by default.
     * Set `enabled = true` to enable.
     * 
     */
    @Import(name="dnsCacheConfig")
      private final @Nullable Output<ClusterAddonsConfigDnsCacheConfigArgs> dnsCacheConfig;

    public Output<ClusterAddonsConfigDnsCacheConfigArgs> dnsCacheConfig() {
        return this.dnsCacheConfig == null ? Codegen.empty() : this.dnsCacheConfig;
    }

    /**
     * .
     * Whether this cluster should enable the Google Compute Engine Persistent Disk Container Storage Interface (CSI) Driver. Defaults to disabled; set `enabled = true` to enable.
     * 
     */
    @Import(name="gcePersistentDiskCsiDriverConfig")
      private final @Nullable Output<ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig;

    public Output<ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig() {
        return this.gcePersistentDiskCsiDriverConfig == null ? Codegen.empty() : this.gcePersistentDiskCsiDriverConfig;
    }

    /**
     * The status of the Filestore CSI driver addon,
     * which allows the usage of filestore instance as volumes.
     * It is disbaled by default; set `enabled = true` to enable.
     * 
     */
    @Import(name="gcpFilestoreCsiDriverConfig")
      private final @Nullable Output<ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig;

    public Output<ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig() {
        return this.gcpFilestoreCsiDriverConfig == null ? Codegen.empty() : this.gcpFilestoreCsiDriverConfig;
    }

    /**
     * The status of the Horizontal Pod Autoscaling
     * addon, which increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * It is enabled by default;
     * set `disabled = true` to disable.
     * 
     */
    @Import(name="horizontalPodAutoscaling")
      private final @Nullable Output<ClusterAddonsConfigHorizontalPodAutoscalingArgs> horizontalPodAutoscaling;

    public Output<ClusterAddonsConfigHorizontalPodAutoscalingArgs> horizontalPodAutoscaling() {
        return this.horizontalPodAutoscaling == null ? Codegen.empty() : this.horizontalPodAutoscaling;
    }

    /**
     * The status of the HTTP (L7) load balancing
     * controller addon, which makes it easy to set up HTTP load balancers for services in a
     * cluster. It is enabled by default; set `disabled = true` to disable.
     * 
     */
    @Import(name="httpLoadBalancing")
      private final @Nullable Output<ClusterAddonsConfigHttpLoadBalancingArgs> httpLoadBalancing;

    public Output<ClusterAddonsConfigHttpLoadBalancingArgs> httpLoadBalancing() {
        return this.httpLoadBalancing == null ? Codegen.empty() : this.httpLoadBalancing;
    }

    /**
     * .
     * Structure is documented below.
     * 
     */
    @Import(name="istioConfig")
      private final @Nullable Output<ClusterAddonsConfigIstioConfigArgs> istioConfig;

    public Output<ClusterAddonsConfigIstioConfigArgs> istioConfig() {
        return this.istioConfig == null ? Codegen.empty() : this.istioConfig;
    }

    /**
     * .
     * Configuration for the KALM addon, which manages the lifecycle of k8s. It is disabled by default; Set `enabled = true` to enable.
     * 
     */
    @Import(name="kalmConfig")
      private final @Nullable Output<ClusterAddonsConfigKalmConfigArgs> kalmConfig;

    public Output<ClusterAddonsConfigKalmConfigArgs> kalmConfig() {
        return this.kalmConfig == null ? Codegen.empty() : this.kalmConfig;
    }

    /**
     * Whether we should enable the network policy addon
     * for the master.  This must be enabled in order to enable network policy for the nodes.
     * To enable this, you must also define a `network_policy` block,
     * otherwise nothing will happen.
     * It can only be disabled if the nodes already do not have network policies enabled.
     * Defaults to disabled; set `disabled = false` to enable.
     * 
     */
    @Import(name="networkPolicyConfig")
      private final @Nullable Output<ClusterAddonsConfigNetworkPolicyConfigArgs> networkPolicyConfig;

    public Output<ClusterAddonsConfigNetworkPolicyConfigArgs> networkPolicyConfig() {
        return this.networkPolicyConfig == null ? Codegen.empty() : this.networkPolicyConfig;
    }

    public ClusterAddonsConfigArgs(
        @Nullable Output<ClusterAddonsConfigCloudrunConfigArgs> cloudrunConfig,
        @Nullable Output<ClusterAddonsConfigConfigConnectorConfigArgs> configConnectorConfig,
        @Nullable Output<ClusterAddonsConfigDnsCacheConfigArgs> dnsCacheConfig,
        @Nullable Output<ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig,
        @Nullable Output<ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig,
        @Nullable Output<ClusterAddonsConfigHorizontalPodAutoscalingArgs> horizontalPodAutoscaling,
        @Nullable Output<ClusterAddonsConfigHttpLoadBalancingArgs> httpLoadBalancing,
        @Nullable Output<ClusterAddonsConfigIstioConfigArgs> istioConfig,
        @Nullable Output<ClusterAddonsConfigKalmConfigArgs> kalmConfig,
        @Nullable Output<ClusterAddonsConfigNetworkPolicyConfigArgs> networkPolicyConfig) {
        this.cloudrunConfig = cloudrunConfig;
        this.configConnectorConfig = configConnectorConfig;
        this.dnsCacheConfig = dnsCacheConfig;
        this.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
        this.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
        this.horizontalPodAutoscaling = horizontalPodAutoscaling;
        this.httpLoadBalancing = httpLoadBalancing;
        this.istioConfig = istioConfig;
        this.kalmConfig = kalmConfig;
        this.networkPolicyConfig = networkPolicyConfig;
    }

    private ClusterAddonsConfigArgs() {
        this.cloudrunConfig = Codegen.empty();
        this.configConnectorConfig = Codegen.empty();
        this.dnsCacheConfig = Codegen.empty();
        this.gcePersistentDiskCsiDriverConfig = Codegen.empty();
        this.gcpFilestoreCsiDriverConfig = Codegen.empty();
        this.horizontalPodAutoscaling = Codegen.empty();
        this.httpLoadBalancing = Codegen.empty();
        this.istioConfig = Codegen.empty();
        this.kalmConfig = Codegen.empty();
        this.networkPolicyConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterAddonsConfigCloudrunConfigArgs> cloudrunConfig;
        private @Nullable Output<ClusterAddonsConfigConfigConnectorConfigArgs> configConnectorConfig;
        private @Nullable Output<ClusterAddonsConfigDnsCacheConfigArgs> dnsCacheConfig;
        private @Nullable Output<ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig;
        private @Nullable Output<ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig;
        private @Nullable Output<ClusterAddonsConfigHorizontalPodAutoscalingArgs> horizontalPodAutoscaling;
        private @Nullable Output<ClusterAddonsConfigHttpLoadBalancingArgs> httpLoadBalancing;
        private @Nullable Output<ClusterAddonsConfigIstioConfigArgs> istioConfig;
        private @Nullable Output<ClusterAddonsConfigKalmConfigArgs> kalmConfig;
        private @Nullable Output<ClusterAddonsConfigNetworkPolicyConfigArgs> networkPolicyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudrunConfig = defaults.cloudrunConfig;
    	      this.configConnectorConfig = defaults.configConnectorConfig;
    	      this.dnsCacheConfig = defaults.dnsCacheConfig;
    	      this.gcePersistentDiskCsiDriverConfig = defaults.gcePersistentDiskCsiDriverConfig;
    	      this.gcpFilestoreCsiDriverConfig = defaults.gcpFilestoreCsiDriverConfig;
    	      this.horizontalPodAutoscaling = defaults.horizontalPodAutoscaling;
    	      this.httpLoadBalancing = defaults.httpLoadBalancing;
    	      this.istioConfig = defaults.istioConfig;
    	      this.kalmConfig = defaults.kalmConfig;
    	      this.networkPolicyConfig = defaults.networkPolicyConfig;
        }

        public Builder cloudrunConfig(@Nullable Output<ClusterAddonsConfigCloudrunConfigArgs> cloudrunConfig) {
            this.cloudrunConfig = cloudrunConfig;
            return this;
        }
        public Builder cloudrunConfig(@Nullable ClusterAddonsConfigCloudrunConfigArgs cloudrunConfig) {
            this.cloudrunConfig = Codegen.ofNullable(cloudrunConfig);
            return this;
        }
        public Builder configConnectorConfig(@Nullable Output<ClusterAddonsConfigConfigConnectorConfigArgs> configConnectorConfig) {
            this.configConnectorConfig = configConnectorConfig;
            return this;
        }
        public Builder configConnectorConfig(@Nullable ClusterAddonsConfigConfigConnectorConfigArgs configConnectorConfig) {
            this.configConnectorConfig = Codegen.ofNullable(configConnectorConfig);
            return this;
        }
        public Builder dnsCacheConfig(@Nullable Output<ClusterAddonsConfigDnsCacheConfigArgs> dnsCacheConfig) {
            this.dnsCacheConfig = dnsCacheConfig;
            return this;
        }
        public Builder dnsCacheConfig(@Nullable ClusterAddonsConfigDnsCacheConfigArgs dnsCacheConfig) {
            this.dnsCacheConfig = Codegen.ofNullable(dnsCacheConfig);
            return this;
        }
        public Builder gcePersistentDiskCsiDriverConfig(@Nullable Output<ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig) {
            this.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
            return this;
        }
        public Builder gcePersistentDiskCsiDriverConfig(@Nullable ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs gcePersistentDiskCsiDriverConfig) {
            this.gcePersistentDiskCsiDriverConfig = Codegen.ofNullable(gcePersistentDiskCsiDriverConfig);
            return this;
        }
        public Builder gcpFilestoreCsiDriverConfig(@Nullable Output<ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig) {
            this.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
            return this;
        }
        public Builder gcpFilestoreCsiDriverConfig(@Nullable ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs gcpFilestoreCsiDriverConfig) {
            this.gcpFilestoreCsiDriverConfig = Codegen.ofNullable(gcpFilestoreCsiDriverConfig);
            return this;
        }
        public Builder horizontalPodAutoscaling(@Nullable Output<ClusterAddonsConfigHorizontalPodAutoscalingArgs> horizontalPodAutoscaling) {
            this.horizontalPodAutoscaling = horizontalPodAutoscaling;
            return this;
        }
        public Builder horizontalPodAutoscaling(@Nullable ClusterAddonsConfigHorizontalPodAutoscalingArgs horizontalPodAutoscaling) {
            this.horizontalPodAutoscaling = Codegen.ofNullable(horizontalPodAutoscaling);
            return this;
        }
        public Builder httpLoadBalancing(@Nullable Output<ClusterAddonsConfigHttpLoadBalancingArgs> httpLoadBalancing) {
            this.httpLoadBalancing = httpLoadBalancing;
            return this;
        }
        public Builder httpLoadBalancing(@Nullable ClusterAddonsConfigHttpLoadBalancingArgs httpLoadBalancing) {
            this.httpLoadBalancing = Codegen.ofNullable(httpLoadBalancing);
            return this;
        }
        public Builder istioConfig(@Nullable Output<ClusterAddonsConfigIstioConfigArgs> istioConfig) {
            this.istioConfig = istioConfig;
            return this;
        }
        public Builder istioConfig(@Nullable ClusterAddonsConfigIstioConfigArgs istioConfig) {
            this.istioConfig = Codegen.ofNullable(istioConfig);
            return this;
        }
        public Builder kalmConfig(@Nullable Output<ClusterAddonsConfigKalmConfigArgs> kalmConfig) {
            this.kalmConfig = kalmConfig;
            return this;
        }
        public Builder kalmConfig(@Nullable ClusterAddonsConfigKalmConfigArgs kalmConfig) {
            this.kalmConfig = Codegen.ofNullable(kalmConfig);
            return this;
        }
        public Builder networkPolicyConfig(@Nullable Output<ClusterAddonsConfigNetworkPolicyConfigArgs> networkPolicyConfig) {
            this.networkPolicyConfig = networkPolicyConfig;
            return this;
        }
        public Builder networkPolicyConfig(@Nullable ClusterAddonsConfigNetworkPolicyConfigArgs networkPolicyConfig) {
            this.networkPolicyConfig = Codegen.ofNullable(networkPolicyConfig);
            return this;
        }        public ClusterAddonsConfigArgs build() {
            return new ClusterAddonsConfigArgs(cloudrunConfig, configConnectorConfig, dnsCacheConfig, gcePersistentDiskCsiDriverConfig, gcpFilestoreCsiDriverConfig, horizontalPodAutoscaling, httpLoadBalancing, istioConfig, kalmConfig, networkPolicyConfig);
        }
    }
}
