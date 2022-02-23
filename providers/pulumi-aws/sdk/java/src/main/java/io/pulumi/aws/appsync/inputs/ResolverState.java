// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.ResolverCachingConfigGetArgs;
import io.pulumi.aws.appsync.inputs.ResolverPipelineConfigGetArgs;
import io.pulumi.aws.appsync.inputs.ResolverSyncConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverState extends io.pulumi.resources.ResourceArgs {

    public static final ResolverState Empty = new ResolverState();

    /**
     * The API ID for the GraphQL API.
     * 
     */
    @InputImport(name="apiId")
    private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * The ARN
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The CachingConfig.
     * 
     */
    @InputImport(name="cachingConfig")
    private final @Nullable Input<ResolverCachingConfigGetArgs> cachingConfig;

    public Input<ResolverCachingConfigGetArgs> getCachingConfig() {
        return this.cachingConfig == null ? Input.empty() : this.cachingConfig;
    }

    /**
     * The DataSource name.
     * 
     */
    @InputImport(name="dataSource")
    private final @Nullable Input<String> dataSource;

    public Input<String> getDataSource() {
        return this.dataSource == null ? Input.empty() : this.dataSource;
    }

    /**
     * The field name from the schema defined in the GraphQL API.
     * 
     */
    @InputImport(name="field")
    private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    /**
     * The resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @InputImport(name="maxBatchSize")
    private final @Nullable Input<Integer> maxBatchSize;

    public Input<Integer> getMaxBatchSize() {
        return this.maxBatchSize == null ? Input.empty() : this.maxBatchSize;
    }

    /**
     * The PipelineConfig.
     * 
     */
    @InputImport(name="pipelineConfig")
    private final @Nullable Input<ResolverPipelineConfigGetArgs> pipelineConfig;

    public Input<ResolverPipelineConfigGetArgs> getPipelineConfig() {
        return this.pipelineConfig == null ? Input.empty() : this.pipelineConfig;
    }

    /**
     * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @InputImport(name="requestTemplate")
    private final @Nullable Input<String> requestTemplate;

    public Input<String> getRequestTemplate() {
        return this.requestTemplate == null ? Input.empty() : this.requestTemplate;
    }

    /**
     * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @InputImport(name="responseTemplate")
    private final @Nullable Input<String> responseTemplate;

    public Input<String> getResponseTemplate() {
        return this.responseTemplate == null ? Input.empty() : this.responseTemplate;
    }

    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @InputImport(name="syncConfig")
    private final @Nullable Input<ResolverSyncConfigGetArgs> syncConfig;

    public Input<ResolverSyncConfigGetArgs> getSyncConfig() {
        return this.syncConfig == null ? Input.empty() : this.syncConfig;
    }

    /**
     * The type name from the schema defined in the GraphQL API.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ResolverState(
        @Nullable Input<String> apiId,
        @Nullable Input<String> arn,
        @Nullable Input<ResolverCachingConfigGetArgs> cachingConfig,
        @Nullable Input<String> dataSource,
        @Nullable Input<String> field,
        @Nullable Input<String> kind,
        @Nullable Input<Integer> maxBatchSize,
        @Nullable Input<ResolverPipelineConfigGetArgs> pipelineConfig,
        @Nullable Input<String> requestTemplate,
        @Nullable Input<String> responseTemplate,
        @Nullable Input<ResolverSyncConfigGetArgs> syncConfig,
        @Nullable Input<String> type) {
        this.apiId = apiId;
        this.arn = arn;
        this.cachingConfig = cachingConfig;
        this.dataSource = dataSource;
        this.field = field;
        this.kind = kind;
        this.maxBatchSize = maxBatchSize;
        this.pipelineConfig = pipelineConfig;
        this.requestTemplate = requestTemplate;
        this.responseTemplate = responseTemplate;
        this.syncConfig = syncConfig;
        this.type = type;
    }

    private ResolverState() {
        this.apiId = Input.empty();
        this.arn = Input.empty();
        this.cachingConfig = Input.empty();
        this.dataSource = Input.empty();
        this.field = Input.empty();
        this.kind = Input.empty();
        this.maxBatchSize = Input.empty();
        this.pipelineConfig = Input.empty();
        this.requestTemplate = Input.empty();
        this.responseTemplate = Input.empty();
        this.syncConfig = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> arn;
        private @Nullable Input<ResolverCachingConfigGetArgs> cachingConfig;
        private @Nullable Input<String> dataSource;
        private @Nullable Input<String> field;
        private @Nullable Input<String> kind;
        private @Nullable Input<Integer> maxBatchSize;
        private @Nullable Input<ResolverPipelineConfigGetArgs> pipelineConfig;
        private @Nullable Input<String> requestTemplate;
        private @Nullable Input<String> responseTemplate;
        private @Nullable Input<ResolverSyncConfigGetArgs> syncConfig;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.arn = defaults.arn;
    	      this.cachingConfig = defaults.cachingConfig;
    	      this.dataSource = defaults.dataSource;
    	      this.field = defaults.field;
    	      this.kind = defaults.kind;
    	      this.maxBatchSize = defaults.maxBatchSize;
    	      this.pipelineConfig = defaults.pipelineConfig;
    	      this.requestTemplate = defaults.requestTemplate;
    	      this.responseTemplate = defaults.responseTemplate;
    	      this.syncConfig = defaults.syncConfig;
    	      this.type = defaults.type;
        }

        public Builder setApiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder setApiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCachingConfig(@Nullable Input<ResolverCachingConfigGetArgs> cachingConfig) {
            this.cachingConfig = cachingConfig;
            return this;
        }

        public Builder setCachingConfig(@Nullable ResolverCachingConfigGetArgs cachingConfig) {
            this.cachingConfig = Input.ofNullable(cachingConfig);
            return this;
        }

        public Builder setDataSource(@Nullable Input<String> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setDataSource(@Nullable String dataSource) {
            this.dataSource = Input.ofNullable(dataSource);
            return this;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMaxBatchSize(@Nullable Input<Integer> maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
            return this;
        }

        public Builder setMaxBatchSize(@Nullable Integer maxBatchSize) {
            this.maxBatchSize = Input.ofNullable(maxBatchSize);
            return this;
        }

        public Builder setPipelineConfig(@Nullable Input<ResolverPipelineConfigGetArgs> pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }

        public Builder setPipelineConfig(@Nullable ResolverPipelineConfigGetArgs pipelineConfig) {
            this.pipelineConfig = Input.ofNullable(pipelineConfig);
            return this;
        }

        public Builder setRequestTemplate(@Nullable Input<String> requestTemplate) {
            this.requestTemplate = requestTemplate;
            return this;
        }

        public Builder setRequestTemplate(@Nullable String requestTemplate) {
            this.requestTemplate = Input.ofNullable(requestTemplate);
            return this;
        }

        public Builder setResponseTemplate(@Nullable Input<String> responseTemplate) {
            this.responseTemplate = responseTemplate;
            return this;
        }

        public Builder setResponseTemplate(@Nullable String responseTemplate) {
            this.responseTemplate = Input.ofNullable(responseTemplate);
            return this;
        }

        public Builder setSyncConfig(@Nullable Input<ResolverSyncConfigGetArgs> syncConfig) {
            this.syncConfig = syncConfig;
            return this;
        }

        public Builder setSyncConfig(@Nullable ResolverSyncConfigGetArgs syncConfig) {
            this.syncConfig = Input.ofNullable(syncConfig);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ResolverState build() {
            return new ResolverState(apiId, arn, cachingConfig, dataSource, field, kind, maxBatchSize, pipelineConfig, requestTemplate, responseTemplate, syncConfig, type);
        }
    }
}