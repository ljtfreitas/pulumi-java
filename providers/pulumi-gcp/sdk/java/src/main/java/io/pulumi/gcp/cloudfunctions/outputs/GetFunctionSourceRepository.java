// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionSourceRepository {
    private final String deployedUrl;
    /**
     * The URL pointing to the hosted repository where the function is defined.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetFunctionSourceRepository(
        @CustomType.Parameter("deployedUrl") String deployedUrl,
        @CustomType.Parameter("url") String url) {
        this.deployedUrl = deployedUrl;
        this.url = url;
    }

    public String deployedUrl() {
        return this.deployedUrl;
    }
    /**
     * The URL pointing to the hosted repository where the function is defined.
     * 
    */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionSourceRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deployedUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionSourceRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployedUrl = defaults.deployedUrl;
    	      this.url = defaults.url;
        }

        public Builder deployedUrl(String deployedUrl) {
            this.deployedUrl = Objects.requireNonNull(deployedUrl);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetFunctionSourceRepository build() {
            return new GetFunctionSourceRepository(deployedUrl, url);
        }
    }
}
