// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class EndpointResponse {
    /**
     * Optional. An IPv4 or IPv6 address. Service Directory rejects bad addresses like: * `8.8.8` * `8.8.8.8:53` * `test:bad:address` * `[::1]` * `[::1]:8080` Limited to 45 characters.
     * 
     */
    private final String address;
    /**
     * The timestamp when the endpoint was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. Metadata for the endpoint. This data can be consumed by service clients. Restrictions: * The entire metadata dictionary may contain up to 512 characters, spread accoss all key-value pairs. Metadata that goes beyond this limit are rejected * Valid metadata keys have two segments: an optional prefix and name, separated by a slash (/). The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in total, followed by a slash (/). Metadata that fails to meet these requirements are rejected Note: This field is equivalent to the `annotations` field in the v1 API. They have the same syntax and read/write to the same location in Service Directory.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Immutable. The resource name for the endpoint in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*{@literal /}endpoints/*`.
     * 
     */
    private final String name;
    /**
     * Immutable. The Google Compute Engine network (VPC) of the endpoint in the format `projects//locations/global/networks/*`. The project must be specified by project number (project id is rejected). Incorrectly formatted networks are rejected, but no other validation is performed on this field (ex. network or project existence, reachability, or permissions).
     * 
     */
    private final String network;
    /**
     * Optional. Service Directory rejects values outside of `[0, 65535]`.
     * 
     */
    private final Integer port;
    /**
     * The timestamp when the endpoint was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"address","createTime","metadata","name","network","port","updateTime"})
    private EndpointResponse(
        String address,
        String createTime,
        Map<String,String> metadata,
        String name,
        String network,
        Integer port,
        String updateTime) {
        this.address = Objects.requireNonNull(address);
        this.createTime = Objects.requireNonNull(createTime);
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.port = Objects.requireNonNull(port);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Optional. An IPv4 or IPv6 address. Service Directory rejects bad addresses like: * `8.8.8` * `8.8.8.8:53` * `test:bad:address` * `[::1]` * `[::1]:8080` Limited to 45 characters.
     * 
     */
    public String getAddress() {
        return this.address;
    }
    /**
     * The timestamp when the endpoint was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Metadata for the endpoint. This data can be consumed by service clients. Restrictions: * The entire metadata dictionary may contain up to 512 characters, spread accoss all key-value pairs. Metadata that goes beyond this limit are rejected * Valid metadata keys have two segments: an optional prefix and name, separated by a slash (/). The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in total, followed by a slash (/). Metadata that fails to meet these requirements are rejected Note: This field is equivalent to the `annotations` field in the v1 API. They have the same syntax and read/write to the same location in Service Directory.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Immutable. The resource name for the endpoint in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*{@literal /}endpoints/*`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The Google Compute Engine network (VPC) of the endpoint in the format `projects//locations/global/networks/*`. The project must be specified by project number (project id is rejected). Incorrectly formatted networks are rejected, but no other validation is performed on this field (ex. network or project existence, reachability, or permissions).
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Optional. Service Directory rejects values outside of `[0, 65535]`.
     * 
     */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The timestamp when the endpoint was last updated.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String createTime;
        private Map<String,String> metadata;
        private String name;
        private String network;
        private Integer port;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.createTime = defaults.createTime;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
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

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public EndpointResponse build() {
            return new EndpointResponse(address, createTime, metadata, name, network, port, updateTime);
        }
    }
}
