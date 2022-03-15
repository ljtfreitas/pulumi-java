// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.LoggingConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.QueryListArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache Spark SQL (http://spark.apache.org/sql/) queries.
 * 
 */
public final class SparkSqlJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final SparkSqlJobArgs Empty = new SparkSqlJobArgs();

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris")
      private final @Nullable Output<List<String>> jarFileUris;

    public Output<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Output.empty() : this.jarFileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
      private final @Nullable Output<LoggingConfigArgs> loggingConfig;

    public Output<LoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Output.empty() : this.loggingConfig;
    }

    /**
     * Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Dataproc API may be overwritten.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri")
      private final @Nullable Output<String> queryFileUri;

    public Output<String> getQueryFileUri() {
        return this.queryFileUri == null ? Output.empty() : this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList")
      private final @Nullable Output<QueryListArgs> queryList;

    public Output<QueryListArgs> getQueryList() {
        return this.queryList == null ? Output.empty() : this.queryList;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";).
     * 
     */
    @Import(name="scriptVariables")
      private final @Nullable Output<Map<String,String>> scriptVariables;

    public Output<Map<String,String>> getScriptVariables() {
        return this.scriptVariables == null ? Output.empty() : this.scriptVariables;
    }

    public SparkSqlJobArgs(
        @Nullable Output<List<String>> jarFileUris,
        @Nullable Output<LoggingConfigArgs> loggingConfig,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<String> queryFileUri,
        @Nullable Output<QueryListArgs> queryList,
        @Nullable Output<Map<String,String>> scriptVariables) {
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
        this.scriptVariables = scriptVariables;
    }

    private SparkSqlJobArgs() {
        this.jarFileUris = Output.empty();
        this.loggingConfig = Output.empty();
        this.properties = Output.empty();
        this.queryFileUri = Output.empty();
        this.queryList = Output.empty();
        this.scriptVariables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkSqlJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> jarFileUris;
        private @Nullable Output<LoggingConfigArgs> loggingConfig;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<String> queryFileUri;
        private @Nullable Output<QueryListArgs> queryList;
        private @Nullable Output<Map<String,String>> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkSqlJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Output.ofNullable(jarFileUris);
            return this;
        }

        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(@Nullable LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Output.ofNullable(loggingConfig);
            return this;
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder queryFileUri(@Nullable Output<String> queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }

        public Builder queryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = Output.ofNullable(queryFileUri);
            return this;
        }

        public Builder queryList(@Nullable Output<QueryListArgs> queryList) {
            this.queryList = queryList;
            return this;
        }

        public Builder queryList(@Nullable QueryListArgs queryList) {
            this.queryList = Output.ofNullable(queryList);
            return this;
        }

        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }

        public Builder scriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = Output.ofNullable(scriptVariables);
            return this;
        }
        public SparkSqlJobArgs build() {
            return new SparkSqlJobArgs(jarFileUris, loggingConfig, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
