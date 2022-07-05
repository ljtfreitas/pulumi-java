// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1.inputs.AuxiliaryServicesConfigArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.KubernetesClusterConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Dataproc cluster config for a cluster that does not directly control the underlying compute resources, such as a Dataproc-on-GKE cluster (https://cloud.google.com/dataproc/docs/guides/dpgke/dataproc-gke).
 * 
 */
public final class VirtualClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualClusterConfigArgs Empty = new VirtualClusterConfigArgs();

    /**
     * Optional. Configuration of auxiliary services used by this cluster.
     * 
     */
    @Import(name="auxiliaryServicesConfig")
    private @Nullable Output<AuxiliaryServicesConfigArgs> auxiliaryServicesConfig;

    /**
     * @return Optional. Configuration of auxiliary services used by this cluster.
     * 
     */
    public Optional<Output<AuxiliaryServicesConfigArgs>> auxiliaryServicesConfig() {
        return Optional.ofNullable(this.auxiliaryServicesConfig);
    }

    /**
     * The configuration for running the Dataproc cluster on Kubernetes.
     * 
     */
    @Import(name="kubernetesClusterConfig", required=true)
    private Output<KubernetesClusterConfigArgs> kubernetesClusterConfig;

    /**
     * @return The configuration for running the Dataproc cluster on Kubernetes.
     * 
     */
    public Output<KubernetesClusterConfigArgs> kubernetesClusterConfig() {
        return this.kubernetesClusterConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
     * 
     */
    @Import(name="stagingBucket")
    private @Nullable Output<String> stagingBucket;

    /**
     * @return Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
     * 
     */
    public Optional<Output<String>> stagingBucket() {
        return Optional.ofNullable(this.stagingBucket);
    }

    private VirtualClusterConfigArgs() {}

    private VirtualClusterConfigArgs(VirtualClusterConfigArgs $) {
        this.auxiliaryServicesConfig = $.auxiliaryServicesConfig;
        this.kubernetesClusterConfig = $.kubernetesClusterConfig;
        this.stagingBucket = $.stagingBucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualClusterConfigArgs $;

        public Builder() {
            $ = new VirtualClusterConfigArgs();
        }

        public Builder(VirtualClusterConfigArgs defaults) {
            $ = new VirtualClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auxiliaryServicesConfig Optional. Configuration of auxiliary services used by this cluster.
         * 
         * @return builder
         * 
         */
        public Builder auxiliaryServicesConfig(@Nullable Output<AuxiliaryServicesConfigArgs> auxiliaryServicesConfig) {
            $.auxiliaryServicesConfig = auxiliaryServicesConfig;
            return this;
        }

        /**
         * @param auxiliaryServicesConfig Optional. Configuration of auxiliary services used by this cluster.
         * 
         * @return builder
         * 
         */
        public Builder auxiliaryServicesConfig(AuxiliaryServicesConfigArgs auxiliaryServicesConfig) {
            return auxiliaryServicesConfig(Output.of(auxiliaryServicesConfig));
        }

        /**
         * @param kubernetesClusterConfig The configuration for running the Dataproc cluster on Kubernetes.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterConfig(Output<KubernetesClusterConfigArgs> kubernetesClusterConfig) {
            $.kubernetesClusterConfig = kubernetesClusterConfig;
            return this;
        }

        /**
         * @param kubernetesClusterConfig The configuration for running the Dataproc cluster on Kubernetes.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterConfig(KubernetesClusterConfigArgs kubernetesClusterConfig) {
            return kubernetesClusterConfig(Output.of(kubernetesClusterConfig));
        }

        /**
         * @param stagingBucket Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
         * 
         * @return builder
         * 
         */
        public Builder stagingBucket(@Nullable Output<String> stagingBucket) {
            $.stagingBucket = stagingBucket;
            return this;
        }

        /**
         * @param stagingBucket Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
         * 
         * @return builder
         * 
         */
        public Builder stagingBucket(String stagingBucket) {
            return stagingBucket(Output.of(stagingBucket));
        }

        public VirtualClusterConfigArgs build() {
            $.kubernetesClusterConfig = Objects.requireNonNull($.kubernetesClusterConfig, "expected parameter 'kubernetesClusterConfig' to be non-null");
            return $;
        }
    }

}
