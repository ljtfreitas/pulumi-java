// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1beta2.inputs.LoggingConfigArgs;
import com.pulumi.googlenative.dataproc.v1beta2.inputs.QueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Presto (https://prestosql.io/) queries. IMPORTANT: The Dataproc Presto Optional Component (https://cloud.google.com/dataproc/docs/concepts/components/presto) must be enabled when the cluster is created to submit a Presto job to the cluster.
 * 
 */
public final class PrestoJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrestoJobArgs Empty = new PrestoJobArgs();

    /**
     * Optional. Presto client tags to attach to this query
     * 
     */
    @Import(name="clientTags")
    private @Nullable Output<List<String>> clientTags;

    /**
     * @return Optional. Presto client tags to attach to this query
     * 
     */
    public Optional<Output<List<String>>> clientTags() {
        return Optional.ofNullable(this.clientTags);
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure")
    private @Nullable Output<Boolean> continueOnFailure;

    /**
     * @return Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    public Optional<Output<Boolean>> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<LoggingConfigArgs> loggingConfig;

    /**
     * @return Optional. The runtime log config for job execution.
     * 
     */
    public Optional<Output<LoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    @Import(name="outputFormat")
    private @Nullable Output<String> outputFormat;

    /**
     * @return Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    public Optional<Output<String>> outputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }

    /**
     * Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri")
    private @Nullable Output<String> queryFileUri;

    /**
     * @return The HCFS URI of the script that contains SQL queries.
     * 
     */
    public Optional<Output<String>> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList")
    private @Nullable Output<QueryListArgs> queryList;

    /**
     * @return A list of queries.
     * 
     */
    public Optional<Output<QueryListArgs>> queryList() {
        return Optional.ofNullable(this.queryList);
    }

    private PrestoJobArgs() {}

    private PrestoJobArgs(PrestoJobArgs $) {
        this.clientTags = $.clientTags;
        this.continueOnFailure = $.continueOnFailure;
        this.loggingConfig = $.loggingConfig;
        this.outputFormat = $.outputFormat;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryList = $.queryList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrestoJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrestoJobArgs $;

        public Builder() {
            $ = new PrestoJobArgs();
        }

        public Builder(PrestoJobArgs defaults) {
            $ = new PrestoJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientTags Optional. Presto client tags to attach to this query
         * 
         * @return builder
         * 
         */
        public Builder clientTags(@Nullable Output<List<String>> clientTags) {
            $.clientTags = clientTags;
            return this;
        }

        /**
         * @param clientTags Optional. Presto client tags to attach to this query
         * 
         * @return builder
         * 
         */
        public Builder clientTags(List<String> clientTags) {
            return clientTags(Output.of(clientTags));
        }

        /**
         * @param clientTags Optional. Presto client tags to attach to this query
         * 
         * @return builder
         * 
         */
        public Builder clientTags(String... clientTags) {
            return clientTags(List.of(clientTags));
        }

        /**
         * @param continueOnFailure Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
         * 
         * @return builder
         * 
         */
        public Builder continueOnFailure(@Nullable Output<Boolean> continueOnFailure) {
            $.continueOnFailure = continueOnFailure;
            return this;
        }

        /**
         * @param continueOnFailure Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
         * 
         * @return builder
         * 
         */
        public Builder continueOnFailure(Boolean continueOnFailure) {
            return continueOnFailure(Output.of(continueOnFailure));
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(LoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param outputFormat Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(@Nullable Output<String> outputFormat) {
            $.outputFormat = outputFormat;
            return this;
        }

        /**
         * @param outputFormat Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(String outputFormat) {
            return outputFormat(Output.of(outputFormat));
        }

        /**
         * @param properties Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param queryFileUri The HCFS URI of the script that contains SQL queries.
         * 
         * @return builder
         * 
         */
        public Builder queryFileUri(@Nullable Output<String> queryFileUri) {
            $.queryFileUri = queryFileUri;
            return this;
        }

        /**
         * @param queryFileUri The HCFS URI of the script that contains SQL queries.
         * 
         * @return builder
         * 
         */
        public Builder queryFileUri(String queryFileUri) {
            return queryFileUri(Output.of(queryFileUri));
        }

        /**
         * @param queryList A list of queries.
         * 
         * @return builder
         * 
         */
        public Builder queryList(@Nullable Output<QueryListArgs> queryList) {
            $.queryList = queryList;
            return this;
        }

        /**
         * @param queryList A list of queries.
         * 
         * @return builder
         * 
         */
        public Builder queryList(QueryListArgs queryList) {
            return queryList(Output.of(queryList));
        }

        public PrestoJobArgs build() {
            return $;
        }
    }

}
