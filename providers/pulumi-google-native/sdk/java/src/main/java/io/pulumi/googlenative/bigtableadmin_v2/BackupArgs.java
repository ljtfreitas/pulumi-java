// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    @InputImport(name="backupId", required=true)
      private final Input<String> backupId;

    public Input<String> getBackupId() {
        return this.backupId;
    }

    @InputImport(name="clusterId", required=true)
      private final Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId;
    }

    /**
     * The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 30 days from the time the request is received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
     * 
     */
    @InputImport(name="expireTime", required=true)
      private final Input<String> expireTime;

    public Input<String> getExpireTime() {
        return this.expireTime;
    }

    @InputImport(name="instanceId", required=true)
      private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * A globally unique identifier for the backup which cannot be changed. Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The final segment of the name must be between 1 and 50 characters in length. The backup is stored in the cluster identified by the prefix of the backup name of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Immutable. Name of the table from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects/{project}/instances/{instance}/tables/{source_table}`.
     * 
     */
    @InputImport(name="sourceTable", required=true)
      private final Input<String> sourceTable;

    public Input<String> getSourceTable() {
        return this.sourceTable;
    }

    public BackupArgs(
        Input<String> backupId,
        Input<String> clusterId,
        Input<String> expireTime,
        Input<String> instanceId,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> sourceTable) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.expireTime = Objects.requireNonNull(expireTime, "expected parameter 'expireTime' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.project = project;
        this.sourceTable = Objects.requireNonNull(sourceTable, "expected parameter 'sourceTable' to be non-null");
    }

    private BackupArgs() {
        this.backupId = Input.empty();
        this.clusterId = Input.empty();
        this.expireTime = Input.empty();
        this.instanceId = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.sourceTable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupId;
        private Input<String> clusterId;
        private Input<String> expireTime;
        private Input<String> instanceId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> sourceTable;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.clusterId = defaults.clusterId;
    	      this.expireTime = defaults.expireTime;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.sourceTable = defaults.sourceTable;
        }

        public Builder setBackupId(Input<String> backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }

        public Builder setBackupId(String backupId) {
            this.backupId = Input.of(Objects.requireNonNull(backupId));
            return this;
        }

        public Builder setClusterId(Input<String> clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Input.of(Objects.requireNonNull(clusterId));
            return this;
        }

        public Builder setExpireTime(Input<String> expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Input.of(Objects.requireNonNull(expireTime));
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSourceTable(Input<String> sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }

        public Builder setSourceTable(String sourceTable) {
            this.sourceTable = Input.of(Objects.requireNonNull(sourceTable));
            return this;
        }
        public BackupArgs build() {
            return new BackupArgs(backupId, clusterId, expireTime, instanceId, name, project, sourceTable);
        }
    }
}
