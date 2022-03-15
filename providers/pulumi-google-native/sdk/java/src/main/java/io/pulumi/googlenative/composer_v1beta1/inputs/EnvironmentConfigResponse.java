// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.composer_v1beta1.inputs.DatabaseConfigResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.EncryptionConfigResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.MaintenanceWindowResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.MasterAuthorizedNetworksConfigResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.NodeConfigResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.PrivateEnvironmentConfigResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.SoftwareConfigResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.WebServerConfigResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.WebServerNetworkAccessControlResponse;
import io.pulumi.googlenative.composer_v1beta1.inputs.WorkloadsConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration information for an environment.
 * 
 */
public final class EnvironmentConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentConfigResponse Empty = new EnvironmentConfigResponse();

    /**
     * The URI of the Apache Airflow Web UI hosted within this environment (see [Airflow web interface](/composer/docs/how-to/accessing/airflow-web-interface)).
     * 
     */
    @Import(name="airflowUri", required=true)
      private final String airflowUri;

    public String getAirflowUri() {
        return this.airflowUri;
    }

    /**
     * The Cloud Storage prefix of the DAGs for this environment. Although Cloud Storage objects reside in a flat namespace, a hierarchical file tree can be simulated using "/"-delimited object name prefixes. DAG objects for this environment reside in a simulated directory with the given prefix.
     * 
     */
    @Import(name="dagGcsPrefix", required=true)
      private final String dagGcsPrefix;

    public String getDagGcsPrefix() {
        return this.dagGcsPrefix;
    }

    /**
     * Optional. The configuration settings for Cloud SQL instance used internally by Apache Airflow software. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="databaseConfig", required=true)
      private final DatabaseConfigResponse databaseConfig;

    public DatabaseConfigResponse getDatabaseConfig() {
        return this.databaseConfig;
    }

    /**
     * Optional. The encryption options for the Cloud Composer environment and its dependencies. Cannot be updated.
     * 
     */
    @Import(name="encryptionConfig", required=true)
      private final EncryptionConfigResponse encryptionConfig;

    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * Optional. The size of the Cloud Composer environment. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    @Import(name="environmentSize", required=true)
      private final String environmentSize;

    public String getEnvironmentSize() {
        return this.environmentSize;
    }

    /**
     * The Kubernetes Engine cluster used to run this environment.
     * 
     */
    @Import(name="gkeCluster", required=true)
      private final String gkeCluster;

    public String getGkeCluster() {
        return this.gkeCluster;
    }

    /**
     * Optional. The maintenance window is the period when Cloud Composer components may undergo maintenance. It is defined so that maintenance is not executed during peak hours or critical time periods. The system will not be under maintenance for every occurrence of this window, but when maintenance is planned, it will be scheduled during the window. The maintenance window period must encompass at least 12 hours per week. This may be split into multiple chunks, each with a size of at least 4 hours. If this value is omitted, Cloud Composer components may be subject to maintenance at any time.
     * 
     */
    @Import(name="maintenanceWindow", required=true)
      private final MaintenanceWindowResponse maintenanceWindow;

    public MaintenanceWindowResponse getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Optional. The configuration options for GKE clusters master authorized networks. By default master authorized networks feature is: - in case of private environment: enabled with no external networks allowlisted. - in case of public environment: disabled.
     * 
     */
    @Import(name="masterAuthorizedNetworksConfig", required=true)
      private final MasterAuthorizedNetworksConfigResponse masterAuthorizedNetworksConfig;

    public MasterAuthorizedNetworksConfigResponse getMasterAuthorizedNetworksConfig() {
        return this.masterAuthorizedNetworksConfig;
    }

    /**
     * The configuration used for the Kubernetes Engine cluster.
     * 
     */
    @Import(name="nodeConfig", required=true)
      private final NodeConfigResponse nodeConfig;

    public NodeConfigResponse getNodeConfig() {
        return this.nodeConfig;
    }

    /**
     * The number of nodes in the Kubernetes Engine cluster that will be used to run this environment. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="nodeCount", required=true)
      private final Integer nodeCount;

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * The configuration used for the Private IP Cloud Composer environment.
     * 
     */
    @Import(name="privateEnvironmentConfig", required=true)
      private final PrivateEnvironmentConfigResponse privateEnvironmentConfig;

    public PrivateEnvironmentConfigResponse getPrivateEnvironmentConfig() {
        return this.privateEnvironmentConfig;
    }

    /**
     * The configuration settings for software inside the environment.
     * 
     */
    @Import(name="softwareConfig", required=true)
      private final SoftwareConfigResponse softwareConfig;

    public SoftwareConfigResponse getSoftwareConfig() {
        return this.softwareConfig;
    }

    /**
     * Optional. The configuration settings for the Airflow web server App Engine instance. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="webServerConfig", required=true)
      private final WebServerConfigResponse webServerConfig;

    public WebServerConfigResponse getWebServerConfig() {
        return this.webServerConfig;
    }

    /**
     * Optional. The network-level access control policy for the Airflow web server. If unspecified, no network-level access restrictions will be applied.
     * 
     */
    @Import(name="webServerNetworkAccessControl", required=true)
      private final WebServerNetworkAccessControlResponse webServerNetworkAccessControl;

    public WebServerNetworkAccessControlResponse getWebServerNetworkAccessControl() {
        return this.webServerNetworkAccessControl;
    }

    /**
     * Optional. The workloads configuration settings for the GKE cluster associated with the Cloud Composer environment. The GKE cluster runs Airflow scheduler, web server and workers workloads. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    @Import(name="workloadsConfig", required=true)
      private final WorkloadsConfigResponse workloadsConfig;

    public WorkloadsConfigResponse getWorkloadsConfig() {
        return this.workloadsConfig;
    }

    public EnvironmentConfigResponse(
        String airflowUri,
        String dagGcsPrefix,
        DatabaseConfigResponse databaseConfig,
        EncryptionConfigResponse encryptionConfig,
        String environmentSize,
        String gkeCluster,
        MaintenanceWindowResponse maintenanceWindow,
        MasterAuthorizedNetworksConfigResponse masterAuthorizedNetworksConfig,
        NodeConfigResponse nodeConfig,
        Integer nodeCount,
        PrivateEnvironmentConfigResponse privateEnvironmentConfig,
        SoftwareConfigResponse softwareConfig,
        WebServerConfigResponse webServerConfig,
        WebServerNetworkAccessControlResponse webServerNetworkAccessControl,
        WorkloadsConfigResponse workloadsConfig) {
        this.airflowUri = Objects.requireNonNull(airflowUri, "expected parameter 'airflowUri' to be non-null");
        this.dagGcsPrefix = Objects.requireNonNull(dagGcsPrefix, "expected parameter 'dagGcsPrefix' to be non-null");
        this.databaseConfig = Objects.requireNonNull(databaseConfig, "expected parameter 'databaseConfig' to be non-null");
        this.encryptionConfig = Objects.requireNonNull(encryptionConfig, "expected parameter 'encryptionConfig' to be non-null");
        this.environmentSize = Objects.requireNonNull(environmentSize, "expected parameter 'environmentSize' to be non-null");
        this.gkeCluster = Objects.requireNonNull(gkeCluster, "expected parameter 'gkeCluster' to be non-null");
        this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow, "expected parameter 'maintenanceWindow' to be non-null");
        this.masterAuthorizedNetworksConfig = Objects.requireNonNull(masterAuthorizedNetworksConfig, "expected parameter 'masterAuthorizedNetworksConfig' to be non-null");
        this.nodeConfig = Objects.requireNonNull(nodeConfig, "expected parameter 'nodeConfig' to be non-null");
        this.nodeCount = Objects.requireNonNull(nodeCount, "expected parameter 'nodeCount' to be non-null");
        this.privateEnvironmentConfig = Objects.requireNonNull(privateEnvironmentConfig, "expected parameter 'privateEnvironmentConfig' to be non-null");
        this.softwareConfig = Objects.requireNonNull(softwareConfig, "expected parameter 'softwareConfig' to be non-null");
        this.webServerConfig = Objects.requireNonNull(webServerConfig, "expected parameter 'webServerConfig' to be non-null");
        this.webServerNetworkAccessControl = Objects.requireNonNull(webServerNetworkAccessControl, "expected parameter 'webServerNetworkAccessControl' to be non-null");
        this.workloadsConfig = Objects.requireNonNull(workloadsConfig, "expected parameter 'workloadsConfig' to be non-null");
    }

    private EnvironmentConfigResponse() {
        this.airflowUri = null;
        this.dagGcsPrefix = null;
        this.databaseConfig = null;
        this.encryptionConfig = null;
        this.environmentSize = null;
        this.gkeCluster = null;
        this.maintenanceWindow = null;
        this.masterAuthorizedNetworksConfig = null;
        this.nodeConfig = null;
        this.nodeCount = null;
        this.privateEnvironmentConfig = null;
        this.softwareConfig = null;
        this.webServerConfig = null;
        this.webServerNetworkAccessControl = null;
        this.workloadsConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String airflowUri;
        private String dagGcsPrefix;
        private DatabaseConfigResponse databaseConfig;
        private EncryptionConfigResponse encryptionConfig;
        private String environmentSize;
        private String gkeCluster;
        private MaintenanceWindowResponse maintenanceWindow;
        private MasterAuthorizedNetworksConfigResponse masterAuthorizedNetworksConfig;
        private NodeConfigResponse nodeConfig;
        private Integer nodeCount;
        private PrivateEnvironmentConfigResponse privateEnvironmentConfig;
        private SoftwareConfigResponse softwareConfig;
        private WebServerConfigResponse webServerConfig;
        private WebServerNetworkAccessControlResponse webServerNetworkAccessControl;
        private WorkloadsConfigResponse workloadsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigResponse defaults) {
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

        public Builder airflowUri(String airflowUri) {
            this.airflowUri = Objects.requireNonNull(airflowUri);
            return this;
        }

        public Builder dagGcsPrefix(String dagGcsPrefix) {
            this.dagGcsPrefix = Objects.requireNonNull(dagGcsPrefix);
            return this;
        }

        public Builder databaseConfig(DatabaseConfigResponse databaseConfig) {
            this.databaseConfig = Objects.requireNonNull(databaseConfig);
            return this;
        }

        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }

        public Builder environmentSize(String environmentSize) {
            this.environmentSize = Objects.requireNonNull(environmentSize);
            return this;
        }

        public Builder gkeCluster(String gkeCluster) {
            this.gkeCluster = Objects.requireNonNull(gkeCluster);
            return this;
        }

        public Builder maintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }

        public Builder masterAuthorizedNetworksConfig(MasterAuthorizedNetworksConfigResponse masterAuthorizedNetworksConfig) {
            this.masterAuthorizedNetworksConfig = Objects.requireNonNull(masterAuthorizedNetworksConfig);
            return this;
        }

        public Builder nodeConfig(NodeConfigResponse nodeConfig) {
            this.nodeConfig = Objects.requireNonNull(nodeConfig);
            return this;
        }

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder privateEnvironmentConfig(PrivateEnvironmentConfigResponse privateEnvironmentConfig) {
            this.privateEnvironmentConfig = Objects.requireNonNull(privateEnvironmentConfig);
            return this;
        }

        public Builder softwareConfig(SoftwareConfigResponse softwareConfig) {
            this.softwareConfig = Objects.requireNonNull(softwareConfig);
            return this;
        }

        public Builder webServerConfig(WebServerConfigResponse webServerConfig) {
            this.webServerConfig = Objects.requireNonNull(webServerConfig);
            return this;
        }

        public Builder webServerNetworkAccessControl(WebServerNetworkAccessControlResponse webServerNetworkAccessControl) {
            this.webServerNetworkAccessControl = Objects.requireNonNull(webServerNetworkAccessControl);
            return this;
        }

        public Builder workloadsConfig(WorkloadsConfigResponse workloadsConfig) {
            this.workloadsConfig = Objects.requireNonNull(workloadsConfig);
            return this;
        }
        public EnvironmentConfigResponse build() {
            return new EnvironmentConfigResponse(airflowUri, dagGcsPrefix, databaseConfig, encryptionConfig, environmentSize, gkeCluster, maintenanceWindow, masterAuthorizedNetworksConfig, nodeConfig, nodeCount, privateEnvironmentConfig, softwareConfig, webServerConfig, webServerNetworkAccessControl, workloadsConfig);
        }
    }
}
