// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationCsvOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationCsvOptionsGetArgs Empty = new TableExternalDataConfigurationCsvOptionsGetArgs();

    /**
     * Indicates if BigQuery should accept rows
     * that are missing trailing optional columns.
     * 
     */
    @Import(name="allowJaggedRows")
      private final @Nullable Output<Boolean> allowJaggedRows;

    public Output<Boolean> getAllowJaggedRows() {
        return this.allowJaggedRows == null ? Output.empty() : this.allowJaggedRows;
    }

    /**
     * Indicates if BigQuery should allow
     * quoted data sections that contain newline characters in a CSV file.
     * The default value is false.
     * 
     */
    @Import(name="allowQuotedNewlines")
      private final @Nullable Output<Boolean> allowQuotedNewlines;

    public Output<Boolean> getAllowQuotedNewlines() {
        return this.allowQuotedNewlines == null ? Output.empty() : this.allowQuotedNewlines;
    }

    /**
     * The character encoding of the data. The supported
     * values are UTF-8 or ISO-8859-1.
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<String> encoding;

    public Output<String> getEncoding() {
        return this.encoding == null ? Output.empty() : this.encoding;
    }

    /**
     * The separator for fields in a CSV file.
     * 
     */
    @Import(name="fieldDelimiter")
      private final @Nullable Output<String> fieldDelimiter;

    public Output<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Output.empty() : this.fieldDelimiter;
    }

    /**
     * The value that is used to quote data sections in a
     * CSV file. If your data does not contain quoted sections, set the
     * property value to an empty string. If your data contains quoted newline
     * characters, you must also set the `allow_quoted_newlines` property to true.
     * The API-side default is `"`, specified in the provider escaped as `\"`. Due to
     * limitations with default values, this value is required to be
     * explicitly set.
     * 
     */
    @Import(name="quote", required=true)
      private final Output<String> quote;

    public Output<String> getQuote() {
        return this.quote;
    }

    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
     */
    @Import(name="skipLeadingRows")
      private final @Nullable Output<Integer> skipLeadingRows;

    public Output<Integer> getSkipLeadingRows() {
        return this.skipLeadingRows == null ? Output.empty() : this.skipLeadingRows;
    }

    public TableExternalDataConfigurationCsvOptionsGetArgs(
        @Nullable Output<Boolean> allowJaggedRows,
        @Nullable Output<Boolean> allowQuotedNewlines,
        @Nullable Output<String> encoding,
        @Nullable Output<String> fieldDelimiter,
        Output<String> quote,
        @Nullable Output<Integer> skipLeadingRows) {
        this.allowJaggedRows = allowJaggedRows;
        this.allowQuotedNewlines = allowQuotedNewlines;
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.quote = Objects.requireNonNull(quote, "expected parameter 'quote' to be non-null");
        this.skipLeadingRows = skipLeadingRows;
    }

    private TableExternalDataConfigurationCsvOptionsGetArgs() {
        this.allowJaggedRows = Output.empty();
        this.allowQuotedNewlines = Output.empty();
        this.encoding = Output.empty();
        this.fieldDelimiter = Output.empty();
        this.quote = Output.empty();
        this.skipLeadingRows = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationCsvOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowJaggedRows;
        private @Nullable Output<Boolean> allowQuotedNewlines;
        private @Nullable Output<String> encoding;
        private @Nullable Output<String> fieldDelimiter;
        private Output<String> quote;
        private @Nullable Output<Integer> skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationCsvOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.quote = defaults.quote;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder allowJaggedRows(@Nullable Output<Boolean> allowJaggedRows) {
            this.allowJaggedRows = allowJaggedRows;
            return this;
        }

        public Builder allowJaggedRows(@Nullable Boolean allowJaggedRows) {
            this.allowJaggedRows = Output.ofNullable(allowJaggedRows);
            return this;
        }

        public Builder allowQuotedNewlines(@Nullable Output<Boolean> allowQuotedNewlines) {
            this.allowQuotedNewlines = allowQuotedNewlines;
            return this;
        }

        public Builder allowQuotedNewlines(@Nullable Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Output.ofNullable(allowQuotedNewlines);
            return this;
        }

        public Builder encoding(@Nullable Output<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder encoding(@Nullable String encoding) {
            this.encoding = Output.ofNullable(encoding);
            return this;
        }

        public Builder fieldDelimiter(@Nullable Output<String> fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder fieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = Output.ofNullable(fieldDelimiter);
            return this;
        }

        public Builder quote(Output<String> quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }

        public Builder quote(String quote) {
            this.quote = Output.of(Objects.requireNonNull(quote));
            return this;
        }

        public Builder skipLeadingRows(@Nullable Output<Integer> skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public Builder skipLeadingRows(@Nullable Integer skipLeadingRows) {
            this.skipLeadingRows = Output.ofNullable(skipLeadingRows);
            return this;
        }
        public TableExternalDataConfigurationCsvOptionsGetArgs build() {
            return new TableExternalDataConfigurationCsvOptionsGetArgs(allowJaggedRows, allowQuotedNewlines, encoding, fieldDelimiter, quote, skipLeadingRows);
        }
    }
}
