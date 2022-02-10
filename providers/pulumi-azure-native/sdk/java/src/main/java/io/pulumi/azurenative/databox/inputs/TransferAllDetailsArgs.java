// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.enums.DataAccountType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferAllDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferAllDetailsArgs Empty = new TransferAllDetailsArgs();

    @InputImport(name="dataAccountType", required=true)
    private final Input<Either<String,DataAccountType>> dataAccountType;

    public Input<Either<String,DataAccountType>> getDataAccountType() {
        return this.dataAccountType;
    }

    @InputImport(name="transferAllBlobs")
    private final @Nullable Input<Boolean> transferAllBlobs;

    public Input<Boolean> getTransferAllBlobs() {
        return this.transferAllBlobs == null ? Input.empty() : this.transferAllBlobs;
    }

    @InputImport(name="transferAllFiles")
    private final @Nullable Input<Boolean> transferAllFiles;

    public Input<Boolean> getTransferAllFiles() {
        return this.transferAllFiles == null ? Input.empty() : this.transferAllFiles;
    }

    public TransferAllDetailsArgs(
        Input<Either<String,DataAccountType>> dataAccountType,
        @Nullable Input<Boolean> transferAllBlobs,
        @Nullable Input<Boolean> transferAllFiles) {
        this.dataAccountType = dataAccountType == null ? Input.ofLeft("StorageAccount") : Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.transferAllBlobs = transferAllBlobs;
        this.transferAllFiles = transferAllFiles;
    }

    private TransferAllDetailsArgs() {
        this.dataAccountType = Input.empty();
        this.transferAllBlobs = Input.empty();
        this.transferAllFiles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferAllDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,DataAccountType>> dataAccountType;
        private @Nullable Input<Boolean> transferAllBlobs;
        private @Nullable Input<Boolean> transferAllFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferAllDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.transferAllBlobs = defaults.transferAllBlobs;
    	      this.transferAllFiles = defaults.transferAllFiles;
        }

        public Builder setDataAccountType(Input<Either<String,DataAccountType>> dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setDataAccountType(Either<String,DataAccountType> dataAccountType) {
            this.dataAccountType = Input.of(Objects.requireNonNull(dataAccountType));
            return this;
        }

        public Builder setTransferAllBlobs(@Nullable Input<Boolean> transferAllBlobs) {
            this.transferAllBlobs = transferAllBlobs;
            return this;
        }

        public Builder setTransferAllBlobs(@Nullable Boolean transferAllBlobs) {
            this.transferAllBlobs = Input.ofNullable(transferAllBlobs);
            return this;
        }

        public Builder setTransferAllFiles(@Nullable Input<Boolean> transferAllFiles) {
            this.transferAllFiles = transferAllFiles;
            return this;
        }

        public Builder setTransferAllFiles(@Nullable Boolean transferAllFiles) {
            this.transferAllFiles = Input.ofNullable(transferAllFiles);
            return this;
        }

        public TransferAllDetailsArgs build() {
            return new TransferAllDetailsArgs(dataAccountType, transferAllBlobs, transferAllFiles);
        }
    }
}