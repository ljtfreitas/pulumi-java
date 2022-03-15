// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.inputs.KubeClientSettingsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * If present, the name of the kubeconfig cluster to use.
     * 
     */
    @Import(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster == null ? Output.empty() : this.cluster;
    }

    /**
     * If present, the name of the kubeconfig context to use.
     * 
     */
    @Import(name="context")
      private final @Nullable Output<String> context;

    public Output<String> getContext() {
        return this.context == null ? Output.empty() : this.context;
    }

    /**
     * Options for tuning the Kubernetes client used by a Provider.
     * 
     */
    @Import(name="kubeClientSettings", json=true)
      private final @Nullable Output<KubeClientSettingsArgs> kubeClientSettings;

    public Output<KubeClientSettingsArgs> getKubeClientSettings() {
        return this.kubeClientSettings == null ? Output.empty() : this.kubeClientSettings;
    }

    /**
     * The contents of a kubeconfig file or the path to a kubeconfig file.
     * 
     */
    @Import(name="kubeconfig")
      private final @Nullable Output<String> kubeconfig;

    public Output<String> getKubeconfig() {
        return this.kubeconfig == null ? Output.empty() : this.kubeconfig;
    }

    public ProviderArgs(
        @Nullable Output<String> cluster,
        @Nullable Output<String> context,
        @Nullable Output<KubeClientSettingsArgs> kubeClientSettings,
        @Nullable Output<String> kubeconfig) {
        this.cluster = cluster;
        this.context = context;
        this.kubeClientSettings = kubeClientSettings;
        this.kubeconfig = kubeconfig == null ? Output.ofNullable(Utilities.getEnv("KUBECONFIG").orElse(null)) : kubeconfig;
    }

    private ProviderArgs() {
        this.cluster = Output.empty();
        this.context = Output.empty();
        this.kubeClientSettings = Output.empty();
        this.kubeconfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cluster;
        private @Nullable Output<String> context;
        private @Nullable Output<KubeClientSettingsArgs> kubeClientSettings;
        private @Nullable Output<String> kubeconfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.context = defaults.context;
    	      this.kubeClientSettings = defaults.kubeClientSettings;
    	      this.kubeconfig = defaults.kubeconfig;
        }

        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder cluster(@Nullable String cluster) {
            this.cluster = Output.ofNullable(cluster);
            return this;
        }

        public Builder context(@Nullable Output<String> context) {
            this.context = context;
            return this;
        }

        public Builder context(@Nullable String context) {
            this.context = Output.ofNullable(context);
            return this;
        }

        public Builder kubeClientSettings(@Nullable Output<KubeClientSettingsArgs> kubeClientSettings) {
            this.kubeClientSettings = kubeClientSettings;
            return this;
        }

        public Builder kubeClientSettings(@Nullable KubeClientSettingsArgs kubeClientSettings) {
            this.kubeClientSettings = Output.ofNullable(kubeClientSettings);
            return this;
        }

        public Builder kubeconfig(@Nullable Output<String> kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }

        public Builder kubeconfig(@Nullable String kubeconfig) {
            this.kubeconfig = Output.ofNullable(kubeconfig);
            return this;
        }
        public ProviderArgs build() {
            return new ProviderArgs(cluster, context, kubeClientSettings, kubeconfig);
        }
    }
}
