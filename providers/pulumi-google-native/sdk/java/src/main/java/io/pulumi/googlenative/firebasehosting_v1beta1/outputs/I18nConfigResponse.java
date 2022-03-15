// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class I18nConfigResponse {
    /**
     * The user-supplied path where country and language specific content will be looked for within the public directory.
     * 
     */
    private final String root;

    @CustomType.Constructor
    private I18nConfigResponse(@CustomType.Parameter("root") String root) {
        this.root = root;
    }

    /**
     * The user-supplied path where country and language specific content will be looked for within the public directory.
     * 
    */
    public String getRoot() {
        return this.root;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(I18nConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String root;

        public Builder() {
    	      // Empty
        }

        public Builder(I18nConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.root = defaults.root;
        }

        public Builder root(String root) {
            this.root = Objects.requireNonNull(root);
            return this;
        }
        public I18nConfigResponse build() {
            return new I18nConfigResponse(root);
        }
    }
}
