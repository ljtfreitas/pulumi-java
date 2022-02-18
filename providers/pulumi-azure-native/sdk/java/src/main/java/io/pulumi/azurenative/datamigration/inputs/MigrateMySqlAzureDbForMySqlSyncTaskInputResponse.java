// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.inputs.MySqlConnectionInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Input for the task that migrates MySQL databases to Azure Database for MySQL for online migrations
 * 
 */
public final class MigrateMySqlAzureDbForMySqlSyncTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateMySqlAzureDbForMySqlSyncTaskInputResponse Empty = new MigrateMySqlAzureDbForMySqlSyncTaskInputResponse();

    /**
     * Databases to migrate
     * 
     */
    @InputImport(name="selectedDatabases", required=true)
    private final List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> selectedDatabases;

    public List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Connection information for source MySQL
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
    private final MySqlConnectionInfoResponse sourceConnectionInfo;

    public MySqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for target Azure Database for MySQL
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
    private final MySqlConnectionInfoResponse targetConnectionInfo;

    public MySqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public MigrateMySqlAzureDbForMySqlSyncTaskInputResponse(
        List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> selectedDatabases,
        MySqlConnectionInfoResponse sourceConnectionInfo,
        MySqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private MigrateMySqlAzureDbForMySqlSyncTaskInputResponse() {
        this.selectedDatabases = List.of();
        this.sourceConnectionInfo = null;
        this.targetConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> selectedDatabases;
        private MySqlConnectionInfoResponse sourceConnectionInfo;
        private MySqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSelectedDatabases(List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSourceConnectionInfo(MySqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(MySqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public MigrateMySqlAzureDbForMySqlSyncTaskInputResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncTaskInputResponse(selectedDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
