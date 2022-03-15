// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs();

    /**
     * The Mapping reference to the data element.
     * 
     */
    @Import(name="mapping")
      private final @Nullable Output<String> mapping;

    public Output<String> getMapping() {
        return this.mapping == null ? Output.empty() : this.mapping;
    }

    /**
     * Name of the column.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The SQL Type of the column.
     * 
     */
    @Import(name="sqlType", required=true)
      private final Output<String> sqlType;

    public Output<String> getSqlType() {
        return this.sqlType;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs(
        @Nullable Output<String> mapping,
        Output<String> name,
        Output<String> sqlType) {
        this.mapping = mapping;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sqlType = Objects.requireNonNull(sqlType, "expected parameter 'sqlType' to be non-null");
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs() {
        this.mapping = Output.empty();
        this.name = Output.empty();
        this.sqlType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mapping;
        private Output<String> name;
        private Output<String> sqlType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapping = defaults.mapping;
    	      this.name = defaults.name;
    	      this.sqlType = defaults.sqlType;
        }

        public Builder mapping(@Nullable Output<String> mapping) {
            this.mapping = mapping;
            return this;
        }

        public Builder mapping(@Nullable String mapping) {
            this.mapping = Output.ofNullable(mapping);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder sqlType(Output<String> sqlType) {
            this.sqlType = Objects.requireNonNull(sqlType);
            return this;
        }

        public Builder sqlType(String sqlType) {
            this.sqlType = Output.of(Objects.requireNonNull(sqlType));
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs(mapping, name, sqlType);
        }
    }
}
