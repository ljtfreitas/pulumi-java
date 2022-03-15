// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message representing a set of files in Cloud Storage.
 * 
 */
public final class GooglePrivacyDlpV2CloudStorageFileSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CloudStorageFileSetArgs Empty = new GooglePrivacyDlpV2CloudStorageFileSetArgs();

    /**
     * The url, in the format `gs:///`. Trailing wildcard in the path is allowed.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public GooglePrivacyDlpV2CloudStorageFileSetArgs(@Nullable Output<String> url) {
        this.url = url;
    }

    private GooglePrivacyDlpV2CloudStorageFileSetArgs() {
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageFileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStorageFileSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }
        public GooglePrivacyDlpV2CloudStorageFileSetArgs build() {
            return new GooglePrivacyDlpV2CloudStorageFileSetArgs(url);
        }
    }
}
