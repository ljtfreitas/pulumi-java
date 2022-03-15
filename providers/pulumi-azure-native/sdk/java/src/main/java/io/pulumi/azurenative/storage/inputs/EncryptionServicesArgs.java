// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.EncryptionServiceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of services that support encryption.
 * 
 */
public final class EncryptionServicesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionServicesArgs Empty = new EncryptionServicesArgs();

    /**
     * The encryption function of the blob storage service.
     * 
     */
    @Import(name="blob")
      private final @Nullable Output<EncryptionServiceArgs> blob;

    public Output<EncryptionServiceArgs> getBlob() {
        return this.blob == null ? Output.empty() : this.blob;
    }

    /**
     * The encryption function of the file storage service.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<EncryptionServiceArgs> file;

    public Output<EncryptionServiceArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * The encryption function of the queue storage service.
     * 
     */
    @Import(name="queue")
      private final @Nullable Output<EncryptionServiceArgs> queue;

    public Output<EncryptionServiceArgs> getQueue() {
        return this.queue == null ? Output.empty() : this.queue;
    }

    /**
     * The encryption function of the table storage service.
     * 
     */
    @Import(name="table")
      private final @Nullable Output<EncryptionServiceArgs> table;

    public Output<EncryptionServiceArgs> getTable() {
        return this.table == null ? Output.empty() : this.table;
    }

    public EncryptionServicesArgs(
        @Nullable Output<EncryptionServiceArgs> blob,
        @Nullable Output<EncryptionServiceArgs> file,
        @Nullable Output<EncryptionServiceArgs> queue,
        @Nullable Output<EncryptionServiceArgs> table) {
        this.blob = blob;
        this.file = file;
        this.queue = queue;
        this.table = table;
    }

    private EncryptionServicesArgs() {
        this.blob = Output.empty();
        this.file = Output.empty();
        this.queue = Output.empty();
        this.table = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EncryptionServiceArgs> blob;
        private @Nullable Output<EncryptionServiceArgs> file;
        private @Nullable Output<EncryptionServiceArgs> queue;
        private @Nullable Output<EncryptionServiceArgs> table;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionServicesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.file = defaults.file;
    	      this.queue = defaults.queue;
    	      this.table = defaults.table;
        }

        public Builder blob(@Nullable Output<EncryptionServiceArgs> blob) {
            this.blob = blob;
            return this;
        }

        public Builder blob(@Nullable EncryptionServiceArgs blob) {
            this.blob = Output.ofNullable(blob);
            return this;
        }

        public Builder file(@Nullable Output<EncryptionServiceArgs> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable EncryptionServiceArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }

        public Builder queue(@Nullable Output<EncryptionServiceArgs> queue) {
            this.queue = queue;
            return this;
        }

        public Builder queue(@Nullable EncryptionServiceArgs queue) {
            this.queue = Output.ofNullable(queue);
            return this;
        }

        public Builder table(@Nullable Output<EncryptionServiceArgs> table) {
            this.table = table;
            return this;
        }

        public Builder table(@Nullable EncryptionServiceArgs table) {
            this.table = Output.ofNullable(table);
            return this;
        }
        public EncryptionServicesArgs build() {
            return new EncryptionServicesArgs(blob, file, queue, table);
        }
    }
}
