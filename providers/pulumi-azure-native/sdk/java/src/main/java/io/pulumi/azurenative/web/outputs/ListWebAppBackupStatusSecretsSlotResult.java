// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.DatabaseBackupSettingResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWebAppBackupStatusSecretsSlotResult {
    /**
     * Id of the backup.
     * 
     */
    private final Integer backupId;
    /**
     * Name of the blob which contains data for this backup.
     * 
     */
    private final String blobName;
    /**
     * Unique correlation identifier. Please use this along with the timestamp while communicating with Azure support.
     * 
     */
    private final String correlationId;
    /**
     * Timestamp of the backup creation.
     * 
     */
    private final String created;
    /**
     * List of databases included in the backup.
     * 
     */
    private final List<DatabaseBackupSettingResponse> databases;
    /**
     * Timestamp when this backup finished.
     * 
     */
    private final String finishedTimeStamp;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Timestamp of a last restore operation which used this backup.
     * 
     */
    private final String lastRestoreTimeStamp;
    /**
     * Details regarding this backup. Might contain an error message.
     * 
     */
    private final String log;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * True if this backup has been created due to a schedule being triggered.
     * 
     */
    private final Boolean scheduled;
    /**
     * Size of the backup in bytes.
     * 
     */
    private final Double sizeInBytes;
    /**
     * Backup status.
     * 
     */
    private final String status;
    /**
     * SAS URL for the storage account container which contains this backup.
     * 
     */
    private final String storageAccountUrl;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Size of the original web app which has been backed up.
     * 
     */
    private final Double websiteSizeInBytes;

    @OutputCustomType.Constructor({"backupId","blobName","correlationId","created","databases","finishedTimeStamp","id","kind","lastRestoreTimeStamp","log","name","scheduled","sizeInBytes","status","storageAccountUrl","type","websiteSizeInBytes"})
    private ListWebAppBackupStatusSecretsSlotResult(
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
        this.backupId = Objects.requireNonNull(backupId);
        this.blobName = Objects.requireNonNull(blobName);
        this.correlationId = Objects.requireNonNull(correlationId);
        this.created = Objects.requireNonNull(created);
        this.databases = Objects.requireNonNull(databases);
        this.finishedTimeStamp = Objects.requireNonNull(finishedTimeStamp);
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.lastRestoreTimeStamp = Objects.requireNonNull(lastRestoreTimeStamp);
        this.log = Objects.requireNonNull(log);
        this.name = Objects.requireNonNull(name);
        this.scheduled = Objects.requireNonNull(scheduled);
        this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
        this.status = Objects.requireNonNull(status);
        this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
        this.type = Objects.requireNonNull(type);
        this.websiteSizeInBytes = Objects.requireNonNull(websiteSizeInBytes);
    }

    /**
     * Id of the backup.
     * 
     */
    public Integer getBackupId() {
        return this.backupId;
    }
    /**
     * Name of the blob which contains data for this backup.
     * 
     */
    public String getBlobName() {
        return this.blobName;
    }
    /**
     * Unique correlation identifier. Please use this along with the timestamp while communicating with Azure support.
     * 
     */
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Timestamp of the backup creation.
     * 
     */
    public String getCreated() {
        return this.created;
    }
    /**
     * List of databases included in the backup.
     * 
     */
    public List<DatabaseBackupSettingResponse> getDatabases() {
        return this.databases;
    }
    /**
     * Timestamp when this backup finished.
     * 
     */
    public String getFinishedTimeStamp() {
        return this.finishedTimeStamp;
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Timestamp of a last restore operation which used this backup.
     * 
     */
    public String getLastRestoreTimeStamp() {
        return this.lastRestoreTimeStamp;
    }
    /**
     * Details regarding this backup. Might contain an error message.
     * 
     */
    public String getLog() {
        return this.log;
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * True if this backup has been created due to a schedule being triggered.
     * 
     */
    public Boolean getScheduled() {
        return this.scheduled;
    }
    /**
     * Size of the backup in bytes.
     * 
     */
    public Double getSizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * Backup status.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * SAS URL for the storage account container which contains this backup.
     * 
     */
    public String getStorageAccountUrl() {
        return this.storageAccountUrl;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Size of the original web app which has been backed up.
     * 
     */
    public Double getWebsiteSizeInBytes() {
        return this.websiteSizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppBackupStatusSecretsSlotResult defaults) {
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

        public Builder(ListWebAppBackupStatusSecretsSlotResult defaults) {
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

        public ListWebAppBackupStatusSecretsSlotResult build() {
            return new ListWebAppBackupStatusSecretsSlotResult(backupId, blobName, correlationId, created, databases, finishedTimeStamp, id, kind, lastRestoreTimeStamp, log, name, scheduled, sizeInBytes, status, storageAccountUrl, type, websiteSizeInBytes);
        }
    }
}
