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
 * Delimited text write settings.
 * 
 */
public final class DelimitedTextWriteSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelimitedTextWriteSettingsArgs Empty = new DelimitedTextWriteSettingsArgs();

    /**
     * The file extension used to create the files. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileExtension", required=true)
      private final Output<Object> fileExtension;

    public Output<Object> getFileExtension() {
        return this.fileExtension;
    }

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
     * Indicates whether string values should always be enclosed with quotes. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="quoteAllText")
      private final @Nullable Output<Object> quoteAllText;

    public Output<Object> getQuoteAllText() {
        return this.quoteAllText == null ? Output.empty() : this.quoteAllText;
    }

    /**
     * The write setting type.
     * Expected value is 'DelimitedTextWriteSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DelimitedTextWriteSettingsArgs(
        Output<Object> fileExtension,
        @Nullable Output<Object> fileNamePrefix,
        @Nullable Output<Object> maxRowsPerFile,
        @Nullable Output<Object> quoteAllText,
        Output<String> type) {
        this.fileExtension = Objects.requireNonNull(fileExtension, "expected parameter 'fileExtension' to be non-null");
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.quoteAllText = quoteAllText;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DelimitedTextWriteSettingsArgs() {
        this.fileExtension = Output.empty();
        this.fileNamePrefix = Output.empty();
        this.maxRowsPerFile = Output.empty();
        this.quoteAllText = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> fileExtension;
        private @Nullable Output<Object> fileNamePrefix;
        private @Nullable Output<Object> maxRowsPerFile;
        private @Nullable Output<Object> quoteAllText;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileExtension = defaults.fileExtension;
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.quoteAllText = defaults.quoteAllText;
    	      this.type = defaults.type;
        }

        public Builder fileExtension(Output<Object> fileExtension) {
            this.fileExtension = Objects.requireNonNull(fileExtension);
            return this;
        }

        public Builder fileExtension(Object fileExtension) {
            this.fileExtension = Output.of(Objects.requireNonNull(fileExtension));
            return this;
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

        public Builder quoteAllText(@Nullable Output<Object> quoteAllText) {
            this.quoteAllText = quoteAllText;
            return this;
        }

        public Builder quoteAllText(@Nullable Object quoteAllText) {
            this.quoteAllText = Output.ofNullable(quoteAllText);
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
        public DelimitedTextWriteSettingsArgs build() {
            return new DelimitedTextWriteSettingsArgs(fileExtension, fileNamePrefix, maxRowsPerFile, quoteAllText, type);
        }
    }
}
