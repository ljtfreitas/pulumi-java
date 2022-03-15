// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiMetadataStoreStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiMetadataStoreStateArgs Empty = new AiMetadataStoreStateArgs();

    @Import(name="diskUtilizationBytes")
      private final @Nullable Output<String> diskUtilizationBytes;

    public Output<String> getDiskUtilizationBytes() {
        return this.diskUtilizationBytes == null ? Output.empty() : this.diskUtilizationBytes;
    }

    public AiMetadataStoreStateArgs(@Nullable Output<String> diskUtilizationBytes) {
        this.diskUtilizationBytes = diskUtilizationBytes;
    }

    private AiMetadataStoreStateArgs() {
        this.diskUtilizationBytes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiMetadataStoreStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskUtilizationBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(AiMetadataStoreStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskUtilizationBytes = defaults.diskUtilizationBytes;
        }

        public Builder diskUtilizationBytes(@Nullable Output<String> diskUtilizationBytes) {
            this.diskUtilizationBytes = diskUtilizationBytes;
            return this;
        }

        public Builder diskUtilizationBytes(@Nullable String diskUtilizationBytes) {
            this.diskUtilizationBytes = Output.ofNullable(diskUtilizationBytes);
            return this;
        }
        public AiMetadataStoreStateArgs build() {
            return new AiMetadataStoreStateArgs(diskUtilizationBytes);
        }
    }
}
