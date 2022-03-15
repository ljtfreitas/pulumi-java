// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about a backup.
 * 
 */
public final class BackupInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackupInfoResponse Empty = new BackupInfoResponse();

    /**
     * Name of the backup.
     * 
     */
    @Import(name="backup", required=true)
      private final String backup;

    public String getBackup() {
        return this.backup;
    }

    /**
     * This time that the backup was finished. Row data in the backup will be no newer than this timestamp.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * Name of the table the backup was created from.
     * 
     */
    @Import(name="sourceTable", required=true)
      private final String sourceTable;

    public String getSourceTable() {
        return this.sourceTable;
    }

    /**
     * The time that the backup was started. Row data in the backup will be no older than this timestamp.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public BackupInfoResponse(
        String backup,
        String endTime,
        String sourceTable,
        String startTime) {
        this.backup = Objects.requireNonNull(backup, "expected parameter 'backup' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.sourceTable = Objects.requireNonNull(sourceTable, "expected parameter 'sourceTable' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private BackupInfoResponse() {
        this.backup = null;
        this.endTime = null;
        this.sourceTable = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backup;
        private String endTime;
        private String sourceTable;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.endTime = defaults.endTime;
    	      this.sourceTable = defaults.sourceTable;
    	      this.startTime = defaults.startTime;
        }

        public Builder backup(String backup) {
            this.backup = Objects.requireNonNull(backup);
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder sourceTable(String sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public BackupInfoResponse build() {
            return new BackupInfoResponse(backup, endTime, sourceTable, startTime);
        }
    }
}
