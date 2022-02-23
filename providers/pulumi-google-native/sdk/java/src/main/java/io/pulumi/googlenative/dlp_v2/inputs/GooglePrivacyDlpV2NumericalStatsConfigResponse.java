// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.Objects;


/**
 * Compute numerical stats over an individual column, including min, max, and quantiles.
 * 
 */
public final class GooglePrivacyDlpV2NumericalStatsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2NumericalStatsConfigResponse Empty = new GooglePrivacyDlpV2NumericalStatsConfigResponse();

    /**
     * Field to compute numerical stats on. Supported types are integer, float, date, datetime, timestamp, time.
     * 
     */
    @InputImport(name="field", required=true)
      private final GooglePrivacyDlpV2FieldIdResponse field;

    public GooglePrivacyDlpV2FieldIdResponse getField() {
        return this.field;
    }

    public GooglePrivacyDlpV2NumericalStatsConfigResponse(GooglePrivacyDlpV2FieldIdResponse field) {
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
    }

    private GooglePrivacyDlpV2NumericalStatsConfigResponse() {
        this.field = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2NumericalStatsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2NumericalStatsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder setField(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public GooglePrivacyDlpV2NumericalStatsConfigResponse build() {
            return new GooglePrivacyDlpV2NumericalStatsConfigResponse(field);
        }
    }
}
