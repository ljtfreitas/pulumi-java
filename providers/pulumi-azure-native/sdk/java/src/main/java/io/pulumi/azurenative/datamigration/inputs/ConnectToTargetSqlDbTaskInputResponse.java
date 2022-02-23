// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Input for the task that validates connection to SQL DB and target server requirements
 * 
 */
public final class ConnectToTargetSqlDbTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetSqlDbTaskInputResponse Empty = new ConnectToTargetSqlDbTaskInputResponse();

    /**
     * Connection information for target SQL DB
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
        private final SqlConnectionInfoResponse targetConnectionInfo;

    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetSqlDbTaskInputResponse(SqlConnectionInfoResponse targetConnectionInfo) {
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetSqlDbTaskInputResponse() {
        this.targetConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlDbTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlDbTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public ConnectToTargetSqlDbTaskInputResponse build() {
            return new ConnectToTargetSqlDbTaskInputResponse(targetConnectionInfo);
        }
    }
}
