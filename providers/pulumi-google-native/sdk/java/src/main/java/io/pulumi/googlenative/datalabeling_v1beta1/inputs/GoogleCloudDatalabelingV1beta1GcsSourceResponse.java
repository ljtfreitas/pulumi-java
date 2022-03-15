// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Source of the Cloud Storage file to be imported.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1GcsSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1GcsSourceResponse Empty = new GoogleCloudDatalabelingV1beta1GcsSourceResponse();

    /**
     * The input URI of source file. This must be a Cloud Storage path (`gs://...`).
     * 
     */
    @Import(name="inputUri", required=true)
      private final String inputUri;

    public String getInputUri() {
        return this.inputUri;
    }

    /**
     * The format of the source file. Only "text/csv" is supported.
     * 
     */
    @Import(name="mimeType", required=true)
      private final String mimeType;

    public String getMimeType() {
        return this.mimeType;
    }

    public GoogleCloudDatalabelingV1beta1GcsSourceResponse(
        String inputUri,
        String mimeType) {
        this.inputUri = Objects.requireNonNull(inputUri, "expected parameter 'inputUri' to be non-null");
        this.mimeType = Objects.requireNonNull(mimeType, "expected parameter 'mimeType' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1GcsSourceResponse() {
        this.inputUri = null;
        this.mimeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1GcsSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputUri;
        private String mimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1GcsSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputUri = defaults.inputUri;
    	      this.mimeType = defaults.mimeType;
        }

        public Builder inputUri(String inputUri) {
            this.inputUri = Objects.requireNonNull(inputUri);
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1GcsSourceResponse build() {
            return new GoogleCloudDatalabelingV1beta1GcsSourceResponse(inputUri, mimeType);
        }
    }
}
