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
 * The location of HDFS.
 * 
 */
public final class HdfsLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HdfsLocationArgs Empty = new HdfsLocationArgs();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
      private final @Nullable Output<Object> fileName;

    public Output<Object> getFileName() {
        return this.fileName == null ? Output.empty() : this.fileName;
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
      private final @Nullable Output<Object> folderPath;

    public Output<Object> getFolderPath() {
        return this.folderPath == null ? Output.empty() : this.folderPath;
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'HdfsLocation'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public HdfsLocationArgs(
        @Nullable Output<Object> fileName,
        @Nullable Output<Object> folderPath,
        Output<String> type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HdfsLocationArgs() {
        this.fileName = Output.empty();
        this.folderPath = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HdfsLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> fileName;
        private @Nullable Output<Object> folderPath;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(HdfsLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder fileName(@Nullable Output<Object> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileName(@Nullable Object fileName) {
            this.fileName = Output.ofNullable(fileName);
            return this;
        }

        public Builder folderPath(@Nullable Output<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = Output.ofNullable(folderPath);
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
        public HdfsLocationArgs build() {
            return new HdfsLocationArgs(fileName, folderPath, type);
        }
    }
}
