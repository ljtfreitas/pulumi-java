// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeTransformationsResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RecordTransformationsResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TransformationErrorHandlingResponse;
import java.util.Objects;


/**
 * The configuration that controls how the data will change.
 * 
 */
public final class GooglePrivacyDlpV2DeidentifyConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2DeidentifyConfigResponse Empty = new GooglePrivacyDlpV2DeidentifyConfigResponse();

    /**
     * Treat the dataset as free-form text and apply the same free text transformation everywhere.
     * 
     */
    @InputImport(name="infoTypeTransformations", required=true)
      private final GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;

    public GooglePrivacyDlpV2InfoTypeTransformationsResponse getInfoTypeTransformations() {
        return this.infoTypeTransformations;
    }

    /**
     * Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
     * 
     */
    @InputImport(name="recordTransformations", required=true)
      private final GooglePrivacyDlpV2RecordTransformationsResponse recordTransformations;

    public GooglePrivacyDlpV2RecordTransformationsResponse getRecordTransformations() {
        return this.recordTransformations;
    }

    /**
     * Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
     * 
     */
    @InputImport(name="transformationErrorHandling", required=true)
      private final GooglePrivacyDlpV2TransformationErrorHandlingResponse transformationErrorHandling;

    public GooglePrivacyDlpV2TransformationErrorHandlingResponse getTransformationErrorHandling() {
        return this.transformationErrorHandling;
    }

    public GooglePrivacyDlpV2DeidentifyConfigResponse(
        GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations,
        GooglePrivacyDlpV2RecordTransformationsResponse recordTransformations,
        GooglePrivacyDlpV2TransformationErrorHandlingResponse transformationErrorHandling) {
        this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations, "expected parameter 'infoTypeTransformations' to be non-null");
        this.recordTransformations = Objects.requireNonNull(recordTransformations, "expected parameter 'recordTransformations' to be non-null");
        this.transformationErrorHandling = Objects.requireNonNull(transformationErrorHandling, "expected parameter 'transformationErrorHandling' to be non-null");
    }

    private GooglePrivacyDlpV2DeidentifyConfigResponse() {
        this.infoTypeTransformations = null;
        this.recordTransformations = null;
        this.transformationErrorHandling = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeidentifyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;
        private GooglePrivacyDlpV2RecordTransformationsResponse recordTransformations;
        private GooglePrivacyDlpV2TransformationErrorHandlingResponse transformationErrorHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeidentifyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
    	      this.recordTransformations = defaults.recordTransformations;
    	      this.transformationErrorHandling = defaults.transformationErrorHandling;
        }

        public Builder setInfoTypeTransformations(GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations) {
            this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
            return this;
        }

        public Builder setRecordTransformations(GooglePrivacyDlpV2RecordTransformationsResponse recordTransformations) {
            this.recordTransformations = Objects.requireNonNull(recordTransformations);
            return this;
        }

        public Builder setTransformationErrorHandling(GooglePrivacyDlpV2TransformationErrorHandlingResponse transformationErrorHandling) {
            this.transformationErrorHandling = Objects.requireNonNull(transformationErrorHandling);
            return this;
        }
        public GooglePrivacyDlpV2DeidentifyConfigResponse build() {
            return new GooglePrivacyDlpV2DeidentifyConfigResponse(infoTypeTransformations, recordTransformations, transformationErrorHandling);
        }
    }
}
