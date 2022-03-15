// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A Dataproc job for running Apache SparkR (https://spark.apache.org/docs/latest/sparkr.html) applications on YARN.
 * 
 */
public final class SparkRJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final SparkRJobResponse Empty = new SparkRJobResponse();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris", required=true)
      private final List<String> archiveUris;

    public List<String> getArchiveUris() {
        return this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args", required=true)
      private final List<String> args;

    public List<String> getArgs() {
        return this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris", required=true)
      private final List<String> fileUris;

    public List<String> getFileUris() {
        return this.fileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig", required=true)
      private final LoggingConfigResponse loggingConfig;

    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R file.
     * 
     */
    @Import(name="mainRFileUri", required=true)
      private final String mainRFileUri;

    public String getMainRFileUri() {
        return this.mainRFileUri;
    }

    /**
     * Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    @Import(name="properties", required=true)
      private final Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties;
    }

    public SparkRJobResponse(
        List<String> archiveUris,
        List<String> args,
        List<String> fileUris,
        LoggingConfigResponse loggingConfig,
        String mainRFileUri,
        Map<String,String> properties) {
        this.archiveUris = Objects.requireNonNull(archiveUris, "expected parameter 'archiveUris' to be non-null");
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.fileUris = Objects.requireNonNull(fileUris, "expected parameter 'fileUris' to be non-null");
        this.loggingConfig = Objects.requireNonNull(loggingConfig, "expected parameter 'loggingConfig' to be non-null");
        this.mainRFileUri = Objects.requireNonNull(mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private SparkRJobResponse() {
        this.archiveUris = List.of();
        this.args = List.of();
        this.fileUris = List.of();
        this.loggingConfig = null;
        this.mainRFileUri = null;
        this.properties = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkRJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private LoggingConfigResponse loggingConfig;
        private String mainRFileUri;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkRJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainRFileUri = defaults.mainRFileUri;
    	      this.properties = defaults.properties;
        }

        public Builder archiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder fileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }

        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder mainRFileUri(String mainRFileUri) {
            this.mainRFileUri = Objects.requireNonNull(mainRFileUri);
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public SparkRJobResponse build() {
            return new SparkRJobResponse(archiveUris, args, fileUris, loggingConfig, mainRFileUri, properties);
        }
    }
}
