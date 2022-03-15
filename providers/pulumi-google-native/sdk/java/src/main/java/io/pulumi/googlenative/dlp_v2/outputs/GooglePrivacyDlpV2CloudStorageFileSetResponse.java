// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2CloudStorageFileSetResponse {
    /**
     * The url, in the format `gs:///`. Trailing wildcard in the path is allowed.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GooglePrivacyDlpV2CloudStorageFileSetResponse(@CustomType.Parameter("url") String url) {
        this.url = url;
    }

    /**
     * The url, in the format `gs:///`. Trailing wildcard in the path is allowed.
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageFileSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStorageFileSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GooglePrivacyDlpV2CloudStorageFileSetResponse build() {
            return new GooglePrivacyDlpV2CloudStorageFileSetResponse(url);
        }
    }
}
