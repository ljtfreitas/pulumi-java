// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RouterMd5AuthenticationKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterMd5AuthenticationKeyResponse Empty = new RouterMd5AuthenticationKeyResponse();

    /**
     * [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public RouterMd5AuthenticationKeyResponse(
        String key,
        String name) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RouterMd5AuthenticationKeyResponse() {
        this.key = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterMd5AuthenticationKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterMd5AuthenticationKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public RouterMd5AuthenticationKeyResponse build() {
            return new RouterMd5AuthenticationKeyResponse(key, name);
        }
    }
}
