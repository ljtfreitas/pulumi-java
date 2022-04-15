// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobLoggingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobSparkJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobSparkJobArgs Empty = new WorkflowTemplateJobSparkJobArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
      private final @Nullable Output<List<String>> archiveUris;

    public Output<List<String>> archiveUris() {
        return this.archiveUris == null ? Codegen.empty() : this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> args() {
        return this.args == null ? Codegen.empty() : this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris")
      private final @Nullable Output<List<String>> fileUris;

    public Output<List<String>> fileUris() {
        return this.fileUris == null ? Codegen.empty() : this.fileUris;
    }

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris")
      private final @Nullable Output<List<String>> jarFileUris;

    public Output<List<String>> jarFileUris() {
        return this.jarFileUris == null ? Codegen.empty() : this.jarFileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
      private final @Nullable Output<WorkflowTemplateJobSparkJobLoggingConfigArgs> loggingConfig;

    public Output<WorkflowTemplateJobSparkJobLoggingConfigArgs> loggingConfig() {
        return this.loggingConfig == null ? Codegen.empty() : this.loggingConfig;
    }

    /**
     * The name of the driver's main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
     * 
     */
    @Import(name="mainClass")
      private final @Nullable Output<String> mainClass;

    public Output<String> mainClass() {
        return this.mainClass == null ? Codegen.empty() : this.mainClass;
    }

    /**
     * The HCFS URI of the jar file that contains the main class.
     * 
     */
    @Import(name="mainJarFileUri")
      private final @Nullable Output<String> mainJarFileUri;

    public Output<String> mainJarFileUri() {
        return this.mainJarFileUri == null ? Codegen.empty() : this.mainJarFileUri;
    }

    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public WorkflowTemplateJobSparkJobArgs(
        @Nullable Output<List<String>> archiveUris,
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> fileUris,
        @Nullable Output<List<String>> jarFileUris,
        @Nullable Output<WorkflowTemplateJobSparkJobLoggingConfigArgs> loggingConfig,
        @Nullable Output<String> mainClass,
        @Nullable Output<String> mainJarFileUri,
        @Nullable Output<Map<String,String>> properties) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainClass = mainClass;
        this.mainJarFileUri = mainJarFileUri;
        this.properties = properties;
    }

    private WorkflowTemplateJobSparkJobArgs() {
        this.archiveUris = Codegen.empty();
        this.args = Codegen.empty();
        this.fileUris = Codegen.empty();
        this.jarFileUris = Codegen.empty();
        this.loggingConfig = Codegen.empty();
        this.mainClass = Codegen.empty();
        this.mainJarFileUri = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobSparkJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> archiveUris;
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> fileUris;
        private @Nullable Output<List<String>> jarFileUris;
        private @Nullable Output<WorkflowTemplateJobSparkJobLoggingConfigArgs> loggingConfig;
        private @Nullable Output<String> mainClass;
        private @Nullable Output<String> mainJarFileUri;
        private @Nullable Output<Map<String,String>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobSparkJobArgs defaults) {
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

        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }
        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = Codegen.ofNullable(archiveUris);
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable List<String> args) {
            this.args = Codegen.ofNullable(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            this.fileUris = fileUris;
            return this;
        }
        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = Codegen.ofNullable(fileUris);
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }
        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Codegen.ofNullable(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder loggingConfig(@Nullable Output<WorkflowTemplateJobSparkJobLoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable WorkflowTemplateJobSparkJobLoggingConfigArgs loggingConfig) {
            this.loggingConfig = Codegen.ofNullable(loggingConfig);
            return this;
        }
        public Builder mainClass(@Nullable Output<String> mainClass) {
            this.mainClass = mainClass;
            return this;
        }
        public Builder mainClass(@Nullable String mainClass) {
            this.mainClass = Codegen.ofNullable(mainClass);
            return this;
        }
        public Builder mainJarFileUri(@Nullable Output<String> mainJarFileUri) {
            this.mainJarFileUri = mainJarFileUri;
            return this;
        }
        public Builder mainJarFileUri(@Nullable String mainJarFileUri) {
            this.mainJarFileUri = Codegen.ofNullable(mainJarFileUri);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public WorkflowTemplateJobSparkJobArgs build() {
            return new WorkflowTemplateJobSparkJobArgs(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainClass, mainJarFileUri, properties);
        }
    }
}
