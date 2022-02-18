// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details to transfer all data.
 * 
 */
public final class TransferAllDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransferAllDetailsResponse Empty = new TransferAllDetailsResponse();

    /**
     * Type of the account of data
     * 
     */
    @InputImport(name="dataAccountType", required=true)
    private final String dataAccountType;

    public String getDataAccountType() {
        return this.dataAccountType;
    }

    /**
     * To indicate if all Azure blobs have to be transferred
     * 
     */
    @InputImport(name="transferAllBlobs")
    private final @Nullable Boolean transferAllBlobs;

    public Optional<Boolean> getTransferAllBlobs() {
        return this.transferAllBlobs == null ? Optional.empty() : Optional.ofNullable(this.transferAllBlobs);
    }

    /**
     * To indicate if all Azure Files have to be transferred
     * 
     */
    @InputImport(name="transferAllFiles")
    private final @Nullable Boolean transferAllFiles;

    public Optional<Boolean> getTransferAllFiles() {
        return this.transferAllFiles == null ? Optional.empty() : Optional.ofNullable(this.transferAllFiles);
    }

    public TransferAllDetailsResponse(
        String dataAccountType,
        @Nullable Boolean transferAllBlobs,
        @Nullable Boolean transferAllFiles) {
        this.dataAccountType = dataAccountType == null ? "StorageAccount" : Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.transferAllBlobs = transferAllBlobs;
        this.transferAllFiles = transferAllFiles;
    }

    private TransferAllDetailsResponse() {
        this.dataAccountType = null;
        this.transferAllBlobs = null;
        this.transferAllFiles = null;
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
