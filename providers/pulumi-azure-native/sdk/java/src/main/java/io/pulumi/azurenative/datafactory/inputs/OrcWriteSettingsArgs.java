// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Orc write settings.
 * 
 */
public final class OrcWriteSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrcWriteSettingsArgs Empty = new OrcWriteSettingsArgs();

    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileNamePrefix")
      private final @Nullable Output<Object> fileNamePrefix;

    public Output<Object> getFileNamePrefix() {
        return this.fileNamePrefix == null ? Output.empty() : this.fileNamePrefix;
    }

    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxRowsPerFile")
      private final @Nullable Output<Object> maxRowsPerFile;

    public Output<Object> getMaxRowsPerFile() {
        return this.maxRowsPerFile == null ? Output.empty() : this.maxRowsPerFile;
    }

    /**
     * The write setting type.
     * Expected value is 'OrcWriteSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public OrcWriteSettingsArgs(
        @Nullable Output<Object> fileNamePrefix,
        @Nullable Output<Object> maxRowsPerFile,
        Output<String> type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OrcWriteSettingsArgs() {
        this.fileNamePrefix = Output.empty();
        this.maxRowsPerFile = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrcWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> fileNamePrefix;
        private @Nullable Output<Object> maxRowsPerFile;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrcWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.type = defaults.type;
        }

        public Builder fileNamePrefix(@Nullable Output<Object> fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }

        public Builder fileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = Output.ofNullable(fileNamePrefix);
            return this;
        }

        public Builder maxRowsPerFile(@Nullable Output<Object> maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        public Builder maxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = Output.ofNullable(maxRowsPerFile);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public OrcWriteSettingsArgs build() {
            return new OrcWriteSettingsArgs(fileNamePrefix, maxRowsPerFile, type);
        }
    }
}
