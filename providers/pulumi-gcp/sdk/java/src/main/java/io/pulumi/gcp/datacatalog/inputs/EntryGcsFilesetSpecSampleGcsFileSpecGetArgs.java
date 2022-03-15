// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryGcsFilesetSpecSampleGcsFileSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryGcsFilesetSpecSampleGcsFileSpecGetArgs Empty = new EntryGcsFilesetSpecSampleGcsFileSpecGetArgs();

    /**
     * - 
     * The full file path
     * 
     */
    @Import(name="filePath")
      private final @Nullable Output<String> filePath;

    public Output<String> getFilePath() {
        return this.filePath == null ? Output.empty() : this.filePath;
    }

    /**
     * - 
     * The size of the file, in bytes.
     * 
     */
    @Import(name="sizeBytes")
      private final @Nullable Output<Integer> sizeBytes;

    public Output<Integer> getSizeBytes() {
        return this.sizeBytes == null ? Output.empty() : this.sizeBytes;
    }

    public EntryGcsFilesetSpecSampleGcsFileSpecGetArgs(
        @Nullable Output<String> filePath,
        @Nullable Output<Integer> sizeBytes) {
        this.filePath = filePath;
        this.sizeBytes = sizeBytes;
    }

    private EntryGcsFilesetSpecSampleGcsFileSpecGetArgs() {
        this.filePath = Output.empty();
        this.sizeBytes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGcsFilesetSpecSampleGcsFileSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filePath;
        private @Nullable Output<Integer> sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGcsFilesetSpecSampleGcsFileSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder filePath(@Nullable Output<String> filePath) {
            this.filePath = filePath;
            return this;
        }

        public Builder filePath(@Nullable String filePath) {
            this.filePath = Output.ofNullable(filePath);
            return this;
        }

        public Builder sizeBytes(@Nullable Output<Integer> sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }

        public Builder sizeBytes(@Nullable Integer sizeBytes) {
            this.sizeBytes = Output.ofNullable(sizeBytes);
            return this;
        }
        public EntryGcsFilesetSpecSampleGcsFileSpecGetArgs build() {
            return new EntryGcsFilesetSpecSampleGcsFileSpecGetArgs(filePath, sizeBytes);
        }
    }
}
