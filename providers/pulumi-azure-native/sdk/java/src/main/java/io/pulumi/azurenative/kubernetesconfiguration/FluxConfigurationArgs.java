// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration;

import io.pulumi.azurenative.kubernetesconfiguration.enums.ScopeType;
import io.pulumi.azurenative.kubernetesconfiguration.enums.SourceKindType;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.GitRepositoryDefinitionArgs;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.KustomizationDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FluxConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FluxConfigurationArgs Empty = new FluxConfigurationArgs();

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterResourceName", required=true)
      private final Output<String> clusterResourceName;

    public Output<String> getClusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterRp", required=true)
      private final Output<String> clusterRp;

    public Output<String> getClusterRp() {
        return this.clusterRp;
    }

    /**
     * Key-value pairs of protected configuration settings for the configuration
     * 
     */
    @Import(name="configurationProtectedSettings")
      private final @Nullable Output<Map<String,String>> configurationProtectedSettings;

    public Output<Map<String,String>> getConfigurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Output.empty() : this.configurationProtectedSettings;
    }

    /**
     * Name of the Flux Configuration.
     * 
     */
    @Import(name="fluxConfigurationName")
      private final @Nullable Output<String> fluxConfigurationName;

    public Output<String> getFluxConfigurationName() {
        return this.fluxConfigurationName == null ? Output.empty() : this.fluxConfigurationName;
    }

    /**
     * Parameters to reconcile to the GitRepository source kind type.
     * 
     */
    @Import(name="gitRepository")
      private final @Nullable Output<GitRepositoryDefinitionArgs> gitRepository;

    public Output<GitRepositoryDefinitionArgs> getGitRepository() {
        return this.gitRepository == null ? Output.empty() : this.gitRepository;
    }

    /**
     * Array of kustomizations used to reconcile the artifact pulled by the source type on the cluster.
     * 
     */
    @Import(name="kustomizations")
      private final @Nullable Output<Map<String,KustomizationDefinitionArgs>> kustomizations;

    public Output<Map<String,KustomizationDefinitionArgs>> getKustomizations() {
        return this.kustomizations == null ? Output.empty() : this.kustomizations;
    }

    /**
     * The namespace to which this configuration is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Scope at which the operator will be installed.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<Either<String,ScopeType>> scope;

    public Output<Either<String,ScopeType>> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    /**
     * Source Kind to pull the configuration data from.
     * 
     */
    @Import(name="sourceKind")
      private final @Nullable Output<Either<String,SourceKindType>> sourceKind;

    public Output<Either<String,SourceKindType>> getSourceKind() {
        return this.sourceKind == null ? Output.empty() : this.sourceKind;
    }

    /**
     * Whether this configuration should suspend its reconciliation of its kustomizations and sources.
     * 
     */
    @Import(name="suspend")
      private final @Nullable Output<Boolean> suspend;

    public Output<Boolean> getSuspend() {
        return this.suspend == null ? Output.empty() : this.suspend;
    }

    public FluxConfigurationArgs(
        Output<String> clusterName,
        Output<String> clusterResourceName,
        Output<String> clusterRp,
        @Nullable Output<Map<String,String>> configurationProtectedSettings,
        @Nullable Output<String> fluxConfigurationName,
        @Nullable Output<GitRepositoryDefinitionArgs> gitRepository,
        @Nullable Output<Map<String,KustomizationDefinitionArgs>> kustomizations,
        @Nullable Output<String> namespace,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,ScopeType>> scope,
        @Nullable Output<Either<String,SourceKindType>> sourceKind,
        @Nullable Output<Boolean> suspend) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceName = Objects.requireNonNull(clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
        this.clusterRp = Objects.requireNonNull(clusterRp, "expected parameter 'clusterRp' to be non-null");
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.fluxConfigurationName = fluxConfigurationName;
        this.gitRepository = gitRepository;
        this.kustomizations = kustomizations;
        this.namespace = namespace == null ? Output.ofNullable("default") : namespace;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = scope;
        this.sourceKind = sourceKind;
        this.suspend = suspend == null ? Output.ofNullable(false) : suspend;
    }

    private FluxConfigurationArgs() {
        this.clusterName = Output.empty();
        this.clusterResourceName = Output.empty();
        this.clusterRp = Output.empty();
        this.configurationProtectedSettings = Output.empty();
        this.fluxConfigurationName = Output.empty();
        this.gitRepository = Output.empty();
        this.kustomizations = Output.empty();
        this.namespace = Output.empty();
        this.resourceGroupName = Output.empty();
        this.scope = Output.empty();
        this.sourceKind = Output.empty();
        this.suspend = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FluxConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private Output<String> clusterResourceName;
        private Output<String> clusterRp;
        private @Nullable Output<Map<String,String>> configurationProtectedSettings;
        private @Nullable Output<String> fluxConfigurationName;
        private @Nullable Output<GitRepositoryDefinitionArgs> gitRepository;
        private @Nullable Output<Map<String,KustomizationDefinitionArgs>> kustomizations;
        private @Nullable Output<String> namespace;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,ScopeType>> scope;
        private @Nullable Output<Either<String,SourceKindType>> sourceKind;
        private @Nullable Output<Boolean> suspend;

        public Builder() {
    	      // Empty
        }

        public Builder(FluxConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceName = defaults.clusterResourceName;
    	      this.clusterRp = defaults.clusterRp;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.fluxConfigurationName = defaults.fluxConfigurationName;
    	      this.gitRepository = defaults.gitRepository;
    	      this.kustomizations = defaults.kustomizations;
    	      this.namespace = defaults.namespace;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.sourceKind = defaults.sourceKind;
    	      this.suspend = defaults.suspend;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder clusterResourceName(Output<String> clusterResourceName) {
            this.clusterResourceName = Objects.requireNonNull(clusterResourceName);
            return this;
        }

        public Builder clusterResourceName(String clusterResourceName) {
            this.clusterResourceName = Output.of(Objects.requireNonNull(clusterResourceName));
            return this;
        }

        public Builder clusterRp(Output<String> clusterRp) {
            this.clusterRp = Objects.requireNonNull(clusterRp);
            return this;
        }

        public Builder clusterRp(String clusterRp) {
            this.clusterRp = Output.of(Objects.requireNonNull(clusterRp));
            return this;
        }

        public Builder configurationProtectedSettings(@Nullable Output<Map<String,String>> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }

        public Builder configurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = Output.ofNullable(configurationProtectedSettings);
            return this;
        }

        public Builder fluxConfigurationName(@Nullable Output<String> fluxConfigurationName) {
            this.fluxConfigurationName = fluxConfigurationName;
            return this;
        }

        public Builder fluxConfigurationName(@Nullable String fluxConfigurationName) {
            this.fluxConfigurationName = Output.ofNullable(fluxConfigurationName);
            return this;
        }

        public Builder gitRepository(@Nullable Output<GitRepositoryDefinitionArgs> gitRepository) {
            this.gitRepository = gitRepository;
            return this;
        }

        public Builder gitRepository(@Nullable GitRepositoryDefinitionArgs gitRepository) {
            this.gitRepository = Output.ofNullable(gitRepository);
            return this;
        }

        public Builder kustomizations(@Nullable Output<Map<String,KustomizationDefinitionArgs>> kustomizations) {
            this.kustomizations = kustomizations;
            return this;
        }

        public Builder kustomizations(@Nullable Map<String,KustomizationDefinitionArgs> kustomizations) {
            this.kustomizations = Output.ofNullable(kustomizations);
            return this;
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder scope(@Nullable Output<Either<String,ScopeType>> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable Either<String,ScopeType> scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }

        public Builder sourceKind(@Nullable Output<Either<String,SourceKindType>> sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }

        public Builder sourceKind(@Nullable Either<String,SourceKindType> sourceKind) {
            this.sourceKind = Output.ofNullable(sourceKind);
            return this;
        }

        public Builder suspend(@Nullable Output<Boolean> suspend) {
            this.suspend = suspend;
            return this;
        }

        public Builder suspend(@Nullable Boolean suspend) {
            this.suspend = Output.ofNullable(suspend);
            return this;
        }
        public FluxConfigurationArgs build() {
            return new FluxConfigurationArgs(clusterName, clusterResourceName, clusterRp, configurationProtectedSettings, fluxConfigurationName, gitRepository, kustomizations, namespace, resourceGroupName, scope, sourceKind, suspend);
        }
    }
}
