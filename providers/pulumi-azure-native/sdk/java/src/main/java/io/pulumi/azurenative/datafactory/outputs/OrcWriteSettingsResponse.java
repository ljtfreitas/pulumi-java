// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrcWriteSettingsResponse {
    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileNamePrefix;
    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxRowsPerFile;
    /**
     * The write setting type.
     * Expected value is 'OrcWriteSettings'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"fileNamePrefix","maxRowsPerFile","type"})
    private OrcWriteSettingsResponse(
        @Nullable Object fileNamePrefix,
        @Nullable Object maxRowsPerFile,
        String type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getFileNamePrefix() {
        return Optional.ofNullable(this.fileNamePrefix);
    }
    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getMaxRowsPerFile() {
        return Optional.ofNullable(this.maxRowsPerFile);
    }
    /**
     * The write setting type.
     * Expected value is 'OrcWriteSettings'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrcWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileNamePrefix;
        private @Nullable Object maxRowsPerFile;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrcWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.type = defaults.type;
        }

        public Builder setFileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }

        public Builder setMaxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public OrcWriteSettingsResponse build() {
            return new OrcWriteSettingsResponse(fileNamePrefix, maxRowsPerFile, type);
        }
    }
}
