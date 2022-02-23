// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerResource extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerResource Empty = new GetServiceTemplateSpecContainerResource();

    @InputImport(name="limits", required=true)
        private final Map<String,String> limits;

    public Map<String,String> getLimits() {
        return this.limits;
    }

    @InputImport(name="requests", required=true)
        private final Map<String,String> requests;

    public Map<String,String> getRequests() {
        return this.requests;
    }

    public GetServiceTemplateSpecContainerResource(
        Map<String,String> limits,
        Map<String,String> requests) {
        this.limits = Objects.requireNonNull(limits, "expected parameter 'limits' to be non-null");
        this.requests = Objects.requireNonNull(requests, "expected parameter 'requests' to be non-null");
    }

    private GetServiceTemplateSpecContainerResource() {
        this.limits = Map.of();
        this.requests = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> limits;
        private Map<String,String> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder setLimits(Map<String,String> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }

        public Builder setRequests(Map<String,String> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }
        public GetServiceTemplateSpecContainerResource build() {
            return new GetServiceTemplateSpecContainerResource(limits, requests);
        }
    }
}
