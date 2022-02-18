// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The request that generated the event.
 * 
 */
public final class RequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final RequestResponse Empty = new RequestResponse();

    /**
     * The IP or hostname and possibly port of the client connection that initiated the event. This is the RemoteAddr from the standard http request.
     * 
     */
    @InputImport(name="addr")
    private final @Nullable String addr;

    public Optional<String> getAddr() {
        return this.addr == null ? Optional.empty() : Optional.ofNullable(this.addr);
    }

    /**
     * The externally accessible hostname of the registry instance, as specified by the http host header on incoming requests.
     * 
     */
    @InputImport(name="host")
    private final @Nullable String host;

    public Optional<String> getHost() {
        return this.host == null ? Optional.empty() : Optional.ofNullable(this.host);
    }

    /**
     * The ID of the request that initiated the event.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The request method that generated the event.
     * 
     */
    @InputImport(name="method")
    private final @Nullable String method;

    public Optional<String> getMethod() {
        return this.method == null ? Optional.empty() : Optional.ofNullable(this.method);
    }

    /**
     * The user agent header of the request.
     * 
     */
    @InputImport(name="useragent")
    private final @Nullable String useragent;

    public Optional<String> getUseragent() {
        return this.useragent == null ? Optional.empty() : Optional.ofNullable(this.useragent);
    }

    public RequestResponse(
        @Nullable String addr,
        @Nullable String host,
        @Nullable String id,
        @Nullable String method,
        @Nullable String useragent) {
        this.addr = addr;
        this.host = host;
        this.id = id;
        this.method = method;
        this.useragent = useragent;
    }

    private RequestResponse() {
        this.addr = null;
        this.host = null;
        this.id = null;
        this.method = null;
        this.useragent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addr;
        private @Nullable String host;
        private @Nullable String id;
        private @Nullable String method;
        private @Nullable String useragent;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addr = defaults.addr;
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.method = defaults.method;
    	      this.useragent = defaults.useragent;
        }

        public Builder setAddr(@Nullable String addr) {
            this.addr = addr;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder setUseragent(@Nullable String useragent) {
            this.useragent = useragent;
            return this;
        }

        public RequestResponse build() {
            return new RequestResponse(addr, host, id, method, useragent);
        }
    }
}
