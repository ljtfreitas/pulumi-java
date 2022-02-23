// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the On Premise Sql resource that was assessed
 * 
 */
public final class OnPremiseSqlResourceDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnPremiseSqlResourceDetailsArgs Empty = new OnPremiseSqlResourceDetailsArgs();

    /**
     * The Sql database name installed on the machine
     * 
     */
    @InputImport(name="databaseName", required=true)
        private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the machine
     * 
     */
    @InputImport(name="machineName", required=true)
        private final Input<String> machineName;

    public Input<String> getMachineName() {
        return this.machineName;
    }

    /**
     * The Sql server name installed on the machine
     * 
     */
    @InputImport(name="serverName", required=true)
        private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * The platform where the assessed resource resides
     * Expected value is 'OnPremiseSql'.
     * 
     */
    @InputImport(name="source", required=true)
        private final Input<String> source;

    public Input<String> getSource() {
        return this.source;
    }

    /**
     * The oms agent Id installed on the machine
     * 
     */
    @InputImport(name="sourceComputerId", required=true)
        private final Input<String> sourceComputerId;

    public Input<String> getSourceComputerId() {
        return this.sourceComputerId;
    }

    /**
     * The unique Id of the machine
     * 
     */
    @InputImport(name="vmuuid", required=true)
        private final Input<String> vmuuid;

    public Input<String> getVmuuid() {
        return this.vmuuid;
    }

    /**
     * Azure resource Id of the workspace the machine is attached to
     * 
     */
    @InputImport(name="workspaceId", required=true)
        private final Input<String> workspaceId;

    public Input<String> getWorkspaceId() {
        return this.workspaceId;
    }

    public OnPremiseSqlResourceDetailsArgs(
        Input<String> databaseName,
        Input<String> machineName,
        Input<String> serverName,
        Input<String> source,
        Input<String> sourceComputerId,
        Input<String> vmuuid,
        Input<String> workspaceId) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceComputerId = Objects.requireNonNull(sourceComputerId, "expected parameter 'sourceComputerId' to be non-null");
        this.vmuuid = Objects.requireNonNull(vmuuid, "expected parameter 'vmuuid' to be non-null");
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
    }

    private OnPremiseSqlResourceDetailsArgs() {
        this.databaseName = Input.empty();
        this.machineName = Input.empty();
        this.serverName = Input.empty();
        this.source = Input.empty();
        this.sourceComputerId = Input.empty();
        this.vmuuid = Input.empty();
        this.workspaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremiseSqlResourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> databaseName;
        private Input<String> machineName;
        private Input<String> serverName;
        private Input<String> source;
        private Input<String> sourceComputerId;
        private Input<String> vmuuid;
        private Input<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremiseSqlResourceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.machineName = defaults.machineName;
    	      this.serverName = defaults.serverName;
    	      this.source = defaults.source;
    	      this.sourceComputerId = defaults.sourceComputerId;
    	      this.vmuuid = defaults.vmuuid;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setMachineName(Input<String> machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder setMachineName(String machineName) {
            this.machineName = Input.of(Objects.requireNonNull(machineName));
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

        public Builder setSource(Input<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder setSourceComputerId(Input<String> sourceComputerId) {
            this.sourceComputerId = Objects.requireNonNull(sourceComputerId);
            return this;
        }

        public Builder setSourceComputerId(String sourceComputerId) {
            this.sourceComputerId = Input.of(Objects.requireNonNull(sourceComputerId));
            return this;
        }

        public Builder setVmuuid(Input<String> vmuuid) {
            this.vmuuid = Objects.requireNonNull(vmuuid);
            return this;
        }

        public Builder setVmuuid(String vmuuid) {
            this.vmuuid = Input.of(Objects.requireNonNull(vmuuid));
            return this;
        }

        public Builder setWorkspaceId(Input<String> workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Input.of(Objects.requireNonNull(workspaceId));
            return this;
        }
        public OnPremiseSqlResourceDetailsArgs build() {
            return new OnPremiseSqlResourceDetailsArgs(databaseName, machineName, serverName, source, sourceComputerId, vmuuid, workspaceId);
        }
    }
}
