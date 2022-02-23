// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1.inputs.MySqlReplicaConfigurationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Read-replica configuration for connecting to the primary instance.
 * 
 */
public final class ReplicaConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicaConfigurationArgs Empty = new ReplicaConfigurationArgs();

    /**
     * Specifies if the replica is the failover target. If the field is set to `true`, the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
     * 
     */
    @InputImport(name="failoverTarget")
      private final @Nullable Input<Boolean> failoverTarget;

    public Input<Boolean> getFailoverTarget() {
        return this.failoverTarget == null ? Input.empty() : this.failoverTarget;
    }

    /**
     * This is always `sql#replicaConfiguration`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
     * 
     */
    @InputImport(name="mysqlReplicaConfiguration")
      private final @Nullable Input<MySqlReplicaConfigurationArgs> mysqlReplicaConfiguration;

    public Input<MySqlReplicaConfigurationArgs> getMysqlReplicaConfiguration() {
        return this.mysqlReplicaConfiguration == null ? Input.empty() : this.mysqlReplicaConfiguration;
    }

    public ReplicaConfigurationArgs(
        @Nullable Input<Boolean> failoverTarget,
        @Nullable Input<String> kind,
        @Nullable Input<MySqlReplicaConfigurationArgs> mysqlReplicaConfiguration) {
        this.failoverTarget = failoverTarget;
        this.kind = kind;
        this.mysqlReplicaConfiguration = mysqlReplicaConfiguration;
    }

    private ReplicaConfigurationArgs() {
        this.failoverTarget = Input.empty();
        this.kind = Input.empty();
        this.mysqlReplicaConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> failoverTarget;
        private @Nullable Input<String> kind;
        private @Nullable Input<MySqlReplicaConfigurationArgs> mysqlReplicaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverTarget = defaults.failoverTarget;
    	      this.kind = defaults.kind;
    	      this.mysqlReplicaConfiguration = defaults.mysqlReplicaConfiguration;
        }

        public Builder setFailoverTarget(@Nullable Input<Boolean> failoverTarget) {
            this.failoverTarget = failoverTarget;
            return this;
        }

        public Builder setFailoverTarget(@Nullable Boolean failoverTarget) {
            this.failoverTarget = Input.ofNullable(failoverTarget);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMysqlReplicaConfiguration(@Nullable Input<MySqlReplicaConfigurationArgs> mysqlReplicaConfiguration) {
            this.mysqlReplicaConfiguration = mysqlReplicaConfiguration;
            return this;
        }

        public Builder setMysqlReplicaConfiguration(@Nullable MySqlReplicaConfigurationArgs mysqlReplicaConfiguration) {
            this.mysqlReplicaConfiguration = Input.ofNullable(mysqlReplicaConfiguration);
            return this;
        }
        public ReplicaConfigurationArgs build() {
            return new ReplicaConfigurationArgs(failoverTarget, kind, mysqlReplicaConfiguration);
        }
    }
}
