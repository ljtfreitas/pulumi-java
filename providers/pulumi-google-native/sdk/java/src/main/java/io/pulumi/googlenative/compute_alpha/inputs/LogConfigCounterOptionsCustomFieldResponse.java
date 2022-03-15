// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCounterOptionsCustomFieldResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogConfigCounterOptionsCustomFieldResponse Empty = new LogConfigCounterOptionsCustomFieldResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public LogConfigCounterOptionsCustomFieldResponse(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private LogConfigCounterOptionsCustomFieldResponse() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCounterOptionsCustomFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCounterOptionsCustomFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public LogConfigCounterOptionsCustomFieldResponse build() {
            return new LogConfigCounterOptionsCustomFieldResponse(name, value);
        }
    }
}
