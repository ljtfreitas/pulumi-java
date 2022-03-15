// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Input for the task that validates connection to Azure SQL Database Managed Instance.
 * 
 */
public final class ConnectToTargetSqlMITaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetSqlMITaskInputArgs Empty = new ConnectToTargetSqlMITaskInputArgs();

    /**
     * Connection information for target SQL Server
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
      private final Output<SqlConnectionInfoArgs> targetConnectionInfo;

    public Output<SqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetSqlMITaskInputArgs(Output<SqlConnectionInfoArgs> targetConnectionInfo) {
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetSqlMITaskInputArgs() {
        this.targetConnectionInfo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMITaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMITaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder targetConnectionInfo(Output<SqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Output.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }
        public ConnectToTargetSqlMITaskInputArgs build() {
            return new ConnectToTargetSqlMITaskInputArgs(targetConnectionInfo);
        }
    }
}
