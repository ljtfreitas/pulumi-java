// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesClusterStateResponse {
    /**
     * The version of Agones currently installed in the registered Kubernetes cluster.
     * 
     */
    private final String agonesVersionInstalled;
    /**
     * The version of Agones that is targeted to be installed in the cluster.
     * 
     */
    private final String agonesVersionTargeted;
    /**
     * The state for the installed versions of Agones/Kubernetes.
     * 
     */
    private final String installationState;
    /**
     * The version of Kubernetes that is currently used in the registered Kubernetes cluster (as detected by the Cloud Game Servers service).
     * 
     */
    private final String kubernetesVersionInstalled;
    /**
     * The cloud provider type reported by the first node's providerID in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the provider type will be empty.
     * 
     */
    private final String provider;
    /**
     * The detailed error message for the installed versions of Agones/Kubernetes.
     * 
     */
    private final String versionInstalledErrorMessage;

    @CustomType.Constructor
    private KubernetesClusterStateResponse(
        @CustomType.Parameter("agonesVersionInstalled") String agonesVersionInstalled,
        @CustomType.Parameter("agonesVersionTargeted") String agonesVersionTargeted,
        @CustomType.Parameter("installationState") String installationState,
        @CustomType.Parameter("kubernetesVersionInstalled") String kubernetesVersionInstalled,
        @CustomType.Parameter("provider") String provider,
        @CustomType.Parameter("versionInstalledErrorMessage") String versionInstalledErrorMessage) {
        this.agonesVersionInstalled = agonesVersionInstalled;
        this.agonesVersionTargeted = agonesVersionTargeted;
        this.installationState = installationState;
        this.kubernetesVersionInstalled = kubernetesVersionInstalled;
        this.provider = provider;
        this.versionInstalledErrorMessage = versionInstalledErrorMessage;
    }

    /**
     * The version of Agones currently installed in the registered Kubernetes cluster.
     * 
    */
    public String getAgonesVersionInstalled() {
        return this.agonesVersionInstalled;
    }
    /**
     * The version of Agones that is targeted to be installed in the cluster.
     * 
    */
    public String getAgonesVersionTargeted() {
        return this.agonesVersionTargeted;
    }
    /**
     * The state for the installed versions of Agones/Kubernetes.
     * 
    */
    public String getInstallationState() {
        return this.installationState;
    }
    /**
     * The version of Kubernetes that is currently used in the registered Kubernetes cluster (as detected by the Cloud Game Servers service).
     * 
    */
    public String getKubernetesVersionInstalled() {
        return this.kubernetesVersionInstalled;
    }
    /**
     * The cloud provider type reported by the first node's providerID in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the provider type will be empty.
     * 
    */
    public String getProvider() {
        return this.provider;
    }
    /**
     * The detailed error message for the installed versions of Agones/Kubernetes.
     * 
    */
    public String getVersionInstalledErrorMessage() {
        return this.versionInstalledErrorMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agonesVersionInstalled;
        private String agonesVersionTargeted;
        private String installationState;
        private String kubernetesVersionInstalled;
        private String provider;
        private String versionInstalledErrorMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agonesVersionInstalled = defaults.agonesVersionInstalled;
    	      this.agonesVersionTargeted = defaults.agonesVersionTargeted;
    	      this.installationState = defaults.installationState;
    	      this.kubernetesVersionInstalled = defaults.kubernetesVersionInstalled;
    	      this.provider = defaults.provider;
    	      this.versionInstalledErrorMessage = defaults.versionInstalledErrorMessage;
        }

        public Builder agonesVersionInstalled(String agonesVersionInstalled) {
            this.agonesVersionInstalled = Objects.requireNonNull(agonesVersionInstalled);
            return this;
        }

        public Builder agonesVersionTargeted(String agonesVersionTargeted) {
            this.agonesVersionTargeted = Objects.requireNonNull(agonesVersionTargeted);
            return this;
        }

        public Builder installationState(String installationState) {
            this.installationState = Objects.requireNonNull(installationState);
            return this;
        }

        public Builder kubernetesVersionInstalled(String kubernetesVersionInstalled) {
            this.kubernetesVersionInstalled = Objects.requireNonNull(kubernetesVersionInstalled);
            return this;
        }

        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder versionInstalledErrorMessage(String versionInstalledErrorMessage) {
            this.versionInstalledErrorMessage = Objects.requireNonNull(versionInstalledErrorMessage);
            return this;
        }
        public KubernetesClusterStateResponse build() {
            return new KubernetesClusterStateResponse(agonesVersionInstalled, agonesVersionTargeted, installationState, kubernetesVersionInstalled, provider, versionInstalledErrorMessage);
        }
    }
}
