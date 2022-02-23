// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Avro write settings.
 * 
 */
public final class AvroWriteSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AvroWriteSettingsArgs Empty = new AvroWriteSettingsArgs();

    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileNamePrefix")
        private final @Nullable Input<Object> fileNamePrefix;

    public Input<Object> getFileNamePrefix() {
        return this.fileNamePrefix == null ? Input.empty() : this.fileNamePrefix;
    }

    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxRowsPerFile")
        private final @Nullable Input<Object> maxRowsPerFile;

    public Input<Object> getMaxRowsPerFile() {
        return this.maxRowsPerFile == null ? Input.empty() : this.maxRowsPerFile;
    }

    /**
     * Top level record name in write result, which is required in AVRO spec.
     * 
     */
    @InputImport(name="recordName")
        private final @Nullable Input<String> recordName;

    public Input<String> getRecordName() {
        return this.recordName == null ? Input.empty() : this.recordName;
    }

    /**
     * Record namespace in the write result.
     * 
     */
    @InputImport(name="recordNamespace")
        private final @Nullable Input<String> recordNamespace;

    public Input<String> getRecordNamespace() {
        return this.recordNamespace == null ? Input.empty() : this.recordNamespace;
    }

    /**
     * The write setting type.
     * Expected value is 'AvroWriteSettings'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AvroWriteSettingsArgs(
        @Nullable Input<Object> fileNamePrefix,
        @Nullable Input<Object> maxRowsPerFile,
        @Nullable Input<String> recordName,
        @Nullable Input<String> recordNamespace,
        Input<String> type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.recordName = recordName;
        this.recordNamespace = recordNamespace;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AvroWriteSettingsArgs() {
        this.fileNamePrefix = Input.empty();
        this.maxRowsPerFile = Input.empty();
        this.recordName = Input.empty();
        this.recordNamespace = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> fileNamePrefix;
        private @Nullable Input<Object> maxRowsPerFile;
        private @Nullable Input<String> recordName;
        private @Nullable Input<String> recordNamespace;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.recordName = defaults.recordName;
    	      this.recordNamespace = defaults.recordNamespace;
    	      this.type = defaults.type;
        }

        public Builder setFileNamePrefix(@Nullable Input<Object> fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }

        public Builder setFileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = Input.ofNullable(fileNamePrefix);
            return this;
        }

        public Builder setMaxRowsPerFile(@Nullable Input<Object> maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        public Builder setMaxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = Input.ofNullable(maxRowsPerFile);
            return this;
        }

        public Builder setRecordName(@Nullable Input<String> recordName) {
            this.recordName = recordName;
            return this;
        }

        public Builder setRecordName(@Nullable String recordName) {
            this.recordName = Input.ofNullable(recordName);
            return this;
        }

        public Builder setRecordNamespace(@Nullable Input<String> recordNamespace) {
            this.recordNamespace = recordNamespace;
            return this;
        }

        public Builder setRecordNamespace(@Nullable String recordNamespace) {
            this.recordNamespace = Input.ofNullable(recordNamespace);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public AvroWriteSettingsArgs build() {
            return new AvroWriteSettingsArgs(fileNamePrefix, maxRowsPerFile, recordName, recordNamespace, type);
        }
    }
}
