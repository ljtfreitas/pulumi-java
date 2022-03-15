// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.spanner_v1.inputs.BackupInfoResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the database restore.
 * 
 */
public final class RestoreInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestoreInfoResponse Empty = new RestoreInfoResponse();

    /**
     * Information about the backup used to restore the database. The backup may no longer exist.
     * 
     */
    @Import(name="backupInfo", required=true)
      private final BackupInfoResponse backupInfo;

    public BackupInfoResponse getBackupInfo() {
        return this.backupInfo;
    }

    /**
     * The type of the restore source.
     * 
     */
    @Import(name="sourceType", required=true)
      private final String sourceType;

    public String getSourceType() {
        return this.sourceType;
    }

    public RestoreInfoResponse(
        BackupInfoResponse backupInfo,
        String sourceType) {
        this.backupInfo = Objects.requireNonNull(backupInfo, "expected parameter 'backupInfo' to be non-null");
        this.sourceType = Objects.requireNonNull(sourceType, "expected parameter 'sourceType' to be non-null");
    }

    private RestoreInfoResponse() {
        this.backupInfo = null;
        this.sourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestoreInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupInfoResponse backupInfo;
        private String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(RestoreInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupInfo = defaults.backupInfo;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder backupInfo(BackupInfoResponse backupInfo) {
            this.backupInfo = Objects.requireNonNull(backupInfo);
            return this;
        }

        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public RestoreInfoResponse build() {
            return new RestoreInfoResponse(backupInfo, sourceType);
        }
    }
}
