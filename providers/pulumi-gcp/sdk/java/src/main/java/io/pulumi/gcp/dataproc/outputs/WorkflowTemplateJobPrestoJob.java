// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPrestoJobLoggingConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPrestoJobQueryList;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplateJobPrestoJob {
    /**
     * Optional. Presto client tags to attach to this query
     * 
     */
    private final @Nullable List<String> clientTags;
    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
     */
    private final @Nullable Boolean continueOnFailure;
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    private final @Nullable WorkflowTemplateJobPrestoJobLoggingConfig loggingConfig;
    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    private final @Nullable String outputFormat;
    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    private final @Nullable String queryFileUri;
    /**
     * A list of queries.
     * 
     */
    private final @Nullable WorkflowTemplateJobPrestoJobQueryList queryList;

    @CustomType.Constructor
    private WorkflowTemplateJobPrestoJob(
        @CustomType.Parameter("clientTags") @Nullable List<String> clientTags,
        @CustomType.Parameter("continueOnFailure") @Nullable Boolean continueOnFailure,
        @CustomType.Parameter("loggingConfig") @Nullable WorkflowTemplateJobPrestoJobLoggingConfig loggingConfig,
        @CustomType.Parameter("outputFormat") @Nullable String outputFormat,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("queryFileUri") @Nullable String queryFileUri,
        @CustomType.Parameter("queryList") @Nullable WorkflowTemplateJobPrestoJobQueryList queryList) {
        this.clientTags = clientTags;
        this.continueOnFailure = continueOnFailure;
        this.loggingConfig = loggingConfig;
        this.outputFormat = outputFormat;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
    }

    /**
     * Optional. Presto client tags to attach to this query
     * 
    */
    public List<String> getClientTags() {
        return this.clientTags == null ? List.of() : this.clientTags;
    }
    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
    */
    public Optional<Boolean> getContinueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }
    /**
     * Optional. The runtime log config for job execution.
     * 
    */
    public Optional<WorkflowTemplateJobPrestoJobLoggingConfig> getLoggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
    */
    public Optional<String> getOutputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }
    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
    */
    public Optional<String> getQueryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }
    /**
     * A list of queries.
     * 
    */
    public Optional<WorkflowTemplateJobPrestoJobQueryList> getQueryList() {
        return Optional.ofNullable(this.queryList);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPrestoJob defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> clientTags;
        private @Nullable Boolean continueOnFailure;
        private @Nullable WorkflowTemplateJobPrestoJobLoggingConfig loggingConfig;
        private @Nullable String outputFormat;
        private @Nullable Map<String,String> properties;
        private @Nullable String queryFileUri;
        private @Nullable WorkflowTemplateJobPrestoJobQueryList queryList;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPrestoJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTags = defaults.clientTags;
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.outputFormat = defaults.outputFormat;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
        }

        public Builder clientTags(@Nullable List<String> clientTags) {
            this.clientTags = clientTags;
            return this;
        }

        public Builder continueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder loggingConfig(@Nullable WorkflowTemplateJobPrestoJobLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder outputFormat(@Nullable String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder queryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }

        public Builder queryList(@Nullable WorkflowTemplateJobPrestoJobQueryList queryList) {
            this.queryList = queryList;
            return this;
        }
        public WorkflowTemplateJobPrestoJob build() {
            return new WorkflowTemplateJobPrestoJob(clientTags, continueOnFailure, loggingConfig, outputFormat, properties, queryFileUri, queryList);
        }
    }
}
