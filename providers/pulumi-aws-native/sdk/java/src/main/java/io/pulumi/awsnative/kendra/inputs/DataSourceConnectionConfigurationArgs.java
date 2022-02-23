// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceConnectionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceConnectionConfigurationArgs Empty = new DataSourceConnectionConfigurationArgs();

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

    @InputImport(name="secretArn", required=true)
        private final Input<String> secretArn;

    public Input<String> getSecretArn() {
        return this.secretArn;
    }

    @InputImport(name="tableName", required=true)
        private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public DataSourceConnectionConfigurationArgs(
        Input<String> databaseHost,
        Input<String> databaseName,
        Input<Integer> databasePort,
        Input<String> secretArn,
        Input<String> tableName) {
        this.databaseHost = Objects.requireNonNull(databaseHost, "expected parameter 'databaseHost' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.databasePort = Objects.requireNonNull(databasePort, "expected parameter 'databasePort' to be non-null");
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private DataSourceConnectionConfigurationArgs() {
        this.databaseHost = Input.empty();
        this.databaseName = Input.empty();
        this.databasePort = Input.empty();
        this.secretArn = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConnectionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> databaseHost;
        private Input<String> databaseName;
        private Input<Integer> databasePort;
        private Input<String> secretArn;
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConnectionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseHost = defaults.databaseHost;
    	      this.databaseName = defaults.databaseName;
    	      this.databasePort = defaults.databasePort;
    	      this.secretArn = defaults.secretArn;
    	      this.tableName = defaults.tableName;
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

        public Builder setSecretArn(Input<String> secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Input.of(Objects.requireNonNull(secretArn));
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
        public DataSourceConnectionConfigurationArgs build() {
            return new DataSourceConnectionConfigurationArgs(databaseHost, databaseName, databasePort, secretArn, tableName);
        }
    }
}
