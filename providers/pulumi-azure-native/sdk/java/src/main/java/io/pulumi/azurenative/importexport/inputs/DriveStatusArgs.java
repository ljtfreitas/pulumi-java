// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.azurenative.importexport.enums.DriveState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides information about the drive's status
 * 
 */
public final class DriveStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DriveStatusArgs Empty = new DriveStatusArgs();

    /**
     * The BitLocker key used to encrypt the drive.
     * 
     */
    @InputImport(name="bitLockerKey")
    private final @Nullable Input<String> bitLockerKey;

    public Input<String> getBitLockerKey() {
        return this.bitLockerKey == null ? Input.empty() : this.bitLockerKey;
    }

    /**
     * Bytes successfully transferred for the drive.
     * 
     */
    @InputImport(name="bytesSucceeded")
    private final @Nullable Input<Double> bytesSucceeded;

    public Input<Double> getBytesSucceeded() {
        return this.bytesSucceeded == null ? Input.empty() : this.bytesSucceeded;
    }

    /**
     * Detailed status about the data transfer process. This field is not returned in the response until the drive is in the Transferring state.
     * 
     */
    @InputImport(name="copyStatus")
    private final @Nullable Input<String> copyStatus;

    public Input<String> getCopyStatus() {
        return this.copyStatus == null ? Input.empty() : this.copyStatus;
    }

    /**
     * The drive header hash value.
     * 
     */
    @InputImport(name="driveHeaderHash")
    private final @Nullable Input<String> driveHeaderHash;

    public Input<String> getDriveHeaderHash() {
        return this.driveHeaderHash == null ? Input.empty() : this.driveHeaderHash;
    }

    /**
     * The drive's hardware serial number, without spaces.
     * 
     */
    @InputImport(name="driveId")
    private final @Nullable Input<String> driveId;

    public Input<String> getDriveId() {
        return this.driveId == null ? Input.empty() : this.driveId;
    }

    /**
     * A URI that points to the blob containing the error log for the data transfer operation.
     * 
     */
    @InputImport(name="errorLogUri")
    private final @Nullable Input<String> errorLogUri;

    public Input<String> getErrorLogUri() {
        return this.errorLogUri == null ? Input.empty() : this.errorLogUri;
    }

    /**
     * The relative path of the manifest file on the drive.
     * 
     */
    @InputImport(name="manifestFile")
    private final @Nullable Input<String> manifestFile;

    public Input<String> getManifestFile() {
        return this.manifestFile == null ? Input.empty() : this.manifestFile;
    }

    /**
     * The Base16-encoded MD5 hash of the manifest file on the drive.
     * 
     */
    @InputImport(name="manifestHash")
    private final @Nullable Input<String> manifestHash;

    public Input<String> getManifestHash() {
        return this.manifestHash == null ? Input.empty() : this.manifestHash;
    }

    /**
     * A URI that points to the blob containing the drive manifest file.
     * 
     */
    @InputImport(name="manifestUri")
    private final @Nullable Input<String> manifestUri;

    public Input<String> getManifestUri() {
        return this.manifestUri == null ? Input.empty() : this.manifestUri;
    }

    /**
     * Percentage completed for the drive.
     * 
     */
    @InputImport(name="percentComplete")
    private final @Nullable Input<Integer> percentComplete;

    public Input<Integer> getPercentComplete() {
        return this.percentComplete == null ? Input.empty() : this.percentComplete;
    }

    /**
     * The drive's current state.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<Either<String,DriveState>> state;

    public Input<Either<String,DriveState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * A URI that points to the blob containing the verbose log for the data transfer operation.
     * 
     */
    @InputImport(name="verboseLogUri")
    private final @Nullable Input<String> verboseLogUri;

    public Input<String> getVerboseLogUri() {
        return this.verboseLogUri == null ? Input.empty() : this.verboseLogUri;
    }

    public DriveStatusArgs(
        @Nullable Input<String> bitLockerKey,
        @Nullable Input<Double> bytesSucceeded,
        @Nullable Input<String> copyStatus,
        @Nullable Input<String> driveHeaderHash,
        @Nullable Input<String> driveId,
        @Nullable Input<String> errorLogUri,
        @Nullable Input<String> manifestFile,
        @Nullable Input<String> manifestHash,
        @Nullable Input<String> manifestUri,
        @Nullable Input<Integer> percentComplete,
        @Nullable Input<Either<String,DriveState>> state,
        @Nullable Input<String> verboseLogUri) {
        this.bitLockerKey = bitLockerKey;
        this.bytesSucceeded = bytesSucceeded;
        this.copyStatus = copyStatus;
        this.driveHeaderHash = driveHeaderHash;
        this.driveId = driveId;
        this.errorLogUri = errorLogUri;
        this.manifestFile = manifestFile;
        this.manifestHash = manifestHash;
        this.manifestUri = manifestUri;
        this.percentComplete = percentComplete;
        this.state = state == null ? Input.ofLeft("Specified") : state;
        this.verboseLogUri = verboseLogUri;
    }

    private DriveStatusArgs() {
        this.bitLockerKey = Input.empty();
        this.bytesSucceeded = Input.empty();
        this.copyStatus = Input.empty();
        this.driveHeaderHash = Input.empty();
        this.driveId = Input.empty();
        this.errorLogUri = Input.empty();
        this.manifestFile = Input.empty();
        this.manifestHash = Input.empty();
        this.manifestUri = Input.empty();
        this.percentComplete = Input.empty();
        this.state = Input.empty();
        this.verboseLogUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DriveStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bitLockerKey;
        private @Nullable Input<Double> bytesSucceeded;
        private @Nullable Input<String> copyStatus;
        private @Nullable Input<String> driveHeaderHash;
        private @Nullable Input<String> driveId;
        private @Nullable Input<String> errorLogUri;
        private @Nullable Input<String> manifestFile;
        private @Nullable Input<String> manifestHash;
        private @Nullable Input<String> manifestUri;
        private @Nullable Input<Integer> percentComplete;
        private @Nullable Input<Either<String,DriveState>> state;
        private @Nullable Input<String> verboseLogUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DriveStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitLockerKey = defaults.bitLockerKey;
    	      this.bytesSucceeded = defaults.bytesSucceeded;
    	      this.copyStatus = defaults.copyStatus;
    	      this.driveHeaderHash = defaults.driveHeaderHash;
    	      this.driveId = defaults.driveId;
    	      this.errorLogUri = defaults.errorLogUri;
    	      this.manifestFile = defaults.manifestFile;
    	      this.manifestHash = defaults.manifestHash;
    	      this.manifestUri = defaults.manifestUri;
    	      this.percentComplete = defaults.percentComplete;
    	      this.state = defaults.state;
    	      this.verboseLogUri = defaults.verboseLogUri;
        }

        public Builder setBitLockerKey(@Nullable Input<String> bitLockerKey) {
            this.bitLockerKey = bitLockerKey;
            return this;
        }

        public Builder setBitLockerKey(@Nullable String bitLockerKey) {
            this.bitLockerKey = Input.ofNullable(bitLockerKey);
            return this;
        }

        public Builder setBytesSucceeded(@Nullable Input<Double> bytesSucceeded) {
            this.bytesSucceeded = bytesSucceeded;
            return this;
        }

        public Builder setBytesSucceeded(@Nullable Double bytesSucceeded) {
            this.bytesSucceeded = Input.ofNullable(bytesSucceeded);
            return this;
        }

        public Builder setCopyStatus(@Nullable Input<String> copyStatus) {
            this.copyStatus = copyStatus;
            return this;
        }

        public Builder setCopyStatus(@Nullable String copyStatus) {
            this.copyStatus = Input.ofNullable(copyStatus);
            return this;
        }

        public Builder setDriveHeaderHash(@Nullable Input<String> driveHeaderHash) {
            this.driveHeaderHash = driveHeaderHash;
            return this;
        }

        public Builder setDriveHeaderHash(@Nullable String driveHeaderHash) {
            this.driveHeaderHash = Input.ofNullable(driveHeaderHash);
            return this;
        }

        public Builder setDriveId(@Nullable Input<String> driveId) {
            this.driveId = driveId;
            return this;
        }

        public Builder setDriveId(@Nullable String driveId) {
            this.driveId = Input.ofNullable(driveId);
            return this;
        }

        public Builder setErrorLogUri(@Nullable Input<String> errorLogUri) {
            this.errorLogUri = errorLogUri;
            return this;
        }

        public Builder setErrorLogUri(@Nullable String errorLogUri) {
            this.errorLogUri = Input.ofNullable(errorLogUri);
            return this;
        }

        public Builder setManifestFile(@Nullable Input<String> manifestFile) {
            this.manifestFile = manifestFile;
            return this;
        }

        public Builder setManifestFile(@Nullable String manifestFile) {
            this.manifestFile = Input.ofNullable(manifestFile);
            return this;
        }

        public Builder setManifestHash(@Nullable Input<String> manifestHash) {
            this.manifestHash = manifestHash;
            return this;
        }

        public Builder setManifestHash(@Nullable String manifestHash) {
            this.manifestHash = Input.ofNullable(manifestHash);
            return this;
        }

        public Builder setManifestUri(@Nullable Input<String> manifestUri) {
            this.manifestUri = manifestUri;
            return this;
        }

        public Builder setManifestUri(@Nullable String manifestUri) {
            this.manifestUri = Input.ofNullable(manifestUri);
            return this;
        }

        public Builder setPercentComplete(@Nullable Input<Integer> percentComplete) {
            this.percentComplete = percentComplete;
            return this;
        }

        public Builder setPercentComplete(@Nullable Integer percentComplete) {
            this.percentComplete = Input.ofNullable(percentComplete);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,DriveState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,DriveState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setVerboseLogUri(@Nullable Input<String> verboseLogUri) {
            this.verboseLogUri = verboseLogUri;
            return this;
        }

        public Builder setVerboseLogUri(@Nullable String verboseLogUri) {
            this.verboseLogUri = Input.ofNullable(verboseLogUri);
            return this;
        }

        public DriveStatusArgs build() {
            return new DriveStatusArgs(bitLockerKey, bytesSucceeded, copyStatus, driveHeaderHash, driveId, errorLogUri, manifestFile, manifestHash, manifestUri, percentComplete, state, verboseLogUri);
        }
    }
}
