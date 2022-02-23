// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackupFileInfoResponse {
    /**
     * Sequence number of the backup file in the backup set
     * 
     */
    private final @Nullable Integer familySequenceNumber;
    /**
     * Location of the backup file in shared folder
     * 
     */
    private final @Nullable String fileLocation;
    /**
     * Status of the backup file during migration
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"familySequenceNumber","fileLocation","status"})
    private BackupFileInfoResponse(
        @Nullable Integer familySequenceNumber,
        @Nullable String fileLocation,
        @Nullable String status) {
        this.familySequenceNumber = familySequenceNumber;
        this.fileLocation = fileLocation;
        this.status = status;
    }

    /**
     * Sequence number of the backup file in the backup set
     * 
     */
    public Optional<Integer> getFamilySequenceNumber() {
        return Optional.ofNullable(this.familySequenceNumber);
    }
    /**
     * Location of the backup file in shared folder
     * 
     */
    public Optional<String> getFileLocation() {
        return Optional.ofNullable(this.fileLocation);
    }
    /**
     * Status of the backup file during migration
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupFileInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer familySequenceNumber;
        private @Nullable String fileLocation;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupFileInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.familySequenceNumber = defaults.familySequenceNumber;
    	      this.fileLocation = defaults.fileLocation;
    	      this.status = defaults.status;
        }

        public Builder setFamilySequenceNumber(@Nullable Integer familySequenceNumber) {
            this.familySequenceNumber = familySequenceNumber;
            return this;
        }

        public Builder setFileLocation(@Nullable String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public BackupFileInfoResponse build() {
            return new BackupFileInfoResponse(familySequenceNumber, fileLocation, status);
        }
    }
}
