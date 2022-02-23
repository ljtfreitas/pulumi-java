// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache PySpark (https://spark.apache.org/docs/0.9.0/python-programming-guide.html) applications on YARN.
 * 
 */
public final class PySparkJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final PySparkJobArgs Empty = new PySparkJobArgs();

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
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @InputImport(name="args")
      private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @InputImport(name="fileUris")
      private final @Nullable Input<List<String>> fileUris;

    public Input<List<String>> getFileUris() {
        return this.fileUris == null ? Input.empty() : this.fileUris;
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
     * 
     */
    @InputImport(name="jarFileUris")
      private final @Nullable Input<List<String>> jarFileUris;

    public Input<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Input.empty() : this.jarFileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @InputImport(name="loggingConfig")
      private final @Nullable Input<LoggingConfigArgs> loggingConfig;

    public Input<LoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    @InputImport(name="mainPythonFileUri", required=true)
      private final Input<String> mainPythonFileUri;

    public Input<String> getMainPythonFileUri() {
        return this.mainPythonFileUri;
    }

    /**
     * Optional. A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    @InputImport(name="pythonFileUris")
      private final @Nullable Input<List<String>> pythonFileUris;

    public Input<List<String>> getPythonFileUris() {
        return this.pythonFileUris == null ? Input.empty() : this.pythonFileUris;
    }

    public PySparkJobArgs(
        @Nullable Input<List<String>> archiveUris,
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> fileUris,
        @Nullable Input<List<String>> jarFileUris,
        @Nullable Input<LoggingConfigArgs> loggingConfig,
        Input<String> mainPythonFileUri,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<List<String>> pythonFileUris) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri, "expected parameter 'mainPythonFileUri' to be non-null");
        this.properties = properties;
        this.pythonFileUris = pythonFileUris;
    }

    private PySparkJobArgs() {
        this.archiveUris = Input.empty();
        this.args = Input.empty();
        this.fileUris = Input.empty();
        this.jarFileUris = Input.empty();
        this.loggingConfig = Input.empty();
        this.mainPythonFileUri = Input.empty();
        this.properties = Input.empty();
        this.pythonFileUris = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PySparkJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> archiveUris;
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> fileUris;
        private @Nullable Input<List<String>> jarFileUris;
        private @Nullable Input<LoggingConfigArgs> loggingConfig;
        private Input<String> mainPythonFileUri;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<List<String>> pythonFileUris;

        public Builder() {
    	      // Empty
        }

        public Builder(PySparkJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainPythonFileUri = defaults.mainPythonFileUri;
    	      this.properties = defaults.properties;
    	      this.pythonFileUris = defaults.pythonFileUris;
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

        public Builder setJarFileUris(@Nullable Input<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Input.ofNullable(jarFileUris);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder setMainPythonFileUri(Input<String> mainPythonFileUri) {
            this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
            return this;
        }

        public Builder setMainPythonFileUri(String mainPythonFileUri) {
            this.mainPythonFileUri = Input.of(Objects.requireNonNull(mainPythonFileUri));
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setPythonFileUris(@Nullable Input<List<String>> pythonFileUris) {
            this.pythonFileUris = pythonFileUris;
            return this;
        }

        public Builder setPythonFileUris(@Nullable List<String> pythonFileUris) {
            this.pythonFileUris = Input.ofNullable(pythonFileUris);
            return this;
        }
        public PySparkJobArgs build() {
            return new PySparkJobArgs(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainPythonFileUri, properties, pythonFileUris);
        }
    }
}
