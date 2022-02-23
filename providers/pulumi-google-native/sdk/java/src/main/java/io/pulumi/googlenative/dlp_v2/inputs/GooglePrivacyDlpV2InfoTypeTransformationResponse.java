// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2PrimitiveTransformationResponse;
import java.util.List;
import java.util.Objects;


/**
 * A transformation to apply to text that is identified as a specific info_type.
 * 
 */
public final class GooglePrivacyDlpV2InfoTypeTransformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InfoTypeTransformationResponse Empty = new GooglePrivacyDlpV2InfoTypeTransformationResponse();

    /**
     * InfoTypes to apply the transformation to. An empty list will cause this transformation to apply to all findings that correspond to infoTypes that were requested in `InspectConfig`.
     * 
     */
    @InputImport(name="infoTypes", required=true)
      private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

    public List<GooglePrivacyDlpV2InfoTypeResponse> getInfoTypes() {
        return this.infoTypes;
    }

    /**
     * Primitive transformation to apply to the infoType.
     * 
     */
    @InputImport(name="primitiveTransformation", required=true)
      private final GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

    public GooglePrivacyDlpV2PrimitiveTransformationResponse getPrimitiveTransformation() {
        return this.primitiveTransformation;
    }

    public GooglePrivacyDlpV2InfoTypeTransformationResponse(
        List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes,
        GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
        this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation, "expected parameter 'primitiveTransformation' to be non-null");
    }

    private GooglePrivacyDlpV2InfoTypeTransformationResponse() {
        this.infoTypes = List.of();
        this.primitiveTransformation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeTransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
        private GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeTransformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.primitiveTransformation = defaults.primitiveTransformation;
        }

        public Builder setInfoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }

        public Builder setPrimitiveTransformation(GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
            this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation);
            return this;
        }
        public GooglePrivacyDlpV2InfoTypeTransformationResponse build() {
            return new GooglePrivacyDlpV2InfoTypeTransformationResponse(infoTypes, primitiveTransformation);
        }
    }
}
