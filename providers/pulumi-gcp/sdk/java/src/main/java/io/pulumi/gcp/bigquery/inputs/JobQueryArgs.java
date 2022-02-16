// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.JobQueryDefaultDatasetArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryDestinationEncryptionConfigurationArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryDestinationTableArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryScriptOptionsArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryUserDefinedFunctionResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryArgs Empty = new JobQueryArgs();

    @InputImport(name="allowLargeResults")
    private final @Nullable Input<Boolean> allowLargeResults;

    public Input<Boolean> getAllowLargeResults() {
        return this.allowLargeResults == null ? Input.empty() : this.allowLargeResults;
    }

    @InputImport(name="createDisposition")
    private final @Nullable Input<String> createDisposition;

    public Input<String> getCreateDisposition() {
        return this.createDisposition == null ? Input.empty() : this.createDisposition;
    }

    @InputImport(name="defaultDataset")
    private final @Nullable Input<JobQueryDefaultDatasetArgs> defaultDataset;

    public Input<JobQueryDefaultDatasetArgs> getDefaultDataset() {
        return this.defaultDataset == null ? Input.empty() : this.defaultDataset;
    }

    @InputImport(name="destinationEncryptionConfiguration")
    private final @Nullable Input<JobQueryDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration;

    public Input<JobQueryDestinationEncryptionConfigurationArgs> getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration == null ? Input.empty() : this.destinationEncryptionConfiguration;
    }

    @InputImport(name="destinationTable")
    private final @Nullable Input<JobQueryDestinationTableArgs> destinationTable;

    public Input<JobQueryDestinationTableArgs> getDestinationTable() {
        return this.destinationTable == null ? Input.empty() : this.destinationTable;
    }

    @InputImport(name="flattenResults")
    private final @Nullable Input<Boolean> flattenResults;

    public Input<Boolean> getFlattenResults() {
        return this.flattenResults == null ? Input.empty() : this.flattenResults;
    }

    @InputImport(name="maximumBillingTier")
    private final @Nullable Input<Integer> maximumBillingTier;

    public Input<Integer> getMaximumBillingTier() {
        return this.maximumBillingTier == null ? Input.empty() : this.maximumBillingTier;
    }

    @InputImport(name="maximumBytesBilled")
    private final @Nullable Input<String> maximumBytesBilled;

    public Input<String> getMaximumBytesBilled() {
        return this.maximumBytesBilled == null ? Input.empty() : this.maximumBytesBilled;
    }

    @InputImport(name="parameterMode")
    private final @Nullable Input<String> parameterMode;

    public Input<String> getParameterMode() {
        return this.parameterMode == null ? Input.empty() : this.parameterMode;
    }

    @InputImport(name="priority")
    private final @Nullable Input<String> priority;

    public Input<String> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="query", required=true)
    private final Input<String> query;

    public Input<String> getQuery() {
        return this.query;
    }

    @InputImport(name="schemaUpdateOptions")
    private final @Nullable Input<List<String>> schemaUpdateOptions;

    public Input<List<String>> getSchemaUpdateOptions() {
        return this.schemaUpdateOptions == null ? Input.empty() : this.schemaUpdateOptions;
    }

    @InputImport(name="scriptOptions")
    private final @Nullable Input<JobQueryScriptOptionsArgs> scriptOptions;

    public Input<JobQueryScriptOptionsArgs> getScriptOptions() {
        return this.scriptOptions == null ? Input.empty() : this.scriptOptions;
    }

    @InputImport(name="useLegacySql")
    private final @Nullable Input<Boolean> useLegacySql;

    public Input<Boolean> getUseLegacySql() {
        return this.useLegacySql == null ? Input.empty() : this.useLegacySql;
    }

    @InputImport(name="useQueryCache")
    private final @Nullable Input<Boolean> useQueryCache;

    public Input<Boolean> getUseQueryCache() {
        return this.useQueryCache == null ? Input.empty() : this.useQueryCache;
    }

    @InputImport(name="userDefinedFunctionResources")
    private final @Nullable Input<List<JobQueryUserDefinedFunctionResourceArgs>> userDefinedFunctionResources;

    public Input<List<JobQueryUserDefinedFunctionResourceArgs>> getUserDefinedFunctionResources() {
        return this.userDefinedFunctionResources == null ? Input.empty() : this.userDefinedFunctionResources;
    }

    @InputImport(name="writeDisposition")
    private final @Nullable Input<String> writeDisposition;

    public Input<String> getWriteDisposition() {
        return this.writeDisposition == null ? Input.empty() : this.writeDisposition;
    }

    public JobQueryArgs(
        @Nullable Input<Boolean> allowLargeResults,
        @Nullable Input<String> createDisposition,
        @Nullable Input<JobQueryDefaultDatasetArgs> defaultDataset,
        @Nullable Input<JobQueryDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration,
        @Nullable Input<JobQueryDestinationTableArgs> destinationTable,
        @Nullable Input<Boolean> flattenResults,
        @Nullable Input<Integer> maximumBillingTier,
        @Nullable Input<String> maximumBytesBilled,
        @Nullable Input<String> parameterMode,
        @Nullable Input<String> priority,
        Input<String> query,
        @Nullable Input<List<String>> schemaUpdateOptions,
        @Nullable Input<JobQueryScriptOptionsArgs> scriptOptions,
        @Nullable Input<Boolean> useLegacySql,
        @Nullable Input<Boolean> useQueryCache,
        @Nullable Input<List<JobQueryUserDefinedFunctionResourceArgs>> userDefinedFunctionResources,
        @Nullable Input<String> writeDisposition) {
        this.allowLargeResults = allowLargeResults;
        this.createDisposition = createDisposition;
        this.defaultDataset = defaultDataset;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.flattenResults = flattenResults;
        this.maximumBillingTier = maximumBillingTier;
        this.maximumBytesBilled = maximumBytesBilled;
        this.parameterMode = parameterMode;
        this.priority = priority;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.schemaUpdateOptions = schemaUpdateOptions;
        this.scriptOptions = scriptOptions;
        this.useLegacySql = useLegacySql;
        this.useQueryCache = useQueryCache;
        this.userDefinedFunctionResources = userDefinedFunctionResources;
        this.writeDisposition = writeDisposition;
    }

    private JobQueryArgs() {
        this.allowLargeResults = Input.empty();
        this.createDisposition = Input.empty();
        this.defaultDataset = Input.empty();
        this.destinationEncryptionConfiguration = Input.empty();
        this.destinationTable = Input.empty();
        this.flattenResults = Input.empty();
        this.maximumBillingTier = Input.empty();
        this.maximumBytesBilled = Input.empty();
        this.parameterMode = Input.empty();
        this.priority = Input.empty();
        this.query = Input.empty();
        this.schemaUpdateOptions = Input.empty();
        this.scriptOptions = Input.empty();
        this.useLegacySql = Input.empty();
        this.useQueryCache = Input.empty();
        this.userDefinedFunctionResources = Input.empty();
        this.writeDisposition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowLargeResults;
        private @Nullable Input<String> createDisposition;
        private @Nullable Input<JobQueryDefaultDatasetArgs> defaultDataset;
        private @Nullable Input<JobQueryDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration;
        private @Nullable Input<JobQueryDestinationTableArgs> destinationTable;
        private @Nullable Input<Boolean> flattenResults;
        private @Nullable Input<Integer> maximumBillingTier;
        private @Nullable Input<String> maximumBytesBilled;
        private @Nullable Input<String> parameterMode;
        private @Nullable Input<String> priority;
        private Input<String> query;
        private @Nullable Input<List<String>> schemaUpdateOptions;
        private @Nullable Input<JobQueryScriptOptionsArgs> scriptOptions;
        private @Nullable Input<Boolean> useLegacySql;
        private @Nullable Input<Boolean> useQueryCache;
        private @Nullable Input<List<JobQueryUserDefinedFunctionResourceArgs>> userDefinedFunctionResources;
        private @Nullable Input<String> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLargeResults = defaults.allowLargeResults;
    	      this.createDisposition = defaults.createDisposition;
    	      this.defaultDataset = defaults.defaultDataset;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.flattenResults = defaults.flattenResults;
    	      this.maximumBillingTier = defaults.maximumBillingTier;
    	      this.maximumBytesBilled = defaults.maximumBytesBilled;
    	      this.parameterMode = defaults.parameterMode;
    	      this.priority = defaults.priority;
    	      this.query = defaults.query;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.scriptOptions = defaults.scriptOptions;
    	      this.useLegacySql = defaults.useLegacySql;
    	      this.useQueryCache = defaults.useQueryCache;
    	      this.userDefinedFunctionResources = defaults.userDefinedFunctionResources;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setAllowLargeResults(@Nullable Input<Boolean> allowLargeResults) {
            this.allowLargeResults = allowLargeResults;
            return this;
        }

        public Builder setAllowLargeResults(@Nullable Boolean allowLargeResults) {
            this.allowLargeResults = Input.ofNullable(allowLargeResults);
            return this;
        }

        public Builder setCreateDisposition(@Nullable Input<String> createDisposition) {
            this.createDisposition = createDisposition;
            return this;
        }

        public Builder setCreateDisposition(@Nullable String createDisposition) {
            this.createDisposition = Input.ofNullable(createDisposition);
            return this;
        }

        public Builder setDefaultDataset(@Nullable Input<JobQueryDefaultDatasetArgs> defaultDataset) {
            this.defaultDataset = defaultDataset;
            return this;
        }

        public Builder setDefaultDataset(@Nullable JobQueryDefaultDatasetArgs defaultDataset) {
            this.defaultDataset = Input.ofNullable(defaultDataset);
            return this;
        }

        public Builder setDestinationEncryptionConfiguration(@Nullable Input<JobQueryDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }

        public Builder setDestinationEncryptionConfiguration(@Nullable JobQueryDestinationEncryptionConfigurationArgs destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Input.ofNullable(destinationEncryptionConfiguration);
            return this;
        }

        public Builder setDestinationTable(@Nullable Input<JobQueryDestinationTableArgs> destinationTable) {
            this.destinationTable = destinationTable;
            return this;
        }

        public Builder setDestinationTable(@Nullable JobQueryDestinationTableArgs destinationTable) {
            this.destinationTable = Input.ofNullable(destinationTable);
            return this;
        }

        public Builder setFlattenResults(@Nullable Input<Boolean> flattenResults) {
            this.flattenResults = flattenResults;
            return this;
        }

        public Builder setFlattenResults(@Nullable Boolean flattenResults) {
            this.flattenResults = Input.ofNullable(flattenResults);
            return this;
        }

        public Builder setMaximumBillingTier(@Nullable Input<Integer> maximumBillingTier) {
            this.maximumBillingTier = maximumBillingTier;
            return this;
        }

        public Builder setMaximumBillingTier(@Nullable Integer maximumBillingTier) {
            this.maximumBillingTier = Input.ofNullable(maximumBillingTier);
            return this;
        }

        public Builder setMaximumBytesBilled(@Nullable Input<String> maximumBytesBilled) {
            this.maximumBytesBilled = maximumBytesBilled;
            return this;
        }

        public Builder setMaximumBytesBilled(@Nullable String maximumBytesBilled) {
            this.maximumBytesBilled = Input.ofNullable(maximumBytesBilled);
            return this;
        }

        public Builder setParameterMode(@Nullable Input<String> parameterMode) {
            this.parameterMode = parameterMode;
            return this;
        }

        public Builder setParameterMode(@Nullable String parameterMode) {
            this.parameterMode = Input.ofNullable(parameterMode);
            return this;
        }

        public Builder setPriority(@Nullable Input<String> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable String priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setQuery(Input<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Input.of(Objects.requireNonNull(query));
            return this;
        }

        public Builder setSchemaUpdateOptions(@Nullable Input<List<String>> schemaUpdateOptions) {
            this.schemaUpdateOptions = schemaUpdateOptions;
            return this;
        }

        public Builder setSchemaUpdateOptions(@Nullable List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = Input.ofNullable(schemaUpdateOptions);
            return this;
        }

        public Builder setScriptOptions(@Nullable Input<JobQueryScriptOptionsArgs> scriptOptions) {
            this.scriptOptions = scriptOptions;
            return this;
        }

        public Builder setScriptOptions(@Nullable JobQueryScriptOptionsArgs scriptOptions) {
            this.scriptOptions = Input.ofNullable(scriptOptions);
            return this;
        }

        public Builder setUseLegacySql(@Nullable Input<Boolean> useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }

        public Builder setUseLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = Input.ofNullable(useLegacySql);
            return this;
        }

        public Builder setUseQueryCache(@Nullable Input<Boolean> useQueryCache) {
            this.useQueryCache = useQueryCache;
            return this;
        }

        public Builder setUseQueryCache(@Nullable Boolean useQueryCache) {
            this.useQueryCache = Input.ofNullable(useQueryCache);
            return this;
        }

        public Builder setUserDefinedFunctionResources(@Nullable Input<List<JobQueryUserDefinedFunctionResourceArgs>> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = userDefinedFunctionResources;
            return this;
        }

        public Builder setUserDefinedFunctionResources(@Nullable List<JobQueryUserDefinedFunctionResourceArgs> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = Input.ofNullable(userDefinedFunctionResources);
            return this;
        }

        public Builder setWriteDisposition(@Nullable Input<String> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }

        public Builder setWriteDisposition(@Nullable String writeDisposition) {
            this.writeDisposition = Input.ofNullable(writeDisposition);
            return this;
        }

        public JobQueryArgs build() {
            return new JobQueryArgs(allowLargeResults, createDisposition, defaultDataset, destinationEncryptionConfiguration, destinationTable, flattenResults, maximumBillingTier, maximumBytesBilled, parameterMode, priority, query, schemaUpdateOptions, scriptOptions, useLegacySql, useQueryCache, userDefinedFunctionResources, writeDisposition);
        }
    }
}