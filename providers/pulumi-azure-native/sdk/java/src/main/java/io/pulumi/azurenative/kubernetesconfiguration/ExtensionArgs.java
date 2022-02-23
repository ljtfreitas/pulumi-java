// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration;

import io.pulumi.azurenative.kubernetesconfiguration.inputs.ConfigurationIdentityArgs;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.ExtensionStatusArgs;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionArgs Empty = new ExtensionArgs();

    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    @InputImport(name="autoUpgradeMinorVersion")
        private final @Nullable Input<Boolean> autoUpgradeMinorVersion;

    public Input<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Input.empty() : this.autoUpgradeMinorVersion;
    }

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
        private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @InputImport(name="clusterResourceName", required=true)
        private final Input<String> clusterResourceName;

    public Input<String> getClusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @InputImport(name="clusterRp", required=true)
        private final Input<String> clusterRp;

    public Input<String> getClusterRp() {
        return this.clusterRp;
    }

    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @InputImport(name="configurationProtectedSettings")
        private final @Nullable Input<Map<String,String>> configurationProtectedSettings;

    public Input<Map<String,String>> getConfigurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Input.empty() : this.configurationProtectedSettings;
    }

    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @InputImport(name="configurationSettings")
        private final @Nullable Input<Map<String,String>> configurationSettings;

    public Input<Map<String,String>> getConfigurationSettings() {
        return this.configurationSettings == null ? Input.empty() : this.configurationSettings;
    }

    /**
     * Name of an instance of the Extension.
     * 
     */
    @InputImport(name="extensionInstanceName")
        private final @Nullable Input<String> extensionInstanceName;

    public Input<String> getExtensionInstanceName() {
        return this.extensionInstanceName == null ? Input.empty() : this.extensionInstanceName;
    }

    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    @InputImport(name="extensionType")
        private final @Nullable Input<String> extensionType;

    public Input<String> getExtensionType() {
        return this.extensionType == null ? Input.empty() : this.extensionType;
    }

    /**
     * The identity of the configuration.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<ConfigurationIdentityArgs> identity;

    public Input<ConfigurationIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
     */
    @InputImport(name="releaseTrain")
        private final @Nullable Input<String> releaseTrain;

    public Input<String> getReleaseTrain() {
        return this.releaseTrain == null ? Input.empty() : this.releaseTrain;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Scope at which the extension instance is installed.
     * 
     */
    @InputImport(name="scope")
        private final @Nullable Input<ScopeArgs> scope;

    public Input<ScopeArgs> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * Status from this instance of the extension.
     * 
     */
    @InputImport(name="statuses")
        private final @Nullable Input<List<ExtensionStatusArgs>> statuses;

    public Input<List<ExtensionStatusArgs>> getStatuses() {
        return this.statuses == null ? Input.empty() : this.statuses;
    }

    /**
     * Version of the extension for this extension instance, if it is 'pinned' to a specific version. autoUpgradeMinorVersion must be 'false'.
     * 
     */
    @InputImport(name="version")
        private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ExtensionArgs(
        @Nullable Input<Boolean> autoUpgradeMinorVersion,
        Input<String> clusterName,
        Input<String> clusterResourceName,
        Input<String> clusterRp,
        @Nullable Input<Map<String,String>> configurationProtectedSettings,
        @Nullable Input<Map<String,String>> configurationSettings,
        @Nullable Input<String> extensionInstanceName,
        @Nullable Input<String> extensionType,
        @Nullable Input<ConfigurationIdentityArgs> identity,
        @Nullable Input<String> releaseTrain,
        Input<String> resourceGroupName,
        @Nullable Input<ScopeArgs> scope,
        @Nullable Input<List<ExtensionStatusArgs>> statuses,
        @Nullable Input<String> version) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceName = Objects.requireNonNull(clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
        this.clusterRp = Objects.requireNonNull(clusterRp, "expected parameter 'clusterRp' to be non-null");
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.configurationSettings = configurationSettings;
        this.extensionInstanceName = extensionInstanceName;
        this.extensionType = extensionType;
        this.identity = identity;
        this.releaseTrain = releaseTrain;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = scope;
        this.statuses = statuses;
        this.version = version;
    }

    private ExtensionArgs() {
        this.autoUpgradeMinorVersion = Input.empty();
        this.clusterName = Input.empty();
        this.clusterResourceName = Input.empty();
        this.clusterRp = Input.empty();
        this.configurationProtectedSettings = Input.empty();
        this.configurationSettings = Input.empty();
        this.extensionInstanceName = Input.empty();
        this.extensionType = Input.empty();
        this.identity = Input.empty();
        this.releaseTrain = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scope = Input.empty();
        this.statuses = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoUpgradeMinorVersion;
        private Input<String> clusterName;
        private Input<String> clusterResourceName;
        private Input<String> clusterRp;
        private @Nullable Input<Map<String,String>> configurationProtectedSettings;
        private @Nullable Input<Map<String,String>> configurationSettings;
        private @Nullable Input<String> extensionInstanceName;
        private @Nullable Input<String> extensionType;
        private @Nullable Input<ConfigurationIdentityArgs> identity;
        private @Nullable Input<String> releaseTrain;
        private Input<String> resourceGroupName;
        private @Nullable Input<ScopeArgs> scope;
        private @Nullable Input<List<ExtensionStatusArgs>> statuses;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceName = defaults.clusterResourceName;
    	      this.clusterRp = defaults.clusterRp;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.configurationSettings = defaults.configurationSettings;
    	      this.extensionInstanceName = defaults.extensionInstanceName;
    	      this.extensionType = defaults.extensionType;
    	      this.identity = defaults.identity;
    	      this.releaseTrain = defaults.releaseTrain;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.statuses = defaults.statuses;
    	      this.version = defaults.version;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Input<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Input.ofNullable(autoUpgradeMinorVersion);
            return this;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setClusterResourceName(Input<String> clusterResourceName) {
            this.clusterResourceName = Objects.requireNonNull(clusterResourceName);
            return this;
        }

        public Builder setClusterResourceName(String clusterResourceName) {
            this.clusterResourceName = Input.of(Objects.requireNonNull(clusterResourceName));
            return this;
        }

        public Builder setClusterRp(Input<String> clusterRp) {
            this.clusterRp = Objects.requireNonNull(clusterRp);
            return this;
        }

        public Builder setClusterRp(String clusterRp) {
            this.clusterRp = Input.of(Objects.requireNonNull(clusterRp));
            return this;
        }

        public Builder setConfigurationProtectedSettings(@Nullable Input<Map<String,String>> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }

        public Builder setConfigurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = Input.ofNullable(configurationProtectedSettings);
            return this;
        }

        public Builder setConfigurationSettings(@Nullable Input<Map<String,String>> configurationSettings) {
            this.configurationSettings = configurationSettings;
            return this;
        }

        public Builder setConfigurationSettings(@Nullable Map<String,String> configurationSettings) {
            this.configurationSettings = Input.ofNullable(configurationSettings);
            return this;
        }

        public Builder setExtensionInstanceName(@Nullable Input<String> extensionInstanceName) {
            this.extensionInstanceName = extensionInstanceName;
            return this;
        }

        public Builder setExtensionInstanceName(@Nullable String extensionInstanceName) {
            this.extensionInstanceName = Input.ofNullable(extensionInstanceName);
            return this;
        }

        public Builder setExtensionType(@Nullable Input<String> extensionType) {
            this.extensionType = extensionType;
            return this;
        }

        public Builder setExtensionType(@Nullable String extensionType) {
            this.extensionType = Input.ofNullable(extensionType);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ConfigurationIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ConfigurationIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setReleaseTrain(@Nullable Input<String> releaseTrain) {
            this.releaseTrain = releaseTrain;
            return this;
        }

        public Builder setReleaseTrain(@Nullable String releaseTrain) {
            this.releaseTrain = Input.ofNullable(releaseTrain);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScope(@Nullable Input<ScopeArgs> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable ScopeArgs scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setStatuses(@Nullable Input<List<ExtensionStatusArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setStatuses(@Nullable List<ExtensionStatusArgs> statuses) {
            this.statuses = Input.ofNullable(statuses);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public ExtensionArgs build() {
            return new ExtensionArgs(autoUpgradeMinorVersion, clusterName, clusterResourceName, clusterRp, configurationProtectedSettings, configurationSettings, extensionInstanceName, extensionType, identity, releaseTrain, resourceGroupName, scope, statuses, version);
        }
    }
}
