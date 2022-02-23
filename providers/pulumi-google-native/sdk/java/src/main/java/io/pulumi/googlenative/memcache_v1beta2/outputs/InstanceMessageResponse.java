// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceMessageResponse {
    /**
     * A code that correspond to one type of user-facing message.
     * 
     */
    private final String code;
    /**
     * Message on memcached instance which will be exposed to users.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor({"code","message"})
    private InstanceMessageResponse(
        String code,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.message = Objects.requireNonNull(message);
    }

    /**
     * A code that correspond to one type of user-facing message.
     * 
     */
    public String getCode() {
        return this.code;
    }
    /**
     * Message on memcached instance which will be exposed to users.
     * 
     */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public InstanceMessageResponse build() {
            return new InstanceMessageResponse(code, message);
        }
    }
}
