// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_v1.outputs.DurationResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConsistentHashLoadBalancerSettingsHttpCookieResponse {
    /**
     * Name of the cookie.
     * 
     */
    private final String name;
    /**
     * Path to set for the cookie.
     * 
     */
    private final String path;
    /**
     * Lifetime of the cookie.
     * 
     */
    private final DurationResponse ttl;

    @CustomType.Constructor
    private ConsistentHashLoadBalancerSettingsHttpCookieResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("ttl") DurationResponse ttl) {
        this.name = name;
        this.path = path;
        this.ttl = ttl;
    }

    /**
     * Name of the cookie.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Path to set for the cookie.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * Lifetime of the cookie.
     * 
    */
    public DurationResponse getTtl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistentHashLoadBalancerSettingsHttpCookieResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String path;
        private DurationResponse ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistentHashLoadBalancerSettingsHttpCookieResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttl = defaults.ttl;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder ttl(DurationResponse ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public ConsistentHashLoadBalancerSettingsHttpCookieResponse build() {
            return new ConsistentHashLoadBalancerSettingsHttpCookieResponse(name, path, ttl);
        }
    }
}
