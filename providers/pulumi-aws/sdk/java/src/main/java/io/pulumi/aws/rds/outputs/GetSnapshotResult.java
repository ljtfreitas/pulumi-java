// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSnapshotResult {
    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    private final Integer allocatedStorage;
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    private final String availabilityZone;
    private final @Nullable String dbInstanceIdentifier;
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    private final String dbSnapshotArn;
    private final @Nullable String dbSnapshotIdentifier;
    /**
     * Specifies whether the DB snapshot is encrypted.
     * 
     */
    private final Boolean encrypted;
    /**
     * Specifies the name of the database engine.
     * 
     */
    private final String engine;
    /**
     * Specifies the version of the database engine.
     * 
     */
    private final String engineVersion;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean includePublic;
    private final @Nullable Boolean includeShared;
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    private final Integer iops;
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    private final String kmsKeyId;
    /**
     * License model information for the restored DB instance.
     * 
     */
    private final String licenseModel;
    private final @Nullable Boolean mostRecent;
    /**
     * Provides the option group name for the DB snapshot.
     * 
     */
    private final String optionGroupName;
    private final Integer port;
    /**
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * 
     */
    private final String snapshotCreateTime;
    private final @Nullable String snapshotType;
    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    private final String sourceDbSnapshotIdentifier;
    /**
     * The region that the DB snapshot was created in or copied from.
     * 
     */
    private final String sourceRegion;
    /**
     * Specifies the status of this DB snapshot.
     * 
     */
    private final String status;
    /**
     * Specifies the storage type associated with DB snapshot.
     * 
     */
    private final String storageType;
    /**
     * Specifies the ID of the VPC associated with the DB snapshot.
     * 
     */
    private final String vpcId;

    @OutputCustomType.Constructor({"allocatedStorage","availabilityZone","dbInstanceIdentifier","dbSnapshotArn","dbSnapshotIdentifier","encrypted","engine","engineVersion","id","includePublic","includeShared","iops","kmsKeyId","licenseModel","mostRecent","optionGroupName","port","snapshotCreateTime","snapshotType","sourceDbSnapshotIdentifier","sourceRegion","status","storageType","vpcId"})
    private GetSnapshotResult(
        Integer allocatedStorage,
        String availabilityZone,
        @Nullable String dbInstanceIdentifier,
        String dbSnapshotArn,
        @Nullable String dbSnapshotIdentifier,
        Boolean encrypted,
        String engine,
        String engineVersion,
        String id,
        @Nullable Boolean includePublic,
        @Nullable Boolean includeShared,
        Integer iops,
        String kmsKeyId,
        String licenseModel,
        @Nullable Boolean mostRecent,
        String optionGroupName,
        Integer port,
        String snapshotCreateTime,
        @Nullable String snapshotType,
        String sourceDbSnapshotIdentifier,
        String sourceRegion,
        String status,
        String storageType,
        String vpcId) {
        this.allocatedStorage = Objects.requireNonNull(allocatedStorage);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        this.dbSnapshotArn = Objects.requireNonNull(dbSnapshotArn);
        this.dbSnapshotIdentifier = dbSnapshotIdentifier;
        this.encrypted = Objects.requireNonNull(encrypted);
        this.engine = Objects.requireNonNull(engine);
        this.engineVersion = Objects.requireNonNull(engineVersion);
        this.id = Objects.requireNonNull(id);
        this.includePublic = includePublic;
        this.includeShared = includeShared;
        this.iops = Objects.requireNonNull(iops);
        this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
        this.licenseModel = Objects.requireNonNull(licenseModel);
        this.mostRecent = mostRecent;
        this.optionGroupName = Objects.requireNonNull(optionGroupName);
        this.port = Objects.requireNonNull(port);
        this.snapshotCreateTime = Objects.requireNonNull(snapshotCreateTime);
        this.snapshotType = snapshotType;
        this.sourceDbSnapshotIdentifier = Objects.requireNonNull(sourceDbSnapshotIdentifier);
        this.sourceRegion = Objects.requireNonNull(sourceRegion);
        this.status = Objects.requireNonNull(status);
        this.storageType = Objects.requireNonNull(storageType);
        this.vpcId = Objects.requireNonNull(vpcId);
    }

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    public Optional<String> getDbInstanceIdentifier() {
        return Optional.ofNullable(this.dbInstanceIdentifier);
    }
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    public String getDbSnapshotArn() {
        return this.dbSnapshotArn;
    }
    public Optional<String> getDbSnapshotIdentifier() {
        return Optional.ofNullable(this.dbSnapshotIdentifier);
    }
    /**
     * Specifies whether the DB snapshot is encrypted.
     * 
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }
    /**
     * Specifies the name of the database engine.
     * 
     */
    public String getEngine() {
        return this.engine;
    }
    /**
     * Specifies the version of the database engine.
     * 
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public Optional<Boolean> getIncludePublic() {
        return Optional.ofNullable(this.includePublic);
    }
    public Optional<Boolean> getIncludeShared() {
        return Optional.ofNullable(this.includeShared);
    }
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    public Integer getIops() {
        return this.iops;
    }
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * License model information for the restored DB instance.
     * 
     */
    public String getLicenseModel() {
        return this.licenseModel;
    }
    public Optional<Boolean> getMostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * Provides the option group name for the DB snapshot.
     * 
     */
    public String getOptionGroupName() {
        return this.optionGroupName;
    }
    public Integer getPort() {
        return this.port;
    }
    /**
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * 
     */
    public String getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }
    public Optional<String> getSnapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }
    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    public String getSourceDbSnapshotIdentifier() {
        return this.sourceDbSnapshotIdentifier;
    }
    /**
     * The region that the DB snapshot was created in or copied from.
     * 
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }
    /**
     * Specifies the status of this DB snapshot.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Specifies the storage type associated with DB snapshot.
     * 
     */
    public String getStorageType() {
        return this.storageType;
    }
    /**
     * Specifies the ID of the VPC associated with the DB snapshot.
     * 
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer allocatedStorage;
        private String availabilityZone;
        private @Nullable String dbInstanceIdentifier;
        private String dbSnapshotArn;
        private @Nullable String dbSnapshotIdentifier;
        private Boolean encrypted;
        private String engine;
        private String engineVersion;
        private String id;
        private @Nullable Boolean includePublic;
        private @Nullable Boolean includeShared;
        private Integer iops;
        private String kmsKeyId;
        private String licenseModel;
        private @Nullable Boolean mostRecent;
        private String optionGroupName;
        private Integer port;
        private String snapshotCreateTime;
        private @Nullable String snapshotType;
        private String sourceDbSnapshotIdentifier;
        private String sourceRegion;
        private String status;
        private String storageType;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedStorage = defaults.allocatedStorage;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.dbSnapshotArn = defaults.dbSnapshotArn;
    	      this.dbSnapshotIdentifier = defaults.dbSnapshotIdentifier;
    	      this.encrypted = defaults.encrypted;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.includePublic = defaults.includePublic;
    	      this.includeShared = defaults.includeShared;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.licenseModel = defaults.licenseModel;
    	      this.mostRecent = defaults.mostRecent;
    	      this.optionGroupName = defaults.optionGroupName;
    	      this.port = defaults.port;
    	      this.snapshotCreateTime = defaults.snapshotCreateTime;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDbSnapshotIdentifier = defaults.sourceDbSnapshotIdentifier;
    	      this.sourceRegion = defaults.sourceRegion;
    	      this.status = defaults.status;
    	      this.storageType = defaults.storageType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAllocatedStorage(Integer allocatedStorage) {
            this.allocatedStorage = Objects.requireNonNull(allocatedStorage);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setDbInstanceIdentifier(@Nullable String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        public Builder setDbSnapshotArn(String dbSnapshotArn) {
            this.dbSnapshotArn = Objects.requireNonNull(dbSnapshotArn);
            return this;
        }

        public Builder setDbSnapshotIdentifier(@Nullable String dbSnapshotIdentifier) {
            this.dbSnapshotIdentifier = dbSnapshotIdentifier;
            return this;
        }

        public Builder setEncrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }

        public Builder setEngineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIncludePublic(@Nullable Boolean includePublic) {
            this.includePublic = includePublic;
            return this;
        }

        public Builder setIncludeShared(@Nullable Boolean includeShared) {
            this.includeShared = includeShared;
            return this;
        }

        public Builder setIops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }

        public Builder setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }

        public Builder setLicenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }

        public Builder setMostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        public Builder setOptionGroupName(String optionGroupName) {
            this.optionGroupName = Objects.requireNonNull(optionGroupName);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setSnapshotCreateTime(String snapshotCreateTime) {
            this.snapshotCreateTime = Objects.requireNonNull(snapshotCreateTime);
            return this;
        }

        public Builder setSnapshotType(@Nullable String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }

        public Builder setSourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
            this.sourceDbSnapshotIdentifier = Objects.requireNonNull(sourceDbSnapshotIdentifier);
            return this;
        }

        public Builder setSourceRegion(String sourceRegion) {
            this.sourceRegion = Objects.requireNonNull(sourceRegion);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStorageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetSnapshotResult build() {
            return new GetSnapshotResult(allocatedStorage, availabilityZone, dbInstanceIdentifier, dbSnapshotArn, dbSnapshotIdentifier, encrypted, engine, engineVersion, id, includePublic, includeShared, iops, kmsKeyId, licenseModel, mostRecent, optionGroupName, port, snapshotCreateTime, snapshotType, sourceDbSnapshotIdentifier, sourceRegion, status, storageType, vpcId);
        }
    }
}
