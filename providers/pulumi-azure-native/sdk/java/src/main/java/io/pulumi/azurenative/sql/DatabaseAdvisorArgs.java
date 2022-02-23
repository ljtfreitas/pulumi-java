// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.AutoExecuteStatus;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseAdvisorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseAdvisorArgs Empty = new DatabaseAdvisorArgs();

    /**
     * The name of the Database Advisor.
     * 
     */
    @InputImport(name="advisorName")
        private final @Nullable Input<String> advisorName;

    public Input<String> getAdvisorName() {
        return this.advisorName == null ? Input.empty() : this.advisorName;
    }

    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'
     * 
     */
    @InputImport(name="autoExecuteStatus", required=true)
        private final Input<AutoExecuteStatus> autoExecuteStatus;

    public Input<AutoExecuteStatus> getAutoExecuteStatus() {
        return this.autoExecuteStatus;
    }

    /**
     * The name of the database.
     * 
     */
    @InputImport(name="databaseName", required=true)
        private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
        private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    public DatabaseAdvisorArgs(
        @Nullable Input<String> advisorName,
        Input<AutoExecuteStatus> autoExecuteStatus,
        Input<String> databaseName,
        Input<String> resourceGroupName,
        Input<String> serverName) {
        this.advisorName = advisorName;
        this.autoExecuteStatus = Objects.requireNonNull(autoExecuteStatus, "expected parameter 'autoExecuteStatus' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private DatabaseAdvisorArgs() {
        this.advisorName = Input.empty();
        this.autoExecuteStatus = Input.empty();
        this.databaseName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseAdvisorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> advisorName;
        private Input<AutoExecuteStatus> autoExecuteStatus;
        private Input<String> databaseName;
        private Input<String> resourceGroupName;
        private Input<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseAdvisorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advisorName = defaults.advisorName;
    	      this.autoExecuteStatus = defaults.autoExecuteStatus;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder setAdvisorName(@Nullable Input<String> advisorName) {
            this.advisorName = advisorName;
            return this;
        }

        public Builder setAdvisorName(@Nullable String advisorName) {
            this.advisorName = Input.ofNullable(advisorName);
            return this;
        }

        public Builder setAutoExecuteStatus(Input<AutoExecuteStatus> autoExecuteStatus) {
            this.autoExecuteStatus = Objects.requireNonNull(autoExecuteStatus);
            return this;
        }

        public Builder setAutoExecuteStatus(AutoExecuteStatus autoExecuteStatus) {
            this.autoExecuteStatus = Input.of(Objects.requireNonNull(autoExecuteStatus));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }
        public DatabaseAdvisorArgs build() {
            return new DatabaseAdvisorArgs(advisorName, autoExecuteStatus, databaseName, resourceGroupName, serverName);
        }
    }
}
