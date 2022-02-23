// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnalyticsApplicationReferenceDataSourcesSchema {
    /**
     * The Record Column mapping for the streaming source data element.
     * See Record Columns below for more details.
     * 
     */
    private final List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn> recordColumns;
    /**
     * The Encoding of the record in the streaming source.
     * 
     */
    private final @Nullable String recordEncoding;
    /**
     * The Record Format and mapping information to schematize a record.
     * See Record Format below for more details.
     * 
     */
    private final AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat recordFormat;

    @OutputCustomType.Constructor({"recordColumns","recordEncoding","recordFormat"})
    private AnalyticsApplicationReferenceDataSourcesSchema(
        List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn> recordColumns,
        @Nullable String recordEncoding,
        AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat recordFormat) {
        this.recordColumns = Objects.requireNonNull(recordColumns);
        this.recordEncoding = recordEncoding;
        this.recordFormat = Objects.requireNonNull(recordFormat);
    }

    /**
     * The Record Column mapping for the streaming source data element.
     * See Record Columns below for more details.
     * 
     */
    public List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn> getRecordColumns() {
        return this.recordColumns;
    }
    /**
     * The Encoding of the record in the streaming source.
     * 
     */
    public Optional<String> getRecordEncoding() {
        return Optional.ofNullable(this.recordEncoding);
    }
    /**
     * The Record Format and mapping information to schematize a record.
     * See Record Format below for more details.
     * 
     */
    public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat getRecordFormat() {
        return this.recordFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn> recordColumns;
        private @Nullable String recordEncoding;
        private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat recordFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumns = defaults.recordColumns;
    	      this.recordEncoding = defaults.recordEncoding;
    	      this.recordFormat = defaults.recordFormat;
        }

        public Builder setRecordColumns(List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn> recordColumns) {
            this.recordColumns = Objects.requireNonNull(recordColumns);
            return this;
        }

        public Builder setRecordEncoding(@Nullable String recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }

        public Builder setRecordFormat(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat recordFormat) {
            this.recordFormat = Objects.requireNonNull(recordFormat);
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchema build() {
            return new AnalyticsApplicationReferenceDataSourcesSchema(recordColumns, recordEncoding, recordFormat);
        }
    }
}
