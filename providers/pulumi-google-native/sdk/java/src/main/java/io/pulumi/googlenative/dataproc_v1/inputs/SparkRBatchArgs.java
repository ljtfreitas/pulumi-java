// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A configuration for running an Apache SparkR (https://spark.apache.org/docs/latest/sparkr.html) batch workload.
 * 
 */
public final class SparkRBatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final SparkRBatchArgs Empty = new SparkRBatchArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @InputImport(name="archiveUris")
      private final @Nullable Input<List<String>> archiveUris;

    public Input<List<String>> getArchiveUris() {
        return this.archiveUris == null ? Input.empty() : this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    @InputImport(name="args")
      private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    @InputImport(name="fileUris")
      private final @Nullable Input<List<String>> fileUris;

    public Input<List<String>> getFileUris() {
        return this.fileUris == null ? Input.empty() : this.fileUris;
    }

    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
     * 
     */
    @InputImport(name="mainRFileUri", required=true)
      private final Input<String> mainRFileUri;

    public Input<String> getMainRFileUri() {
        return this.mainRFileUri;
    }

    public SparkRBatchArgs(
        @Nullable Input<List<String>> archiveUris,
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> fileUris,
        Input<String> mainRFileUri) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.mainRFileUri = Objects.requireNonNull(mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
    }

    private SparkRBatchArgs() {
        this.archiveUris = Input.empty();
        this.args = Input.empty();
        this.fileUris = Input.empty();
        this.mainRFileUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkRBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> archiveUris;
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> fileUris;
        private Input<String> mainRFileUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkRBatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.mainRFileUri = defaults.mainRFileUri;
        }

        public Builder setArchiveUris(@Nullable Input<List<String>> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }

        public Builder setArchiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = Input.ofNullable(archiveUris);
            return this;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setFileUris(@Nullable Input<List<String>> fileUris) {
            this.fileUris = fileUris;
            return this;
        }

        public Builder setFileUris(@Nullable List<String> fileUris) {
            this.fileUris = Input.ofNullable(fileUris);
            return this;
        }

        public Builder setMainRFileUri(Input<String> mainRFileUri) {
            this.mainRFileUri = Objects.requireNonNull(mainRFileUri);
            return this;
        }

        public Builder setMainRFileUri(String mainRFileUri) {
            this.mainRFileUri = Input.of(Objects.requireNonNull(mainRFileUri));
            return this;
        }
        public SparkRBatchArgs build() {
            return new SparkRBatchArgs(archiveUris, args, fileUris, mainRFileUri);
        }
    }
}
