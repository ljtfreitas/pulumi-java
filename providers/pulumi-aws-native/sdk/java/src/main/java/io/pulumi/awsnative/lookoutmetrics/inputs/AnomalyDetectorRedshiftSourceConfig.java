// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorVpcConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AnomalyDetectorRedshiftSourceConfig extends io.pulumi.resources.InvokeArgs {

    public static final AnomalyDetectorRedshiftSourceConfig Empty = new AnomalyDetectorRedshiftSourceConfig();

    @InputImport(name="clusterIdentifier", required=true)
        private final String clusterIdentifier;

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    @InputImport(name="databaseHost", required=true)
        private final String databaseHost;

    public String getDatabaseHost() {
        return this.databaseHost;
    }

    @InputImport(name="databaseName", required=true)
        private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="databasePort", required=true)
        private final Integer databasePort;

    public Integer getDatabasePort() {
        return this.databasePort;
    }

    @InputImport(name="roleArn", required=true)
        private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="secretManagerArn", required=true)
        private final String secretManagerArn;

    public String getSecretManagerArn() {
        return this.secretManagerArn;
    }

    @InputImport(name="tableName", required=true)
        private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    @InputImport(name="vpcConfiguration", required=true)
        private final AnomalyDetectorVpcConfiguration vpcConfiguration;

    public AnomalyDetectorVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    public AnomalyDetectorRedshiftSourceConfig(
        String clusterIdentifier,
        String databaseHost,
        String databaseName,
        Integer databasePort,
        String roleArn,
        String secretManagerArn,
        String tableName,
        AnomalyDetectorVpcConfiguration vpcConfiguration) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.databaseHost = Objects.requireNonNull(databaseHost, "expected parameter 'databaseHost' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.databasePort = Objects.requireNonNull(databasePort, "expected parameter 'databasePort' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.secretManagerArn = Objects.requireNonNull(secretManagerArn, "expected parameter 'secretManagerArn' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.vpcConfiguration = Objects.requireNonNull(vpcConfiguration, "expected parameter 'vpcConfiguration' to be non-null");
    }

    private AnomalyDetectorRedshiftSourceConfig() {
        this.clusterIdentifier = null;
        this.databaseHost = null;
        this.databaseName = null;
        this.databasePort = null;
        this.roleArn = null;
        this.secretManagerArn = null;
        this.tableName = null;
        this.vpcConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorRedshiftSourceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;
        private String databaseHost;
        private String databaseName;
        private Integer databasePort;
        private String roleArn;
        private String secretManagerArn;
        private String tableName;
        private AnomalyDetectorVpcConfiguration vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorRedshiftSourceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.databaseHost = defaults.databaseHost;
    	      this.databaseName = defaults.databaseName;
    	      this.databasePort = defaults.databasePort;
    	      this.roleArn = defaults.roleArn;
    	      this.secretManagerArn = defaults.secretManagerArn;
    	      this.tableName = defaults.tableName;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setDatabaseHost(String databaseHost) {
            this.databaseHost = Objects.requireNonNull(databaseHost);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabasePort(Integer databasePort) {
            this.databasePort = Objects.requireNonNull(databasePort);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setSecretManagerArn(String secretManagerArn) {
            this.secretManagerArn = Objects.requireNonNull(secretManagerArn);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setVpcConfiguration(AnomalyDetectorVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = Objects.requireNonNull(vpcConfiguration);
            return this;
        }
        public AnomalyDetectorRedshiftSourceConfig build() {
            return new AnomalyDetectorRedshiftSourceConfig(clusterIdentifier, databaseHost, databaseName, databasePort, roleArn, secretManagerArn, tableName, vpcConfiguration);
        }
    }
}
