// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieTtlGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceConsistentHashHttpCookieGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceConsistentHashHttpCookieGetArgs Empty = new RegionBackendServiceConsistentHashHttpCookieGetArgs();

    /**
     * Name of the cookie.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Path to set for the cookie.
     * 
     */
    @InputImport(name="path")
        private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @InputImport(name="ttl")
        private final @Nullable Input<RegionBackendServiceConsistentHashHttpCookieTtlGetArgs> ttl;

    public Input<RegionBackendServiceConsistentHashHttpCookieTtlGetArgs> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    public RegionBackendServiceConsistentHashHttpCookieGetArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> path,
        @Nullable Input<RegionBackendServiceConsistentHashHttpCookieTtlGetArgs> ttl) {
        this.name = name;
        this.path = path;
        this.ttl = ttl;
    }

    private RegionBackendServiceConsistentHashHttpCookieGetArgs() {
        this.name = Input.empty();
        this.path = Input.empty();
        this.ttl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceConsistentHashHttpCookieGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> path;
        private @Nullable Input<RegionBackendServiceConsistentHashHttpCookieTtlGetArgs> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceConsistentHashHttpCookieGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttl = defaults.ttl;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setTtl(@Nullable Input<RegionBackendServiceConsistentHashHttpCookieTtlGetArgs> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable RegionBackendServiceConsistentHashHttpCookieTtlGetArgs ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }
        public RegionBackendServiceConsistentHashHttpCookieGetArgs build() {
            return new RegionBackendServiceConsistentHashHttpCookieGetArgs(name, path, ttl);
        }
    }
}
