// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterSnapshotState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotState Empty = new ClusterSnapshotState();

    /**
     * List of EC2 Availability Zones that instances in the DocDB cluster snapshot can be restored in.
     * 
     */
    @InputImport(name="availabilityZones")
    private final @Nullable Input<List<String>> availabilityZones;

    public Input<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Input.empty() : this.availabilityZones;
    }

    /**
     * The DocDB Cluster Identifier from which to take the snapshot.
     * 
     */
    @InputImport(name="dbClusterIdentifier")
    private final @Nullable Input<String> dbClusterIdentifier;

    public Input<String> getDbClusterIdentifier() {
        return this.dbClusterIdentifier == null ? Input.empty() : this.dbClusterIdentifier;
    }

    /**
     * The Amazon Resource Name (ARN) for the DocDB Cluster Snapshot.
     * 
     */
    @InputImport(name="dbClusterSnapshotArn")
    private final @Nullable Input<String> dbClusterSnapshotArn;

    public Input<String> getDbClusterSnapshotArn() {
        return this.dbClusterSnapshotArn == null ? Input.empty() : this.dbClusterSnapshotArn;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @InputImport(name="dbClusterSnapshotIdentifier")
    private final @Nullable Input<String> dbClusterSnapshotIdentifier;

    public Input<String> getDbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier == null ? Input.empty() : this.dbClusterSnapshotIdentifier;
    }

    /**
     * Specifies the name of the database engine.
     * 
     */
    @InputImport(name="engine")
    private final @Nullable Input<String> engine;

    public Input<String> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    /**
     * Version of the database engine for this DocDB cluster snapshot.
     * 
     */
    @InputImport(name="engineVersion")
    private final @Nullable Input<String> engineVersion;

    public Input<String> getEngineVersion() {
        return this.engineVersion == null ? Input.empty() : this.engineVersion;
    }

    /**
     * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DocDB cluster snapshot.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Port that the DocDB cluster was listening on at the time of the snapshot.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="snapshotType")
    private final @Nullable Input<String> snapshotType;

    public Input<String> getSnapshotType() {
        return this.snapshotType == null ? Input.empty() : this.snapshotType;
    }

    @InputImport(name="sourceDbClusterSnapshotArn")
    private final @Nullable Input<String> sourceDbClusterSnapshotArn;

    public Input<String> getSourceDbClusterSnapshotArn() {
        return this.sourceDbClusterSnapshotArn == null ? Input.empty() : this.sourceDbClusterSnapshotArn;
    }

    /**
     * The status of this DocDB Cluster Snapshot.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Specifies whether the DocDB cluster snapshot is encrypted.
     * 
     */
    @InputImport(name="storageEncrypted")
    private final @Nullable Input<Boolean> storageEncrypted;

    public Input<Boolean> getStorageEncrypted() {
        return this.storageEncrypted == null ? Input.empty() : this.storageEncrypted;
    }

    /**
     * The VPC ID associated with the DocDB cluster snapshot.
     * 
     */
    @InputImport(name="vpcId")
    private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public ClusterSnapshotState(
        @Nullable Input<List<String>> availabilityZones,
        @Nullable Input<String> dbClusterIdentifier,
        @Nullable Input<String> dbClusterSnapshotArn,
        @Nullable Input<String> dbClusterSnapshotIdentifier,
        @Nullable Input<String> engine,
        @Nullable Input<String> engineVersion,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<Integer> port,
        @Nullable Input<String> snapshotType,
        @Nullable Input<String> sourceDbClusterSnapshotArn,
        @Nullable Input<String> status,
        @Nullable Input<Boolean> storageEncrypted,
        @Nullable Input<String> vpcId) {
        this.availabilityZones = availabilityZones;
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.dbClusterSnapshotArn = dbClusterSnapshotArn;
        this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.kmsKeyId = kmsKeyId;
        this.port = port;
        this.snapshotType = snapshotType;
        this.sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn;
        this.status = status;
        this.storageEncrypted = storageEncrypted;
        this.vpcId = vpcId;
    }

    private ClusterSnapshotState() {
        this.availabilityZones = Input.empty();
        this.dbClusterIdentifier = Input.empty();
        this.dbClusterSnapshotArn = Input.empty();
        this.dbClusterSnapshotIdentifier = Input.empty();
        this.engine = Input.empty();
        this.engineVersion = Input.empty();
        this.kmsKeyId = Input.empty();
        this.port = Input.empty();
        this.snapshotType = Input.empty();
        this.sourceDbClusterSnapshotArn = Input.empty();
        this.status = Input.empty();
        this.storageEncrypted = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> availabilityZones;
        private @Nullable Input<String> dbClusterIdentifier;
        private @Nullable Input<String> dbClusterSnapshotArn;
        private @Nullable Input<String> dbClusterSnapshotIdentifier;
        private @Nullable Input<String> engine;
        private @Nullable Input<String> engineVersion;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> snapshotType;
        private @Nullable Input<String> sourceDbClusterSnapshotArn;
        private @Nullable Input<String> status;
        private @Nullable Input<Boolean> storageEncrypted;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSnapshotState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbClusterSnapshotArn = defaults.dbClusterSnapshotArn;
    	      this.dbClusterSnapshotIdentifier = defaults.dbClusterSnapshotIdentifier;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.port = defaults.port;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDbClusterSnapshotArn = defaults.sourceDbClusterSnapshotArn;
    	      this.status = defaults.status;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAvailabilityZones(@Nullable Input<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder setAvailabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Input.ofNullable(availabilityZones);
            return this;
        }

        public Builder setDbClusterIdentifier(@Nullable Input<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        public Builder setDbClusterIdentifier(@Nullable String dbClusterIdentifier) {
            this.dbClusterIdentifier = Input.ofNullable(dbClusterIdentifier);
            return this;
        }

        public Builder setDbClusterSnapshotArn(@Nullable Input<String> dbClusterSnapshotArn) {
            this.dbClusterSnapshotArn = dbClusterSnapshotArn;
            return this;
        }

        public Builder setDbClusterSnapshotArn(@Nullable String dbClusterSnapshotArn) {
            this.dbClusterSnapshotArn = Input.ofNullable(dbClusterSnapshotArn);
            return this;
        }

        public Builder setDbClusterSnapshotIdentifier(@Nullable Input<String> dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            return this;
        }

        public Builder setDbClusterSnapshotIdentifier(@Nullable String dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = Input.ofNullable(dbClusterSnapshotIdentifier);
            return this;
        }

        public Builder setEngine(@Nullable Input<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngine(@Nullable String engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder setEngineVersion(@Nullable Input<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setEngineVersion(@Nullable String engineVersion) {
            this.engineVersion = Input.ofNullable(engineVersion);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setSnapshotType(@Nullable Input<String> snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }

        public Builder setSnapshotType(@Nullable String snapshotType) {
            this.snapshotType = Input.ofNullable(snapshotType);
            return this;
        }

        public Builder setSourceDbClusterSnapshotArn(@Nullable Input<String> sourceDbClusterSnapshotArn) {
            this.sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn;
            return this;
        }

        public Builder setSourceDbClusterSnapshotArn(@Nullable String sourceDbClusterSnapshotArn) {
            this.sourceDbClusterSnapshotArn = Input.ofNullable(sourceDbClusterSnapshotArn);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setStorageEncrypted(@Nullable Input<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }

        public Builder setStorageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Input.ofNullable(storageEncrypted);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public ClusterSnapshotState build() {
            return new ClusterSnapshotState(availabilityZones, dbClusterIdentifier, dbClusterSnapshotArn, dbClusterSnapshotIdentifier, engine, engineVersion, kmsKeyId, port, snapshotType, sourceDbClusterSnapshotArn, status, storageEncrypted, vpcId);
        }
    }
}
