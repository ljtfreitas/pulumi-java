// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeTransformationsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PrimitiveTransformationResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RecordConditionResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2FieldTransformationResponse {
    /**
     * Only apply the transformation if the condition evaluates to true for the given `RecordCondition`. The conditions are allowed to reference fields that are not used in the actual transformation. Example Use Cases: - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range. - Redact a field if the date of birth field is greater than 85.
     * 
     */
    private final GooglePrivacyDlpV2RecordConditionResponse condition;
    /**
     * Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId. FieldId name matching ignores the index. For example, instead of "contact.nums[0].type", use "contact.nums.type".
     * 
     */
    private final List<GooglePrivacyDlpV2FieldIdResponse> fields;
    /**
     * Treat the contents of the field as free text, and selectively transform content that matches an `InfoType`.
     * 
     */
    private final GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;
    /**
     * Apply the transformation to the entire field.
     * 
     */
    private final GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

    @OutputCustomType.Constructor({"condition","fields","infoTypeTransformations","primitiveTransformation"})
    private GooglePrivacyDlpV2FieldTransformationResponse(
        GooglePrivacyDlpV2RecordConditionResponse condition,
        List<GooglePrivacyDlpV2FieldIdResponse> fields,
        GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations,
        GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
        this.condition = Objects.requireNonNull(condition);
        this.fields = Objects.requireNonNull(fields);
        this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
        this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation);
    }

    /**
     * Only apply the transformation if the condition evaluates to true for the given `RecordCondition`. The conditions are allowed to reference fields that are not used in the actual transformation. Example Use Cases: - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range. - Redact a field if the date of birth field is greater than 85.
     * 
     */
    public GooglePrivacyDlpV2RecordConditionResponse getCondition() {
        return this.condition;
    }
    /**
     * Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId. FieldId name matching ignores the index. For example, instead of "contact.nums[0].type", use "contact.nums.type".
     * 
     */
    public List<GooglePrivacyDlpV2FieldIdResponse> getFields() {
        return this.fields;
    }
    /**
     * Treat the contents of the field as free text, and selectively transform content that matches an `InfoType`.
     * 
     */
    public GooglePrivacyDlpV2InfoTypeTransformationsResponse getInfoTypeTransformations() {
        return this.infoTypeTransformations;
    }
    /**
     * Apply the transformation to the entire field.
     * 
     */
    public GooglePrivacyDlpV2PrimitiveTransformationResponse getPrimitiveTransformation() {
        return this.primitiveTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2FieldTransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RecordConditionResponse condition;
        private List<GooglePrivacyDlpV2FieldIdResponse> fields;
        private GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;
        private GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2FieldTransformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.fields = defaults.fields;
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
    	      this.primitiveTransformation = defaults.primitiveTransformation;
        }

        public Builder setCondition(GooglePrivacyDlpV2RecordConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setFields(List<GooglePrivacyDlpV2FieldIdResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setInfoTypeTransformations(GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations) {
            this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
            return this;
        }

        public Builder setPrimitiveTransformation(GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
            this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation);
            return this;
        }
        public GooglePrivacyDlpV2FieldTransformationResponse build() {
            return new GooglePrivacyDlpV2FieldTransformationResponse(condition, fields, infoTypeTransformations, primitiveTransformation);
        }
    }
}
