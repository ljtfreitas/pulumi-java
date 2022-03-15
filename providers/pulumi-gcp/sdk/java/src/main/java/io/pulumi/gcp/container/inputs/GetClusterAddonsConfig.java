// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigCloudrunConfig;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigConfigConnectorConfig;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigDnsCacheConfig;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigGcpFilestoreCsiDriverConfig;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigHorizontalPodAutoscaling;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigHttpLoadBalancing;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigIstioConfig;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigKalmConfig;
import io.pulumi.gcp.container.inputs.GetClusterAddonsConfigNetworkPolicyConfig;
import java.util.List;
import java.util.Objects;


public final class GetClusterAddonsConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterAddonsConfig Empty = new GetClusterAddonsConfig();

    @Import(name="cloudrunConfigs", required=true)
      private final List<GetClusterAddonsConfigCloudrunConfig> cloudrunConfigs;

    public List<GetClusterAddonsConfigCloudrunConfig> getCloudrunConfigs() {
        return this.cloudrunConfigs;
    }

    @Import(name="configConnectorConfigs", required=true)
      private final List<GetClusterAddonsConfigConfigConnectorConfig> configConnectorConfigs;

    public List<GetClusterAddonsConfigConfigConnectorConfig> getConfigConnectorConfigs() {
        return this.configConnectorConfigs;
    }

    @Import(name="dnsCacheConfigs", required=true)
      private final List<GetClusterAddonsConfigDnsCacheConfig> dnsCacheConfigs;

    public List<GetClusterAddonsConfigDnsCacheConfig> getDnsCacheConfigs() {
        return this.dnsCacheConfigs;
    }

    @Import(name="gcePersistentDiskCsiDriverConfigs", required=true)
      private final List<GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig> gcePersistentDiskCsiDriverConfigs;

    public List<GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig> getGcePersistentDiskCsiDriverConfigs() {
        return this.gcePersistentDiskCsiDriverConfigs;
    }

    @Import(name="gcpFilestoreCsiDriverConfigs", required=true)
      private final List<GetClusterAddonsConfigGcpFilestoreCsiDriverConfig> gcpFilestoreCsiDriverConfigs;

    public List<GetClusterAddonsConfigGcpFilestoreCsiDriverConfig> getGcpFilestoreCsiDriverConfigs() {
        return this.gcpFilestoreCsiDriverConfigs;
    }

    @Import(name="horizontalPodAutoscalings", required=true)
      private final List<GetClusterAddonsConfigHorizontalPodAutoscaling> horizontalPodAutoscalings;

    public List<GetClusterAddonsConfigHorizontalPodAutoscaling> getHorizontalPodAutoscalings() {
        return this.horizontalPodAutoscalings;
    }

    @Import(name="httpLoadBalancings", required=true)
      private final List<GetClusterAddonsConfigHttpLoadBalancing> httpLoadBalancings;

    public List<GetClusterAddonsConfigHttpLoadBalancing> getHttpLoadBalancings() {
        return this.httpLoadBalancings;
    }

    @Import(name="istioConfigs", required=true)
      private final List<GetClusterAddonsConfigIstioConfig> istioConfigs;

    public List<GetClusterAddonsConfigIstioConfig> getIstioConfigs() {
        return this.istioConfigs;
    }

    @Import(name="kalmConfigs", required=true)
      private final List<GetClusterAddonsConfigKalmConfig> kalmConfigs;

    public List<GetClusterAddonsConfigKalmConfig> getKalmConfigs() {
        return this.kalmConfigs;
    }

    @Import(name="networkPolicyConfigs", required=true)
      private final List<GetClusterAddonsConfigNetworkPolicyConfig> networkPolicyConfigs;

    public List<GetClusterAddonsConfigNetworkPolicyConfig> getNetworkPolicyConfigs() {
        return this.networkPolicyConfigs;
    }

    public GetClusterAddonsConfig(
        List<GetClusterAddonsConfigCloudrunConfig> cloudrunConfigs,
        List<GetClusterAddonsConfigConfigConnectorConfig> configConnectorConfigs,
        List<GetClusterAddonsConfigDnsCacheConfig> dnsCacheConfigs,
        List<GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig> gcePersistentDiskCsiDriverConfigs,
        List<GetClusterAddonsConfigGcpFilestoreCsiDriverConfig> gcpFilestoreCsiDriverConfigs,
        List<GetClusterAddonsConfigHorizontalPodAutoscaling> horizontalPodAutoscalings,
        List<GetClusterAddonsConfigHttpLoadBalancing> httpLoadBalancings,
        List<GetClusterAddonsConfigIstioConfig> istioConfigs,
        List<GetClusterAddonsConfigKalmConfig> kalmConfigs,
        List<GetClusterAddonsConfigNetworkPolicyConfig> networkPolicyConfigs) {
        this.cloudrunConfigs = Objects.requireNonNull(cloudrunConfigs, "expected parameter 'cloudrunConfigs' to be non-null");
        this.configConnectorConfigs = Objects.requireNonNull(configConnectorConfigs, "expected parameter 'configConnectorConfigs' to be non-null");
        this.dnsCacheConfigs = Objects.requireNonNull(dnsCacheConfigs, "expected parameter 'dnsCacheConfigs' to be non-null");
        this.gcePersistentDiskCsiDriverConfigs = Objects.requireNonNull(gcePersistentDiskCsiDriverConfigs, "expected parameter 'gcePersistentDiskCsiDriverConfigs' to be non-null");
        this.gcpFilestoreCsiDriverConfigs = Objects.requireNonNull(gcpFilestoreCsiDriverConfigs, "expected parameter 'gcpFilestoreCsiDriverConfigs' to be non-null");
        this.horizontalPodAutoscalings = Objects.requireNonNull(horizontalPodAutoscalings, "expected parameter 'horizontalPodAutoscalings' to be non-null");
        this.httpLoadBalancings = Objects.requireNonNull(httpLoadBalancings, "expected parameter 'httpLoadBalancings' to be non-null");
        this.istioConfigs = Objects.requireNonNull(istioConfigs, "expected parameter 'istioConfigs' to be non-null");
        this.kalmConfigs = Objects.requireNonNull(kalmConfigs, "expected parameter 'kalmConfigs' to be non-null");
        this.networkPolicyConfigs = Objects.requireNonNull(networkPolicyConfigs, "expected parameter 'networkPolicyConfigs' to be non-null");
    }

    private GetClusterAddonsConfig() {
        this.cloudrunConfigs = List.of();
        this.configConnectorConfigs = List.of();
        this.dnsCacheConfigs = List.of();
        this.gcePersistentDiskCsiDriverConfigs = List.of();
        this.gcpFilestoreCsiDriverConfigs = List.of();
        this.horizontalPodAutoscalings = List.of();
        this.httpLoadBalancings = List.of();
        this.istioConfigs = List.of();
        this.kalmConfigs = List.of();
        this.networkPolicyConfigs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAddonsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterAddonsConfigCloudrunConfig> cloudrunConfigs;
        private List<GetClusterAddonsConfigConfigConnectorConfig> configConnectorConfigs;
        private List<GetClusterAddonsConfigDnsCacheConfig> dnsCacheConfigs;
        private List<GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig> gcePersistentDiskCsiDriverConfigs;
        private List<GetClusterAddonsConfigGcpFilestoreCsiDriverConfig> gcpFilestoreCsiDriverConfigs;
        private List<GetClusterAddonsConfigHorizontalPodAutoscaling> horizontalPodAutoscalings;
        private List<GetClusterAddonsConfigHttpLoadBalancing> httpLoadBalancings;
        private List<GetClusterAddonsConfigIstioConfig> istioConfigs;
        private List<GetClusterAddonsConfigKalmConfig> kalmConfigs;
        private List<GetClusterAddonsConfigNetworkPolicyConfig> networkPolicyConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAddonsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudrunConfigs = defaults.cloudrunConfigs;
    	      this.configConnectorConfigs = defaults.configConnectorConfigs;
    	      this.dnsCacheConfigs = defaults.dnsCacheConfigs;
    	      this.gcePersistentDiskCsiDriverConfigs = defaults.gcePersistentDiskCsiDriverConfigs;
    	      this.gcpFilestoreCsiDriverConfigs = defaults.gcpFilestoreCsiDriverConfigs;
    	      this.horizontalPodAutoscalings = defaults.horizontalPodAutoscalings;
    	      this.httpLoadBalancings = defaults.httpLoadBalancings;
    	      this.istioConfigs = defaults.istioConfigs;
    	      this.kalmConfigs = defaults.kalmConfigs;
    	      this.networkPolicyConfigs = defaults.networkPolicyConfigs;
        }

        public Builder cloudrunConfigs(List<GetClusterAddonsConfigCloudrunConfig> cloudrunConfigs) {
            this.cloudrunConfigs = Objects.requireNonNull(cloudrunConfigs);
            return this;
        }

        public Builder configConnectorConfigs(List<GetClusterAddonsConfigConfigConnectorConfig> configConnectorConfigs) {
            this.configConnectorConfigs = Objects.requireNonNull(configConnectorConfigs);
            return this;
        }

        public Builder dnsCacheConfigs(List<GetClusterAddonsConfigDnsCacheConfig> dnsCacheConfigs) {
            this.dnsCacheConfigs = Objects.requireNonNull(dnsCacheConfigs);
            return this;
        }

        public Builder gcePersistentDiskCsiDriverConfigs(List<GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig> gcePersistentDiskCsiDriverConfigs) {
            this.gcePersistentDiskCsiDriverConfigs = Objects.requireNonNull(gcePersistentDiskCsiDriverConfigs);
            return this;
        }

        public Builder gcpFilestoreCsiDriverConfigs(List<GetClusterAddonsConfigGcpFilestoreCsiDriverConfig> gcpFilestoreCsiDriverConfigs) {
            this.gcpFilestoreCsiDriverConfigs = Objects.requireNonNull(gcpFilestoreCsiDriverConfigs);
            return this;
        }

        public Builder horizontalPodAutoscalings(List<GetClusterAddonsConfigHorizontalPodAutoscaling> horizontalPodAutoscalings) {
            this.horizontalPodAutoscalings = Objects.requireNonNull(horizontalPodAutoscalings);
            return this;
        }

        public Builder httpLoadBalancings(List<GetClusterAddonsConfigHttpLoadBalancing> httpLoadBalancings) {
            this.httpLoadBalancings = Objects.requireNonNull(httpLoadBalancings);
            return this;
        }

        public Builder istioConfigs(List<GetClusterAddonsConfigIstioConfig> istioConfigs) {
            this.istioConfigs = Objects.requireNonNull(istioConfigs);
            return this;
        }

        public Builder kalmConfigs(List<GetClusterAddonsConfigKalmConfig> kalmConfigs) {
            this.kalmConfigs = Objects.requireNonNull(kalmConfigs);
            return this;
        }

        public Builder networkPolicyConfigs(List<GetClusterAddonsConfigNetworkPolicyConfig> networkPolicyConfigs) {
            this.networkPolicyConfigs = Objects.requireNonNull(networkPolicyConfigs);
            return this;
        }
        public GetClusterAddonsConfig build() {
            return new GetClusterAddonsConfig(cloudrunConfigs, configConnectorConfigs, dnsCacheConfigs, gcePersistentDiskCsiDriverConfigs, gcpFilestoreCsiDriverConfigs, horizontalPodAutoscalings, httpLoadBalancings, istioConfigs, kalmConfigs, networkPolicyConfigs);
        }
    }
}
