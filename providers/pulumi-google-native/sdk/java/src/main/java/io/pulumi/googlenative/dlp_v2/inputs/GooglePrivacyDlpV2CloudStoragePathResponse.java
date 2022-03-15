// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Message representing a single file or path in Cloud Storage.
 * 
 */
public final class GooglePrivacyDlpV2CloudStoragePathResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2CloudStoragePathResponse Empty = new GooglePrivacyDlpV2CloudStoragePathResponse();

    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: gs://[BUCKET_NAME]/dictionary.txt
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    public GooglePrivacyDlpV2CloudStoragePathResponse(String path) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private GooglePrivacyDlpV2CloudStoragePathResponse() {
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStoragePathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStoragePathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public GooglePrivacyDlpV2CloudStoragePathResponse build() {
            return new GooglePrivacyDlpV2CloudStoragePathResponse(path);
        }
    }
}
