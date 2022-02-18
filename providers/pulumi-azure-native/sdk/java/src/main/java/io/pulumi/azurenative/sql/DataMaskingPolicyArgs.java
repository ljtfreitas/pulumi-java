// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.DataMaskingState;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataMaskingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataMaskingPolicyArgs Empty = new DataMaskingPolicyArgs();

    /**
     * The name of the database for which the data masking rule applies.
     * 
     */
    @InputImport(name="dataMaskingPolicyName")
    private final @Nullable Input<String> dataMaskingPolicyName;

    public Input<String> getDataMaskingPolicyName() {
        return this.dataMaskingPolicyName == null ? Input.empty() : this.dataMaskingPolicyName;
    }

    /**
     * The state of the data masking policy.
     * 
     */
    @InputImport(name="dataMaskingState", required=true)
    private final Input<DataMaskingState> dataMaskingState;

    public Input<DataMaskingState> getDataMaskingState() {
        return this.dataMaskingState;
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
     * The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
     * 
     */
    @InputImport(name="exemptPrincipals")
    private final @Nullable Input<String> exemptPrincipals;

    public Input<String> getExemptPrincipals() {
        return this.exemptPrincipals == null ? Input.empty() : this.exemptPrincipals;
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

    public DataMaskingPolicyArgs(
        @Nullable Input<String> dataMaskingPolicyName,
        Input<DataMaskingState> dataMaskingState,
        Input<String> databaseName,
        @Nullable Input<String> exemptPrincipals,
        Input<String> resourceGroupName,
        Input<String> serverName) {
        this.dataMaskingPolicyName = dataMaskingPolicyName;
        this.dataMaskingState = Objects.requireNonNull(dataMaskingState, "expected parameter 'dataMaskingState' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.exemptPrincipals = exemptPrincipals;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private DataMaskingPolicyArgs() {
        this.dataMaskingPolicyName = Input.empty();
        this.dataMaskingState = Input.empty();
        this.databaseName = Input.empty();
        this.exemptPrincipals = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataMaskingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataMaskingPolicyName;
        private Input<DataMaskingState> dataMaskingState;
        private Input<String> databaseName;
        private @Nullable Input<String> exemptPrincipals;
        private Input<String> resourceGroupName;
        private Input<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataMaskingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataMaskingPolicyName = defaults.dataMaskingPolicyName;
    	      this.dataMaskingState = defaults.dataMaskingState;
    	      this.databaseName = defaults.databaseName;
    	      this.exemptPrincipals = defaults.exemptPrincipals;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder setDataMaskingPolicyName(@Nullable Input<String> dataMaskingPolicyName) {
            this.dataMaskingPolicyName = dataMaskingPolicyName;
            return this;
        }

        public Builder setDataMaskingPolicyName(@Nullable String dataMaskingPolicyName) {
            this.dataMaskingPolicyName = Input.ofNullable(dataMaskingPolicyName);
            return this;
        }

        public Builder setDataMaskingState(Input<DataMaskingState> dataMaskingState) {
            this.dataMaskingState = Objects.requireNonNull(dataMaskingState);
            return this;
        }

        public Builder setDataMaskingState(DataMaskingState dataMaskingState) {
            this.dataMaskingState = Input.of(Objects.requireNonNull(dataMaskingState));
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

        public Builder setExemptPrincipals(@Nullable Input<String> exemptPrincipals) {
            this.exemptPrincipals = exemptPrincipals;
            return this;
        }

        public Builder setExemptPrincipals(@Nullable String exemptPrincipals) {
            this.exemptPrincipals = Input.ofNullable(exemptPrincipals);
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

        public DataMaskingPolicyArgs build() {
            return new DataMaskingPolicyArgs(dataMaskingPolicyName, dataMaskingState, databaseName, exemptPrincipals, resourceGroupName, serverName);
        }
    }
}
