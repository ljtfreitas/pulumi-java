// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datalabeling_v1beta1.enums.GoogleCloudDatalabelingV1beta1InputConfigAnnotationType;
import io.pulumi.googlenative.datalabeling_v1beta1.enums.GoogleCloudDatalabelingV1beta1InputConfigDataType;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1BigQuerySourceArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1GcsSourceArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1TextMetadataArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration of input data, including data type, location, etc.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1InputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1InputConfigArgs Empty = new GoogleCloudDatalabelingV1beta1InputConfigArgs();

    /**
     * Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    @InputImport(name="annotationType")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1InputConfigAnnotationType> annotationType;

    public Input<GoogleCloudDatalabelingV1beta1InputConfigAnnotationType> getAnnotationType() {
        return this.annotationType == null ? Input.empty() : this.annotationType;
    }

    /**
     * Source located in BigQuery. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    @InputImport(name="bigquerySource")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1BigQuerySourceArgs> bigquerySource;

    public Input<GoogleCloudDatalabelingV1beta1BigQuerySourceArgs> getBigquerySource() {
        return this.bigquerySource == null ? Input.empty() : this.bigquerySource;
    }

    /**
     * Optional. Metadata about annotations for the input. You must specify this field if you are using this InputConfig in an EvaluationJob for a model version that performs classification.
     * 
     */
    @InputImport(name="classificationMetadata")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs> classificationMetadata;

    public Input<GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs> getClassificationMetadata() {
        return this.classificationMetadata == null ? Input.empty() : this.classificationMetadata;
    }

    /**
     * Data type must be specifed when user tries to import data.
     * 
     */
    @InputImport(name="dataType", required=true)
      private final Input<GoogleCloudDatalabelingV1beta1InputConfigDataType> dataType;

    public Input<GoogleCloudDatalabelingV1beta1InputConfigDataType> getDataType() {
        return this.dataType;
    }

    /**
     * Source located in Cloud Storage.
     * 
     */
    @InputImport(name="gcsSource")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1GcsSourceArgs> gcsSource;

    public Input<GoogleCloudDatalabelingV1beta1GcsSourceArgs> getGcsSource() {
        return this.gcsSource == null ? Input.empty() : this.gcsSource;
    }

    /**
     * Required for text import, as language code must be specified.
     * 
     */
    @InputImport(name="textMetadata")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1TextMetadataArgs> textMetadata;

    public Input<GoogleCloudDatalabelingV1beta1TextMetadataArgs> getTextMetadata() {
        return this.textMetadata == null ? Input.empty() : this.textMetadata;
    }

    public GoogleCloudDatalabelingV1beta1InputConfigArgs(
        @Nullable Input<GoogleCloudDatalabelingV1beta1InputConfigAnnotationType> annotationType,
        @Nullable Input<GoogleCloudDatalabelingV1beta1BigQuerySourceArgs> bigquerySource,
        @Nullable Input<GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs> classificationMetadata,
        Input<GoogleCloudDatalabelingV1beta1InputConfigDataType> dataType,
        @Nullable Input<GoogleCloudDatalabelingV1beta1GcsSourceArgs> gcsSource,
        @Nullable Input<GoogleCloudDatalabelingV1beta1TextMetadataArgs> textMetadata) {
        this.annotationType = annotationType;
        this.bigquerySource = bigquerySource;
        this.classificationMetadata = classificationMetadata;
        this.dataType = Objects.requireNonNull(dataType, "expected parameter 'dataType' to be non-null");
        this.gcsSource = gcsSource;
        this.textMetadata = textMetadata;
    }

    private GoogleCloudDatalabelingV1beta1InputConfigArgs() {
        this.annotationType = Input.empty();
        this.bigquerySource = Input.empty();
        this.classificationMetadata = Input.empty();
        this.dataType = Input.empty();
        this.gcsSource = Input.empty();
        this.textMetadata = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1InputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDatalabelingV1beta1InputConfigAnnotationType> annotationType;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1BigQuerySourceArgs> bigquerySource;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs> classificationMetadata;
        private Input<GoogleCloudDatalabelingV1beta1InputConfigDataType> dataType;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1GcsSourceArgs> gcsSource;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1TextMetadataArgs> textMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1InputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationType = defaults.annotationType;
    	      this.bigquerySource = defaults.bigquerySource;
    	      this.classificationMetadata = defaults.classificationMetadata;
    	      this.dataType = defaults.dataType;
    	      this.gcsSource = defaults.gcsSource;
    	      this.textMetadata = defaults.textMetadata;
        }

        public Builder setAnnotationType(@Nullable Input<GoogleCloudDatalabelingV1beta1InputConfigAnnotationType> annotationType) {
            this.annotationType = annotationType;
            return this;
        }

        public Builder setAnnotationType(@Nullable GoogleCloudDatalabelingV1beta1InputConfigAnnotationType annotationType) {
            this.annotationType = Input.ofNullable(annotationType);
            return this;
        }

        public Builder setBigquerySource(@Nullable Input<GoogleCloudDatalabelingV1beta1BigQuerySourceArgs> bigquerySource) {
            this.bigquerySource = bigquerySource;
            return this;
        }

        public Builder setBigquerySource(@Nullable GoogleCloudDatalabelingV1beta1BigQuerySourceArgs bigquerySource) {
            this.bigquerySource = Input.ofNullable(bigquerySource);
            return this;
        }

        public Builder setClassificationMetadata(@Nullable Input<GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs> classificationMetadata) {
            this.classificationMetadata = classificationMetadata;
            return this;
        }

        public Builder setClassificationMetadata(@Nullable GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs classificationMetadata) {
            this.classificationMetadata = Input.ofNullable(classificationMetadata);
            return this;
        }

        public Builder setDataType(Input<GoogleCloudDatalabelingV1beta1InputConfigDataType> dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder setDataType(GoogleCloudDatalabelingV1beta1InputConfigDataType dataType) {
            this.dataType = Input.of(Objects.requireNonNull(dataType));
            return this;
        }

        public Builder setGcsSource(@Nullable Input<GoogleCloudDatalabelingV1beta1GcsSourceArgs> gcsSource) {
            this.gcsSource = gcsSource;
            return this;
        }

        public Builder setGcsSource(@Nullable GoogleCloudDatalabelingV1beta1GcsSourceArgs gcsSource) {
            this.gcsSource = Input.ofNullable(gcsSource);
            return this;
        }

        public Builder setTextMetadata(@Nullable Input<GoogleCloudDatalabelingV1beta1TextMetadataArgs> textMetadata) {
            this.textMetadata = textMetadata;
            return this;
        }

        public Builder setTextMetadata(@Nullable GoogleCloudDatalabelingV1beta1TextMetadataArgs textMetadata) {
            this.textMetadata = Input.ofNullable(textMetadata);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1InputConfigArgs build() {
            return new GoogleCloudDatalabelingV1beta1InputConfigArgs(annotationType, bigquerySource, classificationMetadata, dataType, gcsSource, textMetadata);
        }
    }
}
