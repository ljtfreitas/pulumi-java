// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecTransferOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecTransferOptionsArgs Empty = new TransferJobTransferSpecTransferOptionsArgs();

    /**
     * Whether objects should be deleted from the source after they are transferred to the sink. Note that this option and `delete_objects_unique_in_sink` are mutually exclusive.
     * 
     */
    @Import(name="deleteObjectsFromSourceAfterTransfer")
      private final @Nullable Output<Boolean> deleteObjectsFromSourceAfterTransfer;

    public Output<Boolean> getDeleteObjectsFromSourceAfterTransfer() {
        return this.deleteObjectsFromSourceAfterTransfer == null ? Output.empty() : this.deleteObjectsFromSourceAfterTransfer;
    }

    /**
     * Whether objects that exist only in the sink should be deleted. Note that this option and
     * `delete_objects_from_source_after_transfer` are mutually exclusive.
     * 
     */
    @Import(name="deleteObjectsUniqueInSink")
      private final @Nullable Output<Boolean> deleteObjectsUniqueInSink;

    public Output<Boolean> getDeleteObjectsUniqueInSink() {
        return this.deleteObjectsUniqueInSink == null ? Output.empty() : this.deleteObjectsUniqueInSink;
    }

    /**
     * Whether overwriting objects that already exist in the sink is allowed.
     * 
     */
    @Import(name="overwriteObjectsAlreadyExistingInSink")
      private final @Nullable Output<Boolean> overwriteObjectsAlreadyExistingInSink;

    public Output<Boolean> getOverwriteObjectsAlreadyExistingInSink() {
        return this.overwriteObjectsAlreadyExistingInSink == null ? Output.empty() : this.overwriteObjectsAlreadyExistingInSink;
    }

    public TransferJobTransferSpecTransferOptionsArgs(
        @Nullable Output<Boolean> deleteObjectsFromSourceAfterTransfer,
        @Nullable Output<Boolean> deleteObjectsUniqueInSink,
        @Nullable Output<Boolean> overwriteObjectsAlreadyExistingInSink) {
        this.deleteObjectsFromSourceAfterTransfer = deleteObjectsFromSourceAfterTransfer;
        this.deleteObjectsUniqueInSink = deleteObjectsUniqueInSink;
        this.overwriteObjectsAlreadyExistingInSink = overwriteObjectsAlreadyExistingInSink;
    }

    private TransferJobTransferSpecTransferOptionsArgs() {
        this.deleteObjectsFromSourceAfterTransfer = Output.empty();
        this.deleteObjectsUniqueInSink = Output.empty();
        this.overwriteObjectsAlreadyExistingInSink = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecTransferOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteObjectsFromSourceAfterTransfer;
        private @Nullable Output<Boolean> deleteObjectsUniqueInSink;
        private @Nullable Output<Boolean> overwriteObjectsAlreadyExistingInSink;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecTransferOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteObjectsFromSourceAfterTransfer = defaults.deleteObjectsFromSourceAfterTransfer;
    	      this.deleteObjectsUniqueInSink = defaults.deleteObjectsUniqueInSink;
    	      this.overwriteObjectsAlreadyExistingInSink = defaults.overwriteObjectsAlreadyExistingInSink;
        }

        public Builder deleteObjectsFromSourceAfterTransfer(@Nullable Output<Boolean> deleteObjectsFromSourceAfterTransfer) {
            this.deleteObjectsFromSourceAfterTransfer = deleteObjectsFromSourceAfterTransfer;
            return this;
        }

        public Builder deleteObjectsFromSourceAfterTransfer(@Nullable Boolean deleteObjectsFromSourceAfterTransfer) {
            this.deleteObjectsFromSourceAfterTransfer = Output.ofNullable(deleteObjectsFromSourceAfterTransfer);
            return this;
        }

        public Builder deleteObjectsUniqueInSink(@Nullable Output<Boolean> deleteObjectsUniqueInSink) {
            this.deleteObjectsUniqueInSink = deleteObjectsUniqueInSink;
            return this;
        }

        public Builder deleteObjectsUniqueInSink(@Nullable Boolean deleteObjectsUniqueInSink) {
            this.deleteObjectsUniqueInSink = Output.ofNullable(deleteObjectsUniqueInSink);
            return this;
        }

        public Builder overwriteObjectsAlreadyExistingInSink(@Nullable Output<Boolean> overwriteObjectsAlreadyExistingInSink) {
            this.overwriteObjectsAlreadyExistingInSink = overwriteObjectsAlreadyExistingInSink;
            return this;
        }

        public Builder overwriteObjectsAlreadyExistingInSink(@Nullable Boolean overwriteObjectsAlreadyExistingInSink) {
            this.overwriteObjectsAlreadyExistingInSink = Output.ofNullable(overwriteObjectsAlreadyExistingInSink);
            return this;
        }
        public TransferJobTransferSpecTransferOptionsArgs build() {
            return new TransferJobTransferSpecTransferOptionsArgs(deleteObjectsFromSourceAfterTransfer, deleteObjectsUniqueInSink, overwriteObjectsAlreadyExistingInSink);
        }
    }
}
