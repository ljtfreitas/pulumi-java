// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.AutoscalingConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.EncryptionConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.EndpointConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.GceClusterConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.GkeClusterConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.InstanceGroupConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.LifecycleConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.MetastoreConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.NodeInitializationActionResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SecurityConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SoftwareConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClusterConfigResponse {
    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
     */
    private final AutoscalingConfigResponse autoscalingConfig;
    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
     * 
     */
    private final String configBucket;
    /**
     * Optional. Encryption settings for the cluster.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
     */
    private final EndpointConfigResponse endpointConfig;
    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
     */
    private final GceClusterConfigResponse gceClusterConfig;
    /**
     * Optional. BETA. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
     * 
     */
    private final GkeClusterConfigResponse gkeClusterConfig;
    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
     * 
     */
    private final List<NodeInitializationActionResponse> initializationActions;
    /**
     * Optional. Lifecycle setting for the cluster.
     * 
     */
    private final LifecycleConfigResponse lifecycleConfig;
    /**
     * Optional. The Compute Engine config settings for the cluster's master instance.
     * 
     */
    private final InstanceGroupConfigResponse masterConfig;
    /**
     * Optional. Metastore configuration.
     * 
     */
    private final MetastoreConfigResponse metastoreConfig;
    /**
     * Optional. The Compute Engine config settings for a cluster's secondary worker instances
     * 
     */
    private final InstanceGroupConfigResponse secondaryWorkerConfig;
    /**
     * Optional. Security settings for the cluster.
     * 
     */
    private final SecurityConfigResponse securityConfig;
    /**
     * Optional. The config settings for cluster software.
     * 
     */
    private final SoftwareConfigResponse softwareConfig;
    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
     * 
     */
    private final String tempBucket;
    /**
     * Optional. The Compute Engine config settings for the cluster's worker instances.
     * 
     */
    private final InstanceGroupConfigResponse workerConfig;

    @CustomType.Constructor
    private ClusterConfigResponse(
        @CustomType.Parameter("autoscalingConfig") AutoscalingConfigResponse autoscalingConfig,
        @CustomType.Parameter("configBucket") String configBucket,
        @CustomType.Parameter("encryptionConfig") EncryptionConfigResponse encryptionConfig,
        @CustomType.Parameter("endpointConfig") EndpointConfigResponse endpointConfig,
        @CustomType.Parameter("gceClusterConfig") GceClusterConfigResponse gceClusterConfig,
        @CustomType.Parameter("gkeClusterConfig") GkeClusterConfigResponse gkeClusterConfig,
        @CustomType.Parameter("initializationActions") List<NodeInitializationActionResponse> initializationActions,
        @CustomType.Parameter("lifecycleConfig") LifecycleConfigResponse lifecycleConfig,
        @CustomType.Parameter("masterConfig") InstanceGroupConfigResponse masterConfig,
        @CustomType.Parameter("metastoreConfig") MetastoreConfigResponse metastoreConfig,
        @CustomType.Parameter("secondaryWorkerConfig") InstanceGroupConfigResponse secondaryWorkerConfig,
        @CustomType.Parameter("securityConfig") SecurityConfigResponse securityConfig,
        @CustomType.Parameter("softwareConfig") SoftwareConfigResponse softwareConfig,
        @CustomType.Parameter("tempBucket") String tempBucket,
        @CustomType.Parameter("workerConfig") InstanceGroupConfigResponse workerConfig) {
        this.autoscalingConfig = autoscalingConfig;
        this.configBucket = configBucket;
        this.encryptionConfig = encryptionConfig;
        this.endpointConfig = endpointConfig;
        this.gceClusterConfig = gceClusterConfig;
        this.gkeClusterConfig = gkeClusterConfig;
        this.initializationActions = initializationActions;
        this.lifecycleConfig = lifecycleConfig;
        this.masterConfig = masterConfig;
        this.metastoreConfig = metastoreConfig;
        this.secondaryWorkerConfig = secondaryWorkerConfig;
        this.securityConfig = securityConfig;
        this.softwareConfig = softwareConfig;
        this.tempBucket = tempBucket;
        this.workerConfig = workerConfig;
    }

    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
    */
    public AutoscalingConfigResponse getAutoscalingConfig() {
        return this.autoscalingConfig;
    }
    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
     * 
    */
    public String getConfigBucket() {
        return this.configBucket;
    }
    /**
     * Optional. Encryption settings for the cluster.
     * 
    */
    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
    */
    public EndpointConfigResponse getEndpointConfig() {
        return this.endpointConfig;
    }
    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
    */
    public GceClusterConfigResponse getGceClusterConfig() {
        return this.gceClusterConfig;
    }
    /**
     * Optional. BETA. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
     * 
    */
    public GkeClusterConfigResponse getGkeClusterConfig() {
        return this.gkeClusterConfig;
    }
    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
     * 
    */
    public List<NodeInitializationActionResponse> getInitializationActions() {
        return this.initializationActions;
    }
    /**
     * Optional. Lifecycle setting for the cluster.
     * 
    */
    public LifecycleConfigResponse getLifecycleConfig() {
        return this.lifecycleConfig;
    }
    /**
     * Optional. The Compute Engine config settings for the cluster's master instance.
     * 
    */
    public InstanceGroupConfigResponse getMasterConfig() {
        return this.masterConfig;
    }
    /**
     * Optional. Metastore configuration.
     * 
    */
    public MetastoreConfigResponse getMetastoreConfig() {
        return this.metastoreConfig;
    }
    /**
     * Optional. The Compute Engine config settings for a cluster's secondary worker instances
     * 
    */
    public InstanceGroupConfigResponse getSecondaryWorkerConfig() {
        return this.secondaryWorkerConfig;
    }
    /**
     * Optional. Security settings for the cluster.
     * 
    */
    public SecurityConfigResponse getSecurityConfig() {
        return this.securityConfig;
    }
    /**
     * Optional. The config settings for cluster software.
     * 
    */
    public SoftwareConfigResponse getSoftwareConfig() {
        return this.softwareConfig;
    }
    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
     * 
    */
    public String getTempBucket() {
        return this.tempBucket;
    }
    /**
     * Optional. The Compute Engine config settings for the cluster's worker instances.
     * 
    */
    public InstanceGroupConfigResponse getWorkerConfig() {
        return this.workerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingConfigResponse autoscalingConfig;
        private String configBucket;
        private EncryptionConfigResponse encryptionConfig;
        private EndpointConfigResponse endpointConfig;
        private GceClusterConfigResponse gceClusterConfig;
        private GkeClusterConfigResponse gkeClusterConfig;
        private List<NodeInitializationActionResponse> initializationActions;
        private LifecycleConfigResponse lifecycleConfig;
        private InstanceGroupConfigResponse masterConfig;
        private MetastoreConfigResponse metastoreConfig;
        private InstanceGroupConfigResponse secondaryWorkerConfig;
        private SecurityConfigResponse securityConfig;
        private SoftwareConfigResponse softwareConfig;
        private String tempBucket;
        private InstanceGroupConfigResponse workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingConfig = defaults.autoscalingConfig;
    	      this.configBucket = defaults.configBucket;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointConfig = defaults.endpointConfig;
    	      this.gceClusterConfig = defaults.gceClusterConfig;
    	      this.gkeClusterConfig = defaults.gkeClusterConfig;
    	      this.initializationActions = defaults.initializationActions;
    	      this.lifecycleConfig = defaults.lifecycleConfig;
    	      this.masterConfig = defaults.masterConfig;
    	      this.metastoreConfig = defaults.metastoreConfig;
    	      this.secondaryWorkerConfig = defaults.secondaryWorkerConfig;
    	      this.securityConfig = defaults.securityConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.tempBucket = defaults.tempBucket;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder autoscalingConfig(AutoscalingConfigResponse autoscalingConfig) {
            this.autoscalingConfig = Objects.requireNonNull(autoscalingConfig);
            return this;
        }

        public Builder configBucket(String configBucket) {
            this.configBucket = Objects.requireNonNull(configBucket);
            return this;
        }

        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }

        public Builder endpointConfig(EndpointConfigResponse endpointConfig) {
            this.endpointConfig = Objects.requireNonNull(endpointConfig);
            return this;
        }

        public Builder gceClusterConfig(GceClusterConfigResponse gceClusterConfig) {
            this.gceClusterConfig = Objects.requireNonNull(gceClusterConfig);
            return this;
        }

        public Builder gkeClusterConfig(GkeClusterConfigResponse gkeClusterConfig) {
            this.gkeClusterConfig = Objects.requireNonNull(gkeClusterConfig);
            return this;
        }

        public Builder initializationActions(List<NodeInitializationActionResponse> initializationActions) {
            this.initializationActions = Objects.requireNonNull(initializationActions);
            return this;
        }

        public Builder lifecycleConfig(LifecycleConfigResponse lifecycleConfig) {
            this.lifecycleConfig = Objects.requireNonNull(lifecycleConfig);
            return this;
        }

        public Builder masterConfig(InstanceGroupConfigResponse masterConfig) {
            this.masterConfig = Objects.requireNonNull(masterConfig);
            return this;
        }

        public Builder metastoreConfig(MetastoreConfigResponse metastoreConfig) {
            this.metastoreConfig = Objects.requireNonNull(metastoreConfig);
            return this;
        }

        public Builder secondaryWorkerConfig(InstanceGroupConfigResponse secondaryWorkerConfig) {
            this.secondaryWorkerConfig = Objects.requireNonNull(secondaryWorkerConfig);
            return this;
        }

        public Builder securityConfig(SecurityConfigResponse securityConfig) {
            this.securityConfig = Objects.requireNonNull(securityConfig);
            return this;
        }

        public Builder softwareConfig(SoftwareConfigResponse softwareConfig) {
            this.softwareConfig = Objects.requireNonNull(softwareConfig);
            return this;
        }

        public Builder tempBucket(String tempBucket) {
            this.tempBucket = Objects.requireNonNull(tempBucket);
            return this;
        }

        public Builder workerConfig(InstanceGroupConfigResponse workerConfig) {
            this.workerConfig = Objects.requireNonNull(workerConfig);
            return this;
        }
        public ClusterConfigResponse build() {
            return new ClusterConfigResponse(autoscalingConfig, configBucket, encryptionConfig, endpointConfig, gceClusterConfig, gkeClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, secondaryWorkerConfig, securityConfig, softwareConfig, tempBucket, workerConfig);
        }
    }
}
