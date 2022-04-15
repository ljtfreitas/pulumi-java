// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigDatabaseConfigGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigEncryptionConfigGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigMaintenanceWindowGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigPrivateEnvironmentConfigGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerConfigGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigGetArgs Empty = new EnvironmentConfigGetArgs();

    @Import(name="airflowUri")
      private final @Nullable Output<String> airflowUri;

    public Output<String> airflowUri() {
        return this.airflowUri == null ? Codegen.empty() : this.airflowUri;
    }

    @Import(name="dagGcsPrefix")
      private final @Nullable Output<String> dagGcsPrefix;

    public Output<String> dagGcsPrefix() {
        return this.dagGcsPrefix == null ? Codegen.empty() : this.dagGcsPrefix;
    }

    @Import(name="databaseConfig")
      private final @Nullable Output<EnvironmentConfigDatabaseConfigGetArgs> databaseConfig;

    public Output<EnvironmentConfigDatabaseConfigGetArgs> databaseConfig() {
        return this.databaseConfig == null ? Codegen.empty() : this.databaseConfig;
    }

    @Import(name="encryptionConfig")
      private final @Nullable Output<EnvironmentConfigEncryptionConfigGetArgs> encryptionConfig;

    public Output<EnvironmentConfigEncryptionConfigGetArgs> encryptionConfig() {
        return this.encryptionConfig == null ? Codegen.empty() : this.encryptionConfig;
    }

    @Import(name="environmentSize")
      private final @Nullable Output<String> environmentSize;

    public Output<String> environmentSize() {
        return this.environmentSize == null ? Codegen.empty() : this.environmentSize;
    }

    @Import(name="gkeCluster")
      private final @Nullable Output<String> gkeCluster;

    public Output<String> gkeCluster() {
        return this.gkeCluster == null ? Codegen.empty() : this.gkeCluster;
    }

    @Import(name="maintenanceWindow")
      private final @Nullable Output<EnvironmentConfigMaintenanceWindowGetArgs> maintenanceWindow;

    public Output<EnvironmentConfigMaintenanceWindowGetArgs> maintenanceWindow() {
        return this.maintenanceWindow == null ? Codegen.empty() : this.maintenanceWindow;
    }

    @Import(name="masterAuthorizedNetworksConfig")
      private final @Nullable Output<EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs> masterAuthorizedNetworksConfig;

    public Output<EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs> masterAuthorizedNetworksConfig() {
        return this.masterAuthorizedNetworksConfig == null ? Codegen.empty() : this.masterAuthorizedNetworksConfig;
    }

    @Import(name="nodeConfig")
      private final @Nullable Output<EnvironmentConfigNodeConfigGetArgs> nodeConfig;

    public Output<EnvironmentConfigNodeConfigGetArgs> nodeConfig() {
        return this.nodeConfig == null ? Codegen.empty() : this.nodeConfig;
    }

    @Import(name="nodeCount")
      private final @Nullable Output<Integer> nodeCount;

    public Output<Integer> nodeCount() {
        return this.nodeCount == null ? Codegen.empty() : this.nodeCount;
    }

    @Import(name="privateEnvironmentConfig")
      private final @Nullable Output<EnvironmentConfigPrivateEnvironmentConfigGetArgs> privateEnvironmentConfig;

    public Output<EnvironmentConfigPrivateEnvironmentConfigGetArgs> privateEnvironmentConfig() {
        return this.privateEnvironmentConfig == null ? Codegen.empty() : this.privateEnvironmentConfig;
    }

    @Import(name="softwareConfig")
      private final @Nullable Output<EnvironmentConfigSoftwareConfigGetArgs> softwareConfig;

    public Output<EnvironmentConfigSoftwareConfigGetArgs> softwareConfig() {
        return this.softwareConfig == null ? Codegen.empty() : this.softwareConfig;
    }

    @Import(name="webServerConfig")
      private final @Nullable Output<EnvironmentConfigWebServerConfigGetArgs> webServerConfig;

    public Output<EnvironmentConfigWebServerConfigGetArgs> webServerConfig() {
        return this.webServerConfig == null ? Codegen.empty() : this.webServerConfig;
    }

    @Import(name="webServerNetworkAccessControl")
      private final @Nullable Output<EnvironmentConfigWebServerNetworkAccessControlGetArgs> webServerNetworkAccessControl;

    public Output<EnvironmentConfigWebServerNetworkAccessControlGetArgs> webServerNetworkAccessControl() {
        return this.webServerNetworkAccessControl == null ? Codegen.empty() : this.webServerNetworkAccessControl;
    }

    @Import(name="workloadsConfig")
      private final @Nullable Output<EnvironmentConfigWorkloadsConfigGetArgs> workloadsConfig;

    public Output<EnvironmentConfigWorkloadsConfigGetArgs> workloadsConfig() {
        return this.workloadsConfig == null ? Codegen.empty() : this.workloadsConfig;
    }

    public EnvironmentConfigGetArgs(
        @Nullable Output<String> airflowUri,
        @Nullable Output<String> dagGcsPrefix,
        @Nullable Output<EnvironmentConfigDatabaseConfigGetArgs> databaseConfig,
        @Nullable Output<EnvironmentConfigEncryptionConfigGetArgs> encryptionConfig,
        @Nullable Output<String> environmentSize,
        @Nullable Output<String> gkeCluster,
        @Nullable Output<EnvironmentConfigMaintenanceWindowGetArgs> maintenanceWindow,
        @Nullable Output<EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs> masterAuthorizedNetworksConfig,
        @Nullable Output<EnvironmentConfigNodeConfigGetArgs> nodeConfig,
        @Nullable Output<Integer> nodeCount,
        @Nullable Output<EnvironmentConfigPrivateEnvironmentConfigGetArgs> privateEnvironmentConfig,
        @Nullable Output<EnvironmentConfigSoftwareConfigGetArgs> softwareConfig,
        @Nullable Output<EnvironmentConfigWebServerConfigGetArgs> webServerConfig,
        @Nullable Output<EnvironmentConfigWebServerNetworkAccessControlGetArgs> webServerNetworkAccessControl,
        @Nullable Output<EnvironmentConfigWorkloadsConfigGetArgs> workloadsConfig) {
        this.airflowUri = airflowUri;
        this.dagGcsPrefix = dagGcsPrefix;
        this.databaseConfig = databaseConfig;
        this.encryptionConfig = encryptionConfig;
        this.environmentSize = environmentSize;
        this.gkeCluster = gkeCluster;
        this.maintenanceWindow = maintenanceWindow;
        this.masterAuthorizedNetworksConfig = masterAuthorizedNetworksConfig;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.privateEnvironmentConfig = privateEnvironmentConfig;
        this.softwareConfig = softwareConfig;
        this.webServerConfig = webServerConfig;
        this.webServerNetworkAccessControl = webServerNetworkAccessControl;
        this.workloadsConfig = workloadsConfig;
    }

    private EnvironmentConfigGetArgs() {
        this.airflowUri = Codegen.empty();
        this.dagGcsPrefix = Codegen.empty();
        this.databaseConfig = Codegen.empty();
        this.encryptionConfig = Codegen.empty();
        this.environmentSize = Codegen.empty();
        this.gkeCluster = Codegen.empty();
        this.maintenanceWindow = Codegen.empty();
        this.masterAuthorizedNetworksConfig = Codegen.empty();
        this.nodeConfig = Codegen.empty();
        this.nodeCount = Codegen.empty();
        this.privateEnvironmentConfig = Codegen.empty();
        this.softwareConfig = Codegen.empty();
        this.webServerConfig = Codegen.empty();
        this.webServerNetworkAccessControl = Codegen.empty();
        this.workloadsConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> airflowUri;
        private @Nullable Output<String> dagGcsPrefix;
        private @Nullable Output<EnvironmentConfigDatabaseConfigGetArgs> databaseConfig;
        private @Nullable Output<EnvironmentConfigEncryptionConfigGetArgs> encryptionConfig;
        private @Nullable Output<String> environmentSize;
        private @Nullable Output<String> gkeCluster;
        private @Nullable Output<EnvironmentConfigMaintenanceWindowGetArgs> maintenanceWindow;
        private @Nullable Output<EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs> masterAuthorizedNetworksConfig;
        private @Nullable Output<EnvironmentConfigNodeConfigGetArgs> nodeConfig;
        private @Nullable Output<Integer> nodeCount;
        private @Nullable Output<EnvironmentConfigPrivateEnvironmentConfigGetArgs> privateEnvironmentConfig;
        private @Nullable Output<EnvironmentConfigSoftwareConfigGetArgs> softwareConfig;
        private @Nullable Output<EnvironmentConfigWebServerConfigGetArgs> webServerConfig;
        private @Nullable Output<EnvironmentConfigWebServerNetworkAccessControlGetArgs> webServerNetworkAccessControl;
        private @Nullable Output<EnvironmentConfigWorkloadsConfigGetArgs> workloadsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowUri = defaults.airflowUri;
    	      this.dagGcsPrefix = defaults.dagGcsPrefix;
    	      this.databaseConfig = defaults.databaseConfig;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.environmentSize = defaults.environmentSize;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.masterAuthorizedNetworksConfig = defaults.masterAuthorizedNetworksConfig;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.privateEnvironmentConfig = defaults.privateEnvironmentConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.webServerConfig = defaults.webServerConfig;
    	      this.webServerNetworkAccessControl = defaults.webServerNetworkAccessControl;
    	      this.workloadsConfig = defaults.workloadsConfig;
        }

        public Builder airflowUri(@Nullable Output<String> airflowUri) {
            this.airflowUri = airflowUri;
            return this;
        }
        public Builder airflowUri(@Nullable String airflowUri) {
            this.airflowUri = Codegen.ofNullable(airflowUri);
            return this;
        }
        public Builder dagGcsPrefix(@Nullable Output<String> dagGcsPrefix) {
            this.dagGcsPrefix = dagGcsPrefix;
            return this;
        }
        public Builder dagGcsPrefix(@Nullable String dagGcsPrefix) {
            this.dagGcsPrefix = Codegen.ofNullable(dagGcsPrefix);
            return this;
        }
        public Builder databaseConfig(@Nullable Output<EnvironmentConfigDatabaseConfigGetArgs> databaseConfig) {
            this.databaseConfig = databaseConfig;
            return this;
        }
        public Builder databaseConfig(@Nullable EnvironmentConfigDatabaseConfigGetArgs databaseConfig) {
            this.databaseConfig = Codegen.ofNullable(databaseConfig);
            return this;
        }
        public Builder encryptionConfig(@Nullable Output<EnvironmentConfigEncryptionConfigGetArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable EnvironmentConfigEncryptionConfigGetArgs encryptionConfig) {
            this.encryptionConfig = Codegen.ofNullable(encryptionConfig);
            return this;
        }
        public Builder environmentSize(@Nullable Output<String> environmentSize) {
            this.environmentSize = environmentSize;
            return this;
        }
        public Builder environmentSize(@Nullable String environmentSize) {
            this.environmentSize = Codegen.ofNullable(environmentSize);
            return this;
        }
        public Builder gkeCluster(@Nullable Output<String> gkeCluster) {
            this.gkeCluster = gkeCluster;
            return this;
        }
        public Builder gkeCluster(@Nullable String gkeCluster) {
            this.gkeCluster = Codegen.ofNullable(gkeCluster);
            return this;
        }
        public Builder maintenanceWindow(@Nullable Output<EnvironmentConfigMaintenanceWindowGetArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public Builder maintenanceWindow(@Nullable EnvironmentConfigMaintenanceWindowGetArgs maintenanceWindow) {
            this.maintenanceWindow = Codegen.ofNullable(maintenanceWindow);
            return this;
        }
        public Builder masterAuthorizedNetworksConfig(@Nullable Output<EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs> masterAuthorizedNetworksConfig) {
            this.masterAuthorizedNetworksConfig = masterAuthorizedNetworksConfig;
            return this;
        }
        public Builder masterAuthorizedNetworksConfig(@Nullable EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs masterAuthorizedNetworksConfig) {
            this.masterAuthorizedNetworksConfig = Codegen.ofNullable(masterAuthorizedNetworksConfig);
            return this;
        }
        public Builder nodeConfig(@Nullable Output<EnvironmentConfigNodeConfigGetArgs> nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }
        public Builder nodeConfig(@Nullable EnvironmentConfigNodeConfigGetArgs nodeConfig) {
            this.nodeConfig = Codegen.ofNullable(nodeConfig);
            return this;
        }
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Codegen.ofNullable(nodeCount);
            return this;
        }
        public Builder privateEnvironmentConfig(@Nullable Output<EnvironmentConfigPrivateEnvironmentConfigGetArgs> privateEnvironmentConfig) {
            this.privateEnvironmentConfig = privateEnvironmentConfig;
            return this;
        }
        public Builder privateEnvironmentConfig(@Nullable EnvironmentConfigPrivateEnvironmentConfigGetArgs privateEnvironmentConfig) {
            this.privateEnvironmentConfig = Codegen.ofNullable(privateEnvironmentConfig);
            return this;
        }
        public Builder softwareConfig(@Nullable Output<EnvironmentConfigSoftwareConfigGetArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }
        public Builder softwareConfig(@Nullable EnvironmentConfigSoftwareConfigGetArgs softwareConfig) {
            this.softwareConfig = Codegen.ofNullable(softwareConfig);
            return this;
        }
        public Builder webServerConfig(@Nullable Output<EnvironmentConfigWebServerConfigGetArgs> webServerConfig) {
            this.webServerConfig = webServerConfig;
            return this;
        }
        public Builder webServerConfig(@Nullable EnvironmentConfigWebServerConfigGetArgs webServerConfig) {
            this.webServerConfig = Codegen.ofNullable(webServerConfig);
            return this;
        }
        public Builder webServerNetworkAccessControl(@Nullable Output<EnvironmentConfigWebServerNetworkAccessControlGetArgs> webServerNetworkAccessControl) {
            this.webServerNetworkAccessControl = webServerNetworkAccessControl;
            return this;
        }
        public Builder webServerNetworkAccessControl(@Nullable EnvironmentConfigWebServerNetworkAccessControlGetArgs webServerNetworkAccessControl) {
            this.webServerNetworkAccessControl = Codegen.ofNullable(webServerNetworkAccessControl);
            return this;
        }
        public Builder workloadsConfig(@Nullable Output<EnvironmentConfigWorkloadsConfigGetArgs> workloadsConfig) {
            this.workloadsConfig = workloadsConfig;
            return this;
        }
        public Builder workloadsConfig(@Nullable EnvironmentConfigWorkloadsConfigGetArgs workloadsConfig) {
            this.workloadsConfig = Codegen.ofNullable(workloadsConfig);
            return this;
        }        public EnvironmentConfigGetArgs build() {
            return new EnvironmentConfigGetArgs(airflowUri, dagGcsPrefix, databaseConfig, encryptionConfig, environmentSize, gkeCluster, maintenanceWindow, masterAuthorizedNetworksConfig, nodeConfig, nodeCount, privateEnvironmentConfig, softwareConfig, webServerConfig, webServerNetworkAccessControl, workloadsConfig);
        }
    }
}
