// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesS3GetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationReferenceDataSourcesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesGetArgs Empty = new AnalyticsApplicationReferenceDataSourcesGetArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The S3 configuration for the reference data source. See S3 Reference below for more details.
     * 
     */
    @Import(name="s3", required=true)
      private final Output<AnalyticsApplicationReferenceDataSourcesS3GetArgs> s3;

    public Output<AnalyticsApplicationReferenceDataSourcesS3GetArgs> getS3() {
        return this.s3;
    }

    /**
     * The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
     */
    @Import(name="schema", required=true)
      private final Output<AnalyticsApplicationReferenceDataSourcesSchemaGetArgs> schema;

    public Output<AnalyticsApplicationReferenceDataSourcesSchemaGetArgs> getSchema() {
        return this.schema;
    }

    /**
     * The in-application Table Name.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    public AnalyticsApplicationReferenceDataSourcesGetArgs(
        @Nullable Output<String> id,
        Output<AnalyticsApplicationReferenceDataSourcesS3GetArgs> s3,
        Output<AnalyticsApplicationReferenceDataSourcesSchemaGetArgs> schema,
        Output<String> tableName) {
        this.id = id;
        this.s3 = Objects.requireNonNull(s3, "expected parameter 's3' to be non-null");
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private AnalyticsApplicationReferenceDataSourcesGetArgs() {
        this.id = Output.empty();
        this.s3 = Output.empty();
        this.schema = Output.empty();
        this.tableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private Output<AnalyticsApplicationReferenceDataSourcesS3GetArgs> s3;
        private Output<AnalyticsApplicationReferenceDataSourcesSchemaGetArgs> schema;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.s3 = defaults.s3;
    	      this.schema = defaults.schema;
    	      this.tableName = defaults.tableName;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder s3(Output<AnalyticsApplicationReferenceDataSourcesS3GetArgs> s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }

        public Builder s3(AnalyticsApplicationReferenceDataSourcesS3GetArgs s3) {
            this.s3 = Output.of(Objects.requireNonNull(s3));
            return this;
        }

        public Builder schema(Output<AnalyticsApplicationReferenceDataSourcesSchemaGetArgs> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder schema(AnalyticsApplicationReferenceDataSourcesSchemaGetArgs schema) {
            this.schema = Output.of(Objects.requireNonNull(schema));
            return this;
        }

        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesGetArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesGetArgs(id, s3, schema, tableName);
        }
    }
}
