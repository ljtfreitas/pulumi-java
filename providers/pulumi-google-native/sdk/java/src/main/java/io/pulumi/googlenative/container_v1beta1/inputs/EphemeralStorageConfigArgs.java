// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EphemeralStorageConfig contains configuration for the ephemeral storage filesystem.
 * 
 */
public final class EphemeralStorageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EphemeralStorageConfigArgs Empty = new EphemeralStorageConfigArgs();

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    @InputImport(name="localSsdCount")
      private final @Nullable Input<Integer> localSsdCount;

    public Input<Integer> getLocalSsdCount() {
        return this.localSsdCount == null ? Input.empty() : this.localSsdCount;
    }

    public EphemeralStorageConfigArgs(@Nullable Input<Integer> localSsdCount) {
        this.localSsdCount = localSsdCount;
    }

    private EphemeralStorageConfigArgs() {
        this.localSsdCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EphemeralStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(EphemeralStorageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder setLocalSsdCount(@Nullable Input<Integer> localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }

        public Builder setLocalSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = Input.ofNullable(localSsdCount);
            return this;
        }
        public EphemeralStorageConfigArgs build() {
            return new EphemeralStorageConfigArgs(localSsdCount);
        }
    }
}
