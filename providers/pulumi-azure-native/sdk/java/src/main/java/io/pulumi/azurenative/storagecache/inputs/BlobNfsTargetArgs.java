// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties pertaining to the BlobNfsTarget.
 * 
 */
public final class BlobNfsTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobNfsTargetArgs Empty = new BlobNfsTargetArgs();

    /**
     * Resource ID of the storage container.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Output.empty() : this.target;
    }

    /**
     * Identifies the StorageCache usage model to be used for this storage target.
     * 
     */
    @Import(name="usageModel")
      private final @Nullable Output<String> usageModel;

    public Output<String> getUsageModel() {
        return this.usageModel == null ? Output.empty() : this.usageModel;
    }

    public BlobNfsTargetArgs(
        @Nullable Output<String> target,
        @Nullable Output<String> usageModel) {
        this.target = target;
        this.usageModel = usageModel;
    }

    private BlobNfsTargetArgs() {
        this.target = Output.empty();
        this.usageModel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobNfsTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> target;
        private @Nullable Output<String> usageModel;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobNfsTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.usageModel = defaults.usageModel;
        }

        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = Output.ofNullable(target);
            return this;
        }

        public Builder usageModel(@Nullable Output<String> usageModel) {
            this.usageModel = usageModel;
            return this;
        }

        public Builder usageModel(@Nullable String usageModel) {
            this.usageModel = Output.ofNullable(usageModel);
            return this;
        }
        public BlobNfsTargetArgs build() {
            return new BlobNfsTargetArgs(target, usageModel);
        }
    }
}
