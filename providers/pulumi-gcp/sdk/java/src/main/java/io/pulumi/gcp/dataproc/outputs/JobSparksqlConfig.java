// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.JobSparksqlConfigLoggingConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobSparksqlConfig {
    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final @Nullable List<String> jarFileUris;
    private final @Nullable JobSparksqlConfigLoggingConfig loggingConfig;
    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    private final @Nullable String queryFileUri;
    /**
     * The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    private final @Nullable List<String> queryLists;
    /**
     * Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name="value";`).
     * 
     */
    private final @Nullable Map<String,String> scriptVariables;

    @OutputCustomType.Constructor({"jarFileUris","loggingConfig","properties","queryFileUri","queryLists","scriptVariables"})
    private JobSparksqlConfig(
        @Nullable List<String> jarFileUris,
        @Nullable JobSparksqlConfigLoggingConfig loggingConfig,
        @Nullable Map<String,String> properties,
        @Nullable String queryFileUri,
        @Nullable List<String> queryLists,
        @Nullable Map<String,String> scriptVariables) {
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryLists = queryLists;
        this.scriptVariables = scriptVariables;
    }

    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    public List<String> getJarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    public Optional<JobSparksqlConfigLoggingConfig> getLoggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    public Optional<String> getQueryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }
    /**
     * The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    public List<String> getQueryLists() {
        return this.queryLists == null ? List.of() : this.queryLists;
    }
    /**
     * Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name="value";`).
     * 
     */
    public Map<String,String> getScriptVariables() {
        return this.scriptVariables == null ? Map.of() : this.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparksqlConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> jarFileUris;
        private @Nullable JobSparksqlConfigLoggingConfig loggingConfig;
        private @Nullable Map<String,String> properties;
        private @Nullable String queryFileUri;
        private @Nullable List<String> queryLists;
        private @Nullable Map<String,String> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSparksqlConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryLists = defaults.queryLists;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setLoggingConfig(@Nullable JobSparksqlConfigLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setQueryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }

        public Builder setQueryLists(@Nullable List<String> queryLists) {
            this.queryLists = queryLists;
            return this;
        }

        public Builder setScriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }
        public JobSparksqlConfig build() {
            return new JobSparksqlConfig(jarFileUris, loggingConfig, properties, queryFileUri, queryLists, scriptVariables);
        }
    }
}
