// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Instruction from a PDF file.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1PdfInstructionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1PdfInstructionResponse Empty = new GoogleCloudDatalabelingV1beta1PdfInstructionResponse();

    /**
     * PDF file for the instruction. Only gcs path is allowed.
     * 
     */
    @Import(name="gcsFileUri", required=true)
      private final String gcsFileUri;

    public String getGcsFileUri() {
        return this.gcsFileUri;
    }

    public GoogleCloudDatalabelingV1beta1PdfInstructionResponse(String gcsFileUri) {
        this.gcsFileUri = Objects.requireNonNull(gcsFileUri, "expected parameter 'gcsFileUri' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1PdfInstructionResponse() {
        this.gcsFileUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1PdfInstructionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsFileUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1PdfInstructionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsFileUri = defaults.gcsFileUri;
        }

        public Builder gcsFileUri(String gcsFileUri) {
            this.gcsFileUri = Objects.requireNonNull(gcsFileUri);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1PdfInstructionResponse build() {
            return new GoogleCloudDatalabelingV1beta1PdfInstructionResponse(gcsFileUri);
        }
    }
}
