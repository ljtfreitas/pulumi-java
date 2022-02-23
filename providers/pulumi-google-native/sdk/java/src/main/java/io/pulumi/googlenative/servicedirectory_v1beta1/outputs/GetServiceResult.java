// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicedirectory_v1beta1.outputs.EndpointResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetServiceResult {
    /**
     * The timestamp when the service was created.
     * 
     */
    private final String createTime;
    /**
     * Endpoints associated with this service. Returned on LookupService.ResolveService. Control plane clients should use RegistrationService.ListEndpoints.
     * 
     */
    private final List<EndpointResponse> endpoints;
    /**
     * Optional. Metadata for the service. This data can be consumed by service clients. Restrictions: * The entire metadata dictionary may contain up to 2000 characters, spread accoss all key-value pairs. Metadata that goes beyond this limit are rejected * Valid metadata keys have two segments: an optional prefix and name, separated by a slash (/). The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in total, followed by a slash (/). Metadata that fails to meet these requirements are rejected Note: This field is equivalent to the `annotations` field in the v1 API. They have the same syntax and read/write to the same location in Service Directory.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Immutable. The resource name for the service in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*`.
     * 
     */
    private final String name;
    /**
     * The timestamp when the service was last updated. Note: endpoints being created/deleted/updated within the service are not considered service updates for the purpose of this timestamp.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","endpoints","metadata","name","updateTime"})
    private GetServiceResult(
        String createTime,
        List<EndpointResponse> endpoints,
        Map<String,String> metadata,
        String name,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.endpoints = Objects.requireNonNull(endpoints);
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The timestamp when the service was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Endpoints associated with this service. Returned on LookupService.ResolveService. Control plane clients should use RegistrationService.ListEndpoints.
     * 
     */
    public List<EndpointResponse> getEndpoints() {
        return this.endpoints;
    }
    /**
     * Optional. Metadata for the service. This data can be consumed by service clients. Restrictions: * The entire metadata dictionary may contain up to 2000 characters, spread accoss all key-value pairs. Metadata that goes beyond this limit are rejected * Valid metadata keys have two segments: an optional prefix and name, separated by a slash (/). The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in total, followed by a slash (/). Metadata that fails to meet these requirements are rejected Note: This field is equivalent to the `annotations` field in the v1 API. They have the same syntax and read/write to the same location in Service Directory.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Immutable. The resource name for the service in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The timestamp when the service was last updated. Note: endpoints being created/deleted/updated within the service are not considered service updates for the purpose of this timestamp.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private List<EndpointResponse> endpoints;
        private Map<String,String> metadata;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.endpoints = defaults.endpoints;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setEndpoints(List<EndpointResponse> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetServiceResult build() {
            return new GetServiceResult(createTime, endpoints, metadata, name, updateTime);
        }
    }
}
