// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2BigQueryTableResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2OutputStorageConfigResponse {
    private final String outputSchema;
    private final GooglePrivacyDlpV2BigQueryTableResponse table;

    @OutputCustomType.Constructor({"outputSchema","table"})
    private GooglePrivacyDlpV2OutputStorageConfigResponse(
        String outputSchema,
        GooglePrivacyDlpV2BigQueryTableResponse table) {
        this.outputSchema = Objects.requireNonNull(outputSchema);
        this.table = Objects.requireNonNull(table);
    }

    public String getOutputSchema() {
        return this.outputSchema;
    }
    public GooglePrivacyDlpV2BigQueryTableResponse getTable() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2OutputStorageConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String outputSchema;
        private GooglePrivacyDlpV2BigQueryTableResponse table;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2OutputStorageConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputSchema = defaults.outputSchema;
    	      this.table = defaults.table;
        }

        public Builder setOutputSchema(String outputSchema) {
            this.outputSchema = Objects.requireNonNull(outputSchema);
            return this;
        }

        public Builder setTable(GooglePrivacyDlpV2BigQueryTableResponse table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public GooglePrivacyDlpV2OutputStorageConfigResponse build() {
            return new GooglePrivacyDlpV2OutputStorageConfigResponse(outputSchema, table);
        }
    }
}