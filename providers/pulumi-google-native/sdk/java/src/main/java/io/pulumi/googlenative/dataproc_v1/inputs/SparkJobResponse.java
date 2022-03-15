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
 * A Dataproc job for running Apache Spark (https://spark.apache.org/) applications on YARN.
 * 
 */
public final class SparkJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final SparkJobResponse Empty = new SparkJobResponse();

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
     * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
     * 
     */
    @Import(name="jarFileUris", required=true)
      private final List<String> jarFileUris;

    public List<String> getJarFileUris() {
        return this.jarFileUris;
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
     * The name of the driver's main class. The jar file that contains the class must be in the default CLASSPATH or specified in jar_file_uris.
     * 
     */
    @Import(name="mainClass", required=true)
      private final String mainClass;

    public String getMainClass() {
        return this.mainClass;
    }

    /**
     * The HCFS URI of the jar file that contains the main class.
     * 
     */
    @Import(name="mainJarFileUri", required=true)
      private final String mainJarFileUri;

    public String getMainJarFileUri() {
        return this.mainJarFileUri;
    }

    /**
     * Optional. A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    @Import(name="properties", required=true)
      private final Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties;
    }

    public SparkJobResponse(
        List<String> archiveUris,
        List<String> args,
        List<String> fileUris,
        List<String> jarFileUris,
        LoggingConfigResponse loggingConfig,
        String mainClass,
        String mainJarFileUri,
        Map<String,String> properties) {
        this.archiveUris = Objects.requireNonNull(archiveUris, "expected parameter 'archiveUris' to be non-null");
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.fileUris = Objects.requireNonNull(fileUris, "expected parameter 'fileUris' to be non-null");
        this.jarFileUris = Objects.requireNonNull(jarFileUris, "expected parameter 'jarFileUris' to be non-null");
        this.loggingConfig = Objects.requireNonNull(loggingConfig, "expected parameter 'loggingConfig' to be non-null");
        this.mainClass = Objects.requireNonNull(mainClass, "expected parameter 'mainClass' to be non-null");
        this.mainJarFileUri = Objects.requireNonNull(mainJarFileUri, "expected parameter 'mainJarFileUri' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private SparkJobResponse() {
        this.archiveUris = List.of();
        this.args = List.of();
        this.fileUris = List.of();
        this.jarFileUris = List.of();
        this.loggingConfig = null;
        this.mainClass = null;
        this.mainJarFileUri = null;
        this.properties = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private String mainClass;
        private String mainJarFileUri;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainClass = defaults.mainClass;
    	      this.mainJarFileUri = defaults.mainJarFileUri;
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

        public Builder jarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }

        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder mainClass(String mainClass) {
            this.mainClass = Objects.requireNonNull(mainClass);
            return this;
        }

        public Builder mainJarFileUri(String mainJarFileUri) {
            this.mainJarFileUri = Objects.requireNonNull(mainJarFileUri);
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public SparkJobResponse build() {
            return new SparkJobResponse(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainClass, mainJarFileUri, properties);
        }
    }
}
