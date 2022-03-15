// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.BackupInfoResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RestoreInfoResponse {
    /**
     * Information about the backup used to restore the table. The backup may no longer exist.
     * 
     */
    private final BackupInfoResponse backupInfo;
    /**
     * The type of the restore source.
     * 
     */
    private final String sourceType;

    @CustomType.Constructor
    private RestoreInfoResponse(
        @CustomType.Parameter("backupInfo") BackupInfoResponse backupInfo,
        @CustomType.Parameter("sourceType") String sourceType) {
        this.backupInfo = backupInfo;
        this.sourceType = sourceType;
    }

    /**
     * Information about the backup used to restore the table. The backup may no longer exist.
     * 
    */
    public BackupInfoResponse getBackupInfo() {
        return this.backupInfo;
    }
    /**
     * The type of the restore source.
     * 
    */
    public String getSourceType() {
        return this.sourceType;
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
