// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EntryGcsFilesetSpecSampleGcsFileSpec {
    /**
     * - 
     * The full file path
     * 
     */
    private final @Nullable String filePath;
    /**
     * - 
     * The size of the file, in bytes.
     * 
     */
    private final @Nullable Integer sizeBytes;

    @OutputCustomType.Constructor({"filePath","sizeBytes"})
    private EntryGcsFilesetSpecSampleGcsFileSpec(
        @Nullable String filePath,
        @Nullable Integer sizeBytes) {
        this.filePath = filePath;
        this.sizeBytes = sizeBytes;
    }

    /**
     * - 
     * The full file path
     * 
     */
    public Optional<String> getFilePath() {
        return Optional.ofNullable(this.filePath);
    }
    /**
     * - 
     * The size of the file, in bytes.
     * 
     */
    public Optional<Integer> getSizeBytes() {
        return Optional.ofNullable(this.sizeBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGcsFilesetSpecSampleGcsFileSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filePath;
        private @Nullable Integer sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGcsFilesetSpecSampleGcsFileSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder setFilePath(@Nullable String filePath) {
            this.filePath = filePath;
            return this;
        }

        public Builder setSizeBytes(@Nullable Integer sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public EntryGcsFilesetSpecSampleGcsFileSpec build() {
            return new EntryGcsFilesetSpecSampleGcsFileSpec(filePath, sizeBytes);
        }
    }
}
