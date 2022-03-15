// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Rules to match an HTTP request and dispatch that request to a service.
 * 
 */
public final class UrlDispatchRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlDispatchRuleResponse Empty = new UrlDispatchRuleResponse();

    /**
     * Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".Defaults to matching all domains: "*".
     * 
     */
    @Import(name="domain", required=true)
      private final String domain;

    public String getDomain() {
        return this.domain;
    }

    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default.
     * 
     */
    @Import(name="service", required=true)
      private final String service;

    public String getService() {
        return this.service;
    }

    public UrlDispatchRuleResponse(
        String domain,
        String path,
        String service) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private UrlDispatchRuleResponse() {
        this.domain = null;
        this.path = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlDispatchRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlDispatchRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public UrlDispatchRuleResponse build() {
            return new UrlDispatchRuleResponse(domain, path, service);
        }
    }
}
