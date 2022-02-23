// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.DatabaseBackupSettingResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backup description.
 * 
 */
public final class BackupItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackupItemResponse Empty = new BackupItemResponse();

    /**
     * Id of the backup.
     * 
     */
    @InputImport(name="backupId", required=true)
        private final Integer backupId;

    public Integer getBackupId() {
        return this.backupId;
    }

    /**
     * Name of the blob which contains data for this backup.
     * 
     */
    @InputImport(name="blobName", required=true)
        private final String blobName;

    public String getBlobName() {
        return this.blobName;
    }

    /**
     * Unique correlation identifier. Please use this along with the timestamp while communicating with Azure support.
     * 
     */
    @InputImport(name="correlationId", required=true)
        private final String correlationId;

    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Timestamp of the backup creation.
     * 
     */
    @InputImport(name="created", required=true)
        private final String created;

    public String getCreated() {
        return this.created;
    }

    /**
     * List of databases included in the backup.
     * 
     */
    @InputImport(name="databases", required=true)
        private final List<DatabaseBackupSettingResponse> databases;

    public List<DatabaseBackupSettingResponse> getDatabases() {
        return this.databases;
    }

    /**
     * Timestamp when this backup finished.
     * 
     */
    @InputImport(name="finishedTimeStamp", required=true)
        private final String finishedTimeStamp;

    public String getFinishedTimeStamp() {
        return this.finishedTimeStamp;
    }

    /**
     * Resource Id.
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
        private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * Timestamp of a last restore operation which used this backup.
     * 
     */
    @InputImport(name="lastRestoreTimeStamp", required=true)
        private final String lastRestoreTimeStamp;

    public String getLastRestoreTimeStamp() {
        return this.lastRestoreTimeStamp;
    }

    /**
     * Details regarding this backup. Might contain an error message.
     * 
     */
    @InputImport(name="log", required=true)
        private final String log;

    public String getLog() {
        return this.log;
    }

    /**
     * Resource Name.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * True if this backup has been created due to a schedule being triggered.
     * 
     */
    @InputImport(name="scheduled", required=true)
        private final Boolean scheduled;

    public Boolean getScheduled() {
        return this.scheduled;
    }

    /**
     * Size of the backup in bytes.
     * 
     */
    @InputImport(name="sizeInBytes", required=true)
        private final Double sizeInBytes;

    public Double getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Backup status.
     * 
     */
    @InputImport(name="status", required=true)
        private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * SAS URL for the storage account container which contains this backup.
     * 
     */
    @InputImport(name="storageAccountUrl", required=true)
        private final String storageAccountUrl;

    public String getStorageAccountUrl() {
        return this.storageAccountUrl;
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Size of the original web app which has been backed up.
     * 
     */
    @InputImport(name="websiteSizeInBytes", required=true)
        private final Double websiteSizeInBytes;

    public Double getWebsiteSizeInBytes() {
        return this.websiteSizeInBytes;
    }

    public BackupItemResponse(
        Integer backupId,
        String blobName,
        String correlationId,
        String created,
        List<DatabaseBackupSettingResponse> databases,
        String finishedTimeStamp,
        String id,
        @Nullable String kind,
        String lastRestoreTimeStamp,
        String log,
        String name,
        Boolean scheduled,
        Double sizeInBytes,
        String status,
        String storageAccountUrl,
        String type,
        Double websiteSizeInBytes) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.blobName = Objects.requireNonNull(blobName, "expected parameter 'blobName' to be non-null");
        this.correlationId = Objects.requireNonNull(correlationId, "expected parameter 'correlationId' to be non-null");
        this.created = Objects.requireNonNull(created, "expected parameter 'created' to be non-null");
        this.databases = Objects.requireNonNull(databases, "expected parameter 'databases' to be non-null");
        this.finishedTimeStamp = Objects.requireNonNull(finishedTimeStamp, "expected parameter 'finishedTimeStamp' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.kind = kind;
        this.lastRestoreTimeStamp = Objects.requireNonNull(lastRestoreTimeStamp, "expected parameter 'lastRestoreTimeStamp' to be non-null");
        this.log = Objects.requireNonNull(log, "expected parameter 'log' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scheduled = Objects.requireNonNull(scheduled, "expected parameter 'scheduled' to be non-null");
        this.sizeInBytes = Objects.requireNonNull(sizeInBytes, "expected parameter 'sizeInBytes' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.websiteSizeInBytes = Objects.requireNonNull(websiteSizeInBytes, "expected parameter 'websiteSizeInBytes' to be non-null");
    }

    private BackupItemResponse() {
        this.backupId = null;
        this.blobName = null;
        this.correlationId = null;
        this.created = null;
        this.databases = List.of();
        this.finishedTimeStamp = null;
        this.id = null;
        this.kind = null;
        this.lastRestoreTimeStamp = null;
        this.log = null;
        this.name = null;
        this.scheduled = null;
        this.sizeInBytes = null;
        this.status = null;
        this.storageAccountUrl = null;
        this.type = null;
        this.websiteSizeInBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backupId;
        private String blobName;
        private String correlationId;
        private String created;
        private List<DatabaseBackupSettingResponse> databases;
        private String finishedTimeStamp;
        private String id;
        private @Nullable String kind;
        private String lastRestoreTimeStamp;
        private String log;
        private String name;
        private Boolean scheduled;
        private Double sizeInBytes;
        private String status;
        private String storageAccountUrl;
        private String type;
        private Double websiteSizeInBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.blobName = defaults.blobName;
    	      this.correlationId = defaults.correlationId;
    	      this.created = defaults.created;
    	      this.databases = defaults.databases;
    	      this.finishedTimeStamp = defaults.finishedTimeStamp;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastRestoreTimeStamp = defaults.lastRestoreTimeStamp;
    	      this.log = defaults.log;
    	      this.name = defaults.name;
    	      this.scheduled = defaults.scheduled;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.status = defaults.status;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
    	      this.type = defaults.type;
    	      this.websiteSizeInBytes = defaults.websiteSizeInBytes;
        }

        public Builder setBackupId(Integer backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }

        public Builder setBlobName(String blobName) {
            this.blobName = Objects.requireNonNull(blobName);
            return this;
        }

        public Builder setCorrelationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDatabases(List<DatabaseBackupSettingResponse> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }

        public Builder setFinishedTimeStamp(String finishedTimeStamp) {
            this.finishedTimeStamp = Objects.requireNonNull(finishedTimeStamp);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLastRestoreTimeStamp(String lastRestoreTimeStamp) {
            this.lastRestoreTimeStamp = Objects.requireNonNull(lastRestoreTimeStamp);
            return this;
        }

        public Builder setLog(String log) {
            this.log = Objects.requireNonNull(log);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScheduled(Boolean scheduled) {
            this.scheduled = Objects.requireNonNull(scheduled);
            return this;
        }

        public Builder setSizeInBytes(Double sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStorageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWebsiteSizeInBytes(Double websiteSizeInBytes) {
            this.websiteSizeInBytes = Objects.requireNonNull(websiteSizeInBytes);
            return this;
        }
        public BackupItemResponse build() {
            return new BackupItemResponse(backupId, blobName, correlationId, created, databases, finishedTimeStamp, id, kind, lastRestoreTimeStamp, log, name, scheduled, sizeInBytes, status, storageAccountUrl, type, websiteSizeInBytes);
        }
    }
}
