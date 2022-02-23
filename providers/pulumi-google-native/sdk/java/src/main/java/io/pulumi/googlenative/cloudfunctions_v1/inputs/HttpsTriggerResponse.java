// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes HttpsTrigger, could be used to connect web hooks to function.
 * 
 */
public final class HttpsTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpsTriggerResponse Empty = new HttpsTriggerResponse();

    /**
     * The security level for the function.
     * 
     */
    @InputImport(name="securityLevel", required=true)
      private final String securityLevel;

    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * The deployed url for the function.
     * 
     */
    @InputImport(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public HttpsTriggerResponse(
        String securityLevel,
        String url) {
        this.securityLevel = Objects.requireNonNull(securityLevel, "expected parameter 'securityLevel' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private HttpsTriggerResponse() {
        this.securityLevel = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpsTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String securityLevel;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpsTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityLevel = defaults.securityLevel;
    	      this.url = defaults.url;
        }

        public Builder setSecurityLevel(String securityLevel) {
            this.securityLevel = Objects.requireNonNull(securityLevel);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public HttpsTriggerResponse build() {
            return new HttpsTriggerResponse(securityLevel, url);
        }
    }
}
