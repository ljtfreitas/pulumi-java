// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputCosmosdbArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputCosmosdbArgs Empty = new OutputCosmosdbArgs();

    /**
     * The name of the CosmosDB container.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return The name of the CosmosDB container.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The account key for the CosmosDB database.
     * 
     */
    @Import(name="cosmosdbAccountKey", required=true)
    private Output<String> cosmosdbAccountKey;

    /**
     * @return The account key for the CosmosDB database.
     * 
     */
    public Output<String> cosmosdbAccountKey() {
        return this.cosmosdbAccountKey;
    }

    /**
     * The ID of the CosmosDB database.
     * 
     */
    @Import(name="cosmosdbSqlDatabaseId", required=true)
    private Output<String> cosmosdbSqlDatabaseId;

    /**
     * @return The ID of the CosmosDB database.
     * 
     */
    public Output<String> cosmosdbSqlDatabaseId() {
        return this.cosmosdbSqlDatabaseId;
    }

    /**
     * The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
     */
    @Import(name="documentId")
    private @Nullable Output<String> documentId;

    /**
     * @return The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
     */
    public Optional<Output<String>> documentId() {
        return Optional.ofNullable(this.documentId);
    }

    /**
     * The name of the Stream Analytics Output. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Analytics Output. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobId", required=true)
    private Output<String> streamAnalyticsJobId;

    /**
     * @return The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobId() {
        return this.streamAnalyticsJobId;
    }

    private OutputCosmosdbArgs() {}

    private OutputCosmosdbArgs(OutputCosmosdbArgs $) {
        this.containerName = $.containerName;
        this.cosmosdbAccountKey = $.cosmosdbAccountKey;
        this.cosmosdbSqlDatabaseId = $.cosmosdbSqlDatabaseId;
        this.documentId = $.documentId;
        this.name = $.name;
        this.streamAnalyticsJobId = $.streamAnalyticsJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputCosmosdbArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputCosmosdbArgs $;

        public Builder() {
            $ = new OutputCosmosdbArgs();
        }

        public Builder(OutputCosmosdbArgs defaults) {
            $ = new OutputCosmosdbArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName The name of the CosmosDB container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The name of the CosmosDB container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param cosmosdbAccountKey The account key for the CosmosDB database.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbAccountKey(Output<String> cosmosdbAccountKey) {
            $.cosmosdbAccountKey = cosmosdbAccountKey;
            return this;
        }

        /**
         * @param cosmosdbAccountKey The account key for the CosmosDB database.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbAccountKey(String cosmosdbAccountKey) {
            return cosmosdbAccountKey(Output.of(cosmosdbAccountKey));
        }

        /**
         * @param cosmosdbSqlDatabaseId The ID of the CosmosDB database.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbSqlDatabaseId(Output<String> cosmosdbSqlDatabaseId) {
            $.cosmosdbSqlDatabaseId = cosmosdbSqlDatabaseId;
            return this;
        }

        /**
         * @param cosmosdbSqlDatabaseId The ID of the CosmosDB database.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbSqlDatabaseId(String cosmosdbSqlDatabaseId) {
            return cosmosdbSqlDatabaseId(Output.of(cosmosdbSqlDatabaseId));
        }

        /**
         * @param documentId The name of the field in output events used to specify the primary key which insert or update operations are based on.
         * 
         * @return builder
         * 
         */
        public Builder documentId(@Nullable Output<String> documentId) {
            $.documentId = documentId;
            return this;
        }

        /**
         * @param documentId The name of the field in output events used to specify the primary key which insert or update operations are based on.
         * 
         * @return builder
         * 
         */
        public Builder documentId(String documentId) {
            return documentId(Output.of(documentId));
        }

        /**
         * @param name The name of the Stream Analytics Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Analytics Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param streamAnalyticsJobId The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(Output<String> streamAnalyticsJobId) {
            $.streamAnalyticsJobId = streamAnalyticsJobId;
            return this;
        }

        /**
         * @param streamAnalyticsJobId The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(String streamAnalyticsJobId) {
            return streamAnalyticsJobId(Output.of(streamAnalyticsJobId));
        }

        public OutputCosmosdbArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.cosmosdbAccountKey = Objects.requireNonNull($.cosmosdbAccountKey, "expected parameter 'cosmosdbAccountKey' to be non-null");
            $.cosmosdbSqlDatabaseId = Objects.requireNonNull($.cosmosdbSqlDatabaseId, "expected parameter 'cosmosdbSqlDatabaseId' to be non-null");
            $.streamAnalyticsJobId = Objects.requireNonNull($.streamAnalyticsJobId, "expected parameter 'streamAnalyticsJobId' to be non-null");
            return $;
        }
    }

}
