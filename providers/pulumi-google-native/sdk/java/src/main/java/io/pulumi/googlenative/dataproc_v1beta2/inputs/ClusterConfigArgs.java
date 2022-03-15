// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.AutoscalingConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.EncryptionConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.EndpointConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GceClusterConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GkeClusterConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.InstanceGroupConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.LifecycleConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.MetastoreConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.NodeInitializationActionArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SecurityConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SoftwareConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The cluster config.
 * 
 */
public final class ClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterConfigArgs Empty = new ClusterConfigArgs();

    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
     */
    @Import(name="autoscalingConfig")
      private final @Nullable Output<AutoscalingConfigArgs> autoscalingConfig;

    public Output<AutoscalingConfigArgs> getAutoscalingConfig() {
        return this.autoscalingConfig == null ? Output.empty() : this.autoscalingConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging bucket (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    @Import(name="configBucket")
      private final @Nullable Output<String> configBucket;

    public Output<String> getConfigBucket() {
        return this.configBucket == null ? Output.empty() : this.configBucket;
    }

    /**
     * Optional. Encryption settings for the cluster.
     * 
     */
    @Import(name="encryptionConfig")
      private final @Nullable Output<EncryptionConfigArgs> encryptionConfig;

    public Output<EncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Output.empty() : this.encryptionConfig;
    }

    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
     */
    @Import(name="endpointConfig")
      private final @Nullable Output<EndpointConfigArgs> endpointConfig;

    public Output<EndpointConfigArgs> getEndpointConfig() {
        return this.endpointConfig == null ? Output.empty() : this.endpointConfig;
    }

    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
     */
    @Import(name="gceClusterConfig")
      private final @Nullable Output<GceClusterConfigArgs> gceClusterConfig;

    public Output<GceClusterConfigArgs> getGceClusterConfig() {
        return this.gceClusterConfig == null ? Output.empty() : this.gceClusterConfig;
    }

    /**
     * Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
     * 
     */
    @Import(name="gkeClusterConfig")
      private final @Nullable Output<GkeClusterConfigArgs> gkeClusterConfig;

    public Output<GkeClusterConfigArgs> getGkeClusterConfig() {
        return this.gkeClusterConfig == null ? Output.empty() : this.gkeClusterConfig;
    }

    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
     * 
     */
    @Import(name="initializationActions")
      private final @Nullable Output<List<NodeInitializationActionArgs>> initializationActions;

    public Output<List<NodeInitializationActionArgs>> getInitializationActions() {
        return this.initializationActions == null ? Output.empty() : this.initializationActions;
    }

    /**
     * Optional. The config setting for auto delete cluster schedule.
     * 
     */
    @Import(name="lifecycleConfig")
      private final @Nullable Output<LifecycleConfigArgs> lifecycleConfig;

    public Output<LifecycleConfigArgs> getLifecycleConfig() {
        return this.lifecycleConfig == null ? Output.empty() : this.lifecycleConfig;
    }

    /**
     * Optional. The Compute Engine config settings for the master instance in a cluster.
     * 
     */
    @Import(name="masterConfig")
      private final @Nullable Output<InstanceGroupConfigArgs> masterConfig;

    public Output<InstanceGroupConfigArgs> getMasterConfig() {
        return this.masterConfig == null ? Output.empty() : this.masterConfig;
    }

    /**
     * Optional. Metastore configuration.
     * 
     */
    @Import(name="metastoreConfig")
      private final @Nullable Output<MetastoreConfigArgs> metastoreConfig;

    public Output<MetastoreConfigArgs> getMetastoreConfig() {
        return this.metastoreConfig == null ? Output.empty() : this.metastoreConfig;
    }

    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    @Import(name="secondaryWorkerConfig")
      private final @Nullable Output<InstanceGroupConfigArgs> secondaryWorkerConfig;

    public Output<InstanceGroupConfigArgs> getSecondaryWorkerConfig() {
        return this.secondaryWorkerConfig == null ? Output.empty() : this.secondaryWorkerConfig;
    }

    /**
     * Optional. Security related configuration.
     * 
     */
    @Import(name="securityConfig")
      private final @Nullable Output<SecurityConfigArgs> securityConfig;

    public Output<SecurityConfigArgs> getSecurityConfig() {
        return this.securityConfig == null ? Output.empty() : this.securityConfig;
    }

    /**
     * Optional. The config settings for software inside the cluster.
     * 
     */
    @Import(name="softwareConfig")
      private final @Nullable Output<SoftwareConfigArgs> softwareConfig;

    public Output<SoftwareConfigArgs> getSoftwareConfig() {
        return this.softwareConfig == null ? Output.empty() : this.softwareConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket. This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    @Import(name="tempBucket")
      private final @Nullable Output<String> tempBucket;

    public Output<String> getTempBucket() {
        return this.tempBucket == null ? Output.empty() : this.tempBucket;
    }

    /**
     * Optional. The Compute Engine config settings for worker instances in a cluster.
     * 
     */
    @Import(name="workerConfig")
      private final @Nullable Output<InstanceGroupConfigArgs> workerConfig;

    public Output<InstanceGroupConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Output.empty() : this.workerConfig;
    }

    public ClusterConfigArgs(
        @Nullable Output<AutoscalingConfigArgs> autoscalingConfig,
        @Nullable Output<String> configBucket,
        @Nullable Output<EncryptionConfigArgs> encryptionConfig,
        @Nullable Output<EndpointConfigArgs> endpointConfig,
        @Nullable Output<GceClusterConfigArgs> gceClusterConfig,
        @Nullable Output<GkeClusterConfigArgs> gkeClusterConfig,
        @Nullable Output<List<NodeInitializationActionArgs>> initializationActions,
        @Nullable Output<LifecycleConfigArgs> lifecycleConfig,
        @Nullable Output<InstanceGroupConfigArgs> masterConfig,
        @Nullable Output<MetastoreConfigArgs> metastoreConfig,
        @Nullable Output<InstanceGroupConfigArgs> secondaryWorkerConfig,
        @Nullable Output<SecurityConfigArgs> securityConfig,
        @Nullable Output<SoftwareConfigArgs> softwareConfig,
        @Nullable Output<String> tempBucket,
        @Nullable Output<InstanceGroupConfigArgs> workerConfig) {
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

    private ClusterConfigArgs() {
        this.autoscalingConfig = Output.empty();
        this.configBucket = Output.empty();
        this.encryptionConfig = Output.empty();
        this.endpointConfig = Output.empty();
        this.gceClusterConfig = Output.empty();
        this.gkeClusterConfig = Output.empty();
        this.initializationActions = Output.empty();
        this.lifecycleConfig = Output.empty();
        this.masterConfig = Output.empty();
        this.metastoreConfig = Output.empty();
        this.secondaryWorkerConfig = Output.empty();
        this.securityConfig = Output.empty();
        this.softwareConfig = Output.empty();
        this.tempBucket = Output.empty();
        this.workerConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoscalingConfigArgs> autoscalingConfig;
        private @Nullable Output<String> configBucket;
        private @Nullable Output<EncryptionConfigArgs> encryptionConfig;
        private @Nullable Output<EndpointConfigArgs> endpointConfig;
        private @Nullable Output<GceClusterConfigArgs> gceClusterConfig;
        private @Nullable Output<GkeClusterConfigArgs> gkeClusterConfig;
        private @Nullable Output<List<NodeInitializationActionArgs>> initializationActions;
        private @Nullable Output<LifecycleConfigArgs> lifecycleConfig;
        private @Nullable Output<InstanceGroupConfigArgs> masterConfig;
        private @Nullable Output<MetastoreConfigArgs> metastoreConfig;
        private @Nullable Output<InstanceGroupConfigArgs> secondaryWorkerConfig;
        private @Nullable Output<SecurityConfigArgs> securityConfig;
        private @Nullable Output<SoftwareConfigArgs> softwareConfig;
        private @Nullable Output<String> tempBucket;
        private @Nullable Output<InstanceGroupConfigArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigArgs defaults) {
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

        public Builder autoscalingConfig(@Nullable Output<AutoscalingConfigArgs> autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }

        public Builder autoscalingConfig(@Nullable AutoscalingConfigArgs autoscalingConfig) {
            this.autoscalingConfig = Output.ofNullable(autoscalingConfig);
            return this;
        }

        public Builder configBucket(@Nullable Output<String> configBucket) {
            this.configBucket = configBucket;
            return this;
        }

        public Builder configBucket(@Nullable String configBucket) {
            this.configBucket = Output.ofNullable(configBucket);
            return this;
        }

        public Builder encryptionConfig(@Nullable Output<EncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder encryptionConfig(@Nullable EncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Output.ofNullable(encryptionConfig);
            return this;
        }

        public Builder endpointConfig(@Nullable Output<EndpointConfigArgs> endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }

        public Builder endpointConfig(@Nullable EndpointConfigArgs endpointConfig) {
            this.endpointConfig = Output.ofNullable(endpointConfig);
            return this;
        }

        public Builder gceClusterConfig(@Nullable Output<GceClusterConfigArgs> gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }

        public Builder gceClusterConfig(@Nullable GceClusterConfigArgs gceClusterConfig) {
            this.gceClusterConfig = Output.ofNullable(gceClusterConfig);
            return this;
        }

        public Builder gkeClusterConfig(@Nullable Output<GkeClusterConfigArgs> gkeClusterConfig) {
            this.gkeClusterConfig = gkeClusterConfig;
            return this;
        }

        public Builder gkeClusterConfig(@Nullable GkeClusterConfigArgs gkeClusterConfig) {
            this.gkeClusterConfig = Output.ofNullable(gkeClusterConfig);
            return this;
        }

        public Builder initializationActions(@Nullable Output<List<NodeInitializationActionArgs>> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }

        public Builder initializationActions(@Nullable List<NodeInitializationActionArgs> initializationActions) {
            this.initializationActions = Output.ofNullable(initializationActions);
            return this;
        }

        public Builder lifecycleConfig(@Nullable Output<LifecycleConfigArgs> lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }

        public Builder lifecycleConfig(@Nullable LifecycleConfigArgs lifecycleConfig) {
            this.lifecycleConfig = Output.ofNullable(lifecycleConfig);
            return this;
        }

        public Builder masterConfig(@Nullable Output<InstanceGroupConfigArgs> masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }

        public Builder masterConfig(@Nullable InstanceGroupConfigArgs masterConfig) {
            this.masterConfig = Output.ofNullable(masterConfig);
            return this;
        }

        public Builder metastoreConfig(@Nullable Output<MetastoreConfigArgs> metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }

        public Builder metastoreConfig(@Nullable MetastoreConfigArgs metastoreConfig) {
            this.metastoreConfig = Output.ofNullable(metastoreConfig);
            return this;
        }

        public Builder secondaryWorkerConfig(@Nullable Output<InstanceGroupConfigArgs> secondaryWorkerConfig) {
            this.secondaryWorkerConfig = secondaryWorkerConfig;
            return this;
        }

        public Builder secondaryWorkerConfig(@Nullable InstanceGroupConfigArgs secondaryWorkerConfig) {
            this.secondaryWorkerConfig = Output.ofNullable(secondaryWorkerConfig);
            return this;
        }

        public Builder securityConfig(@Nullable Output<SecurityConfigArgs> securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }

        public Builder securityConfig(@Nullable SecurityConfigArgs securityConfig) {
            this.securityConfig = Output.ofNullable(securityConfig);
            return this;
        }

        public Builder softwareConfig(@Nullable Output<SoftwareConfigArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }

        public Builder softwareConfig(@Nullable SoftwareConfigArgs softwareConfig) {
            this.softwareConfig = Output.ofNullable(softwareConfig);
            return this;
        }

        public Builder tempBucket(@Nullable Output<String> tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }

        public Builder tempBucket(@Nullable String tempBucket) {
            this.tempBucket = Output.ofNullable(tempBucket);
            return this;
        }

        public Builder workerConfig(@Nullable Output<InstanceGroupConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder workerConfig(@Nullable InstanceGroupConfigArgs workerConfig) {
            this.workerConfig = Output.ofNullable(workerConfig);
            return this;
        }
        public ClusterConfigArgs build() {
            return new ClusterConfigArgs(autoscalingConfig, configBucket, encryptionConfig, endpointConfig, gceClusterConfig, gkeClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, secondaryWorkerConfig, securityConfig, softwareConfig, tempBucket, workerConfig);
        }
    }
}
