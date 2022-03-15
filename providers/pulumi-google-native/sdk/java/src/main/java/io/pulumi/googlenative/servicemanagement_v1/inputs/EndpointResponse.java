// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * `Endpoint` describes a network address of a service that serves a set of APIs. It is commonly known as a service endpoint. A service may expose any number of service endpoints, and all service endpoints share the same service definition, such as quota limits and monitoring metrics. Example: type: google.api.Service name: library-example.googleapis.com endpoints: # Declares network address `https://library-example.googleapis.com` # for service `library-example.googleapis.com`. The `https` scheme # is implicit for all service endpoints. Other schemes may be # supported in the future. - name: library-example.googleapis.com allow_cors: false - name: content-staging-library-example.googleapis.com # Allows HTTP OPTIONS calls to be passed to the API frontend, for it # to decide whether the subsequent cross-origin request is allowed # to proceed. allow_cors: true
 * 
 */
public final class EndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointResponse Empty = new EndpointResponse();

    /**
     * Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain traffic, would allow the backends served from this endpoint to receive and respond to HTTP OPTIONS requests. The response will be used by the browser to determine whether the subsequent cross-origin request is allowed to proceed.
     * 
     */
    @Import(name="allowCors", required=true)
      private final Boolean allowCors;

    public Boolean getAllowCors() {
        return this.allowCors;
    }

    /**
     * The canonical name of this endpoint.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The specification of an Internet routable address of API frontend that will handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid IPv4 address or a fully-qualified domain name. For example, "8.8.8.8" or "myservice.appspot.com".
     * 
     */
    @Import(name="target", required=true)
      private final String target;

    public String getTarget() {
        return this.target;
    }

    public EndpointResponse(
        Boolean allowCors,
        String name,
        String target) {
        this.allowCors = Objects.requireNonNull(allowCors, "expected parameter 'allowCors' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private EndpointResponse() {
        this.allowCors = null;
        this.name = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowCors;
        private String name;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCors = defaults.allowCors;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        public Builder allowCors(Boolean allowCors) {
            this.allowCors = Objects.requireNonNull(allowCors);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public EndpointResponse build() {
            return new EndpointResponse(allowCors, name, target);
        }
    }
}
