// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransferAllDetailsResponse {
    /**
     * Type of the account of data
     * 
     */
    private final String dataAccountType;
    /**
     * To indicate if all Azure blobs have to be transferred
     * 
     */
    private final @Nullable Boolean transferAllBlobs;
    /**
     * To indicate if all Azure Files have to be transferred
     * 
     */
    private final @Nullable Boolean transferAllFiles;

    @OutputCustomType.Constructor({"dataAccountType","transferAllBlobs","transferAllFiles"})
    private TransferAllDetailsResponse(
        String dataAccountType,
        @Nullable Boolean transferAllBlobs,
        @Nullable Boolean transferAllFiles) {
        this.dataAccountType = Objects.requireNonNull(dataAccountType);
        this.transferAllBlobs = transferAllBlobs;
        this.transferAllFiles = transferAllFiles;
    }

    /**
     * Type of the account of data
     * 
     */
    public String getDataAccountType() {
        return this.dataAccountType;
    }
    /**
     * To indicate if all Azure blobs have to be transferred
     * 
     */
    public Optional<Boolean> getTransferAllBlobs() {
        return Optional.ofNullable(this.transferAllBlobs);
    }
    /**
     * To indicate if all Azure Files have to be transferred
     * 
     */
    public Optional<Boolean> getTransferAllFiles() {
        return Optional.ofNullable(this.transferAllFiles);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferAllDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataAccountType;
        private @Nullable Boolean transferAllBlobs;
        private @Nullable Boolean transferAllFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferAllDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.transferAllBlobs = defaults.transferAllBlobs;
    	      this.transferAllFiles = defaults.transferAllFiles;
        }

        public Builder setDataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setTransferAllBlobs(@Nullable Boolean transferAllBlobs) {
            this.transferAllBlobs = transferAllBlobs;
            return this;
        }

        public Builder setTransferAllFiles(@Nullable Boolean transferAllFiles) {
            this.transferAllFiles = transferAllFiles;
            return this;
        }

        public TransferAllDetailsResponse build() {
            return new TransferAllDetailsResponse(dataAccountType, transferAllBlobs, transferAllFiles);
        }
    }
}
