// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Type of information detected by the API.
 * 
 */
public final class GooglePrivacyDlpV2InfoTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2InfoTypeArgs Empty = new GooglePrivacyDlpV2InfoTypeArgs();

    /**
     * Name of the information type. Either a name of your choosing when creating a CustomInfoType, or one of the names listed at https://cloud.google.com/dlp/docs/infotypes-reference when specifying a built-in type. When sending Cloud DLP results to Data Catalog, infoType names should conform to the pattern `[A-Za-z0-9$-_]{1,64}`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Optional version name for this InfoType.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public GooglePrivacyDlpV2InfoTypeArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> version) {
        this.name = name;
        this.version = version;
    }

    private GooglePrivacyDlpV2InfoTypeArgs() {
        this.name = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public GooglePrivacyDlpV2InfoTypeArgs build() {
            return new GooglePrivacyDlpV2InfoTypeArgs(name, version);
        }
    }
}
