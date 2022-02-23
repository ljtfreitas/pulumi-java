// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs();

    /**
     * Max number of bytes to scan from a file. If a scanned file's size is bigger than this value
     * then the rest of the bytes are omitted.
     * 
     */
    @InputImport(name="bytesLimitPerFile")
        private final @Nullable Input<Integer> bytesLimitPerFile;

    public Input<Integer> getBytesLimitPerFile() {
        return this.bytesLimitPerFile == null ? Input.empty() : this.bytesLimitPerFile;
    }

    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    @InputImport(name="bytesLimitPerFilePercent")
        private final @Nullable Input<Integer> bytesLimitPerFilePercent;

    public Input<Integer> getBytesLimitPerFilePercent() {
        return this.bytesLimitPerFilePercent == null ? Input.empty() : this.bytesLimitPerFilePercent;
    }

    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileSet", required=true)
        private final Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> fileSet;

    public Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> getFileSet() {
        return this.fileSet;
    }

    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data
     * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
     * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
     * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
     * 
     */
    @InputImport(name="fileTypes")
        private final @Nullable Input<List<String>> fileTypes;

    public Input<List<String>> getFileTypes() {
        return this.fileTypes == null ? Input.empty() : this.fileTypes;
    }

    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    @InputImport(name="filesLimitPercent")
        private final @Nullable Input<Integer> filesLimitPercent;

    public Input<Integer> getFilesLimitPercent() {
        return this.filesLimitPercent == null ? Input.empty() : this.filesLimitPercent;
    }

    /**
     * How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
     * If not specified, scanning would start from the top.
     * Possible values are `TOP` and `RANDOM_START`.
     * 
     */
    @InputImport(name="sampleMethod")
        private final @Nullable Input<String> sampleMethod;

    public Input<String> getSampleMethod() {
        return this.sampleMethod == null ? Input.empty() : this.sampleMethod;
    }

    public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs(
        @Nullable Input<Integer> bytesLimitPerFile,
        @Nullable Input<Integer> bytesLimitPerFilePercent,
        Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> fileSet,
        @Nullable Input<List<String>> fileTypes,
        @Nullable Input<Integer> filesLimitPercent,
        @Nullable Input<String> sampleMethod) {
        this.bytesLimitPerFile = bytesLimitPerFile;
        this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
        this.fileSet = Objects.requireNonNull(fileSet, "expected parameter 'fileSet' to be non-null");
        this.fileTypes = fileTypes;
        this.filesLimitPercent = filesLimitPercent;
        this.sampleMethod = sampleMethod;
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs() {
        this.bytesLimitPerFile = Input.empty();
        this.bytesLimitPerFilePercent = Input.empty();
        this.fileSet = Input.empty();
        this.fileTypes = Input.empty();
        this.filesLimitPercent = Input.empty();
        this.sampleMethod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bytesLimitPerFile;
        private @Nullable Input<Integer> bytesLimitPerFilePercent;
        private Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> fileSet;
        private @Nullable Input<List<String>> fileTypes;
        private @Nullable Input<Integer> filesLimitPercent;
        private @Nullable Input<String> sampleMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesLimitPerFile = defaults.bytesLimitPerFile;
    	      this.bytesLimitPerFilePercent = defaults.bytesLimitPerFilePercent;
    	      this.fileSet = defaults.fileSet;
    	      this.fileTypes = defaults.fileTypes;
    	      this.filesLimitPercent = defaults.filesLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
        }

        public Builder setBytesLimitPerFile(@Nullable Input<Integer> bytesLimitPerFile) {
            this.bytesLimitPerFile = bytesLimitPerFile;
            return this;
        }

        public Builder setBytesLimitPerFile(@Nullable Integer bytesLimitPerFile) {
            this.bytesLimitPerFile = Input.ofNullable(bytesLimitPerFile);
            return this;
        }

        public Builder setBytesLimitPerFilePercent(@Nullable Input<Integer> bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
            return this;
        }

        public Builder setBytesLimitPerFilePercent(@Nullable Integer bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = Input.ofNullable(bytesLimitPerFilePercent);
            return this;
        }

        public Builder setFileSet(Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> fileSet) {
            this.fileSet = Objects.requireNonNull(fileSet);
            return this;
        }

        public Builder setFileSet(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs fileSet) {
            this.fileSet = Input.of(Objects.requireNonNull(fileSet));
            return this;
        }

        public Builder setFileTypes(@Nullable Input<List<String>> fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }

        public Builder setFileTypes(@Nullable List<String> fileTypes) {
            this.fileTypes = Input.ofNullable(fileTypes);
            return this;
        }

        public Builder setFilesLimitPercent(@Nullable Input<Integer> filesLimitPercent) {
            this.filesLimitPercent = filesLimitPercent;
            return this;
        }

        public Builder setFilesLimitPercent(@Nullable Integer filesLimitPercent) {
            this.filesLimitPercent = Input.ofNullable(filesLimitPercent);
            return this;
        }

        public Builder setSampleMethod(@Nullable Input<String> sampleMethod) {
            this.sampleMethod = sampleMethod;
            return this;
        }

        public Builder setSampleMethod(@Nullable String sampleMethod) {
            this.sampleMethod = Input.ofNullable(sampleMethod);
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs(bytesLimitPerFile, bytesLimitPerFilePercent, fileSet, fileTypes, filesLimitPercent, sampleMethod);
        }
    }
}
