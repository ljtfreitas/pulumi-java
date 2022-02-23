// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHiveJobQueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobHiveJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobHiveJobArgs Empty = new WorkflowTemplateJobHiveJobArgs();

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
     */
    @InputImport(name="continueOnFailure")
        private final @Nullable Input<Boolean> continueOnFailure;

    public Input<Boolean> getContinueOnFailure() {
        return this.continueOnFailure == null ? Input.empty() : this.continueOnFailure;
    }

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @InputImport(name="jarFileUris")
        private final @Nullable Input<List<String>> jarFileUris;

    public Input<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Input.empty() : this.jarFileUris;
    }

    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @InputImport(name="queryFileUri")
        private final @Nullable Input<String> queryFileUri;

    public Input<String> getQueryFileUri() {
        return this.queryFileUri == null ? Input.empty() : this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @InputImport(name="queryList")
        private final @Nullable Input<WorkflowTemplateJobHiveJobQueryListArgs> queryList;

    public Input<WorkflowTemplateJobHiveJobQueryListArgs> getQueryList() {
        return this.queryList == null ? Input.empty() : this.queryList;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name="value";`).
     * 
     */
    @InputImport(name="scriptVariables")
        private final @Nullable Input<Map<String,String>> scriptVariables;

    public Input<Map<String,String>> getScriptVariables() {
        return this.scriptVariables == null ? Input.empty() : this.scriptVariables;
    }

    public WorkflowTemplateJobHiveJobArgs(
        @Nullable Input<Boolean> continueOnFailure,
        @Nullable Input<List<String>> jarFileUris,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<String> queryFileUri,
        @Nullable Input<WorkflowTemplateJobHiveJobQueryListArgs> queryList,
        @Nullable Input<Map<String,String>> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
        this.scriptVariables = scriptVariables;
    }

    private WorkflowTemplateJobHiveJobArgs() {
        this.continueOnFailure = Input.empty();
        this.jarFileUris = Input.empty();
        this.properties = Input.empty();
        this.queryFileUri = Input.empty();
        this.queryList = Input.empty();
        this.scriptVariables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobHiveJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> continueOnFailure;
        private @Nullable Input<List<String>> jarFileUris;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<String> queryFileUri;
        private @Nullable Input<WorkflowTemplateJobHiveJobQueryListArgs> queryList;
        private @Nullable Input<Map<String,String>> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobHiveJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder setContinueOnFailure(@Nullable Input<Boolean> continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder setContinueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = Input.ofNullable(continueOnFailure);
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

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setQueryFileUri(@Nullable Input<String> queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }

        public Builder setQueryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = Input.ofNullable(queryFileUri);
            return this;
        }

        public Builder setQueryList(@Nullable Input<WorkflowTemplateJobHiveJobQueryListArgs> queryList) {
            this.queryList = queryList;
            return this;
        }

        public Builder setQueryList(@Nullable WorkflowTemplateJobHiveJobQueryListArgs queryList) {
            this.queryList = Input.ofNullable(queryList);
            return this;
        }

        public Builder setScriptVariables(@Nullable Input<Map<String,String>> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }

        public Builder setScriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = Input.ofNullable(scriptVariables);
            return this;
        }
        public WorkflowTemplateJobHiveJobArgs build() {
            return new WorkflowTemplateJobHiveJobArgs(continueOnFailure, jarFileUris, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
