// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorVpcConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AnomalyDetectorRDSSourceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorRDSSourceConfigArgs Empty = new AnomalyDetectorRDSSourceConfigArgs();

    @InputImport(name="dBInstanceIdentifier", required=true)
        private final Input<String> dBInstanceIdentifier;

    public Input<String> getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    @InputImport(name="databaseHost", required=true)
        private final Input<String> databaseHost;

    public Input<String> getDatabaseHost() {
        return this.databaseHost;
    }

    @InputImport(name="databaseName", required=true)
        private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="databasePort", required=true)
        private final Input<Integer> databasePort;

    public Input<Integer> getDatabasePort() {
        return this.databasePort;
    }

    @InputImport(name="roleArn", required=true)
        private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="secretManagerArn", required=true)
        private final Input<String> secretManagerArn;

    public Input<String> getSecretManagerArn() {
        return this.secretManagerArn;
    }

    @InputImport(name="tableName", required=true)
        private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    @InputImport(name="vpcConfiguration", required=true)
        private final Input<AnomalyDetectorVpcConfigurationArgs> vpcConfiguration;

    public Input<AnomalyDetectorVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    public AnomalyDetectorRDSSourceConfigArgs(
        Input<String> dBInstanceIdentifier,
        Input<String> databaseHost,
        Input<String> databaseName,
        Input<Integer> databasePort,
        Input<String> roleArn,
        Input<String> secretManagerArn,
        Input<String> tableName,
        Input<AnomalyDetectorVpcConfigurationArgs> vpcConfiguration) {
        this.dBInstanceIdentifier = Objects.requireNonNull(dBInstanceIdentifier, "expected parameter 'dBInstanceIdentifier' to be non-null");
        this.databaseHost = Objects.requireNonNull(databaseHost, "expected parameter 'databaseHost' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.databasePort = Objects.requireNonNull(databasePort, "expected parameter 'databasePort' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.secretManagerArn = Objects.requireNonNull(secretManagerArn, "expected parameter 'secretManagerArn' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.vpcConfiguration = Objects.requireNonNull(vpcConfiguration, "expected parameter 'vpcConfiguration' to be non-null");
    }

    private AnomalyDetectorRDSSourceConfigArgs() {
        this.dBInstanceIdentifier = Input.empty();
        this.databaseHost = Input.empty();
        this.databaseName = Input.empty();
        this.databasePort = Input.empty();
        this.roleArn = Input.empty();
        this.secretManagerArn = Input.empty();
        this.tableName = Input.empty();
        this.vpcConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorRDSSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dBInstanceIdentifier;
        private Input<String> databaseHost;
        private Input<String> databaseName;
        private Input<Integer> databasePort;
        private Input<String> roleArn;
        private Input<String> secretManagerArn;
        private Input<String> tableName;
        private Input<AnomalyDetectorVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorRDSSourceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dBInstanceIdentifier = defaults.dBInstanceIdentifier;
    	      this.databaseHost = defaults.databaseHost;
    	      this.databaseName = defaults.databaseName;
    	      this.databasePort = defaults.databasePort;
    	      this.roleArn = defaults.roleArn;
    	      this.secretManagerArn = defaults.secretManagerArn;
    	      this.tableName = defaults.tableName;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder setDBInstanceIdentifier(Input<String> dBInstanceIdentifier) {
            this.dBInstanceIdentifier = Objects.requireNonNull(dBInstanceIdentifier);
            return this;
        }

        public Builder setDBInstanceIdentifier(String dBInstanceIdentifier) {
            this.dBInstanceIdentifier = Input.of(Objects.requireNonNull(dBInstanceIdentifier));
            return this;
        }

        public Builder setDatabaseHost(Input<String> databaseHost) {
            this.databaseHost = Objects.requireNonNull(databaseHost);
            return this;
        }

        public Builder setDatabaseHost(String databaseHost) {
            this.databaseHost = Input.of(Objects.requireNonNull(databaseHost));
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setDatabasePort(Input<Integer> databasePort) {
            this.databasePort = Objects.requireNonNull(databasePort);
            return this;
        }

        public Builder setDatabasePort(Integer databasePort) {
            this.databasePort = Input.of(Objects.requireNonNull(databasePort));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setSecretManagerArn(Input<String> secretManagerArn) {
            this.secretManagerArn = Objects.requireNonNull(secretManagerArn);
            return this;
        }

        public Builder setSecretManagerArn(String secretManagerArn) {
            this.secretManagerArn = Input.of(Objects.requireNonNull(secretManagerArn));
            return this;
        }

        public Builder setTableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }

        public Builder setVpcConfiguration(Input<AnomalyDetectorVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = Objects.requireNonNull(vpcConfiguration);
            return this;
        }

        public Builder setVpcConfiguration(AnomalyDetectorVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Input.of(Objects.requireNonNull(vpcConfiguration));
            return this;
        }
        public AnomalyDetectorRDSSourceConfigArgs build() {
            return new AnomalyDetectorRDSSourceConfigArgs(dBInstanceIdentifier, databaseHost, databaseName, databasePort, roleArn, secretManagerArn, tableName, vpcConfiguration);
        }
    }
}
