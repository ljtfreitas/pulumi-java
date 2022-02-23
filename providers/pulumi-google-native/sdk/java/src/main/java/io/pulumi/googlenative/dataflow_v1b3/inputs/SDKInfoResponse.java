// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * SDK Information.
 * 
 */
public final class SDKInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final SDKInfoResponse Empty = new SDKInfoResponse();

    /**
     * The SDK Language.
     * 
     */
    @InputImport(name="language", required=true)
      private final String language;

    public String getLanguage() {
        return this.language;
    }

    /**
     * Optional. The SDK version.
     * 
     */
    @InputImport(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public SDKInfoResponse(
        String language,
        String version) {
        this.language = Objects.requireNonNull(language, "expected parameter 'language' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private SDKInfoResponse() {
        this.language = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SDKInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String language;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SDKInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.language = defaults.language;
    	      this.version = defaults.version;
        }

        public Builder setLanguage(String language) {
            this.language = Objects.requireNonNull(language);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public SDKInfoResponse build() {
            return new SDKInfoResponse(language, version);
        }
    }
}
