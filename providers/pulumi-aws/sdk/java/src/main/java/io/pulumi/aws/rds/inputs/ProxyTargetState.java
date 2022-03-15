// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyTargetState extends io.pulumi.resources.ResourceArgs {

    public static final ProxyTargetState Empty = new ProxyTargetState();

    /**
     * DB cluster identifier.
     * 
     */
    @Import(name="dbClusterIdentifier")
      private final @Nullable Output<String> dbClusterIdentifier;

    public Output<String> getDbClusterIdentifier() {
        return this.dbClusterIdentifier == null ? Output.empty() : this.dbClusterIdentifier;
    }

    /**
     * DB instance identifier.
     * 
     */
    @Import(name="dbInstanceIdentifier")
      private final @Nullable Output<String> dbInstanceIdentifier;

    public Output<String> getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier == null ? Output.empty() : this.dbInstanceIdentifier;
    }

    /**
     * The name of the DB proxy.
     * 
     */
    @Import(name="dbProxyName")
      private final @Nullable Output<String> dbProxyName;

    public Output<String> getDbProxyName() {
        return this.dbProxyName == null ? Output.empty() : this.dbProxyName;
    }

    /**
     * Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * Port for the target RDS DB Instance or Aurora DB Cluster.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * Identifier representing the DB Instance or DB Cluster target.
     * 
     */
    @Import(name="rdsResourceId")
      private final @Nullable Output<String> rdsResourceId;

    public Output<String> getRdsResourceId() {
        return this.rdsResourceId == null ? Output.empty() : this.rdsResourceId;
    }

    /**
     * Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
     * 
     */
    @Import(name="targetArn")
      private final @Nullable Output<String> targetArn;

    public Output<String> getTargetArn() {
        return this.targetArn == null ? Output.empty() : this.targetArn;
    }

    /**
     * The name of the target group.
     * 
     */
    @Import(name="targetGroupName")
      private final @Nullable Output<String> targetGroupName;

    public Output<String> getTargetGroupName() {
        return this.targetGroupName == null ? Output.empty() : this.targetGroupName;
    }

    /**
     * DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
     * 
     */
    @Import(name="trackedClusterId")
      private final @Nullable Output<String> trackedClusterId;

    public Output<String> getTrackedClusterId() {
        return this.trackedClusterId == null ? Output.empty() : this.trackedClusterId;
    }

    /**
     * Type of targetE.g., `RDS_INSTANCE` or `TRACKED_CLUSTER`
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ProxyTargetState(
        @Nullable Output<String> dbClusterIdentifier,
        @Nullable Output<String> dbInstanceIdentifier,
        @Nullable Output<String> dbProxyName,
        @Nullable Output<String> endpoint,
        @Nullable Output<Integer> port,
        @Nullable Output<String> rdsResourceId,
        @Nullable Output<String> targetArn,
        @Nullable Output<String> targetGroupName,
        @Nullable Output<String> trackedClusterId,
        @Nullable Output<String> type) {
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        this.dbProxyName = dbProxyName;
        this.endpoint = endpoint;
        this.port = port;
        this.rdsResourceId = rdsResourceId;
        this.targetArn = targetArn;
        this.targetGroupName = targetGroupName;
        this.trackedClusterId = trackedClusterId;
        this.type = type;
    }

    private ProxyTargetState() {
        this.dbClusterIdentifier = Output.empty();
        this.dbInstanceIdentifier = Output.empty();
        this.dbProxyName = Output.empty();
        this.endpoint = Output.empty();
        this.port = Output.empty();
        this.rdsResourceId = Output.empty();
        this.targetArn = Output.empty();
        this.targetGroupName = Output.empty();
        this.trackedClusterId = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dbClusterIdentifier;
        private @Nullable Output<String> dbInstanceIdentifier;
        private @Nullable Output<String> dbProxyName;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> rdsResourceId;
        private @Nullable Output<String> targetArn;
        private @Nullable Output<String> targetGroupName;
        private @Nullable Output<String> trackedClusterId;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyTargetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.dbProxyName = defaults.dbProxyName;
    	      this.endpoint = defaults.endpoint;
    	      this.port = defaults.port;
    	      this.rdsResourceId = defaults.rdsResourceId;
    	      this.targetArn = defaults.targetArn;
    	      this.targetGroupName = defaults.targetGroupName;
    	      this.trackedClusterId = defaults.trackedClusterId;
    	      this.type = defaults.type;
        }

        public Builder dbClusterIdentifier(@Nullable Output<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        public Builder dbClusterIdentifier(@Nullable String dbClusterIdentifier) {
            this.dbClusterIdentifier = Output.ofNullable(dbClusterIdentifier);
            return this;
        }

        public Builder dbInstanceIdentifier(@Nullable Output<String> dbInstanceIdentifier) {
            this.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        public Builder dbInstanceIdentifier(@Nullable String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = Output.ofNullable(dbInstanceIdentifier);
            return this;
        }

        public Builder dbProxyName(@Nullable Output<String> dbProxyName) {
            this.dbProxyName = dbProxyName;
            return this;
        }

        public Builder dbProxyName(@Nullable String dbProxyName) {
            this.dbProxyName = Output.ofNullable(dbProxyName);
            return this;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder rdsResourceId(@Nullable Output<String> rdsResourceId) {
            this.rdsResourceId = rdsResourceId;
            return this;
        }

        public Builder rdsResourceId(@Nullable String rdsResourceId) {
            this.rdsResourceId = Output.ofNullable(rdsResourceId);
            return this;
        }

        public Builder targetArn(@Nullable Output<String> targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = Output.ofNullable(targetArn);
            return this;
        }

        public Builder targetGroupName(@Nullable Output<String> targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }

        public Builder targetGroupName(@Nullable String targetGroupName) {
            this.targetGroupName = Output.ofNullable(targetGroupName);
            return this;
        }

        public Builder trackedClusterId(@Nullable Output<String> trackedClusterId) {
            this.trackedClusterId = trackedClusterId;
            return this;
        }

        public Builder trackedClusterId(@Nullable String trackedClusterId) {
            this.trackedClusterId = Output.ofNullable(trackedClusterId);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public ProxyTargetState build() {
            return new ProxyTargetState(dbClusterIdentifier, dbInstanceIdentifier, dbProxyName, endpoint, port, rdsResourceId, targetArn, targetGroupName, trackedClusterId, type);
        }
    }
}
